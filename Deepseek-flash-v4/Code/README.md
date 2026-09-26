# DeepSeek test workflow

Run commands from the repository root on WSL/Linux with Python 3.9+, Java,
Defects4J, and configured DeepSeek API keys.

## Generate tests

- **Round 1** generates from the target source without project dependency
  metadata. See `deepseek/Round1/generate_deepseek_tests.md`.
- **Round 2** generates from source plus available dependency metadata and
  sibling signatures. Its state, logs, and staging files are stored in
  `Deepseek-flash-v4/state/Round2/`. See
  `deepseek/Round2/regenerate_deepseek_not_available.md`.

Both rounds only create Java test code. Neither round runs Defects4J tests.

## Run tests and collect results

`run_deepseek_tests.py` consumes already generated Java tests, runs them on the
buggy and fixed revisions, and collects per-target results. It does not call
the DeepSeek API or generate tests.

```bash
# Preview the targets
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --dry-run --targets Chart_1 Cli_5

# Run Round 1 TestCode
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --workers 4

# Run Round 2 TestCode2 and collect into Result2
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py \
  --test-root Deepseek-flash-v4/TestCode2 \
  --result-root Deepseek-flash-v4/Result2 --workers 4

# Rebuild the outer summary.xlsx (Dashboard + Data)
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --summary-only

# Rebuild the selected result root's report.csv plus the outer summary files
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --collect-only
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --collect-only \
  --test-root Deepseek-flash-v4/TestCode2 \
  --result-root Deepseek-flash-v4/Result2
```

The runner saves each result under the selected result root and rebuilds that
root's `report.csv`. It also writes `Deepseek-flash-v4/summary.xlsx` at the
outermost Deepseek directory with exactly two sheets:

- **Dashboard**: per-round and overall coverage averages, revealing counts and
  rates, tokens, generation times, verdict counts, and coverage record counts.
- **Data**: one row per result, with filters and a frozen header.

Coverage averages use available per-target values. Durations are in seconds;
missing metrics remain blank. Dashboard formulas update when Data values change.
The runner uses the bundled `Code/summary_template.xlsx` and Python's standard
library, so updating the workbook needs no extra package. Workbook creation is
included directly in `run_deepseek_tests.py`. `summary.xlsx` is the summary output;
`--summary-only` refreshes both sheets without running tests or rewriting
`Result/report.csv`.

## Recover historical test times

```powershell
& C:/Python314/python.exe Deepseek-flash-v4/Code/backfill_deepseek_test_times.py
```

This reads both `Result` and `Result2`, fills missing revision timings in
`result.json`, and refreshes each `result.csv`, both `report.csv` files, and
`summary.xlsx`. Add `--dry-run` to see counts without writing files. Existing
timings are preserved. The collector also recovers missing timings when collecting
reports.

CSV columns `buggy_test_seconds`, `fixed_test_seconds`, and `test_run_seconds`
store the timings. The total is available only when every attempted test command
has a known duration. New runs measure the full Defects4J test command (including
generated-test compilation) and append `[test_seconds: ...]` to its log.
The `*_test_time_source` columns distinguish `measured_wall_clock`,
`log_wall_clock`, and `log_ant_total`. Ant durations recovered from old logs have
the precision shown in the log and exclude Defects4J extraction overhead.
Historical logs with no duration remain blank; timestamps and timeout limits
are not treated as measured runtimes.

If `summary.xlsx` is locked by Excel, close it and run the collector with
`--summary-only` again. The summary output is always `summary.xlsx`; recovered
JSON/CSV timings are already saved.
