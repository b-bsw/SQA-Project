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

ทดลองกลุ่มเดียวก่อน: `python3 script/Randoop/round2/generate.py --projects Codec --workers 1` แล้ว `python3 script/Randoop/round2/results.py --projects Codec --workers 1`

กด Ctrl+C แล้วใช้คำสั่งเดิมเพื่อ resume ห้ามรัน generator สองรอบพร้อมกัน อย่าเปลี่ยน seed/time limit หลังเริ่มรอบนี้ results.py อ่าน seed/budget จาก state และไม่สร้างเทสต์ใหม่

อ่าน [คู่มือตั้งแต่เริ่มต้น](../README.md) สำหรับการติดตั้งและเปรียบเทียบผล
