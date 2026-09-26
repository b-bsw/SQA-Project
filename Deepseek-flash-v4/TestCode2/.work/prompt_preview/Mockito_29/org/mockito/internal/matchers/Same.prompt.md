# system

คุณคือวิศวกรทดสอบซอฟต์แวร์ที่เชี่ยวชาญ JUnit และ Code Coverage ตอบเป็นโค้ดภาษา Java ทั้งไฟล์เท่านั้น ไม่มีคำอธิบายก่อนหรือหลังโค้ด ไม่มี markdown code fence ข้อกำหนดสำคัญสูงสุด: ต้องเขียนโค้ด Test Suite ให้สมบูรณ์ตั้งแต่ต้นจนจบ และปิด Class ด้วย '}' เสมอ ห้ามหยุดเขียนกลางคัน เน้นเทสต์ branch สำคัญอย่างกระชับ ไม่สร้างกรณีซ้ำซ้อน

# user

# Prompt: สร้าง JUnit Test Suite (JUnit 4 / JUnit 5 Compatible)

## 🎯 วัตถุประสงค์
สร้าง JUnit test suite สำหรับ Java class ในส่วน `<source_code>` โดยต้อง:
1. **เลือกใช้ Test Framework ตาม Dependency ของโปรเจกต์ (JUnit 4 หรือ JUnit 5)**
2. ครอบคลุม public methods และ logic หลักอย่างกระชับ ไม่สร้าง test cases ซ้ำซ้อน
3. มี test case สำหรับ: normal case, boundary value, null/empty input, exception path
4. ครอบคลุม branch สำคัญ (if/else, switch, loop: 0 รอบ, 1 รอบ, หลายรอบ)
5. ใช้ assertion ที่ตรวจสอบ return value และ side effect จริง หลีกเลี่ยง assertion ปลอม เช่น `assertTrue(true)`
6. โค้ดทั้งหมดต้องเขียนเป็นไฟล์ Java ที่จบสมบูรณ์ 100% ปิดคลาสด้วย `}` เสมอ ห้ามหยุดกลางคัน

---

## ⚙️ SYSTEM SPECIFICATIONS & COMPATIBILITY

### 1. Framework Selection (เลือกตาม Dependency ของโปรเจกต์)

- โปรเจกต์นี้ใช้ **JUnit 4** (หรือ JUnit 3.8.1 สไตล์ Defects4J)
- ใช้ imports: `org.junit.Test`, `org.junit.Before`, `org.junit.After`
- ใช้ assertions: `org.junit.Assert.*` (`assertEquals`, `assertNull`, `assertNotNull`, `assertSame`, `fail`)
- ใช้ `@Test(expected = XxxException.class)` หรือ try/catch + fail() สำหรับ exception tests
- ❌ ห้าม import `org.junit.jupiter.*`
- **หากเป็น JUnit 4 (ค่าเริ่มต้นของ Defects4J):**
  - ใช้ imports: `org.junit.Test`, `org.junit.Before`, `org.junit.After`
  - ใช้ assertion: `org.junit.Assert.*` (`assertEquals`, `assertNull`, `assertNotNull`, `assertSame`, `fail`)
  - Exception handling: `@Test(expected = XxxException.class)` หรือ `try { ... fail(); } catch (XxxException e) { ... }`
  - Setup/Teardown: `@Before` / `@After`
  - ❌ ห้ามใช้ JUnit Jupiter / JUnit 5 annotations ในโปรเจกต์ JUnit 4

- **หากเป็น JUnit 5 (Jupiter):**
  - ใช้ imports: `org.junit.jupiter.api.Test`, `org.junit.jupiter.api.BeforeEach`, `org.junit.jupiter.api.AfterEach`
  - ใช้ assertion: `org.junit.jupiter.api.Assertions.*` (`assertEquals`, `assertNull`, `assertNotNull`, `assertThrows`)
  - Exception handling: `assertThrows(XxxException.class, () -> { ... });`
  - Setup/Teardown: `@BeforeEach` / `@AfterEach`

### 2. Language & Dependency Constraints
- ใช้ syntax ที่เข้ากันได้กับโปรเจกต์ (Java 7/8 ขึ้นกับโปรเจกต์)
- ❌ **ห้ามใช้ Mockito / PowerMock / AssertJ / Hamcrest** เว้นแต่มีระบุไว้ใน dependency ของโปรเจกต์
- ✅ สำหรับ Mock/Stub/Spy ให้เขียนเป็น Plain Java Objects (Static Inner Classes) ภายใน Test File
- ✅ **Package declaration ของ Test class ต้องตรงกับ Source Code ที่ให้มา**
- ✅ ตั้งชื่อ Test class ว่า `<SourceClass>Test`

### 3. Concise Branch Coverage (กระชับและไม่ซ้ำซ้อน)
- **เน้น Branch ที่สำคัญ**: เจาะจงกรณีที่กระทบต่อเงื่อนไขการตัดสินใจ (decision branches), ขอบเขตค่า (boundary values), ค่าว่าง/null, และ exception handling
- **หลีกเลี่ยงการสร้างเทสต์ซ้ำซ้อน (Non-redundant)**: ไม่สร้าง method ย่อยหลายตัวที่ทดสอบพฤติกรรมเดียวกันเพียงแค่เปลี่ยน literal เล็กน้อย
- **ป้องกันปัญหา Output Truncation**: เขียนโค้ดให้กระชับ เพื่อให้สามารถส่งออกไฟล์ Java ที่สมบูรณ์ครบถ้วน ไม่ติด token output limit

---

## 📦 Project Dependencies (pom.xml)

```xml
Defects4J generated-test runner uses JUnit 4; keep Java 8-compatible syntax.
Use only APIs visible in the supplied source/signatures; do not invent methods or dependencies.
Source imports: java.io.Serializable, org.hamcrest.Description, org.mockito.ArgumentMatcher
Build metadata: data/Mockito1buggy (v1 reference checkout; versions may differ by bug ID).
Gradle dependency declarations: compile 'net.bytebuddy:byte-buddy:0.6.8' | compile "org.hamcrest:hamcrest-core:1.1", "org.objenesis:objenesis:2.1" | testCompile 'org.ow2.asm:asm:5.0.4' | testCompile fileTree("lib/test")
```

Dependencies เพิ่มเติมของโปรเจกต์:
No additional type signatures provided. Do not assume undocumented methods exist.

---

## 💻 Source Code ที่ต้องการ Test

<source_code>
/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.matchers;

import org.hamcrest.Description;
import org.mockito.ArgumentMatcher;

import java.io.Serializable;


public class Same extends ArgumentMatcher<Object> implements Serializable {

    private static final long serialVersionUID = -1226959355938572597L;
    private final Object wanted;

    public Same(Object wanted) {
        this.wanted = wanted;
    }

    public boolean matches(Object actual) {
        return wanted == actual;
    }

    public void describeTo(Description description) {
        description.appendText("same(");
        appendQuoting(description);
        description.appendText(wanted.toString());
        appendQuoting(description);
        description.appendText(")");
    }

    private void appendQuoting(Description description) {
        if (wanted instanceof String) {
            description.appendText("\"");
        } else if (wanted instanceof Character) {
            description.appendText("'");
        }
    }
}

</source_code>

---

## 📤 Output ที่ต้องการ

1. ตอบเฉพาะโค้ดภาษา Java ทั้งไฟล์ตั้งแต่ `package ...` จนถึงปีกกาปิด `}` เท่านั้น
2. **ห้ามมีคำอธิบาย บทนำ สรุป หรือข้อความใดๆ นอกเหนือจากโค้ด Java**
3. **ห้ามใส่ Markdown Code Fence** (เช่น ```java หรือ ```) เพื่อให้บันทึกเป็นไฟล์ .java ได้ทันที
4. ตรวจสอบให้มั่นใจว่าปีกกาเปิด-ปิด `{}` มีจำนวนครบถ้วนและปิดคลาสสมบูรณ์

