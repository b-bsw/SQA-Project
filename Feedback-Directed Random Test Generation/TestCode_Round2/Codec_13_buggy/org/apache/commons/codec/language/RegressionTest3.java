package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u0164\u0a01\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -59, (byte) -92, (byte) -32, (byte) -88, (byte) -127, (byte) -17, (byte) -73, (byte) -65 });
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!\000a" + "'", str2, "\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u6800\u6900\u2100\u6100" + "'", str3, "\ufffd\u6800\u6900\u2100\u6100");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("i");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\376\377\000h\000i\000!\000a", "\000\376\377\000h\000i\000!\000a", false);
        char char24 = doubleMetaphone0.charAt("ai", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!\000");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("aa\377\375\u6148", false);
        java.lang.Class<?> wildcardClass30 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ue600\u8500\u8800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120, (byte) 0 });
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000#\000h\000i\000!\000a\000T");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 35, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 84 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!", "H");
        boolean boolean15 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append(' ', '\000');
        doubleMetaphoneResult4.append("hi!ahi!#", "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd", "\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #A?: java.io.UnsupportedEncodingException: #A?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u4800\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 72, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("#\000h");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) 104 });
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\001d\n\001\375\377");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeffhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #?hi!: java.io.UnsupportedEncodingException: #?hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("i ", false);
        doubleMetaphone0.setMaxCodeLen((int) '\u6869');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!\000\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd", "\ue6a5\ua8e6\u84a1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\346\241\251\342\205\241");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("?\001d\n\001\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("A", "\u3f3f\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone9.encode("hi!a");
        java.lang.String str14 = doubleMetaphone9.encode("\u6800\u6900\u2100");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148", "\ufffd\ufffd\0004", false);
        char char22 = doubleMetaphone0.charAt("\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000", (int) ' ');
        java.lang.String str24 = doubleMetaphone0.encode("\u3400");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendAlternate("\u6800\u6900\u2100");
        doubleMetaphoneResult4.appendAlternate("\ufeff\346\205\210");
        doubleMetaphoneResult4.appendPrimary('\ufffd');
        doubleMetaphoneResult4.append('\u6148', '\u3f21');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??h\000i\000!\000a\000" + "'", str2, "??h\000i\000!\000a\000");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("##ah");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str19 = doubleMetaphone0.encode("4hi!a");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("\277\357\346\275\200\240\244\346\342\200\200\204\204\346\377\375", "\ue685\ufffd", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffdh");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 0, (byte) 104 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffdh" + "'", str2, "\ufffdh");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????a???H: java.io.UnsupportedEncodingException: ?????????a???H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000\ufffd\000\ufffd\000\ufffd");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000h\000i\000!\000a" + "'", str2, "\ufffd\ufffd\000h\000i\000!\000a");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "\ufdff");
        doubleMetaphone0.setMaxCodeLen(4);
        java.lang.String str17 = doubleMetaphone0.encode("\u3f3fi #");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\346\205\210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "4hi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4hi!a: java.io.UnsupportedEncodingException: 4hi!a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -90, (byte) -62, (byte) -123, (byte) -62, (byte) -120 });
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "#\000");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000a\000H", "hi!\000");
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd", "\001d\n\001\n", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!a");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        char char13 = doubleMetaphone0.charAt("aiT", (int) 'i');
        java.lang.String str15 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000a\000 \000\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000i\000#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 105, (byte) 0, (byte) 35 });
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        int int16 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("##a", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f" + "'", str4, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "??" + "'", str5, "??");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000H", "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff");
        java.lang.String str8 = doubleMetaphone0.encode("\ufffd\u2300\u6900");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f" + "'", str3, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "??" + "'", str4, "??");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufdff", "i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i: java.io.UnsupportedEncodingException: i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\377\375\000\000\377\375\000\000\377\375" + "'", str2, "\000\000\377\375\000\000\377\375\000\000\377\375");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000a\000H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H" + "'", str2, "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u4800", "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????: java.io.UnsupportedEncodingException: ??????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.appendPrimary('a');
        boolean boolean15 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.appendPrimary('a');
        doubleMetaphoneResult12.appendAlternate('h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u4800" + "'", str2, "\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u4800" + "'", str3, "\ufffd\u4800");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\376\377\000h\000i\000!\000a#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 35, (byte) 0 });
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -28, (byte) -96, (byte) -128 });
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        byte[] byteArray10 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) byteArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!a");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\000\346\000\205\000\210");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y???????: java.io.UnsupportedEncodingException: ?y???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "?" + "'", str4, "?");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6869\u2161" + "'", str4, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!a" + "'", str5, "hi!a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!a" + "'", str6, "hi!a");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("4\000\376\377\000h\000i\000!\000a", "T");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: T: java.io.UnsupportedEncodingException: T");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f", "##ah");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##ah: java.io.UnsupportedEncodingException: ##ah");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000\000\000i\000\000\000!\000\000" + "'", str4, "\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000h\000\000\000i\000\000\000!\000\000" + "'", str5, "\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000h\000\000\000i\000\000\000!\000\000" + "'", str6, "\000h\000\000\000i\000\000\000!\000\000");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000h\000\000\000i\000\000\000!\000" + "'", str2, "\000\000h\000\000\000i\000\000\000!\000");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeffhi!a" + "'", str2, "\ufeffhi!a");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148h\000i\000!\000a\000\u6869", 32, 1, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\u4800", (int) (short) 100, 0, strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6100\u4800" + "'", str2, "\u6100\u4800");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6869\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("hi!a");
        byte[] byteArray8 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\001d\n\001\n");
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) byteArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u0164\u0a01\ufffd" + "'", str9, "\u0164\u0a01\ufffd");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate("ai");
        boolean boolean11 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('\ubf61', '\u0a01');
        doubleMetaphoneResult4.appendAlternate("\ufdff\ufdff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("???\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: y?y?y?y???h???????i???????!?????: java.io.UnsupportedEncodingException: y?y?y?y???h???????i???????!?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\u4861", true);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000i\000#", "\000\376\377\000h\000i\000!\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377??");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y???: java.io.UnsupportedEncodingException: ?y???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\346\205\210" + "'", str2, "\ufeff\346\205\210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("iha!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 97, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6900\u6800\u6100\u2100" + "'", str2, "\ufffd\u6900\u6800\u6100\u2100");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6869\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("???");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000A");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 65, (byte) 0 });
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufeff\ufffd\ufffd\000h\000i\000!" + "'", str4, "\ufeff\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("h\000i\000!\000", "\376\377\000h\000i\000!\000a", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char22 = doubleMetaphone19.charAt("hi!", (int) (short) 1);
        java.lang.String str24 = doubleMetaphone19.doubleMetaphone("");
        java.lang.String str26 = doubleMetaphone19.encode("hi!a");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) str26);
        byte[] byteArray29 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) byteArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'i' + "'", char22 == 'i');
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 52, (byte) 0 });
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ue685\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\376\377\000\346\000\205\000\210" + "'", str3, "\376\377\376\377\000\346\000\205\000\210");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\376\377\000h\000i\000!", true);
        char char13 = doubleMetaphone0.charAt("\ufeff#", (int) '\ufffd');
        java.lang.String str15 = doubleMetaphone0.encode("\377\375h\000i\000!\000a\000");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("##ah", "##ah");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4\000" + "'", str2, "4\000");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000\000\000a\000" + "'", str2, "\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!H: java.io.UnsupportedEncodingException: hi!H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult4.append('h', 'a');
        boolean boolean8 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('\u0a01', 'h');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u013f\u0a64\u0a01", "aH#4", true);
        java.lang.Class<?> wildcardClass14 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) '4', (int) '4', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd", (int) (byte) 100, (int) (byte) -1, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000H", (int) '\u3f21', 4, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufeff\u3f3f\ufffd", 52, (int) (short) -1, strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "a", false);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("\u6120", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000a\000H", "\ufeff#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?#: java.io.UnsupportedEncodingException: ?#");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.appendPrimary(' ');
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('\376', '\000');
        doubleMetaphoneResult4.append("\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000", "\ufffd\ufffd\000#\000i");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        java.lang.String str9 = doubleMetaphone0.encode("hi!a");
        java.lang.String str11 = doubleMetaphone0.encode("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('a', '4');
        doubleMetaphoneResult4.appendPrimary("H");
        doubleMetaphoneResult4.append(' ', ' ');
        doubleMetaphoneResult4.append("", "\000h\000i\000!");
        java.lang.String str17 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4 \000h\000i\000!" + "'", str17, "4 \000h\000i\000!");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!a4", "\u2300\ufe00\uff00\000\u6800\000\u6900\000\u2100\u6968");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????: java.io.UnsupportedEncodingException: ??????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.String str9 = doubleMetaphone0.encode("hi!a");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000\000\000i\000\000\000!\000\000", "\ufffd\ufffd");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u0a01');
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("a \000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6148");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!#?: java.io.UnsupportedEncodingException: hi!#?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 97, (byte) 0, (byte) 32, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000a\000 \000\000" + "'", str2, "\000a\000 \000\000");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.append("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        doubleMetaphoneResult7.appendAlternate("\377\375");
        doubleMetaphoneResult7.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.append('4');
        doubleMetaphoneResult3.appendPrimary("i");
        doubleMetaphoneResult3.append("\ufffd\ufffd\ufffd#", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hi!a", (int) (short) 100, 100, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148h\000i\000!\000a\000\u6869", (int) (byte) 10, (int) '\ubf61', strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("h\000i\000!\000a\000\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\377\376h\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000a\000 \000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\000\000a\000\000\000 \000\000\000\000" + "'", str2, "\376\377\000\000\000a\000\000\000 \000\000\000\000");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ubfc3\ubdc3hi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -21, (byte) -65, (byte) -125, (byte) -21, (byte) -73, (byte) -125, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6800\u6900\u2100\u2300\u4861\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 97, (byte) 72, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000hi!a i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 32, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000h\000i\000!\000a\000 \000i" + "'", str2, "\000\000\000h\000i\000!\000a\000 \000i");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.append('4');
        doubleMetaphoneResult3.appendPrimary("i");
        doubleMetaphoneResult3.append('a', '\ufeff');
        doubleMetaphoneResult3.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('\ufeff', '\u6869');
        doubleMetaphoneResult7.appendAlternate("\u6148");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aH" + "'", str3, "aH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6148" + "'", str4, "\u6148");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray5);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray5);
        java.lang.String str12 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6401\u010a\ufffd" + "'", str9, "\u6401\u010a\ufffd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001d\n\001\n" + "'", str10, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001d\n\001\n" + "'", str11, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6401\u010a\ufffd" + "'", str12, "\u6401\u010a\ufffd");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd", false);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000h\000i\000!", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("hi!a\000hi!a", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\377\375\377\375", "\u013f\u0a64\u0a01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4861" + "'", str3, "\u4861");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6800\u6900\u2100\u6148\346");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test1608(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 32, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) -26 });
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\000H", "\ufeffai", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3400");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd" + "'", str2, "\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str16 = doubleMetaphone0.encode("\u3f3fhi!a");
        char char19 = doubleMetaphone0.charAt("\376\377\000h\000i\000!", (int) '\ufffd');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!i");
        int int22 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("?\000?\000\000\000H\000", "\ufeffhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #?hi!: java.io.UnsupportedEncodingException: #?hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str4 = doubleMetaphoneResult3.getAlternate();
        doubleMetaphoneResult3.append("4", "i#");
        doubleMetaphoneResult3.appendAlternate("4H\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("T");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 84, (byte) 0 });
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendPrimary("\ufffd\u4800");
        doubleMetaphoneResult4.appendAlternate(' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult4.appendPrimary("i i");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = doubleMetaphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeffaH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ubbef\u23bf");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6800\u6900\u2100\u2300\u4861\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\001d\n\001\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?d???: java.io.UnsupportedEncodingException: ?d???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -123, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ue685\ufffd" + "'", str3, "\ue685\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ue685\ufffd" + "'", str4, "\ue685\ufffd");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("#\376\377\000h\000i\000\u6869");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "2) test1625(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 63 });
// flaky "1) test1625(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f23\u3f21" + "'", str2, "\u3f23\u3f21");
// flaky "1) test1625(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#??\000h\000i\000!?" + "'", str3, "#??\000h\000i\000!?");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000\346\000\205\000\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "iha!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: iha!: java.io.UnsupportedEncodingException: iha!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000?\000?\000?" + "'", str2, "??\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??\000?\000?\000?" + "'", str3, "??\000?\000?\000?");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\u2300");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!\000a" + "'", str3, "\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!\000a" + "'", str4, "\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6800\u6900\u2100\u6100" + "'", str5, "\u6800\u6900\u2100\u6100");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufeffaH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?aH: java.io.UnsupportedEncodingException: ?aH");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!A");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2141" + "'", str2, "\u6869\u2141");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!A" + "'", str3, "hi!A");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphone0.encode("\ufffd\u4800");
        char char12 = doubleMetaphone0.charAt("4hi!a", (int) '\u6869');
        java.lang.String str14 = doubleMetaphone0.encode("\ufffd\u6800\u6900\u2100");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\001d\n\001\n", "aH");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("???", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult14.append(' ');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u2300\ufe00\uff00\000\u6800\000\u6900\000\u2100\u6968");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('a', '4');
        doubleMetaphoneResult4.appendPrimary("H");
        java.lang.String str11 = doubleMetaphoneResult4.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendAlternate("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        doubleMetaphoneResult4.append('\ufffd', '\376');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aH" + "'", str11, "aH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u4800\u6100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\u6121" + "'", str2, "\u6968\u6121");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("#i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 105 });
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("aH#", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f\ufffd", "\ufffd\ufffd???\000", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??H: java.io.UnsupportedEncodingException: ?y??H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375\377\375" + "'", str3, "\377\375\377\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\377\375\377\375" + "'", str4, "\377\375\377\375");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!ii4hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 105, (byte) 105, (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ii4hi!a" + "'", str2, "hi!ii4hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2169\u6934\u6869\u2161" + "'", str3, "\u6869\u2169\u6934\u6869\u2161");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('\u6869', '#');
        doubleMetaphoneResult4.append("44ih\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("h\000i\000!\000", "\376\377\000h\000i\000!\000a", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char22 = doubleMetaphone19.charAt("hi!", (int) (short) 1);
        java.lang.String str24 = doubleMetaphone19.doubleMetaphone("");
        java.lang.String str26 = doubleMetaphone19.encode("hi!a");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) str26);
        java.lang.String str30 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'i' + "'", char22 == 'i');
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('h', 'h');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.append("\376\377\000h\000i\000!", "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        doubleMetaphoneResult4.appendPrimary("\000hi!a i");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\346\205\210");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\u3f3f");
        boolean boolean12 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('a', '\ufffd');
        doubleMetaphoneResult4.append('\u0a01', 'T');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff#i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 35, (byte) 0, (byte) 105 });
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('\u6869', '#');
        doubleMetaphoneResult4.append("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str7 = doubleMetaphone0.encode("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\u6148\000", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\ufffd\ufffd\000h\000i\000!", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char18 = doubleMetaphone15.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone15.new DoubleMetaphoneResult((int) '\u010a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "3) test1648(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u4841");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 65, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4148" + "'", str2, "\u4148");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6921\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "4) test1650(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) -1, (byte) -3 });
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000#\000h\000i\000!\000a\000T");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 35, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 84 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f#hi!aT" + "'", str2, "\u3f3f#hi!aT");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\303\276\303\277\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000" + "'", str2, "\000\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!a", "hi!a");
        doubleMetaphoneResult4.appendPrimary("i");
        java.lang.String str17 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd", "hi!a4");
        doubleMetaphoneResult4.append('4', '\ufffd');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4hi!a" + "'", str17, "4hi!a");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("iha!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?#: java.io.UnsupportedEncodingException: ?#");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 97, (byte) 0, (byte) 33 });
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "5) test1655(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 65, (byte) 63 });
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\377\375\377\375\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6869\u2141", "i ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult16.appendAlternate("\ufffd\u6900\u2000\u6900");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean10 = doubleMetaphoneResult9.isComplete();
        doubleMetaphoneResult9.append('\u6148', '4');
        java.lang.String str14 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.appendPrimary('\277');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000h\000i\000!", (int) (byte) 100, 0, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("?", (int) '\u6869', 97, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -30, (byte) -123, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\377\375h\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?" + "'", str2, "?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AT");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 65, (byte) 84 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\346\205\210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "HT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: HT: java.io.UnsupportedEncodingException: HT");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120, (byte) 0 });
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000i\000!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u3f00\u3f00\u3f00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f00\u3f00\u3f00\u3f00\ufffd" + "'", str2, "\u3f3f\u3f00\u3f00\u3f00\u3f00\ufffd");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uff00\ufe00\u6800\000\u6900\000\u2100\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u2323\u6168", "\357\273\277\357\277\275\344\240\200");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i???i???a???: java.io.UnsupportedEncodingException: i???i???a???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u0164\u0a01\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -3 });
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray15);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) (byte) -1, 10, strArray15);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", (int) 'i', (int) '\ufffd', strArray15);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a", 26729, 1, strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?" + "'", str2, "?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\376\377\000h\000i\000!\000a" + "'", str2, "\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\376\377\000h\000i\000!\000a" + "'", str3, "\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\376\377\000h\000i\000!\000a" + "'", str4, "\000\376\377\000h\000i\000!\000a");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000h\000i\000!\000\ufeff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "6) test1677(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) -2, (byte) -1 });
// flaky "2) test1677(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000h\000i\000!\000\ufeff" + "'", str3, "\376\377\000h\000i\000!\000\ufeff");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000?\000?\000?\000?" + "'", str2, "??\000?\000?\000?\000?");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\277\357\346\275\200\240\244\346\342\200\200\204\204\346\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u3f3f", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
// flaky "7) test1682(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("\ufeff\ufffd\u4800", "h\000i\000!\000");
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.append("\376\377\000h\000i\000!");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000\346\000\205\000\210");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -26, (byte) 0, (byte) 0, (byte) 0, (byte) -123, (byte) 0, (byte) 0, (byte) 0, (byte) -120 });
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.appendAlternate("ai");
        doubleMetaphoneResult11.append('\u010a', '\346');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff" + "'", str2, "\ufffd\ufdff\ufdff");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\377\376h\000i\000!\000", "\u3f3f\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u4800\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???4: java.io.UnsupportedEncodingException: ???4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 72, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("aH#", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ue6a1\ua9e2\u85a1");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -95, (byte) -26, (byte) -30, (byte) -87, (byte) -95, (byte) -123 });
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148" + "'", str3, "\u6148");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4861" + "'", str4, "\u4861");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aH" + "'", str5, "aH");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\uc3be\uc3bfhi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -20, (byte) -114, (byte) -66, (byte) -20, (byte) -114, (byte) -65, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uec8e\ubeec\u8ebf\u6869\u2161" + "'", str2, "\uec8e\ubeec\u8ebf\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uec8e\ubeec\u8ebf\u6869\u2161" + "'", str3, "\uec8e\ubeec\u8ebf\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdhi!a" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdhi!a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uec8e\ubeec\u8ebf\u6869\u2161" + "'", str5, "\uec8e\ubeec\u8ebf\u6869\u2161");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\u4100", "", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("4\000\u6148a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "8) test1696(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 52, (byte) 97, (byte) 72, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff4\000\u6148a" + "'", str2, "\ufeff4\000\u6148a");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        char char15 = doubleMetaphone0.charAt("\000h\000i\000!\000\000", (int) (short) 10);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\376\377\000h\000i\000!\000a", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("Ha");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("i ");
        java.lang.String str13 = doubleMetaphone0.encode("#ia");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6923", "hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!a?hi!#???d????h?i?!?a: java.io.UnsupportedEncodingException: hi!a?hi!#???d????h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\uc3be\uc3bfhi!a", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("##a", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148" + "'", str3, "\u6148");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aH" + "'", str4, "aH");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        java.lang.String str9 = doubleMetaphone0.encode("hi!a");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = doubleMetaphone0.encode("\u3f3f\u3f3fhi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aiT");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 105, (byte) 84 });
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\376\377??", false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.append('a', 'i');
        doubleMetaphoneResult7.appendAlternate('\346');
        doubleMetaphoneResult7.appendPrimary("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        doubleMetaphoneResult7.append('\u3f21');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.append("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        java.lang.String str14 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
// flaky "9) test1708(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\376\377\000h\000i\000!\000\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd" + "'", str14, "\000\376\377\000h\000i\000!\000\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        doubleMetaphoneResult4.appendPrimary('i');
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate('i');
        doubleMetaphoneResult4.append("\u6120", "\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("ai");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 97, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ai" + "'", str2, "ai");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ubfc3\ubdc3hi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -65, (byte) -61, (byte) -67, (byte) -61, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("##a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 35, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##a" + "'", str2, "##a");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "10) test1714(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("i ", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\346');
        doubleMetaphoneResult23.append('T', '\u010a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000h\000\000\000i\000\000\000!" + "'", str2, "\000\000\000h\000\000\000i\000\000\000!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uefbb\ubf61\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -69, (byte) -17, (byte) 97, (byte) -65, (byte) -3, (byte) -1 });
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendAlternate("\ue685\ufffd");
        doubleMetaphoneResult8.append('\376');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\u6900\u6800\u6100\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 97, (byte) 0, (byte) 33 });
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!\000a", "i", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char19 = doubleMetaphone16.charAt("hi!", (int) (short) 1);
        java.lang.String str21 = doubleMetaphone16.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone16.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult23.appendAlternate('\000');
        doubleMetaphoneResult23.append("hi!", "");
        doubleMetaphoneResult23.append("A");
        java.lang.String str31 = doubleMetaphoneResult23.getPrimary();
        doubleMetaphoneResult23.append("\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'i' + "'", char19 == 'i');
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!A" + "'", str31, "hi!A");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("i ", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\346');
        doubleMetaphoneResult23.appendAlternate("H");
        doubleMetaphoneResult23.append("\000h\000i\000!\000\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000" + "'", str2, "\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000" + "'", str3, "\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("i ");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\ufffd\u6900\u2000\u6900");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!a");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        char char13 = doubleMetaphone0.charAt("aiT", (int) 'i');
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\uff64\u0a0a\u01ff", "T");
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148\000", (int) 'h', 0, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", 32, (int) '\u6869', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000h\000i\000!", (int) 'h', 10, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u4861", (int) '\ufffd', (int) '\u6148', strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\ufffd\ufffd\ufffd\ufffd\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????h?i?!?a: java.io.UnsupportedEncodingException: ?????h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("#i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????H: java.io.UnsupportedEncodingException: ?????????H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#i" + "'", str2, "#i");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.appendPrimary("");
        java.lang.String str6 = doubleMetaphoneResult3.getAlternate();
        java.lang.String str7 = doubleMetaphoneResult3.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult4.append('i');
        java.lang.String str7 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendAlternate('4');
        doubleMetaphoneResult4.appendPrimary("");
        boolean boolean12 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i" + "'", str7, "i");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\u6800\u6900\u2100");
        java.lang.String str12 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6800\u6900\u2100" + "'", str12, "\u6800\u6900\u2100");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.appendPrimary('\000');
        doubleMetaphoneResult4.append("\u0164\u0a01\ufffd");
        doubleMetaphoneResult4.append("\ufffd\ufffd\ufffd#");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "##4\000h\000\000\000i\000\000\000!\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##4?h???i???!??: java.io.UnsupportedEncodingException: ##4?h???i???!??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubbef\u23bf" + "'", str2, "\ubbef\u23bf");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("i");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\376\377\000h\000i\000!\000a", "\000\376\377\000h\000i\000!\000a", false);
        char char24 = doubleMetaphone0.charAt("ai", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!a\000\u0164\u0a01\ufffd");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u6869');
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("\ubfc3\ubdc3hi!a", "\ufffd\ufdffH", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("aH", (int) ' ');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\ufffd\ufffd\000H", false);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!A");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!A: java.io.UnsupportedEncodingException: hi!A");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("#\000\u3f3f\u6148");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate("ai");
        boolean boolean11 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('a', 'i');
        doubleMetaphoneResult4.append("\u4861");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6869\u2100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\u2161\u6921\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "11) test1740(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -30, (byte) -123, (byte) -95, (byte) 104, (byte) -26, (byte) -92, (byte) -95, (byte) -17, (byte) -65, (byte) -67 });
// flaky "3) test1740(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd" + "'", str2, "\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\303\276\303\277\000h\000i\000!\000a", 35, (int) '\ufffd', strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a\000\u6148\000", 0, 4, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!\0004", (-1), (int) '\ufffd', strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.append('\ufffd', 'i');
        java.lang.String str21 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!\000\ufffd" + "'", str21, "hi!\000\ufffd");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphoneResult8.getPrimary();
        boolean boolean10 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (short) 1, (int) (short) 100, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", 0, (int) ' ', strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!", (int) '\u6869', (int) 'a', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("4 \000h\000i\000!", 10, (int) (byte) 1, strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ubbef\u23bf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -21, (byte) -81, (byte) -81, (byte) -30, (byte) -114, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubbef\u23bf" + "'", str2, "\ubbef\u23bf");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000\303\276\303\277\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -61, (byte) -125, (byte) -62, (byte) -66, (byte) -61, (byte) -125, (byte) -62, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u6968\u6121");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000", true);
        char char22 = doubleMetaphone0.charAt("\ufffd\u6800\u6900\u2100\u6100", 0);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeff\u3f3f\ufffd", "4\000\u6148", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\ufffd' + "'", char22 == '\ufffd');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000h\000i\000!\000a", (int) (byte) 0, 35, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (int) (short) 10, (int) (short) 1, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (int) '\277', (int) (short) -1, strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\001d\n\001\n" + "'", str2, "\ufeff\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\001\000d\000\n\000\001\000\n" + "'", str3, "\ufffd\ufffd\000\001\000d\000\n\000\001\000\n");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendAlternate("\u6800\u6900\u2100");
        java.lang.String str10 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendAlternate("aH#");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6800\u6900\u2100" + "'", str10, "\u6800\u6900\u2100");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\000h\000\000\000i\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str12 = doubleMetaphone0.encode("Ha");
        doubleMetaphone0.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u0a01');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult16.append("\u6148");
        doubleMetaphoneResult16.append('\346');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("aiT");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 97, (byte) 0, (byte) 105, (byte) 0, (byte) 84 });
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray21);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("HT", 0, (int) ' ', strArray21);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd", (int) '\277', 32, strArray21);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("aHiaH", (int) (short) 10, (int) (short) 100, strArray21);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000", "\376\377\000\346\000\205\000\210", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\u3f3f\u3f3f");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\u2323\u6168", "i\000\000h\000i\000!\000a\000", false);
        int int25 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append(' ', 'i');
        doubleMetaphoneResult7.append("\u6800\u6900\u2100", "aH");
        doubleMetaphoneResult7.append('4', '#');
        doubleMetaphoneResult7.appendAlternate("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        doubleMetaphoneResult7.append("\ufffdh");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("4\000\376\377\000h\000i\000!\000a", "\ufffd\ufffdh\000i\000!\000a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??h?i?!?a?: java.io.UnsupportedEncodingException: ??h?i?!?a?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("hi!a\000hi!a", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("", (int) 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.String str9 = doubleMetaphone0.encode("hi!a");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000\000\000i\000\000\000!\000\000", "\ufffd\ufffd");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148h\000i\000!\000a\000\u6869", "\346\205\210", true);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNull(str15);
// flaky "12) test1761(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        doubleMetaphoneResult4.appendPrimary('i');
        doubleMetaphoneResult4.append('4');
        boolean boolean21 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate("\u3468\u6921\ufffd");
        doubleMetaphoneResult4.appendPrimary("\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000?\000?\000?" + "'", str2, "??\000?\000?\000?");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufeff\000h\000i\000!\000a", (int) 'h', (int) '\346', strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\376\377\000h\000i\000!\000a", (int) ' ', (int) '4', strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3fi ", "\ufeff\ufffd\ufffd\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????h?i?!: java.io.UnsupportedEncodingException: ????h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult16.append('i');
        java.lang.String str19 = doubleMetaphoneResult16.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!a", "hi!a");
        java.lang.String str15 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!\000hi!a" + "'", str15, "hi!\000hi!a");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\u3f3f");
        doubleMetaphoneResult4.append('\u6148');
        doubleMetaphoneResult4.append("???");
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!\000\00044");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 52, (byte) 0, (byte) 52 });
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff", (int) (short) 10, (int) (byte) 100, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ubfc3\ubdc3hi!a", 10, 0, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u4800" + "'", str2, "\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufdffH" + "'", str3, "\ufffd\ufdffH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\377\375H\000" + "'", str4, "\376\377\377\375H\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffdH\000" + "'", str5, "\ufffd\ufffd\ufffd\ufffdH\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufdffH" + "'", str6, "\ufffd\ufdffH");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffdh\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufeff\000h\000i\000!\000a", (int) 'h', (int) '\346', strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("???\000", 0, (int) '4', strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100", false);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("##", "##4");
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        char char23 = doubleMetaphone0.charAt("#??\000h\000i\000!?", (int) (short) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uefbb\ubf61\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 97, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubbef\u61bf\ufdff" + "'", str2, "\ubbef\u61bf\ufdff");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!", "H");
        boolean boolean15 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate('i');
        doubleMetaphoneResult4.append('\u6869', '\376');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("i\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6900\000" + "'", str2, "\u6900\000");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult16.append("\u6148");
        java.lang.String str19 = doubleMetaphoneResult16.getAlternate();
        java.lang.String str20 = doubleMetaphoneResult16.getPrimary();
        doubleMetaphoneResult16.append("i", "\ubbef\u23bf");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\0004" + "'", str2, "\ufffd\ufffd\0004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\0004" + "'", str3, "\ufffd\ufffd\0004");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        char char9 = doubleMetaphone0.charAt("\ufffd\ufffd\000H", 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd", "a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\ufffd' + "'", char9 == '\ufffd');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000h\000i\000!\000a\000" + "'", str2, "\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000h\000i\000!\000a\000" + "'", str3, "\000\000h\000i\000!\000a\000");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!" + "'", str2, "\376\377\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str3, "\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean3 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\u48004i\001d\n\001\n\000", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#" + "'", str4, "#");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("i");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\u6968\u6121", false);
        char char23 = doubleMetaphone0.charAt("#hi!aT", (int) '#');
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f\u4800", "aHa");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!A");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 65 });
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000\ufffd\000\ufffd\000\ufffd", "\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????h???i???!???a?: java.io.UnsupportedEncodingException: ????h???i???!???a?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append("\ufffd\u6800\u6900\u2100\u6100");
        doubleMetaphoneResult7.appendAlternate('T');
        doubleMetaphoneResult7.appendPrimary("\ufffd\ufffd\ufffd\ufffdh\000i\000!\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.String str9 = doubleMetaphone0.encode("hi!a");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000\000\000i\000\000\000!\000\000", "\ufffd\ufffd");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd", false);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("\ufeffai");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\ufffd\u4800" + "'", str2, "\ufeff\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\ufffd\u4800" + "'", str3, "\ufeff\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\377\375H\000" + "'", str4, "\376\377\377\375H\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffdH\000" + "'", str5, "\ufffd\ufffd\ufffd\ufffdH\000");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3fi ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4 ?i : java.io.UnsupportedEncodingException: 4 ?i ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\000" + "'", str3, "hi!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000\000\000" + "'", str4, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6800\u6900\u2100\000" + "'", str5, "\u6800\u6900\u2100\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6800\u6900\u2100\000" + "'", str6, "\u6800\u6900\u2100\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h\000i\000!\000\000\000" + "'", str7, "h\000i\000!\000\000\000");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!\000\00044");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0, (byte) 52, (byte) 52 });
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        char char8 = doubleMetaphone0.charAt("\u6401\u010a\ufffd", (int) 'h');
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3400", (int) (short) 0, (int) '\346', strArray21);
        java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) "\u3400");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\ufeff\u3f3f\ufffd", true);
        java.lang.String str12 = doubleMetaphone0.encode("4\000i");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u010a');
        doubleMetaphoneResult14.appendPrimary("\u3f3f???");
        doubleMetaphoneResult14.appendPrimary(' ');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (-1), (int) '\u6148', strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\375\377\375\377\000\000h\000\000\000i\000\000\000!\000", (int) (byte) 100, (int) 'a', strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.append("i");
        doubleMetaphoneResult2.appendPrimary("\000\000h\000i\000!\000a\000");
        java.lang.String str7 = doubleMetaphoneResult2.getPrimary();
        java.lang.String str8 = doubleMetaphoneResult2.getAlternate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i\000\000h\000i\000!\000a\000" + "'", str7, "i\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendAlternate('a');
        java.lang.String str13 = doubleMetaphoneResult9.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6800\u6900\u2100\u2300\u4861\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f00" + "'", str2, "\u3f3f\u3f3f\u3f00");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6869\u2169\u6934\u6869\u2161", "\uff00\ufe00\u6800\000\u6900\000\u2100\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!" + "'", str3, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!" + "'", str4, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aH" + "'", str2, "aH");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("##a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) 35, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "\u3f3f");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\u2300\ufe00\uff00\000\u6800\000\u6900\000\u2100\u6968", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u4800" + "'", str2, "\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u4800" + "'", str3, "\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\000H" + "'", str4, "\ufffd\ufffd\000H");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "??\000?\000?\000?\000?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????: java.io.UnsupportedEncodingException: ??????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!\000a" + "'", str2, "\376\377\000h\000i\000!\000a");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff", "iiaH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffdH\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 72, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "13) test1814(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) -1, (byte) -3, (byte) 0, (byte) 52 });
// flaky "4) test1814(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6800\u6900\u2100\ufdff\u3400" + "'", str2, "\ufffd\u6800\u6900\u2100\ufdff\u3400");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("hi!a");
        int int7 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000H\000a", "\377\376h\000i\000!\000", true);
        char char14 = doubleMetaphone0.charAt("44ih\000i\000!\000a\000", (int) '#');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\u4800", "\u6148h\000i\000!\000a\000\u6869", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
// flaky "14) test1815(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("h\000i\000!\000a\000", "hi!a", false);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("##4\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 35, (byte) 52, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\u3f3f");
        doubleMetaphoneResult4.appendAlternate("A");
        doubleMetaphoneResult4.append('\u0a01');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone9.encode("hi!a");
        java.lang.String str14 = doubleMetaphone9.encode("\u6800\u6900\u2100");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148", "\ufffd\ufffd\0004", false);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str22 = doubleMetaphone0.encode("i i");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 4, (int) '4', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("i\000", 10, 0, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd", (int) 'i', (int) 'h', strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray34);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray34);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray34);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray34);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray34);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 0, strArray34);
        boolean boolean41 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u4800", (int) '4', (int) (byte) 1, strArray34);
        boolean boolean42 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", 4, (int) '\ufffd', strArray34);
        boolean boolean43 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u2300\ufe00\uff00\000\u6800\000\u6900\000\u2100\u6968", (int) '\u010a', (int) ' ', strArray34);
        boolean boolean44 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000\000h\000i\000!\000a\000 \000i", (int) '\u6148', 105, strArray34);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendAlternate('4');
        doubleMetaphoneResult9.append("hi!\000", "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        doubleMetaphoneResult9.append("\ufffd\ufffd\ufffdaH");
        doubleMetaphoneResult9.appendAlternate("");
        doubleMetaphoneResult9.append('\ubf61', 'a');
        doubleMetaphoneResult9.appendPrimary("\000\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append('#');
        doubleMetaphoneResult12.appendAlternate("\u3f3f");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult4.append('h', 'a');
        boolean boolean8 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('\u6869');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("iiaH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 105, (byte) 97, (byte) 72 });
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375" + "'", str2, "\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\277\357\346\275\200\240\244\346\342\200\200\204\204\346\377\375", "4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4: java.io.UnsupportedEncodingException: 4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        char char21 = doubleMetaphone0.charAt("#i", (int) 'h');
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("\u2300\ufe00\uff00\000\u6800\000\u6900\000\u2100\u6968", "4\000", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        char char15 = doubleMetaphone0.charAt("\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd", (int) '\376');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufe00\uff00\uff00\ufd00\u6800\000\u6900\000\u2100\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?" + "'", str2, "?");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "#\000");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000H", "\ufffd\ufffdh\000i\000!\000a\000", false);
        java.lang.String str23 = doubleMetaphone0.encode("i ");
        char char26 = doubleMetaphone0.charAt("\376\377\000a\000H", (int) '\u6869');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.appendPrimary('i');
        doubleMetaphoneResult4.append('#', '\000');
        doubleMetaphoneResult4.appendAlternate('\u3f21');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("a \000", "\u6148");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!#?: java.io.UnsupportedEncodingException: hi!#?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("h\000i\000!\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\376h\000i\000!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #???y??h?i?!?a?: java.io.UnsupportedEncodingException: #???y??h?i?!?a?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -66, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        java.lang.String str17 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append("\u6869", "\u4800\u6100");
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4\000i" + "'", str17, "4\000i");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000\000H" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000\000H");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.appendPrimary('a');
        java.lang.String str15 = doubleMetaphoneResult12.getAlternate();
        java.lang.String str16 = doubleMetaphoneResult12.getAlternate();
        doubleMetaphoneResult12.append("a ", "\ufffd\ufffd\000a\000H");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.appendAlternate('4');
        java.lang.String str10 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (int) (byte) 10, (int) (byte) 10, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6869\u2161", (int) (short) 1, 0, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\376\377\000h\000i\000!\000a", 1, 0, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufe00\uff00\u6100\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\u6800\u6900\u2100");
        doubleMetaphoneResult4.append('\ufffd', '\376');
        doubleMetaphoneResult4.append("\ufeffai", "\ufffd\ufffd\000h\000i\000!\000a");
        java.lang.String str18 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u6800\u6900\u2100\376\ufffd\ufffd\000h\000i\000!\000a" + "'", str18, "\u6800\u6900\u2100\376\ufffd\ufffd\000h\000i\000!\000a");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\u6800\000\u6900\000\u2100\000\u6100" + "'", str2, "\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000h\000\000\000i\000\000\000!\000\000\000a\000" + "'", str3, "\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.setMaxCodeLen((int) '\376');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6869\u2161", "\000H\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?H?a: java.io.UnsupportedEncodingException: ?H?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.appendAlternate('\000');
        doubleMetaphoneResult2.append("\ubbef\u61bf\ufdff");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!a\000hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
// flaky "15) test1850(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2161\u6921\ufffd" + "'", str2, "\u6869\u2161\u6921\ufffd");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\375\377\375\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str2, "\377\375\377\375\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6900\u6800\u6100\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', ' ');
        java.lang.String str18 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary("\u6800\u6900\u2100");
        doubleMetaphoneResult7.appendAlternate('\u6869');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000hi!a " + "'", str18, "\000hi!a ");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray15);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) '4', (int) '4', strArray15);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) (byte) 0, (int) ' ', strArray15);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6800\u6900\u2100\u6100", (int) (short) -1, (int) '#', strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\377\375h\000i\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y?y?y?h?i?!?: java.io.UnsupportedEncodingException: ?y?y?y?h?i?!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\u3f3f");
        doubleMetaphoneResult4.append('\u6148');
        doubleMetaphoneResult4.appendPrimary('\346');
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!a");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("??");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6900\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f", "\000\376\377\000h\000i\000!\000a");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a4", "\375\377\375\377\000\000h\000\000\000i\000\000\000!\000", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!a");
        char char12 = doubleMetaphone0.charAt("hi!ii4hi!a", (-1));
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult2.appendPrimary('a');
        java.lang.String str5 = doubleMetaphoneResult2.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u3f00\u3f00\000\u3f00\000\u3f00\000\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "16) test1863(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 0, (byte) 72, (byte) 97, (byte) 0, (byte) 0 });
// flaky "5) test1863(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100\u2300\u4861\000" + "'", str2, "\u6800\u6900\u2100\u2300\u4861\000");
// flaky "2) test1863(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000#\000Ha\000\000" + "'", str3, "h\000i\000!\000#\000Ha\000\000");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray12);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u0164\u0a01\ufffd\u6869", (int) '\ufeff', (int) '\ubf61', strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!", "\000h\000i\000!\000a", false);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\uff64\u0a0a\u01ff", "\ufffd\ufffd\000h\000i\000!", true);
        char char13 = doubleMetaphone0.charAt("\277\357\346\275\200\240\244\346\342\200\200\204\204\346\377\375", 0);
        char char16 = doubleMetaphone0.charAt("", (int) '\ufeff');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\277' + "'", char13 == '\277');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!a\000\u0164\u0a01\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???H: java.io.UnsupportedEncodingException: ???H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 0, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\uc3be\uc3bf\303\ua600\uc285\302\ufffd", (int) '\376', (int) ' ', strArray21);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains(" ", 100, 1, strArray21);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6800\u6900\u2100", 4, 35, strArray21);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100\000", (int) 'a', (int) '\u6869', strArray21);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean3 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd", "\u3f3fhi!a");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("4\001d\n\001\n", "HT");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\u6800\u6900\u2100\u6100", "\376");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str16 = doubleMetaphone0.encode("\u3f3fhi!a");
        char char19 = doubleMetaphone0.charAt("\376\377\000h\000i\000!", (int) '\ufffd');
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\ufeff\u3f3f\ufffd", false);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("???", "\u3f3f\u3f00", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult8.append('#', 'a');
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate('#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.append("aH", "hi!a");
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.append("\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000", "\u6900\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6100\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3fi #", "\277\357\346\275\200\240\244\346\342\200\200\204\204\346\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?i???????a??????y?y?: java.io.UnsupportedEncodingException: ?i???????a??????y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100\000" + "'", str3, "\u6800\u6900\u2100\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000\000\000" + "'", str4, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h\000i\000!\000\000\000" + "'", str5, "h\000i\000!\000\000\000");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("aH\376\377\u0164\u0a01\ufffd\000##ah");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str12 = doubleMetaphone0.encode("Ha");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000\303\276\303\277\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("##4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6869\u2161");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35, (byte) 0, (byte) 35, (byte) 0, (byte) 52 });
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\uc3be\uc3bf\303\ua600\uc285\302\ufffd", (int) '\376', (int) ' ', strArray21);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains(" ", 100, 1, strArray21);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6800\u6900\u2100", 4, 35, strArray21);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u4100", 0, (int) '\376', strArray21);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\376\377\000\346\000\205\000\210", "\u3f3f");
        doubleMetaphoneResult8.appendPrimary('h');
        doubleMetaphoneResult8.appendPrimary('\u6869');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("i ", true);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("h\000i\000!\000a\000");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\u6148\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
// flaky "17) test1884(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("???");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\377\376h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        doubleMetaphone0.setMaxCodeLen((int) '\277');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\u6148", false);
        java.lang.String str9 = doubleMetaphone0.encode("HT");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000H", false);
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "T" + "'", str9, "T");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u0164\u0a01\ufffd" + "'", str9, "\u0164\u0a01\ufffd");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6148");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "18) test1890(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72, (byte) -26, (byte) -123, (byte) -120 });
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000hi!a ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 32 });
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\277\357\346\275\200\240\244\346\342\200\200\204\204\346\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\000", (int) (byte) -1, (int) '\ufffd', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.append("aH", "hi!a");
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("hi!\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\ufffd\u6800\u6900\u2100" + "'", str2, "\ufeff\ufffd\u6800\u6900\u2100");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.appendPrimary('\000');
        doubleMetaphoneResult4.appendPrimary('#');
        doubleMetaphoneResult4.appendAlternate("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u6968\u6121");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148", "\ufffd\u6800\u6900\u2100\u6100", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
// flaky "19) test1899(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\u2300" + "'", str2, "\ufffd\000\u2300");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("aH", (int) ' ');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\ufffd\ufffd\000H", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult20.appendPrimary("\u6869\u2141");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u4861", "\000\000\377\375\000\000\377\375\000\000\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??y?y???y?y???y?y?: java.io.UnsupportedEncodingException: ??y?y???y?y???y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("aH", (int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("\ufeff#");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148h\000i\000!\000a\000\u6869", "\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("");
        java.lang.Class<?> wildcardClass22 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "20) test1904(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd", false);
        java.lang.String str8 = doubleMetaphone0.encode("i ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\375\377\375\377\000\000h\000\000\000i\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeffaH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?aH" + "'", str2, "?aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?aH" + "'", str3, "?aH");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        char char15 = doubleMetaphone0.charAt("#hi!aT", (int) (byte) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\ufffd\ufffd\ufffd\ufffdH\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '#' + "'", char15 == '#');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u6968\u6121");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!aT", "##a", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "21) test1910(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 97, (byte) -29, (byte) -68, (byte) -65 });
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\376h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -66, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\303\277\303\276h\000i\000!\000" + "'", str2, "\303\277\303\276h\000i\000!\000");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\277');
        doubleMetaphoneResult9.append("\ufffd\ufffd\ufffd\ufffdh\000i\000!\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\000\000\000H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!a", "hi!a");
        doubleMetaphoneResult4.appendAlternate('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\376\377\000h\000i\000!\000a");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6968\u6121", "ai", true);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("h\000i\000!\000", "\346\205\210", false);
        doubleMetaphone0.setMaxCodeLen(0);
        char char26 = doubleMetaphone0.charAt("\ufeff\346\205\210", (int) '\u6869');
        doubleMetaphone0.setMaxCodeLen((int) 'T');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.append("\376\377\000h\000i\000!", "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        doubleMetaphoneResult4.append("\u2300");
        doubleMetaphoneResult4.append("\000A", "\u3f3f\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u2323\u6168");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 35, (byte) 35, (byte) 97, (byte) 104 });
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\376\377\000h\000i\000!", true);
        char char13 = doubleMetaphone0.charAt("\ufeff#", (int) '\ufffd');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000 ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000 \000" + "'", str2, "\000\000 \000");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("4");
        int int3 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\0004\000\000\000i\0004aH\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 52, (byte) 97, (byte) 72, (byte) 0, (byte) 97 });
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("aH\376\377\u0164\u0a01\ufffd\000##ah");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "22) test1922(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72, (byte) 63, (byte) 63, (byte) 97, (byte) 72, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 35, (byte) 35, (byte) 97, (byte) 104 });
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str2, "\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\u6800\u6900\u2100");
        doubleMetaphoneResult4.append('\u6148');
        doubleMetaphoneResult4.appendPrimary('\346');
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult11.appendAlternate("");
        doubleMetaphoneResult11.append('?');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("##ah");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.encode("\u6148a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
// flaky "23) test1926(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000h\000i\000!\000a\000", 0, (int) (short) 1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str3 = doubleMetaphoneResult2.getAlternate();
        java.lang.String str4 = doubleMetaphoneResult2.getPrimary();
        doubleMetaphoneResult2.append('\u6148', '\346');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f???", "\u6148\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!#??: java.io.UnsupportedEncodingException: hi!#??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str13 = doubleMetaphoneResult12.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "??");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\346\205\210" + "'", str2, "\ufeff\346\205\210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str4, "\376\377\000\346\000\205\000\210");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str5, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str6, "\376\377\000\346\000\205\000\210");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\377\375H\000", "\ufffdh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?h: java.io.UnsupportedEncodingException: ?h");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("##", "\ufffd\u4800");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("#i", 1, (int) '\346', strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f23\u3f21", (int) '\376', (int) (byte) 10, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a", (int) '\376', (int) '\377', strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148\000", (int) 'h', 0, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", 32, (int) '\u6869', strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a", 0, (int) (short) 1, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\000#\000h\000i\000!\000a\000T", (int) '\346', (int) '\000', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\uc3be\uc3bf\303\ua600\uc285\302\ufffd", (int) 'a', (int) 'a', strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000H", "\u3f00\u0100\u6400\u0a00\u0100\u0a00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?A???A??: java.io.UnsupportedEncodingException: ?A???A??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.appendPrimary("");
        java.lang.String str6 = doubleMetaphoneResult3.getAlternate();
        doubleMetaphoneResult3.appendPrimary("\u0164\u0a01\ufdff");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\u2141");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -30, (byte) -123, (byte) -127 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000", "\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?h?i?!: java.io.UnsupportedEncodingException: ?h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("i#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!h\000i\000!\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!h?i?!?4: java.io.UnsupportedEncodingException: hi!h?i?!?4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 35, (byte) 0 });
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "\ubbef\u23bf", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\u6800\u6900\u2100\000", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", (int) (byte) 1, 100, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\ufffd\000\ufffd\000\ufffd", (int) (byte) 10, (int) '\346', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6968\u6121", 32, (int) '\376', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\303\276\303\277\000\303\246\000\302\205\000\302\210", 0, (int) '?', strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\uff00\ufe00\u6800\000\u6900\000\u2100\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!\000a" + "'", str3, "\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("\376\377\000a\000H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a", "\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000", true);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("h\000i\000!\000#\000Ha\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("i");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\376\377\000h\000i\000!\000a", "\000\376\377\000h\000i\000!\000a", false);
        char char24 = doubleMetaphone0.charAt("ai", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!a\000\u0164\u0a01\ufffd");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("AT", true);
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6800\u6900\u2100\376\ufffd\ufffd\000h\000i\000!\000a", "\ufffd\ufffd\ufffd#");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AT" + "'", str29, "AT");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\376\377\000h\000i\000!\000a" + "'", str2, "\ufdff\376\377\000h\000i\000!\000a");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6900\u2000\u6900");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\u6800\u6900\u2100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6800\u6900\u2100\u6148\346");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi! ?????: java.io.UnsupportedEncodingException: hi! ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\001\000d\000\n\000\001\000\n" + "'", str2, "\ufffd\ufffd\000\001\000d\000\n\000\001\000\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\001d\n\001\n" + "'", str3, "\ufeff\001d\n\001\n");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.append("i");
        doubleMetaphoneResult2.append('\376');
        doubleMetaphoneResult2.appendAlternate('\u6869');
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.append("h\000i\000!\000", "i ");
        doubleMetaphoneResult9.append('i');
        doubleMetaphoneResult9.appendPrimary("\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("4\000\u6148a");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "24) test1957(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 52, (byte) 97, (byte) 72, (byte) 0, (byte) 97 });
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("h\000i\000!\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "##4\000h\000\000\000i\000\000\000!\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##4?h???i???!??: java.io.UnsupportedEncodingException: ##4?h???i???!??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\0004");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3400" + "'", str2, "\u3f3f\u3400");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.append("\376\377\000h\000i\000!", "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        doubleMetaphoneResult4.append("\u2300");
        doubleMetaphoneResult4.append('\u3f21', '\277');
        doubleMetaphoneResult4.appendAlternate('\u010a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult5.append('\346');
        doubleMetaphoneResult5.append('?', '\u010a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffdh");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) 104 });
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode(" ");
        byte[] byteArray10 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("#\376\377\000h\000i\000\u6869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) byteArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky "25) test1964(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 63 });
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("a4 #");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0, (byte) 52, (byte) 0, (byte) 32, (byte) 0, (byte) 35, (byte) 0 });
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\u6148\000", "\000");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        char char8 = doubleMetaphone0.charAt("\u6401\u010a\ufffd", (int) 'h');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\u4800\u6100", "\u6800\u6900\u2100", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f#hi!aT");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 35, (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 84 });
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000H" + "'", str2, "\000H");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("##4");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 35, (byte) 0, (byte) 35, (byte) 0, (byte) 52 });
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        java.lang.String str17 = doubleMetaphone0.encode("\ufffd\ufffd\000#\000i");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aH" + "'", str3, "aH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aH" + "'", str4, "aH");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -73, (byte) -65, (byte) -17, (byte) -73, (byte) -65, (byte) 0, (byte) -17, (byte) -73, (byte) -65, (byte) 0, (byte) -17, (byte) -73, (byte) -65, (byte) 0, (byte) -17, (byte) -73, (byte) -65 });
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!a", "hi!a");
        doubleMetaphoneResult4.appendPrimary("i");
        doubleMetaphoneResult4.append("A");
        java.lang.String str19 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4hi!aA" + "'", str19, "4hi!aA");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!\000\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0, (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.append("\376\377\000h\000i\000!", "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        doubleMetaphoneResult4.append('\u6869');
        doubleMetaphoneResult4.appendAlternate('a');
        boolean boolean17 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate('\u6148');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffdH\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 72, (byte) 0 });
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0164\u0a01\ufffd" + "'", str7, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\000");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff", "\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????: java.io.UnsupportedEncodingException: ???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6148", "h\000i\000!\000a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: h?i?!?a?: java.io.UnsupportedEncodingException: h?i?!?a?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148\000", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdhi!a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "26) test1982(org.apache.commons.codec.language.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u6968\u6121");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000", true);
        doubleMetaphone0.setMaxCodeLen((int) '\ufffd');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000\000\000i\000\000\000!\000\000" + "'", str3, "\000h\000\000\000i\000\000\000!\000\000");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult9.append("Ha", "\000h\000i\000!");
        doubleMetaphoneResult9.append("\u4861", "aa\377\375\u6148");
        doubleMetaphoneResult9.append('4', '\346');
        doubleMetaphoneResult9.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("a ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a\000 \000" + "'", str2, "a\000 \000");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!a", "hi!a");
        doubleMetaphoneResult4.appendPrimary("i");
        java.lang.String str17 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4hi!a" + "'", str17, "4hi!a");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.appendPrimary("");
        doubleMetaphoneResult3.appendAlternate('\346');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000\000\000" + "'", str3, "h\000i\000!\000\000\000");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufeffhi!", (int) '\ubf61', (int) '?', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u6968\u6121");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "\001d\n\001\n");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str22 = doubleMetaphoneResult21.getPrimary();
        java.lang.String str23 = doubleMetaphoneResult21.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6800\u6900\u2100\u6100" + "'", str2, "\ufffd\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdh\000i\000!\000a\000" + "'", str3, "\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdh\000i\000!\000a\000" + "'", str4, "\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufdffhi!a" + "'", str5, "\ufdffhi!a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\377\375h\000i\000!\000a\000" + "'", str6, "\377\375h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\377\375h\000i\000!\000a\000" + "'", str7, "\377\375h\000i\000!\000a\000");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        int int16 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000", "#\000", false);
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!i", "", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("???");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult11.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary("\376");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000hi!a" + "'", str15, "\000hi!a");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????h???i???!?: java.io.UnsupportedEncodingException: ??????h???i???!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\000" + "'", str3, "hi!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000\000\000" + "'", str4, "h\000i\000!\000\000\000");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("#??\000h\000i\000!?");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f???");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 35, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\ufffd\u4800" + "'", str2, "\ufeff\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffdH\000" + "'", str3, "\ufffd\ufffd\ufffd\ufffdH\000");
    }
}
