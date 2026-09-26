#!/usr/bin/env python3
"""Regenerate the frozen NOT_AVAILABLE cohort from source plus dependencies."""

import argparse
import hashlib
import json
import os
import queue
import signal
import subprocess
import sys
import threading
import time
from collections import Counter
from concurrent.futures import ThreadPoolExecutor
from datetime import datetime, timezone
from difflib import get_close_matches
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parents[1] / "Round1"))
import generate_deepseek_tests as gen


WORKSPACE = Path(__file__).resolve().parents[2]
DEEPSEEK = WORKSPACE / "Deepseek-flash-v4"
RESOURCE = WORKSPACE / "Resoucre"
SOURCE_RESULT = DEEPSEEK / "Result"
TEST_CODE = DEEPSEEK / "TestCode2"
RESULT = DEEPSEEK / "Result2"
REGEN = TEST_CODE / ".work"
MANIFEST = REGEN / "manifest.json"
STOP = threading.Event()
ACTIVE = set()
ACTIVE_LOCK = threading.Lock()


def read_json(path: Path, default=None):
    if not path.is_file():
        return default
    return json.loads(path.read_text(encoding="utf-8"))


def source_files(target: str):
    folder = RESOURCE / target
    if not folder.is_dir():
        return []
    return [{"project": target, "source_file": path,
             "rel_path": path.relative_to(folder).as_posix(),
             "file_size": path.stat().st_size}
            for path in sorted(folder.rglob("*.java"))]


def discover_cohort():
    targets = []
    for report_path in sorted(SOURCE_RESULT.glob("*/result.json")):
        report = read_json(report_path)
        if report.get("verdict") != "NOT_AVAILABLE":
            continue
        target = report_path.parent.name
        tasks = source_files(target)
        if not tasks or {task["project"] for task in tasks} != {target}:
            raise ValueError(f"Source files missing or ambiguous for {target}")
        targets.append({"target": target,
                        "sources": [task["rel_path"] for task in tasks]})
    return {"schema_version": 1, "created_at": datetime.now(timezone.utc).isoformat(),
            "targets": targets}


def manifest_for_run(write=False):
    if MANIFEST.is_file():
        return read_json(MANIFEST)
    manifest = discover_cohort()
    if write:
        gen.save_atomic_json(MANIFEST, manifest)
    return manifest


def partition_manifest(manifest, partition):
    """Split the frozen cohort before checking progress, so reruns stay disjoint."""
    if partition == "all":
        return manifest
    targets = manifest["targets"]
    midpoint = (len(targets) + 1) // 2
    selected = targets[:midpoint] if partition == "front" else list(reversed(targets[midpoint:]))
    return {**manifest, "targets": selected}


def project_family(target):
    return target.rsplit("_", 1)[0]


def filter_project(manifest, project):
    """Select every bug ID in one Defects4J project family."""
    if not project:
        return manifest
    families = {project_family(entry["target"]) for entry in manifest["targets"]}
    family = next((name for name in families if name.casefold() == project.casefold()), None)
    if family is None:
        suggestion = get_close_matches(project, sorted(families), n=1, cutoff=0.6)
        hint = f" Did you mean {suggestion[0]}?" if suggestion else ""
        raise ValueError(f"Unknown project group: {project}.{hint}")
    return {**manifest, "targets": [entry for entry in manifest["targets"]
                                    if project_family(entry["target"]) == family]}


def status_path(target):
    return REGEN / "status" / f"{target}.json"


def save_status(target, status, **details):
    gen.save_atomic_json(status_path(target), {
        "target": target, "status": status,
        "updated_at": datetime.now(timezone.utc).isoformat(), **details,
    })


def generator_state_path(target):
    return REGEN / "generator_state" / f"{target}.json"


def stage_root(target):
    return REGEN / "staging" / target


def ready_files(target, sources):
    state = gen.load_state(generator_state_path(target), read_only=True)
    stage = stage_root(target) / f"{target}_buggy"
    files = []
    seen = set()
    for relative in sources:
        task_id = f"{target}/{relative}"
        record = state.get(task_id, {})
        if record.get("status") != "GENERATED":
            return None
        recorded_name = Path(record.get("test_file", "").replace("\\", "/")).name
        candidate = stage / recorded_name
        if not recorded_name or not candidate.is_file():
            return None
        if candidate.name in seen or not gen.is_valid_complete_java_test(candidate):
            return None
        seen.add(candidate.name)
        files.append(candidate)
    return files


def generation_failure_reason(target, sources):
    state = gen.load_state(generator_state_path(target), read_only=True)
    for relative in sources:
        record = state.get(f"{target}/{relative}", {})
        if record.get("status") != "GENERATED":
            if (record.get("status") == "LIMIT_REACHED" and
                    record.get("finish_reason") == "unknown" and
                    record.get("content_char_count") == 0 and not record.get("error")):
                detail = ("no Java code or finish_reason recorded; original API error "
                          "was not saved by the older run")
            else:
                detail = record.get("error") or record.get("note") or record.get("status") or "no generator result"
            return f"{relative}: {detail}"
    return "Generated files missing or invalid in staging"


def recovered_commit(target, sources):
    """Recognize a completed staging move interrupted before its status write."""
    current = TEST_CODE / f"{target}_buggy"
    if not current.is_dir() or (stage_root(target) / current.name).exists():
        return False
    state = gen.load_state(generator_state_path(target), read_only=True)
    expected = []
    for relative in sources:
        record = state.get(f"{target}/{relative}", {})
        if record.get("status") != "GENERATED":
            return False
        expected.append(Path(record.get("test_file", "")).name)
    if {p.name for p in current.glob("*.java")} != set(expected):
        return False
    save_status(target, "COMMITTED", generated_files=expected,
                test_code=str(current))
    return True


def commit_target(target, files):
    """Publish a complete candidate in TestCode2 without changing TestCode."""
    new_code = TEST_CODE / f"{target}_buggy"
    stage = stage_root(target) / f"{target}_buggy"
    if new_code.exists():
        raise RuntimeError(f"Refusing to replace existing TestCode2: {new_code}")
    if not stage.is_dir():
        raise RuntimeError(f"Staged TestCode missing: {stage}")
    stage.rename(new_code)
    if {p.name for p in new_code.glob("*.java")} != {p.name for p in files}:
        raise RuntimeError(f"Generated files missing after swap: {target}")
    save_status(target, "COMMITTED", generated_files=[p.name for p in files],
                test_code=str(new_code))


def stop_active():
    with ACTIVE_LOCK:
        processes = list(ACTIVE)
    for process in processes:
        if process.poll() is None:
            if os.name == "posix":
                try:
                    os.killpg(process.pid, signal.SIGTERM)
                except ProcessLookupError:
                    pass
            else:
                process.terminate()
    for process in processes:
        try:
            process.wait(timeout=3)
        except subprocess.TimeoutExpired:
            if os.name == "posix":
                try:
                    os.killpg(process.pid, signal.SIGKILL)
                except ProcessLookupError:
                    pass
            else:
                process.kill()


def run_generator(target, slot, key, args):
    fingerprint = hashlib.sha256(key.encode("utf-8")).hexdigest()[:16]
    command = [sys.executable, "-u", str(WORKSPACE / "script/Round1/generate_deepseek_tests.py"),
               "--project", target, "--key-index", str(slot),
               "--state-file", str(generator_state_path(target)),
               "--output-dir", str(stage_root(target)),
               "--budget-file", str(DEEPSEEK / "budget" / f"key-{fingerprint}.json"),
               "--budget-limit", str(args.budget_limit),
               "--max-tokens", str(args.max_tokens), "--timeout", str(args.timeout),
               "--junit", "junit4", "--delay", "0"]
    if args.env_file:
        command.extend(["--env-file", args.env_file])
    if args.thinking is not None:
        command.extend(["--thinking", args.thinking])
    if args.reasoning_effort is not None:
        command.extend(["--reasoning-effort", args.reasoning_effort])
    log_path = REGEN / "logs" / f"{target}.log"
    log_path.parent.mkdir(parents=True, exist_ok=True)
    with log_path.open("a", encoding="utf-8") as output:
        output.write(f"\n[attempt at {datetime.now(timezone.utc).isoformat()} key #{slot}]\n")
        output.flush()
        process = subprocess.Popen(command, cwd=WORKSPACE, stdout=output,
                                   stderr=subprocess.STDOUT,
                                   start_new_session=(os.name == "posix"))
        with ACTIVE_LOCK:
            ACTIVE.add(process)
        try:
            return process.wait()
        finally:
            with ACTIVE_LOCK:
                ACTIVE.discard(process)


def process_target(entry, slot, key, args):
    target, sources = entry["target"], entry["sources"]
    if STOP.is_set():
        return "STOPPED"
    if recovered_commit(target, sources):
        return "COMMITTED"
    files = ready_files(target, sources)
    if files is None:
        code = run_generator(target, slot, key, args)
        if STOP.is_set():
            return "STOPPED"
        files = ready_files(target, sources)
        if code == 3 and files is None:
            save_status(target, "PAUSED", reason="API key quota exhausted")
            return "PAUSED"
        if files is None:
            save_status(target, "FAILED", reason=generation_failure_reason(target, sources),
                        generator_exit=code)
            return "FAILED"
    if STOP.is_set():
        return "STOPPED"
    commit_target(target, files)
    return "COMMITTED"


def verify_pending(manifest, args):
    targets = [entry["target"] for entry in manifest["targets"]
               if read_json(status_path(entry["target"]), {}).get("status") == "COMMITTED"
               and not (RESULT / entry["target"] / "result.json").is_file()]
    if args.targets:
        targets = [target for target in targets if target in set(args.targets)]
    if args.limit:
        targets = targets[:args.limit]
    if not targets:
        return 0
    runner = WORKSPACE / "Deepseek-flash-v4/Code/run_deepseek_tests.py"
    d4j = os.environ.get("DEFECTS4J_BIN", "")
    if not d4j:
        candidate = Path.home() / "defect4j/defects4j/framework/bin/defects4j"
        if candidate.is_file():
            d4j = str(candidate)
    for offset in range(0, len(targets), 50):
        chunk = targets[offset:offset + 50]
        command = [sys.executable, str(runner), "--targets", *chunk,
                   "--test-root", str(TEST_CODE), "--result-root", str(RESULT),
                   "--workers", str(args.verify_workers),
                   "--test-timeout", str(args.test_timeout)]
        if d4j:
            command.extend(["--defects4j-bin", d4j])
        print(f"Verifying {offset + 1}-{offset + len(chunk)} of {len(targets)} targets...", flush=True)
        code = subprocess.call(command, cwd=WORKSPACE)
        if code == 130:
            return 130
        if code not in (0, 1):
            return code
    return 0


def write_prompt_preview(manifest, target):
    entry = next((item for item in manifest["targets"] if item["target"] == target), None)
    if entry is None:
        raise ValueError(f"Target is not in the NOT_AVAILABLE cohort: {target}")
    template = (DEEPSEEK / "Promt" / "promt.md").read_text(encoding="utf-8")
    output = []
    for task in source_files(target):
        source = task["source_file"].read_text(encoding="utf-8", errors="replace")
        dependencies, signatures = gen.collect_dependency_context(
            task["source_file"], target, WORKSPACE)
        prompt = gen.build_prompt(template, gen.source_for_prompt(source),
                                  dependencies=dependencies, junit_version="junit4",
                                  signatures=signatures)
        relative = Path(task["rel_path"])
        destination = REGEN / "prompt_preview" / target / relative.with_suffix(".prompt.md")
        gen.save_atomic_text(destination, "# system\n\n" + gen.SYSTEM_PROMPT +
                             "\n\n# user\n\n" + prompt + "\n")
        output.append(destination)
    return output


def print_status_report(manifest, targets=None, limit=None):
    """Report persisted cohort progress without API calls or state changes."""
    entries = [entry for entry in manifest["targets"]
               if not targets or entry["target"] in targets]
    counts = Counter()
    verdicts = Counter()
    rows = []
    remaining_targets = []
    generated_sources = 0
    reports = 0
    for entry in entries:
        target = entry["target"]
        record = read_json(status_path(target), {})
        status = record.get("status", "PENDING")
        counts[status] += 1
        if status != "COMMITTED":
            remaining_targets.append(f"{target} [{status}]")
        state = read_json(generator_state_path(target), {})
        generated = sum(state.get(f"{target}/{source}", {}).get("status") == "GENERATED"
                        for source in entry["sources"])
        generated_sources += generated
        report_path = RESULT / target / "result.json"
        result = "not ready"
        if status == "COMMITTED":
            if report_path.is_file():
                report = read_json(report_path, {})
                result = report.get("verdict", "UNKNOWN")
                verdicts[result] += 1
                reports += 1
            else:
                result = "pending verification"
        reason = record.get("reason") if status in ("FAILED", "PAUSED") else None
        if status == "FAILED" and reason == "Not all source files yielded valid Java":
            reason = generation_failure_reason(target, entry["sources"])
        reason_text = f"; reason: {' '.join(str(reason).split())}" if reason else ""
        rows.append(f"  {target}: {status}; generated files {generated}/{len(entry['sources'])}; "
                    f"Result2: {result}{reason_text}")

    total = len(entries)
    committed = counts["COMMITTED"]
    remaining = total - committed
    sources = sum(len(entry["sources"]) for entry in entries)
    percent = 100 * committed / total if total else 0
    print(f"Cohort status: {total} targets, {sources} source files")
    print(f"TestCode2 committed: {committed}/{total} ({percent:.1f}%); remaining: {remaining}")
    print(f"  FAILED: {counts['FAILED']}; PAUSED: {counts['PAUSED']}; "
          f"PENDING/other: {remaining - counts['FAILED'] - counts['PAUSED']}")
    print(f"Source files recorded GENERATED: {generated_sources}/{sources}")
    print(f"Result2 reports: {reports}/{committed} committed targets; "
          f"pending verification: {committed - reports}")
    if verdicts:
        print("  Verdicts: " + ", ".join(f"{name}={count}" for name, count in sorted(verdicts.items())))
    visible_targets = remaining_targets[:limit] if limit else remaining_targets
    print(f"Remaining targets ({len(remaining_targets)}):")
    if visible_targets:
        print("\n".join(f"  {target}" for target in visible_targets))
    else:
        print("  none")
    if len(visible_targets) < len(remaining_targets):
        print(f"  ... {len(remaining_targets) - len(visible_targets)} more; raise --limit to show more")
    print("Snapshot of saved state; PENDING/FAILED/PAUSED do not indicate whether a worker is currently running.")
    if targets or limit:
        print("\nTarget details:")
        print("\n".join(rows[:limit] if limit else rows))


def main(argv=None):
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--execute", action="store_true", help="Generate into TestCode2 only; run --verify-only later for Result2")
    parser.add_argument("--publish-ready", action="store_true",
                        help="Move already complete staged suites into TestCode2 without API or Defects4J")
    parser.add_argument("--verify-only", action="store_true", help="Run committed targets awaiting verification")
    parser.add_argument("--status", action="store_true", help="Read saved generation and Result2 progress; no API, verification, or writes")
    parser.add_argument("--preview-prompt", metavar="TARGET",
                        help="Write the exact first-request system/user prompt without calling the API")
    parser.add_argument("--limit", type=int,
                        help="Process first N pending targets; with --status, cap target list and detail rows")
    parser.add_argument("--targets", nargs="+", help="Restrict generation, verification, or status to these cohort targets")
    parser.add_argument("--project", metavar="NAME",
                        help="Select all bug IDs in a project family, e.g. JacksonDatabind")
    parser.add_argument("--partition", choices=["all", "front", "back"], default="all",
                        help="Stable front/back half of the frozen manifest for separate terminals")
    parser.add_argument("--workers", type=int, default=4, help="Concurrent API key workers")
    parser.add_argument("--key-index", type=int,
                        help="Use one specific configured API key (requires --workers 1)")
    parser.add_argument("--verify-workers", type=int, default=2)
    parser.add_argument("--test-timeout", type=int, default=600)
    parser.add_argument("--timeout", type=int, default=120, help="API read timeout in seconds")
    parser.add_argument("--max-tokens", type=int, default=100000)
    parser.add_argument("--thinking", choices=["enabled", "disabled"],
                        help="Optional provider-specific thinking setting (default: omit)")
    parser.add_argument("--reasoning-effort", choices=["low", "high", "max"], default="low",
                        help="Provider-specific reasoning setting (default: low)")
    parser.add_argument("--budget-limit", type=int, default=1000000)
    parser.add_argument("--env-file", help="API key .env path")
    args = parser.parse_args(argv)
    if args.thinking == "disabled" and args.reasoning_effort is not None:
        parser.error("--reasoning-effort cannot be used with --thinking disabled")
    if min(args.workers, args.verify_workers, args.test_timeout, args.timeout,
           args.max_tokens, args.budget_limit) < 1 or (args.limit is not None and args.limit < 1):
        parser.error("All worker, timeout, token, budget, and limit values must be positive")
    if sum((args.execute, args.publish_ready, args.verify_only, args.status,
            bool(args.preview_prompt))) > 1:
        parser.error("Choose only one of --execute, --publish-ready, --verify-only, --status, or --preview-prompt")
    if args.key_index is not None and (args.workers != 1 or args.key_index < 1):
        parser.error("--key-index requires --workers 1 and a positive key index")
    full_manifest = manifest_for_run(write=args.execute)
    try:
        project_manifest = filter_project(full_manifest, args.project)
    except ValueError as exc:
        parser.error(str(exc))
    manifest = partition_manifest(full_manifest, args.partition)
    if args.project:
        selected_targets = {entry["target"] for entry in project_manifest["targets"]}
        manifest = {**manifest, "targets": [entry for entry in manifest["targets"]
                                            if entry["target"] in selected_targets]}
    if args.preview_prompt:
        for path in write_prompt_preview(manifest, args.preview_prompt):
            print(path)
        return 0
    source_count = sum(len(entry["sources"]) for entry in manifest["targets"])
    pending = [entry for entry in manifest["targets"]
               if read_json(status_path(entry["target"]), {}).get("status") != "COMMITTED"]
    if args.targets:
        requested = set(args.targets)
        available = {entry["target"] for entry in manifest["targets"]}
        unknown = requested - available
        if unknown:
            parser.error("Targets outside frozen cohort: " + ", ".join(sorted(unknown)))
        pending = [entry for entry in pending if entry["target"] in requested]
    if args.status:
        detail_targets = args.targets or ([entry["target"] for entry in manifest["targets"]]
                                          if args.project else None)
        print_status_report(manifest, detail_targets, args.limit)
        return 0
    selected = pending[:args.limit] if args.limit else pending
    print(f"Cohort: {len(manifest['targets'])} NOT_AVAILABLE targets, {source_count} source files; "
          f"pending {len(pending)}, selected {len(selected)}", flush=True)
    if args.publish_ready:
        published = 0
        for entry in selected:
            target = entry["target"]
            files = ready_files(target, entry["sources"])
            if files:
                commit_target(target, files)
                print(f"[{target}] published {len(files)} file(s) to TestCode2", flush=True)
                published += 1
        print(f"Published {published} staged targets; Result2 verification remains pending.", flush=True)
        return 0
    if not args.execute:
        if args.verify_only:
            return verify_pending(manifest, args)
        for entry in selected[:10]:
            print(f"  {entry['target']}: {len(entry['sources'])} source file(s)")
        return 0

    if not selected:
        print("No pending generation. Run --verify-only separately to create Result2.", flush=True)
        return 0

    keys = gen.get_all_api_keys(env_file_arg=args.env_file)
    if args.workers > len(keys):
        parser.error(f"--workers {args.workers} needs that many API keys; found {len(keys)}")
    if args.key_index is not None and args.key_index > len(keys):
        parser.error(f"--key-index exceeds the {len(keys)} configured API keys")
    jobs = queue.Queue()
    for entry in selected:
        jobs.put(entry)

    def worker(slot):
        while not STOP.is_set():
            try:
                entry = jobs.get_nowait()
            except queue.Empty:
                return
            target = entry["target"]
            print(f"[key #{slot}] {target}: generating from source + dependencies", flush=True)
            started = time.monotonic()
            try:
                result = process_target(entry, slot, keys[slot - 1], args)
            except Exception as exc:
                save_status(target, "FAILED", reason=str(exc))
                result = "FAILED"
            elapsed = int(time.monotonic() - started)
            hours, remainder = divmod(elapsed, 3600)
            minutes, seconds = divmod(remainder, 60)
            reason = read_json(status_path(target), {}).get("reason") if result == "FAILED" else None
            reason_text = f" — {' '.join(str(reason).split())[:180]}" if reason else ""
            print(f"[key #{slot}] {target}: {result} "
                  f"(ใช้เวลา {hours:02d}:{minutes:02d}:{seconds:02d}){reason_text}", flush=True)
            jobs.task_done()
            if result == "PAUSED":
                jobs.put(entry)
                return

    pool = ThreadPoolExecutor(max_workers=args.workers)
    interrupted = False
    try:
        slots = [args.key_index] if args.key_index is not None else list(range(1, args.workers + 1))
        futures = [pool.submit(worker, slot) for slot in slots]
        for future in futures:
            future.result()
    except KeyboardInterrupt:
        interrupted = True
        STOP.set()
        stop_active()
        print("Interrupted; completed replacements are retained.", flush=True)
    finally:
        pool.shutdown(wait=True, cancel_futures=interrupted)
    if interrupted:
        return 130
    remaining = sum(read_json(status_path(entry["target"]), {}).get("status") != "COMMITTED"
                    for entry in manifest["targets"])
    print(f"Regeneration committed: {len(manifest['targets']) - remaining}; remaining: {remaining}",
          flush=True)
    print("Generation phase finished. Run --verify-only separately to create Result2.", flush=True)
    return 3 if remaining else 0


if __name__ == "__main__":
    sys.exit(main())
