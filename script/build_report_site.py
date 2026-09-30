#!/usr/bin/env python3
"""Refresh the embedded CSV snapshot in the root report website."""

import csv
import json
import re
from collections import Counter, defaultdict
from datetime import datetime
from pathlib import Path
from zoneinfo import ZoneInfo


ROOT = Path(__file__).resolve().parents[1]
PAGE = ROOT / "index.html"
SOURCES = [
    ("deepseek", "DeepSeek Flash V4", [
        ("Round 1", "Deepseek-flash-v4/Result/report.csv"),
        ("Round 2", "Deepseek-flash-v4/Result2/report.csv"),
    ]),
    ("gemini", "Gemini 3.8 Flash", [
        ("Round 1", "Gemini-3.8-flash/report.csv"),
    ]),
    ("randoop", "Feedback-directed random", [
        ("Round 1", "Feedback-Directed Random Test Generation/report.csv"),
        ("Round 2", "Feedback-Directed Random Test Generation/report_Round2.csv"),
    ]),
    ("ga", "Genetic Algorithm", [
        ("Round 1", "GeneticAlgorithm/Result_Round1/report.csv"),
        ("Round 2", "GeneticAlgorithm/Result_Round2/report.csv"),
    ]),
]
VERDICTS = ("REVEALING", "NOT_REVEALING", "INCONCLUSIVE", "NOT_AVAILABLE", "FAIL")


def to_number(value):
    try:
        return float(value) if value not in (None, "") else None
    except ValueError:
        return None


def summarize(rows):
    verdicts = Counter(row["verdict"] for row in rows)
    line = [value for row in rows if (value := to_number(row.get("line_cov"))) is not None]
    branch = [value for row in rows if (value := to_number(row.get("branch_cov"))) is not None]
    tests = [value for row in rows if (value := to_number(row.get("tests"))) is not None]
    return {
        "results": len(rows),
        "verdicts": {key: verdicts[key] for key in VERDICTS},
        "lineCoverage": sum(line) / len(line) if line else None,
        "branchCoverage": sum(branch) / len(branch) if branch else None,
        "coverageRecords": len(line),
        "branchCoverageRecords": len(branch),
        "tests": int(sum(tests)),
    }


def by_project(rows):
    groups = defaultdict(list)
    for row in rows:
        groups[row["project"]].append(row)
    return {name: summarize(group) for name, group in sorted(groups.items())}


def build_snapshot():
    methods = []
    for method_id, name, sources in SOURCES:
        combined = []
        rounds = []
        for round_name, source in sources:
            with (ROOT / source).open(newline="", encoding="utf-8-sig") as stream:
                rows = list(csv.DictReader(stream))
            combined.extend(rows)
            rounds.append({
                "name": round_name,
                "source": source,
                "summary": summarize(rows),
                "projects": by_project(rows),
            })
        methods.append({
            "id": method_id,
            "name": name,
            "summary": summarize(combined),
            "projects": by_project(combined),
            "rounds": rounds,
        })
    return {
        "generatedAt": datetime.now(ZoneInfo("Asia/Bangkok")).strftime("%d %b %Y · %H:%M ICT"),
        "methods": methods,
    }


def main():
    page = PAGE.read_text(encoding="utf-8")
    snapshot = build_snapshot()
    data = json.dumps(snapshot, ensure_ascii=False, separators=(",", ":"))
    pattern = r"/\* REPORT_DATA_START \*/.*?/\* REPORT_DATA_END \*/"
    replacement = f"/* REPORT_DATA_START */\n{data}\n/* REPORT_DATA_END */"
    updated, count = re.subn(pattern, lambda _: replacement, page, count=1, flags=re.DOTALL)
    if count != 1:
        raise SystemExit("Could not find report data markers in index.html")
    PAGE.write_text(updated, encoding="utf-8")
    print(f"Updated {PAGE.relative_to(ROOT)} from {sum(m['summary']['results'] for m in snapshot['methods']):,} result rows")


if __name__ == "__main__":
    main()
