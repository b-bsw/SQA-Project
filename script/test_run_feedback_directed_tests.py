#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Unit tests for the Feedback-Directed Random Test Generation result runner."""

import csv
import json
import os
import shutil
import sys
import tarfile
import tempfile
import unittest
from unittest.mock import patch
from pathlib import Path

# Import the runner module
CODE_DIR = Path(__file__).resolve().parents[1] / "Feedback-Directed Random Test Generation" / "Code"
sys.path.insert(0, str(CODE_DIR))

import run_feedback_directed_tests as runner


class TestFeedbackDirectedRunner(unittest.TestCase):
    def test_checkout_and_compile_use_timeout(self):
        checkout_calls = []
        def timed_out(command, log, **kwargs):
            checkout_calls.append((command, kwargs.get("timeout")))
            return runner.TIMEOUT_RC
        with patch.object(runner, "run_command", side_effect=timed_out):
            result = runner.run_revision("defects4j", "Codec", 1, "b",
                                         self.temp_dir / "tests.tar.bz2", self.temp_dir,
                                         self.temp_dir, False, 7)
        self.assertEqual(result["status"], "TIMEOUT")
        self.assertEqual(checkout_calls[0][1], 7)

        def compile_timeout(command, log, **kwargs):
            return 0 if "checkout" in command else runner.TIMEOUT_RC
        with patch.object(runner, "run_command", side_effect=compile_timeout) as invoked:
            result = runner.run_revision("defects4j", "Codec", 1, "b",
                                         self.temp_dir / "tests.tar.bz2", self.temp_dir,
                                         self.temp_dir, False, 7)
        self.assertEqual(result["status"], "TIMEOUT")
        self.assertEqual(invoked.call_args.kwargs["timeout"], 7)


    def setUp(self):
        self.temp_dir = Path(tempfile.mkdtemp(prefix="test_fdr_"))

    def tearDown(self):
        shutil.rmtree(self.temp_dir, ignore_errors=True)

    def test_schema_matches_format_without_round(self):
        """Ensure CSV fields match report header without round (19 columns)."""
        expected_fields = [
            "project", "bug_id", "seed", "budget", "tests",
            "coverage", "line_cov", "branch_cov", "total_goals", "covered_goals",
            "lines", "covered_lines", "total_branches", "covered_branches",
            "buggy_result", "buggy_fails", "fixed_result", "fixed_fails", "verdict"
        ]
        self.assertEqual(runner.CSV_FIELDS, expected_fields)
        self.assertEqual(len(runner.CSV_FIELDS), 19)

    def test_format_csv_row(self):
        """Test conversion of report dictionary to CSV row (no round)."""
        sample_data = {
            "project": "Chart",
            "bug_id": 1,
            "seed": 20260918,
            "budget": 60,
            "tests": 4,
            "coverage": 9.46,
            "line_cov": 9.06,
            "branch_cov": 9.85,
            "total_goals": 848,
            "covered_goals": 79,
            "lines": 66,
            "covered_lines": 52,
            "total_branches": 242,
            "covered_branches": 24,
            "buggy_result": "PASS",
            "buggy_fails": 0,
            "fixed_result": "PASS",
            "fixed_fails": 0,
            "verdict": "NOT_REVEALING"
        }
        row = runner.format_csv_row(sample_data)
        self.assertEqual(len(row), 19)
        self.assertEqual(row[0], "Chart")
        self.assertEqual(row[1], 1)
        self.assertEqual(row[4], 4)
        self.assertEqual(row[5], 9.46)
        self.assertEqual(row[18], "NOT_REVEALING")

    def test_evaluate_verdict(self):
        """Verify standard verdict classification."""
        self.assertEqual(runner.evaluate_verdict("FAIL", "PASS"), "REVEALING")
        self.assertEqual(runner.evaluate_verdict("PASS", "PASS"), "NOT_REVEALING")
        self.assertEqual(runner.evaluate_verdict("FAIL", "FAIL"), "INCONCLUSIVE")
        self.assertEqual(runner.evaluate_verdict("PASS", "FAIL"), "INCONCLUSIVE")
        self.assertEqual(runner.evaluate_verdict("NOT_RUN", "PASS"), "NOT_AVAILABLE")
        self.assertEqual(runner.evaluate_verdict("FAIL", "NOT_RUN"), "NOT_AVAILABLE")
        self.assertEqual(runner.evaluate_verdict("NOT_RUN", "NOT_RUN"), "NOT_AVAILABLE")

    def test_make_archive_with_packages(self):
        """Ensure make_archive accurately places Java files into package directories."""
        source_dir = self.temp_dir / "Chart_1_buggy"
        source_dir.mkdir()

        # Create a java test file with package declaration
        java_code = (
            "package org.jfree.chart.renderer.category;\n\n"
            "import org.junit.Test;\n\n"
            "public class RegressionTest0 {\n"
            "    @Test\n"
            "    public void test1() {}\n"
            "    @Test\n"
            "    public void test2() {}\n"
            "}\n"
        )
        test_file = source_dir / "RegressionTest0.java"
        test_file.write_text(java_code, encoding="utf-8")

        archive_path = self.temp_dir / "test.tar.bz2"
        tests_count, files_count = runner.make_archive(source_dir, archive_path)

        self.assertEqual(tests_count, 2)
        self.assertEqual(files_count, 1)

        # Inspect archive contents
        with tarfile.open(archive_path, "r:bz2") as archive:
            names = archive.getnames()
            self.assertIn("org/jfree/chart/renderer/category/RegressionTest0.java", names)

    def test_discover_targets(self):
        """Test target directory scanning."""
        test_root = self.temp_dir / "TestCode"
        test_root.mkdir()

        target1 = test_root / "Chart_1_buggy"
        target1.mkdir()
        (target1 / "Test.java").write_text("package test; import org.junit.Test; public class Test {@Test public void t(){}}")

        target2 = test_root / "Cli_10_buggy"
        target2.mkdir()
        (target2 / "Test.java").write_text("package test; import org.junit.Test; public class Test {@Test public void t(){}}")

        ignored = test_root / "Invalid_Folder"
        ignored.mkdir()

        empty_target = test_root / "Math_5_buggy"
        empty_target.mkdir()

        targets = runner.discover_targets(test_root)
        self.assertIn("Chart_1", targets)
        self.assertIn("Cli_10", targets)
        self.assertNotIn("Invalid_Folder", targets)
        self.assertNotIn("Math_5", targets)

    def test_collect_existing_reports(self):
        """Test aggregation of result.csv files into global list (no round)."""
        result_dir = self.temp_dir / "Result"
        result_dir.mkdir()

        target_dir = result_dir / "Chart_1"
        target_dir.mkdir()

        sample_csv = (
            '"project","bug_id","seed","budget","tests","coverage","line_cov","branch_cov",'
            '"total_goals","covered_goals","lines","covered_lines","total_branches","covered_branches",'
            '"buggy_result","buggy_fails","fixed_result","fixed_fails","verdict"\n'
            '"Chart",1,20260918,60,4,9.46,9.06,9.85,848,79,66,52,242,24,"PASS",0,"PASS",0,"NOT_REVEALING"\n'
        )
        (target_dir / "result.csv").write_text(sample_csv, encoding="utf-8")

        reports = runner.collect_existing_reports(result_dir)
        self.assertEqual(len(reports), 1)
        self.assertEqual(reports[0]["project"], "Chart")
        self.assertEqual(reports[0]["bug_id"], 1)
        self.assertEqual(reports[0]["verdict"], "NOT_REVEALING")


if __name__ == "__main__":
    unittest.main()
