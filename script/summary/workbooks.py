#!/usr/bin/env python3
"""Refresh paired coverage views without executing Java tests.

The existing generators retain their own sources. GA uses its saved V2 CSVs.
Set ARTIFACT_TOOL_NODE and ARTIFACT_TOOL_MODULES on hosts without Codex's
bundled runtime (a Node executable and a node_modules containing artifact-tool).
"""
import argparse
import csv
import importlib.util
import json
import os
from pathlib import Path
import shutil
import subprocess
from contextlib import contextmanager
from uuid import uuid4
import xml.etree.ElementTree as ET
from zipfile import ZipFile
from .metrics import GROUP_IDS, analysis, evidence, classify, resource_targets, load_records

ROOT = Path(__file__).resolve().parents[2]
GROUPS = ("Gemini-3.8-flash", "Deepseek-flash-v4",
          "Feedback-Directed Random Test Generation", "GeneticAlgorithm")
NS = {"x": "http://schemas.openxmlformats.org/spreadsheetml/2006/main"}


@contextmanager
def build_directory(scratch):
    # Windows' bundled Python can create inaccessible mode-0700 temp folders.
    work = scratch / uuid4().hex
    work.mkdir()
    try:
        yield work
    finally:
        link = work / "node_modules"
        if os.name == "nt" and link.exists():
            os.rmdir(link)
        elif link.is_symlink():
            link.unlink()
        if work.resolve().parent == scratch.resolve():
            shutil.rmtree(work)


def read_data(path):
    """Read typed cells, retaining null coverage rather than substituting zero."""
    with ZipFile(path) as archive:
        strings = []
        if "xl/sharedStrings.xml" in archive.namelist():
            strings = ["".join(node.itertext()) for node in
                       ET.fromstring(archive.read("xl/sharedStrings.xml"))]
        sheet = ET.fromstring(archive.read("xl/worksheets/sheet2.xml"))
        matrix = []
        for row in sheet.findall("x:sheetData/x:row", NS):
            values = {}
            for cell in row.findall("x:c", NS):
                letters = "".join(c for c in cell.get("r") if c.isalpha())
                column = 0
                for letter in letters:
                    column = column * 26 + ord(letter) - 64
                value = cell.find("x:v", NS)
                text = value.text if value is not None else None
                kind = cell.get("t")
                if kind == "s":
                    text = strings[int(text)]
                elif kind == "inlineStr":
                    text = "".join(cell.find("x:is", NS).itertext())
                elif text is not None and kind not in ("str", "e"):
                    text = float(text)
                values[column - 1] = text
            matrix.append(values)
        width = max(matrix[0]) + 1
        # Clearing a previously larger Data sheet can leave styled empty rows.
        while len(matrix) > 1 and all(value is None for value in matrix[-1].values()):
            matrix.pop()
        return [[row.get(i) for i in range(width)] for row in matrix]


def ga_data():
    allowed = resource_targets()
    validations = {(r['round'],r['target']):r for r in load_records('ga')}
    headers = ["round", "project", "bug_id", "target", "coverage_status",
               "lines_total", "lines_covered", "line_coverage", "conditions_total",
               "conditions_covered", "condition_coverage", "failing_tests",
               "generation_status", "failure_reason", "verdict", "buggy_result",
               "fixed_result", "verdict_source", "verdict_reason"]
    rows = [headers]
    for round_number in (1, 2):
        source = ROOT / "GeneticAlgorithm" / f"Result_v2_Round{round_number}" / "report.csv"
        with source.open(encoding="utf-8-sig", newline="") as stream:
            for record in csv.DictReader(stream):
                if record['target'] not in allowed:
                    continue
                validation = validations[(f'Round{round_number}',record['target'])]
                record.update({key:validation.get(key) for key in ('verdict','buggy_result','fixed_result')})
                record['verdict_source'] = validation['verdictSource']
                record['verdict_reason'] = validation['verdictReason']
                values = [round_number]
                for field in headers[1:]:
                    value = record.get(field)
                    if value in (None, ""):
                        value = None
                    elif field not in ("project", "target", "coverage_status", "generation_status", "failure_reason", "verdict", "buggy_result", "fixed_result", "verdict_source", "verdict_reason"):
                        value = float(value)
                    values.append(value)
                rows.append(values)
    return rows


def node_executable():
    runtime = Path.home() / ".cache/codex-runtimes/codex-primary-runtime/dependencies/node"
    node = os.environ.get("ARTIFACT_TOOL_NODE") or str(runtime / "bin/node.exe")
    return node if Path(node).is_file() else shutil.which("node")


def augment(path, *, ga=False, preview_dir=None):
    path = Path(path).resolve()
    runtime = Path.home() / ".cache/codex-runtimes/codex-primary-runtime/dependencies/node"
    node = node_executable()
    modules = Path(os.environ.get("ARTIFACT_TOOL_MODULES", runtime / "node_modules"))
    if not node or not (modules / "@oai/artifact-tool").is_dir():
        raise RuntimeError("Paired coverage requires Node and @oai/artifact-tool; "
                           "set ARTIFACT_TOOL_NODE and ARTIFACT_TOOL_MODULES.")
    matrix = ga_data() if ga else read_data(path)
    method = GROUP_IDS.get(path.parent.name)
    if method:
        allowed = resource_targets()
        target_column = matrix[0].index('target')
        matrix = [matrix[0], *[r for r in matrix[1:] if r[target_column] in allowed]]
    complete = analysis() if method else None
    lookup = {(r['round'],r['target']):r for r in complete['records'][method]} if complete else {}
    headers = matrix[0]
    rows = []
    for index, values in enumerate(matrix[1:], 2):
        raw = dict(zip(headers, values))
        round_name = str(raw['round'])
        if isinstance(raw['round'],(int,float)): round_name = f"Round{int(raw['round'])}"
        target = raw['target']
        record = lookup.get((round_name,target))
        if record is None:
            # Synthetic/test workbooks still classify from their own local evidence.
            for field in ('line_coverage','line_cov','condition_coverage','coverage'):
                if isinstance(raw.get(field),(int,float)) and not ga: raw[field] *= 100
            payload_path = path.parent / ('Result2' if round_name=='Round2' else 'Result') / target / 'result.json'
            payload = json.loads(payload_path.read_text(encoding='utf-8')) if payload_path.is_file() else {}
            details = evidence(raw,payload)
            record = {'round':round_name,'target':target,'method':method or 'test',
                      'project':raw.get('project') or target.split('_')[0], 'details':details,
                      'result_source':str(payload_path),
                      'metrics':{metric:classify(details,metric) for metric in ('line','condition','coverage')}}
        rows.append({**record,'dataRow':index})
    scratch = ROOT / ".coverage-build"
    scratch.mkdir(exist_ok=True)
    with build_directory(scratch) as directory:
        work = Path(directory)
        # A temporary module path keeps runtime dependencies out of the repository.
        link = work / "node_modules"
        if os.name == "nt":
            subprocess.run(["cmd", "/c", "mklink", "/J", str(link), str(modules)],
                           check=True, capture_output=True)
        else:
            link.symlink_to(modules, target_is_directory=True)
        builder = work / "build_coverage_summaries.mjs"
        shutil.copyfile(Path(__file__).with_name(builder.name), builder)
        shutil.copyfile(Path(__file__).with_name('report_sections.mjs'), work/'report_sections.mjs')
        config = work / "input.json"
        config.write_text(json.dumps({"path": str(path), "data": matrix, "ga": ga,
                                     "records": rows,
                                     "intersection": complete['intersection'] if complete else None,
                                     "summaryStats": complete['methods'][method]['metrics'] if complete else None,
                                     "resourceInventory": [c for c in complete['resourceInventory'] if c['method']==method] if complete else [],
                                     "previewDir": str(preview_dir) if preview_dir else None}),
                          encoding="utf-8")
        subprocess.run([node, str(builder), str(config)], check=True)
        staged = Path(str(path) + ".paired.tmp.xlsx")
        saved = read_data(staged)
        if saved != matrix:
            raise ValueError(f"Paired coverage export changed raw Data in {path}")
        try:
            staged.replace(path)
        except PermissionError:
            # Excel may hold the original workbook open; keep a reviewable result.
            alternative = path.with_name('summary.updated.xlsx')
            staged.replace(alternative)
            print(f"Excel locked {path}; saved current summary to {alternative}", flush=True)
        staged.with_suffix(staged.suffix + ".inspect.ndjson").unlink(missing_ok=True)
        # Remove the junction before TemporaryDirectory cleans up the workspace.
        if os.name == "nt":
            os.rmdir(link)


def load_runner(relative):
    path = ROOT / relative
    spec = importlib.util.spec_from_file_location("summary_runner", path)
    module = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(module)
    return module


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--group", choices=GROUPS, action="append")
    parser.add_argument("--preview-dir", type=Path)
    args = parser.parse_args()
    # Validate the authoritative target inventory before writing any workbook.
    checked = analysis()
    for check in checked['resourceInventory']:
        print(f"Resource check {check['method']} {check['round']}: "
              f"reference={check['referenceCount']} results={check['resultCount']} "
              f"missing={check['missingResults']} extra={check['extraResults']}", flush=True)
    for group in args.group or GROUPS:
        path = ROOT / group / "summary.xlsx"
        staged = path.with_name('.summary.refresh.xlsx')
        if group in ("Gemini-3.8-flash", "Deepseek-flash-v4"):
            filename = "run_gemini_tests.py" if group.startswith("Gemini") else "run_deepseek_tests.py"
            load_runner(f"{group}/Code/{filename}").write_summary(paired=False, destination=staged)
        elif group.startswith("Feedback"):
            runner = load_runner(f"{group}/Code/build_summary.py")
            runner.render_workbook(staged, runner.read_reports(), paired=False)
        else:
            shutil.copyfile(path, staged)
        augment(staged, ga=group == "GeneticAlgorithm", preview_dir=args.preview_dir)
        try:
            staged.replace(path)
        except PermissionError:
            alternative = path.with_name('summary.updated.xlsx')
            staged.replace(alternative)
            print(f"Excel locked {path}; saved current summary to {alternative}", flush=True)


if __name__ == "__main__":
    main()
