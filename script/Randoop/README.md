# คู่มือ Randoop ตั้งแต่เตรียมเครื่องจนเก็บผล 2 รอบ

ใช้ Feedback-Directed Random Test Generation ของ Randoop 4.3.4 กับชุดเป้าหมายใน `Resoucre/` สร้างเทสต์บนรุ่น buggy แล้วใช้เทสต์ชุดเดียวกันทดสอบ buggy/fixed และวัด coverage ด้วย Defects4J

## 0. เตรียมเครื่อง (WSL Ubuntu)

ถ้าติดตั้ง Defects4J แล้ว ให้ข้ามการติดตั้งและตรวจคำสั่งในขั้นตอนถัดไป สคริปต์ Python ต้องใช้ Python 3.10 ขึ้นไป ส่วน Defects4J 3.x ใช้ Java 11 ตาม [เอกสารทางการ](https://github.com/rjust/defects4j)

ติดตั้ง WSL จาก PowerShell หากยังไม่มี:

```powershell
wsl --install -d Ubuntu
```

เปิด Ubuntu แล้วติดตั้ง dependencies:

```bash
sudo apt update
sudo apt install -y openjdk-11-jdk python3 git subversion cpanminus unzip build-essential curl
git clone https://github.com/rjust/defects4j.git "$HOME/defects4j"
cd "$HOME/defects4j"
cpanm --installdeps .
bash init.sh
export PATH="$HOME/defects4j/framework/bin:$PATH"
export JAVA_HOME="$(dirname "$(dirname "$(readlink -f "$(command -v javac)")")")"
export TZ=America/Los_Angeles
java -version
python3 --version
defects4j info -p Lang
```

ถ้าเครื่องมี Java หลายรุ่น ให้เลือก Java 11 ก่อนกำหนด JAVA_HOME และใช้รุ่นเดียวกันทั้งสองรอบ หาก Defects4J ติดตั้งที่อื่นให้ปรับ PATH ให้ตรง บันทึก PATH/JAVA_HOME/TZ ใน `~/.bashrc` เพื่อใช้ใน terminal ใหม่

เข้า repository ที่มีอยู่แล้ว:

```bash
cd /mnt/e/JavaEclipe/defect4j/SQA-Project
test -d Resoucre
test -f "Feedback-Directed Random Test Generation/Configuration/randoop-all-4.3.4.jar"
```

สคริปต์ใช้พื้นที่ staging สำหรับ Java และ checkout อัตโนมัติ ไม่ต้อง checkout ทุกโครงการล่วงหน้า หากมี checkout อยู่แล้ว สามารถส่ง `--data-dir /path/to/checkouts` ให้ generate.py ได้ ไม่ควรรัน generator เดิมและ generator ใหม่พร้อมกัน เพราะยังใช้ compiled classes/staging บางส่วนร่วมกัน

## 1. โครงสร้างสคริปต์และผลลัพธ์

```text
script/Randoop/
  README.md
  round1/
    generate.py
    results.py
    README.md
  round2/
    generate.py
    results.py
    README.md

Feedback-Directed Random Test Generation/
  TestCode/                    # เทสต์รอบ 1 (ตำแหน่งเดิม)
  Result/                      # ผลรอบ 1 (ตำแหน่งเดิม)
  report.csv                   # รวมรอบ 1
  TestCode_Round2/              # เทสต์รอบ 2
  Result_Round2/               # result.json, result.csv, logs และ report.csv
  report_Round2.csv             # รวมรอบ 2
  rounds/
    Round1/
      config.json              # round=1, seed=0, time_limit=60
      generation_state.json    # state รวมเฉพาะรอบ 1
      state/<Project>.json     # state แยกกลุ่มของรอบ 1
    Round2/
      config.json              # round=2, seed=20260928, time_limit=60
      generation_state.json    # state รวมเฉพาะรอบ 2
      state/<Project>.json     # state แยกกลุ่มของรอบ 2
```

ไฟล์ generation_state.json และ state/*.json เดิมคงอยู่สำหรับย้อนกลับ แต่คำสั่งในโฟลเดอร์นี้จะอ่าน/เขียน state ของรอบที่เลือกเท่านั้น สคริปต์หลักเดิมใน `script/` และ result runner ใน `Feedback-Directed Random Test Generation/Code/` ยังเป็น implementation ร่วมเพื่อรักษาคำสั่งเก่า

## 2. แบ่ง state เดิมเป็นรอบ 1 และเตรียมรอบ 2

หยุดงานสร้างเทสต์เก่าก่อน แล้วรันจาก root repository:

```bash
python3 script/Randoop/round1/generate.py --prepare-only
python3 script/Randoop/round2/generate.py --prepare-only
python3 script/Randoop/round1/generate.py --status
python3 script/Randoop/round2/generate.py --status
```

การเตรียมไม่สร้างเทสต์ ไม่ย้ายหรือลบไฟล์เดิม และรันซ้ำได้ รอบ 1 นำข้อมูลจาก state รวมและ state แยกกลุ่มเดิมมารวม โดยเลือกรายการ timestamp ใหม่กว่า ส่วนรอบ 2 เริ่มว่าง

สถานะ completed ของสคริปต์แยกรอบนับเฉพาะรายการที่ seed/time limit ตรง config ส่วน COMPLETED เดิมที่ต้องสร้างใหม่จะนับเป็น pending

seed ของรายการเดิมที่มี time_limit และไม่ใช่ DISK_SYNC ถูกอนุมานเป็น 0 พร้อม `seed_source=INFERRED_RANDOOP_DEFAULT` เพราะ generator เดิมไม่ได้ส่ง randomseed และ JAR ใช้ default 0 รายการ DISK_SYNC หรือไม่มีข้อมูลที่พออนุมานจะเก็บ seed เป็น null/UNKNOWN เพื่อไม่อ้างว่ารู้ seed จริง

## 3. สร้างเทสต์รอบ 1 หรือเติมรายการเดิมที่เงื่อนไขไม่ครบ

```bash
python3 script/Randoop/round1/generate.py --dry-run
python3 script/Randoop/round1/generate.py --workers 2
```

ค่าเริ่มต้น seed 0 และ time limit 60 วินาทีต่อ bug ข้าม COMPLETED ที่ seed/เวลาเดิมตรงกัน ส่วน FAILED/PENDING, seed ไม่ทราบ หรือเวลาที่เดิมเป็น 5/10 วินาทีจะสร้างใหม่ให้ครบ 60 วินาที รวมถึงรายการ DISK_SYNC ที่ seed ไม่ชัดเจน การรันขั้นตอนนี้จึงอาจสร้างเทสต์บางรายการใหม่ใน TestCode เดิม ควรสำรองเทสต์และ Result ก่อนหากต้องการเก็บเทสต์เก่าทุกชุด

เริ่มจากบางกลุ่มได้:

```bash
python3 script/Randoop/round1/generate.py --projects Codec --workers 1
```

## 4. สร้างเทสต์รอบ 2 ด้วยอีก seed

```bash
python3 script/Randoop/round2/generate.py --dry-run
python3 script/Randoop/round2/generate.py --workers 2
```

รอบนี้ใช้ seed **20260928** และเวลา **60 วินาทีต่อ bug** ส่ง `--randomseed=20260928` ให้ Randoop จริง เก็บเทสต์และ state แยกจากรอบ 1 หาก RAM ไม่พอให้ใช้ `--workers 1` หรือปรับ `--jvm-memory 2000m` (หน่วยความจำต่อ worker)

กด Ctrl+C เพื่อหยุด จากนั้นใช้คำสั่งเดิมเพื่อ resume งานที่สำเร็จแล้วจะถูกข้าม งานล้มเหลวจะลองใหม่ ห้ามเปิด generate.py รอบ 1 และ 2 พร้อมกัน และอย่าเปิด launcher ของรอบเดียวกันหลายครั้ง

สคริปต์ล็อก seed/time limit ของแต่ละรอบใน config.json ถ้าจะเลือก seed อื่นให้ระบุ `--seed` ตั้งแต่ prepare-only ครั้งแรกและใช้ค่าเดิมทุกครั้ง โดย seed ของสองรอบต้องต่างกัน ห้ามแก้ config เพื่อปะปนการทดลอง ถ้าต้องการเวลาอื่นให้เลือกเหมือนกันทั้งสองรอบก่อนเริ่ม

## 5. รัน buggy/fixed และเก็บผล

หลัง generation เสร็จ ตรวจสถานะก่อนแล้วรัน:

```bash
python3 script/Randoop/round1/generate.py --status
python3 script/Randoop/round2/generate.py --status
python3 script/Randoop/round1/results.py --workers 2
python3 script/Randoop/round2/results.py --workers 2
```

results.py ไม่สร้างเทสต์ แต่ checkout/compile/test รุ่น buggy และ fixed พร้อม coverage ของ modified classes ค่า `--test-timeout` (default 600 วินาทีต่อคำสั่ง test/coverage) เป็น timeout การประเมินผล ไม่ใช่ generation time limit

เก็บเฉพาะบางเป้าหมายหรือดูแผนก่อน:

```bash
python3 script/Randoop/round2/results.py --targets Codec_1 --dry-run
python3 script/Randoop/round2/results.py --targets Codec_1 --workers 1
```

ถ้ามี result.json อยู่ results.py จะข้ามเป้าหมายนั้นเพื่อ resume หากสร้างเทสต์ใหม่หลังเก็บผลแล้ว **ต้องรัน results.py --overwrite สำหรับเป้าหมายที่เปลี่ยนเทสต์** เช่น:

```bash
python3 script/Randoop/round1/results.py --targets Codec_1 Mockito_12 --overwrite
```

ผลที่สร้างด้วย runner รุ่นนี้จะบันทึก generation_timestamp ถ้าสร้างเทสต์ใหม่ภายหลัง runner จะตรวจพบและประเมินเป้าหมายนั้นใหม่อัตโนมัติ ส่วนผลเก่าที่ไม่มีข้อมูลนี้ต้องใช้ --overwrite ตามตัวอย่าง ผลที่ตรวจพบว่าเก่ากว่า state จะไม่ถูกรวมใน CSV ปัจจุบัน

ถ้ารอบ 1 เคยมีรายงานทั้งหมดก่อนปรับเทสต์ ให้ใช้ `--overwrite` ทั้งรอบเพื่อให้ผลตรงกับเทสต์ปัจจุบัน ตรวจ NOT_AVAILABLE/INCONCLUSIVE และ logs ก่อนสรุป เพราะมี result.json ไม่ได้แปลว่าทดลองสำเร็จทุกขั้นตอน

## 6. รวม CSV โดยไม่รันทดสอบใหม่

```bash
python3 script/Randoop/round1/results.py --collect-only
python3 script/Randoop/round2/results.py --collect-only
```

รอบ 1 ได้ `Result/report.csv` และ `report.csv` รอบ 2 ได้ `Result_Round2/report.csv` และ `report_Round2.csv` คำสั่งนี้อ่านรายงานที่มีอยู่เท่านั้น ไม่เพิ่ม coverage หรือสร้างผลสำหรับเป้าหมายที่ยังไม่ได้ประเมิน

รายงานใช้ seed/budget จาก state ของรอบนั้น JSON มี round และ seed_source ส่วน CSV คง schema เดิมเพื่อให้เครื่องมือเก่าอ่านได้ แยกรอบตามชื่อไฟล์ เมื่อรวมรายงานเก่าที่ seed เคยถูกเติมเป็น 20260918 จะปรับให้ตรงกับ state และเก็บค่าเดิมไว้ใน JSON เป็น previous_reported_seed; UNKNOWN แสดง seed ว่างใน CSV

ห้ามใช้ --seed/--budget กับ results.py ของรอบ เพราะจะเป็นการเปลี่ยนป้ายรายงาน ไม่ใช่การสร้างเทสต์ใหม่ และอย่าใช้ collect script เก่ารวมรอบ 2 เพราะใช้ตำแหน่ง Result เดิม

## 7. เปรียบเทียบผลอย่างไร

### เวลาสร้างเทสต์กับเวลารวมของสคริปต์

ข้อความ `เวลา Java/Randoop ...s` วัดเฉพาะ subprocess ของ Java ไม่ใช่เวลาทั้งหมด ส่วน `เวลารวมของสคริปต์: ...s` วัดตั้งแต่เริ่ม main จนงานจบ รวมสแกน source, checkout, compile, จัด dependencies, เรียก Randoop, เผยแพร่เทสต์, บันทึก state และ cleanup โดยใช้ monotonic clock ไม่รวมเวลารันทดสอบ/coverage ที่ต้องเรียก results.py แยก และไม่รวมการเปิด Python interpreter ก่อนเข้า main หรือการเขียนไฟล์สรุปเวลาตัวมันเอง

ทุกการรันจริงบันทึกเวลาลงใน state_file โดยตรงที่ `_script_runs.latest` และเก็บประวัติที่ `_script_runs.history` มี `started_at`, `finished_at`, `total_duration_seconds`, `status` และพารามิเตอร์รัน พร้อมสำเนาแยกครั้งที่ `script_runs/<เวลา UTC>_<PID>.json` ข้าง state_file `_script_runs` เป็น metadata ที่ระบบ resume ไม่ถือเป็น project

สำหรับคำสั่งใน round1/round2 เปิด `rounds/Round1/generation_state.json` หรือ `rounds/Round2/generation_state.json` แล้วดู `_script_runs.latest.total_duration_seconds` ตอนเริ่มบันทึก started_at และ status RUNNING โดยเวลารวมเป็น null จนคำสั่งจบหรือถูกหยุดด้วย Ctrl+C แล้วจึงบันทึกเวลารวมจริง รายงานครั้งเก่าที่ไม่มีการจับเวลารวมไม่สามารถคำนวณย้อนหลังได้ โปรเซสที่เริ่มก่อนแก้โค้ดจะยังใช้โค้ดเดิม ต้องใช้โค้ดรุ่นใหม่ในการรันครั้งถัดไป (resume ได้ ไม่จำเป็นต้อง overwrite ทั้งชุด)

- คำสั่ง SmokeTest10 ที่ใช้ `--state-file .../SmokeTest10/generation_state.json` เก็บเวลาใน `SmokeTest10/script_runs/`
- Launcher แยกรอบเก็บเวลารวมทั้ง batch ที่ `rounds/Round1/script_runs/` หรือ `rounds/Round2/script_runs/` รวมเวลารอ workers และรวม state ส่วน worker บันทึกเวลาของตัวเองที่ `rounds/RoundN/state/script_runs/`
- เวลารวม batch เป็นเวลาที่ผ่านจริง ไม่ใช่ผลบวกเวลา workers ที่ทำงานพร้อมกัน
- สคริปต์ใน round1/round2 เรียก `round_runner.py` เพื่อวัดเวลาทั้งคำสั่ง ทั้ง generate.py และ results.py (รวม --collect-only) โดย JSON มี phase/entrypoint ระบุคำสั่ง และไม่ซ้อน timer ของ batch
- `--status` และ `--dry-run` แสดงเวลาบนหน้าจอโดยไม่บันทึกไฟล์เวลา
- การกด Ctrl+C จะพยายามบันทึก status INTERRUPTED หลัง cleanup; การ kill แบบบังคับหรือไฟดับอาจไม่มีไฟล์สรุป

จับคู่ด้วย project + bug_id และใช้เฉพาะรายการที่ประเมินครบทั้งสองรอบ มี generation budget เท่ากัน และทราบ seed ดู coverage รายรอบ/ค่าเฉลี่ย และจำนวน bug ที่ REVEALING ทั้งสองรอบหรือรอบใดรอบหนึ่ง อย่านับ NOT_AVAILABLE เป็น coverage 0 หรือเอาผลรอบที่ยังไม่เสร็จไปเทียบทั้งชุด การเปลี่ยน seed ช่วยตรวจความแปรปรวนจากการสุ่ม แต่สองรอบยังไม่เพียงพอสำหรับข้อสรุปทางสถิติที่มั่นคง

การใช้ time-limit ทำให้จำนวน sequence อาจต่างแม้ใช้ seed เดิม ควรใช้ Java/Randoop เวอร์ชันเดียวกัน การตั้งค่าและจำนวน workers เท่ากันทั้งสองรอบ ดู [คู่มือ Randoop](https://randoop.github.io/randoop/manual/) สำหรับ randomseed และข้อจำกัดเรื่องเวลา

## 8. ปัญหาที่พบบ่อยและการย้อนกลับ

- `Round settings differ`: ใช้ seed/time limit เดิมตาม config.json; อย่าเปลี่ยน config ของรอบที่มีผลแล้ว
- `Round state not initialized`: รัน generate.py --prepare-only ของรอบนั้นก่อน
- ไม่พบ Defects4J: ตรวจ `command -v defects4j` และ PATH ใน WSL
- ไม่พบ Java/classes/dependencies: ดู error ใน state และลองรันกลุ่มเดียว; generator มี auto-checkout/compile
- FAILED/PENDING: ใช้คำสั่ง generation เดิมเพื่อ retry และตรวจ state ไม่ใช่ดูแค่จำนวนไฟล์ Java
- จะย้อนกลับ: หยุดสคริปต์ใหม่ ใช้คำสั่งเก่าและ state เดิมได้ ไฟล์ state เดิมไม่ถูกลบ แต่รายการรอบ 1 ที่สร้างใหม่จะเปลี่ยน TestCode เดิม ดังนั้นต้องคืนจากสำรองหากต้องการเทสต์เก่าทั้งชุด

สำหรับ repository นี้ไม่ต้องติดตั้ง Randoop เพิ่มถ้า JAR ใน Configuration มีอยู่แล้ว และไม่ต้องสั่งรันทั้งสองรอบพร้อมกัน
