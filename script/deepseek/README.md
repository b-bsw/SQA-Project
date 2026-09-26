# Script organization

Only the DeepSeek scripts are grouped by test-generation round:

- `Round1/` contains the original DeepSeek generation workflow and its result runner. The original dataset is stored in `Deepseek-flash-v4/TestCode/` and `Deepseek-flash-v4/Result/`.
- `Round2/` contains the DeepSeek regeneration, repair, and migration workflow for the separate `Deepseek-flash-v4/TestCode2/` and `Deepseek-flash-v4/Result2/` datasets.
- Gemini, Randoop, and other scripts stay directly in `script/`, as before.
- The Defects4J report helper stays at this level because it is shared by both rounds: `generateReport.sh`, `generateReport.md`, and the aggregate `report.csv`.

Run commands from the repository root. For example:

```bash
python3 script/Round1/generate_deepseek_tests.py --status
python3 script/Round2/regenerate_deepseek_not_available.py --status
cd data/Codec1buggy
bash ../../script/generateReport.sh
```
