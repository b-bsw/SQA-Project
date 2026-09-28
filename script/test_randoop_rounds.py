import csv
import json
import tempfile
import unittest
from pathlib import Path
from types import SimpleNamespace
from unittest.mock import patch
import sys

import randoop_rounds as rounds
import run_randoop_parallel as parallel
import generate_randoop_tests as generator

sys.path.insert(0, str(Path(__file__).resolve().parents[1] /
                      "Feedback-Directed Random Test Generation" / "Code"))
import run_feedback_directed_tests as runner


class RoundTests(unittest.TestCase):
    def test_both_round_reports_include_targets_without_test_code_as_fail(self):
        for number in (1, 2):
            with self.subTest(round=number), tempfile.TemporaryDirectory() as temporary:
                workspace = Path(temporary)
                root = workspace / "Feedback-Directed Random Test Generation"
                state_root, test_root, result_root = rounds.round_paths(root, number)
                for name in ("Codec_1", "Codec_2", "Codec_3"):
                    (workspace / "Resoucre" / name).mkdir(parents=True)
                rounds.write_json(state_root / "config.json", {
                    "seed": 0 if number == 1 else 20260928, "time_limit": 60})
                rounds.write_json(state_root / "generation_state.json", {
                    "Codec_1": {"status": "FAILED", "seed": 0 if number == 1 else 20260928,
                                "time_limit": 60}})
                (test_root / "Codec_2_buggy").mkdir(parents=True)
                (test_root / "Codec_2_buggy" / "RegressionTest.java").write_text("class RegressionTest {}")
                rounds.write_json(result_root / "Codec_2" / "result.json", {
                    "project": "Codec", "bug_id": 2, "verdict": "NOT_REVEALING"})
                rounds.write_json(result_root / "Codec_3" / "result.json", {
                    "project": "Codec", "bug_id": 3, "verdict": "NOT_REVEALING"})
                saved_result = (result_root / "Codec_2" / "result.json").read_bytes()

                with patch.object(runner, "PROJECT_ROOT", root), \
                     patch.object(runner, "ACTIVE_ROUND", number), \
                     patch.object(runner, "GEN_STATE_FILE", state_root / "generation_state.json"), \
                     patch.object(runner, "STATE_DIR", state_root / "state"):
                    self.assertEqual(runner.update_global_reports(
                        result_root, rewrite_target_reports=False), 3)
                    self.assertEqual((result_root / "Codec_2" / "result.json").read_bytes(), saved_result)
                    with (result_root / "report.csv").open(newline="", encoding="utf-8") as stream:
                        rows = {int(row["bug_id"]): row for row in csv.DictReader(stream)}
                    self.assertEqual(rows[1]["verdict"], "FAIL")
                    self.assertEqual(rows[1]["tests"], "0")
                    self.assertEqual(rows[1]["seed"], str(0 if number == 1 else 20260928))
                    self.assertEqual(rows[2]["verdict"], "NOT_REVEALING")
                    self.assertEqual(rows[3]["verdict"], "FAIL")
                    self.assertEqual(rows[3]["buggy_result"], "NOT_RUN")
                    self.assertEqual((root / ("report_Round2.csv" if number == 2 else "report.csv")).read_bytes(),
                                     (result_root / "report.csv").read_bytes())

                    (test_root / "Codec_1_buggy").mkdir(parents=True)
                    (test_root / "Codec_1_buggy" / "RegressionTest.java").write_text("class RegressionTest {}")
                    self.assertEqual(runner.update_global_reports(
                        result_root, rewrite_target_reports=False), 2)

    def test_import_is_non_destructive_idempotent_and_round2_is_empty(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            legacy = root / "generation_state.json"
            rounds.write_json(legacy, {
                "Codec_1": {"status": "COMPLETED", "time_limit": 5, "timestamp": "2026-09-20"},
                "Codec_2": {"status": "COMPLETED", "source": "DISK_SYNC"},
            })
            rounds.write_json(root / "state" / "Codec.json", {
                "Codec_1": {"status": "COMPLETED", "time_limit": 60, "timestamp": "2026-09-21"}})
            original = legacy.read_bytes()
            first = rounds.prepare_round(root, 1, 0, 60)
            state = parallel.load_state(first / "generation_state.json")
            self.assertEqual(state["Codec_1"]["seed"], 0)
            self.assertEqual(state["Codec_1"]["time_limit"], 60)
            self.assertIsNone(state["Codec_2"]["seed"])
            self.assertEqual(legacy.read_bytes(), original)
            rounds.prepare_round(root, 1, 0, 60)
            self.assertEqual(parallel.load_state(first / "generation_state.json"), state)
            second = rounds.prepare_round(root, 2, 20260928, 60)
            self.assertEqual(parallel.load_state(second / "generation_state.json"), {})
            with self.assertRaises(ValueError):
                rounds.prepare_round(root, 2, 42, 60)
            with self.assertRaises(ValueError):
                rounds.prepare_round(root, 2, 20260928, 30)
            with self.assertRaises(ValueError):
                rounds.prepare_round(root, 2, 0, 60)

    def test_seed_is_passed_to_java_and_worker_paths_are_isolated(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            info = {"project_name": "Codec_1", "fqcns": ["org.example.Codec"],
                    "primary_package": "org.example"}
            with patch.object(generator, "collect_project_classpath_entries", return_value=[]):
                ok, command, _ = generator.run_randoop_for_project(
                    info, root / "randoop.jar", root / "classes", root / "out",
                    60, workspace_dir=root, dry_run=True, seed=20260928)
            self.assertTrue(ok)
            self.assertIn("--randomseed=20260928", command)
            args = SimpleNamespace(round=2, seed=20260928, time_limit=60,
                                   project_timeout=600, jvm_memory="3000m",
                                   data_dir=None, overwrite=False)
            state_root, _, _ = rounds.round_paths(root, 2)
            command = parallel.worker_command(root / "script" / "generate_randoop_tests.py",
                                               state_root, "Codec", args)
            self.assertIn(str(state_root / "state" / "Codec.json"), command)
            self.assertIn("20260928", command)
            self.assertTrue(command[command.index("--output-dir") + 1].endswith("TestCode_Round2"))

    def test_round2_collection_uses_state_and_preserves_round1_report(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            state_root, _, result_root = rounds.round_paths(root, 2)
            rounds.write_json(state_root / "generation_state.json", {
                "Codec_1": {"seed": 20260928, "time_limit": 60, "seed_source": "EXPLICIT"}})
            rounds.write_json(result_root / "Codec_1" / "result.json", {
                "project": "Codec", "bug_id": 1, "seed": 20260918, "budget": 5})
            original_report = root / "report.csv"
            original_report.write_text("round 1 original", encoding="utf-8")
            with patch.object(runner, "PROJECT_ROOT", root), \
                 patch.object(runner, "ACTIVE_ROUND", 2), \
                 patch.object(runner, "GEN_STATE_FILE", state_root / "generation_state.json"), \
                 patch.object(runner, "STATE_DIR", state_root / "state"):
                self.assertEqual(runner.update_global_reports(result_root), 1)
            self.assertEqual(original_report.read_text(), "round 1 original")
            report = parallel.load_state(result_root / "Codec_1" / "result.json")
            self.assertEqual(report["seed"], 20260928)
            self.assertEqual(report["round"], 2)
            self.assertEqual(report["previous_reported_seed"], 20260918)
            self.assertTrue((root / "report_Round2.csv").exists())
            report["generation_timestamp"] = "old-generation"
            rounds.write_json(result_root / "Codec_1" / "result.json", report)
            with patch.object(runner, "PROJECT_ROOT", root), \
                 patch.object(runner, "ACTIVE_ROUND", 2), \
                 patch.object(runner, "GEN_STATE_FILE", state_root / "generation_state.json"), \
                 patch.object(runner, "STATE_DIR", state_root / "state"):
                self.assertEqual(runner.update_global_reports(result_root), 0)
            self.assertEqual(original_report.read_text(), "round 1 original")

    def test_round_status_does_not_count_unknown_or_wrong_budget_as_reusable(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            resources = root / "resources"
            for bug in (1, 2, 3):
                (resources / f"Codec_{bug}").mkdir(parents=True)
            rounds.write_json(root / "config.json", {"seed": 0, "time_limit": 60})
            rounds.write_json(root / "generation_state.json", {
                "Codec_1": {"status": "COMPLETED", "seed": 0, "time_limit": 60},
                "Codec_2": {"status": "COMPLETED", "seed": 0, "time_limit": 5},
                "Codec_3": {"status": "COMPLETED", "seed": None, "time_limit": 60}})
            self.assertEqual(parallel.group_status(root, resources, "Codec"), (1, 0, 2))


if __name__ == "__main__":
    unittest.main()
