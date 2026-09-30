#!/usr/bin/env python3
"""Batch commit and push all remaining completed targets by project."""

import re
import subprocess
import sys
import time
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
REPO_ROOT = ROOT.parent
RESULT_ROOT = ROOT / "Result"


def run_git(args):
    cmd = ["git"] + args
    res = subprocess.run(cmd, cwd=REPO_ROOT, capture_output=True, text=True)
    return res.returncode, res.stdout.strip(), res.stderr.strip()


def get_uncommitted_by_project():
    rc, stdout, _ = run_git(["status", "--porcelain", "-uall", "Gemini-3.8-flash/Result"])
    if rc != 0:
        return {}
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
    by_project = {}
    for t in sorted(uncommitted, key=lambda x: (x.split("_")[0], int(x.split("_")[1]))):
        p, b = t.split("_")
        by_project.setdefault(p, []).append(t)
    return by_project


def push_batch(targets, desc):
    paths = [f"Gemini-3.8-flash/Result/{t}" for t in targets]
    paths.extend([
        "Gemini-3.8-flash/Result/report.csv",
        "Gemini-3.8-flash/report.csv",
        "Gemini-3.8-flash/summary.xlsx"
    ])
    rc, out, err = run_git(["add"] + paths)
    if rc != 0:
        print(f"Git add failed for {desc}: {err}", file=sys.stderr)
        return False
    commit_msg = f"Gemini: add test results for {desc}"
    rc, out, err = run_git(["commit", "-m", commit_msg])
    if rc != 0:
        if "nothing to commit" in out or "nothing to commit" in err:
            return True
        print(f"Git commit failed for {desc}: {err}", file=sys.stderr)
        return False
    for attempt in range(5):
        rc, out, err = run_git(["push", "origin", "main"])
        if rc == 0:
            print(f"Successfully pushed: {commit_msg}", flush=True)
            return True
        print(f"Push attempt {attempt + 1} failed: {err}. Retrying...", file=sys.stderr, flush=True)
        time.sleep(3)
    return False


def main():
    by_project = get_uncommitted_by_project()
    print(f"Uncommitted projects: {list(by_project.keys())}")
    for proj, targets in by_project.items():
        # If project is large (like Closure, JacksonDatabind, Math), split into chunks of ~30
        CHUNK_SIZE = 35
        for i in range(0, len(targets), CHUNK_SIZE):
            chunk = targets[i:i + CHUNK_SIZE]
            bids = [int(t.split("_")[1]) for t in chunk]
            desc = f"{proj} ({min(bids)}-{max(bids)}, count: {len(chunk)})"
            print(f"Pushing {desc}...", flush=True)
            if not push_batch(chunk, desc):
                print(f"Failed to push {desc}", file=sys.stderr)
                return 1
            time.sleep(1)
    print("All remaining targets pushed successfully!", flush=True)
    return 0


if __name__ == "__main__":
    sys.exit(main())
