#!/usr/bin/env python3
"""Continuously watch test execution results and push them in batches to git."""

import json
import os
import re
import shutil
import subprocess
import sys
import time
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
RESULT_ROOT = ROOT / "Result"
REPO_ROOT = ROOT.parent
TEST_ROOT = ROOT / "TestCode"


def run_git(args, cwd=REPO_ROOT):
    cmd = ["git"] + args
    res = subprocess.run(cmd, cwd=cwd, capture_output=True, text=True)
    return res.returncode, res.stdout.strip(), res.stderr.strip()


def get_uncommitted_targets():
    """Find result directories with completed result.json that aren't yet committed."""
    rc, stdout, _ = run_git(["status", "--porcelain", "-uall", "Gemini-3.8-flash/Result"])
    if rc != 0:
        return []
    uncommitted = set()
    for line in stdout.splitlines():
        parts = line.strip().split()
        if len(parts) >= 2:
            path_str = parts[1]
            match = re.search(r"Gemini-3.8-flash/Result/([A-Za-z0-9]+_\d+)/", path_str)
            if match:
                target = match.group(1)
                if (RESULT_ROOT / target / "result.json").is_file():
                    uncommitted.add(target)
    return sorted(list(uncommitted), key=lambda x: (x.split("_")[0], int(x.split("_")[1])))


def update_summary_and_reports():
    cmd = [sys.executable, str(ROOT / "Code" / "run_gemini_tests.py"), "--collect-only"]
    res = subprocess.run(cmd, cwd=ROOT, capture_output=True, text=True)
    return res.returncode == 0


def push_batch(targets):
    if not targets:
        return True
    print(f"\n[WATCHER] Preparing to commit & push {len(targets)} targets: {targets[0]} ... {targets[-1]}", flush=True)
    # Remove any residual logs on disk
    for t in targets:
        shutil.rmtree(RESULT_ROOT / t / "logs", ignore_errors=True)
    update_summary_and_reports()

    # Stage targets (only result.json and result.csv, no logs)
    paths_to_add = []
    for t in targets:
        paths_to_add.append(f"Gemini-3.8-flash/Result/{t}/result.json")
        paths_to_add.append(f"Gemini-3.8-flash/Result/{t}/result.csv")
    paths_to_add.extend([
        "Gemini-3.8-flash/Result/report.csv",
        "Gemini-3.8-flash/report.csv",
        "Gemini-3.8-flash/summary.xlsx",
        "Gemini-3.8-flash/.gitignore"
    ])
    rc, out, err = run_git(["add"] + paths_to_add)
    if rc != 0:
        print(f"Git add failed: {err}", file=sys.stderr, flush=True)
        return False

    # Create descriptive commit message
    by_project = {}
    for t in targets:
        p, b = t.split("_")
        by_project.setdefault(p, []).append(int(b))
    proj_desc = []
    for p, bids in sorted(by_project.items()):
        bids = sorted(bids)
        proj_desc.append(f"{p} ({min(bids)}-{max(bids)}, count: {len(bids)})")
    commit_msg = f"Gemini: add test results for {', '.join(proj_desc)}"

    rc, out, err = run_git(["commit", "-m", commit_msg])
    if rc != 0:
        if "nothing to commit" in out or "nothing to commit" in err:
            print("[WATCHER] Nothing new to commit.", flush=True)
            return True
        print(f"Git commit failed: {err}", file=sys.stderr, flush=True)
        return False

    # Push with retry
    for attempt in range(3):
        rc, out, err = run_git(["push", "origin", "main"])
        if rc == 0:
            print(f"[WATCHER] Successfully pushed: {commit_msg}", flush=True)
            return True
        print(f"[WATCHER] Push attempt {attempt + 1} failed: {err}. Retrying in 5s...", file=sys.stderr, flush=True)
        time.sleep(5)
    return False


def is_runner_alive():
    res = subprocess.run(["pgrep", "-f", "run_gemini_tests.py --workers"], capture_output=True, text=True)
    return bool(res.stdout.strip())


def main():
    print("Starting watch-and-push loop...", flush=True)
    BATCH_SIZE = 20

    while True:
        uncommitted = get_uncommitted_targets()
        runner_alive = is_runner_alive()

        if len(uncommitted) >= BATCH_SIZE or (not runner_alive and uncommitted):
            # Group by project
            by_proj = {}
            for t in uncommitted:
                by_proj.setdefault(t.split("_")[0], []).append(t)

            # Pick a batch: prioritize completing a whole project or chunk of ~25-30
            batch = []
            for proj, items in by_proj.items():
                if not batch or len(batch) + len(items) <= 35:
                    batch.extend(items)
                else:
                    break

            if not batch and uncommitted:
                batch = uncommitted[:BATCH_SIZE]

            push_batch(batch)

        if not runner_alive and not get_uncommitted_targets():
            print("[WATCHER] Runner is no longer active and all results committed. Exiting.", flush=True)
            break

        time.sleep(15)


if __name__ == "__main__":
    main()
