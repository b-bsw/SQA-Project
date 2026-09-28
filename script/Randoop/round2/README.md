# Randoop รอบ 2

รันจาก root repository ใน WSL ใช้ seed **20260928** ซึ่งต่างจากรอบ 1 และ budget **60 วินาทีต่อ bug**

```bash
cd /mnt/e/JavaEclipe/defect4j/SQA-Project
python3 script/Randoop/round2/generate.py --prepare-only
python3 script/Randoop/round2/generate.py --dry-run
python3 script/Randoop/round2/generate.py --workers 2
python3 script/Randoop/round2/generate.py --status
python3 script/Randoop/round2/results.py --workers 2
python3 script/Randoop/round2/results.py --collect-only
```

state อยู่ `Feedback-Directed Random Test Generation/rounds/Round2/` เทสต์อยู่ TestCode_Round2 ผลอยู่ Result_Round2 และ CSV รวมอยู่ Result_Round2/report.csv กับ report_Round2.csv แยกจากรอบ 1

`results.py --collect-only` รวมผลที่มีอยู่และใส่ `verdict=FAIL` สำหรับเป้าหมายใน `Resoucre/` ที่ไม่มีไฟล์ Java ใน TestCode_Round2 โดยไม่รันทดสอบใหม่

ทดลองกลุ่มเดียวก่อน: `python3 script/Randoop/round2/generate.py --projects Codec --workers 1` แล้ว `python3 script/Randoop/round2/results.py --projects Codec --workers 1`

กด Ctrl+C แล้วใช้คำสั่งเดิมเพื่อ resume ห้ามรัน generator สองรอบพร้อมกัน อย่าเปลี่ยน seed/time limit หลังเริ่มรอบนี้ results.py อ่าน seed/budget จาก state และไม่สร้างเทสต์ใหม่

อ่าน [คู่มือตั้งแต่เริ่มต้น](../README.md) สำหรับการติดตั้งและเปรียบเทียบผล

## เวลารวมของคำสั่ง

ทั้ง generate.py และ results.py แสดงเวลารวมตั้งแต่เริ่มทำงานจนจบ และเก็บ JSON แยกครั้งใน `Feedback-Directed Random Test Generation/rounds/Round2/script_runs/` มี total_duration_seconds, started_at, finished_at, status และ phase เพื่อแยกเวลา generation ออกจาก results/collect-only

บันทึกลง `rounds/Round2/generation_state.json` โดยตรงด้วย ดู `_script_runs.latest.total_duration_seconds` สำหรับครั้งล่าสุด และ `_script_runs.history` สำหรับประวัติทุกครั้ง หลังคำสั่งจบหรือ Ctrl+C

เวลา Java/Randoop ต่อ bug ไม่รวมทั้งสคริปต์ เวลารวม generate.py รวมการเตรียม, สร้างเทสต์, บันทึก state, cleanup และรอ workers ส่วน results.py วัดการประเมินผลและรวมรายงานทั้งหมดเป็นอีกคำสั่งหนึ่ง `--collect-only` วัดเฉพาะการรวมรายงาน

`--status`/`--dry-run` แสดงเวลาแต่ไม่เขียนไฟล์เวลา หากต้องการวัดงานซ้ำให้เติม `--overwrite` เวลารวม batch ไม่ใช่ผลบวกเวลา workers ที่ทำพร้อมกัน

หากโปรเจกต์ค้างนาน ใช้ `--project-timeout 300` กับ generate.py (ค่าเริ่มต้น 600 วินาทีรวมการเตรียมโปรเจกต์) และ `--test-timeout 600` กับ results.py ซึ่งบังคับแต่ละคำสั่ง checkout/compile/test/coverage ดูรายละเอียดในคู่มือรวม
