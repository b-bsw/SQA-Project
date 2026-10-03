# Coverage summaries

Every recorded result contributes one case. Recorded-only coverage averages
numeric values, including 0%. All-results coverage divides their sum by all
recorded results, treating missing values as zero. Each metric has its own
recorded count. Empty groups show “—” for both averages; groups containing only
missing coverage show “—” for recorded-only and 0% for all-results.

Each workbook retains Dashboard and Data and adds Coverage, with both averages
and both denominators for every project, each round and all rounds. Dashboard
also includes the paired overall and round summaries below its existing metrics.
The new formulas reference raw Data cells, which retain missing values as blanks.

Rebuild all four workbooks from saved results without running Java tests:

```powershell
python script/coverage_summaries.py
python script/build_report_site.py
```

Use `--group Gemini-3.8-flash` (or another group name) to rebuild one workbook.
The existing Gemini, DeepSeek and Randoop summary commands also refresh the paired
views. GA can be rebuilt with `--group GeneticAlgorithm`; it reads
`Result_v2_Round1/report.csv` and `Result_v2_Round2/report.csv`. The website keeps
its existing GA Round1/Round2 sources; those are a different experiment from V2.

Workbook authoring uses Node and `@oai/artifact-tool` from Codex's bundled runtime.
On other hosts set `ARTIFACT_TOOL_NODE` to a Node executable and
`ARTIFACT_TOOL_MODULES` to the directory containing `@oai/artifact-tool`.
No Java or Defects4J installation is needed to rebuild these reports.
Use `--preview-dir PATH` to render the changed workbook views.

Validation:

```powershell
python -m unittest discover -s script -p test_paired_coverage.py -v
python -m unittest discover -s script -p test_deepseek_coverage_reports.py -v
```

For browser checks, serve the repository at localhost port 8765, then run
`node script/test_report_site.cjs` with the same runtime package directory.
`SQA_REPORT_URL` overrides the local URL; `SQA_REPORT_PREVIEW` enables screenshots.
The browser check uses headless Edge on Windows and Playwright Chromium elsewhere.
