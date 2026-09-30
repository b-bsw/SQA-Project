"""Focused checks for measuring saved GA suites with Defects4J."""

import importlib.util
import shutil
import unittest
import uuid
from contextlib import contextmanager
from pathlib import Path
from unittest.mock import patch


RUNNER_PATH = (Path(__file__).resolve().parents[1] / "GeneticAlgorithm" /
               "Code" / "run_ga_results_v2.py")
SPEC = importlib.util.spec_from_file_location("run_ga_results_v2", RUNNER_PATH)
runner = importlib.util.module_from_spec(SPEC)
SPEC.loader.exec_module(runner)


@contextmanager
def workspace():
    base = Path(__file__).resolve().parent / ".ga-v2-test-work"
    root = base / uuid.uuid4().hex
    root.mkdir(parents=True)
    try:
        yield root
    finally:
        if root.parent == base:
            shutil.rmtree(root)
        if base.exists() and not any(base.iterdir()):
            base.rmdir()


class SavedGACoverageTest(unittest.TestCase):
    def test_existing_tests_produce_defects4j_condition_coverage(self):
        with workspace() as root, patch.object(
                runner.tempfile, "TemporaryDirectory", side_effect=lambda **_: workspace()):
            test_file = root / "TestCode" / "Time_27" / "org" / "example" / "Sample_ESTest.java"
            test_file.parent.mkdir(parents=True)
            test_file.write_text("class Sample_ESTest {}", encoding="utf-8")
            commands = []

            def fake_run(command, log):
                commands.append(command[1])
                if command[1] == "coverage":
                    workspace = Path(command[command.index("-w") + 1])
                    workspace.mkdir(parents=True, exist_ok=True)
                    (workspace / "summary.csv").write_text(
                        "LinesTotal,LinesCovered,ConditionsTotal,ConditionsCovered\n"
                        "670,235,446,88\n", encoding="utf-8"
                    )
                    self.assertTrue(Path(command[command.index("-s") + 1]).is_file())
                return 0

            with patch.object(runner, "run_command", side_effect=fake_run):
                result = runner.measure_target("Time", 27, root / "TestCode",
                                               root / "Result_v2", "defects4j")
            self.assertEqual(commands, ["checkout", "compile", "coverage"])
            self.assertEqual(result["condition_coverage"], 19.73)
            self.assertEqual(result["conditions_total"], 446)
            self.assertEqual(result["coverage_status"], "OK")
            self.assertTrue((root / "Result_v2" / "Time_27" / "result.csv").is_file())

    def test_failed_coverage_leaves_metrics_missing(self):
        with workspace() as root, patch.object(
                runner.tempfile, "TemporaryDirectory", side_effect=lambda **_: workspace()):
            test_file = root / "TestCode" / "Time_27" / "Sample_ESTest.java"
            test_file.parent.mkdir(parents=True)
            test_file.write_text("class Sample_ESTest {}", encoding="utf-8")
            with patch.object(runner, "run_command", side_effect=[0, 0, 1]):
                result = runner.measure_target("Time", 27, root / "TestCode",
                                               root / "Result_v2", "defects4j")
            self.assertEqual(result["coverage_status"], "NOT_AVAILABLE")
            self.assertIsNone(result["condition_coverage"])


if __name__ == "__main__":
    unittest.main()
