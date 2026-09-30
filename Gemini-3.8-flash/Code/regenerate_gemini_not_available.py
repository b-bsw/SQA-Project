#!/usr/bin/env python3
"""
Regenerate the NOT_AVAILABLE cohort (365 targets) for Gemini 3.8 Flash using dependency-informed test generation.
Saves completed suites into TestCode2/<target>_buggy/ without touching Round 1 TestCode.
"""

import argparse
import hashlib
import json
import os
import queue
import re
import signal
import sys
import threading
import time
from collections import Counter
from concurrent.futures import ThreadPoolExecutor
from datetime import datetime, timezone
from pathlib import Path
import xml.etree.ElementTree as ET

try:
    import requests
except ImportError:
    print("Error: 'requests' module required. Run with /usr/bin/python3", file=sys.stderr)
    sys.exit(1)


WORKSPACE = Path(__file__).resolve().parents[2]
GEMINI_DIR = Path(__file__).resolve().parents[1]
RESOURCE = WORKSPACE / "Resoucre"
SOURCE_RESULT = GEMINI_DIR / "Result"
TEST_CODE = GEMINI_DIR / "TestCode2"
RESULT = GEMINI_DIR / "Result2"
REGEN = GEMINI_DIR / "state" / "Round2"
MANIFEST = REGEN / "manifest.json"

STOP = threading.Event()
ACTIVE_LOCK = threading.Lock()

SYSTEM_PROMPT = (
    "คุณคือ Senior QA Automation Specialist ที่เชี่ยวชาญ Java Unit Testing สำหรับระบบ Legacy Enterprise\n"
    "ตอบกลับเป็นโค้ดภาษา Java ทั้งไฟล์ตั้งแต่ package จนถึงปีกกาปิด } เท่านั้น\n"
    "ห้ามมีคำอธิบายก่อนหรือหลังโค้ด และห้ามใส่ markdown code fences"
)

PROMPT_TEMPLATE = """# Prompt: สร้าง JUnit Test Suite (JUnit 4 Compatible)

## 🎯 วัตถุประสงค์
สร้าง JUnit 4 test suite สำหรับ Java class ในส่วน `<source_code>` โดยต้อง:
1. ใช้ **JUnit 4** เท่านั้น (`org.junit.Test`, `org.junit.Assert.*`, `@Before`, `@After`)
2. ครอบคลุม public/protected methods และ logic หลักอย่างกระชับ ไม่สร้าง test cases ซ้ำซ้อน
3. มี test case สำหรับ: normal case, boundary value, null/empty input, exception path
4. ครอบคลุม branch สำคัญ (if/else, switch, loop: 0 รอบ, 1 รอบ, หลายรอบ)
5. ใช้ assertion ที่ตรวจสอบ return value และ side effect จริง หลีกเลี่ยง assertion ปลอม เช่น `assertTrue(true)`
6. โค้ดทั้งหมดต้องเขียนเป็นไฟล์ Java ที่จบสมบูรณ์ 100% ปิดคลาสด้วย `}` เสมอ ห้ามหยุดกลางคัน

---

## ⚙️ SYSTEM SPECIFICATIONS & COMPILATION SAFETY RULES
- โปรเจกต์นี้ใช้ **JUnit 4** (เข้ากันได้กับ Java 7/8 และ Defects4J):
  - ใช้ imports: `org.junit.Test`, `org.junit.Assert.*`, `org.junit.Before`, `org.junit.After`
  - ❌ **ห้าม import `org.junit.jupiter.*` หรือ JUnit 5 เด็ดขาด**
  - ❌ **ห้ามใช้ Mockito / PowerMock / AssertJ / Hamcrest** เว้นแต่มีระบุไว้ใน dependency ของโปรเจกต์
  - ❌ **ห้าม override method ของ external/library classes โดยเดา signature หรือ return type เองเด็ดขาด** (เช่น อย่าเดาว่า method คืนค่า boolean ถ้าของเดิมคืน void)
  - ❌ **ห้ามสร้าง anonymous inner classes ที่ซับซ้อน** ให้ใช้ object หรือ concrete subclass ปกติ
  - ❌ **ห้ามเรียก method หรือ constructor ที่ไม่ได้ปรากฏใน Source Code หรือ Signatures ที่ให้มา**
  - ✅ หาก target class เป็น abstract class ให้สร้าง static inner class เล็กๆ เพื่อ implement abstract method ที่จำเป็นเท่านั้น
  - ✅ สำหรับ Mock/Stub ให้เขียนเป็น Plain Java Objects ภายใน Test File
  - ✅ **Package declaration ของ Test class ต้องตรงกับ Source Code ที่ให้มา**
  - ✅ ตั้งชื่อ Test class ว่า `<SourceClass>Test`
  - ✅ เขียน Test methods ให้กระชับ สั้น และตรงประเด็น (ประมาณ 10-25 test methods ต่อไฟล์ เพื่อไม่ให้โค้ดยาวเกินไปและคอมไพล์ผ่านสมบูรณ์)

---

## 📦 Project Dependencies & Context
[DEPENDENCY_SPECIFICATION]

Signatures ของ class ที่เกี่ยวข้อง:
[SIGNATURES]

---

## 💻 Source Code ที่ต้องการ Test

<source_code>
[SOURCE_CODE]
</source_code>

---

## 📤 Output ที่ต้องการ
1. ตอบเฉพาะโค้ดภาษา Java ทั้งไฟล์ตั้งแต่ `package ...` จนถึงปีกกาปิด `}` เท่านั้น
2. **ห้ามมีคำอธิบาย บทนำ สรุป หรือข้อความใดๆ นอกเหนือจากโค้ด Java**
3. **ห้ามใส่ Markdown Code Fence** (เช่น ```java หรือ ```) เพื่อให้บันทึกเป็นไฟล์ .java ได้ทันที
4. ตรวจสอบให้มั่นใจว่าปีกกาเปิด-ปิด `{}` มีจำนวนครบถ้วนและปิดคลาสสมบูรณ์
"""



def load_env_keys(env_path: Path = None) -> list:
    path = env_path or (WORKSPACE / ".env")
    keys = []
    if path.is_file():
        for line in path.read_text(encoding="utf-8").splitlines():
            line = line.strip()
            if not line or line.startswith("#"):
                continue
            if "=" in line:
                k, v = line.split("=", 1)
                k = k.strip()
                v = v.strip().strip("'\"")
                if k.startswith("API_KEY") and v:
                    keys.append(v)
    return keys


def read_json(path: Path, default=None):
    if not path.is_file():
        return default
    try:
        return json.loads(path.read_text(encoding="utf-8"))
    except Exception:
        return default


def save_atomic_json(path: Path, data):
    path.parent.mkdir(parents=True, exist_ok=True)
    temp = path.with_suffix(".tmp")
    temp.write_text(json.dumps(data, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
    temp.replace(path)


def source_files(target: str):
    folder = RESOURCE / target
    if not folder.is_dir():
        return []
    return [
        {
            "project": target,
            "source_file": path,
            "rel_path": path.relative_to(folder).as_posix(),
            "file_size": path.stat().st_size
        }
        for path in sorted(folder.rglob("*.java"))
    ]


def discover_cohort():
    targets = []
    for report_path in sorted(SOURCE_RESULT.glob("*/result.json")):
        report = read_json(report_path)
        if report and report.get("verdict") == "NOT_AVAILABLE":
            target = report_path.parent.name
            tasks = source_files(target)
            if not tasks:
                print(f"Warning: No source files found for {target}", file=sys.stderr)
                continue
            targets.append({
                "target": target,
                "sources": [t["rel_path"] for t in tasks]
            })
    return {
        "schema_version": 1,
        "created_at": datetime.now(timezone.utc).isoformat(),
        "targets": targets
    }


def manifest_for_run(write=False):
    if MANIFEST.is_file():
        return read_json(MANIFEST)
    manifest = discover_cohort()
    if write:
        save_atomic_json(MANIFEST, manifest)
    return manifest


def status_path(target):
    return REGEN / "status" / f"{target}.json"


def save_status(target, status, **details):
    save_atomic_json(status_path(target), {
        "target": target,
        "status": status,
        "updated_at": datetime.now(timezone.utc).isoformat(),
        **details
    })


def shard_path(target):
    return REGEN / "shards" / f"{target}.json"


def stage_root(target):
    return REGEN / "staging" / target


def collect_dependency_context(source_path: Path, project_name: str) -> tuple:
    source = source_path.read_text(encoding="utf-8", errors="replace")
    imports = sorted(set(re.findall(r"(?m)^\s*import\s+(?:static\s+)?([^;]+);", source)))
    lines = [
        "Defects4J test runner uses JUnit 4. Keep Java 7/8 syntax.",
        "Use only APIs visible in standard Java libraries or the supplied source/signatures."
    ]
    if imports:
        lines.append("Source imports: " + ", ".join(imports[:50]))

    # Collect sibling signatures
    siblings = []
    for sibling in sorted(source_path.parent.rglob("*.java")):
        if sibling == source_path:
            continue
        content = sibling.read_text(encoding="utf-8", errors="replace")
        declarations = re.findall(
            r"(?m)^\s*(?:public|protected)\s+[^;{}]+(?:\([^;{}]*\))?\s*[;{]", content)
        if declarations:
            siblings.append(sibling.name + ": " + " ".join(
                item.strip().rstrip("{;").strip() for item in declarations[:10]))
        if len(siblings) >= 6:
            break
    signatures = "\n".join(siblings)[:3000] if siblings else "No additional signatures."
    return "\n".join(lines)[:4000], signatures


def compact_java_source(source_code: str) -> str:
    """Strip Javadoc and inline comments to reduce token usage and TTFT."""
    def replacer(match):
        s = match.group(0)
        return " " if s.startswith('/') else s
    pattern = re.compile(
        r'//.*?$|/\*.*?\*/|"(?:\\.|[^\\"])*"|\'(?:\\.|[^\\\'])*\'',
        re.DOTALL | re.MULTILINE
    )
    code = re.sub(pattern, replacer, source_code)
    lines = [line.rstrip() for line in code.splitlines() if line.strip()]
    return '\n'.join(lines)


def build_prompt(source_code: str, dependencies: str = "", signatures: str = "") -> str:
    prompt = PROMPT_TEMPLATE
    prompt = prompt.replace("[DEPENDENCY_SPECIFICATION]", dependencies)
    prompt = prompt.replace("[SIGNATURES]", signatures)
    prompt = prompt.replace("[SOURCE_CODE]", source_code)
    return prompt


def extract_java_code(response_text: str) -> str:
    text = response_text.strip()
    pattern = r"```(?:java|Java)?\s*([\s\S]*?)\s*```"
    code_blocks = re.findall(pattern, text)
    if code_blocks:
        for block in code_blocks:
            if re.search(r'\bclass\s+\w*Test\w*', block) or "@Test" in block:
                return block.strip()
        return max(code_blocks, key=len).strip()
    return text


def get_test_class_name(source_filename: str, java_code: str) -> str:
    match = re.search(r'\bpublic\s+class\s+(\w+)', java_code)
    if match:
        return f"{match.group(1)}.java"
    match = re.search(r'\bclass\s+(\w*Test\w*)', java_code)
    if match:
        return f"{match.group(1)}.java"
    base_name = Path(source_filename).stem
    return f"{base_name}Test.java"


def is_valid_complete_java_test(code_content_or_path) -> bool:
    if not code_content_or_path:
        return False
    if isinstance(code_content_or_path, (Path, str)) and os.path.exists(str(code_content_or_path)):
        try:
            with open(str(code_content_or_path), "r", encoding="utf-8", errors="replace") as f:
                code = f.read().strip()
        except Exception:
            return False
    else:
        code = str(code_content_or_path).strip()

    if len(code) < 100:
        return False

    cleaned = compact_java_source(code)
    if not cleaned.endswith("}"):
        return False

    code_no_strings = re.sub(r'"(?:\\.|[^"\\])*"|\'(?:\\.|[^\'\\])*\'', '""', cleaned)
    if not re.search(r'\bclass\s+\w+', code_no_strings):
        return False

    has_test = bool(re.search(r'@(?:org\.junit\.)?Test\b|\bvoid\s+test\w*\s*\(', code_no_strings))
    if not has_test:
        return False

    depth = 0
    for char in code_no_strings:
        if char == '{':
            depth += 1
        elif char == '}':
            depth -= 1
            if depth < 0:
                return False
    return depth == 0



def call_gemini_api(api_key: str, prompt: str, timeout: int = 90, max_tokens: int = 16384) -> dict:
    url = "https://gen.ai.kku.ac.th/api/v1/chat/completions"
    headers = {
        "Content-Type": "application/json",
        "Authorization": f"Bearer {api_key}"
    }
    payload = {
        "model": "gemini-3.8-flash",
        "messages": [
            {"role": "system", "content": SYSTEM_PROMPT},
            {"role": "user", "content": prompt}
        ],
        "max_tokens": max_tokens,
        "stream": True
    }
    start = time.monotonic()
    resp = requests.post(url, headers=headers, json=payload, stream=True, timeout=(15, timeout))
    if resp.status_code != 200:
        err_msg = f"HTTP {resp.status_code}: {resp.text[:300]}"
        raise RuntimeError(err_msg)

    full_text = ""
    finish_reason = "stop"
    usage = {}

    for line in resp.iter_lines(chunk_size=1024):
        if not line:
            continue
        decoded = line.decode("utf-8", errors="replace").strip()
        if decoded.startswith("data: "):
            data_str = decoded[6:].strip()
            if data_str == "[DONE]":
                break
            try:
                chunk = json.loads(data_str)
                if "usage" in chunk:
                    usage = chunk["usage"]
                choices = chunk.get("choices", [])
                if choices:
                    c = choices[0]
                    content = c.get("delta", {}).get("content", "")
                    if content:
                        full_text += content
                    if c.get("finish_reason"):
                        finish_reason = c["finish_reason"]
            except Exception:
                pass

    elapsed = round(time.monotonic() - start, 2)
    return {
        "content": full_text,
        "usage": usage,
        "elapsed": elapsed,
        "finish_reason": finish_reason
    }



def ready_files(target: str, sources: list):
    state = read_json(shard_path(target), {})
    stage = stage_root(target) / f"{target}_buggy"
    files = []
    seen = set()
    for relative in sources:
        task_id = f"{target}/{relative}"
        record = state.get(task_id, {})
        if record.get("status") != "GENERATED":
            return None
        rec_name = Path(record.get("test_file", "").replace("\\", "/")).name
        candidate = stage / rec_name
        if not candidate.is_file() or candidate.name in seen or not is_valid_complete_java_test(candidate):
            return None
        seen.add(candidate.name)
        files.append(candidate)
    return files


def commit_target(target: str, files: list):
    new_code = TEST_CODE / f"{target}_buggy"
    stage = stage_root(target) / f"{target}_buggy"
    if new_code.exists():
        import shutil
        shutil.rmtree(new_code)
    new_code.parent.mkdir(parents=True, exist_ok=True)
    stage.rename(new_code)
    save_status(target, "COMMITTED",
                generated_files=[p.name for p in files],
                test_code=str(new_code))


def process_target(entry: dict, slot: int, key: str, args):
    target, sources = entry["target"], entry["sources"]
    if STOP.is_set():
        return "STOPPED"

    files = ready_files(target, sources)
    if files is not None:
        commit_target(target, files)
        return "COMMITTED"

    shard_file = shard_path(target)
    state = read_json(shard_file, {})
    stage_dir = stage_root(target) / f"{target}_buggy"
    stage_dir.mkdir(parents=True, exist_ok=True)

    folder = RESOURCE / target
    for rel_path in sources:
        if STOP.is_set():
            return "STOPPED"
        task_id = f"{target}/{rel_path}"
        src_file = folder / rel_path
        if not src_file.is_file():
            save_status(target, "FAILED", reason=f"Source file not found: {rel_path}")
            return "FAILED"

        raw_source = src_file.read_text(encoding="utf-8", errors="replace")
        compacted = compact_java_source(raw_source) if len(raw_source) > 15000 else raw_source
        dependencies, signatures = collect_dependency_context(src_file, target)
        prompt = build_prompt(compacted, dependencies=dependencies, signatures=signatures)

        # Call API
        try:
            api_res = call_gemini_api(key, prompt, timeout=args.timeout)
        except Exception as exc:
            err = str(exc)
            if "quota" in err.lower() or "429" in err or "daily limit" in err.lower():
                save_status(target, "PAUSED", reason=err)
                return "PAUSED"
            save_status(target, "FAILED", reason=err)
            return "FAILED"

        raw_code = extract_java_code(api_res["content"])
        test_class_name = get_test_class_name(src_file.name, raw_code)
        out_test_file = stage_dir / test_class_name
        out_test_file.write_text(raw_code + "\n", encoding="utf-8")

        if not is_valid_complete_java_test(out_test_file):
            save_status(target, "FAILED", reason=f"Generated code in {test_class_name} failed validation")
            state[task_id] = {
                "project": target,
                "source_file": str(src_file),
                "status": "INVALID",
                "error": "Failed validation (syntax or braces)",
                "elapsed_seconds": api_res["elapsed"],
                "usage": api_res["usage"],
                "updated_at": datetime.now(timezone.utc).isoformat()
            }
            save_atomic_json(shard_file, state)
            return "FAILED"

        state[task_id] = {
            "project": target,
            "source_file": str(src_file),
            "status": "GENERATED",
            "model": "gemini-3.8-flash",
            "test_file": str(out_test_file),
            "file_size_bytes": len(raw_code.encode("utf-8")),
            "elapsed_seconds": api_res["elapsed"],
            "finish_reason": api_res["finish_reason"],
            "usage": api_res["usage"],
            "updated_at": datetime.now(timezone.utc).isoformat()
        }
        save_atomic_json(shard_file, state)

    files = ready_files(target, sources)
    if files is None:
        save_status(target, "FAILED", reason="Some files missing after generation")
        return "FAILED"

    commit_target(target, files)
    return "COMMITTED"


def print_status_report(manifest, targets=None, limit=None):
    entries = [e for e in manifest["targets"] if not targets or e["target"] in targets]
    counts = Counter()
    remaining_targets = []
    reports = 0
    verdicts = Counter()
    for entry in entries:
        target = entry["target"]
        rec = read_json(status_path(target), {})
        st = rec.get("status", "PENDING")
        counts[st] += 1
        if st != "COMMITTED":
            remaining_targets.append(f"{target} [{st}]")
        rep = read_json(RESULT / target / "result.json")
        if rep:
            reports += 1
            verdicts[rep.get("verdict", "UNKNOWN")] += 1

    total = len(entries)
    committed = counts["COMMITTED"]
    remaining = total - committed
    pct = 100 * committed / total if total else 0
    print(f"Cohort status: {total} targets")
    print(f"TestCode2 committed: {committed}/{total} ({pct:.1f}%); remaining: {remaining}")
    print(f"  COMMITTED: {committed}; FAILED: {counts['FAILED']}; PAUSED: {counts['PAUSED']}; PENDING: {counts['PENDING']}")
    print(f"Result2 reports: {reports}/{total}")
    if verdicts:
        print("  Verdicts: " + ", ".join(f"{k}={v}" for k, v in sorted(verdicts.items())))
    if remaining_targets:
        print(f"Remaining targets ({len(remaining_targets)}):")
        for t in remaining_targets[:limit or 15]:
            print(f"  {t}")
        if limit and len(remaining_targets) > limit:
            print(f"  ... {len(remaining_targets) - limit} more")


def main(argv=None):
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--execute", action="store_true", help="Generate tests into TestCode2")
    parser.add_argument("--status", action="store_true", help="Report saved progress")
    parser.add_argument("--limit", type=int, help="Limit number of targets")
    parser.add_argument("--targets", nargs="+", help="Restrict to specific targets")
    parser.add_argument("--workers", type=int, default=4, help="Concurrent worker count")
    parser.add_argument("--timeout", type=int, default=180, help="API timeout in seconds")
    args = parser.parse_args(argv)


    manifest = manifest_for_run(write=args.execute)
    all_targets = manifest["targets"]

    if args.status:
        print_status_report(manifest, args.targets, args.limit)
        return 0

    pending = [e for e in all_targets if read_json(status_path(e["target"]), {}).get("status") != "COMMITTED"]
    if args.targets:
        requested = set(args.targets)
        pending = [e for e in pending if e["target"] in requested]
    if args.limit:
        pending = pending[:args.limit]

    print(f"Total NOT_AVAILABLE cohort: {len(all_targets)}; pending: {len(pending)}", flush=True)

    if not args.execute:
        print("Pass --execute to run generation.", flush=True)
        return 0

    keys = load_env_keys()
    if not keys:
        parser.error("No API keys found in .env")

    print(f"Loaded {len(keys)} API keys. Launching {min(args.workers, len(keys))} workers...", flush=True)
    jobs = queue.Queue()
    for e in pending:
        jobs.put(e)

    def worker(slot, key):
        while not STOP.is_set():
            try:
                entry = jobs.get_nowait()
            except queue.Empty:
                return
            target = entry["target"]
            print(f"[key #{slot}] {target}: generating...", flush=True)
            started = time.monotonic()
            try:
                res = process_target(entry, slot, key, args)
            except Exception as exc:
                save_status(target, "FAILED", reason=str(exc))
                res = "FAILED"
            elapsed = int(time.monotonic() - started)
            print(f"[key #{slot}] {target}: {res} ({elapsed}s)", flush=True)
            jobs.task_done()
            if res == "PAUSED":
                jobs.put(entry)
                return

    num_workers = min(args.workers, len(keys))
    pool = ThreadPoolExecutor(max_workers=num_workers)
    try:
        futures = [pool.submit(worker, i + 1, keys[i % len(keys)]) for i in range(num_workers)]
        for f in futures:
            f.result()
    except KeyboardInterrupt:
        STOP.set()
        print("Interrupted by user.", flush=True)
    finally:
        pool.shutdown(wait=True)

    print("Generation step done.", flush=True)
    return 0


if __name__ == "__main__":
    sys.exit(main())
