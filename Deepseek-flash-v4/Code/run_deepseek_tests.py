#!/usr/bin/env python3
"""Validate existing DeepSeek tests on both Defects4J revisions in parallel."""

import argparse
import csv
import json
import os
import re
import shutil
import signal
import subprocess
import sys
import tarfile
import tempfile
import threading
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from datetime import datetime, timezone
from pathlib import Path
from zipfile import ZipFile, ZIP_DEFLATED
import xml.etree.ElementTree as ET


ROOT = Path(__file__).resolve().parents[1]
TEST_ROOT = ROOT / "TestCode"
RESULT_ROOT = ROOT / "Result"
TARGET_RE = re.compile(r"^([A-Za-z][A-Za-z0-9]*)_([1-9][0-9]*)_buggy$")
PACKAGE_RE = re.compile(r"(?m)^\s*package\s+([A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*)\s*;")
FAILURES_RE = re.compile(r"Failing tests:\s*(\d+)")
FIELDS = ("project", "bug_id", "tests", "buggy_result", "buggy_fails",
          "fixed_result", "fixed_fails", "verdict", "lines", "covered_lines",
          "line_cov", "branches", "covered_branches", "branch_cov",
          "buggy_test_seconds", "fixed_test_seconds", "test_run_seconds",
          "buggy_test_time_source", "fixed_test_time_source")
STOP_REQUESTED = threading.Event()
ACTIVE_COMMANDS = set()
ACTIVE_COMMANDS_LOCK = threading.Lock()
TIMEOUT_RC = 124


class TargetInterrupted(Exception):
    """A target stopped before its report was complete."""


def discover_targets():
    return {path.name[:-6]: path for path in TEST_ROOT.iterdir()
            if path.is_dir() and TARGET_RE.fullmatch(path.name)
            and any(path.rglob("*.java"))}


def make_archive(source: Path, destination: Path):
    """Use Java package names because generator output is stored in flat directories."""
    seen = set()
    tests = 0
    with tarfile.open(destination, "w:bz2") as archive:
        for java in sorted(source.rglob("*.java")):
            code = java.read_text(encoding="utf-8-sig")
            match = PACKAGE_RE.search(code)
            relative = Path(*(match.group(1).split(".") if match else [])) / java.name
            name = relative.as_posix()
            if name in seen:
                raise ValueError(f"Duplicate test path in archive: {name}")
            seen.add(name)
            archive.add(java, arcname=name)
            tests += len(re.findall(r"@(?:org\.junit\.)?Test\b", code))
    if not seen:
        raise ValueError("No Java test files")
    return tests, len(seen)


def run_command(args, log: Path, cwd=None, timeout=None):
    with log.open("a", encoding="utf-8") as output:
        output.write("$ " + " ".join(map(str, args)) + "\n")
        output.flush()
        try:
            with ACTIVE_COMMANDS_LOCK:
                if STOP_REQUESTED.is_set():
                    raise TargetInterrupted
                command = subprocess.Popen(args, cwd=cwd, stdout=output,
                                           stderr=subprocess.STDOUT,
                                           start_new_session=(os.name == "posix"))
                ACTIVE_COMMANDS.add(command)
            try:
                try:
                    rc = command.wait(timeout=timeout)
                except subprocess.TimeoutExpired:
                    output.write(f"[timeout after {timeout}s]\n")
                    output.flush()
                    terminate_command(command)
                    rc = TIMEOUT_RC
            finally:
                with ACTIVE_COMMANDS_LOCK:
                    ACTIVE_COMMANDS.discard(command)
            output.write(f"[exit {rc}]\n")
            if STOP_REQUESTED.is_set():
                raise TargetInterrupted
            return rc
        except OSError as exc:
            output.write(f"[start error] {exc}\n")
            return 127


def terminate_command(command):
    """Stop a Defects4J command and the Java processes it launched."""
    if command.poll() is None:
        try:
            if os.name == "posix":
                os.killpg(command.pid, signal.SIGTERM)
            else:
                command.terminate()
        except ProcessLookupError:
            pass
    try:
        command.wait(timeout=3)
    except subprocess.TimeoutExpired:
        if os.name == "posix":
            try:
                os.killpg(command.pid, signal.SIGKILL)
            except ProcessLookupError:
                pass
        else:
            command.kill()
        command.wait()


def stop_active_commands():
    """Stop only subprocesses launched by this runner, including Java children."""
    with ACTIVE_COMMANDS_LOCK:
        commands = list(ACTIVE_COMMANDS)
    for command in commands:
        terminate_command(command)


def test_result(workspace: Path, log: Path, rc: int):
    output = log.read_text(encoding="utf-8", errors="replace")
    matches = FAILURES_RE.findall(output)
    if matches:
        count = int(matches[-1])
    else:
        failing = workspace / "failing_tests"
        count = sum(line.startswith("--- ") for line in failing.read_text(
            encoding="utf-8", errors="replace").splitlines()) if failing.exists() else None
    if count is None:
        return "NOT_RUN", None
    if rc != 0 and count == 0:
        return "NOT_RUN", None
    return ("FAIL" if count else "PASS"), count


def read_coverage(workspace: Path):
    summary = workspace / "summary.csv"
    if not summary.is_file():
        return {}
    with summary.open(newline="", encoding="utf-8") as handle:
        row = next(csv.DictReader(handle), None)
    if not row:
        return {}
    try:
        lines = int(row["LinesTotal"])
        covered_lines = int(row["LinesCovered"])
        branches = int(row["ConditionsTotal"])
        covered_branches = int(row["ConditionsCovered"])
    except (KeyError, TypeError, ValueError):
        return {}
    return {"lines": lines, "covered_lines": covered_lines,
            "line_cov": round(100 * covered_lines / lines, 2) if lines else None,
            "branches": branches, "covered_branches": covered_branches,
            "branch_cov": round(100 * covered_branches / branches, 2) if branches else None}


def run_revision(d4j: str, project: str, bug_id: int, suffix: str,
                 archive: Path, temporary: Path, logs: Path, coverage: bool,
                 test_timeout: int):
    label = "buggy" if suffix == "b" else "fixed"
    workspace = temporary / label
    log = logs / f"{label}.log"
    checkout = run_command([d4j, "checkout", "-p", project, "-v",
                            f"{bug_id}{suffix}", "-w", str(workspace)], log)
    if checkout:
        return {"result": "NOT_RUN", "fails": None, "compile": "NOT_RUN"}
    compile_rc = run_command([d4j, "compile", "-w", str(workspace)], log)
    if compile_rc:
        return {"result": "NOT_RUN", "fails": None, "compile": "FAIL"}
    failing = workspace / "failing_tests"
    failing.unlink(missing_ok=True)
    test_log = logs / f"{label}_test.log"
    test_started = time.monotonic()
    rc = run_command([d4j, "test", "-s", str(archive)], test_log,
                     cwd=workspace, timeout=test_timeout)
    test_elapsed = round(time.monotonic() - test_started, 2)
    with test_log.open("a", encoding="utf-8") as output:
        output.write(f"[test_seconds: {test_elapsed:.2f}]\n")
    result, fails = (("NOT_RUN", None) if rc == TIMEOUT_RC else
                     test_result(workspace, test_log, rc))
    test_output = test_log.read_text(encoding="utf-8", errors="replace")
    details = {"result": result, "fails": fails, "compile": "PASS",
               "test_seconds": test_elapsed,
               "test_time_source": "measured_wall_clock",
               "test_compile": ("FAIL" if re.search(r"compile\.gen\.tests\).*FAIL", test_output)
                                else "PASS" if re.search(r"compile\.gen\.tests\).*OK", test_output)
                                else "NOT_RUN")}
    if rc == TIMEOUT_RC:
        details["test_status"] = "TIMEOUT"
    if failing.is_file():
        shutil.copy2(failing, logs / f"{label}_failing_tests.txt")
    if coverage and label == "buggy" and result != "NOT_RUN":
        coverage_log = logs / "buggy_coverage.log"
        coverage_started = time.monotonic()
        coverage_rc = run_command([d4j, "coverage", "-s", str(archive)],
                                  coverage_log, cwd=workspace, timeout=test_timeout)
        details["coverage_seconds"] = round(time.monotonic() - coverage_started, 2)
        details["coverage_status"] = ("TIMEOUT" if coverage_rc == TIMEOUT_RC else
                                      "PASS" if coverage_rc == 0 else "FAIL")
        if coverage_rc == 0:
            details.update(read_coverage(workspace))
    return details


def write_json_atomic(path: Path, value):
    staged = path.with_suffix(".json.tmp")
    staged.write_text(json.dumps(value, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
    staged.replace(path)


def write_csv_atomic(path: Path, rows, fields=None):
    staged = path.with_suffix(".csv.tmp")
    with staged.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.DictWriter(handle, fieldnames=fields or FIELDS, extrasaction="ignore")
        writer.writeheader()
        writer.writerows(rows)
    staged.replace(path)


def total_test_seconds(report):
    """Sum attempted test commands only when every attempted command has timing."""
    durations = []
    for revision in ("buggy", "fixed"):
        details = report.get(revision, {})
        duration = details.get("test_seconds")
        if isinstance(duration, (int, float)):
            durations.append(duration)
        elif details.get("compile") == "PASS" or "test_compile" in details:
            return report.get("test_run_seconds")
    return round(sum(durations), 2) if durations else report.get("test_run_seconds")


def read_test_time(log: Path):
    """Recover explicit runner timings or the reported Ant build duration.

    Ant durations have coarser precision and exclude Defects4J extraction overhead.
    Successful historical commands often suppress Ant output and cannot be timed.
    """
    if not log.is_file():
        return None, None
    output = log.read_text(encoding="utf-8", errors="replace")
    explicit = re.findall(r"(?m)^\[test_seconds:\s*(\d+(?:\.\d+)?)\]\s*$", output)
    if explicit:
        return float(explicit[-1]), "log_wall_clock"
    blocks = re.findall(r"(?mi)^Total time:\s*([^\r\n]+)", output)
    durations = []
    for block in blocks:
        units = re.findall(r"(\d+(?:\.\d+)?)\s*(hours?|minutes?|seconds?)\b", block, re.I)
        # Do not guess unknown time formats or derive duration from file timestamps.
        residue = re.sub(r"(\d+(?:\.\d+)?)\s*(hours?|minutes?|seconds?)\b", "", block, flags=re.I)
        if not units or residue.strip(" ,\t"):
            return None, None
        durations.append(sum(float(value) * (3600 if unit.lower().startswith("hour") else
                                            60 if unit.lower().startswith("minute") else 1)
                             for value, unit in units))
    return (round(sum(durations), 2), "log_ant_total") if durations else (None, None)


def recover_test_times(report, directory: Path):
    """Fill missing revision timings from test logs, preserving recorded values."""
    changed = False
    for revision in ("buggy", "fixed"):
        details = report.get(revision)
        if not isinstance(details, dict) or isinstance(details.get("test_seconds"), (int, float)):
            continue
        duration, source = read_test_time(directory / "logs" / f"{revision}_test.log")
        if duration is not None:
            details["test_seconds"] = duration
            details["test_time_source"] = source
            changed = True
    total = total_test_seconds(report)
    if report.get("test_run_seconds") != total:
        report["test_run_seconds"] = total
        changed = True
    return changed


def report_row(report):
    buggy = report.get("buggy", {})
    fixed = report.get("fixed", {})
    row = {"project": report["project"], "bug_id": report["bug_id"],
           "tests": report.get("tests"),
           "buggy_result": buggy.get("result", "NOT_RUN"),
           "buggy_fails": buggy.get("fails"),
           "fixed_result": fixed.get("result", "NOT_RUN"),
           "fixed_fails": fixed.get("fails"),
           "verdict": report["verdict"],
           "buggy_test_seconds": buggy.get("test_seconds"),
           "fixed_test_seconds": fixed.get("test_seconds"),
           "test_run_seconds": total_test_seconds(report),
           "buggy_test_time_source": buggy.get("test_time_source"),
           "fixed_test_time_source": fixed.get("test_time_source")}
    row.update({key: buggy.get(key) for key in FIELDS[8:14]})
    return row


def run_target(name: str, source: Path, d4j: str, coverage: bool,
               test_timeout: int):
    match = TARGET_RE.fullmatch(source.name)
    project, bug_id = match.group(1), int(match.group(2))
    destination = RESULT_ROOT / name
    destination.mkdir(parents=True, exist_ok=True)
    logs = destination / "logs"
    logs.mkdir(exist_ok=True)
    for old_log in logs.glob("*.log"):
        old_log.unlink()
    for old_failures in logs.glob("*_failing_tests.txt"):
        old_failures.unlink()
    report = {"schema_version": "1.0", "generator": "DeepSeek-V4-Flash",
              "created_at": datetime.now(timezone.utc).isoformat(),
              "project": project, "bug_id": bug_id,
              "source": str(source), "coverage_scope": "modified classes of buggy revision"}
    try:
        with tempfile.TemporaryDirectory(prefix=f"deepseek-{name}-") as temporary_name:
            temporary = Path(temporary_name)
            archive = temporary / f"{project}-{bug_id}b-deepseek.1.tar.bz2"
            report["tests"], report["test_files"] = make_archive(source, archive)
            report["buggy"] = run_revision(d4j, project, bug_id, "b", archive,
                                           temporary, logs, coverage, test_timeout)
            shutil.rmtree(temporary / "buggy", ignore_errors=True)
            report["fixed"] = run_revision(d4j, project, bug_id, "f", archive,
                                           temporary, logs, False, test_timeout)
    except TargetInterrupted:
        return name, "INTERRUPTED"
    except (OSError, UnicodeError, ValueError, tarfile.TarError) as exc:
        report["error"] = str(exc)
    if STOP_REQUESTED.is_set():
        return name, "INTERRUPTED"
    buggy = report.get("buggy", {})
    fixed = report.get("fixed", {})
    report["test_run_seconds"] = total_test_seconds(report)
    a, b = buggy.get("result", "NOT_RUN"), fixed.get("result", "NOT_RUN")
    report["verdict"] = ("REVEALING" if (a, b) == ("FAIL", "PASS") else
                         "NOT_REVEALING" if (a, b) == ("PASS", "PASS") else
                         "NOT_AVAILABLE" if "NOT_RUN" in (a, b) else "INCONCLUSIVE")
    write_csv_atomic(destination / "result.csv", [report_row(report)])
    write_json_atomic(destination / "result.json", report)
    return name, report["verdict"]


def collect_reports(result_root=None, update_summary=True):
    result_root = RESULT_ROOT if result_root is None else result_root
    rows = []
    for path in sorted(result_root.glob("*/result.json")):
        with path.open(encoding="utf-8") as handle:
            report = json.load(handle)
        if recover_test_times(report, path.parent):
            write_json_atomic(path, report)
        row = report_row(report)
        write_csv_atomic(path.parent / "result.csv", [row])
        rows.append(row)
    write_csv_atomic(result_root / "report.csv", rows)
    if update_summary:
        write_summary()
    return len(rows)


SUMMARY_FIELDS = ("row_type", "round", "target", "verdict", "line_coverage",
                 "revealed_count", "total_tokens", "generation_seconds",
                 "result_count")


XLSX_NS = "http://schemas.openxmlformats.org/spreadsheetml/2006/main"
ET.register_namespace("x", XLSX_NS)


def xlsx_tag(name):
    return f"{{{XLSX_NS}}}{name}"


def set_xlsx_value(cell, value):
    """Set a cell value/cache without removing a dashboard formula."""
    for child in list(cell):
        if child.tag != xlsx_tag("f"):
            cell.remove(child)
    cell.attrib.pop("t", None)
    if value is None:
        if cell.find(xlsx_tag("f")) is not None:
            cell.set("t", "str")
            ET.SubElement(cell, xlsx_tag("v"))
    elif isinstance(value, (int, float)):
        ET.SubElement(cell, xlsx_tag("v")).text = str(value)
    else:
        cell.set("t", "inlineStr")
        ET.SubElement(ET.SubElement(cell, xlsx_tag("is")), xlsx_tag("t")).text = str(value)


def dashboard_values(rows):
    values = {}
    for column, round_name in zip("CDE", ("Round1", "Round2", None)):
        group = rows if round_name is None else [r for r in rows if r["round"] == round_name]
        def recorded(field):
            return [r[field] for r in group if isinstance(r.get(field), (int, float))]
        def total(field):
            numbers = recorded(field)
            return sum(numbers) if numbers else None
        coverage = recorded("line_coverage")
        revealing = sum(r["revealed_count"] for r in group)
        metrics = [len(group), sum(coverage) / len(coverage) / 100 if coverage else None,
                   revealing, revealing / len(group) if group else None,
                   total("total_tokens"), total("generation_seconds"), len(coverage)]
        values.update({f"{column}{row}": value for row, value in enumerate(metrics, 6)})
        for row, verdict in enumerate(("REVEALING", "NOT_REVEALING", "NOT_AVAILABLE", "INCONCLUSIVE"), 18):
            values[f"{column}{row}"] = sum(r["verdict"] == verdict for r in group)
    return values


def write_summary_workbook(destination: Path, rows):
    template = Path(__file__).with_name("summary_template.xlsx")
    end = max(len(rows) + 1, 2)
    with ZipFile(template) as source:
        data = ET.fromstring(source.read("xl/worksheets/sheet2.xml"))
        sheet_data = data.find(xlsx_tag("sheetData"))
        sample = sheet_data.find(f"{xlsx_tag('row')}[@r='2']")
        styles = {cell.get("r")[0]: cell.get("s", "0") for cell in sample}
        for row in list(sheet_data)[1:]:
            sheet_data.remove(row)
        for index, record in enumerate(rows, 2):
            row = ET.SubElement(sheet_data, xlsx_tag("row"), {"r": str(index), "ht": "24", "customHeight": "1"})
            for column, field in zip("ABCDEFGHI", SUMMARY_FIELDS):
                cell = ET.SubElement(row, xlsx_tag("c"), {"r": f"{column}{index}", "s": styles[column]})
                value = record.get(field)
                if field == "line_coverage" and isinstance(value, (int, float)):
                    value /= 100
                set_xlsx_value(cell, value)
        dimension = data.find(xlsx_tag("dimension"))
        if dimension is not None:
            dimension.set("ref", f"A1:I{end}")

        dashboard = ET.fromstring(source.read("xl/worksheets/sheet1.xml"))
        cached = dashboard_values(rows)
        for cell in dashboard.iter(xlsx_tag("c")):
            formula = cell.find(xlsx_tag("f"))
            if formula is not None:
                formula.text = re.sub(r"(Data!\$[A-J]\$2:\$[A-J]\$)2\b", lambda m: m[1] + str(end), formula.text)
            address = cell.get("r")
            if address in cached:
                set_xlsx_value(cell, cached[address])
            elif address == "B25":
                set_xlsx_value(cell, "Updated: " + datetime.now().astimezone().strftime("%Y-%m-%d %H:%M:%S %z"))

        table = ET.fromstring(source.read("xl/tables/table1.xml"))
        table.set("ref", f"A1:I{end}")
        auto_filter = table.find(xlsx_tag("autoFilter"))
        if auto_filter is not None:
            auto_filter.set("ref", f"A1:I{end}")
        workbook = ET.fromstring(source.read("xl/workbook.xml"))
        calc = workbook.find(xlsx_tag("calcPr"))
        if calc is None:
            calc = ET.SubElement(workbook, xlsx_tag("calcPr"))
        calc.attrib.update({"calcMode": "auto", "fullCalcOnLoad": "1"})
        updates = {"xl/worksheets/sheet1.xml": dashboard,
                   "xl/worksheets/sheet2.xml": data,
                   "xl/tables/table1.xml": table, "xl/workbook.xml": workbook}
        staged = destination.with_suffix(".xlsx.tmp")
        try:
            with ZipFile(staged, "w", compression=ZIP_DEFLATED) as output:
                for entry in source.infolist():
                    payload = ET.tostring(updates[entry.filename], encoding="utf-8", xml_declaration=True) if entry.filename in updates else source.read(entry.filename)
                    output.writestr(entry.filename, payload)
            try:
                staged.replace(destination)
            except PermissionError as exc:
                raise PermissionError(
                    f"Cannot replace {destination}; close the workbook and run --summary-only again."
                ) from exc
        finally:
            staged.unlink(missing_ok=True)

def state_records(state_root: Path, round_name: str):
    """Yield generator records from both rounds' persisted state files."""
    if round_name == "Round2":
        candidates = sorted((state_root / "state" / "Round2" / "shards").glob("*.json"))
    else:
        round_state = state_root / "state" / "Round1"
        candidates = [round_state / "generator_state.json"]
        candidates.extend(sorted((round_state / "shards").glob("*.json")))
    records = {}
    for path in candidates:
        if not path.is_file():
            continue
        try:
            data = json.loads(path.read_text(encoding="utf-8"))
        except (OSError, json.JSONDecodeError):
            continue
        if not isinstance(data, dict):
            continue
        for task_id, record in data.items():
            if isinstance(record, dict):
                current = records.get(task_id)
                if current is None or str(record.get("updated_at", "")) >= str(current.get("updated_at", "")):
                    records[task_id] = record
    return records


def generation_metrics(target: str, records: dict):
    token_total = 0
    generation_seconds = 0.0
    found_usage = False
    found_time = False
    prefix = target + "/"
    for task_id, record in records.items():
        if not task_id.startswith(prefix):
            continue
        usage = record.get("usage") or {}
        tokens = usage.get("total_tokens")
        if tokens is None:
            prompt_tokens = usage.get("prompt_tokens")
            completion_tokens = usage.get("completion_tokens")
            if isinstance(prompt_tokens, (int, float)) and isinstance(completion_tokens, (int, float)):
                tokens = prompt_tokens + completion_tokens
        if isinstance(tokens, (int, float)):
            token_total += tokens
            found_usage = True
        elapsed = record.get("elapsed_seconds")
        if isinstance(elapsed, (int, float)):
            generation_seconds += elapsed
            found_time = True
    return (token_total if found_usage else None,
            round(generation_seconds, 2) if found_time else None)


def write_summary():
    """Collect both generation rounds and test reports into the outer summary."""
    root = RESULT_ROOT.parent
    state_root = root
    detailed = []
    result_roots = (("Round1", root / "Result"), ("Round2", root / "Result2"))
    for round_name, result_root in result_roots:
        all_records = state_records(state_root, round_name)
        for path in sorted(result_root.glob("*/result.json")):
            try:
                report = json.loads(path.read_text(encoding="utf-8"))
            except (OSError, json.JSONDecodeError):
                continue
            target = path.parent.name
            tokens, generation_seconds = generation_metrics(target, all_records)
            line_coverage = report.get("buggy", {}).get("line_cov")
            verdict = report.get("verdict")
            detailed.append({
                "row_type": "RESULT", "round": round_name, "target": target,
                "verdict": verdict, "line_coverage": line_coverage,
                "revealed_count": int(verdict == "REVEALING"),
                "total_tokens": tokens, "generation_seconds": generation_seconds,
                "result_count": 1,
            })

    write_summary_workbook(root / "summary.xlsx", detailed)



def main(argv=None):
    global TEST_ROOT, RESULT_ROOT
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--test-root", type=Path, default=TEST_ROOT,
                        help="Directory containing <target>_buggy test folders")
    parser.add_argument("--result-root", type=Path, default=RESULT_ROOT,
                        help="Directory for per-target and combined reports")
    parser.add_argument("--workers", type=int, default=4, help="Concurrent Defects4J checkouts (default: 4)")
    parser.add_argument("--projects", nargs="+", help="Project names, for example Chart Cli")
    parser.add_argument("--targets", nargs="+", help="Exact targets, for example Chart_1 Cli_5")
    parser.add_argument("--limit", type=int, help="Run only the first N pending targets")
    parser.add_argument("--defects4j-bin", default=os.environ.get("DEFECTS4J_BIN", "defects4j"))
    parser.add_argument("--no-coverage", action="store_true", help="Skip buggy revision coverage")
    parser.add_argument("--test-timeout", type=int, default=600,
                        help="Seconds allowed for each test/coverage command (default: 600)")
    parser.add_argument("--overwrite", action="store_true", help="Rerun targets with existing result.json")
    parser.add_argument("--dry-run", action="store_true", help="List pending targets without running")
    parser.add_argument("--collect-only", action="store_true", help="Rebuild combined report without running tests")
    parser.add_argument("--summary-only", action="store_true",
                        help="Rebuild Deepseek-flash-v4/summary.xlsx (Dashboard + Data) from both rounds")
    args = parser.parse_args(argv)
    TEST_ROOT = args.test_root.resolve()
    RESULT_ROOT = args.result_root.resolve()
    if args.workers < 1 or args.test_timeout < 1 or (args.limit is not None and args.limit < 1):
        parser.error("--workers, --limit, and --test-timeout must be positive")
    if args.collect_only and args.summary_only:
        parser.error("Use either --collect-only or --summary-only")
    if args.summary_only:
        write_summary()
        print(f"Updated summary: {RESULT_ROOT.parent / 'summary.xlsx'}", flush=True)
        return 0
    if args.collect_only:
        RESULT_ROOT.mkdir(exist_ok=True)
        count = collect_reports()
        print(f"Combined {count} reports: {RESULT_ROOT / 'report.csv'}", flush=True)
        print(f"Updated summary: {RESULT_ROOT.parent / 'summary.xlsx'}", flush=True)
        return 0
    if not TEST_ROOT.is_dir():
        parser.error(f"Test directory is missing: {TEST_ROOT}")
    available = discover_targets()
    selected = sorted(available, key=lambda n: (n.split("_")[0], int(n.split("_")[1])))
    if args.projects:
        requested = {p.lower() for p in args.projects}
        selected = [n for n in selected if n.split("_")[0].lower() in requested]
        unknown = requested - {n.split("_")[0].lower() for n in available}
        if unknown:
            parser.error(f"Unknown projects: {', '.join(sorted(unknown))}")
    if args.targets:
        requested = set(args.targets)
        unknown = requested - available.keys()
        if unknown:
            parser.error(f"Unknown targets: {', '.join(sorted(unknown))}")
        selected = [n for n in selected if n in requested]
    pending = [n for n in selected if args.overwrite or not (RESULT_ROOT / n / "result.json").is_file()]
    if args.limit:
        pending = pending[:args.limit]
    print(f"Selected {len(selected)} targets; pending {len(pending)}; workers {args.workers}", flush=True)
    if args.dry_run:
        for name in pending:
            print(name)
        return 0
    if pending and not (Path(args.defects4j_bin).is_file() or shutil.which(args.defects4j_bin)):
        parser.error(f"Defects4J executable not found: {args.defects4j_bin}")
    RESULT_ROOT.mkdir(exist_ok=True)
    STOP_REQUESTED.clear()
    failures = 0
    interrupted = False
    pool = ThreadPoolExecutor(max_workers=args.workers)
    try:
        futures = {pool.submit(run_target, n, available[n], args.defects4j_bin,
                               not args.no_coverage, args.test_timeout): n for n in pending}
        for future in as_completed(futures):
            name = futures[future]
            try:
                _, verdict = future.result()
                print(f"[{name}] {verdict}", flush=True)
                failures += verdict == "NOT_AVAILABLE"
            except Exception as exc:
                print(f"[{name}] runner error: {exc}", file=sys.stderr, flush=True)
                failures += 1
    except KeyboardInterrupt:
        interrupted = True
        STOP_REQUESTED.set()
        print("Interrupted; stopping active commands and updating combined report...",
              file=sys.stderr, flush=True)
        stop_active_commands()
    finally:
        pool.shutdown(wait=True, cancel_futures=interrupted)
    count = collect_reports()
    print(f"Combined {count} reports: {RESULT_ROOT / 'report.csv'}", flush=True)
    print(f"Updated summary: {RESULT_ROOT.parent / 'summary.xlsx'}", flush=True)
    if interrupted:
        return 130
    return 1 if failures else 0


if __name__ == "__main__":
    try:
        sys.exit(main())
    except PermissionError as exc:
        print(str(exc), file=sys.stderr)
        sys.exit(1)
