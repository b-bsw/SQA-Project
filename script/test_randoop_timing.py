import io
import json
import tempfile
import unittest
import sys
from contextlib import redirect_stdout
from pathlib import Path
from unittest.mock import patch

import generate_randoop_tests as generator
import randoop_timing as timing
import run_randoop_parallel as parallel

sys.path.insert(0, str(Path(__file__).resolve().parent / "Randoop"))
import round_runner
sys.path.insert(0, str(Path(__file__).resolve().parents[1] /
                      "Feedback-Directed Random Test Generation" / "Code"))
import run_feedback_directed_tests as result_runner


class ScriptTimingTests(unittest.TestCase):
    def test_timing_is_in_state_and_resume_and_merge_preserve_it(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            state_path = root / "generation_state.json"
            project = {"status": "COMPLETED", "seed": 0, "time_limit": 60,
                       "timestamp": "2026-09-28T01:00:00+00:00"}
            state_path.write_text(json.dumps({"Codec_1": project}), encoding="utf-8")
            summary = {"log_dir": root / "script_runs", "state_file": str(state_path)}
            with patch.object(timing.time, "perf_counter", side_effect=[0.0, 58.9]), \
                 redirect_stdout(io.StringIO()):
                with timing.track_script_run(summary):
                    timing.start_runtime_in_state(summary)
                    running = json.loads(state_path.read_text(encoding="utf-8"))["_script_runs"]["latest"]
                    self.assertEqual(running["status"], "RUNNING")
                    self.assertIsNone(running["total_duration_seconds"])
            state = json.loads(state_path.read_text(encoding="utf-8"))
            self.assertEqual(state["Codec_1"], project)
            self.assertEqual(state["_script_runs"]["latest"]["total_duration_seconds"], 58.9)
            self.assertEqual(len(state["_script_runs"]["history"]), 1)
            manager = generator.MemoryStateManager(state_path)
            self.assertTrue(manager.is_completed("Codec_1"))
            parallel.seed_group_states(root, ["Codec"])
            self.assertNotIn("_script_runs", parallel.load_state(root / "state" / "Codec.json"))
            shard = root / "state" / "Codec.json"
            records = parallel.load_state(shard)
            records["Codec_2"] = {"status": "FAILED", "timestamp": "2026-09-28T02:00:00+00:00"}
            shard.write_text(json.dumps(records), encoding="utf-8")
            parallel.sync_global_state(root, ["Codec"])
            combined = parallel.load_state(state_path)
            self.assertEqual(combined["_script_runs"], state["_script_runs"])
            self.assertEqual(combined["Codec_2"]["status"], "FAILED")

    def test_round_entrypoints_log_each_phase_once_with_correct_round(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            log_dir = root / "Feedback-Directed Random Test Generation" / "rounds" / "Round2" / "script_runs"
            def fake_generation(argv, summary):
                self.assertEqual(argv[:2], ["--round", "2"])
                summary["log_dir"] = log_dir
                return 0
            output = io.StringIO()
            with patch.object(round_runner, "WORKSPACE", root), \
                 patch.object(parallel, "_main", side_effect=fake_generation), \
                 patch.object(result_runner, "main", return_value=0) as result_call, \
                 redirect_stdout(output):
                self.assertEqual(round_runner.run_round(2, "generate", ["--workers", "2"]), 0)
                self.assertEqual(round_runner.run_round(2, "results", ["--collect-only"]), 0)
                result_call.assert_called_once_with(["--round", "2", "--collect-only"])
            self.assertEqual(output.getvalue().count("เวลารวมของสคริปต์:"), 2)
            records = [json.loads(path.read_text(encoding="utf-8")) for path in log_dir.glob("*.json")]
            self.assertEqual({record["phase"] for record in records}, {"generate", "results"})
            self.assertTrue(all(record["round"] == 2 for record in records))

    def test_total_includes_preparation_generation_and_cleanup(self):
        with tempfile.TemporaryDirectory() as temporary:
            now = [100.0]
            def fake_work(summary):
                summary.update(log_dir=Path(temporary) / "script_runs", script="generate_randoop_tests")
                now[0] += 40.0  # Source scan, checkout and compilation.
                now[0] += 13.9  # Java/Randoop subprocess.
                now[0] += 5.0   # Publication, cleanup and state writes.
            output = io.StringIO()
            with patch.object(generator, "_main", side_effect=fake_work), \
                 patch.object(timing.time, "perf_counter", side_effect=lambda: now[0]), \
                 redirect_stdout(output):
                generator.main()
            logs = list((Path(temporary) / "script_runs").glob("*.json"))
            self.assertEqual(len(logs), 1)
            record = json.loads(logs[0].read_text(encoding="utf-8"))
            self.assertEqual(record["total_duration_seconds"], 58.9)
            self.assertEqual(record["status"], "COMPLETED")
            self.assertIn("58.900s", output.getvalue())

    def test_interrupt_keeps_elapsed_time_and_propagates(self):
        with tempfile.TemporaryDirectory() as temporary:
            summary = {"log_dir": Path(temporary)}
            with patch.object(timing.time, "perf_counter", side_effect=[10.0, 25.0]), \
                 redirect_stdout(io.StringIO()):
                with self.assertRaises(KeyboardInterrupt):
                    with timing.track_script_run(summary):
                        raise KeyboardInterrupt
            record = json.loads(next(Path(temporary).glob("*.json")).read_text(encoding="utf-8"))
            self.assertEqual(record["total_duration_seconds"], 15.0)
            self.assertEqual(record["status"], "INTERRUPTED")


if __name__ == "__main__":
    unittest.main()
