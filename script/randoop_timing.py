"""Measure elapsed time for one complete script invocation."""
import json
import os
import sys
import time
from contextlib import contextmanager
from datetime import datetime, timezone
from pathlib import Path


def save_runtime_to_state(state_file, run_id, record):
    """Keep timing metadata separate from project entries in the existing state."""
    path = Path(state_file)
    data = json.loads(path.read_text(encoding="utf-8")) if path.exists() else {}
    if not isinstance(data, dict):
        raise ValueError(f"State must be an object: {path}")
    runtime = data.setdefault("_script_runs", {"latest": None, "history": {}})
    runtime["history"][run_id] = dict(record)
    runtime["latest"] = dict(record)
    path.parent.mkdir(parents=True, exist_ok=True)
    temporary = path.with_name(f".{path.name}.{run_id}.tmp")
    temporary.write_text(json.dumps(data, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    temporary.replace(path)


def start_runtime_in_state(summary):
    """Make a running invocation visible before long generation/evaluation work."""
    summary["run_id"] = datetime.now(timezone.utc).strftime("%Y%m%dT%H%M%S%fZ") + f"_{os.getpid()}"
    record = {key: value for key, value in summary.items() if key != "log_dir"}
    record.update(status="RUNNING", total_duration_seconds=None, finished_at=None)
    try:
        save_runtime_to_state(summary["state_file"], summary["run_id"], record)
    except (OSError, ValueError, TypeError) as exc:
        print(f"⚠️ บันทึกเวลาเริ่มลง state ไม่สำเร็จ: {exc}", flush=True)


@contextmanager
def track_script_run(summary):
    if sys.platform == "win32":
        for stream in (sys.stdout, sys.stderr):
            if hasattr(stream, "reconfigure"):
                stream.reconfigure(encoding="utf-8")
    started = time.perf_counter()
    summary["started_at"] = datetime.now(timezone.utc).isoformat()
    summary["status"] = "COMPLETED"
    try:
        yield
    except KeyboardInterrupt:
        summary["status"] = "INTERRUPTED"
        raise
    except SystemExit as exc:
        if exc.code not in (None, 0):
            summary["status"] = "FAILED"
        raise
    except BaseException:
        summary["status"] = "FAILED"
        raise
    finally:
        summary["total_duration_seconds"] = round(time.perf_counter() - started, 3)
        summary["finished_at"] = datetime.now(timezone.utc).isoformat()
        log_dir = summary.pop("log_dir", None)
        print(f"⏱️ เวลารวมของสคริปต์: {summary['total_duration_seconds']:.3f}s", flush=True)
        if log_dir:
            run_id = summary.get("run_id") or (datetime.now(timezone.utc).strftime("%Y%m%dT%H%M%S%fZ") + f"_{os.getpid()}")
            if summary.get("state_file"):
                try:
                    save_runtime_to_state(summary["state_file"], run_id, summary)
                    print(f"🧠 บันทึกเวลาลง state: {summary['state_file']} (_script_runs)", flush=True)
                except (OSError, ValueError, TypeError) as exc:
                    print(f"⚠️ บันทึกเวลาลง state ไม่สำเร็จ: {exc}", flush=True)
            try:
                directory = Path(log_dir)
                directory.mkdir(parents=True, exist_ok=True)
                filename = run_id + ".json"
                path = directory / filename
                path.write_text(json.dumps(summary, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
                print(f"📄 บันทึกเวลารัน: {path}", flush=True)
            except OSError as exc:
                print(f"⚠️ บันทึกเวลารันไม่สำเร็จ: {exc}", flush=True)
