"""Regression checks for complete DeepSeek coverage reports."""
import csv
import importlib.util
import json
from pathlib import Path
import shutil
from contextlib import contextmanager
from uuid import uuid4
import unittest
from unittest.mock import patch
from zipfile import ZipFile
import xml.etree.ElementTree as ET

RUNNER = Path(__file__).resolve().parents[1] / "Deepseek-flash-v4/Code/run_deepseek_tests.py"
SPEC = importlib.util.spec_from_file_location("coverage_runner", RUNNER)
runner = importlib.util.module_from_spec(SPEC)
SPEC.loader.exec_module(runner)
LOG = """Lines total: 355
Lines covered: 232
Conditions total: 178
Conditions covered: 91
Line coverage: 65.4%
Condition coverage: 51.1%
[exit 0]
"""


@contextmanager
def test_workspace():
    root = RUNNER.parent / f"_coverage_test_{uuid4().hex}"
    root.mkdir()
    try:
        yield root
    finally:
        shutil.rmtree(root)


class CoverageReportsTests(unittest.TestCase):
    def test_collector_recovers_all_counts_and_preserves_recorded_values(self):
        with test_workspace() as tmp:
            root = Path(tmp) / "Result"
            target = root / "Time_8"
            (target / "logs").mkdir(parents=True)
            (target / "logs/buggy_coverage.log").write_text(LOG)
            report = {"project": "Time", "bug_id": 8, "verdict": "NOT_REVEALING",
                      "buggy": {"coverage_status": "PASS", "line_cov": 65.35}}
            (target / "result.json").write_text(json.dumps(report))
            runner.collect_reports(root, update_summary=False)
            with (root / "report.csv").open(newline="") as handle:
                row = next(csv.DictReader(handle))
            self.assertEqual([row[k] for k in runner.FIELDS[8:14]],
                             ["355", "232", "65.35", "178", "91", "51.12"])
            report["buggy"]["covered_lines"] = 123
            runner.recover_coverage(report, target)
            self.assertEqual(report["buggy"]["covered_lines"], 123)

    def test_fallback_and_failed_or_zero_condition_coverage(self):
        with test_workspace() as tmp:
            root = Path(tmp)
            log = root / "coverage.log"
            log.write_text(LOG)
            self.assertEqual(runner.read_coverage(root, log)["covered_branches"], 91)
            log.write_text(LOG.replace("[exit 0]", "[exit 1]"))
            self.assertEqual(runner.read_coverage(root, log), {})
            log.write_text(LOG.replace("Conditions total: 178", "Conditions total: 0")
                           .replace("Conditions covered: 91", "Conditions covered: 0"))
            self.assertIsNone(runner.read_coverage(root, log)["branch_cov"])

    def test_workbook_data_dashboard_formulas_and_table_include_all_metrics(self):
        with test_workspace() as tmp:
            root = Path(tmp)
            target = root / "Result/Time_8"
            target.mkdir(parents=True)
            coverage = runner.coverage_counts(355, 232, 178, 91)
            (target / "result.json").write_text(json.dumps({
                "project": "Time", "bug_id": 8, "buggy": coverage,
                "verdict": "NOT_REVEALING"}))
            with patch.object(runner, "RESULT_ROOT", root / "Result"):
                runner.write_summary()
            with ZipFile(root / "summary.xlsx") as archive:
                data = ET.fromstring(archive.read("xl/worksheets/sheet2.xml"))
                dashboard = ET.fromstring(archive.read("xl/worksheets/sheet1.xml"))
                table = ET.fromstring(archive.read("xl/tables/table1.xml"))
            cells = {c.get("r"): c for c in data.iter(runner.xlsx_tag("c"))}
            for address, value in {"J2": 355, "K2": 232, "L2": 178, "M2": 91, "N2": .5112}.items():
                self.assertAlmostEqual(float(cells[address].find(runner.xlsx_tag("v")).text), value)
            self.assertEqual(table.get("ref"), "A1:N2")
            self.assertEqual(table.find(runner.xlsx_tag("tableColumns")).get("count"), "14")
            cells = {c.get("r"): c for c in dashboard.iter(runner.xlsx_tag("c"))}
            self.assertAlmostEqual(float(cells["E8"].find(runner.xlsx_tag("v")).text), .5112)
            self.assertEqual(cells["E8"].find(runner.xlsx_tag("f")).text, "'Coverage'!J8")
            self.assertEqual(cells["B8"].find(f"{runner.xlsx_tag('is')}/{runner.xlsx_tag('t')}").text,
                             "Average condition coverage")
            self.assertEqual(cells["E8"].get("s"), cells["E7"].get("s"))
            self.assertIn("C9/C6", cells["C10"].find(runner.xlsx_tag("f")).text)
            self.assertEqual(float(cells["C14"].find(runner.xlsx_tag("v")).text), 355)
            self.assertEqual(cells["D14"].get("t"), "str")  # Missing round stays blank.


if __name__ == "__main__":
    unittest.main()

