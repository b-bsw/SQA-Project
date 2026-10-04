# Summary workbooks

Coverage, verdict classification, Excel generation and their tests live together
in this folder. Reports are integrated into each approach's `summary.xlsx`;
the summary command does not create CSV, JSON or Markdown sidecars.

Rebuild all four workbooks from saved results without running Java or updating
the website:

```powershell
python script/coverage_summaries.py
```

Use `--group Gemini-3.8-flash` (or another approach's directory name) for one
workbook, and `--preview-dir PATH` for rendered previews. Existing summary commands
for individual approaches also use this implementation.

| Sheet | Contents |
|---|---|
| Dashboard | Main coverage and verdict totals |
| Data | Original saved values; missing coverage stays blank |
| Coverage | Numeric/A/B counts, both means and runnable rate by project/round |
| CoverageCases | N/A, unresolved cases, buggy measurements and sources; filterable |
| BugResults | One bug/round, generation failures, partial/stale/unknown flags and sources; filterable |
| Verdicts | Five verdict counts and percentages by project/round |
| StatusChecks | Five-status sums compared with Resource |
| UnavailableCauses | Buggy only, fixed only, both, or coverage-only unavailable |
| ResourceCheck | Missing/extra results and test directories |
| Intersection | Shared bugs and contributing round counts |
| ReportNotes | Definitions, worked calculations and comparisons with previous rules/slides |
| StatusChanges | Saved verdict versus derived verdict changes |

The current `Resoucre` inventory has 854 active bugs. Each bug/round is one result;
GA, Randoop and DeepSeek pool 1,708 results, while Gemini has only Round1 (854).
Extra targets are excluded; missing results are listed rather than invented.

Recorded-only coverage divides the sum of applicable numeric values by their
count, including 0%. All-applicable coverage divides the same sum by total minus
successful zero-total metrics (B, N/A); failed measurements (A) count as 0%.
Both means exclude B. Unknown classifications remain pending.

Coverage uses buggy measurements. Verdicts require paired buggy/fixed evidence;
valid buggy coverage remains even when fixed is unavailable. Latest whole-bug
generation failures invalidate stale values. Partial generation with usable tests
follows execution evidence. Source result JSON/CSV files are read without edits.

GA prefers paired V2 evidence when present, otherwise legacy paired evidence.
The saved GA suite is repeated in both rounds; these are not independent generation
rounds. Combined intersection first averages numeric rounds per method/bug.
Round2 has no four-method intersection because Gemini has no Round2.

Workbook authoring uses Node and `@oai/artifact-tool` from the bundled runtime.
Other hosts can set `ARTIFACT_TOOL_NODE` and `ARTIFACT_TOOL_MODULES`. No Java or
Defects4J installation is needed to rebuild saved reports.

Run summary regression tests:

```powershell
python -m unittest discover -s script -p "test_*.py" -v
```

The website generator is a separate command and is not invoked by summary.
