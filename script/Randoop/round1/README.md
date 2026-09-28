# Randoop รอบ 1

รันจาก root repository ใน WSL ใช้ seed **0** และ budget **60 วินาทีต่อ bug** ตามค่าเริ่มต้น

```bash
cd /mnt/e/JavaEclipe/defect4j/SQA-Project
python3 script/Randoop/round1/generate.py --prepare-only
python3 script/Randoop/round1/generate.py --status
python3 script/Randoop/round1/generate.py --dry-run
python3 script/Randoop/round1/generate.py --workers 2
python3 script/Randoop/round1/results.py --workers 2
python3 script/Randoop/round1/results.py --collect-only
```

state อยู่ `Feedback-Directed Random Test Generation/rounds/Round1/` เทสต์อยู่ TestCode เดิม ผลอยู่ Result เดิม และ report.csv

`results.py --collect-only` รวมผลที่มีอยู่และใส่ `verdict=FAIL` สำหรับเป้าหมายใน `Resoucre/` ที่ไม่มีไฟล์ Java ใน TestCode รอบ 1 โดยไม่รันทดสอบใหม่

นำ state เก่าเข้ารอบนี้โดยไม่ลบของเดิม รายการ COMPLETED ที่ seed/เวลาไม่ตรงหรือไม่ทราบ seed จะสร้างใหม่ รายการที่ตรงแล้วจะข้าม หากเคยเก็บผลก่อนเทสต์เปลี่ยน ให้ใช้ `results.py --targets <เป้าหมายที่เปลี่ยน> --overwrite` เพื่อให้รายงานตรงกับเทสต์ใหม่

กรองกลุ่มด้วย `generate.py --projects Codec Cli` กรองผลด้วย `results.py --targets Codec_1 Cli_1` ใช้คำสั่งเดิมเพื่อ resume

อ่าน [คู่มือตั้งแต่เริ่มต้น](../README.md) ก่อนรันเต็มชุด

## เวลารวมของคำสั่ง

ทั้ง generate.py และ results.py แสดงเวลารวมตั้งแต่เริ่มทำงานจนจบ และเก็บ JSON แยกครั้งใน `Feedback-Directed Random Test Generation/rounds/Round1/script_runs/` มี total_duration_seconds, started_at, finished_at, status และ phase เพื่อแยกเวลา generation ออกจาก results/collect-only

บันทึกลง `rounds/Round1/generation_state.json` โดยตรงด้วย ดู `_script_runs.latest.total_duration_seconds` สำหรับครั้งล่าสุด และ `_script_runs.history` สำหรับประวัติทุกครั้ง หลังคำสั่งจบหรือ Ctrl+C

เวลา Java/Randoop ที่แสดงต่อ bug เป็นเพียงช่วง subprocess ส่วนเวลารวม generate.py รวมสแกน, checkout, compile, สร้างเทสต์, บันทึก state, cleanup และรอ workers เวลารวม results.py รวมงานประเมินผลทุกเป้าหมายและรวม CSV เวลาสองคำสั่งนี้วัดแยกกัน และไม่ใช่ผลบวกเวลา workers

`--status`/`--dry-run` แสดงเวลาแต่ไม่เขียนไฟล์เวลา หากต้องการวัดการสร้างซ้ำให้เติม `--overwrite` มิฉะนั้นเวลาจะเป็นการตรวจและข้ามงานที่เสร็จแล้ว

หากโปรเจกต์ค้างนาน ใช้ `--project-timeout 300` กับ generate.py (ค่าเริ่มต้น 600 วินาทีรวมการเตรียมโปรเจกต์) และ `--test-timeout 600` กับ results.py ซึ่งบังคับแต่ละคำสั่ง checkout/compile/test/coverage ดูรายละเอียดในคู่มือรวม
