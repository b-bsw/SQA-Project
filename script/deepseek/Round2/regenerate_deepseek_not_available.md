# DeepSeek TestCode2 and Result2

`TestCode2/` contains the 214 original suites that ran on both Defects4J
revisions, plus newly generated suites from the frozen 638-target
`NOT_AVAILABLE` cohort. Their reports live under `Result2/`. The original
`TestCode/` and `Result/` remain the original dataset. Existing reports for
the 214 suites are copied without rerunning tests; new suites get reports
after Defects4J verification.

The one-time layout migration moves the old `Regeneration/` control files
under `TestCode2/.work/`. Partial generation stays in `.work/staging/` until
all source files for its target yield complete Java. It also restores the
original `Mockito_29` code and report to `TestCode/` and `Result/`, while
placing the regenerated pilot in `TestCode2/` and `Result2/`.

The already complete `Chart_12` and `Chart_13` candidates were published to
`TestCode2/` without running Defects4J. They currently have no `Result2`
reports. Use `--verify-only` when ready to test them.

Run generation yourself from WSL in the repository root:

```bash
# Inspect the frozen cohort; no API or Defects4J call
python3 script/Round2/regenerate_deepseek_not_available.py

# Show saved generation and Result2 progress; no API calls or file writes
python3 script/Round2/regenerate_deepseek_not_available.py --status

# List non-committed targets and their saved states; use --limit 10 to shorten the list

# Show details for selected targets (or use --status --limit 10 for first 10 rows)
python3 script/Round2/regenerate_deepseek_not_available.py --status --targets Chart_11 Chart_14

# Show every bug ID in one project family; the name is JacksonDatabind
python3 script/Round2/regenerate_deepseek_not_available.py --status --project JacksonDatabind
python3 script/Round2/regenerate_deepseek_not_available.py --execute  --project JacksonDatabind --workers 8 
# Save the actual initial system/user prompt for a target; no API call
python3 script/Round2/regenerate_deepseek_not_available.py --preview-prompt Mockito_29

# Phase 1: Generate all pending NOT_AVAILABLE targets with five API workers
# Requires five configured API keys. This phase only writes TestCode2 and state/logs.
python3 script/Round2/regenerate_deepseek_not_available.py --execute --workers 5

# To use two WSL terminals with the same keys, stop any older unpartitioned
# run first, then start these commands in separate terminals. Use the same
# worker count in both commands (8 here requires 8 configured keys).
# The front and back halves are fixed by manifest position, even after reruns.
# Back starts at the last target and works toward the middle.
python3 script/Round2/regenerate_deepseek_not_available.py --execute --partition front --workers 8
python3 script/Round2/regenerate_deepseek_not_available.py --execute --partition back --workers 8

# Publish any complete staged suites without API or Defects4J calls
python3 script/Round2/regenerate_deepseek_not_available.py --publish-ready

# Phase 2: Create Result2 reports after generation; no generation API requests
python3 script/Round2/regenerate_deepseek_not_available.py --verify-only --verify-workers 2 --test-timeout 600
```

`--execute` never starts Defects4J verification, including when generation is
already complete, an API key pauses, or a target fails. Resume the same command
to generate remaining targets. Run `--verify-only` separately when ready; it
skips targets that already have a Result2 report. `--targets` and `--limit`
also apply to this verification phase.
`--project NAME` filters all phases to one project family, and can be combined
with `--partition` or `--targets`.

The two `--partition` commands never select the same target. Each target has
its own generation state and staging directory, and processes sharing a key
lock its budget ledger during updates. Existing runs launched before this
change do not use that lock; finish or stop them before starting both commands.
The two terminals make up to two simultaneous requests per key, so compare
completed targets per hour and API 429 responses before keeping this setting.

`--status` summarizes committed/remaining targets, FAILED/PAUSED counts,
source files recorded as GENERATED, and Result2 report counts and verdicts
for committed targets in the frozen cohort. A report's existence does not
mean its tests passed. `--targets` filters the summary; `--limit` caps detail
rows only. This is a snapshot of saved files, not live worker detection;
saved failure/pause states may belong to an earlier attempt. It cannot be
combined with execution, publication, verification, or prompt preview modes.

New generator state entries record `model`, `thinking`, `reasoning_effort`,
and `max_tokens`. The thinking fields describe requested parameters, not a
confirmed server configuration. By default both are `null` and omitted from
the API request. Older state entries are not backfilled with guessed values.

The supplied `api doc.pdf` documents `max_tokens` for `/chat/completions`
(pages 5-6), but lists `thinking` only for the Anthropic `/messages` endpoint
(pages 7-8). It does not document `reasoning_effort`. The optional
`--thinking enabled|disabled` and `--reasoning-effort low|high|max` flags are
provider-specific passthrough settings; support by KKU's chat endpoint is
unconfirmed. Both the cohort runner and standalone generator accept them.
Do not combine disabled thinking with a reasoning effort.

The default API request cap is `--max-tokens 100000`. The local daily budget
is `--budget-limit 1000000` per API key. Existing ledger usage for the day is
retained, so the displayed remaining amount is less than 1,000,000 if tokens
have already been spent.

Prompt previews, generation state, and logs are under `TestCode2/.work/`.
Generation sends source and available dependency metadata to DeepSeek. It
does not send compiler errors, failure logs, or old generated tests. The
unchanged `Promt/promt.md` remains the prompt template.

To rebuild only the combined `Result2/report.csv` without running Defects4J:

```bash
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --collect-only --result-root Deepseek-flash-v4/Result2
```
