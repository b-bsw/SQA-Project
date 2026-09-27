package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) '\ufffd', (int) (short) 100, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\uff64\u0a0a\u01ff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!" + "'", str4, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000h\000i\000!" + "'", str6, "\000h\000i\000!");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6968!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?!: java.io.UnsupportedEncodingException: ?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.appendAlternate('#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ha" + "'", str2, "Ha");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray15);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) (byte) -1, 10, strArray15);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\000h\000i\000!", 0, 10, strArray15);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!A", 100, (int) 'a', strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray12);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\377\375\377\375", (int) '4', (int) (short) 1, strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\u2141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "h\000i\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: h?i?!?: java.io.UnsupportedEncodingException: h?i?!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -30, (byte) -123, (byte) -127 });
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6800\u6900\u2100\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(' ', 'i');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a " + "'", str14, "a ");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufeffhi!", (int) '\u6869', (int) '\u6869', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd", false);
        char char9 = doubleMetaphone0.charAt("\ufeffhi!", (int) '\ufeff');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!: java.io.UnsupportedEncodingException: hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000hi!a ", "ai");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ai: java.io.UnsupportedEncodingException: ai");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 35 });
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\377\375\377\375", (int) '\000', 10, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!", "H");
        boolean boolean15 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate('i');
        boolean boolean18 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!\000a", "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("4\000i", "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("ai");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ai" + "'", str2, "ai");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ai" + "'", str3, "ai");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "???");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u4800" + "'", str2, "\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000H" + "'", str3, "\376\377\000H");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        char char18 = doubleMetaphone0.charAt("T", (int) 'h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\346');
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6869", "hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!a?hi!#???d????h?i?!?a: java.io.UnsupportedEncodingException: hi!a?hi!#???d????h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000", true);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("h\000i\000!\000a\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd", "\ufffd\ufffd\000\001\000d\000\n\000\001\000\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd", "\ufffd\ufffd\000h\000i\000!\000a", false);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        byte[] byteArray21 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("##ah");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) byteArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 35, (byte) 35, (byte) 97, (byte) 104 });
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult5.append('\346');
        doubleMetaphoneResult5.append("???", "4");
        boolean boolean11 = doubleMetaphoneResult5.isComplete();
        doubleMetaphoneResult5.append("\ufeff\001d\n\001\n");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(" ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 32 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uc3be\uc3bfhi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\377\376h\000i\000!\000", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("\376\377\000a\000H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone5.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone5.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        java.lang.String str11 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.append("\346\205\210");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\346\205\210");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000hi!a i", "\u6869");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ai?: java.io.UnsupportedEncodingException: ai?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("AT");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 65, (byte) 0, (byte) 84 });
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test0545(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0, (byte) 105, (byte) 0, (byte) 105, (byte) 104 });
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) '\u6148');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult9.appendPrimary('\u6148');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        doubleMetaphoneResult9.appendAlternate("\ufffd\ufdffH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\346\205\210");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120, (byte) 0 });
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!a", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "4H\000", false);
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\346\205\210" + "'", str2, "\ufeff\346\205\210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str4, "\376\377\000\346\000\205\000\210");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u4861");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6401\u010a\ufdff\000", "\u6869");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ai?: java.io.UnsupportedEncodingException: ai?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        char char14 = doubleMetaphone0.charAt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!?: java.io.UnsupportedEncodingException: hi!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "2) test0557(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 105, (byte) -26, (byte) -95, (byte) -87 });
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6869\u2161");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        java.lang.Class<?> wildcardClass14 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubbef\u23bf" + "'", str2, "\ubbef\u23bf");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff#" + "'", str3, "\ufeff#");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("A");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000A" + "'", str2, "\000A");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\376\377\000h\000i\000!\000a", "\377\375\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: y?y?y?y?: java.io.UnsupportedEncodingException: y?y?y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\u6148", false);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????a???H: java.io.UnsupportedEncodingException: ?????????a???H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append(' ', 'i');
        doubleMetaphoneResult7.append("\u6800\u6900\u2100", "aH");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "iiaH" + "'", str16, "iiaH");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\377\375h\000i\000!\000" + "'", str2, "\376\377\377\375h\000i\000!\000");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd", "\ufffd\ufffd\000h\000i\000!\000a", false);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = doubleMetaphone0.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.appendPrimary(' ');
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        java.lang.Class<?> wildcardClass15 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("#i", "##a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##a: java.io.UnsupportedEncodingException: ##a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\u6800\u6900\u2100\u6100", "\ufeffhi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray21);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\377\375", 35, (int) (byte) 10, strArray21);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000a\000H", 0, 10, strArray21);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("aHi", (int) (byte) -1, (int) '4', strArray21);
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult12.appendPrimary("\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        char char6 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\u4861");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str11 = doubleMetaphone0.encode("\u6148h\000i\000!\000a\000\u6869");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky "3) test0573(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AH" + "'", str11, "AH");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100" + "'", str2, "\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("i i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 32, (byte) 105 });
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("\000\376\377\000h\000i\000!\000a");
        java.lang.String str17 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("??h\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u6800\u6900\u2100\u6100", "\ufffd\ufffda");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #??a: java.io.UnsupportedEncodingException: #??a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult20.appendPrimary("#ia");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\377\375h\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000#" + "'", str2, "\000#");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("i\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0 });
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str2, "\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str3, "\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult14.append("\000#", "\ufffd\ufffdh\000i\000!\000a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\u6800\u6900\u2100\u6100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "#\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #?: java.io.UnsupportedEncodingException: #?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "hi!a\000hi!a", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000a\000H" + "'", str2, "\376\377\000a\000H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeffaH" + "'", str3, "\ufeffaH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\u6100\u4800" + "'", str4, "\ufffd\u6100\u4800");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\000a\000H" + "'", str5, "\ufffd\ufffd\000a\000H");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("h\000i\000!\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a", "hi!a\000\u0164\u0a01\ufffd", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.encode("\000\376\377\000h\000i\000!\000a");
        char char8 = doubleMetaphone0.charAt("i i", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'i' + "'", char8 == 'i');
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(" ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000 " + "'", str2, "\000 ");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6800\u6900\u2100\u6100", (int) (short) 100, (int) (byte) 100, strArray22);
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!\000a" + "'", str2, "\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000h\000i\000!\000a" + "'", str3, "\ufffd\ufffd\000h\000i\000!\000a");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???H: java.io.UnsupportedEncodingException: ???H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #: java.io.UnsupportedEncodingException: #");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\ufffd\u4800");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 72 });
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!A", "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000H\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 72, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\u6800\000\u6900\000\u2100\000\u6100" + "'", str2, "\000\u6800\000\u6900\000\u2100\000\u6100");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult4.appendPrimary("aHi");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("i i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 32, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6900\u2000\u6900" + "'", str2, "\ufffd\u6900\u2000\u6900");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("A", "\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "4) test0609(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 35, (byte) 63, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("iiaH", "\376\377\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??h?i?!?a: java.io.UnsupportedEncodingException: ?y??h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeff\u3f3f\ufffd", "hi!a4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!a4: java.io.UnsupportedEncodingException: hi!a4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??h?i?!: java.io.UnsupportedEncodingException: ?y??h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) "#");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("hi!a\000hi!a", true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray15);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) '4', (int) '4', strArray15);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) (byte) 0, (int) ' ', strArray15);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("??\000?\000?\000?", 1, 4, strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        doubleMetaphoneResult23.append("ai");
        doubleMetaphoneResult23.appendAlternate("##a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(" ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 32 });
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("i ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i " + "'", str2, "i ");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray5);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        java.lang.String str12 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newString(byteArray5, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????h???i???!???a: java.io.UnsupportedEncodingException: ?????h???i???!???a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6401\u010a\ufffd" + "'", str9, "\u6401\u010a\ufffd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001d\n\001\n" + "'", str10, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6401\u010a\ufffd" + "'", str11, "\u6401\u010a\ufffd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u0164\u0a01\ufffd" + "'", str12, "\u0164\u0a01\ufffd");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("i");
        byte[] byteArray9 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!");
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray9);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray9);
        java.lang.String str12 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) byteArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\376\377\000h\000i\000!" + "'", str10, "\376\377\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufeffhi!" + "'", str11, "\ufeffhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str12, "\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000hi!a ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 32 });
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f" + "'", str4, "\u3f3f");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u4800\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "#hi!aT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #hi!aT: java.io.UnsupportedEncodingException: #hi!aT");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'h', 32, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        java.lang.String str14 = doubleMetaphone0.encode("\ufffd\ufffd\0004");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u0164\u0a01\ufffd\u6869");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate("#");
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("#");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #A?: java.io.UnsupportedEncodingException: #A?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!" + "'", str2, "\376\377\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000\000\000i\000\000\000!\000\000" + "'", str4, "\000h\000\000\000i\000\000\000!\000\000");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        java.lang.Class<?> wildcardClass22 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.Class<?> wildcardClass9 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) (short) 1, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3fhi!a", (int) 'h', 35, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("\ufffd\ufffd\000H");
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append("\u0164\u0a01\ufffd");
        doubleMetaphoneResult4.append('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "##4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##4: java.io.UnsupportedEncodingException: ##4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ha" + "'", str3, "Ha");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('a', '4');
        doubleMetaphoneResult4.appendPrimary("H");
        doubleMetaphoneResult4.append('a', '\000');
        doubleMetaphoneResult4.appendAlternate("\u6800\u6900\u2100");
        java.lang.String str16 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "aHa" + "'", str16, "aHa");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "5) test0636(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 35, (byte) 63, (byte) 0 });
// flaky "1) test0636(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#?\000" + "'", str2, "hi!#?\000");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "iiaH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: iiaH: java.io.UnsupportedEncodingException: iiaH");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "");
        doubleMetaphoneResult7.append("A");
        doubleMetaphoneResult7.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????a???H: java.io.UnsupportedEncodingException: ?????????a???H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000" + "'", str2, "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff" + "'", str2, "\ufdff");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "6) test0641(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 63, (byte) 63 });
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\377\375" + "'", str4, "\377\375");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("i", (int) ' ', (int) '\u6148', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (byte) 0, 1, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6869", 100, (int) '\000', strArray25);
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #A?: java.io.UnsupportedEncodingException: #A?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\u6800\u6900\u2100");
        doubleMetaphoneResult4.append('\u6148');
        doubleMetaphoneResult4.appendPrimary('\346');
        doubleMetaphoneResult4.append("\u6148\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.appendPrimary('\000');
        doubleMetaphoneResult4.appendAlternate("T");
        java.lang.String str14 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('a', '\376');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#hi!aT" + "'", str14, "#hi!aT");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\uefbb\ubf61\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6968\u6121");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -26, (byte) -124, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue6a5\ua8e6\u84a1" + "'", str2, "\ue6a5\ua8e6\u84a1");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????: java.io.UnsupportedEncodingException: ????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("#\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0 });
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult9.appendPrimary("\ufffd\ufffd\000h\000i\000!\000a");
        doubleMetaphoneResult9.appendAlternate('\ufeff');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6148", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message:  : java.io.UnsupportedEncodingException:  ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = doubleMetaphone0.encode("hi!a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeffaH", "\u3f3f\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("HT", "#ia");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #ia: java.io.UnsupportedEncodingException: #ia");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97 });
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char9 = doubleMetaphone0.charAt("\ufeff\u6869\u2161", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("#\376\377\000h\000i\000\u6869");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "7) test0659(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 63 });
// flaky "2) test0659(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#??\000h\000i\000!?" + "'", str2, "#??\000h\000i\000!?");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("#ia");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 105, (byte) 97 });
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u4800\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u4861");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "??\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???H: java.io.UnsupportedEncodingException: ???H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6869");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "8) test0663(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 97, (byte) 0, (byte) 105, (byte) 104, (byte) 105 });
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!", "\000h\000i\000!\000a", false);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\346\205\210", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.String str9 = doubleMetaphone0.encode("hi!a");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000\000\000i\000\000\000!\000\000", "\ufffd\ufffd");
        char char15 = doubleMetaphone0.charAt("\376\377\000h\000i\000!\000a", (int) '\000');
        char char18 = doubleMetaphone0.charAt("4\000\u6148a", (int) '\000');
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\376' + "'", char15 == '\376');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '4' + "'", char18 == '4');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 0, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) (byte) 100, (int) (byte) 0, strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) (short) 10, 32, strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 65, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4841" + "'", str2, "\u4841");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        doubleMetaphoneResult16.append("hi!\000\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("iiaH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 105, (byte) 0, (byte) 97, (byte) 0, (byte) 72 });
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6800\u6900\u2100" + "'", str4, "\u6800\u6900\u2100");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        doubleMetaphoneResult4.appendAlternate('\u6148');
        doubleMetaphoneResult4.appendAlternate('\376');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        boolean boolean17 = doubleMetaphoneResult4.isComplete();
        java.lang.String str18 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4\000i" + "'", str18, "4\000i");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000\346\000\205\000\210");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -26, (byte) 0, (byte) 0, (byte) 0, (byte) -123, (byte) 0, (byte) 0, (byte) 0, (byte) -120 });
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ha" + "'", str2, "Ha");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ha" + "'", str3, "Ha");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "??" + "'", str4, "??");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) -1, (byte) -3 });
// flaky "9) test0679(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (int) (byte) 10, (int) (byte) 10, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\000h\000i\000!", (int) 'i', (int) '\u6869', strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("#ia", (int) '\u6148', 32, strArray22);
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
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!A");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2141" + "'", str2, "\u6869\u2141");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!A" + "'", str3, "hi!A");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!A" + "'", str4, "hi!A");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str2, "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000H\000a", "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????h???i???!???a: java.io.UnsupportedEncodingException: ?????h???i???!???a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("a", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        doubleMetaphoneResult4.appendAlternate('\u6148');
        doubleMetaphoneResult4.append('4', 'a');
        java.lang.String str26 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "10) test0686(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4\000\u6148a" + "'", str26, "4\000\u6148a");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult14.append('\346', ' ');
        doubleMetaphoneResult14.appendPrimary('\ufeff');
        java.lang.String str20 = doubleMetaphoneResult14.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("ai");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "##ah");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##ah: java.io.UnsupportedEncodingException: ##ah");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ai" + "'", str2, "ai");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#??\000h\000i\000!?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 63 });
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a\000\u6148\000hi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 0, (byte) -26, (byte) -123, (byte) -120, (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        byte[] byteArray0 = null;
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newString(byteArray0, "\ufeff\001d\n\001\n");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H", false);
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "\u6148", true);
        doubleMetaphone0.setMaxCodeLen(4);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("Ha", true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "11) test0692(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("??\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "");
        doubleMetaphoneResult7.appendPrimary("\000hi!a");
        doubleMetaphoneResult7.append('#', '#');
        doubleMetaphoneResult7.appendPrimary('\u6148');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) 0, (byte) 35 });
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray34);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray34);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray34);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray34);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (short) 1, (int) (short) 100, strArray34);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", 0, (int) ' ', strArray34);
        boolean boolean41 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!", (int) '\u6869', (int) 'a', strArray34);
        boolean boolean42 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6800\u6900\u2100\u6100", (int) '#', 100, strArray34);
        boolean boolean43 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", 0, 0, strArray34);
        boolean boolean44 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\u010a', (int) '\346', strArray34);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128, (byte) -26, (byte) -124, (byte) -1, (byte) -3 });
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\u4800", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!: java.io.UnsupportedEncodingException: hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str3, "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        java.lang.String str8 = doubleMetaphoneResult4.getPrimary();
        java.lang.Class<?> wildcardClass9 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary('\ufeff');
        doubleMetaphoneResult7.append('\u6148');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35 });
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffda");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "12) test0707(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 35, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 97 });
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aH" + "'", str2, "aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aH" + "'", str3, "aH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4861" + "'", str4, "\u4861");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendAlternate("\u6800\u6900\u2100");
        doubleMetaphoneResult4.appendPrimary('i');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -123, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\346\205\210" + "'", str3, "\346\205\210");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000h\000i\000!", (int) (byte) 100, 0, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("a ", 97, (int) '\u6869', strArray22);
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult10.appendAlternate("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\uc3be\uc3bf\303\ua600\uc285\302\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????A?????A??: java.io.UnsupportedEncodingException: ??????A?????A??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str2, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("H");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 72 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("aiT");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ? : java.io.UnsupportedEncodingException: ? ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 105, (byte) 0, (byte) 84 });
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000" + "'", str2, "\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult9.appendPrimary("\ufffd\ufffd\000h\000i\000!\000a");
        boolean boolean12 = doubleMetaphoneResult9.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -65, (byte) -17, (byte) -26, (byte) -67, (byte) -128, (byte) -96, (byte) -92, (byte) -26, (byte) -30, (byte) -128, (byte) -128, (byte) -124, (byte) -124, (byte) -26, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd" + "'", str2, "\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "##4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ##4: java.io.UnsupportedEncodingException: ##4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6968\u6121", "\u6148", false);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("4hi!a", false);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("iha!");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\u6148\000", "hi!ah\000i\000!\000\000\000\376\377\000h\000i\000!\000a", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AH" + "'", str18, "AH");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate("#");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("\ufffd\ufffdh\000i\000!\000a\000", "\000hi!a ");
        doubleMetaphoneResult7.appendPrimary("\uc3be\uc3bf\303\ua600\uc285\302\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "i#" + "'", str15, "i#");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100\u6100" + "'", str2, "\u6800\u6900\u2100\u6100");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\ufffd\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6401\u010a\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd", "\376\377\000a\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??a?H: java.io.UnsupportedEncodingException: ?y??a?H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??H: java.io.UnsupportedEncodingException: ?y??H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('h', 'h');
        doubleMetaphoneResult7.appendAlternate("\000H\000a");
        doubleMetaphoneResult7.appendAlternate("i");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u4800\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str2, "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("", "\376\377\000h\000i\000!\000a");
        boolean boolean11 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\375h\000i\000!\000a\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray15);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray15);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\303\276\303\277\000h\000i\000!\000a", 35, (int) '\ufffd', strArray15);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ubfc3\ubdc3hi!a", 32, 1, strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ubfc3\ubdc3hi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.encode("\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\ufffd\u4800");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\u4841");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3fi ");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "13) test0744(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 32, (byte) -29, (byte) -68, (byte) -65, (byte) 105, (byte) 32 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufdffH", "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????: java.io.UnsupportedEncodingException: ??????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6148\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!#??: java.io.UnsupportedEncodingException: hi!#??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "14) test0747(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 0, (byte) 72, (byte) 97, (byte) 0, (byte) 0 });
// flaky "3) test0747(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000#\000Ha\000\000" + "'", str2, "h\000i\000!\000#\000Ha\000\000");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("i", (int) ' ', (int) '\u6148', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (byte) 0, 1, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("i#", (int) (short) 0, (int) (byte) 0, strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.appendAlternate("ai");
        doubleMetaphoneResult11.append("", "\u3f3fhi!a");
        doubleMetaphoneResult11.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\ufffd", "\000\000h\000i\000!\000a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??h?i?!?a?: java.io.UnsupportedEncodingException: ??h?i?!?a?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("#i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 35, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u2300\u6900" + "'", str2, "\ufffd\u2300\u6900");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone14.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult16.append("i");
        doubleMetaphoneResult16.append("a", "Ha");
        doubleMetaphoneResult16.appendPrimary('i');
        boolean boolean24 = doubleMetaphoneResult16.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult9.append('\346', '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("#\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#\000" + "'", str2, "#\000");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uc3be\uc3bfhi!a", "hi!A");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!A: java.io.UnsupportedEncodingException: hi!A");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\uc3be\uc3bfhi!a", "\376\377\000\346\000\205\000\210", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphone0.encode("\ufffd\u4800");
        char char12 = doubleMetaphone0.charAt("4hi!a", (int) '\u6869');
        java.lang.String str14 = doubleMetaphone0.encode("\ufffd\u6800\u6900\u2100");
        doubleMetaphone0.setMaxCodeLen((int) '\u010a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult4.append("A", "\ufeffhi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendPrimary("");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!\000\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0, (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("#i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 35, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff#i" + "'", str2, "\ufeff#i");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        java.lang.String str9 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str10 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("h\000i\000!\000a\000");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\000 ");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000h\000i\000!", (int) 'a', (int) '#', strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\u6800\u6900\u2100\u6100", 100, 0, strArray22);
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        java.lang.String str12 = doubleMetaphone0.encode("\ufffd\ufffd\ufffd\ufffd");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?" + "'", str3, "?");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H", "\ufffdh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?h: java.io.UnsupportedEncodingException: ?h");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128, (byte) -26, (byte) -124, (byte) -128 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd" + "'", str2, "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd" + "'", str3, "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.appendAlternate('\000');
        java.lang.Class<?> wildcardClass5 = doubleMetaphoneResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a\000\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "15) test0772(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 97, (byte) 72, (byte) 0, (byte) 0 });
// flaky "4) test0772(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000" + "'", str2, "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
// flaky "1) test0772(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000" + "'", str3, "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000hi!a i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 32, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000hi!a i" + "'", str2, "\000hi!a i");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("4hi!a", true);
        java.lang.String str12 = doubleMetaphone0.encode("\ufffd\u6100\u4800");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ha" + "'", str2, "Ha");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4861" + "'", str3, "\u4861");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6148" + "'", str4, "\u6148");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4861" + "'", str5, "\u4861");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4861" + "'", str6, "\u4861");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen(35);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("AH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 65, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 0, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff", (int) (byte) 10, (int) (byte) 1, strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6401\u010a\ufffd", (int) 'i', (int) (byte) 1, strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65 });
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000h\000i\000!", (int) (byte) 100, 0, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", 0, (int) 'i', strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3468\u6921\ufffd", (int) (short) 0, (int) '\346', strArray25);
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("??", (int) '\000', 0, strArray12);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 32, (int) (byte) 1, strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?" + "'", str2, "?");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str2, "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str3, "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufdff", "\000hi!a ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?hi!a : java.io.UnsupportedEncodingException: ?hi!a ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\377\375", "", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        boolean boolean19 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult14.appendAlternate('\u6869');
        doubleMetaphoneResult14.appendPrimary('\346');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.appendPrimary("");
        doubleMetaphoneResult3.append("aa\377\375\u6148", "iiaH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        char char7 = doubleMetaphone0.charAt("\u0164\u0a01\ufffd", (int) (short) -1);
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("4H\000", false);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000\001\000d\000\n\000\001\000\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\000\u0100\000\u6400\000\u0a00\000\u0100\000\u0a00" + "'", str2, "\ufdff\ufdff\000\u0100\000\u6400\000\u0a00\000\u0100\000\u0a00");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6921\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "16) test0794(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("#??\000h\000i\000!?", "\u3f3f\u3f3f", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6800\u6900\u2100\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128, (byte) 0 });
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!\000a", "i", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\ufffd\u4800", false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "17) test0797(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('\u6869', '#');
        doubleMetaphoneResult4.appendAlternate('\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), 4, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u4800", (int) (short) 100, (int) (byte) 1, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6869\u2161\u6921\ufffd", (int) (byte) 0, (int) (byte) 100, strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd", false);
        char char13 = doubleMetaphone0.charAt("\000\376\377\000h\000i\000!\000a", (int) (byte) -1);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????H: java.io.UnsupportedEncodingException: ?????H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!" + "'", str2, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6968!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 33 });
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str3, "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str4, "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("???\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0 });
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000a\000H" + "'", str2, "\376\377\000a\000H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeffaH" + "'", str3, "\ufeffaH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\u6100\u4800" + "'", str4, "\ufffd\u6100\u4800");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\u6100\u4800" + "'", str5, "\ufffd\u6100\u4800");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\000a\000H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 97, (byte) 0, (byte) 72 });
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append(' ', 'i');
        java.lang.Class<?> wildcardClass13 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000hi!a ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?hi!a : java.io.UnsupportedEncodingException: ?hi!a ");
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6800\u6900\u2100\u2300\u4861\000", "4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4: java.io.UnsupportedEncodingException: 4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.append('\ufeff', '#');
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\000#\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!hi", "\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000h\000\000\000i\000\000\000!\000\000", "\u0164\u0a01\ufffd\u6869");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: T????: java.io.UnsupportedEncodingException: T????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffda");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "18) test0812(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 97 });
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3fhi!a" + "'", str2, "\u3f3f\u3f3fhi!a");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000#", "\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #A?: java.io.UnsupportedEncodingException: #A?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        java.lang.String str12 = doubleMetaphone0.encode("\u6869\u2161");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("\u4800\u6100");
        doubleMetaphoneResult7.append('\u6148');
        doubleMetaphoneResult7.append('\u6869');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char11 = doubleMetaphone8.charAt("hi!", (int) (short) 1);
        java.lang.String str14 = doubleMetaphone8.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone8.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str19 = doubleMetaphone8.doubleMetaphone("", false);
        doubleMetaphone8.setMaxCodeLen((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'i' + "'", char11 == 'i');
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffdh\000i\000!\000a\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??h\000i\000!\000a\000" + "'", str2, "??h\000i\000!\000a\000");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????: java.io.UnsupportedEncodingException: ??????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str2, "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000a\000H");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!a");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass11 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uc3be\uc3bf\303\ua600\uc285\302\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -66, (byte) -61, (byte) -65, (byte) -61, (byte) -61, (byte) 0, (byte) 0, (byte) -90, (byte) -123, (byte) -62, (byte) -62, (byte) 0, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff" + "'", str2, "\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.appendAlternate("ai");
        doubleMetaphoneResult11.append("\u6148", "");
        doubleMetaphoneResult11.appendPrimary("\u0164\u0a01\ufdff");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000\303\276\303\277\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?A??A???h?i?!?a: java.io.UnsupportedEncodingException: ?A??A???h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\ufffd", "\000h\000i\000!\000a");
        java.lang.String str13 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "19) test0827(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "#\000");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000H", "\ufffd\ufffdh\000i\000!\000a\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        doubleMetaphoneResult23.append("a ", "hi!a\000\u6148\000hi!a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000h\000i\000!\000a\000" + "'", str2, "\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000h\000i\000!\000a\000" + "'", str3, "\000\000h\000i\000!\000a\000");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000i\000!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u0164\u0a01\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: T???: java.io.UnsupportedEncodingException: T???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.appendPrimary('\346');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff#i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?#i: java.io.UnsupportedEncodingException: ?#i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!\000" + "'", str2, "hi!\000");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\u6148", false);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufeff\001d\n\001\n");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\377\375h\000i\000!\000", "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a", true);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\ufffd\ufdffH");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "T" + "'", str11, "T");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "20) test0833(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffdH\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffdH\000");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ubbef\u23bf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -69, (byte) -17, (byte) 35, (byte) -65 });
// flaky "21) test0836(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\ufeff\346\205\210");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeffhi!");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "22) test0838(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("i#", "\ufffd\u2300\u6900");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\u6100\u4800");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("aHi", "\u3f3f\u6800\u6900\u2100\u6100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 72, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000H\000a" + "'", str2, "\000H\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4800\u6100" + "'", str3, "\u4800\u6100");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        char char7 = doubleMetaphone0.charAt("\u0164\u0a01\ufffd", (int) (short) -1);
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("4H\000", false);
        char char15 = doubleMetaphone0.charAt("4\000\u6148a", (int) 'h');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377aH" + "'", str2, "\376\377aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377aH" + "'", str3, "\376\377aH");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.append('\ufeff');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult9.appendPrimary('a');
        doubleMetaphoneResult9.appendPrimary("\ufffd\u6800\u6900\u2100\u6100");
        doubleMetaphoneResult9.appendPrimary("??\000?\000?\000?");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray5);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6401\u010a\ufffd" + "'", str9, "\u6401\u010a\ufffd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001d\n\001\n" + "'", str10, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6401\u010a\ufffd" + "'", str11, "\u6401\u010a\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.append("\376\377\000h\000i\000!\000a");
        java.lang.String str15 = doubleMetaphoneResult11.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\376" + "'", str15, "\376");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd" + "'", str4, "\000\ufffd\000\ufffd\000\ufffd");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        byte[] byteArray9 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray9);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        java.lang.String str12 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray9);
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) str12);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\377\375h\000i\000!\000a\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ufeff\346\205\210");
        java.lang.String str16 = doubleMetaphone0.encode("\uff64\u0a0a\u01ff");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult8.append("", "hi!\000\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        doubleMetaphoneResult10.appendAlternate('4');
        doubleMetaphoneResult10.append('\u6869', '\u6148');
        java.lang.String str16 = doubleMetaphoneResult10.getAlternate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "23) test0856(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u6148" + "'", str16, "\u6148");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000hi!a", "\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 0, (byte) 72, (byte) 97, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(' ', 'i');
        doubleMetaphoneResult7.append("\001d\n\001\n");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("i", (int) ' ', (int) '\u6148', strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd", 0, (int) (byte) 100, strArray22);
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#\376\377\000h\000i\000\u6869");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "24) test0862(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 104, (byte) 105 });
// flaky "5) test0862(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000#\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!hi" + "'", str2, "\000#\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!hi");
// flaky "2) test0862(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2300\ufe00\uff00\000\u6800\000\u6900\000\u2100\u6968" + "'", str3, "\u2300\ufe00\uff00\000\u6800\000\u6900\000\u2100\u6968");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("AH");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("???");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("h\000i\000!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6401\u010a\ufdff\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?C???: java.io.UnsupportedEncodingException: ?C???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h\000i\000!\000" + "'", str5, "h\000i\000!\000");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.append("\376\377\000h\000i\000!\000a");
        boolean boolean15 = doubleMetaphoneResult11.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\377\376h\000i\000!\000", false);
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd", "\ufeff\ufffd\u4800");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("4hi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\u6148", false);
        java.lang.String str9 = doubleMetaphone0.encode("HT");
        char char12 = doubleMetaphone0.charAt("\u0164\u0a01\ufffd", 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "T" + "'", str9, "T");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\u0a01' + "'", char12 == '\u0a01');
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a", "\u6869\u2100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("44ih\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 52, (byte) 105, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("aa\377\375\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 97, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa???" + "'", str2, "aa???");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("\376\377\000a\000H");
        java.lang.Class<?> wildcardClass5 = doubleMetaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("i\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000a\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???a?H: java.io.UnsupportedEncodingException: ???a?H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult9.appendPrimary('a');
        doubleMetaphoneResult9.appendPrimary("\ufffd\u6800\u6900\u2100\u6100");
        doubleMetaphoneResult9.appendAlternate("\u6401\u010a\ufffd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("", "\376\377\000h\000i\000!\000a");
        boolean boolean11 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('#', ' ');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult4.append('i');
        java.lang.String str7 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendAlternate("\u0164\u0a01\ufffd\u6869");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i" + "'", str7, "i");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult9.append('\ufeff');
        doubleMetaphoneResult9.appendAlternate('a');
        doubleMetaphoneResult9.append('#', '\277');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f" + "'", str4, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u3f3f" + "'", str5, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u3f3f" + "'", str6, "\u3f3f");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (int) (byte) 10, (int) (byte) 10, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", 0, (int) (byte) 1, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???" + "'", str3, "???");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "???" + "'", str4, "???");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff\ufffd\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 72, (byte) 0 });
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\ufffd\u4800\000");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("4hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3468\u6921\ufffd" + "'", str2, "\u3468\u6921\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!a" + "'", str3, "4hi!a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4hi!a" + "'", str4, "4hi!a");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("4hi!a", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.lang.String str21 = doubleMetaphoneResult16.getAlternate();
        doubleMetaphoneResult16.append("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult14.append('\346', ' ');
        java.lang.String str18 = doubleMetaphoneResult14.getPrimary();
        java.lang.String str19 = doubleMetaphoneResult14.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "");
        doubleMetaphoneResult7.append("A");
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('i');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!A" + "'", str15, "hi!A");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\346\205\210" + "'", str3, "\346\205\210");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("a \000", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!: java.io.UnsupportedEncodingException: hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("\ufffd\ufffd\000H");
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendPrimary('4');
        doubleMetaphoneResult4.append("\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\001d\n\001\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??d???: java.io.UnsupportedEncodingException: ??d???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6148", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeffhi!" + "'", str2, "\ufeffhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str3, "\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str4, "\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeffaH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000\001\000d\000\n\000\001\000\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????d??????: java.io.UnsupportedEncodingException: ?????d??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffdaH" + "'", str2, "\ufffd\ufffd\ufffdaH");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.appendPrimary("hi!\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.appendPrimary('\000');
        doubleMetaphoneResult4.appendPrimary('#');
        doubleMetaphoneResult4.append('\ufeff');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000a\000H", "\ufffd\ufffd\ufffd\ufffd\000H");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "hi!a\000\u6148\000");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\u6869\u2161\u6921\ufffd");
        java.lang.String str17 = doubleMetaphone0.encode("\u6869");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "25) test0904(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("#hi!aT", "\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: aa?: java.io.UnsupportedEncodingException: aa?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("i");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\376\377\000h\000i\000!\000a", "\000\376\377\000h\000i\000!\000a", false);
        java.lang.String str23 = doubleMetaphone0.encode("\376\377\000h\000i\000!\000a");
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\u0164\u0a01\ufffd", "\u0164\u0a01\ufffd\000");
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd", "hi!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!?: java.io.UnsupportedEncodingException: hi!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??\000?\000?\000?");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f???" + "'", str2, "\u3f3f???");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('\376', '\000');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000\000\000i\000\000\000!\000\000" + "'", str4, "\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h\000i\000!\000" + "'", str5, "h\000i\000!\000");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffda");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "26) test0911(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) 97 });
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd" + "'", str5, "\ufffd");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("hi!", false);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd", "\377\375\377\375", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str14 = doubleMetaphone0.encode("\u6148\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
// flaky "27) test0914(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6869");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "28) test0915(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 105, (byte) 63 });
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) "#");
        java.lang.String str11 = doubleMetaphone0.encode("\u3f3f\ufffd");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000", "\ufffd\ufffd\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???h?i?!?a: java.io.UnsupportedEncodingException: ???h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("hi!a\000\u0164\u0a01\ufffd");
        doubleMetaphoneResult7.append('\000');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        char char10 = doubleMetaphone0.charAt("44ih\000i\000!\000a\000", (int) '\000');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '4' + "'", char10 == '4');
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("\000\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.appendAlternate("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????h???????i???????!????: java.io.UnsupportedEncodingException: ???????h???????i???????!????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\346\205\210" + "'", str2, "\ufeff\346\205\210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ue600\u8500\u8800" + "'", str4, "\ufffd\ue600\u8500\u8800");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!a\000hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
// flaky "29) test0927(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2161\u6921\ufffd" + "'", str2, "\u6869\u2161\u6921\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!a\000hi!a" + "'", str3, "hi!a\000hi!a");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str2, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\000h\000i\000!\000a" + "'", str3, "\ufeff\000h\000i\000!\000a");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3400");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 52 });
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 72 });
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6968\u6121", "\u6148", false);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("4hi!a", false);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("iha!");
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AH" + "'", str18, "AH");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("aa???");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 97, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "hi!A", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char14 = doubleMetaphone11.charAt("hi!", (int) (short) 1);
        java.lang.String str16 = doubleMetaphone11.encode("\000\376\377\000h\000i\000!\000a");
        int int17 = doubleMetaphone11.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'i' + "'", char14 == 'i');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.append('a');
        java.lang.Class<?> wildcardClass15 = doubleMetaphoneResult11.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000", "\376\377\000\346\000\205\000\210", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ue685\ufffd", "\u3f3f");
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = doubleMetaphone0.encode(obj19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000", true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff" + "'", str2, "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375\377\375\000\000\377\375\000\000\377\375\000\000\377\375" + "'", str3, "\377\375\377\375\000\000\377\375\000\000\377\375\000\000\377\375");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "??\000H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???H: java.io.UnsupportedEncodingException: ???H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult9.append("\u6148\000", "??");
        doubleMetaphoneResult9.appendPrimary("i ");
        doubleMetaphoneResult9.appendAlternate('\376');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -65, (byte) -17, (byte) -26, (byte) -67, (byte) -128, (byte) -96, (byte) -92, (byte) -26, (byte) -30, (byte) -128, (byte) -128, (byte) -124, (byte) -124, (byte) -26, (byte) -3, (byte) -1 });
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "#i\346");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #i?: java.io.UnsupportedEncodingException: #i?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 72 });
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd", "H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: H: java.io.UnsupportedEncodingException: H");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("4H\000", "\u0164\u0a01\ufffd\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: T?????: java.io.UnsupportedEncodingException: T?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate("#");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("\ufffd\ufffdh\000i\000!\000a\000", "\000hi!a ");
        doubleMetaphoneResult7.appendAlternate('\u0a01');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "i#" + "'", str15, "i#");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("h\000i\000!\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??h\000i\000!\000a\000" + "'", str2, "??h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u6800\u6900\u2100\u6100" + "'", str3, "\u3f3f\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "??h\000i\000!\000a\000" + "'", str4, "??h\000i\000!\000a\000");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000#" + "'", str3, "\000#");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2300" + "'", str4, "\u2300");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148\000", (int) 'h', 0, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000\346\000\205\000\210", (int) (byte) 0, (int) '\u0a01', strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("#", "\u6148");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4?: java.io.UnsupportedEncodingException: 4?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.appendPrimary("");
        java.lang.Class<?> wildcardClass6 = doubleMetaphoneResult3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("ai", "\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("\ufffd\ufffd\000H");
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append("\u0164\u0a01\ufffd");
        doubleMetaphoneResult4.appendAlternate("\ufffd\u2300\u6900");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000\000h\000i\000!\000a\000", "\ufffd\ufffd\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???4: java.io.UnsupportedEncodingException: ???4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6148", "\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "???" + "'", str4, "???");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\377\375\377\375\000\000\377\375\000\000\377\375\000\000\377\375", "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: a: java.io.UnsupportedEncodingException: a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray6);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uff64\u0a0a\u01ff" + "'", str7, "\uff64\u0a0a\u01ff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\uff64\u0a0a\u01ff" + "'", str8, "\uff64\u0a0a\u01ff");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("AH", "\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: aa?: java.io.UnsupportedEncodingException: aa?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6800\u6900\u2100\u6100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufffd");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\376\377\000h\000i\000!\000a");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("", "\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.append("aH");
        doubleMetaphoneResult7.appendPrimary('\ufeff');
        doubleMetaphoneResult7.append("aa\377\375\u6148", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f???");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd", false);
        char char9 = doubleMetaphone0.charAt("\uc3be\uc3bf\303\ua600\uc285\302\ufffd", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!ii4hi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 105, (byte) 105, (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aH" + "'", str2, "aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4861" + "'", str3, "\u4861");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6148" + "'", str4, "\u6148");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4861" + "'", str5, "\u4861");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("\ufffd\ufffd\000H");
        doubleMetaphoneResult4.append('\346');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000\001\000d\000\n\000\001\000\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "T" + "'", str4, "T");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("44ih\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 0, (byte) 52, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        char char8 = doubleMetaphone0.charAt("\u6401\u010a\ufffd", (int) 'h');
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("hi!ii4hi!a", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148", "\000h\000i\000!", true);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000hi!a");
        java.lang.String str19 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) byteArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
// flaky "30) test0978(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u6921\ufffd" + "'", str19, "\u6921\ufffd");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\376\377\000h\000i\000!", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000", false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000", "i i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i i: java.io.UnsupportedEncodingException: i i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("\ufeff\ufffd\u4800", "h\000i\000!\000");
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("\u6869\u2141");
        doubleMetaphoneResult7.appendAlternate("A");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult9.append("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869\u2161\u6921\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "31) test0985(org.apache.commons.codec.language.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 97, (byte) 33, (byte) 104, (byte) 0, (byte) 33, (byte) 105, (byte) -3, (byte) -1 });
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6401\u010a\ufdff\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?C???: java.io.UnsupportedEncodingException: ?C???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.append("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        doubleMetaphoneResult7.append("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000a\000\000\000H", "");
        doubleMetaphoneResult7.appendPrimary('i');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\ufffd", "\377\375\377\375\000\000\377\375\000\000\377\375\000\000\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: y?y?y?y???y?y???y?y???y?y?: java.io.UnsupportedEncodingException: y?y?y?y???y?y???y?y???y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.String str9 = doubleMetaphone0.encode("hi!a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\376", "\u2300\ufe00\uff00\000\u6800\000\u6900\000\u2100\u6968", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(26729);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("ai");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ai" + "'", str2, "ai");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!\000a" + "'", str2, "\000h\000i\000!\000a");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u6800\u6900\u2100\u6100" + "'", str2, "\u3f3f\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3fhi!a" + "'", str3, "\u3f3fhi!a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3fhi!a" + "'", str4, "\u3f3fhi!a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "??\000h\000i\000!\000a" + "'", str5, "??\000h\000i\000!\000a");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u0164\u0a01\ufffd\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) -3, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen(35);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000a\000H", "\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
    }
}
