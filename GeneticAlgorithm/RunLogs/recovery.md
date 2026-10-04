# Missing GA target recovery

Reference inventory: `Resoucre` has 852 targets. Existing GA additionally has
`Closure_175` and `Closure_176`, which are preserved.

| Target | Generation | Saved tests | V2 Round1 / Round2 | Line | Condition |
|---|---|---:|---|---:|---:|
| Gson_8 | FAIL: JVM SIGSEGV | 0 | FAIL / FAIL | — | — |
| JacksonCore_4 | PASS | 56 | OK / OK | 99.24% | 97.76% |
| JacksonCore_26 | PASS | 54 | OK / OK | 18.49% | 12.20% |

Generation used the bundled EvoSuite 1.2.0, STANDARD_GA, LINE:BRANCH,
seed 20260918 and 120-second search budget per modified class. The complete
target deadline was 1800 seconds. JacksonCore completed with JDK 11, separate
client processes (`EVOSUITE_CLIENT_ON_THREAD=false`) and ALL assertions
(`EVOSUITE_ASSERTION_STRATEGY=ALL`). The first attempts used the original
MUTATION assertions: JacksonCore_4 ran out of heap; JacksonCore_26 encountered
an EvoSuite CFG error with the in-thread client.

Gson_8 crashed with SIGSEGV on JDK 11 (G1 and Serial GC), a separate client
process, and a JDK 8 compatibility trial. No Java test source was produced.
See `Gson_8-generation*.log` and `Gson_8-r1/generate-*.log` for evidence.
These are generation failures, not successful generation with unavailable
execution. No hand-written test was substituted for the GA algorithm.

V2 ran the same saved JacksonCore sources independently in Round1 and Round2,
using `run_ga_results_v2.py`, JDK 11 and `--timeout-seconds 1800`. Gson has one
failed result per round, so it is failure A in both coverage metrics. Previously
saved result.json files for other targets were not edited.

Saved source files contain 854 results per round, covering all 852 reference
targets plus the two existing Closure extras. Summaries now exclude those two
extras and count exactly 852 results per round (1704 over both rounds).
There are 851 reference targets with Java tests; Gson_8 remains missing and
is explicitly listed in ResourceCheck. The two extra Java test folders are
preserved outside the reporting cohort.
