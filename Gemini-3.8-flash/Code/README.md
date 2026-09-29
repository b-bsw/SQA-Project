# Gemini 3.8 Flash Test Execution Workflow

Run commands from the repository or project directory on WSL/Linux with Python 3.9+, Java, and Defects4J.

## Run tests and collect results

`run_gemini_tests.py` consumes existing generated Java tests in `TestCode/`, executes them on both the buggy and fixed revisions using Defects4J, measures code coverage on the buggy revision, and collects per-target results.

```bash
# Preview targets
python3 Code/run_gemini_tests.py --dry-run

# Run all targets with 6 parallel workers
python3 Code/run_gemini_tests.py --workers 6

# Run specific project or targets
python3 Code/run_gemini_tests.py --projects Chart Cli --workers 4
python3 Code/run_gemini_tests.py --targets Chart_1 Cli_1

# Rebuild summary.xlsx (Dashboard + Data)
python3 Code/run_gemini_tests.py --summary-only

# Rebuild report.csv and summary.xlsx from existing result files
python3 Code/run_gemini_tests.py --collect-only
```

## Output Structure

The runner produces output identical to the DeepSeek workflow:

- `Result/<target>/`:
  - `result.json`: Detailed verdict, test count, revision outcomes, coverage, and execution times.
  - `result.csv`: Single-row CSV report for the target.
  - `logs/`: defects4j command logs (`buggy.log`, `buggy_test.log`, `fixed.log`, `fixed_test.log`, `buggy_coverage.log`, and `*_failing_tests.txt`).
- `Result/report.csv` & `report.csv`: Aggregated CSV report across all targets.
- `summary.xlsx`: Outer Excel workbook with two sheets:
  - **Dashboard**: Summary metrics, verdict counts, total tokens, generation times, and coverage averages.
  - **Data**: Row-level metrics with table filters and exact counts.
