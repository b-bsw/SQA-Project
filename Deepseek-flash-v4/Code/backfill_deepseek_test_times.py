#!/usr/bin/env python3
"""Fill missing DeepSeek test times from saved logs and refresh CSV/Excel reports."""

import argparse
import json
import sys
from pathlib import Path

import run_deepseek_tests as runner


def main(argv=None):
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--result-roots", nargs="+", type=Path,
                        default=[runner.ROOT / "Result", runner.ROOT / "Result2"])
    parser.add_argument("--dry-run", action="store_true", help="Show recovery counts without changing files")
    args = parser.parse_args(argv)
    roots = [path.resolve() for path in args.result_roots]
    if any(not path.is_dir() for path in roots):
        parser.error("Every result root must be an existing directory")
    if len({path.parent for path in roots}) != 1:
        parser.error("Result roots must share the same DeepSeek directory")
    for root in roots:
        changed = recovered = missing = total_known = 0
        for path in sorted(root.glob("*/result.json")):
            report = json.loads(path.read_text(encoding="utf-8"))
            before = sum(isinstance(report.get(revision, {}).get("test_seconds"), (int, float))
                         for revision in ("buggy", "fixed"))
            updated = runner.recover_test_times(report, path.parent)
            after = sum(isinstance(report.get(revision, {}).get("test_seconds"), (int, float))
                        for revision in ("buggy", "fixed"))
            recovered += after - before
            changed += updated
            total_known += isinstance(runner.total_test_seconds(report), (int, float))
            missing += sum((path.parent / "logs" / f"{revision}_test.log").is_file()
                           and not isinstance(report.get(revision, {}).get("test_seconds"), (int, float))
                           for revision in ("buggy", "fixed"))
            if updated and not args.dry_run:
                runner.write_json_atomic(path, report)
        print(f"{root.name}: updated {changed} reports; recovered {recovered} revision times; "
              f"complete totals {total_known}; test logs without recoverable timing {missing}", flush=True)
        if not args.dry_run:
            runner.collect_reports(root, update_summary=False)
    if not args.dry_run:
        runner.RESULT_ROOT = roots[0]
        runner.write_summary()
        print(f"Updated summary: {roots[0].parent / 'summary.xlsx'}", flush=True)
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except PermissionError as exc:
        print(str(exc), file=sys.stderr)
        raise SystemExit(1)
