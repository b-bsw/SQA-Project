#!/usr/bin/env python3
"""Build TestCode2/Result2 from successful old suites and staged regeneration."""

import argparse
import hashlib
import json
import shutil
import subprocess
import sys
from datetime import datetime, timezone
from pathlib import Path


WORKSPACE = Path(__file__).resolve().parents[2]
DEEPSEEK = WORKSPACE / "Deepseek-flash-v4"
PILOT = "Mockito_29"


def file_digest(path):
    digest = hashlib.sha256()
    with path.open("rb") as handle:
        for chunk in iter(lambda: handle.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.digest()


def same_tree(source, destination):
    left = {p.relative_to(source): p for p in source.rglob("*") if p.is_file()}
    right = {p.relative_to(destination): p for p in destination.rglob("*") if p.is_file()}
    return left.keys() == right.keys() and all(
        file_digest(path) == file_digest(right[name]) for name, path in left.items())


def copy_once(source, destination):
    if destination.exists():
        if not destination.is_dir() or not same_tree(source, destination):
            raise RuntimeError(f"Destination differs from source: {destination}")
        return
    shutil.copytree(source, destination)
    if not same_tree(source, destination):
        raise RuntimeError(f"Copy verification failed: {destination}")


def restore_pilot(deepseek):
    legacy_code = deepseek / "TestCode" / f"{PILOT}_buggy"
    legacy_result = deepseek / "Result" / PILOT
    new_code = deepseek / "TestCode2" / f"{PILOT}_buggy"
    new_result = deepseek / "Result2" / PILOT
    baseline = deepseek / "Regeneration" / "baseline" / PILOT
    original_code = baseline / "TestCode"
    original_result = baseline / "Result"

    if not new_code.exists():
        if not original_code.is_dir() or not legacy_code.is_dir():
            raise RuntimeError("Pilot code or its original baseline is missing")
        legacy_code.rename(new_code)
    if not new_result.exists():
        if not original_result.is_dir() or not legacy_result.is_dir():
            raise RuntimeError("Pilot result or its original baseline is missing")
        legacy_result.rename(new_result)
    if original_code.is_dir():
        if legacy_code.exists():
            raise RuntimeError("Cannot restore original pilot code over existing data")
        original_code.rename(legacy_code)
    if original_result.is_dir():
        if legacy_result.exists():
            raise RuntimeError("Cannot restore original pilot result over existing data")
        original_result.rename(legacy_result)
    if not all(p.is_dir() for p in (legacy_code, legacy_result, new_code, new_result)):
        raise RuntimeError("Pilot migration did not complete")


def migrate(deepseek):
    old_code = deepseek / "TestCode"
    old_result = deepseek / "Result"
    new_code = deepseek / "TestCode2"
    new_result = deepseek / "Result2"
    old_work = deepseek / "Regeneration"
    new_work = new_code / ".work"
    if not all(p.is_dir() for p in (old_code, old_result)):
        raise RuntimeError("Original TestCode and Result are required")
    if not old_work.is_dir() and not new_work.is_dir():
        raise RuntimeError("Regeneration state is missing")

    inherited = []
    for path in sorted(old_result.glob("*/result.json")):
        report = json.loads(path.read_text(encoding="utf-8"))
        if report.get("verdict") == "NOT_AVAILABLE":
            continue
        target = path.parent.name
        source_code = old_code / f"{target}_buggy"
        if not source_code.is_dir():
            raise RuntimeError(f"TestCode missing for successful target: {target}")
        inherited.append(target)

    new_code.mkdir(exist_ok=True)
    new_result.mkdir(exist_ok=True)
    for target in inherited:
        copy_once(old_code / f"{target}_buggy", new_code / f"{target}_buggy")
        copy_once(old_result / target, new_result / target)

    if old_work.is_dir():
        restore_pilot(deepseek)
        if new_work.exists():
            raise RuntimeError(f"Cannot move Regeneration over {new_work}")
        old_work.rename(new_work)

    for path in (new_work / "generator_state").glob("*.json"):
        data = json.loads(path.read_text(encoding="utf-8"))
        changed = False
        for record in data.values():
            if not isinstance(record, dict) or not isinstance(record.get("test_file"), str):
                continue
            old = record["test_file"]
            updated = old.replace("Deepseek-flash-v4/Regeneration/",
                                  "Deepseek-flash-v4/TestCode2/.work/")
            updated = updated.replace("Deepseek-flash-v4\\Regeneration\\",
                                      "Deepseek-flash-v4\\TestCode2\\.work\\")
            updated = updated.replace(
                f"Deepseek-flash-v4/TestCode2/.work/staging/{PILOT}/{PILOT}_buggy/",
                f"Deepseek-flash-v4/TestCode2/{PILOT}_buggy/")
            updated = updated.replace(
                f"Deepseek-flash-v4\\TestCode2\\.work\\staging\\{PILOT}\\{PILOT}_buggy\\",
                f"Deepseek-flash-v4\\TestCode2\\{PILOT}_buggy\\")
            if updated != old:
                record["test_file"] = updated
                changed = True
        if changed:
            staged = path.with_suffix(".json.tmp")
            staged.write_text(json.dumps(data, indent=2, ensure_ascii=False) + "\n",
                              encoding="utf-8")
            staged.replace(path)

    pilot_status = new_work / "status" / f"{PILOT}.json"
    if pilot_status.is_file():
        status = json.loads(pilot_status.read_text(encoding="utf-8"))
        if status.get("status") == "COMMITTED":
            status.pop("baseline", None)
            status["test_code"] = f"TestCode2/{PILOT}_buggy"
            status["original_restored"] = True
            staged = pilot_status.with_suffix(".json.tmp")
            staged.write_text(json.dumps(status, indent=2, ensure_ascii=False) + "\n",
                              encoding="utf-8")
            staged.replace(pilot_status)

    runner = deepseek / "Code" / "run_deepseek_tests.py"
    for root in (old_result, new_result):
        subprocess.run([sys.executable, str(runner), "--collect-only",
                        "--result-root", str(root)], check=True)
    count_code = len([p for p in new_code.glob("*_buggy") if p.is_dir()])
    count_result = len(list(new_result.glob("*/result.json")))
    if count_code != len(inherited) + 1 or count_result != len(inherited) + 1:
        raise RuntimeError(f"Unexpected TestCode2/Result2 counts: {count_code}/{count_result}")
    marker = new_work / "layout_migration.json"
    marker.write_text(json.dumps({
        "migrated_at": datetime.now(timezone.utc).isoformat(),
        "inherited_targets": len(inherited), "regenerated_targets": 1,
        "testcode2_targets": count_code, "result2_reports": count_result,
    }, indent=2) + "\n", encoding="utf-8")
    return count_code, count_result


def main(argv=None):
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--execute", action="store_true", help="Copy and move the layout")
    args = parser.parse_args(argv)
    if not args.execute:
        print("Pass --execute to migrate without running generation or Defects4J.")
        return 0
    code, results = migrate(DEEPSEEK)
    print(f"TestCode2: {code} targets; Result2: {results} reports")
    return 0


if __name__ == "__main__":
    sys.exit(main())
