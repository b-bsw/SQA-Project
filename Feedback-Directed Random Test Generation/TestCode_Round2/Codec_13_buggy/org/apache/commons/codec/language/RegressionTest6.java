package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!a", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "4H\000", false);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "\376");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendPrimary("\ufffd\u4800");
        doubleMetaphoneResult4.appendPrimary("\000h\000i\000!\000a");
        java.lang.String str14 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str15 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6100" + "'", str2, "\u6100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6100" + "'", str3, "\u6100");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("#");
        java.lang.String str14 = doubleMetaphone0.encode("\000hi!a ");
        java.lang.String str16 = doubleMetaphone0.encode("\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\ufffd\u48004", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("??\000?\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("i#", "\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 72 });
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6869");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test3010(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 105, (byte) 63 });
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000a\000i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 97, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000a\000i" + "'", str2, "??\000a\000i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3fai" + "'", str3, "\u3f3fai");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("AH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 65, (byte) 72 });
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode(" ");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("4\000\u6148a", false);
        char char15 = doubleMetaphone0.charAt("\u6968\u6921", 100);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("\ufeff\ufffd\u4800", "h\000i\000!\000");
        doubleMetaphoneResult7.appendPrimary('\u4800');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdhi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append("A");
        boolean boolean11 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate("\ue6a1\ua9e2\u85a1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\000?\000?\000\000\000?\000\000\000?\000\000\000?");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char5 = doubleMetaphone0.charAt("\377\375\377\375", 32);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!ahi!#", "\000hi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?hi!a: java.io.UnsupportedEncodingException: ?hi!a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 72, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4800\u6100" + "'", str2, "\u4800\u6100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4800\u6100" + "'", str3, "\u4800\u6100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4800\u6100" + "'", str4, "\u4800\u6100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000H\000a" + "'", str5, "\000H\000a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000H\000a" + "'", str6, "\000H\000a");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\ufffd", "\000h\000i\000!\000a");
        doubleMetaphoneResult4.appendAlternate("i\000");
        doubleMetaphoneResult4.appendAlternate('\376');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\377\000\375" + "'", str2, "\000\377\000\375");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\0004", (int) 'h', (int) '#', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("#\000", 100, (int) '\346', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        java.lang.String str17 = doubleMetaphoneResult4.getAlternate();
        boolean boolean18 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate('\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4\000i" + "'", str17, "4\000i");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult21.appendPrimary("\u3f3f\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("##a", "\u6148");
        byte[] byteArray31 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\000h\000i\000!\000\ufeff");
        java.lang.String str32 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) byteArray31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray31);
// flaky "2) test3028(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) -17, (byte) -69, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\376\377\000h\000i\000!\000\ufeff" + "'", str32, "\376\377\000h\000i\000!\000\ufeff");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3fi ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "3) test3029(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 52, (byte) 0, (byte) 32, (byte) 63, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3fi " + "'", str2, "\u3f3fi ");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\u3f3f\ufffd");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char13 = doubleMetaphone10.charAt("hi!", (int) (short) 1);
        java.lang.String str15 = doubleMetaphone10.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone10.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult17.appendAlternate('\000');
        doubleMetaphoneResult17.append("hi!", "hi!a");
        doubleMetaphoneResult17.appendAlternate("");
        doubleMetaphoneResult17.appendAlternate("\000\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult17.appendAlternate("4");
        doubleMetaphoneResult17.appendAlternate("\u6120");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "\u6120");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'i' + "'", char13 == 'i');
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!a", "hi!a");
        doubleMetaphoneResult4.appendPrimary("i");
        java.lang.String str17 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("\u6120\ufffd");
        doubleMetaphoneResult4.appendPrimary("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4hi!a" + "'", str17, "4hi!a");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray15);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray15);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\303\276\303\277\000h\000i\000!\000a", 35, (int) '\ufffd', strArray15);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 105, (int) '\ufffd', strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str2, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str3, "\376\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufeff\000h\000i\000!\000a" + "'", str4, "\ufeff\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str5, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str6, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!ii4hi!a", 35, (int) '#', strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, 0, strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6800\u6900\u2100\u6100", (int) '#', 10, strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("i??", (int) '\u6869', (int) (short) 1, strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u4800\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000", (int) '\376', (int) '\u6148', strArray31);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("##4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) 35, (byte) 0, (byte) 52, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2300\u2300\u3400" + "'", str2, "\u2300\u2300\u3400");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) 0, (byte) 0, (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) 0, (byte) 0, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\303\276\303\277\000\303\246\000\302\205\000\302\210", "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????h???i???!?: java.io.UnsupportedEncodingException: ??????h???i???!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubdef\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd" + "'", str2, "\uefbf\ubdef\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("aH", (int) ' ');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\ufffd\ufffd\000H", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!" + "'", str4, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000h\000i\000!" + "'", str5, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.append('h', '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("4hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3468\u6921\ufffd" + "'", str2, "\u3468\u6921\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!a" + "'", str3, "4hi!a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4hi!a" + "'", str4, "4hi!a");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u2323\u6168", 1, (int) (byte) 100, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd", 4, (int) (short) 1, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffdH\000", 97, 26729, strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\001\000d\000\n\000\001\000\n" + "'", str2, "\376\377\000\001\000d\000\n\000\001\000\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000\001\000d\000\n\000\001\000\n" + "'", str3, "\376\377\000\001\000d\000\n\000\001\000\n");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000\000\000a\000\000" + "'", str2, "\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000\000\000a\000\000");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("4\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4\001d\n\001\n" + "'", str2, "4\001d\n\001\n");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\376\377\000\346\000\205\000\210", "\u3f3f");
        doubleMetaphoneResult8.appendPrimary("\000");
        java.lang.String str15 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("??\000\001\000d\000\n\000\001\000\n");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("i ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 32, (byte) 0 });
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult5.append('\346');
        doubleMetaphoneResult5.append("???", "4");
        boolean boolean11 = doubleMetaphoneResult5.isComplete();
        doubleMetaphoneResult5.append('4', '\346');
        doubleMetaphoneResult5.appendAlternate("#hi!aT");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        doubleMetaphoneResult4.append('\ufffd');
        doubleMetaphoneResult4.append("\u6869\u2123\u3f00", "h\000i\000!\000#\000Ha\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!a");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        char char13 = doubleMetaphone0.charAt("aiT", (int) 'i');
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\uff64\u0a0a\u01ff", "T");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!A", "\u6869");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) '?');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}
