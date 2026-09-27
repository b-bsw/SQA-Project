package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6869\u2141");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f" + "'", str3, "\u3f3f");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\u3f3f\ufffd");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean3 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        char char6 = doubleMetaphone0.charAt("\376\377\000H", (int) 'h');
        int int7 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffda", "iha!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        boolean boolean17 = doubleMetaphoneResult4.isComplete();
        boolean boolean18 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate('\u6148');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) (byte) -1, 10, strArray12);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffdaH", 100, (int) 'h', strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!#hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!#hi!a?hi!#???d????h?i?!?a: java.io.UnsupportedEncodingException: hi!#hi!a?hi!#???d????h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) '4', (int) '4', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd", (int) (byte) 100, (int) (byte) -1, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000H", (int) '\u3f21', 4, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufdffH", (int) '\ufeff', (int) '\u6148', strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a\000\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test2509(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 97, (byte) 72, (byte) 0, (byte) 0 });
// flaky "1) test2509(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000" + "'", str2, "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
// flaky "1) test2509(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000" + "'", str3, "\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000");
// flaky "1) test2509(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000" + "'", str4, "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        java.lang.String str12 = doubleMetaphone0.encode("\u6869\u2161");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("a", true);
        java.lang.String str17 = doubleMetaphone0.encode("\u6869");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
// flaky "2) test2510(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u613f\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 97, (byte) 63, (byte) -1, (byte) -3 });
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char11 = doubleMetaphone0.charAt("hi!\000\000", 0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'h' + "'", char11 == 'h');
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "\001d\n\001\n");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("i#", "\ufffd\ufffda", false);
        java.lang.String str14 = doubleMetaphone0.encode("hi!H");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000 \000\000", "\u6869\u2169\u6934\u6869\u2161", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("44ih\000i\000!\000a\000\u6800\u6900\u2100\u2300\u4861\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("\ufeff\ufffd\u4800", "h\000i\000!\000");
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate("ai");
        boolean boolean11 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate('#');
        doubleMetaphoneResult4.appendAlternate('\u6148');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\uff64\u0a0a\u01ff", (int) (short) 10);
        java.lang.String str14 = doubleMetaphone0.encode("hi!a4");
        doubleMetaphone0.setMaxCodeLen((int) '\u3f21');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult4.append('i');
        doubleMetaphoneResult4.append("HT");
        doubleMetaphoneResult4.appendAlternate('\376');
        doubleMetaphoneResult4.appendAlternate("\uefbb\ubf23");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!??: java.io.UnsupportedEncodingException: hi!??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148" + "'", str3, "\u6148");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4861" + "'", str4, "\u4861");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100", false);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("##", "##4");
        java.lang.String str19 = doubleMetaphone0.encode("\u4800\u6100");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("i#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000i\000#" + "'", str2, "\ufffd\ufffd\000i\000#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u6900\u2300" + "'", str3, "\ufffd\u6900\u2300");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate("hi!A");
        doubleMetaphoneResult4.append("\ubfc3\ubdc3hi!a", "\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000\000\u6100");
        java.lang.String str20 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4\000hi!A\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000\000\u6100" + "'", str20, "4\000hi!A\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000\000\u6100");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6401\u010a\ufdff\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0 });
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "hi!A", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3400", "\u3f3f???", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\u0164\u0a01\ufffd", "\uff64\u0a0a\u01ff");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("4\376\377aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) -2, (byte) -1, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe34\u61ff\ufffd" + "'", str2, "\ufe34\u61ff\ufffd");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6401\u010a\ufdff\u6968");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000\000\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????h???i???!???a: java.io.UnsupportedEncodingException: ?????????h???i???!???a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -112, (byte) -127, (byte) -60, (byte) -118, (byte) -17, (byte) -73, (byte) -65, (byte) -26, (byte) -91, (byte) -88 });
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\u3f3f");
        boolean boolean12 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('a', '\ufffd');
        doubleMetaphoneResult4.appendPrimary('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("a\000 \000", "\u6834\u2169\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!", "H");
        boolean boolean15 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate("\uc3be\uc3bfhi!a");
        doubleMetaphoneResult4.appendAlternate('\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeff4\000\u6148a", "\uff00\ufe00\u6800\000\u6900\000\u2100\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 0, strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("i#", 1, (int) 'a', strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 4, (int) '\000', strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff\000#i", (int) (short) 0, (int) 'a', strArray31);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult5.appendPrimary("aa???");
        java.lang.String str8 = doubleMetaphoneResult5.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("#\376\377\000h\000i\000\u6869", "\357\267\277");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i???: java.io.UnsupportedEncodingException: i???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6869");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ai?: java.io.UnsupportedEncodingException: ai?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "3) test2537(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72, (byte) 63 });
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult9.appendPrimary('?');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6869", "\ufffd", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.String str31 = doubleMetaphone0.encode("\376");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000h\000i\000!\000a" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc3be\uc3bfhi!a" + "'", str3, "\uc3be\uc3bfhi!a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc3be\uc3bfhi!a" + "'", str4, "\uc3be\uc3bfhi!a");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u6968\u6121");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "\001d\n\001\n");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        char char23 = doubleMetaphone0.charAt("#??\000h\000i\000!?", (int) (short) 10);
        char char26 = doubleMetaphone0.charAt("hi!\000\000", 65533);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u013f\u0a64\u0a01");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -60, (byte) -65, (byte) -32, (byte) -87, (byte) -92, (byte) -32, (byte) -88, (byte) -127 });
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!\000a" + "'", str3, "\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!\000a" + "'", str4, "\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6800\u6900\u2100\u6100" + "'", str5, "\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000h\000i\000!\000a" + "'", str6, "\000h\000i\000!\000a");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray24);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray24);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\377\375", 35, (int) (byte) 10, strArray24);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000a\000H", 0, 10, strArray24);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd", (int) (short) 10, 105, strArray24);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, (int) '\u4800', strArray24);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("\ufffd\ufffd\000H");
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate("\273\357#\277");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        char char10 = doubleMetaphone0.charAt("", (int) '\277');
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd", false);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000h\000i\000!", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\376\377\000h\000i\000!\000\ufeff");
        char char16 = doubleMetaphone0.charAt("\ufeffaH", 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3 });
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!", "H");
        doubleMetaphoneResult4.appendPrimary("\ufeff\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.appendAlternate("\u3f3f\ufffd");
        doubleMetaphoneResult4.append("\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufffd");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\000H");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) "\ufffd\ufffd\000H");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!\000\ufeff", "\ufffdh");
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0164\u0a01\ufffd" + "'", str2, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001d\n\001\n" + "'", str3, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u0164\u0a01\ufffd" + "'", str4, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001d\n\001\n" + "'", str5, "\001d\n\001\n");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\000\u2300");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 35 });
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str12 = doubleMetaphone0.encode("Ha");
        doubleMetaphone0.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u6800\u6900\u2100\ufffd\u4800");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult5.appendAlternate('a');
        doubleMetaphoneResult5.appendPrimary('\u010a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str11 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char16 = doubleMetaphone0.charAt("\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000", 10);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\ue6a1\ua9e2\u85a1", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendPrimary("\ufffd\u4800");
        doubleMetaphoneResult4.appendPrimary("\000h\000i\000!\000a");
        java.lang.String str14 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendAlternate("\u6401\u010a\ufdff");
        doubleMetaphoneResult4.appendAlternate('\346');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate("#");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "i#" + "'", str15, "i#");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "#\000");
        byte[] byteArray19 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6800\u6900\u2100\000");
        java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100\000");
        char char23 = doubleMetaphone0.charAt("\376\377\000\377\000\375\000\377\000\375", (int) '#');
        char char26 = doubleMetaphone0.charAt("\ufffd\ue600\u8500\u8800", (int) '\000');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\ufffd' + "'", char26 == '\ufffd');
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6800\u6900\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100\000" + "'", str2, "\u6800\u6900\u2100\000");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(' ', 'i');
        doubleMetaphoneResult7.append("\001d\n\001\n");
        doubleMetaphoneResult7.append("\u3f3fi ", "\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff");
        doubleMetaphoneResult7.append("\376\377\377\375H\000", "\ufffd\u2300\u6900");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "a", false);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "??H", true);
        char char27 = doubleMetaphone0.charAt("\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000", (int) '\u6869');
        byte[] byteArray29 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str30 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray29);
        java.lang.String str31 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray29);
        java.lang.String str32 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray29);
        java.lang.String str33 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray29);
        java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) str33);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6900\u2000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 105, (byte) 0, (byte) 32, (byte) 0 });
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\001d\n\001\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "##ah\000\376\377\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##ah??y??h?i?!?a: java.io.UnsupportedEncodingException: ##ah??y??h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\u3f3f\ufffd" + "'", str2, "\ufeff\u3f3f\ufffd");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000\377\000\375\000\377\000\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???h???i???!???a: java.io.UnsupportedEncodingException: ???h???i???!???a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\377\000\375\000\377\000\375" + "'", str2, "\376\377\000\377\000\375\000\377\000\375");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append("\ufffd\u6800\u6900\u2100\u6100");
        doubleMetaphoneResult7.appendAlternate("\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str2, "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\000\000\000\000\000\000\000\000\000\000\000\000h\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000i\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000!\000\000" + "'", str2, "\376\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\000\000\000\000\000\000\000\000\000\000\000\000h\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000i\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000!\000\000");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!A");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!A: java.io.UnsupportedEncodingException: hi!A");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append('\ufeff');
        doubleMetaphoneResult7.appendAlternate('\376');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6869\u2161");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375" + "'", str3, "\377\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd" + "'", str4, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\377\375" + "'", str5, "\377\375");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffd" + "'", str6, "\ufffd\ufffd");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.appendPrimary('\000');
        java.lang.String str12 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#hi!a" + "'", str12, "#hi!a");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100", false);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("hi!a");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("hi!i");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6869\u2141", "i ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult16.appendAlternate("\000\376\377\000h\000i\000!\000a#");
        java.lang.String str19 = doubleMetaphoneResult16.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000i" + "'", str2, "\376\377\000i");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        doubleMetaphoneResult7.append('\u010a', '\346');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000hi!a " + "'", str18, "\000hi!a ");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("h\000i\000!\000a\000");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000 \000\000", "\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000A", "\357\273\277\357\277\275\344\240\200");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i???i???a???: java.io.UnsupportedEncodingException: i???i???a???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append(' ', 'i');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('T');
        doubleMetaphoneResult7.appendAlternate("\376\377\000a\000H");
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendAlternate('\u6869');
        java.lang.String str8 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000\000\000\000\000\000\000\000\000\000\000h\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000i\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000!\000\000\000" + "'", str2, "\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000\000\000\000\000\000\000\000\000\000\000h\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000i\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000!\000\000\000");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a4 ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 52, (byte) 32 });
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u613f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 63, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u613f\ufffd" + "'", str2, "\u613f\ufffd");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("a ", 0, (int) '4', strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", 65533, 32, strArray25);
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
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000h\000i\000!\000a", "hi!a\000\u6148\000hi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!a???hi!a: java.io.UnsupportedEncodingException: hi!a???hi!a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate("ai");
        doubleMetaphoneResult4.append('\346', 'a');
        doubleMetaphoneResult4.appendPrimary('\u4800');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\357\267\277");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6800\u6900\u2100\u2300\u4861\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 0, (byte) 72, (byte) 97, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\000\u6900\000\u2100\000" + "'", str3, "\u6800\000\u6900\000\u2100\000");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u4100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 65, (byte) 0 });
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("#", true);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\376\377\000h\000i\000!\000a");
        char char17 = doubleMetaphone0.charAt("\u013f\u0a64\u0a01", (int) '\u6148');
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000hi!a", "HT", true);
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\u4800\000", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd", false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str9 = doubleMetaphone0.encode("\ubec3\ubfc3\u6800\u6900\u2100\u6100\ubbef\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        boolean boolean11 = doubleMetaphoneResult9.isComplete();
        doubleMetaphoneResult9.append('#', '\377');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("i i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffdaH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???aH: java.io.UnsupportedEncodingException: ???aH");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 32, (byte) 0, (byte) 105 });
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("#aa");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) 97, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd" + "'", str5, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd" + "'", str6, "\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufdff" + "'", str7, "\ufdff");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str4 = doubleMetaphoneResult3.getAlternate();
        boolean boolean5 = doubleMetaphoneResult3.isComplete();
        doubleMetaphoneResult3.append('\ubf61');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("\ufffd\u6100\u4800");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\u6921" + "'", str2, "\u6968\u6921");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u010a');
        java.lang.String str7 = doubleMetaphone0.encode("???\000");
        char char10 = doubleMetaphone0.charAt("\ufeff\377\375\377\375", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\ufeff' + "'", char10 == '\ufeff');
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        boolean boolean17 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendPrimary('i');
        doubleMetaphoneResult4.appendPrimary("\ubfc3\ubdc3hi!a");
        doubleMetaphoneResult4.appendAlternate("\ufffd\u4800");
        doubleMetaphoneResult4.append('\u0a01', '\u4800');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\u3f3f\ufffd");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000?\000\001\000d\000\n\000\001\000\n", "\ufffd\ufffd\000a\000i", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
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
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4Ha????????: java.io.UnsupportedEncodingException: 4Ha????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd#" + "'", str2, "\ufffd\ufffd\ufffd#");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "4) test2613(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2300\ufdff\ufdff\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100" + "'", str2, "\u2300\ufdff\ufdff\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('a', '4');
        doubleMetaphoneResult4.appendPrimary("H");
        java.lang.String str11 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('\u6148', '\u6148');
        java.lang.String str15 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("\u6923", "#i\346");
        boolean boolean19 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
// flaky "5) test2614(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6148" + "'", str15, "\u6148");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufdff\ufdff\000\u0100\000\u6400\000\u0a00\000\u0100\000\u0a00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!", "\000h\000i\000!\000a", false);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\uff64\u0a0a\u01ff", "\ufffd\ufffd\000h\000i\000!", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u2323\u6168", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("4\376\377aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 52, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4\376\377aH" + "'", str2, "4\376\377aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0004\000\ufffd\000\ufffd\000a\000H" + "'", str3, "\0004\000\ufffd\000\ufffd\000a\000H");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ue6a5\ua8e6\u84a1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6869\u2169\u6934\u6869\u2161");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -26, (byte) -124, (byte) -95 });
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000\000\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u4861");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ha" + "'", str2, "Ha");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ha" + "'", str3, "Ha");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufffd");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\000H");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) "\ufffd\ufffd\000H");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!\000\ufeff", "\ufffdh");
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean48 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray47);
        boolean boolean49 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray47);
        boolean boolean50 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray47);
        boolean boolean51 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray47);
        boolean boolean52 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (short) 1, (int) (short) 100, strArray47);
        boolean boolean53 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", 0, (int) ' ', strArray47);
        boolean boolean54 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!", (int) '\u6869', (int) 'a', strArray47);
        boolean boolean55 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'T', 97, strArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = doubleMetaphone0.encode((java.lang.Object) strArray47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\377\376h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdh\000i\000!\000" + "'", str2, "\ufffd\ufffdh\000i\000!\000");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -30, (byte) -123, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ue6a1\ua9e2\u85a1" + "'", str3, "\ue6a1\ua9e2\u85a1");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u233f\u3f00\u6800\u6900\u213f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 35, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 63 });
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('a', '4');
        doubleMetaphoneResult4.appendPrimary("H");
        java.lang.String str11 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append("hi!#hi!a\000hi!a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "#\000");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6900\u2000", "\000H\000a", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', '?');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 72, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4800\u6100" + "'", str2, "\u4800\u6100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4800\u6100" + "'", str3, "\u4800\u6100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000H\000a" + "'", str4, "\000H\000a");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.append("\346\205\210");
        doubleMetaphoneResult8.appendAlternate('i');
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("\u6148");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!a4 ", "\u3f3f\u3f00\u3f00\u3f00\u3f00\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100", false);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("##", "##4");
        java.lang.String str19 = doubleMetaphone0.encode("\u4800\u6100");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphone0.setMaxCodeLen((int) '\ufeff');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult9.appendAlternate("\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary("i");
        doubleMetaphoneResult4.append("\u6120\ufffd");
        doubleMetaphoneResult4.appendPrimary("\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.String str9 = doubleMetaphone0.encode("hi!a");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000\000\000i\000\000\000!\000\000", "\ufffd\ufffd");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148h\000i\000!\000a\000\u6869", "\346\205\210", true);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd\000\000", "hi!a\000hi!a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNull(str15);
// flaky "6) test2638(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), 4, strArray21);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\uff64\u0a0a\u01ff", (int) ' ', (int) '\u010a', strArray21);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!\0004", (int) '\u3f21', 10, strArray21);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("AT", 52, 0, strArray21);
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
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (short) 1, (int) (short) 100, strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", 0, (int) ' ', strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!", (int) '\u6869', (int) 'a', strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'T', 97, strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("h\000i\000!\000a\000", (int) (short) 1, (int) 'T', strArray31);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int9 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u6148');
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.appendPrimary('i');
        doubleMetaphoneResult4.appendPrimary("\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!ii4hi!a", 35, (int) '#', strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, 0, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("#ia", (int) '\ufeff', (int) '\ubf61', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000", 0, (int) (short) 0, strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u6100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "??");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 72, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ha" + "'", str2, "Ha");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufdffhi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -73, (byte) -65, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendAlternate("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("#\376\377\000h\000i\000\u2300");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "7) test2648(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 63 });
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000h\000i\000!\000a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ubbef\u61bf\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6401\u010a\ufdff\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) -3, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\001d\n\001\ufffd\ufffd\000\000" + "'", str2, "\001d\n\001\ufffd\ufffd\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001d\n\001\ufffd\ufffd\000\000" + "'", str3, "\001d\n\001\ufffd\ufffd\000\000");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\000\001\000d\000\n\000\001\000\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3fhi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str9 = doubleMetaphone0.encode("\ufdffhi!a");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("hi!ahi!#", true);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HH" + "'", str12, "HH");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("4");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\277');
        doubleMetaphoneResult4.appendAlternate("\000\303\276\303\277\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("AT");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 65, (byte) 0, (byte) 84 });
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000", "\376\377\000\346\000\205\000\210", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\u3f3f\u3f3f");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377aH" + "'", str2, "\376\377aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148" + "'", str3, "\u6148");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdaH" + "'", str4, "\ufffd\ufffdaH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffdaH" + "'", str5, "\ufffd\ufffdaH");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000\u6148", "hi!i", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("a ");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128, (byte) -26, (byte) -124, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufdff" + "'", str2, "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148\000", (int) 'h', 0, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", 32, (int) '\u6869', strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) '\u6148', (int) '\u6148', strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100", (int) '#', (int) ' ', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a\0004", (int) '\000', (int) '4', strArray28);
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
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate("#");
        doubleMetaphoneResult7.appendPrimary('\u6148');
        doubleMetaphoneResult7.appendAlternate('\000');
        java.lang.String str19 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "i#\000" + "'", str19, "i#\000");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str2, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str3, "\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!\000a" + "'", str4, "\000h\000i\000!\000a");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\u6148", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000 ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\u2000" + "'", str2, "\000\u2000");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str2, "\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f\u3f00\u3f00\u3f00\u3f00\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
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
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u4100");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "8) test2672(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 32, (byte) 65, (byte) 0 });
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\000H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("??\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6900\u2000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000h\000i\000!\000a" + "'", str2, "??\000h\000i\000!\000a");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        java.lang.String str14 = doubleMetaphone0.encode("\u6148");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ai");
        doubleMetaphone0.setMaxCodeLen((int) '\376');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff", false);
        doubleMetaphone0.setMaxCodeLen((int) '\ufeff');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.append('4');
        doubleMetaphoneResult3.append('\u6148');
        doubleMetaphoneResult3.append(' ', '#');
        doubleMetaphoneResult3.append("??\000H", "\ufffd\ufffd");
        doubleMetaphoneResult3.append("\ufffd\u4800", "\ufffd\ufffda");
        java.lang.String str17 = doubleMetaphoneResult3.getAlternate();
        doubleMetaphoneResult3.append("\000 ", "hi!ah\000i\000!\0004???");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("??\000H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3fH" + "'", str2, "\u3f3fH");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("i", (int) ' ', (int) '\u6148', strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (byte) 0, 1, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("i ", (int) '\ufffd', (int) '\ufeff', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd", (int) '\u4800', (int) '\u3f21', strArray28);
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
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.append('4');
        doubleMetaphoneResult3.appendPrimary("i");
        doubleMetaphoneResult3.append('a', '\ufeff');
        doubleMetaphoneResult3.appendPrimary("\u6800\u6900\u2100\000");
        doubleMetaphoneResult3.append("\uefbf\ubd00\uefbf\ubd00\000\u6800\000\u6900\000\u2100\000\u6100", "\ufffd\u4800");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("#i\346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6900\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 105, (byte) -61, (byte) -90 });
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!: java.io.UnsupportedEncodingException: hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd???\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 63, (byte) 63, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubfef\uefbd\ubdbf\u3f3f?" + "'", str2, "\ubfef\uefbd\ubdbf\u3f3f?");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!" + "'", str2, "\376\377\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str3, "\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\u6800\u6900\u2100" + "'", str4, "\ufffd\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\u6800\u6900\u2100" + "'", str6, "\ufffd\u6800\u6900\u2100");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u2300\ufdff\ufdff\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.appendPrimary(' ');
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendPrimary("\000hi!a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        java.lang.String str10 = doubleMetaphone0.encode("\ufeff");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\377\375h\000i\000!\000a\000" + "'", str2, "\376\377\377\375h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffdh\000i\000!\000a\000" + "'", str3, "\ufffd\ufffd\ufffd\ufffdh\000i\000!\000a\000");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult8.append("\376\377\000\377\000\375\000\377\000\375");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000", true);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("h\000i\000!\000a\000", false);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148", "\u6800\u6900\u2100\000", false);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "9) test2693(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\000h\000i\000!\000a" + "'", str2, "\ufeff\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str3, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!" + "'", str2, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.append('\ufeff', '#');
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('a', ' ');
        doubleMetaphoneResult7.appendAlternate("\376\377\000a\000H");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\u4800\u6100", "\000hi!a", true);
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000", "\ufeff\000h\000i\000!\000a", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!#hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u2300\ufdff\ufdff\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100", "\u6120");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("#\000\u3f3f\u6148", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult17.appendAlternate("hi!a\000");
        java.lang.String str20 = doubleMetaphoneResult17.getAlternate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!a\000" + "'", str20, "hi!a\000");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\0004");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\0004" + "'", str2, "??\0004");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH\376\377\u0164\u0a01\ufffd\000##ah");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "10) test2703(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72, (byte) -2, (byte) -1, (byte) 97, (byte) 72, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 35, (byte) 35, (byte) 97, (byte) 104 });
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\001d\n\001\n", "aH");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("???", true);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000\000\000i\000\000\000!\000\000", "aH#4");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("??\000?\000?\000?");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u3f00\u3f00\000\u3f00\000\u3f00\000\u3f00" + "'", str2, "\ufffd\u3f00\u3f00\000\u3f00\000\u3f00\000\u3f00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000?\000?\000\000\000?\000\000\000?\000\000\000?" + "'", str3, "\376\377\000?\000?\000\000\000?\000\000\000?\000\000\000?");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\u3f3f", true);
        char char14 = doubleMetaphone0.charAt("\000\376\377\000h\000i\000!\000a", (int) (byte) 10);
        char char17 = doubleMetaphone0.charAt("\000\000\377\375\000\000\377\375\000\000\377\375", (int) '\u3f21');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'a' + "'", char14 == 'a');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeffH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 72 });
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!ii4hi!a", 35, (int) '#', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, 0, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6900\000", 97, (int) (short) 0, strArray25);
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!# ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 0, (byte) 32, (byte) 0 });
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) -65, (byte) -17, (byte) -26, (byte) -67, (byte) -128, (byte) -96, (byte) -92, (byte) -26, (byte) -30, (byte) -128, (byte) -128, (byte) -124, (byte) -124, (byte) -26, (byte) -1, (byte) -3 });
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("iha!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult(26729);
        doubleMetaphoneResult24.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AH" + "'", str22, "AH");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!a");
        char char12 = doubleMetaphone0.charAt("hi!ii4hi!a", (-1));
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff\000#i", "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\377\375");
        char char16 = doubleMetaphone0.charAt("", 0);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode(obj17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "11) test2716(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "2) test2716(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000?\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\000?\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "12) test2717(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 0, (byte) 72, (byte) 97, (byte) 0, (byte) 0 });
// flaky "3) test2717(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000#\000Ha\000\000" + "'", str2, "h\000i\000!\000#\000Ha\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148\000" + "'", str3, "\u6148\000");
// flaky "2) test2717(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000#\000Ha\000\000" + "'", str4, "h\000i\000!\000#\000Ha\000\000");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!ahi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3fi ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "13) test2720(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 52, (byte) 0, (byte) 32, (byte) 63, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 32 });
// flaky "4) test2720(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\0004\000 ??\000i\000 " + "'", str2, "\0004\000 ??\000i\000 ");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("T");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 84 });
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u0164\u0a01\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("#\000");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("a ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a " + "'", str2, "a ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a " + "'", str3, "a ");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufdffH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??H" + "'", str2, "??H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??H" + "'", str3, "??H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\ufffd" + "'", str4, "\u3f3f\ufffd");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000#\000\000??aH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 35, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("??\000H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?\000?\000\000\000H\000" + "'", str2, "?\000?\000\000\000H\000");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!ahi!", "\ufffd\ufffd\ufffd\ufffdhi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????hi!a: java.io.UnsupportedEncodingException: ????hi!a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphone0.encode("\ufffd\u4800");
        char char12 = doubleMetaphone0.charAt("4hi!a", (int) '\u6869');
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeff", "\000", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6800\u6900\u2100\000", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd", false);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000", "\ufffd\ufdff\ufdff");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "a", false);
        java.lang.String str22 = doubleMetaphone0.encode("\000\376\377\000h\000i\000!\000a");
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("\ufdff\376\377\000h\000i\000!\000a");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6923", "", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("aHiaH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "##");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##: java.io.UnsupportedEncodingException: ##");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72, (byte) 105, (byte) 97, (byte) 72 });
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000?\000\001\000d\000\n\000\001\000\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult12.appendAlternate('\u6148');
        boolean boolean15 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.appendPrimary("\ufeff\ufffd\u4800");
        doubleMetaphoneResult12.append("\u6800\u6900\u2100\u2300\u4861\000", "\u3f3f???");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\000" + "'", str3, "hi!\000");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        char char15 = doubleMetaphone0.charAt("\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000\000\000i\000\000\000!\000\000\000", (int) (short) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6968\u6121");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 97, (byte) 33 });
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(26729);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26729 + "'", int16 == 26729);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("4\000\u6148a");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "14) test2744(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 52, (byte) 0, (byte) 72, (byte) 97, (byte) 97, (byte) 0 });
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.append("i");
        doubleMetaphoneResult2.append("a", "Ha");
        doubleMetaphoneResult2.appendAlternate('\376');
        java.lang.String str10 = doubleMetaphoneResult2.getPrimary();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ia" + "'", str10, "ia");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("ai");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeffai" + "'", str2, "\ufeffai");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000a\000i" + "'", str3, "\ufffd\ufffd\000a\000i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\000a\000i" + "'", str4, "\376\377\000a\000i");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (short) 1, (int) (short) 100, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", 0, (int) ' ', strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6900\u2000", 0, (int) '\ufeff', strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000 ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\000 " + "'", str2, "\ufeff\000 ");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("a \000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 97, (byte) 0, (byte) 32, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000a\000 \000\000" + "'", str2, "\000a\000 \000\000");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str26 = doubleMetaphoneResult25.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("aH", (int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("\ufeff#");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148h\000i\000!\000a\000\u6869", "\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(26729);
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("A", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "15) test2751(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148\000", (int) 'h', 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", 32, (int) '\u6869', strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("4\000i", (int) (byte) 1, (int) 'i', strArray22);
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
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\000\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "16) test2754(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u0164\u0a01\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6401\u010a\ufdff" + "'", str2, "\u6401\u010a\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d\001\001\n\375\377" + "'", str3, "d\001\001\n\375\377");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!a" + "'", str5, "hi!a");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("aH", (int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("\ufeff#");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148h\000i\000!\000a\000\u6869", "\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("\u6921\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "17) test2757(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f00\u0100\u6400\u0a00\u0100\u0a00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#\376\377\000h\000i\000\u6869");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "18) test2759(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 104, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#\376\377\000h\000i\000\u6869" + "'", str2, "#\376\377\000h\000i\000\u6869");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#\376\377\000h\000i\000\u6869" + "'", str3, "#\376\377\000h\000i\000\u6869");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\376\377\000h\000i\000!\000\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendAlternate('4');
        doubleMetaphoneResult9.append("hi!\000", "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        doubleMetaphoneResult9.appendPrimary("\u6800\u6900\u2100\376\ufffd\ufffd\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.lang.String[] strArray9 = new java.lang.String[] {};
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd", (int) (short) 100, (int) (byte) 1, strArray9);
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (byte) 0, (int) (byte) 1, strArray9);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!ah\000i\000!\0004???", (int) '\u0a01', (int) (short) 1, strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000", "h\000i\000!\000#\000Ha\000\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult15.append("\uec8e\ubeec\u8ebf\u6869\u2161", "??\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u6100", (int) '\u010a', (int) '\ubf61', strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("Ha", (int) 'i', (int) 'h', strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!a", true);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone0.encode("#hi!aT");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "T" + "'", str14, "T");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "19) test2766(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 97, (byte) 0, (byte) 97, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
// flaky "20) test2767(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubbef\277\ufffd" + "'", str2, "\ubbef\277\ufffd");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('\ufeff', '\u6869');
        java.lang.String str18 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h\000i\000!\000\ufeff" + "'", str18, "h\000i\000!\000\ufeff");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\u6148\000", "\000");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        java.lang.String str16 = doubleMetaphone0.encode("?");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str7 = doubleMetaphone0.encode("\ufffd\u6800\u6900\u2100\u6100");
        char char10 = doubleMetaphone0.charAt("\u6148", 4);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("?\000?\000\000\000H\000");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "21) test2770(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\u6148' + "'", char10 == '\u6148');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\u6148", false);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufeff\001d\n\001\n");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\377\375h\000i\000!\000", "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a", true);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!\000a", "\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff", true);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("iiaH", "\ufe00\uff00\u6100\u4800");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "T" + "'", str11, "T");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.appendAlternate('\000');
        java.lang.String str5 = doubleMetaphoneResult2.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.String[] strArray9 = new java.lang.String[] {};
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd", (int) (short) 100, (int) (byte) 1, strArray9);
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (byte) 0, (int) (byte) 1, strArray9);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6900\u2300", (int) '\ufffd', 105, strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u4800\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f" + "'", str3, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f" + "'", str4, "\u3f3f");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str7 = doubleMetaphone0.encode("\ufffd\u6800\u6900\u2100\u6100");
        char char10 = doubleMetaphone0.charAt("??H", (int) 'h');
        doubleMetaphone0.setMaxCodeLen((int) '\u0a01');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff\000#i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "22) test2777(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000\ufffd\ufffd\000\000#\000i\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000\ufffd\ufffd\000\000#\000i\000");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000i\000!\000a", true);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6869\u2169\u6934\u6869\u2161", "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\376\377\000h\000i\000!\000a");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6968\u6121", "ai", true);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        byte[] byteArray0 = null;
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newString(byteArray0, "hi!ahi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        java.lang.String str8 = doubleMetaphone0.encode("\u6800\u6900\u2100\ufffd\u4800");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f23\u3f21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??hi?: java.io.UnsupportedEncodingException: ??hi?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\0004" + "'", str2, "\ufffd\ufffd\0004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\0004" + "'", str3, "\ufffd\ufffd\0004");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str16 = doubleMetaphone0.encode("\u3f3fhi!a");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f#hi!aT", "\ufeff");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\ufffd" + "'", str2, "\u6968\ufffd");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!#?\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 0, (byte) 63, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!\000#\000?\000\000" + "'", str2, "\376\377\000h\000i\000!\000#\000?\000\000");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u0164\u0a01\ufffd\u6869", (-1), (int) '\ufeff', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!\000hi!", 4, (int) '\ufffd', strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufffd");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("hi!a\000", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001d\n\001\n" + "'", str9, "\001d\n\001\n");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str3 = doubleMetaphoneResult2.getAlternate();
        doubleMetaphoneResult2.append('\000', '\ufeff');
        doubleMetaphoneResult2.append('\u0a01', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000hi!a" + "'", str15, "\000hi!a");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000hi!a" + "'", str16, "\000hi!a");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f23" + "'", str2, "\u3f3f\u3f23");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff\ufffd\u6800\u6900\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\u3f3f");
        boolean boolean12 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate('#');
        doubleMetaphoneResult4.append('\u0a01', '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000" + "'", str2, "\000\000\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendAlternate("\u6800\u6900\u2100");
        java.lang.String str10 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append("h\000i\000!\000a\000");
        doubleMetaphoneResult4.append('a', '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6800\u6900\u2100" + "'", str10, "\u6800\u6900\u2100");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff" + "'", str2, "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "23) test2798(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        char char8 = doubleMetaphone0.charAt("\ufdff\ufdff", (int) '\u6869');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("4\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3400\u0100\u6400\u0a00\u0100\u0a00" + "'", str2, "\u3400\u0100\u6400\u0a00\u0100\u0a00");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105 });
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6869\u2161", "hi!a", true);
        char char14 = doubleMetaphone0.charAt("\u613f\ufffd", (int) '\376');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str14 = doubleMetaphone0.encode("#\000\u3f3f\u6148");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\377');
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult16.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0164\u0a01\ufffd" + "'", str2, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001d\n\001\n" + "'", str3, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\001d\n\001\n" + "'", str4, "\001d\n\001\n");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff" + "'", str2, "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str3 = doubleMetaphoneResult2.getAlternate();
        doubleMetaphoneResult2.append('\000', '\ufeff');
        doubleMetaphoneResult2.append('\u0a01');
        doubleMetaphoneResult2.append('\ufffd');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("##ah");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        int int16 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffdd\001\001\n\ufffd\ufffd", "\ufffd\u4800\000", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\ufdffhi!a", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('h', 'h');
        doubleMetaphoneResult7.append("a ", "h\000i\000!\000");
        doubleMetaphoneResult7.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("#a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 97 });
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!a", "hi!a");
        doubleMetaphoneResult4.appendPrimary("i");
        doubleMetaphoneResult4.append("A");
        doubleMetaphoneResult4.append('\346');
        doubleMetaphoneResult4.appendPrimary("i i");
        java.lang.String str23 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("\346\241\251\342\205\241h\346\244\241\357\277\275");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4hi!aA\346" + "'", str23, "4hi!aA\346");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ue685\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(' ', 'i');
        doubleMetaphoneResult7.append("\001d\n\001\n");
        doubleMetaphoneResult7.append("\u3f3fi ", "\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff");
        doubleMetaphoneResult7.appendPrimary('\u6869');
        doubleMetaphoneResult7.append("\ufffd\u4800");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult2.appendPrimary('a');
        java.lang.String str5 = doubleMetaphoneResult2.getAlternate();
        doubleMetaphoneResult2.append('\ufeff', '\ufffd');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.appendAlternate("ai");
        doubleMetaphoneResult11.append("\u6148", "");
        doubleMetaphoneResult11.append("\346\205\210");
        doubleMetaphoneResult11.append("\000\000\377\375\000\000\377\375\000\000\377\375");
        doubleMetaphoneResult11.appendPrimary('\377');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("a ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 32 });
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6968\u6121", "\u6148", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u6869');
        java.lang.String str16 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000\346\000\205\000\210");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -26, (byte) 0, (byte) 0, (byte) 0, (byte) -123, (byte) 0, (byte) 0, (byte) 0, (byte) -120 });
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\377\375H\000", "\u3f3f\u4800");
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffdaH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f61\ufffd" + "'", str2, "\u3f3f\u3f61\ufffd");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ha" + "'", str2, "Ha");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4861" + "'", str3, "\u4861");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6148" + "'", str4, "\u6148");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4861" + "'", str5, "\u4861");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ha" + "'", str6, "Ha");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4861" + "'", str7, "\u4861");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u4800" + "'", str2, "\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufdffH" + "'", str3, "\ufffd\ufdffH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\377\375H\000" + "'", str4, "\376\377\377\375H\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufeff\ufffd\u4800" + "'", str5, "\ufeff\ufffd\u4800");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd4\001d\n\001\n\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("#\376\377\000h\000i\000\u2300");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "24) test2827(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) -30, (byte) -116, (byte) -128 });
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        java.lang.String str14 = doubleMetaphone0.encode("\ufffd\ufffd\0004");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        int int17 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000a\000H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000a\000H" + "'", str2, "\ufffd\ufffd\000a\000H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000a\000H" + "'", str3, "\ufffd\ufffd\000a\000H");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\277", "#\376\377\000h\000i\000\u2300");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #?y??h?i?!?: java.io.UnsupportedEncodingException: #?y??h?i?!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\u3f3fhi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -29, (byte) -68, (byte) -65, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue3bc\ubfe3\ubcbf\u6869\u2161" + "'", str2, "\ue3bc\ubfe3\ubcbf\u6869\u2161");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "25) test2832(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
// flaky "5) test2832(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????" + "'", str2, "????");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("##ah", "\000H\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?H?a: java.io.UnsupportedEncodingException: ?H?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000H" + "'", str2, "\ufffd\ufffd\000H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000H" + "'", str3, "\ufffd\ufffd\000H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufdffH" + "'", str4, "\ufdffH");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary("i");
        doubleMetaphoneResult4.appendAlternate("\uc3be\uc3bfhi!a");
        doubleMetaphoneResult4.append("\ufffd\ufffdaH", "hi!i");
        doubleMetaphoneResult4.appendAlternate("\000#");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdh\000i\000!\000a\000" + "'", str2, "\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdh\000i\000!\000a\000" + "'", str3, "\ufffd\ufffdh\000i\000!\000a\000");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean10 = doubleMetaphoneResult9.isComplete();
        doubleMetaphoneResult9.appendPrimary("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.appendPrimary('\000');
        doubleMetaphoneResult4.appendAlternate("T");
        doubleMetaphoneResult4.appendAlternate('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000?\000\001\000d\000\n\000\001\000\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????d??????: java.io.UnsupportedEncodingException: ?????d??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a" + "'", str2, "hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("aHa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3400");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72, (byte) 97 });
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u3f00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u3f3f?" + "'", str2, "\ufffd\u3f3f?");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufe00\uff00\uff00\ufd00\u6800\000\u6900\000\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000\000\000i\000\000\000!\000\000\000" + "'", str2, "\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000\000\000i\000\000\000!\000\000\000");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.appendPrimary("");
        java.lang.String str6 = doubleMetaphoneResult3.getAlternate();
        doubleMetaphoneResult3.appendPrimary("\001d\n\001\n");
        doubleMetaphoneResult3.append('\277', '\u010a');
        doubleMetaphoneResult3.appendAlternate('\u3f21');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000\346\000\205\000\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000?\000?\000?" + "'", str2, "??\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??\000?\000?\000?" + "'", str3, "??\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f???" + "'", str4, "\u3f3f???");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendAlternate("\u6800\u6900\u2100");
        doubleMetaphoneResult4.appendAlternate("\ufeff\346\205\210");
        doubleMetaphoneResult4.appendPrimary('\ufffd');
        java.lang.String str14 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "26) test2845(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\ufffd" + "'", str14, "\ufffd");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000i", "H");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\u4800\u6100", "", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (short) 1, (int) (short) 100, strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", 0, (int) ' ', strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!", (int) '\u6869', (int) 'a', strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f???", (int) '\277', 0, strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\377\375H\000", (int) (short) 100, (int) (byte) 0, strArray31);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\346');
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = doubleMetaphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.appendAlternate('4');
        doubleMetaphoneResult7.appendAlternate('\ufeff');
        doubleMetaphoneResult7.append("\376\377\000a\000H");
        doubleMetaphoneResult7.appendAlternate('\u6148');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("##a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 35, (byte) 0, (byte) 35, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##a" + "'", str2, "##a");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.appendPrimary('a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str3 = doubleMetaphoneResult2.getAlternate();
        doubleMetaphoneResult2.append('\000', '\ufeff');
        doubleMetaphoneResult2.append('\u0a01');
        doubleMetaphoneResult2.append('a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\0004\000\000\000i\0004aH\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 52, (byte) 97, (byte) 72, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("i ", false);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\377\375");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\346\205\210", "i#", true);
        java.lang.String str19 = doubleMetaphone0.encode("\u6148");
        java.lang.String str21 = doubleMetaphone0.encode("hi!a\000\u6148\000hi!a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult8.append('#');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uefbf\ubdef\ubfbdh\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!h\000i\000!\0004");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 52 });
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6968\u6121");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "27) test2860(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) -17, (byte) -65, (byte) -67, (byte) -28, (byte) -96, (byte) -128 });
// flaky "6) test2860(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2161\uefbf\ubde4\ua080" + "'", str2, "\u6869\u2161\uefbf\ubde4\ua080");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6148a");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "28) test2861(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 97, (byte) 72, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult16.append("\ufffd\u4800\000", "h\000i\000!\000\000\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\0004", "##");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##: java.io.UnsupportedEncodingException: ##");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphoneResult8.getPrimary();
        boolean boolean10 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.append("\303\276\303\277\000\303\246\000\302\205\000\302\210");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000\000\000i\000\000\000!\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("d\001\001\n\375\377");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -61, (byte) -67, (byte) -61, (byte) -65 });
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.append("h\000i\000!\000", "i ");
        doubleMetaphoneResult9.append("##ah");
        doubleMetaphoneResult9.appendAlternate('a');
        java.lang.String str18 = doubleMetaphoneResult9.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6800\000\u6900\000\u2100\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128, (byte) -26, (byte) -124, (byte) -128 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd" + "'", str2, "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000#\000i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 35, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u2300\u6900" + "'", str2, "\u3f3f\u2300\u6900");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u4841");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000\ufffd\000\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 65, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4841" + "'", str2, "\u4841");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("##a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 35, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##a" + "'", str2, "##a");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000\376\377\000h\000i\000!\000\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("a4 #");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 52, (byte) 32, (byte) 35 });
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\377\375h\000i\000!\000a\000", "\377\375h\000i\000!\000a\000");
        java.lang.String str16 = doubleMetaphone0.encode("\u2300\ufdff\ufdff\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6921\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "29) test2877(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 63, (byte) 63 });
// flaky "7) test2877(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f68\ufffd" + "'", str2, "\u3f68\ufffd");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\u48004i\001d\n\001\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??4i?d???: java.io.UnsupportedEncodingException: ??4i?d???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u4100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -28, (byte) -124, (byte) -128 });
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("", "\376\377\000h\000i\000!\000a");
        boolean boolean11 = doubleMetaphoneResult7.isComplete();
        java.lang.String str12 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("\ufdff\ufdff");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\346\000\205\000\210");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) -26, (byte) 0, (byte) 0, (byte) 0, (byte) -123, (byte) 0, (byte) 0, (byte) 0, (byte) -120, (byte) 0 });
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("#??\000h\000i\000!?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 63 });
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate("");
        java.lang.String str11 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary("i#");
        doubleMetaphoneResult4.appendPrimary('\u6148');
        java.lang.String str16 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendAlternate("\ufffd\ufffd\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!#?\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 35, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2123\u3f00" + "'", str2, "\u6869\u2123\u3f00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2123\u3f00" + "'", str3, "\u6869\u2123\u3f00");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufdff", "\u3400\u0100\u6400\u0a00\u0100\u0a00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?A???A??: java.io.UnsupportedEncodingException: ?A???A??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 72 });
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ai");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeff\u6869\u2161", "i");
        java.lang.String str21 = doubleMetaphone0.encode("\u3f23\u3f21");
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!A", "\u6869\u2161");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f3f\u3f3f\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        char char10 = doubleMetaphone0.charAt("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff", (int) '\ufeff');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f\u6800\u6900\u2100\u6100", "ia", false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!a" + "'", str5, "hi!a");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        doubleMetaphoneResult10.appendAlternate('4');
        doubleMetaphoneResult10.append('\u6869', '\u6148');
        boolean boolean16 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.appendAlternate('a');
        doubleMetaphoneResult10.appendAlternate("\0004\000\ufffd\000\ufffd\000a\000H");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000a\000" + "'", str2, "h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100\u6100" + "'", str3, "\u6800\u6900\u2100\u6100");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffdaH", "\ufffd\u6800\u6900\u2100\ufdff\u3400");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\0004");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 52 });
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeff4\000\u6148a", "4\376\377aH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4?y?aH: java.io.UnsupportedEncodingException: 4?y?aH");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("", "\376\377\000h\000i\000!\000a");
        boolean boolean11 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("AT");
        doubleMetaphoneResult7.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000\000h\000i\000!\000a\000 \000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??h?i?!?a? ?: java.io.UnsupportedEncodingException: ??h?i?!?a? ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\346\205\210" + "'", str2, "\ufeff\346\205\210");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) '\u6148');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("\u4800\u6100");
        doubleMetaphoneResult7.append('\u6148');
        doubleMetaphoneResult7.append("##ah\000\376\377\000h\000i\000!\000a", "\u6148\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!", "H");
        boolean boolean15 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append("i");
        java.lang.String str18 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4Hi" + "'", str18, "4Hi");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        java.lang.String str17 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendAlternate("\000A");
        doubleMetaphoneResult4.appendAlternate("\ufffd\ufffdd\001\001\n\ufffd\ufffd");
        doubleMetaphoneResult4.appendPrimary("#\376\377\000h\000i\000\u2300");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4\000i" + "'", str17, "4\000i");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("??\000H", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!ahi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append('T', '\000');
        doubleMetaphoneResult7.append('\ufeff');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("i");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\u6968\u6121", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult22.append('4', 'a');
        doubleMetaphoneResult22.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        boolean boolean23 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendPrimary('h');
        doubleMetaphoneResult4.append("#\000h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!\000a" + "'", str2, "\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000h\000i\000!\000a" + "'", str3, "\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100" + "'", str4, "\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\376\377\000h\000i\000!\000a" + "'", str5, "\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\376\377\000\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str6, "\376\377\000\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!ii4hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 105, (byte) 105, (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ii4hi!a" + "'", str2, "hi!ii4hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ii4hi!a" + "'", str3, "hi!ii4hi!a");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000#\000h\000i\000!\000a\000T", "\ufe00\uff00\u6100\u4800");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aH" + "'", str2, "aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148" + "'", str3, "\u6148");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148" + "'", str3, "\u6148");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aH" + "'", str4, "aH");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!ah\000i\000!\000\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "30) test2916(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 52, (byte) 63, (byte) 63, (byte) 63 });
// flaky "8) test2916(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2161\u6800\u6900\u2100\u343f\u3f3f" + "'", str2, "\u6869\u2161\u6800\u6900\u2100\u343f\u3f3f");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000\ufffd\ufffd\000\000#\000i\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("#\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char16 = doubleMetaphone0.charAt("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\ufeff\000h\000i\000!\000a", false);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("hi!\000\ufffd\ufffd\000\u0164\u0a01\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str9 = doubleMetaphone0.encode("hi!a\000hi!a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray21);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\377\375", 35, (int) (byte) 10, strArray21);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6869\u2141", (int) '\ufeff', (int) (short) 100, strArray21);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000\000\000\000\000\000\000\000\000\000\000h\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000i\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000!\000\000\000", (int) '\u0a01', 26729, strArray21);
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
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!a", "hi!a");
        doubleMetaphoneResult4.appendPrimary("i");
        doubleMetaphoneResult4.append("A");
        doubleMetaphoneResult4.append('\346');
        doubleMetaphoneResult4.append("hi!#hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a", "hi!\000\000");
        doubleMetaphoneResult4.append("\u6148");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u4841");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4841" + "'", str2, "\u4841");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str7 = doubleMetaphone0.encode("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\u6148\000", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\ufffd\ufffd\000h\000i\000!", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\ufffd\u4800", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u4800');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "31) test2924(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff?");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "32) test2925(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) -17, (byte) -69, (byte) -65, (byte) 63 });
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3fH" + "'", str2, "\u3f3fH");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("d\001\001\n\375\377");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) -3, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.appendPrimary('a');
        boolean boolean15 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.appendAlternate('T');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("4\376\377aH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.append("h\000i\000!\000", "i ");
        doubleMetaphoneResult9.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) 35, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd#\000" + "'", str2, "\ufffd\ufffd#\000");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("h\000i\000!\000a\000", "hi!a", false);
        char char16 = doubleMetaphone0.charAt("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a", (int) (short) 100);
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbb\ubf23" + "'", str2, "\uefbb\ubf23");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("aH", (int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("\ufeff#");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148h\000i\000!\000a\000\u6869", "\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(26729);
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "33) test2936(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("", "\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.appendPrimary('\u6869');
        doubleMetaphoneResult7.append('\ufeff');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\277");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.append("\376\377\000h\000i\000!", "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        doubleMetaphoneResult4.appendAlternate('\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff?");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray9);
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff?", 52, (int) (byte) -1, strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("4\000\u6148a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!a\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!a?4: java.io.UnsupportedEncodingException: hi!a?4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "34) test2942(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 52, (byte) 97, (byte) 72, (byte) 0, (byte) 97 });
// flaky "9) test2942(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\0004\000\000\000i\0004aH\000a" + "'", str2, "\ufffd\ufffd\0004\000\000\000i\0004aH\000a");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult9.append("#");
        boolean boolean12 = doubleMetaphoneResult9.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendAlternate('\u6869');
        java.lang.String str8 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendAlternate('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str2, "\ufffd\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!\000a", "i", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult17.append("44ih\000i\000!\000a\000\u6800\u6900\u2100\u2300\u4861\000", "\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendAlternate('4');
        doubleMetaphoneResult9.appendAlternate("\ufeff#");
        doubleMetaphoneResult9.appendPrimary('h');
        doubleMetaphoneResult9.append("4#\377\375\u3f3f\ufffd", "\376\377\000h\000i\000!\000\ufeff");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.append("", "i#");
        java.lang.String str21 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000hi!a i#" + "'", str21, "\000hi!a i#");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000h\000i\000!\000ai\000aiT");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\377\375\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!\000\000");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\u6800\u6900\u2100");
        doubleMetaphoneResult4.append('\u6148');
        java.lang.String str14 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("\u3f3f\u3f00\u3f00\u3f00\u3f00\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "35) test2953(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u6800\u6900\u2100\u6148" + "'", str14, "\u6800\u6900\u2100\u6148");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000A", "\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff\000#i");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????: java.io.UnsupportedEncodingException: ??????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "");
        doubleMetaphoneResult7.appendPrimary("\000hi!a");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append("\000\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000", "\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6800\u6900\u2100\u6100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!\000" + "'", str2, "hi!\000");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\ufeff\000h\000i\000!\000a", false);
        java.lang.String str15 = doubleMetaphone0.encode("\376\377\000h\000i\000!\000a");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000", "\000hi!a", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2161" + "'", str2, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!a" + "'", str3, "hi!a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f??\000a\000H" + "'", str2, "\u3f3f??\000a\000H");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\uefbf\ubd00\uefbf\ubd00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendAlternate("\u6800\u6900\u2100");
        java.lang.String str10 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append("\u3f3f#hi!aT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6800\u6900\u2100" + "'", str10, "\u6800\u6900\u2100");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128, (byte) -26, (byte) -124, (byte) -128, (byte) 0, (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128, (byte) -26, (byte) -124, (byte) -128 });
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\u6800\u6900\u2100\u6100", "hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!i: java.io.UnsupportedEncodingException: hi!i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("\ufeff\ufffd\u4800", "h\000i\000!\000");
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ue6a1\ua9e2\u85a1");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -18, (byte) -102, (byte) -95, (byte) -22, (byte) -89, (byte) -94, (byte) -24, (byte) -106, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffda", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str4 = doubleMetaphoneResult3.getAlternate();
        boolean boolean5 = doubleMetaphoneResult3.isComplete();
        doubleMetaphoneResult3.append("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        java.lang.String str8 = doubleMetaphoneResult3.getAlternate();
        java.lang.String str9 = doubleMetaphoneResult3.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("h\000i\000!\000", "\376\377\000h\000i\000!\000a", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\u233f\u3f00\u6800\u6900\u213f", "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u6100\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!", "H");
        doubleMetaphoneResult4.append('\ufeff', 'a');
        doubleMetaphoneResult4.appendPrimary('T');
        java.lang.String str20 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "36) test2973(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!\000\ufeffT" + "'", str20, "hi!\000\ufeffT");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "??" + "'", str4, "??");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u3f3f" + "'", str5, "\u3f3f");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff?", "\u3f3f\u3f61\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!\000hi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("??\000?\000?\000?");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000?\000?\000\000\000?\000\000\000?\000\000\000?" + "'", str2, "\376\377\000?\000?\000\000\000?\000\000\000?\000\000\000?");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\375h\000i\000!\000a\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u013f\u0a64\u0a01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\375h\000i\000!\000a\000" + "'", str2, "\377\375h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ubfc3\ubdc3hi!a" + "'", str3, "\ubfc3\ubdc3hi!a");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        char char6 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\u4861");
        char char11 = doubleMetaphone0.charAt("\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000\000\000i\000\000\000!\000\000\000", 10);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufffd");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000i\000!\000a", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone16.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone16.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str21 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.append('a', '4');
        doubleMetaphoneResult20.appendPrimary("H");
        doubleMetaphoneResult20.append('a', '\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.append("\376\377\000h\000i\000!", "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        doubleMetaphoneResult4.append('\u6869');
        doubleMetaphoneResult4.appendAlternate('a');
        java.lang.String str17 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('\u6148');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "37) test2983(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#\376\377\000h\000i\000\u6869" + "'", str17, "#\376\377\000h\000i\000\u6869");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4861" + "'", str2, "\u4861");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("aHi", (int) '\000', (int) '\ufffd', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000h\000i\000!\000a\000", (int) '\u6148', (int) '\376', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (int) '\346', (int) '#', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(' ', 'i');
        doubleMetaphoneResult7.append('\000');
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendAlternate("\ufeff\u3f3f\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a \000" + "'", str16, "a \000");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("hi!a");
        int int7 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000H\000a", "\377\376h\000i\000!\000", true);
        char char14 = doubleMetaphone0.charAt("44ih\000i\000!\000a\000", (int) '#');
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H", false);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd\000", "\u3f3fi #", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult14.append('\346', ' ');
        java.lang.String str18 = doubleMetaphoneResult14.getPrimary();
        doubleMetaphoneResult14.appendAlternate("\277\357\346\275\200\240\244\346\342\200\200\204\204\346\377\375");
        doubleMetaphoneResult14.append('\u6148', 'i');
        doubleMetaphoneResult14.append("", "\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000\000\000i\000\000\000!\000\000\000");
        java.lang.String str27 = doubleMetaphoneResult14.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str10 = doubleMetaphone0.encode("");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\u6968\u6121", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeff\000h\000i\000!\000a", "\000\ufffd\000\ufffd\000\ufffd", true);
        char char21 = doubleMetaphone0.charAt("\ufffd\ufffd\ufffd\ufffd\000h\000i\000!\000a", (int) 'i');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000" + "'", str2, "\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000" + "'", str3, "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uefbf\ubdef\ubfbdh\000i\000!\000" + "'", str4, "\uefbf\ubdef\ubfbdh\000i\000!\000");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("i??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        char char12 = doubleMetaphone0.charAt("\u6148\000", 10);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd\000", "\u6869");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char19 = doubleMetaphone16.charAt("hi!", (int) (short) 1);
        java.lang.String str22 = doubleMetaphone16.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone16.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str27 = doubleMetaphone16.doubleMetaphone("", false);
        doubleMetaphone16.setMaxCodeLen((int) (short) 10);
        java.lang.String str31 = doubleMetaphone16.doubleMetaphone("");
        int int32 = doubleMetaphone16.getMaxCodeLen();
        java.lang.String str35 = doubleMetaphone16.doubleMetaphone("\u6869", true);
        java.lang.String str38 = doubleMetaphone16.doubleMetaphone("\u3400", true);
        java.lang.String str40 = doubleMetaphone16.encode("\ufdff\ufdff");
        java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) str40);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
// flaky "38) test2995(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'i' + "'", char19 == 'i');
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
// flaky "10) test2995(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "A" + "'", str35, "A");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("i\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "39) test2997(org.apache.commons.codec.language.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 97, (byte) 0, (byte) 97, (byte) 0, (byte) 32, (byte) -2, (byte) -1 });
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aH" + "'", str3, "aH");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u0164\u0a01\ufffd\u6869");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -3, (byte) -1, (byte) 105, (byte) 104 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6401\u010a\ufdff\u6968" + "'", str2, "\u6401\u010a\ufdff\u6968");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufffd");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\376\377\000h\000i\000!\000a");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\u0164\u0a01\ufffd\000");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\u4861", "\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}
