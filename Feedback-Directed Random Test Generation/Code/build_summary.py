#!/usr/bin/env python3
"""Build the Randoop two-round summary workbook from saved reports."""

from __future__ import annotations

import argparse
import csv
import json
import math
import re
import sys
import xml.etree.ElementTree as ET
from collections import Counter
from datetime import datetime
from pathlib import Path
from zipfile import ZIP_DEFLATED, ZipFile


PROJECT_ROOT = Path(__file__).resolve().parents[1]
TEMPLATE = PROJECT_ROOT.parent / "Deepseek-flash-v4" / "Code" / "summary_template.xlsx"
OUTPUT = PROJECT_ROOT / "summary.xlsx"
ROUND_SOURCES = (("Round1", "report.csv", "Result"),
                 ("Round2", "report_Round2.csv", "Result_Round2"))
CSV_FIELDS = ("project", "bug_id", "seed", "budget", "tests", "coverage",
              "line_cov", "branch_cov", "total_goals", "covered_goals", "lines",
              "covered_lines", "total_branches", "covered_branches", "buggy_result",
              "buggy_fails", "fixed_result", "fixed_fails", "verdict")
SUMMARY_FIELDS = ("round",) + CSV_FIELDS + ("target", "execution_seconds")
INT_FIELDS = {"bug_id", "seed", "budget", "tests", "total_goals", "covered_goals",
              "lines", "covered_lines", "total_branches", "covered_branches",
              "buggy_fails", "fixed_fails"}
FLOAT_FIELDS = {"coverage", "line_cov", "branch_cov", "execution_seconds"}
PERCENT_FIELDS = {"coverage", "line_cov", "branch_cov"}

NS = "http://schemas.openxmlformats.org/spreadsheetml/2006/main"
ET.register_namespace("x", NS)


def tag(name: str) -> str:
    return f"{{{NS}}}{name}"


def column_name(index: int) -> str:
    result = ""
    while index:
        index, remainder = divmod(index - 1, 26)
        result = chr(65 + remainder) + result
    return result


def number(value):
    if value is None or value == "":
        return None
    try:
        result = float(value)
    except (TypeError, ValueError):
        return None
    if not math.isfinite(result):
        return None
    return int(result) if result.is_integer() else result


def read_reports() -> list[dict]:
    records = []
    for round_name, report_name, result_folder in ROUND_SOURCES:
        report_path = PROJECT_ROOT / report_name
        if not report_path.is_file():
            raise FileNotFoundError(f"Required report is missing: {report_path}")
        with report_path.open(newline="", encoding="utf-8-sig") as stream:
            reader = csv.DictReader(stream)
            missing_fields = set(CSV_FIELDS) - set(reader.fieldnames or ())
            if missing_fields:
                raise ValueError(f"{report_path} is missing columns: {', '.join(sorted(missing_fields))}")
            seen = set()
            for source in reader:
                project = (source.get("project") or "").strip()
                bug_id = number(source.get("bug_id"))
                if not project or bug_id is None:
                    raise ValueError(f"Invalid project/bug_id row in {report_path}: {source}")
                target = f"{project}_{int(bug_id)}"
                if target in seen:
                    raise ValueError(f"Duplicate target {target} in {report_path}")
                seen.add(target)
                result_path = PROJECT_ROOT / result_folder / target / "result.json"
                execution_seconds = None
                if result_path.is_file():
                    try:
                        result_json = json.loads(result_path.read_text(encoding="utf-8"))
                        execution_seconds = number(result_json.get("duration_seconds"))
                    except (OSError, json.JSONDecodeError, AttributeError):
                        execution_seconds = None
                row = {"round": round_name, "target": target,
                       "execution_seconds": execution_seconds}
                for field in CSV_FIELDS:
                    raw = source.get(field)
                    row[field] = number(raw) if field in INT_FIELDS | FLOAT_FIELDS else (raw or "")
                for field in PERCENT_FIELDS:
                    if isinstance(row[field], (int, float)):
                        row[field] /= 100
                records.append(row)
    return records


def set_value(cell: ET.Element, value) -> None:
    for child in list(cell):
        if child.tag not in (tag("f"),):
            cell.remove(child)
    cell.attrib.pop("t", None)
    if value is None:
        return
    if isinstance(value, (int, float)):
        ET.SubElement(cell, tag("v")).text = str(value)
    else:
        cell.set("t", "inlineStr")
        ET.SubElement(ET.SubElement(cell, tag("is")), tag("t")).text = str(value)


def set_formula(cell: ET.Element, formula: str, cached_value) -> None:
    for child in list(cell):
        cell.remove(child)
    cell.attrib.pop("t", None)
    ET.SubElement(cell, tag("f")).text = formula
    if cached_value is None:
        cell.set("t", "str")
        ET.SubElement(cell, tag("v"))
    else:
        ET.SubElement(cell, tag("v")).text = str(cached_value)


def cell_at(row: ET.Element, address: str, style: str | None = None) -> ET.Element:
    cell = row.find(f"{tag('c')}[@r='{address}']")
    if cell is None:
        attrs = {"r": address}
        if style is not None:
            attrs["s"] = style
        cell = ET.Element(tag("c"), attrs)
        row.append(cell)
    elif style is not None:
        cell.set("s", style)
    return cell


def dashboard_metrics(records: list[dict]) -> tuple[dict[str, object], dict[str, str]]:
    cached: dict[str, object] = {}
    formulas: dict[str, str] = {}
    end = len(records) + 1
    rounds = {"C": "Round1", "D": "Round2", "E": None}
    column_by_field = {field: column_name(index + 1) for index, field in enumerate(SUMMARY_FIELDS)}
    round_range = f"Data!$A$2:$A${end}"

    def aggregate(group: list[dict], field: str, method: str):
        values = [r[field] for r in group if isinstance(r.get(field), (int, float))]
        if method == "count":
            return len(values)
        if not values:
            return None
        return sum(values) / len(values) if method == "average" else sum(values)

    fields = {
        6: ("result_count", "count"),
        7: ("coverage", "average"),
        8: ("line_cov", "average"),
        9: ("branch_cov", "average"),
        10: ("revealing", "count"),
        12: ("tests", "sum"),
        13: ("execution_seconds", "sum"),
        14: ("execution_seconds", "count"),
        15: ("line_cov", "count"),
        16: ("lines", "sum"),
        17: ("covered_lines", "sum"),
        18: ("total_branches", "sum"),
        19: ("covered_branches", "sum"),
    }
    verdicts = ("REVEALING", "NOT_REVEALING", "NOT_AVAILABLE", "INCONCLUSIVE", "FAIL")
    for output_column, round_name in rounds.items():
        group = records if round_name is None else [r for r in records if r["round"] == round_name]
        for row_number, (field, method) in fields.items():
            address = f"{output_column}{row_number}"
            data_col = column_by_field.get(field)
            if field == "result_count":
                cached[address] = len(group)
                formulas[address] = (f'COUNTA(Data!${column_by_field["target"]}$2:'
                                     f'${column_by_field["target"]}${end})' if round_name is None else
                                     f'COUNTIFS({round_range},"{round_name}",Data!${column_by_field["target"]}$2:'
                                     f'${column_by_field["target"]}${end},"<>")')
            elif field == "revealing":
                count = sum(r["verdict"] == "REVEALING" for r in group)
                cached[address] = count
                formulas[address] = (f'COUNTIF(Data!${column_by_field["verdict"]}$2:${column_by_field["verdict"]}${end},"REVEALING")'
                                     if round_name is None else
                                     f'COUNTIFS({round_range},"{round_name}",Data!${column_by_field["verdict"]}$2:${column_by_field["verdict"]}${end},"REVEALING")')
            else:
                cached[address] = aggregate(group, field, method)
                data_range = f"Data!${data_col}$2:${data_col}${end}"
                if method == "average":
                    if round_name is None:
                        formulas[address] = f'IF(COUNT({data_range})=0,"",AVERAGE({data_range}))'
                    else:
                        formulas[address] = (f'IF(COUNTIFS({round_range},"{round_name}",{data_range},"<>")=0,"",'
                                             f'AVERAGEIF({round_range},"{round_name}",{data_range}))')
                elif method == "count":
                    formulas[address] = (f'COUNT({data_range})' if round_name is None else
                                         f'COUNTIFS({round_range},"{round_name}",{data_range},"<>")')
                else:
                    formulas[address] = (f'IF(COUNT({data_range})=0,"",SUM({data_range}))' if round_name is None else
                                         f'IF(COUNTIFS({round_range},"{round_name}",{data_range},"<>")=0,"",'
                                         f'SUMIF({round_range},"{round_name}",{data_range}))')
        rate_addr = f"{output_column}11"
        cached[rate_addr] = (sum(r["verdict"] == "REVEALING" for r in group) / len(group)) if group else None
        formulas[rate_addr] = f'IF({output_column}6=0,"",{output_column}10/{output_column}6)'
        for index, verdict in enumerate(verdicts, 22):
            address = f"{output_column}{index}"
            cached[address] = sum(r["verdict"] == verdict for r in group)
    return cached, formulas


def render_workbook(destination: Path, records: list[dict]) -> None:
    if not TEMPLATE.is_file():
        raise FileNotFoundError(f"Workbook template is missing: {TEMPLATE}")
    end = max(len(records) + 1, 2)
    with ZipFile(TEMPLATE) as source:
        data = ET.fromstring(source.read("xl/worksheets/sheet2.xml"))
        sheet_data = data.find(tag("sheetData"))
        header = sheet_data.find(f"{tag('row')}[@r='1']")
        sample = sheet_data.find(f"{tag('row')}[@r='2']")
        for row in list(sheet_data):
            if row is not header:
                sheet_data.remove(row)
        styles = {cell.get("r")[0]: cell.get("s", "0") for cell in sample}
        for index, field in enumerate(SUMMARY_FIELDS, 1):
            address = f"{column_name(index)}1"
            cell = cell_at(header, address, "15")
            set_value(cell, field)
        header[:] = sorted(header, key=lambda cell: int(re.search(r"\d+$", cell.get("r")).group()))
        for row_index, record in enumerate(records, 2):
            row = ET.SubElement(sheet_data, tag("row"), {"r": str(row_index), "ht": "22", "customHeight": "1"})
            for col_index, field in enumerate(SUMMARY_FIELDS, 1):
                col = column_name(col_index)
                if field in PERCENT_FIELDS:
                    style = styles.get("E", "5")
                elif field == "execution_seconds":
                    style = styles.get("H", "6")
                elif field in INT_FIELDS:
                    style = styles.get("F", "4")
                else:
                    style = styles.get("A", "1") if col_index == 1 else styles.get("B", "1")
                cell = ET.SubElement(row, tag("c"), {"r": f"{col}{row_index}", "s": style})
                set_value(cell, record.get(field))
        dimension = data.find(tag("dimension"))
        if dimension is not None:
            dimension.set("ref", f"A1:V{end}")
        cols = data.find(tag("cols"))
        widths = {1: 11, 2: 17, 3: 10, 4: 12, 5: 11, 6: 11, 7: 13, 8: 13,
                  9: 13, 10: 13, 11: 14, 12: 11, 13: 14, 14: 15, 15: 17,
                  16: 15, 17: 13, 18: 14, 19: 13, 20: 18, 21: 18, 22: 19}
        for idx, width in widths.items():
            ET.SubElement(cols, tag("col"), {"min": str(idx), "max": str(idx),
                                               "width": str(width), "customWidth": "1"})

        dashboard = ET.fromstring(source.read("xl/worksheets/sheet1.xml"))
        for conditional in list(dashboard.findall(tag("conditionalFormatting"))):
            dashboard.remove(conditional)
        merged = dashboard.find(tag("mergeCells"))
        if merged is not None:
            for merge in list(merged):
                if merge.get("ref") in {"B23:E23", "B24:E24", "B25:E25"}:
                    merged.remove(merge)
            merged.set("count", str(len(merged)))
        dash_data = dashboard.find(tag("sheetData"))
        title_row = dash_data.find(f"{tag('row')}[@r='2']")
        subtitle_row = dash_data.find(f"{tag('row')}[@r='3']")
        set_value(cell_at(title_row, "B2"), "Randoop | Results dashboard")
        set_value(cell_at(subtitle_row, "B3"), "Feedback-directed random test generation results")
        for row in list(dash_data):
            row_number = int(row.get("r"))
            if row_number > 5:
                dash_data.remove(row)
        cached, formulas = dashboard_metrics(records)
        labels = {
            5: ("Metric", "Round1", "Round2", "All rounds"),
            6: ("Results",), 7: ("Average coverage",), 8: ("Average line coverage",),
            9: ("Average branch coverage",), 10: ("Revealing results",),
            11: ("Revealing rate",), 12: ("Tests generated",),
            13: ("Execution time (seconds)",), 14: ("Execution time records",),
            15: ("Coverage records",), 16: ("Lines total",), 17: ("Lines covered",),
            18: ("Branches total",), 19: ("Branches covered",),
            21: ("Verdict", "Round1", "Round2", "All rounds"),
            28: ("Blank coverage and execution time mean the metric was not recorded.",),
            29: ("Source: Randoop report.csv files and per-target result.json files.",),
        }
        verdicts = ("REVEALING", "NOT_REVEALING", "NOT_AVAILABLE", "INCONCLUSIVE", "FAIL")
        for row_number, values in labels.items():
            row = ET.SubElement(dash_data, tag("row"), {"r": str(row_number)})
            for offset, value in enumerate(values, 2):
                col = column_name(offset)
                style = "8" if row_number in (5, 21) else "1"
                cell = ET.SubElement(row, tag("c"), {"r": f"{col}{row_number}", "s": style})
                set_value(cell, value)
        for i, verdict in enumerate(verdicts, 22):
            row = ET.SubElement(dash_data, tag("row"), {"r": str(i)})
            set_value(ET.SubElement(row, tag("c"), {"r": f"B{i}", "s": "1"}), verdict)
        for address, formula in formulas.items():
            row_num = int(re.search(r"\d+$", address).group())
            row = dash_data.find(f"{tag('row')}[@r='{row_num}']")
            style = "5" if row_num in (7, 8, 9, 11) else ("6" if row_num == 13 else "4")
            cell = cell_at(row, address, style)
            set_formula(cell, formula, cached.get(address))
        # Cached counts keep every verdict row visible in workbook previews. They
        # refresh from the source CSV whenever this builder runs.
        for address in (f"{column}{row}" for column in "CDE" for row in range(22, 27)):
            row_num = int(re.search(r"\d+$", address).group())
            row = dash_data.find(f"{tag('row')}[@r='{row_num}']")
            set_value(cell_at(row, address, "4"), cached[address])
        updated = datetime.now().astimezone().strftime("Updated: %Y-%m-%d %H:%M:%S %z")
        updated_row = ET.SubElement(dash_data, tag("row"), {"r": "30"})
        set_value(ET.SubElement(updated_row, tag("c"), {"r": "B30", "s": "1"}), updated)
        dash_data[:] = sorted(dash_data, key=lambda row: int(row.get("r")))
        dimension = dashboard.find(tag("dimension"))
        if dimension is not None:
            dimension.set("ref", "B2:E30")

        table = ET.fromstring(source.read("xl/tables/table1.xml"))
        table.set("ref", f"A1:V{end}")
        table_columns = table.find(tag("tableColumns"))
        table_columns.set("count", str(len(SUMMARY_FIELDS)))
        for col in list(table_columns):
            table_columns.remove(col)
        for idx, field in enumerate(SUMMARY_FIELDS, 1):
            ET.SubElement(table_columns, tag("tableColumn"), {"id": str(idx), "name": field})
        auto_filter = table.find(tag("autoFilter"))
        if auto_filter is not None:
            auto_filter.set("ref", f"A1:V{end}")
        else:
            table.insert(list(table).index(table_columns),
                         ET.Element(tag("autoFilter"), {"ref": f"A1:V{end}"}))
        workbook = ET.fromstring(source.read("xl/workbook.xml"))
        calc = workbook.find(tag("calcPr"))
        if calc is None:
            calc = ET.SubElement(workbook, tag("calcPr"))
        calc.attrib.update({"calcMode": "auto", "fullCalcOnLoad": "1"})
        updates = {"xl/worksheets/sheet1.xml": dashboard,
                   "xl/worksheets/sheet2.xml": data,
                   "xl/tables/table1.xml": table, "xl/workbook.xml": workbook}
        staged = destination.with_suffix(".xlsx.tmp")
        destination.parent.mkdir(parents=True, exist_ok=True)
        with ZipFile(staged, "w", compression=ZIP_DEFLATED) as output:
            for entry in source.infolist():
                payload = (ET.tostring(updates[entry.filename], encoding="utf-8", xml_declaration=True)
                           if entry.filename in updates else source.read(entry.filename))
                output.writestr(entry.filename, payload)
    try:
        staged.replace(destination)
    except PermissionError as exc:
        staged.unlink(missing_ok=True)
        raise PermissionError(f"Cannot replace {destination}; close it in Excel and retry.") from exc


def main(argv=None) -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--output", type=Path, default=OUTPUT,
                        help="Output workbook path (default: Feedback-Directed Random Test Generation/summary.xlsx)")
    args = parser.parse_args(argv)
    try:
        records = read_reports()
        render_workbook(args.output, records)
    except (OSError, ValueError, KeyError, ET.ParseError) as exc:
        print(f"Unable to build Randoop summary: {exc}", file=sys.stderr)
        return 1
    print(f"Updated {args.output} with {len(records)} results.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
