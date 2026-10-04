#!/usr/bin/env python3
"""Refresh the embedded CSV snapshot in the root report website."""

import csv
import argparse
import json
import re
import shutil
from collections import Counter, defaultdict
from datetime import datetime
from pathlib import Path
from zoneinfo import ZoneInfo
from summary.metrics import load_records, metric_summary, intersection, evidence, classify


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
        ("Round 1", "GeneticAlgorithm/Result_v2_Round1/report.csv"),
        ("Round 2", "GeneticAlgorithm/Result_v2_Round2/report.csv"),
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
    records = []
    for row in rows:
        records.append({'metrics':row.get('coverageMetrics') or {metric:classify(evidence(row),metric) for metric in ('line','condition')},'details':row})
    line = metric_summary(records,'line')
    branch = metric_summary(records,'condition')
    tests = [value for row in rows if (value := to_number(row.get("tests"))) is not None]
    return {
        "results": len(rows),
        "verdicts": {key: verdicts[key] for key in VERDICTS},
        "lineCoverage": line['recordedOnly'],
        "branchCoverage": branch['recordedOnly'],
        "lineCoverageAllResults": line['allResults'],
        "branchCoverageAllResults": branch['allResults'],
        "coverageRecords": line['recorded'],
        "branchCoverageRecords": branch['recorded'],
        "metrics": {'line':line,'condition':branch},
        "tests": int(sum(tests)),
    }


def by_project(rows):
    groups = defaultdict(list)
    for row in rows:
        groups[row["project"]].append(row)
    return {name: summarize(group) for name, group in sorted(groups.items())}


def build_snapshot():
    methods = []
    all_records = {}
    for method_id, name, sources in SOURCES:
        combined = []
        rounds = []
        all_records[method_id] = load_records(method_id)
        classified = {(r['round'],r['target']):r['metrics'] for r in all_records[method_id]}
        bug_verdicts = {(r['round'],r['target']):r['verdict'] for r in all_records[method_id]}
        for round_name, source in sources:
            with (ROOT / source).open(newline="", encoding="utf-8-sig") as stream:
                rows = list(csv.DictReader(stream))
            rows = [row for row in rows if (round_name.replace(' ',''),f"{row['project']}_{int(row['bug_id'])}") in classified]
            for row in rows:
                row['coverageMetrics'] = classified[(round_name.replace(' ',''),f"{row['project']}_{int(row['bug_id'])}")]
                if bug_verdicts:
                    row['verdict']=bug_verdicts[(round_name.replace(' ',''),f"{row['project']}_{int(row['bug_id'])}")]
                if method_id=='ga':
                    row['line_cov']=row.get('line_coverage')
                    row['branch_cov']=row.get('condition_coverage')
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
        "intersection": {scope:intersection(all_records,None if scope=='All rounds' else scope) for scope in ('All rounds','Round1','Round2')},
    }


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--site-dir", type=Path, help="Package the HTML and linked CSV files for hosting")
    args = parser.parse_args()
    page = PAGE.read_text(encoding="utf-8")
    snapshot = build_snapshot()
    data = json.dumps(snapshot, ensure_ascii=False, separators=(",", ":"))
    pattern = r"/\* REPORT_DATA_START \*/.*?/\* REPORT_DATA_END \*/"
    replacement = f"/* REPORT_DATA_START */\n{data}\n/* REPORT_DATA_END */"
    updated, count = re.subn(pattern, lambda _: replacement, page, count=1, flags=re.DOTALL)
    if count != 1:
        raise SystemExit("Could not find report data markers in index.html")
    PAGE.write_text(updated, encoding="utf-8")
    if args.site_dir:
        site_dir = args.site_dir.resolve()
        site_dir.mkdir(parents=True, exist_ok=True)
        shutil.copy2(PAGE, site_dir / "index.html")
        shutil.copy2(ROOT / "README.md", site_dir / "README.md")
        for _, _, sources in SOURCES:
            for _, source in sources:
                destination = site_dir / source
                destination.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(ROOT / source, destination)
    print(f"Updated {PAGE.relative_to(ROOT)} from {sum(m['summary']['results'] for m in snapshot['methods']):,} result rows")


if __name__ == "__main__":
    main()
