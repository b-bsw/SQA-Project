#!/usr/bin/env python3
"""Measure Defects4J condition coverage for existing EvoSuite GA tests only."""

from __future__ import annotations

import argparse
import csv
import json
import hashlib
import os
import re
import signal
import time
import shutil
import subprocess
import sys
import tarfile
import tempfile
from concurrent.futures import ThreadPoolExecutor, as_completed
from pathlib import Path


GA_ROOT = Path(__file__).resolve().parents[1]
DEFAULT_TESTS_ROOT = GA_ROOT / "TestCode"
DEFAULT_RESULTS_ROOT = GA_ROOT / "Result_v2"
TARGET_RE = re.compile(r"^([A-Za-z][A-Za-z0-9]*)_([1-9][0-9]*)$")
CSV_FIELDS = (
    "project", "bug_id", "target", "coverage_status",
    "lines_total", "lines_covered", "line_coverage",
    "conditions_total", "conditions_covered", "condition_coverage",
    "failing_tests",
    "generation_status", "failure_reason",
    "round", "paired_validation", "buggy_result", "fixed_result", "verdict",
    "suite_hash", "test_run_seconds",
)


def targets_from_args(items: list[str], tests_root: Path) -> list[tuple[str, int]]:
    if items == ["all"]:
        targets = []
        for path in tests_root.iterdir():
            match = TARGET_RE.fullmatch(path.name) if path.is_dir() else None
            if match:
                targets.append((match.group(1), int(match.group(2))))
        return sorted(targets, key=lambda item: (item[0].lower(), item[1]))
    if len(items) != 2 or not re.fullmatch(r"[A-Za-z][A-Za-z0-9]*", items[0]):
        raise ValueError("Use PROJECT BUG_ID[,BUG_ID...] or all")
    project = items[0]
    bug_ids = items[1].split(",")
    if not bug_ids or any(not re.fullmatch(r"[1-9][0-9]*", bug_id) for bug_id in bug_ids):
        raise ValueError("BUG_ID must be a positive integer or comma-separated integers")
    return [(project, int(bug_id)) for bug_id in dict.fromkeys(bug_ids)]


def make_suite_archive(tests_dir: Path, archive: Path) -> int:
    sources = sorted(tests_dir.rglob("*.java")) if tests_dir.is_dir() else []
    if not sources:
        return 0
    with tarfile.open(archive, "w:bz2") as output:
        for source in sources:
            if source.is_symlink():
                raise ValueError(f"Symlinked test source is not supported: {source}")
            output.add(source, arcname=source.relative_to(tests_dir).as_posix(), recursive=False)
    return len(sources)


def read_coverage_summary(path: Path) -> dict[str, int | float | None]:
    with path.open(newline="", encoding="utf-8-sig") as stream:
        row = next(csv.DictReader(stream), None)
    if row is None:
        raise ValueError("Coverage summary.csv is empty")
    names = ("LinesTotal", "LinesCovered", "ConditionsTotal", "ConditionsCovered")
    try:
        lines_total, lines_covered, conditions_total, conditions_covered = (
            int(row[name]) for name in names
        )
    except (KeyError, TypeError, ValueError) as exc:
        raise ValueError("Coverage summary.csv has invalid counts") from exc
    if (lines_total < 0 or conditions_total < 0 or
            not 0 <= lines_covered <= lines_total or
            not 0 <= conditions_covered <= conditions_total):
        raise ValueError("Coverage summary.csv has inconsistent counts")
    return {
        "lines_total": lines_total,
        "lines_covered": lines_covered,
        "line_coverage": round(100 * lines_covered / lines_total, 2) if lines_total else None,
        "conditions_total": conditions_total,
        "conditions_covered": conditions_covered,
        "condition_coverage": (
            round(100 * conditions_covered / conditions_total, 2)
            if conditions_total else None
        ),
    }


def run_command(command: list[str], log: Path, timeout_seconds: float = 1800) -> int:
    with log.open("a", encoding="utf-8") as stream:
        stream.write("$ " + " ".join(command) + "\n")
        stream.flush()
        process = subprocess.Popen(command, stdout=stream, stderr=subprocess.STDOUT,
                                   start_new_session=True)
        try:
            returncode = process.wait(timeout=timeout_seconds)
        except subprocess.TimeoutExpired:
            os.killpg(process.pid, signal.SIGTERM)
            try:
                process.wait(timeout=10)
            except subprocess.TimeoutExpired:
                os.killpg(process.pid, signal.SIGKILL)
                process.wait()
            stream.write(f"[TIMEOUT after {timeout_seconds:.1f}s]\n")
            raise RuntimeError(f"TIMEOUT: command exceeded target deadline; see {log}")
        stream.write(f"[exit {returncode}]\n")
    return returncode


def failing_test_count(workspace: Path) -> int:
    path = workspace / "failing_tests"
    if not path.is_file():
        return 0
    return sum(line.startswith("--- ") for line in path.read_text(
        encoding="utf-8", errors="replace").splitlines())


def write_csv(path: Path, rows: list[dict]) -> None:
    staged = path.with_suffix(path.suffix + ".tmp")
    with staged.open("w", newline="", encoding="utf-8") as stream:
        writer = csv.DictWriter(stream, fieldnames=CSV_FIELDS, extrasaction="ignore", lineterminator="\n")
        writer.writeheader()
        writer.writerows(rows)
    staged.replace(path)


def collect_report(results_root: Path) -> Path:
    rows = []
    for path in sorted(results_root.glob("*/result.json")):
        with path.open(encoding="utf-8") as stream:
            row = json.load(stream)
        rows.append({field: row.get(field) for field in CSV_FIELDS})
    output = results_root / "report.csv"
    write_csv(output, rows)
    return output


def measure_paired(project, bug_id, tests_root, results_root, defects4j,
                   timeout_seconds, round_number):
    """Validate both revisions and measure buggy coverage with one saved suite."""
    target = f"{project}_{bug_id}"
    source = tests_root / target
    destination = results_root / target
    destination.mkdir(parents=True, exist_ok=True)
    logs = destination / "logs"
    logs.mkdir(exist_ok=True)
    result = dict(project=project, bug_id=bug_id, target=target,
                  round=round_number, paired_validation=True,
                  suite_scope="Shared saved TestCode; rounds are repeated execution",
                  coverage_status="NOT_AVAILABLE", generation_status="PASS",
                  lines_total=None, lines_covered=None, line_coverage=None,
                  conditions_total=None, conditions_covered=None, condition_coverage=None,
                  failing_tests=None, validations=[])
    digest = hashlib.sha256()
    files = sorted(source.rglob("*.java")) if source.is_dir() else []
    tests = 0
    for path in files:
        data = path.read_bytes()
        digest.update(path.relative_to(source).as_posix().encode()+b"\0"+data+b"\0")
        tests += len(re.findall(rb"@(?:org\.junit\.)?Test\b", data))
    result.update(suite_hash=digest.hexdigest(), tests=tests, test_files=len(files))
    deadline = time.monotonic()+timeout_seconds
    with tempfile.TemporaryDirectory(prefix=f"ga-paired-{target}-") as temporary:
        temp_root = Path(temporary)
        archive = temp_root/f"{project}-{bug_id}b-evosuite-ga.1.tar.bz2"
        if not tests:
            result.update(generation_status="FAIL", coverage_status="FAIL",
                          failure_reason="No saved test methods", verdict="FAIL")
        else:
            make_suite_archive(source, archive)
            for suffix, subject in (("b", "buggy"), ("f", "fixed")):
                workspace = temp_root/subject
                validation = dict(subject=subject, result="NOT_RUN", fails=None,
                                  compile="NOT_RUN", test_compile="NOT_RUN")
                result[subject] = validation
                result["validations"].append(validation)
                log = logs/f"{subject}.log"
                log.write_text("", encoding="utf-8")
                stage = "checkout"
                try:
                    commands = [("checkout", [defects4j,"checkout","-p",project,"-v",f"{bug_id}{suffix}","-w",str(workspace)]),
                                ("compile", [defects4j,"compile","-w",str(workspace)]),
                                ("test", [defects4j,"test","-w",str(workspace),"-s",str(archive)])]
                    for stage, command in commands:
                        remaining = deadline-time.monotonic()
                        if remaining <= 0: raise RuntimeError("TIMEOUT: target deadline exceeded")
                        started = time.monotonic()
                        rc = run_command(command, log, min(600,remaining))
                        validation[stage+"_seconds"] = round(time.monotonic()-started,2)
                        if stage in ("checkout", "compile"):
                            if rc:
                                if stage == "compile": validation["compile"]="FAIL"
                                raise RuntimeError(f"{stage} failed (exit {rc})")
                            if stage == "compile": validation["compile"]="PASS"
                        else:
                            output = log.read_text(encoding="utf-8", errors="replace")
                            match = re.findall(r"Failing tests:\s*(\d+)",output)
                            if re.search(r"compile\.gen\.tests\).*FAIL",output) or (rc and not match):
                                validation["test_compile"]="FAIL"
                                raise RuntimeError("Generated tests did not compile/run")
                            fails = int(match[-1]) if match else failing_test_count(workspace)
                            validation.update(test_compile="PASS", fails=fails,
                                              result="FAIL" if fails else "PASS",
                                              test_status="FAIL" if fails else "PASS",
                                              test_time_source="measured_wall_clock")
                    if suffix == "b":
                        stage = "coverage"
                        remaining = deadline-time.monotonic()
                        if remaining <= 0: raise RuntimeError("TIMEOUT: target deadline exceeded")
                        started=time.monotonic()
                        rc=run_command([defects4j,"coverage","-w",str(workspace),"-s",str(archive)],log,min(600,remaining))
                        validation["coverage_seconds"]=round(time.monotonic()-started,2)
                        validation["coverage_status"]="FAIL" if rc else "PASS"
                        if rc: raise RuntimeError("Coverage measurement failed")
                        result.update(read_coverage_summary(workspace/"summary.csv"))
                        result["failing_tests"]=failing_test_count(workspace)
                        result["coverage_status"]="TESTS_FAILED" if result["failing_tests"] else "OK"
                except (OSError, ValueError, RuntimeError) as exc:
                    validation["failure_reason"]=str(exc)
                    validation[stage+"_status"]="TIMEOUT" if "TIMEOUT" in str(exc) else "FAIL"
                    if suffix=="b" and result["line_coverage"] is None:
                        result["failure_reason"]=str(exc)
    buggy,fixed=result.get("buggy",{}),result.get("fixed",{})
    a,b=buggy.get("result","NOT_RUN"),fixed.get("result","NOT_RUN")
    result.update(buggy_result=a,fixed_result=b,
                  test_run_seconds=round(sum(v.get("test_seconds",0) for v in result["validations"]),2))
    if result.get("verdict")!="FAIL":
        result["verdict"]=("NOT_AVAILABLE" if result["coverage_status"]=="NOT_AVAILABLE" or "NOT_RUN" in (a,b)
                           else "REVEALING" if (a,b)==("FAIL","PASS")
                           else "NOT_REVEALING" if (a,b)==("PASS","PASS") else "INCONCLUSIVE")
    staged=destination/"result.json.tmp"
    staged.write_text(json.dumps(result,indent=2)+"\n",encoding="utf-8")
    staged.replace(destination/"result.json")
    write_csv(destination/"result.csv",[result])
    return result


def measure_target(project: str, bug_id: int, tests_root: Path,
                   results_root: Path, defects4j: str, timeout_seconds: int = 1800,
                   paired=False, round_number=None) -> dict:
    if paired:
        return measure_paired(project,bug_id,tests_root,results_root,defects4j,timeout_seconds,round_number)
    target = f"{project}_{bug_id}"
    tests_dir = tests_root / target
    result_dir = results_root / target
    result_dir.mkdir(parents=True, exist_ok=True)
    log = result_dir / "coverage.log"
    log.write_text("", encoding="utf-8")
    result = {
        "project": project, "bug_id": bug_id, "target": target,
        "coverage_status": "NOT_AVAILABLE",
        "lines_total": None, "lines_covered": None, "line_coverage": None,
        "conditions_total": None, "conditions_covered": None,
        "condition_coverage": None, "failing_tests": None,
    }
    with tempfile.TemporaryDirectory(prefix=f"ga-coverage-v2-{target}-") as temporary:
        deadline = time.monotonic() + timeout_seconds
        temp_root = Path(temporary)
        archive = temp_root / f"{project}-{bug_id}b-evosuite-ga.1.tar.bz2"
        try:
            source_count = make_suite_archive(tests_dir, archive)
            if not source_count:
                result["coverage_status"] = "FAIL"
                result["generation_status"] = "FAIL"
                raise ValueError(f"No saved Java tests in {tests_dir}")
            result["generation_status"] = "PASS"
            workspace = temp_root / "buggy"
            commands = (
                [defects4j, "checkout", "-p", project, "-v", f"{bug_id}b",
                 "-w", str(workspace)],
                [defects4j, "compile", "-w", str(workspace)],
                [defects4j, "coverage", "-w", str(workspace), "-s", str(archive)],
            )
            for command in commands:
                remaining = deadline - time.monotonic()
                if remaining <= 0:
                    raise RuntimeError("TIMEOUT: target deadline exceeded")
                if run_command(command, log, remaining) != 0:
                    raise RuntimeError(f"Defects4J {command[1]} failed; see {log}")
            result.update(read_coverage_summary(workspace / "summary.csv"))
            result["failing_tests"] = failing_test_count(workspace)
            result["coverage_status"] = (
                "TESTS_FAILED" if result["failing_tests"] else "OK"
            )
        except (OSError, ValueError, RuntimeError, tarfile.TarError) as exc:
            result["failure_reason"] = str(exc)
            with log.open("a", encoding="utf-8") as stream:
                stream.write(f"ERROR: {exc}\n")
    staged = result_dir / "result.json.tmp"
    staged.write_text(json.dumps(result, indent=2, ensure_ascii=False) + "\n",
                      encoding="utf-8")
    staged.replace(result_dir / "result.json")
    write_csv(result_dir / "result.csv", [result])
    return result


def main(argv: list[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--paired", action="store_true", help="Run buggy/fixed with one saved suite and prefer these verdicts")
    parser.add_argument("--round", type=int, choices=(1,2), help="Round label for paired validation")
    parser.add_argument("target", nargs="+", help="PROJECT BUG_ID[,BUG_ID...] or all")
    parser.add_argument("--tests-root", type=Path, default=DEFAULT_TESTS_ROOT,
                        help="Directory containing saved PROJECT_BUG Java test folders")
    parser.add_argument("--results-root", type=Path, default=DEFAULT_RESULTS_ROOT,
                        help="V2 output directory")
    parser.add_argument("--jobs", type=int, default=1,
                        help="Number of targets to measure in parallel (default: 1)")
    parser.add_argument("--resume", action="store_true",
                        help="Skip targets with an existing result.json")
    parser.add_argument("--timeout-seconds", type=int, default=1800,
                        help="Total checkout/compile/coverage deadline per target (default: 1800)")
    parser.add_argument("--defects4j", default=os.environ.get("DEFECTS4J_BIN") or
                        shutil.which("defects4j"), help="Path to Defects4J executable")
    parser.add_argument("--java-home", type=Path,
                        default=os.environ.get("GA_JAVA_HOME"),
                        help="JDK 11+ home for compiling saved GA tests")
    args = parser.parse_args(argv)
    if not args.tests_root.is_dir():
        parser.error(f"Tests directory does not exist: {args.tests_root}")
    if not args.defects4j:
        parser.error("Set DEFECTS4J_BIN or add defects4j to PATH")
    if args.jobs < 1:
        parser.error("--jobs must be a positive integer")
    if args.timeout_seconds < 1:
        parser.error("--timeout-seconds must be positive")
    if args.java_home:
        java_bin = args.java_home / "bin" / "java"
        javac_bin = args.java_home / "bin" / "javac"
        if not java_bin.is_file() or not javac_bin.is_file():
            parser.error(f"Java home must contain bin/java and bin/javac: {args.java_home}")
        os.environ["JAVA_HOME"] = str(args.java_home)
        os.environ["PATH"] = str(java_bin.parent) + os.pathsep + os.environ.get("PATH", "")
    try:
        targets = targets_from_args(args.target, args.tests_root)
    except ValueError as exc:
        parser.error(str(exc))
    if not targets:
        parser.error("No saved test folders found")
    args.results_root.mkdir(parents=True, exist_ok=True)
    if args.resume:
        original_count = len(targets)
        targets = [(project, bug_id) for project, bug_id in targets
                   if not (args.results_root / f"{project}_{bug_id}" /
                           "result.json").is_file()]
        print(f"Resuming: {original_count - len(targets)} completed, "
              f"{len(targets)} remaining", flush=True)
    failures = 0
    with ThreadPoolExecutor(max_workers=args.jobs) as executor:
        futures = [executor.submit(measure_target, project, bug_id, args.tests_root,
                                   args.results_root, args.defects4j, args.timeout_seconds,
                                   args.paired, args.round)
                   for project, bug_id in targets]
        for future in as_completed(futures):
            result = future.result()
            print(f"{result['target']}: {result['coverage_status']} "
                  f"condition={result['condition_coverage']}", flush=True)
            failures += result["coverage_status"] in ("FAIL", "NOT_AVAILABLE")
    print(f"Report: {collect_report(args.results_root)}")
    return 1 if failures else 0


if __name__ == "__main__":
    sys.exit(main())
