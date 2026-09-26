# DeepSeek scripts

Run commands from the repository root.

- Round 1: generate tests from source code without project dependency metadata.
- Round 2: regenerate the NOT_AVAILABLE cohort with dependency metadata; state and staging live in `Deepseek-flash-v4/state/Round2/`.
- The shared `Deepseek-flash-v4/Code/run_deepseek_tests.py` runs generated `TestCode` and collects results. Round 1 and Round 2 do not run tests.

See `Round1/generate_deepseek_tests.md`, `Round2/regenerate_deepseek_not_available.md`, and `../README.md` for commands.
