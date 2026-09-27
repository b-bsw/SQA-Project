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

นำ state เก่าเข้ารอบนี้โดยไม่ลบของเดิม รายการ COMPLETED ที่ seed/เวลาไม่ตรงหรือไม่ทราบ seed จะสร้างใหม่ รายการที่ตรงแล้วจะข้าม หากเคยเก็บผลก่อนเทสต์เปลี่ยน ให้ใช้ `results.py --targets <เป้าหมายที่เปลี่ยน> --overwrite` เพื่อให้รายงานตรงกับเทสต์ใหม่

กรองกลุ่มด้วย `generate.py --projects Codec Cli` กรองผลด้วย `results.py --targets Codec_1 Cli_1` ใช้คำสั่งเดิมเพื่อ resume

อ่าน [คู่มือตั้งแต่เริ่มต้น](../README.md) ก่อนรันเต็มชุด
