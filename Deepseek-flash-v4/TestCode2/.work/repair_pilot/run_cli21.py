#!/usr/bin/env python3
"""One isolated repair attempt for the original Cli_21 test suite."""

import json
import shutil
import sys
from pathlib import Path


ROOT = Path(__file__).resolve().parents[4]
PILOT = Path(__file__).resolve().parent
sys.path.insert(0, str(ROOT / "script"))

from generate_deepseek_tests import call_single_api_stream, get_all_api_keys


def main():
    old_dir = ROOT / "Deepseek-flash-v4" / "TestCode" / "Cli_21_buggy"
    test_dir = PILOT / "TestCode" / "Cli_21_buggy"
    error_log = ROOT / "Deepseek-flash-v4" / "Result" / "Cli_21" / "logs" / "buggy_test.log"
    option_file = PILOT / "Option.java"
    if not option_file.is_file():
        raise SystemExit("Copy the actual Cli 21b Option.java to the pilot directory first")
    keys = get_all_api_keys()
    if not keys:
        raise SystemExit("No API key configured")

    original = (old_dir / "WriteableCommandLineTest.java").read_text(encoding="utf-8")
    compiler_error = "\n".join(
        line for line in error_log.read_text(encoding="utf-8").splitlines()
        if "error:" in line or "private static class TestOption" in line
    )
    prompt = (
        "Repair the existing Java JUnit test file below for Defects4J Cli 21b. "
        "The reported compile error is in its TestOption helper class. "
        "Preserve the existing tests, assertions, public test class name, and package. "
        "Make only the changes needed to compile against the provided Option interface. "
        "Do not replace tests with empty stubs or remove failing tests. "
        "Return exactly the complete WriteableCommandLineTest.java file, Java source only.\n\n"
        f"COMPILER ERROR:\n{compiler_error}\n\n"
        f"ACTUAL Cli 21b Option.java:\n{option_file.read_text(encoding='utf-8')}\n\n"
        f"ORIGINAL WriteableCommandLineTest.java:\n{original}"
    )
    PILOT.mkdir(parents=True, exist_ok=True)
    (PILOT / "prompt.txt").write_text(prompt, encoding="utf-8")
    print(f"Prompt characters: {len(prompt):,}", flush=True)
    result = call_single_api_stream(
        keys[0], prompt, reasoning_effort="low", max_tokens=30000,
        max_retries=1, timeout=90,
    )
    content = result.get("content", "")
    (PILOT / "response.raw.txt").write_text(content, encoding="utf-8")
    metadata = {key: value for key, value in result.items() if key not in ("content", "reasoning", "model_quota")}
    (PILOT / "api_result.json").write_text(json.dumps(metadata, indent=2, ensure_ascii=False), encoding="utf-8")
    if not result.get("success"):
        print(f"API failed: {metadata}", flush=True)
        return 1
    if not content.lstrip().startswith("package org.apache.commons.cli2;"):
        print("Response is not raw Java source; saved without alteration", flush=True)
        return 2
    test_dir.mkdir(parents=True, exist_ok=True)
    for source in old_dir.glob("*.java"):
        shutil.copy2(source, test_dir / source.name)
    (test_dir / "WriteableCommandLineTest.java").write_text(content, encoding="utf-8")
    print(f"Staged unedited AI response in {test_dir}", flush=True)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
