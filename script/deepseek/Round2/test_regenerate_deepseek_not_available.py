"""Offline checks for dependency prompts and separate TestCode2 publication."""

import json
import io
import shutil
import subprocess
import sys
import unittest
from pathlib import Path
from types import SimpleNamespace
from unittest.mock import Mock, patch
from uuid import uuid4

sys.path.insert(0, str(Path(__file__).resolve().parent))
sys.path.insert(0, str(Path(__file__).resolve().parents[1] / "Round1"))
import generate_deepseek_tests as gen
import migrate_deepseek_testcode2 as layout
import regenerate_deepseek_not_available as regen


class RegenerationTests(unittest.TestCase):
    def test_project_selects_family_for_status_and_dry_run(self):
        manifest = {"targets": [
            {"target": "Closure_1", "sources": ["A.java"]},
            {"target": "JacksonDatabind_1", "sources": ["B.java"]},
            {"target": "JacksonDatabind_2", "sources": ["C.java"]},
        ]}
        with patch.object(regen, "manifest_for_run", return_value=manifest), \
             patch.object(regen, "REGEN", self.root / "work"), \
             patch.object(regen, "RESULT", self.root / "results"), \
             patch.object(gen, "get_all_api_keys") as keys, \
             patch("sys.stdout", new_callable=io.StringIO) as output:
            self.assertEqual(regen.main(["--status", "--project", "jacksondatabind",
                                         "--limit", "1"]), 0)
            self.assertIn("Cohort status: 2 targets", output.getvalue())
            self.assertIn("JacksonDatabind_1: PENDING", output.getvalue())
            self.assertNotIn("JacksonDatabind_2: PENDING", output.getvalue())
            output.seek(0)
            output.truncate()
            self.assertEqual(regen.main(["--project", "JacksonDatabind"]), 0)
            self.assertIn("selected 2", output.getvalue())
            self.assertNotIn("Closure_1", output.getvalue())
        keys.assert_not_called()

    def test_project_typo_suggests_available_family(self):
        manifest = {"targets": [{"target": "JacksonDatabind_1", "sources": []}]}
        with patch.object(regen, "manifest_for_run", return_value=manifest), \
             patch("sys.stderr", new_callable=io.StringIO) as error, \
             self.assertRaises(SystemExit):
            regen.main(["--status", "--project", "JacksonDatatbind"])
        self.assertIn("Did you mean JacksonDatabind?", error.getvalue())

    def test_partitions_are_stable_and_disjoint(self):
        manifest = {"targets": [{"target": f"Sample_{i}"} for i in range(5)]}
        front = regen.partition_manifest(manifest, "front")["targets"]
        back = regen.partition_manifest(manifest, "back")["targets"]
        self.assertEqual([entry["target"] for entry in front],
                         ["Sample_0", "Sample_1", "Sample_2"])
        self.assertEqual([entry["target"] for entry in back],
                         ["Sample_4", "Sample_3"])
        self.assertEqual({entry["target"] for entry in front + back},
                         {entry["target"] for entry in manifest["targets"]})

    def test_budget_updates_from_two_processes_are_not_lost(self):
        ledger = self.root / "shared-budget.json"
        worker = ("import sys; from pathlib import Path; "
                  "sys.path.insert(0, sys.argv[1]); "
                  "from generate_deepseek_tests import DailyBudget; "
                  "budget=DailyBudget(Path(sys.argv[2])); "
                  "[(lambda reservation: budget.settle(reservation, {'total_tokens': 7}))"
                  "(budget.reserve([{'content': 'x'}], 1)) for _ in range(25)]")
        command = [sys.executable, "-c", worker, str(Path(__file__).parent), str(ledger)]
        first = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        second = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        for process in (first, second):
            stdout, stderr = process.communicate(timeout=30)
            self.assertEqual(process.returncode, 0, (stdout + stderr).decode(errors="replace"))
        self.assertEqual(gen.DailyBudget(ledger).get_today_used(), 350)

    def test_status_counts_progress_without_side_effects(self):
        manifest = {"targets": [
            {"target": f"Sample_{i}", "sources": ["Widget.java"]}
            for i in range(1, 6)]}
        work = self.root / "work"
        results = self.root / "results"
        (work / "status").mkdir(parents=True)
        (work / "generator_state").mkdir()
        for i, status in enumerate(["COMMITTED", "COMMITTED", "FAILED", "PAUSED"], 1):
            (work / "status" / f"Sample_{i}.json").write_text(
                json.dumps({"status": status,
                            "reason": "Incomplete API stream" if status == "FAILED" else None}),
                encoding="utf-8")
        (work / "generator_state" / "Sample_1.json").write_text(json.dumps({
            "Sample_1/Widget.java": {"status": "GENERATED"},
            "Unrelated/Other.java": {"status": "GENERATED"}}), encoding="utf-8")
        (results / "Sample_1").mkdir(parents=True)
        (results / "Sample_1" / "result.json").write_text(
            '{"verdict":"NOT_AVAILABLE"}', encoding="utf-8")
        before = {p.relative_to(self.root): p.read_bytes()
                  for p in self.root.rglob("*") if p.is_file()}
        with patch.object(regen, "REGEN", work), patch.object(regen, "RESULT", results), \
             patch.object(regen, "manifest_for_run", return_value=manifest) as load, \
             patch.object(gen, "get_all_api_keys") as keys, \
             patch.object(gen.requests, "post") as post, \
             patch.object(gen, "save_atomic_json") as save, \
             patch.object(regen, "verify_pending") as verify, \
             patch.object(regen.subprocess, "Popen") as process, \
             patch("sys.stdout", new_callable=io.StringIO) as output:
            self.assertEqual(regen.main(["--status"]), 0)
            summary = output.getvalue()
            self.assertIn("committed: 2/5 (40.0%); remaining: 3", summary)
            self.assertIn("FAILED: 1; PAUSED: 1; PENDING/other: 1", summary)
            self.assertIn("GENERATED: 1/5", summary)
            self.assertIn("reports: 1/2 committed targets; pending verification: 1", summary)
            self.assertIn("NOT_AVAILABLE=1", summary)
            self.assertIn("Remaining targets (3):", summary)
            self.assertIn("Sample_3 [FAILED]", summary)
            self.assertIn("Sample_4 [PAUSED]", summary)
            self.assertIn("Sample_5 [PENDING]", summary)
            self.assertNotIn("Sample_1 [COMMITTED]", summary)
            output.seek(0)
            output.truncate()
            self.assertEqual(regen.main(["--status", "--targets", "Sample_1", "Sample_3",
                                        "--limit", "1"]), 0)
            self.assertIn("committed: 1/2 (50.0%)", output.getvalue())
            self.assertIn("Remaining targets (1):", output.getvalue())
            self.assertIn("Sample_3 [FAILED]", output.getvalue())
            self.assertIn("Sample_1: COMMITTED", output.getvalue())
            self.assertNotIn("Sample_3: FAILED", output.getvalue())
            output.seek(0)
            output.truncate()
            self.assertEqual(regen.main(["--status", "--targets", "Sample_3"]), 0)
            self.assertIn("Sample_3: FAILED; generated files 0/1; Result2: not ready; "
                          "reason: Incomplete API stream", output.getvalue())
        for call in load.call_args_list:
            self.assertFalse(call.kwargs["write"])
        for mock in (keys, post, save, verify, process):
            mock.assert_not_called()
        after = {p.relative_to(self.root): p.read_bytes()
                 for p in self.root.rglob("*") if p.is_file()}
        self.assertEqual(before, after)

    def test_status_empty_cohort_and_conflicting_modes(self):
        with patch.object(regen, "manifest_for_run", return_value={"targets": []}), \
             patch("sys.stdout", new_callable=io.StringIO) as output:
            self.assertEqual(regen.main(["--status"]), 0)
            self.assertIn("committed: 0/0 (0.0%)", output.getvalue())
        for flags in [["--execute"], ["--verify-only"], ["--publish-ready"],
                      ["--preview-prompt", "Sample_1"]]:
            with self.subTest(flags=flags), patch("sys.stderr", new_callable=io.StringIO), \
                 patch.object(regen, "manifest_for_run") as load, \
                 self.assertRaises(SystemExit):
                regen.main(["--status", *flags])
            load.assert_not_called()

    def test_legacy_failure_status_does_not_claim_token_quota(self):
        work = self.root / "work"
        (work / "status").mkdir(parents=True)
        (work / "generator_state").mkdir()
        (work / "status" / "Sample_1.json").write_text(json.dumps({
            "status": "FAILED", "reason": "Not all source files yielded valid Java"}),
            encoding="utf-8")
        (work / "generator_state" / "Sample_1.json").write_text(json.dumps({
            "Sample_1/Widget.java": {"status": "LIMIT_REACHED",
                                     "finish_reason": "unknown",
                                     "content_char_count": 0,
                                     "note": "Output truncated or bracket unbalanced after retry"}}),
            encoding="utf-8")
        manifest = {"targets": [{"target": "Sample_1", "sources": ["Widget.java"]}]}
        with patch.object(regen, "REGEN", work), \
             patch.object(regen, "manifest_for_run", return_value=manifest), \
             patch("sys.stdout", new_callable=io.StringIO) as output:
            self.assertEqual(regen.main(["--status", "--targets", "Sample_1"]), 0)
        self.assertIn("no Java code or finish_reason recorded; original API error "
                      "was not saved by the older run", output.getvalue())
        self.assertNotIn("reason: Widget.java: Output truncated", output.getvalue())

    def test_execute_never_starts_verification(self):
        manifest = {"targets": [{"target": "Sample_1", "sources": ["Widget.java"]}]}
        for initial, result in [(None, "COMMITTED"), (None, "PAUSED"),
                                (None, "FAILED"), ("COMMITTED", None)]:
            with self.subTest(initial=initial, result=result):
                state = {"status": initial}

                def process(*args):
                    state["status"] = result
                    return result

                with patch.object(regen, "manifest_for_run", return_value=manifest), \
                     patch.object(regen, "read_json", side_effect=lambda *a: dict(state)), \
                     patch.object(gen, "get_all_api_keys", return_value=["dummy-key"]), \
                     patch.object(regen, "process_target", side_effect=process) as generate, \
                     patch.object(regen, "verify_pending") as verify, \
                     patch("sys.stdout", new_callable=io.StringIO) as output:
                    rc = regen.main(["--execute", "--workers", "1"])
                verify.assert_not_called()
                self.assertEqual(generate.call_count, 0 if initial else 1)
                self.assertEqual(rc, 0 if state["status"] == "COMMITTED" else 3)
                if result is not None:
                    self.assertIn(f"Sample_1: {result} (ใช้เวลา ", output.getvalue())

    def test_verify_only_does_not_generate_or_load_api_keys(self):
        manifest = {"targets": [{"target": "Sample_1", "sources": ["Widget.java"]}]}
        with patch.object(regen, "manifest_for_run", return_value=manifest), \
             patch.object(regen, "read_json", return_value={"status": "COMMITTED"}), \
             patch.object(gen, "get_all_api_keys") as keys, \
             patch.object(regen, "process_target") as generate, \
             patch.object(regen, "verify_pending", return_value=0) as verify:
            self.assertEqual(regen.main(["--verify-only"]), 0)
        keys.assert_not_called()
        generate.assert_not_called()
        verify.assert_called_once()

    def test_verification_honors_targets_and_limit(self):
        manifest = {"targets": [{"target": f"Sample_{i}"} for i in range(1, 4)]}
        args = SimpleNamespace(targets=["Sample_2", "Sample_3"], limit=1,
                               verify_workers=2, test_timeout=600)
        with patch.object(regen, "RESULT", self.root / "results"), \
             patch.object(regen, "read_json", return_value={"status": "COMMITTED"}), \
             patch.object(regen.subprocess, "call", return_value=0) as run:
            self.assertEqual(regen.verify_pending(manifest, args), 0)
        command = run.call_args.args[0]
        self.assertIn("Sample_2", command)
        self.assertNotIn("Sample_1", command)
        self.assertNotIn("Sample_3", command)

    def test_generator_forwards_request_settings(self):
        args = SimpleNamespace(budget_limit=1000000, max_tokens=16384, timeout=120,
                               env_file=None, thinking="enabled", reasoning_effort="low")
        with patch.object(regen, "REGEN", self.root / "work"), \
             patch.object(regen.subprocess, "Popen") as popen:
            popen.return_value.wait.return_value = 0
            self.assertEqual(regen.run_generator("Sample_1", 1, "dummy-key", args), 0)
        command = popen.call_args.args[0]
        for flag, value in [("--thinking", "enabled"), ("--reasoning-effort", "low"),
                            ("--max-tokens", "16384")]:
            self.assertEqual(command[command.index(flag) + 1], value)

    def test_incomplete_stream_reports_observed_reasoning_and_code(self):
        response = Mock(status_code=200)
        response.iter_lines.return_value = [
            b'data: {"choices":[{"delta":{"reasoning_content":"thinking"},"finish_reason":null}]}',
            b'data: [DONE]',
        ]
        with patch.object(gen.requests, "post", return_value=response), \
             patch.object(gen, "WaitingTicker"), \
             patch("sys.stdout", new_callable=io.StringIO):
            result = gen.call_single_api_stream("dummy-key", "prompt", max_retries=1)
        self.assertFalse(result["success"])
        self.assertIn("no finish_reason", result["error"])
        self.assertIn("reasoning 8 chars, code 0 chars", result["error"])
        self.assertEqual(result["reasoning_char_count"], 8)
        self.assertEqual(result["content_char_count"], 0)

    def test_key_rotation_keeps_api_failure_detail(self):
        manager = gen.KeyManager(["dummy-key"])
        failure = {"success": False, "error": "Incomplete API stream: no finish_reason",
                   "content": "", "reasoning_char_count": 4400}
        with patch.object(gen, "call_single_api_stream", return_value=failure):
            result = gen.call_deepseek_api_with_rotation(manager, "prompt")
        self.assertFalse(result["success"])
        self.assertFalse(result["all_keys_exhausted"])
        self.assertEqual(result["error"], failure["error"])
        self.assertEqual(result["reasoning_char_count"], 4400)

    def test_api_failure_is_not_mislabeled_token_limit(self):
        source_dir = self.root / "Resoucre" / "Sample_2"
        source_dir.mkdir(parents=True)
        (source_dir / "Widget.java").write_text(
            "package example; public class Widget {}", encoding="utf-8")
        template = self.root / "Deepseek-flash-v4" / "Promt" / "promt.md"
        template.parent.mkdir(parents=True)
        template.write_text("[full class source code ของ target class]", encoding="utf-8")
        state_file = self.root / "state.json"
        failure = {"success": False, "error": "Incomplete API stream: no finish_reason "
                   "(reasoning 4,445 chars, code 0 chars, elapsed 25.2s)",
                   "content": "", "finish_reason": "unknown"}
        with patch.object(gen, "__file__", str(self.root / "script/Round1/generate_deepseek_tests.py")), \
             patch.object(gen, "get_all_api_keys", return_value=["dummy-key"]), \
             patch.object(gen, "call_deepseek_api_with_rotation", return_value=failure), \
             patch("sys.stdout", new_callable=io.StringIO) as output:
            self.assertEqual(gen.main(["--project", "Sample_2", "--state-file", str(state_file),
                                       "--output-dir", str(self.root / "staging"),
                                       "--no-budget", "--delay", "0", "--junit", "junit4"]), 0)
        record = json.loads(state_file.read_text(encoding="utf-8"))["Sample_2/Widget.java"]
        self.assertEqual(record["status"], "FAILED")
        self.assertEqual(record["error"], failure["error"])
        self.assertIn(failure["error"], output.getvalue())
        self.assertNotIn("[LIMIT_REACHED]", output.getvalue())

    def test_wrapper_reports_source_failure_in_terminal_and_status(self):
        target = "Sample_2"
        work = self.root / "work"
        state_file = work / "generator_state" / f"{target}.json"
        state_file.parent.mkdir(parents=True)
        state_file.write_text(json.dumps({f"{target}/Widget.java": {
            "status": "FAILED", "error": "Incomplete API stream: no finish_reason"}}),
            encoding="utf-8")
        entry = {"target": target, "sources": ["Widget.java"]}
        with patch.object(regen, "REGEN", work), \
             patch.object(regen, "recovered_commit", return_value=False), \
             patch.object(regen, "run_generator", return_value=0):
            self.assertEqual(regen.process_target(entry, 1, "dummy-key", SimpleNamespace()), "FAILED")
        status = json.loads((work / "status" / f"{target}.json").read_text(encoding="utf-8"))
        self.assertEqual(status["reason"], "Widget.java: Incomplete API stream: no finish_reason")
        with patch.object(regen, "REGEN", work), \
             patch.object(regen, "manifest_for_run", return_value={"targets": [entry]}), \
             patch.object(gen, "get_all_api_keys", return_value=["dummy-key"]), \
             patch.object(regen, "process_target", return_value="FAILED"), \
             patch("sys.stdout", new_callable=io.StringIO) as output:
            regen.main(["--execute", "--workers", "1"])
        self.assertIn("Sample_2: FAILED (ใช้เวลา ", output.getvalue())
        self.assertIn("— Widget.java: Incomplete API stream: no finish_reason", output.getvalue())

    def setUp(self):
        self.root = Path(__file__).resolve().parent / f"_regen_test_{uuid4().hex}"
        self.root.mkdir()

    def tearDown(self):
        shutil.rmtree(self.root)

    def test_prompt_contains_build_dependencies_and_no_error_log(self):
        source_dir = self.root / "Resoucre" / "Sample_2"
        source_dir.mkdir(parents=True)
        source = source_dir / "Widget.java"
        source.write_text("package example;\nimport java.util.List;\npublic class Widget {}\n",
                          encoding="utf-8")
        checkout = self.root / "data" / "Sample1buggy"
        checkout.mkdir(parents=True)
        (checkout / "pom.xml").write_text(
            "<project><dependencies><dependency><groupId>junit</groupId>"
            "<artifactId>junit</artifactId><version>4.12</version>"
            "</dependency></dependencies></project>", encoding="utf-8")
        deps, signatures = gen.collect_dependency_context(source, "Sample_2", self.root)
        self.assertIn("junit:junit:4.12", deps)
        self.assertIn("java.util.List", deps)
        self.assertIn("v1 reference checkout", deps)
        prompt = gen.build_prompt("[DEPENDENCY_SPECIFICATION]\n"
                                  "[signature ของ class ที่ target class เรียกใช้ ถ้ามี]",
                                  source.read_text(encoding="utf-8"),
                                  dependencies=deps, signatures=signatures)
        self.assertIn("junit:junit:4.12", prompt)
        self.assertNotIn("[DEPENDENCY_SPECIFICATION]", prompt)
        self.assertNotIn("compiler error", prompt.lower())

    def test_commit_publishes_only_to_testcode2(self):
        deepseek = self.root / "Deepseek-flash-v4"
        test_code = deepseek / "TestCode"
        result = deepseek / "Result"
        test_code2 = deepseek / "TestCode2"
        staging = test_code2 / ".work" / "staging" / "Sample_2" / "Sample_2_buggy"
        original = test_code / "Sample_2_buggy"
        old_result = result / "Sample_2"
        for folder in (staging, original, old_result):
            folder.mkdir(parents=True)
        (original / "OldTest.java").write_text("old", encoding="utf-8")
        (old_result / "result.json").write_text('{"verdict":"NOT_AVAILABLE"}',
                                                 encoding="utf-8")
        candidate = staging / "NewTest.java"
        candidate.write_text("new", encoding="utf-8")
        with patch.object(regen, "REGEN", test_code2 / ".work"), \
             patch.object(regen, "TEST_CODE", test_code2), \
             patch.object(regen, "RESULT", deepseek / "Result2"):
            regen.commit_target("Sample_2", [candidate])
        self.assertEqual((original / "OldTest.java").read_text(), "old")
        self.assertTrue((old_result / "result.json").is_file())
        self.assertEqual((test_code2 / "Sample_2_buggy" / "NewTest.java").read_text(), "new")
        self.assertEqual(json.loads((test_code2 / ".work" / "status" /
                                     "Sample_2.json").read_text())["status"], "COMMITTED")

    def test_generator_sends_dependencies_to_api_and_writes_only_staging(self):
        source_dir = self.root / "Resoucre" / "Sample_2"
        source_dir.mkdir(parents=True)
        (source_dir / "Widget.java").write_text(
            "package example;\nimport java.util.List;\npublic class Widget { public int size(){ return 1; } }\n",
            encoding="utf-8")
        checkout = self.root / "data" / "Sample1buggy"
        checkout.mkdir(parents=True)
        (checkout / "pom.xml").write_text(
            "<project><dependencies><dependency><groupId>junit</groupId>"
            "<artifactId>junit</artifactId><version>4.12</version>"
            "</dependency></dependencies></project>", encoding="utf-8")
        template_dir = self.root / "Deepseek-flash-v4" / "Promt"
        template_dir.mkdir(parents=True)
        (template_dir / "promt.md").write_text(
            "[FRAMEWORK_SPECIFICATION]\n[DEPENDENCY_SPECIFICATION]\n"
            "[signature ของ class ที่ target class เรียกใช้ ถ้ามี]\n"
            "[full class source code ของ target class]", encoding="utf-8")
        generated = ("package example; import org.junit.Test; import static org.junit.Assert.*; "
                     "public class WidgetTest { @Test public void testSize() { "
                     "assertEquals(1, new Widget().size()); } }")
        response = {"success": True, "content": generated, "finish_reason": "stop",
                    "usage": {}, "used_key_masked": "dummy"}
        output_root = self.root / "staging"
        with patch.object(gen, "__file__", str(self.root / "script/Round1/generate_deepseek_tests.py")), \
             patch.object(gen, "get_all_api_keys", return_value=["dummy-key"]), \
             patch.object(gen, "call_deepseek_api_with_rotation", return_value=response) as api:
            gen.main(["--project", "Sample_2", "--output-dir", str(output_root),
                      "--state-file", str(self.root / "state.json"),
                      "--budget-file", str(self.root / "budget.json"),
                      "--no-budget", "--delay", "0", "--junit", "junit4"])
        self.assertIn("junit:junit:4.12", api.call_args.kwargs["prompt"])
        self.assertIn("public class Widget", api.call_args.kwargs["prompt"])
        self.assertTrue((output_root / "Sample_2_buggy" / "WidgetTest.java").is_file())
        self.assertFalse((self.root / "Deepseek-flash-v4" / "TestCode").exists())

    def test_duplicate_generated_name_is_repaired_without_overwriting_other_source(self):
        target = "Sample_2"
        source_dir = self.root / "Resoucre" / target
        source_dir.mkdir(parents=True)
        (source_dir / "Widget.java").write_text("package example; public interface Widget {}",
                                                 encoding="utf-8")
        (source_dir / "WidgetImpl.java").write_text("package example; public class WidgetImpl {}",
                                                     encoding="utf-8")
        template = self.root / "Deepseek-flash-v4" / "Promt" / "promt.md"
        template.parent.mkdir(parents=True)
        template.write_text("[full class source code ของ target class]", encoding="utf-8")
        work = self.root / "work"
        stage = work / "staging" / target / f"{target}_buggy"
        stage.mkdir(parents=True)
        state_file = work / "generator_state" / f"{target}.json"
        state_file.parent.mkdir(parents=True)
        old_code = ("package example; import org.junit.Test; public class WidgetImplTest { "
                    "@Test public void testOld() { org.junit.Assert.assertTrue(true); } }")
        shared = stage / "WidgetImplTest.java"
        shared.write_text(old_code, encoding="utf-8")
        state_file.write_text(json.dumps({
            f"{target}/Widget.java": {"status": "GENERATED", "test_file": str(shared)},
            f"{target}/WidgetImpl.java": {"status": "GENERATED", "test_file": str(shared)},
        }), encoding="utf-8")
        with patch.object(regen, "REGEN", work):
            self.assertIsNone(regen.ready_files(target, ["Widget.java", "WidgetImpl.java"]))
        new_code = ("package example; import org.junit.Test; public class WidgetImplTest { "
                    "@Test public void testNew() { org.junit.Assert.assertTrue(true); } }")
        response = {"success": True, "content": new_code, "finish_reason": "stop",
                    "usage": {}, "used_key_masked": "dummy"}
        with patch.object(gen, "__file__", str(self.root / "script/Round1/generate_deepseek_tests.py")), \
             patch.object(gen, "get_all_api_keys", return_value=["dummy-key"]), \
             patch.object(gen, "call_deepseek_api_with_rotation", return_value=response) as api:
            gen.main(["--project", target, "--output-dir", str(work / "staging" / target),
                      "--state-file", str(state_file), "--no-budget", "--delay", "0",
                      "--junit", "junit4"])
        api.assert_called_once()
        self.assertIn("public class WidgetTest", (stage / "WidgetTest.java").read_text())
        self.assertIn("testOld", shared.read_text())
        with patch.object(regen, "REGEN", work):
            self.assertEqual(len(regen.ready_files(target, ["Widget.java", "WidgetImpl.java"])), 2)

    def test_layout_migration_is_reversible_and_idempotent(self):
        deepseek = self.root / "Deepseek-flash-v4"
        old_code = deepseek / "TestCode"
        old_result = deepseek / "Result"
        baseline = deepseek / "Regeneration" / "baseline" / "Mockito_29"
        for folder in (old_code / "Good_1_buggy", old_code / "Mockito_29_buggy",
                       old_result / "Good_1", old_result / "Mockito_29",
                       baseline / "TestCode", baseline / "Result"):
            folder.mkdir(parents=True)
        (old_code / "Good_1_buggy" / "GoodTest.java").write_text("good", encoding="utf-8")
        (old_result / "Good_1" / "result.json").write_text(
            '{"verdict":"NOT_REVEALING"}', encoding="utf-8")
        (old_code / "Mockito_29_buggy" / "SameTest.java").write_text("new", encoding="utf-8")
        (old_result / "Mockito_29" / "result.json").write_text(
            '{"verdict":"NOT_AVAILABLE","tests":11}', encoding="utf-8")
        (baseline / "TestCode" / "SameTest.java").write_text("original", encoding="utf-8")
        (baseline / "Result" / "result.json").write_text(
            '{"verdict":"NOT_AVAILABLE","tests":8}', encoding="utf-8")
        (deepseek / "Code").mkdir()
        with patch.object(layout.subprocess, "run"):
            self.assertEqual(layout.migrate(deepseek), (2, 2))
            self.assertEqual(layout.migrate(deepseek), (2, 2))
        self.assertEqual((old_code / "Mockito_29_buggy" / "SameTest.java").read_text(),
                         "original")
        self.assertEqual((deepseek / "TestCode2" / "Mockito_29_buggy" /
                          "SameTest.java").read_text(), "new")
        self.assertTrue((deepseek / "Result2" / "Good_1" / "result.json").is_file())
        self.assertFalse((deepseek / "Regeneration").exists())


if __name__ == "__main__":
    unittest.main()
