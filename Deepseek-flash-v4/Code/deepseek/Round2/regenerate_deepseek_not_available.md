# DeepSeek Round 2: dependency-informed test generation

Round 2 reads the frozen `NOT_AVAILABLE` cohort from `Result/` and source files
from `Resoucre/`. It sends the source together with available project
dependency metadata and sibling signatures, then writes complete tests to
`TestCode2/`. This script only generates tests; run them separately with
`Code/run_deepseek_tests.py`.

Round 1 and Round 2 share the existing `Deepseek-flash-v4/state/` root. Round 2
generation state, staging, prompt previews, and logs live in
`Deepseek-flash-v4/state/Round2/`. Partial test files stay in
`state/Round2/staging/` until a target is complete, then are published to
`TestCode2/`. The original tests in `TestCode/` remain separate.

Run from the repository root on WSL/Linux with Python 3.9+ and configured API
keys:

```bash
# Inspect cohort and saved progress without API calls
python3 Deepseek-flash-v4/Code/deepseek/Round2/regenerate_deepseek_not_available.py --status

# Preview the prompt for one target without an API call
python3 Deepseek-flash-v4/Code/deepseek/Round2/regenerate_deepseek_not_available.py --preview-prompt Mockito_29

# Generate pending targets; each worker needs a configured API key
python3 Deepseek-flash-v4/Code/deepseek/Round2/regenerate_deepseek_not_available.py --execute --workers 5

# Optional stable halves for separate terminals
python3 Deepseek-flash-v4/Code/deepseek/Round2/regenerate_deepseek_not_available.py --execute --partition front --workers 4
python3 Deepseek-flash-v4/Code/deepseek/Round2/regenerate_deepseek_not_available.py --execute --partition back --workers 4

# Run generated Java tests later, through the shared result collector/runner
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --test-root Deepseek-flash-v4/TestCode2 --result-root Deepseek-flash-v4/Result2 --workers 2
```

Use `--project NAME`, `--targets`, and `--limit` to narrow generation.
`--publish-ready` publishes any complete staged suites without making API
requests. `--status` reports generation progress and any existing `Result2`
reports; it does not run tests. Prompt previews and generation records are
stored under `state/Round2/`, next to Round 1 state under `state/Round1/`.

The shared runner writes per-target results under `Result2/`, a combined
`Result2/report.csv`, and the workspace-level `Deepseek-flash-v4/summary.xlsx`
(Dashboard and Data sheets).
The summary includes line coverage, revealing counts, generation tokens and
time, and test runtime for both rounds.
