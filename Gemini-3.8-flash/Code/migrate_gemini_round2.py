#!/usr/bin/env python3
"""
Migrate passing, revealing, and inconclusive targets from Round 1 (TestCode, Result)
into Round 2 (TestCode2, Result2) for Gemini 3.8 Flash.
Only NOT_AVAILABLE targets will remain pending for regeneration and re-execution.
"""

import argparse
import csv
import json
import shutil
import sys
from datetime import datetime, timezone
from pathlib import Path

WORKSPACE = Path(__file__).resolve().parent.parent
TEST_CODE_1 = WORKSPACE / "TestCode"
RESULT_1 = WORKSPACE / "Result"
TEST_CODE_2 = WORKSPACE / "TestCode2"
RESULT_2 = WORKSPACE / "Result2"
STATE_ROUND2 = WORKSPACE / "state" / "Round2"


def migrate_inherited(execute: bool = False):
    if not TEST_CODE_1.is_dir() or not RESULT_1.is_dir():
        raise RuntimeError("Original TestCode and Result directories are required.")

    # Read Result/report.csv or scan result.json files
    inherited = []
    not_available = []

    for path in sorted(RESULT_1.glob("*/result.json")):
        try:
            report = json.loads(path.read_text(encoding="utf-8"))
        except Exception as e:
            continue
        target = path.parent.name
        verdict = report.get("verdict")
        source_code = TEST_CODE_1 / f"{target}_buggy"
        if not source_code.is_dir():
            print(f"Warning: TestCode missing for target: {target}")
            continue

        if verdict == "NOT_AVAILABLE":
            not_available.append(target)
        else:
            inherited.append((target, verdict))

    print(f"Total targets scanned: {len(inherited) + len(not_available)}")
    print(f"Inherited targets (passing / revealing / inconclusive): {len(inherited)}")
    print(f"NOT_AVAILABLE targets to be regenerated in Round 2: {len(not_available)}")

    if not execute:
        print("\nDry-run only. Pass --execute to copy inherited targets to TestCode2 and Result2.")
        return len(inherited), len(not_available)

    TEST_CODE_2.mkdir(exist_ok=True)
    RESULT_2.mkdir(exist_ok=True)
    STATE_ROUND2.mkdir(parents=True, exist_ok=True)

    copied = 0
    for target, verdict in inherited:
        src_code = TEST_CODE_1 / f"{target}_buggy"
        dst_code = TEST_CODE_2 / f"{target}_buggy"
        src_res = RESULT_1 / target
        dst_res = RESULT_2 / target

        if not dst_code.exists():
            shutil.copytree(src_code, dst_code)
        if not dst_res.exists():
            shutil.copytree(src_res, dst_res)
        copied += 1

    print(f"Successfully migrated {copied} inherited targets to TestCode2/ and Result2/.")

    # Generate Result2/report.csv by running run_gemini_tests.py --collect-only
    runner = WORKSPACE / "Code" / "run_gemini_tests.py"
    import subprocess
    cmd = [
        sys.executable,
        str(runner),
        "--collect-only",
        "--test-root", str(TEST_CODE_2),
        "--result-root", str(RESULT_2)
    ]
    print(f"Collecting reports for Result2: {' '.join(cmd)}")
    subprocess.run(cmd, check=True)

    marker = STATE_ROUND2 / "layout_migration.json"
    marker.write_text(json.dumps({
        "migrated_at": datetime.now(timezone.utc).isoformat(),
        "inherited_targets": len(inherited),
        "not_available_targets": len(not_available),
        "testcode2_count": len(list(TEST_CODE_2.glob("*_buggy"))),
        "result2_count": len(list(RESULT_2.glob("*/result.json")))
    }, indent=2) + "\n", encoding="utf-8")

    return len(inherited), len(not_available)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--execute", action="store_true", help="Perform the migration")
    args = parser.parse_args()
    migrate_inherited(execute=args.execute)


if __name__ == "__main__":
    main()
