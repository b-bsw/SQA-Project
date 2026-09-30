# EvoSuite Genetic Algorithm

Directory นี้เหลือเฉพาะไฟล์ที่จำเป็นสำหรับรัน EvoSuite แบบ `STANDARD_GA`:

```text
Code/
├── run_evosuite_ga.sh       รัน experiment สำหรับหนึ่ง project/bug
├── run_ga_results_v2.py     วัด Defects4J coverage ของเทสต์ GA ที่เก็บไว้
├── collect_ga_reports.sh    รวม per-bug report ของแต่ละ round
├── merge_round_reports.sh   รวม report ของ Round 1 และ Round 2
├── evosuite-1.2.0.jar       EvoSuite
└── README.md
```

## การใช้งาน

```bash
cd GenericAlgorithm/Code

# PROJECT BUG_IDS RESULT_ROUND BUDGET_SECONDS
./run_evosuite_ga.sh Chart 1 1 120
./run_evosuite_ga.sh Chart 1 2 120

# หลาย bug พร้อมกัน (default สูงสุด 2 processes)
./run_evosuite_ga.sh Chart 1,2,3 1 120

# ปรับจำนวนที่รันพร้อมกัน
MAX_PARALLEL=4 ./run_evosuite_ga.sh Chart 1,2,3,4 1 120

# รวม report ของแต่ละ round
./collect_ga_reports.sh 1
./collect_ga_reports.sh 2

# รวมทั้งสอง round เป็น GenericAlgorithm/report.csv
./merge_round_reports.sh
```

Java ถูกตั้งเป็น `11.0.31-amzn` ผ่าน SDKMAN ภายในสคริปต์ ค่า default คือ
budget 120 วินาทีและ seed `20260918`

สคริปต์ใส่ compiled subject classes ไว้ทั้งใน JVM classpath และ EvoSuite
`projectCP` เพื่อรองรับการ instrument dependency ของโปรเจกต์เก่า เช่น
`org.jfree.data.Range` ใน Chart-26

Batch mode จะรวม `Result_RoundN/report.csv` ให้อัตโนมัติเมื่อทุก target จบ
EvoSuite ใช้ memory สูงสุดประมาณ 2 GB ต่อ process จึงควรกำหนด
`MAX_PARALLEL` ให้เหมาะกับ RAM

## ขั้นตอน

```text
checkout buggy → compile → generate tests ด้วย EvoSuite GA → test buggy
ลบ buggy checkout
checkout fixed → compile → test ด้วย generated tests ชุดเดิม
ลบ fixed checkout
บันทึก generated Java และ report
```

checkout, build, log และ `evosuite-tests.tar.bz2` อยู่ใน temporary directory
ระหว่างการทำงานเท่านั้น และถูกลบเมื่อสคริปต์จบ จึงไม่มี archive อยู่ใน
`TestCode`

## Output

```text
TestCode/Chart_1/                         generated `.java` files
Result_Round1/Chart_1/result.csv          Round 1 report
Result_Round1/Chart_1/result.json
Result_Round2/Chart_1/result.csv          Round 2 report
Result_Round2/Chart_1/result.json
Result_Round1/report.csv                  aggregated Round 1 report
Result_Round2/report.csv                  aggregated Round 2 report
report.csv                                report รวม Round 1 และ Round 2
```

CSV schema:

```csv
"round","project","bug_id","seed","budget","tests","coverage","line_cov","branch_cov","total_goals","covered_goals","lines","covered_lines","total_branches","covered_branches","buggy_result","buggy_fails","fixed_result","fixed_fails","verdict"
```

`result.csv` เก็บ overall, line และ branch coverage รวมถึง goal, line และ
branch counts ส่วน `result.json` เก็บ method counts และข้อมูลแยกตาม target
class เพิ่มเติม โดยไม่มีไฟล์ statistics แยกต่างหาก

- `REVEALING`: buggy fail และ fixed pass
- `NOT_REVEALING`: buggy และ fixed pass ทั้งคู่
- `INCONCLUSIVE`: ผลการทดสอบคู่อื่น
- `NOT_AVAILABLE`: checkout, compile หรือ test ไม่สำเร็จ

## V2: วัด Condition Coverage จากเทสต์ที่มีอยู่

สคริปต์นี้ใช้ไฟล์ Java ใน `TestCode/PROJECT_BUG` โดยไม่เรียก EvoSuite เพื่อสร้าง
เทสต์ใหม่ ผล Round 1 และ Round 2 ในงานนี้วัดจาก `TestCode` ชุดเดียวกัน
จึงควรได้ค่า coverage ใกล้เคียงหรือเท่ากัน ให้รันจากราก repository ที่ติดตั้ง
Defects4J แล้ว:

```bash
export DEFECTS4J_BIN=/path/to/defects4j/framework/bin/defects4j
export GA_JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
python3 GeneticAlgorithm/Code/run_ga_results_v2.py all \
  --tests-root GeneticAlgorithm/TestCode \
  --results-root GeneticAlgorithm/Result_v2_Round2 \
  --jobs 8 --resume
```

ผลอยู่ใน `Result_v2_Round2/PROJECT_BUG/result.csv`, `result.json`, `coverage.log`
และรายงานรวม `Result_v2_Round2/report.csv` ส่วน `report.csv` ที่ราก
`GeneticAlgorithm` รวมผล V2 ทั้งสองรอบ และ `summary.xlsx` แสดง Dashboard กับ
ข้อมูลรายรายการ ค่า `line_coverage` และ
`condition_coverage` เป็นเปอร์เซ็นต์ 0–100 ที่คำนวณจาก `summary.csv` ของ
`defects4j coverage` บน buggy revision ค่า `TESTS_FAILED` หมายถึงวัด coverage
สำเร็จแต่มีเทสต์ล้มเหลว; `NOT_AVAILABLE` เว้นค่า coverage ว่างและดูสาเหตุใน log

`--resume` ข้ามรายการที่มี `result.json` แล้วเมื่อรันต่อหลังหยุดงาน
หากต้องการวัดจากเทสต์คนละชุด ให้ระบุโฟลเดอร์นั้นด้วย `--tests-root PATH`
ซึ่งต้องมีโฟลเดอร์ย่อยชื่อ `PROJECT_BUG` เหมือน `TestCode`
