package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        char char16 = doubleMetaphone0.charAt("\u3f3fhi!a", 35);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000\346\000\205\000\210");
        java.lang.String str19 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray18);
        java.lang.String str20 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "??\000?\000?\000?" + "'", str19, "??\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u3f3f\u3f00\u3f00\u3f00" + "'", str20, "\u3f3f\u3f00\u3f00\u3f00");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100", "4\000\u6148");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4?i4?: java.io.UnsupportedEncodingException: 4?i4?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.lang.String str20 = doubleMetaphoneResult9.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\u2161\u6921\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test2004(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -30, (byte) -123, (byte) -95, (byte) 104, (byte) -26, (byte) -92, (byte) -95, (byte) -17, (byte) -65, (byte) -67 });
// flaky "1) test2004(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd" + "'", str2, "\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd");
// flaky "1) test2004(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\346\241\251\342\205\241h\346\244\241\357\277\275" + "'", str3, "\346\241\251\342\205\241h\346\244\241\357\277\275");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        doubleMetaphoneResult12.appendAlternate("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufdff" + "'", str4, "\ufdff");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult14.appendAlternate('\u6869');
        doubleMetaphoneResult14.appendAlternate('\376');
        java.lang.String str19 = doubleMetaphoneResult14.getAlternate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("aiT");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0, (byte) 105, (byte) 0, (byte) 84, (byte) 0 });
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148" + "'", str3, "\u6148");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\346\000\205\000\210" + "'", str4, "\000\346\000\205\000\210");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str3 = doubleMetaphoneResult2.getAlternate();
        java.lang.String str4 = doubleMetaphoneResult2.getPrimary();
        doubleMetaphoneResult2.appendAlternate('\ufffd');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("i ", false);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "\u4800\u6100");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f\u3f3fhi!a", "hi!\000", false);
        java.lang.String str30 = doubleMetaphone0.encode("\ufffd\u6900\u2000\u6900");
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeff\000h\000i\000!\000a", "", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(100);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\u4148");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 0, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) (byte) 100, (int) (byte) 0, strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\346\241\251\342\205\241h\346\244\241\357\277\275", (int) '\346', (int) 'i', strArray28);
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("#", "\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000i\000#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 35 });
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult4.append('h', 'a');
        boolean boolean8 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('T');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a\000\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!ah\000i\000!\0004???");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!ah?i?!?4???: java.io.UnsupportedEncodingException: hi!ah?i?!?4???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "2) test2018(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 97, (byte) 72, (byte) 0, (byte) 0 });
// flaky "2) test2018(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000" + "'", str2, "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aH" + "'", str2, "aH");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        doubleMetaphoneResult4.appendPrimary('T');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
// flaky "3) test2020(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6148" + "'", str15, "\u6148");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str9 = doubleMetaphone0.encode("\uc3be\uc3bfhi!a");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("???", "a ", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!\000\000", "#a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        java.lang.String str14 = doubleMetaphone0.encode("\u6148");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ai");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\u6800\u6900\u2100\u6100", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        doubleMetaphoneResult4.append('a');
        doubleMetaphoneResult4.append('\346');
        doubleMetaphoneResult4.append("\u6968!", "\u6401\u010a\ufffd");
        doubleMetaphoneResult4.appendAlternate('?');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("hi!", "H");
        boolean boolean15 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate("\uc3be\uc3bfhi!a");
        java.lang.String str18 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!\000hi!" + "'", str18, "hi!\000hi!");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\375\377\375\377\000\000h\000\000\000i\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "4) test2027(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 97, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("??H", "iha!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: iha!: java.io.UnsupportedEncodingException: iha!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\346\241\251\342\205\241h\346\244\241\357\277\275");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("4#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 35 });
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\000\346\000\205\000\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) -61, (byte) -90, (byte) 0, (byte) -62, (byte) -123, (byte) 0, (byte) -62, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc3be\uc3bf\303\ua600\uc285\302\ufffd" + "'", str2, "\uc3be\uc3bf\303\ua600\uc285\302\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str3, "\376\377\000\346\000\205\000\210");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("?\001d\n\001\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000#\000h\000i\000!\000a\000T");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000\000\000" + "'", str3, "h\000i\000!\000\000\000");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!ahi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendAlternate('4');
        doubleMetaphoneResult9.append("hi!\000", "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        doubleMetaphoneResult9.append("\ufeff", "\ufdffhi!a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(" ", "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????h???i???!???a: java.io.UnsupportedEncodingException: ?????h???i???!???a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\001d\n\001\n" + "'", str2, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001d\n\001\n" + "'", str3, "\001d\n\001\n");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000\346\000\205\000\210", "Ha", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("??H", "a \000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: a ?: java.io.UnsupportedEncodingException: a ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u0a01');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char12 = doubleMetaphone0.charAt("44ih\000i\000!\000a\000", (int) '4');
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd#", "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeffhi!a", "\376\377\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??h?i?!: java.io.UnsupportedEncodingException: ?y??h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff#i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) 0, (byte) 35, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\u2300\u6900" + "'", str2, "\ufffd\ufffd\u2300\u6900");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aH" + "'", str2, "aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aH" + "'", str3, "aH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aH" + "'", str4, "aH");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aH" + "'", str3, "aH");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("??\000?\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        char char12 = doubleMetaphone0.charAt("\u6148\000", 10);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd\000", "\u6869");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\ufe00\uff00\uff00\ufd00\u6800\000\u6900\000\u2100\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
// flaky "5) test2050(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("??");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char18 = doubleMetaphone15.charAt("hi!", (int) (short) 1);
        java.lang.String str20 = doubleMetaphone15.doubleMetaphone("");
        java.lang.String str22 = doubleMetaphone15.encode("hi!a");
        char char25 = doubleMetaphone15.charAt("hi!", (int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone15.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str29 = doubleMetaphone15.doubleMetaphone("##ah");
        java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) str29);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'i' + "'", char18 == 'i');
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        doubleMetaphoneResult22.appendPrimary('\ubf61');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\377\375");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\346\205\210", "i#", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\u6968\u6121");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff", "\u3f3f");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#\000\u3f3f\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35, (byte) 0, (byte) 0, (byte) 63, (byte) 63, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000#\000\000??aH" + "'", str2, "\000#\000\000??aH");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148\000", (int) 'h', 0, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", 32, (int) '\u6869', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) '\u6148', (int) '\u6148', strArray25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd", (int) (byte) 0, (-1), strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("a ");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 97, (byte) 0, (byte) 32 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3468\u6921\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 52, (byte) 33, (byte) 105, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6834\u2169\ufdff" + "'", str2, "\u6834\u2169\ufdff");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000h\000i\000!\000a" + "'", str2, "\ufffd\ufffd\000h\000i\000!\000a");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\277");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -65, (byte) 0 });
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "\ubbef\u23bf", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\346\000\205\000\210", "\000h\000i\000!\000\000", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6401\u010a\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0164\u0a01\ufdff" + "'", str2, "\u0164\u0a01\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001d\n\001\375\377" + "'", str3, "\001d\n\001\375\377");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\001d\n\001\ufffd\ufffd" + "'", str4, "\001d\n\001\ufffd\ufffd");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) "#");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "h\000i\000!\000\000\000");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\376\377\000h\000i\000!\000\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd", "\ufdff\376\377\000h\000i\000!\000a", false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubd00\uefbf\ubd00\000\u6800\000\u6900\000\u2100\000\u6100" + "'", str2, "\uefbf\ubd00\uefbf\ubd00\000\u6800\000\u6900\000\u2100\000\u6100");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\ubf61');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??h\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("hi!a\000hi!a", true);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\u4100", "", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -29, (byte) -68, (byte) -65, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\u3f3f\ufffd" + "'", str2, "\ufeff\u3f3f\ufffd");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char12 = doubleMetaphone0.charAt("\ufffd\ufffd\ufffd", 0);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\377\376h\000i\000!\000", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\ufffd' + "'", char12 == '\ufffd');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(52);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "");
        doubleMetaphoneResult7.append("A");
        doubleMetaphoneResult7.append('T', '\000');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u0164\u0a01\ufffd" + "'", str9, "\u0164\u0a01\ufffd");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6968\u6121", "\u6148", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u6869');
        doubleMetaphoneResult15.append('h', 'i');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!\000a" + "'", str2, "\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!\000a" + "'", str3, "\000h\000i\000!\000a");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("Ha");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("ai", false);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("iiaH");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\ufffd", "\000h\000i\000!\000a");
        doubleMetaphoneResult4.appendAlternate("i\000");
        doubleMetaphoneResult4.appendAlternate("aiT");
        doubleMetaphoneResult4.appendPrimary('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#\376\377\000h\000i\000\u2300");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "6) test2077(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 35, (byte) 0 });
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\ufffd');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('\ufeff');
        doubleMetaphoneResult7.appendAlternate("hi!ii4hi!a");
        doubleMetaphoneResult7.append('\ufeff');
        doubleMetaphoneResult7.appendAlternate('\u3f21');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148", "\000h\000i\000!", true);
        char char19 = doubleMetaphone0.charAt("h\000i\000!\000", 1);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("4H\000", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!a\000\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "7) test2081(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 97, (byte) 72, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a\000\u6148\000" + "'", str2, "hi!a\000\u6148\000");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\ufffd\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) -3, (byte) -1, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\ufffd\u4800" + "'", str2, "\ufeff\ufffd\u4800");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6401\u010a\ufffd" + "'", str9, "\u6401\u010a\ufffd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6401\u010a\ufffd" + "'", str10, "\u6401\u010a\ufffd");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (int) (byte) 10, (int) (byte) 10, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("Hh", (int) '\ubf61', (int) 'i', strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f\ufffd", "\u3f3f\u6800\u6900\u2100\u6100");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\277", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "8) test2086(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd" + "'", str5, "\ufffd");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("\ufeff\ufffd\u4800", "h\000i\000!\000");
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("\u6869\u2141");
        doubleMetaphoneResult7.append('\377', '\277');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\u3f3f", true);
        char char14 = doubleMetaphone0.charAt("\000\376\377\000h\000i\000!\000a", (int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(35);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeff\u6869\u2161", "\u3f3f\u3f3f\u3f00", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'a' + "'", char14 == 'a');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("\uefbf\ubde6\ua080\ue6a4\u80e2\u8480\ue684\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\uc3be\uc3bfhi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary("\376\377??");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6800\u6900\u2100\u6100" + "'", str2, "\ufffd\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375h\000i\000!\000a\000" + "'", str3, "\377\375h\000i\000!\000a\000");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u3f3fhi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6148\000");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "9) test2096(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 35, (byte) 63, (byte) 0 });
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        doubleMetaphoneResult16.appendAlternate("hi!H");
        boolean boolean21 = doubleMetaphoneResult16.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\ufffd", "\000h\000i\000!\000a");
        doubleMetaphoneResult4.appendAlternate("i\000");
        doubleMetaphoneResult4.appendAlternate("aiT");
        java.lang.String str17 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000h\000i\000!\000ai\000aiT" + "'", str17, "\000h\000i\000!\000ai\000aiT");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\u6148", false);
        doubleMetaphone0.setMaxCodeLen((int) '\ufffd');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd", "AT", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\ufeff\001d\n\001\n");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "T" + "'", str15, "T");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 65533 + "'", int16 == 65533);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\uff64\u0a0a\u01ff", (int) (short) 10);
        java.lang.String str14 = doubleMetaphone0.encode("hi!a4");
        char char17 = doubleMetaphone0.charAt("\ufffd\ufdffH", (int) '?');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("?");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6869\u2123\u3f00", "\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: y?y?: java.io.UnsupportedEncodingException: y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("\000 ");
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.appendAlternate("ai");
        doubleMetaphoneResult11.append("\u6148", "");
        doubleMetaphoneResult11.append('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("?\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f00\u0100\u6400\u0a00\u0100\u0a00" + "'", str2, "\u3f00\u0100\u6400\u0a00\u0100\u0a00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f00\u0100\u6400\u0a00\u0100\u0a00" + "'", str3, "\u3f00\u0100\u6400\u0a00\u0100\u0a00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000?\000\001\000d\000\n\000\001\000\n" + "'", str4, "\000?\000\001\000d\000\n\000\001\000\n");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.append('4');
        doubleMetaphoneResult3.appendPrimary("i");
        doubleMetaphoneResult3.append('a', '\ufeff');
        doubleMetaphoneResult3.appendPrimary("\u6800\u6900\u2100\000");
        java.lang.String str13 = doubleMetaphoneResult3.getAlternate();
        doubleMetaphoneResult3.appendPrimary("4#\377\375\u3f3f\ufffd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6869\u2161\u6921\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??h??: java.io.UnsupportedEncodingException: ??h??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str14 = doubleMetaphone0.encode("#\000\u3f3f\u6148");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff\000#i");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000\377\000\375\000\377\000\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\377\000\375\000\377\000\375" + "'", str2, "\376\377\000\377\000\375\000\377\000\375");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\uff00\ufd00\uff00\ufd00" + "'", str3, "\ufffd\uff00\ufd00\uff00\ufd00");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\376\377\000h\000i\000!", true);
        char char13 = doubleMetaphone0.charAt("\ufeff#", (int) '\ufffd');
        java.lang.String str15 = doubleMetaphone0.encode("\377\375h\000i\000!\000a\000");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\ufeffaH");
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        char char8 = doubleMetaphone0.charAt("\u6401\u010a\ufffd", (int) 'h');
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000#", "\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        char char16 = doubleMetaphone0.charAt("\u6921\ufffd", (int) 'h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u0164\u0a01\ufffd\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???\000" + "'", str2, "???\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f00" + "'", str3, "\u3f3f\u3f00");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str6 = doubleMetaphone0.encode("\ufffd\ufffd\ufffd\ufffd\000h\000i\000!\000a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\377\375", true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        char char9 = doubleMetaphone0.charAt("\ufffd\ufffd\000H", 0);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\u6800\u6900\u2100\u6100", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("##4", false);
        java.lang.String str17 = doubleMetaphone0.encode("hi!a\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\ufffd' + "'", char9 == '\ufffd');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("4\000\u6148");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "10) test2116(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 0, (byte) 105, (byte) 52, (byte) 63 });
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u48004i\001d\n\001\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -28, (byte) -96, (byte) -128, (byte) 52, (byte) 105, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        char char11 = doubleMetaphone0.charAt("\ufeff\346\205\210", 0);
        char char14 = doubleMetaphone0.charAt("aHi", (int) '\376');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\ufeff' + "'", char11 == '\ufeff');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\uff64\u0a0a\u01ff", (int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('\ufeff');
        doubleMetaphoneResult7.appendAlternate("hi!ii4hi!a");
        doubleMetaphoneResult7.append('\ufeff');
        doubleMetaphoneResult7.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6921\ufffd", "hi!A");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!A: java.io.UnsupportedEncodingException: hi!A");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("i ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6900\u2000" + "'", str2, "\u6900\u2000");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6968!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 0, (byte) 33 });
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.append("h\000i\000!\000", "i ");
        doubleMetaphoneResult9.append("##ah");
        doubleMetaphoneResult9.appendPrimary(' ');
        java.lang.String str18 = doubleMetaphoneResult9.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!ii4hi!a", 35, (int) '#', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a", (int) 'a', (int) '#', strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '\ufffd', (int) (byte) 0, strArray25);
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
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6869\u2161" + "'", str4, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!a" + "'", str5, "hi!a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6869\u2161" + "'", str6, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6968\u6121" + "'", str7, "\u6968\u6121");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufe00\uff00\uff00\ufd00\u6800\000\u6900\000\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe00\uff00\uff00\ufd00\u6800\000\u6900\000\u2100\000" + "'", str2, "\ufe00\uff00\uff00\ufd00\u6800\000\u6900\000\u2100\000");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("aH#", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd", true);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u0164\u0a01\ufffd\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) -3, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6401\u010a\ufdff\000" + "'", str2, "\u6401\u010a\ufdff\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001d\n\001\ufffd\ufffd\000\000" + "'", str3, "\001d\n\001\ufffd\ufffd\000\000");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6401\u010a\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6401\u010a\ufffd" + "'", str2, "\u6401\u010a\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdd\001\001\n\ufffd\ufffd" + "'", str3, "\ufffd\ufffdd\001\001\n\ufffd\ufffd");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.append("i");
        doubleMetaphoneResult2.append("a", "Ha");
        doubleMetaphoneResult2.appendPrimary('i');
        boolean boolean10 = doubleMetaphoneResult2.isComplete();
        boolean boolean11 = doubleMetaphoneResult2.isComplete();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate("ai");
        doubleMetaphoneResult4.append('\346', 'a');
        doubleMetaphoneResult4.appendPrimary("??\000H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u2161" + "'", str3, "\u6869\u2161");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\u6121" + "'", str4, "\u6968\u6121");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate("#");
        doubleMetaphoneResult7.appendPrimary(' ');
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i#" + "'", str17, "i#");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffda", true);
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeff", "\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd\000", "?aH", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ue685\ufffd", "\u3f3f");
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000hi!a");
        java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) "\000hi!a");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000\000\000i\000\000\000!\000\000\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "h\000i\000!\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult20.appendAlternate('h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u013f\u0a64\u0a01");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "#\376\377\000h\000i\000\u6869");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #?y??h?i?!?: java.io.UnsupportedEncodingException: #?y??h?i?!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str12 = doubleMetaphoneResult11.getPrimary();
        doubleMetaphoneResult11.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6869\u2161\u6921\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "11) test2142(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("??H", "4hi!a", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.append("i");
        doubleMetaphoneResult2.appendPrimary("\000\000h\000i\000!\000a\000");
        java.lang.String str7 = doubleMetaphoneResult2.getPrimary();
        doubleMetaphoneResult2.appendAlternate('#');
        java.lang.String str10 = doubleMetaphoneResult2.getAlternate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i\000\000h\000i\000!\000a\000" + "'", str7, "i\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "i#" + "'", str10, "i#");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("a \000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6120\ufffd" + "'", str2, "\u6120\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a \000" + "'", str3, "a \000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a \000" + "'", str4, "a \000");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult12.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str4 = doubleMetaphoneResult3.getAlternate();
        doubleMetaphoneResult3.append("4", "i#");
        doubleMetaphoneResult3.append(' ');
        doubleMetaphoneResult3.append("\376\377\377\375h\000i\000!\000", "hi!a\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f", "hi!#hi!a\000hi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!#hi!a?hi!a: java.io.UnsupportedEncodingException: hi!#hi!a?hi!a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("#\376\377\000h\000i\000\u6869");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "12) test2149(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 104 });
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!" + "'", str2, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000h\000i\000!", (int) (byte) 100, 0, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) ' ', (int) (byte) 100, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u4800", 105, 0, strArray25);
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
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\376\377\000h\000i\000!\000a#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 35 });
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufffd");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000i\000!\000a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        char char6 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\u4861");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char13 = doubleMetaphone10.charAt("hi!", (int) (short) 1);
        java.lang.String str15 = doubleMetaphone10.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone10.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult17.append("\ufeff\ufffd\u4800", "h\000i\000!\000");
        doubleMetaphoneResult17.appendAlternate('\000');
        boolean boolean23 = doubleMetaphoneResult17.isComplete();
        doubleMetaphoneResult17.appendAlternate('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'i' + "'", char13 == 'i');
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 0, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) (byte) 100, (int) (byte) 0, strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u4800\376\377\000a\000H", (int) '\u010a', (int) '\000', strArray28);
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
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.lang.String str22 = doubleMetaphone0.encode("#i\346");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\375\377\375\377\000\000h\000\000\000i\000\000\000!\000", "\277", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("??", (int) '\000', 0, strArray12);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u4800", 52, (int) '\ubf61', strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375" + "'", str3, "\377\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd" + "'", str4, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\377\375" + "'", str5, "\377\375");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd" + "'", str6, "\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd" + "'", str7, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffd" + "'", str8, "\ufffd\ufffd");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.appendPrimary(' ');
        java.lang.String str14 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!\000 " + "'", str14, "hi!\000 ");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\375h\000i\000!\000a\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\375h\000i\000!\000a\000" + "'", str2, "\377\375h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ubfc3\ubdc3hi!a" + "'", str3, "\ubfc3\ubdc3hi!a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\377\375h\000i\000!\000a\000" + "'", str4, "\377\375h\000i\000!\000a\000");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(' ', 'i');
        doubleMetaphoneResult7.appendAlternate('4');
        doubleMetaphoneResult7.append("hi!i", "\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append('#');
        doubleMetaphoneResult12.appendAlternate('\u0a01');
        doubleMetaphoneResult12.appendAlternate("\u4841");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendAlternate("\u6800\u6900\u2100");
        java.lang.String str10 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append("h\000i\000!\000a\000");
        doubleMetaphoneResult4.appendPrimary('\ubf61');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6800\u6900\u2100" + "'", str10, "\u6800\u6900\u2100");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6869\u2169\u6934\u6869\u2161");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 105, (byte) 33, (byte) 105, (byte) 105, (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000\000h\000\000\000i\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\ufffd\ufffd\000#\000i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???#?i: java.io.UnsupportedEncodingException: ???#?i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!a\000\u6148\000hi!a", "\376");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000hi!a ");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000h\000i\000!\000a\000 \000" + "'", str2, "\000\000h\000i\000!\000a\000 \000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\u6800\u6900\u2100\u6100\u2000" + "'", str3, "\000\u6800\u6900\u2100\u6100\u2000");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6800\u6900\u2100\u6100", (-1), (int) (short) 1, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult3.append('4');
        java.lang.Class<?> wildcardClass6 = doubleMetaphoneResult3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("4");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ue6a1\ua9e2\u85a1");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -26, (byte) -95, (byte) -87, (byte) -30, (byte) -123, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue6a1\ua9e2\u85a1" + "'", str2, "\ue6a1\ua9e2\u85a1");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult14.appendAlternate('\u6869');
        doubleMetaphoneResult14.appendAlternate('\376');
        doubleMetaphoneResult14.append('\ufffd', ' ');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("aH#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0, (byte) 72, (byte) 0, (byte) 35, (byte) 0 });
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("", "\376\377\000h\000i\000!\000a");
        boolean boolean11 = doubleMetaphoneResult7.isComplete();
        java.lang.String str12 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("\ufdff\ufdff");
        java.lang.Class<?> wildcardClass15 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\u3f21');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("i ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 32 });
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean3 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd", "\u3f3fhi!a");
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!" + "'", str3, "\000h\000i\000!");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('a', '4');
        doubleMetaphoneResult4.appendPrimary("H");
        doubleMetaphoneResult4.append('a', '\000');
        doubleMetaphoneResult4.appendPrimary("\u0164\u0a01\ufffd\u6869");
        doubleMetaphoneResult4.append("\u3f3f\u3f3fhi!a", "\u3f3f\u3f00\u3f00\u3f00\u3f00\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str7 = doubleMetaphone0.encode("\ufffd\u6800\u6900\u2100\u6100");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000\000h\000i\000!\000a\000", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append("\ufffd\ufffd\0004\000\000\000i\0004aH\000a", "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append('4', '\000');
        doubleMetaphoneResult4.appendAlternate('i');
        doubleMetaphoneResult4.appendPrimary('i');
        java.lang.String str19 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!\0004i" + "'", str19, "hi!\0004i");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000" + "'", str2, "\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uefbf\ubdef\ubfbdh\000i\000!\000" + "'", str3, "\uefbf\ubdef\ubfbdh\000i\000!\000");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("hi!a");
        int int7 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufdff");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u3f00\u3f00\u3f00\u3f00\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char12 = doubleMetaphone0.charAt("\u6148", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult14.append('\277', '\ubf61');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd", false);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("??\000?\000?\000?", false);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\u6900\u6800\u6100\u2100", "\u4841");
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("#i\346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "iiaH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: iiaH: java.io.UnsupportedEncodingException: iiaH");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) 105, (byte) 0, (byte) -26, (byte) 0 });
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000hi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?hi!a: java.io.UnsupportedEncodingException: ?hi!a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "h\000i\000!\000\000\000", true);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??\000\001\000d\000\n\000\001\000\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\376\377\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\376\377\000h\000i\000!\000a" + "'", str2, "\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a" + "'", str3, "\000\000\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?#: java.io.UnsupportedEncodingException: ?#");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "13) test2201(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append("h\000i\000!\000", "");
        doubleMetaphoneResult7.appendAlternate("#");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u6100", "\ufeff\377\375\377\375");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "i#" + "'", str15, "i#");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("4\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        char char14 = doubleMetaphone0.charAt("\ufeff#i", 26729);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("hi!\000 ");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("4\000", (int) '4', (int) '#', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u0164\u0a01\ufffd\000", (int) '#', (int) 'i', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffdaH", (int) '\346', (int) '\ufeff', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeffaH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?aH" + "'", str2, "?aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u613f\ufffd" + "'", str3, "\u613f\ufffd");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6120");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "14) test2209(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 35, (byte) 63 });
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148h\000i\000!\000a\000\u6869", 32, 1, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f", 0, 105, strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.append("h\000i\000!\000", "i ");
        doubleMetaphoneResult9.append("##ah");
        doubleMetaphoneResult9.appendPrimary(' ');
        doubleMetaphoneResult9.appendPrimary('\376');
        doubleMetaphoneResult9.appendPrimary("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdhi!a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000#", "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148", "??\000h\000i\000!\000a");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "15) test2212(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('a', '4');
        boolean boolean9 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult9.append("\ufffd\ufffd\ufffd\ufffd\000\ufffd\ufffd\000\ufffd\ufffd\000\ufffd\ufffd");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\377\375\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("\u6869\u2161\u6921\ufffd");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ai", "\ufffd\u4800\000");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375", "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!ii4hi!a", 35, (int) '#', strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, 0, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u6800\u6900\u2100\u6100", (int) '#', 10, strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\377\375h\000i\000!\000a\000", (int) (short) 100, (int) '\ubf61', strArray28);
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
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f???" + "'", str2, "\u3f3f???");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??\000?\000?\000?" + "'", str3, "??\000?\000?\000?");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6148");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "16) test2220(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 97, (byte) 72 });
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(1);
        char char20 = doubleMetaphone0.charAt("\u3f3fhi!a", (int) (byte) 100);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("Ha");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffdhi!a" + "'", str2, "\ufffd\ufffd\ufffd\ufffdhi!a");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen(35);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u0164\u0a01\ufffd\000", "\000\000h\000\000\000i\000\000\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??h???i???!?: java.io.UnsupportedEncodingException: ??h???i???!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("4hi!aA");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 65 });
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', ' ');
        java.lang.String str18 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('T');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000hi!a " + "'", str18, "\000hi!a ");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\377\375h\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff", "iha!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: iha!: java.io.UnsupportedEncodingException: iha!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.append("h\000i\000!\000", "i ");
        doubleMetaphoneResult9.append("##ah");
        doubleMetaphoneResult9.appendPrimary(' ');
        doubleMetaphoneResult9.append("\u6148");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendAlternate('4');
        doubleMetaphoneResult9.append("hi!\000", "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        doubleMetaphoneResult9.append("4", "\ufdff\ufdff\000\u0100\000\u6400\000\u0a00\000\u0100\000\u0a00");
        doubleMetaphoneResult9.append("\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6800\u6900\u2100\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("4");
        char char5 = doubleMetaphone0.charAt("\u3f3f\u4800", 97);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("hi!a\000hi!a", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff", "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????: java.io.UnsupportedEncodingException: ??????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\u48004i\001d\n\001\n\000", "\u3f00\u0100\u6400\u0a00\u0100\u0a00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?A???A??: java.io.UnsupportedEncodingException: ?A???A??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("T");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 84 });
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult9.appendPrimary('\376');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!ii4hi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0, (byte) 105, (byte) 0, (byte) 52, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6921\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "17) test2240(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) -1, (byte) -3 });
// flaky "3) test2240(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\000\ufffd\ufffd");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\377\375", 35, (int) (byte) 10, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\377\000a\000H", 0, 10, strArray18);
        java.lang.Class<?> wildcardClass24 = strArray18.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6148", "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
// flaky "18) test2243(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000\377\000\375\000\377\000\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd" + "'", str2, "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        char char8 = doubleMetaphone0.charAt("\u6401\u010a\ufffd", (int) 'h');
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!\000ai\000aiT", "\ufffd", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('a', '\377');
        doubleMetaphoneResult7.appendPrimary("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("\u4800\u6100");
        boolean boolean11 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append("i\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        java.lang.String str20 = doubleMetaphoneResult16.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult9.append("\u6148\000", "??");
        doubleMetaphoneResult9.append("\uc3be\uc3bfhi!a");
        java.lang.String str15 = doubleMetaphoneResult9.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a4");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 52 });
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6869\u2161", "hi!a", true);
        java.lang.String str13 = doubleMetaphone0.encode("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdhi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("4H\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.Class<?> wildcardClass8 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult9.append("", "\000\u6800\000\u6900\000\u2100\000\u6100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\000" + "'", str3, "hi!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000\000\000" + "'", str4, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h\000i\000!\000\000\000" + "'", str5, "h\000i\000!\000\000\000");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000H" + "'", str2, "??\000H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??\000H" + "'", str3, "??\000H");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("aH#4");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72, (byte) 35, (byte) 52 });
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aa???", (int) '\u0a01', (int) '\u3f21', strArray22);
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
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str9 = doubleMetaphone0.encode("\ufdffhi!a");
        char char12 = doubleMetaphone0.charAt("\000\000\000h\000\000\000i\000\000\000!", (int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) '\u0a01');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        java.lang.String str10 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#\000" + "'", str10, "#\000");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1 });
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("##");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) 35, (byte) 0 });
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\u6800\000\u6900\000\u2100\000\u6100", (int) '\ufffd', (int) (short) 1, strArray22);
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
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u0164\u0a01\ufffd\u6869");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -3, (byte) -1, (byte) 105, (byte) 104 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6401\u010a\ufdff\u6968" + "'", str2, "\u6401\u010a\ufdff\u6968");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        byte[] byteArray7 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray7);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray7);
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) str9);
        java.lang.String str12 = doubleMetaphone0.encode("\ufdff\ufdff");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148\000", (int) 'h', 0, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", 32, (int) '\u6869', strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("\001d\n\001\n", (int) '\u6148', (int) '\u6148', strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u4100", 0, 100, strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("a ", (int) 'T', (int) '\u3f21', strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000\000h\000\000\000i\000\000\000!\000\000\000a", (int) (short) 100, (int) (byte) 100, strArray31);
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
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\u6869\u2169\u6934\u6869\u2161", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000\000\u6100" + "'", str2, "\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000\000\u6100");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6900\u2000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 32, (byte) 0 });
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u2323\u6168", 1, (int) (byte) 100, strArray21);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6968!", (int) (byte) -1, (int) '\277', strArray21);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ue6a1\ua9e2\u85a1", 52, (int) (byte) -1, strArray21);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffdaH", 52, (int) '\ufffd', strArray21);
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
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("i ");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd", false);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("hi!#hi!a\000\u6148\000\001d\n\001\n\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HT" + "'", str16, "HT");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult8.append("", "\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f???" + "'", str2, "\u3f3f???");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\0004i", "\u3f3f\u3f3fhi!a", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!\000a" + "'", str2, "\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!\000a" + "'", str3, "\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\375\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\303\277\303\275\303\277\303\275" + "'", str2, "\303\277\303\275\303\277\303\275");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6869\u2141", "i ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\376');
        doubleMetaphoneResult16.appendPrimary('4');
        doubleMetaphoneResult16.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\346\241\251\342\205\241h\346\244\241\357\277\275");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -90, (byte) -62, (byte) -95, (byte) -62, (byte) -87, (byte) -61, (byte) -94, (byte) -62, (byte) -123, (byte) -62, (byte) -95, (byte) 104, (byte) -61, (byte) -90, (byte) -62, (byte) -92, (byte) -62, (byte) -95, (byte) -61, (byte) -81, (byte) -62, (byte) -65, (byte) -62, (byte) -67 });
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult9.append('\ufeff');
        java.lang.String str12 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendPrimary("\ufeffhi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ufeff" + "'", str12, "\ufeff");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("hi!a\000hi!a", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("??\000h\000i\000!\000a");
        char char12 = doubleMetaphone0.charAt("\u6148", (int) '\u0a01');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        char char19 = doubleMetaphone0.charAt("hi!", (int) '\ufeff');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        byte[] byteArray24 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a\000hi!a");
        java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) "hi!a\000hi!a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\ufffd' + "'", char22 == '\ufffd');
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("#i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2300\u6900" + "'", str2, "\u2300\u6900");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6869\u2161");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f" + "'", str3, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "??" + "'", str4, "??");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        boolean boolean24 = doubleMetaphoneResult14.isComplete();
        java.lang.String str25 = doubleMetaphoneResult14.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!?4: java.io.UnsupportedEncodingException: hi!?4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate("ai");
        boolean boolean11 = doubleMetaphoneResult4.isComplete();
        java.lang.String str12 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ai" + "'", str12, "ai");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u6800\u6900\u2100\u6100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6800\u6900\u2100\u6100" + "'", str2, "\ufffd\u6800\u6900\u2100\u6100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdh\000i\000!\000a\000" + "'", str3, "\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufdffhi!a" + "'", str4, "\ufdffhi!a");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000\376\377\000h\000i\000!\000a", "\ufffd\u2300\u6900");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("4H\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52, (byte) 0, (byte) 72, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        java.lang.String str14 = doubleMetaphone0.encode("\u6148");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ai");
        int int17 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a\000hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a\000hi!a" + "'", str2, "hi!a\000hi!a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!\000a\000\000\000h\000i\000!\000a" + "'", str3, "\000h\000i\000!\000a\000\000\000h\000i\000!\000a");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        char char9 = doubleMetaphone0.charAt("\u6800\u6900\u2100\u2300\u4861\000", (int) '#');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\001d\n\001\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("a \000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6120\ufffd" + "'", str2, "\u6120\ufffd");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str10 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendAlternate('4');
        doubleMetaphoneResult9.append("hi!\000", "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        doubleMetaphoneResult9.append("4", "\ufdff\ufdff\000\u0100\000\u6400\000\u0a00\000\u0100\000\u0a00");
        java.lang.String str19 = doubleMetaphoneResult9.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult2.append("i");
        doubleMetaphoneResult2.appendPrimary("\000\000h\000i\000!\000a\000");
        java.lang.String str7 = doubleMetaphoneResult2.getPrimary();
        doubleMetaphoneResult2.appendAlternate('#');
        java.lang.String str10 = doubleMetaphoneResult2.getPrimary();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i\000\000h\000i\000!\000a\000" + "'", str7, "i\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "i\000\000h\000i\000!\000a\000" + "'", str10, "i\000\000h\000i\000!\000a\000");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        doubleMetaphoneResult16.append("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "19) test2302(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
// flaky "4) test2302(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275" + "'", str2, "??\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000\000\u6100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("a \000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a \000" + "'", str2, "a \000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6120\ufffd" + "'", str3, "\u6120\ufffd");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.append("\ufffd", "\000h\000i\000!\000a");
        doubleMetaphoneResult4.append('\346');
        doubleMetaphoneResult4.append('\277');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\377\375", "", false);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000H", "\ufffd\u4800", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!" + "'", str2, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!" + "'", str4, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000h\000i\000!" + "'", str5, "\000h\000i\000!");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd", "h\000i\000!\000\000\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000a\000H", "\ufffd\ufffd\ufffd\ufffd\000H");
        byte[] byteArray12 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#\376\377\000h\000i\000\u6869");
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "#\376\377\000h\000i\000\u6869");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\u0164\u0a01\ufffd\000");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky "20) test2309(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 35, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 104, (byte) 105 });
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????h???i???!???a?: java.io.UnsupportedEncodingException: ??????h???i???!???a?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!a" + "'", str2, "hi!a");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("a \000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6120\ufffd" + "'", str2, "\u6120\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a \000" + "'", str3, "a \000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6120\ufffd" + "'", str4, "\u6120\ufffd");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("i");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffdaH", "\u3f3f\u3f00", true);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        char char6 = doubleMetaphone0.charAt("", (int) (byte) 10);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("#aa", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone24.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone24.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str29 = doubleMetaphoneResult28.getAlternate();
        doubleMetaphoneResult28.append('#');
        doubleMetaphoneResult28.appendAlternate('\000');
        doubleMetaphoneResult28.appendAlternate("\u3f3f");
        doubleMetaphoneResult28.append('\u6148');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult28);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 0, (byte) 97, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H\000a\000" + "'", str2, "H\000a\000");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) '?');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000", false);
        char char11 = doubleMetaphone0.charAt("\376\377\000H", (int) (byte) 10);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000\u6800\u6900\u2100\u6100\u2000", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean13 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!a", "\u6800\u6900\u2100");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "\u6800\u6900\u2100");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("h\000i\000!\000", "\376\377\000h\000i\000!\000a", true);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000H\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!\000\000\376\377\000h\000i\000!\000a", "\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????: java.io.UnsupportedEncodingException: ???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult9.append('i');
        doubleMetaphoneResult9.append('\346', '\u010a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen(35);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("4\000\u6148a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "21) test2323(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 52, (byte) 97, (byte) 72, (byte) 0, (byte) 97 });
// flaky "5) test2323(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\0004\000\000\000i\0004aH\000a" + "'", str2, "\ufffd\ufffd\0004\000\000\000i\0004aH\000a");
// flaky "2) test2323(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\0004\000\000\000i\0004aH\000a" + "'", str3, "\376\377\0004\000\000\000i\0004aH\000a");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        java.lang.String str25 = doubleMetaphone0.encode("4\000\u6148a");
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("\u3f3fi #");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("#\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#\000" + "'", str3, "#\000");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        doubleMetaphoneResult28.appendAlternate("\303\276\303\277\000\303\246\000\302\205\000\302\210");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6148");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 97, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377aH" + "'", str2, "\376\377aH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6148" + "'", str3, "\u6148");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6148" + "'", str4, "\u6148");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u0164\u0a01\ufffd\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) -3, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6401\u010a\ufdff\000" + "'", str2, "\u6401\u010a\ufdff\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6401\u010a\ufdff\000" + "'", str3, "\u6401\u010a\ufdff\000");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000", "\376\377\000\346\000\205\000\210", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult15.appendPrimary('\ufeff');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\u3f3f");
        doubleMetaphoneResult4.append('\ufeff', '\u6148');
        java.lang.String str15 = doubleMetaphoneResult4.getAlternate();
        boolean boolean16 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#\000\u3f3f\u6148" + "'", str15, "#\000\u3f3f\u6148");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\u3f3f");
        doubleMetaphoneResult4.append("4");
        doubleMetaphoneResult4.appendAlternate("\ufffd\ufffd\ufffd\ufffd\000\000\000H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str12 = doubleMetaphone0.encode("Ha");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone13.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone13.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str18 = doubleMetaphoneResult17.getPrimary();
        doubleMetaphoneResult17.append('a', '4');
        doubleMetaphoneResult17.appendPrimary("H");
        doubleMetaphoneResult17.append(' ', ' ');
        doubleMetaphoneResult17.append("", "\000h\000i\000!");
        doubleMetaphoneResult17.appendPrimary('\u6869');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd#" + "'", str2, "\ufffd\ufffd\ufffd#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uefbb\ubf23" + "'", str3, "\uefbb\ubf23");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("??H");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 72 });
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375" + "'", str3, "\377\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd" + "'", str4, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufdff" + "'", str5, "\ufdff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd" + "'", str6, "\ufffd");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffdh\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("#\376\377\000h\000i\000\u6869");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "22) test2337(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 63 });
// flaky "6) test2337(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f23\u3f21" + "'", str2, "\u3f23\u3f21");
// flaky "3) test2337(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u233f\u3f00\u6800\u6900\u213f" + "'", str3, "\u233f\u3f00\u6800\u6900\u213f");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\u3f3f\ufffd");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen((int) 'T');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\000#\000i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 35, (byte) 0, (byte) 105 });
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult8.append("h\000i\000!\000#\000Ha\000\000");
        doubleMetaphoneResult8.append("\u6100\u4800");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
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
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("aa???");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0, (byte) 97, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufe00\uff00\u6100\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufdff\ufdff\000\u0100\000\u6400\000\u0a00\000\u0100\000\u0a00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -73, (byte) -65, (byte) -17, (byte) -73, (byte) -65, (byte) 0, (byte) -60, (byte) -128, (byte) 0, (byte) -26, (byte) -112, (byte) -128, (byte) 0, (byte) -32, (byte) -88, (byte) -128, (byte) 0, (byte) -60, (byte) -128, (byte) 0, (byte) -32, (byte) -88, (byte) -128 });
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult4.appendPrimary('\000');
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffda");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000#", true);
        char char18 = doubleMetaphone0.charAt("\000h\000i\000!\000a", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6800\u6900\u2100" + "'", str2, "\ufffd\u6800\u6900\u2100");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("??\000?\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!\000 ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 32 });
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("Ha");
        java.lang.String str12 = doubleMetaphone0.encode("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000H");
        char char15 = doubleMetaphone0.charAt("\u4800\u6100", 0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\u4800' + "'", char15 == '\u4800');
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\u6148\000", "\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\u2300");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("\ufffd\uff00\ufd00\uff00\ufd00");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", true);
        char char10 = doubleMetaphone0.charAt("\uc3be\uc3bfhi!a", (int) 'i');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\377\375h\000i\000!\000", "\376\377\000h\000i\000!\000\ufeff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (short) 1, (int) (short) 100, strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", 0, (int) ' ', strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!i", (int) '#', (int) '#', strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u2300", (int) 'T', (int) '\277', strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", 26729, 0, strArray31);
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
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -73, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\267\277" + "'", str2, "\357\267\277");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdhi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????hi!a: java.io.UnsupportedEncodingException: ??????hi!a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\346\205\210" + "'", str2, "\ufeff\346\205\210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000\000\000" + "'", str3, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000\000\000" + "'", str4, "h\000i\000!\000\000\000");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("#");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2300" + "'", str2, "\u2300");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000", "\001d\n\001\ufffd\ufffd\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?d??????: java.io.UnsupportedEncodingException: ?d??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) "\uff64\u0a0a\u01ff");
        java.lang.String str11 = doubleMetaphone0.encode("hi!a\000\u6148\000");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("aHa", "\000hi!a i", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult11.append('\376', '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000", "h\000i\000!\000#\000Ha\000\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str17 = doubleMetaphone0.encode("\u6869\u2141");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!#?\000", (int) (short) 100, (int) '\ufeff', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\375\377\375\377\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000", (int) '\ufffd', (int) (byte) 10, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3fhi!a", (int) '\u3f21', (int) (byte) 100, strArray25);
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
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6921\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "23) test2368(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) -26, (byte) -92, (byte) -95, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray5);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.codec.binary.StringUtils.newString(byteArray5, "\ufdff\ufdff\000\u0100\000\u6400\000\u0a00\000\u0100\000\u0a00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???A??????A???: java.io.UnsupportedEncodingException: ???A??????A???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u0164\u0a01\ufffd" + "'", str9, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001d\n\001\n" + "'", str10, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u0164\u0a01\ufffd" + "'", str11, "\u0164\u0a01\ufffd");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str4 = doubleMetaphoneResult3.getAlternate();
        boolean boolean5 = doubleMetaphoneResult3.isComplete();
        doubleMetaphoneResult3.append("\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        doubleMetaphoneResult3.append('\u3f21', '\u010a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\001d\n\001\n", "aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\376\377\000h\000i\000!\000a", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        int int16 = doubleMetaphone0.getMaxCodeLen();
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000hi!a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6923");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 105, (byte) 33, (byte) 97 });
// flaky "24) test2373(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6921\ufffd" + "'", str2, "\u6921\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000hi!a" + "'", str3, "\000hi!a");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!", 97);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("H\000a\000");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("#a", "\u6869\u2100");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        java.lang.String str12 = doubleMetaphone0.encode("\ufffd\ufffd\ufffd\ufffd");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\377\376h\000i\000!\000", "#aa", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        char char12 = doubleMetaphone0.charAt("A", (int) ' ');
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000\000\376\377\000h\000i\000!\000a", "\ufffd\ufffd\000a\000H", false);
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        doubleMetaphoneResult14.appendPrimary('\277');
        doubleMetaphoneResult14.appendPrimary('\ufffd');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f23\u3f21");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "25) test2378(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 63 });
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("4hi!aA\346");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 52, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 65, (byte) 0, (byte) -26 });
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        doubleMetaphoneResult11.appendPrimary("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufdffhi!a");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -3, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 0, strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u4800", (int) '4', (int) (byte) 1, strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\376\377\000h\000i\000!\000a", (int) (short) -1, (int) (short) -1, strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd4", 97, (int) '?', strArray31);
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
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\346\205\210" + "'", str2, "\ufeff\346\205\210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str4, "\376\377\000\346\000\205\000\210");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str5, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str6, "\376\377\000\346\000\205\000\210");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str7, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str8, "\376\377\000\346\000\205\000\210");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u4841");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message:  : java.io.UnsupportedEncodingException:  ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 65, (byte) 72 });
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\303\277\303\276h\000i\000!\000", "\ue6a5\ua8e6\u84a1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4???: java.io.UnsupportedEncodingException: 4???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000\346\000\205\000\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000?\000?\000?" + "'", str2, "??\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f00\u3f00\u3f00" + "'", str3, "\u3f3f\u3f00\u3f00\u3f00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f???" + "'", str4, "\u3f3f???");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6968\u6121", "\u6148", false);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("4hi!a", false);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("iha!");
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AH" + "'", str18, "AH");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\001d\n\001\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\001d\n\001\n" + "'", str2, "\ufeff\001d\n\001\n");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (short) 10, (-1), strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 0, 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u3f3f\ufffd", (int) (short) 1, (int) (short) 100, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("4\000\u6148", 32, (int) (byte) 100, strArray22);
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
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2100" + "'", str2, "\u6869\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\000" + "'", str3, "hi!\000");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000?\000?\000?" + "'", str2, "??\000?\000?\000?");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("i ", false);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "\u4800\u6100");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f\u3f3fhi!a", "hi!\000", false);
        java.lang.String str30 = doubleMetaphone0.encode("\ufffd\u6900\u2000\u6900");
        java.lang.String str32 = doubleMetaphone0.encode("h\000i\000!\000a\000\000\000h\000i\000!\000a\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("Ha");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 72, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6148" + "'", str2, "\u6148");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("44ih\000i\000!\000a\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 52, (byte) 105, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0 });
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        int int16 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("???\000", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("AH");
        byte[] byteArray11 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6148\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) byteArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky "26) test2397(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 35, (byte) 63, (byte) 0 });
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("hi!");
        java.lang.String str8 = doubleMetaphoneResult4.getPrimary();
        java.lang.String str9 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("iha!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 97, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iha!" + "'", str2, "iha!");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\376\377\000h\000i\000!\000\u6148");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "27) test2400(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 63 });
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\377\375");
        char char16 = doubleMetaphone0.charAt("", 0);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffdd\001\001\n\ufffd\ufffd", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "T" + "'", str19, "T");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        byte[] byteArray11 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\376\377\000h\000i\000!\000a");
        java.lang.String str12 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray11);
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) str12);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\376\377\000h\000i\000!\000a" + "'", str12, "\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\000h\000i\000!\000a" + "'", str2, "\ufeff\000h\000i\000!\000a");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u4861");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72 });
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("H");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u4800" + "'", str2, "\ufffd\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000H" + "'", str3, "\376\377\000H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufeffH" + "'", str4, "\ufeffH");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeff\377\375\377\375", "hi!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!?: java.io.UnsupportedEncodingException: hi!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "28) test2407(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 0, (byte) 72, (byte) 0, (byte) 97, (byte) 0, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append("hi!", "hi!a");
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        java.lang.String str14 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000hi!a" + "'", str14, "\000hi!a");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u4800");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 72, (byte) 0 });
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\376\377\000h\000i\000!\000\ufeff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "29) test2410(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2300\ufdff\ufdff\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100\ufffd" + "'", str2, "\u2300\ufdff\ufdff\ufe00\uff00\000\u6800\000\u6900\000\u2100\000\u6100\ufffd");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        doubleMetaphoneResult10.appendAlternate('4');
        java.lang.String str13 = doubleMetaphoneResult10.getPrimary();
        boolean boolean14 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        char char9 = doubleMetaphone0.charAt("\u6869", (int) '\377');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f", "iha!", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000", (int) (byte) 1, 100, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\ufffd\000\ufffd\000\ufffd", (int) (byte) 10, (int) '\346', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6968\u6121", 32, (int) '\376', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a4", (int) (short) 100, (int) '\000', strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str6 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary(' ');
        doubleMetaphoneResult4.appendAlternate("ai");
        boolean boolean11 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append('a', 'i');
        doubleMetaphoneResult4.append("\000\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult4.append('4', '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("\ufeff\ufffd\u4800", "h\000i\000!\000");
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('i', '\ufeff');
        doubleMetaphoneResult7.append("4\000\376\377\000h\000i\000!\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\205\210");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -123, (byte) 0, (byte) -120 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\346\205\210" + "'", str2, "\ufeff\346\205\210");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str4, "\376\377\000\346\000\205\000\210");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str5, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\376\377\000\346\000\205\000\210" + "'", str6, "\376\377\000\346\000\205\000\210");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\346\205\210" + "'", str7, "\346\205\210");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6100\u4800" + "'", str2, "\u6100\u4800");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
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
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!a\000\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "30) test2419(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 35, (byte) 97, (byte) 72, (byte) 0, (byte) 0 });
// flaky "7) test2419(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000" + "'", str2, "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
// flaky "4) test2419(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000" + "'", str3, "\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u2300\u4861\000");
// flaky "1) test2419(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000" + "'", str4, "\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        char char14 = doubleMetaphone0.charAt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!", 97);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\377\375\377\375\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 72 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000a\000H" + "'", str2, "\376\377\000a\000H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000a\000H" + "'", str3, "\376\377\000a\000H");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "\001d\n\001\n");
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        doubleMetaphone0.setMaxCodeLen((int) '?');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeffhi!", "\ubfef\ue6bd\u80a0\ua4e6\ue280\u8084\u84e6\ufffd", false);
        char char13 = doubleMetaphone0.charAt("\000\376\377\000h\000i\000!\000a", (int) (byte) -1);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\0004", "\u3f3f???", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult7.appendPrimary('a');
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary("4H\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("4\001d\n\001\n", "#\000\u3f3f\u6148");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #???: java.io.UnsupportedEncodingException: #???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 100, (int) ' ', strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!a", (int) ' ', (int) (byte) 100, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000h\000i\000!\000a\000\000\000h\000i\000!\000#aH\000\000", 0, (int) (byte) 0, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\375\377\375\377\000\000h\000\000\000i\000\000\000!\000", (int) '\376', (int) (short) 0, strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!ahi!#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!ahi!#: java.io.UnsupportedEncodingException: hi!ahi!#");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\000h\000i\000!\000\ufeff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "31) test2428(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97, (byte) -17, (byte) -69, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000h\000i\000!\000\ufeff" + "'", str2, "\376\377\000h\000i\000!\000\ufeff");
// flaky "8) test2428(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ubec3\ubfc3\u6800\u6900\u2100\u6100\ubbef\ufffd" + "'", str3, "\ubec3\ubfc3\u6800\u6900\u2100\u6100\ubbef\ufffd");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\uff64\u0a0a\u01ff", (int) (short) 10);
        java.lang.String str14 = doubleMetaphone0.encode("hi!a4");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd\ufffdH\000", "\ufffd\u6100\u4800", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("h\000i\000!\000a\000");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        char char13 = doubleMetaphone0.charAt("hi!ii4hi!a", 32);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6869\u2161\u6921\ufffd", "\000H\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?H?a: java.io.UnsupportedEncodingException: ?H?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000\000\000" + "'", str2, "h\000i\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\000" + "'", str3, "hi!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!\000" + "'", str4, "hi!\000");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\ufffd\u6100\u4800", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\375\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000 ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 32 });
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        char char10 = doubleMetaphone0.charAt("hi!", (int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6869\u2141", "i ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\376');
        boolean boolean17 = doubleMetaphoneResult16.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufdff\ufdff\000\ufdff\000\ufdff\000\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000?\000?\000?" + "'", str2, "??\000?\000?\000?");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!\000", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message:  : java.io.UnsupportedEncodingException:  ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377aH");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 97, (byte) 0, (byte) 72, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe00\uff00\u6100\u4800" + "'", str2, "\ufe00\uff00\u6100\u4800");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\000\377\000a\000H\000" + "'", str3, "\376\000\377\000a\000H\000");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\000h\000i\000!" + "'", str2, "\u3f3f\u3f3f\u3f3f\000h\000i\000!");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100", (int) 'a', (int) (short) 100, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 100, 35, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 0, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", (int) (byte) 100, (int) (byte) 0, strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6800\u6900\u2100\u6100\000\u6800\u6900\u2100\u6100", (int) (byte) 10, 0, strArray28);
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
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("?\000?\000\000\000H\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 72, (byte) 0 });
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffda");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "32) test2444(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 63, (byte) 63, (byte) 97 });
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffdaH");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 97, (byte) 0, (byte) 72 });
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000h\000i\000!\000a");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 97 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\277\275\357\277\275\000h\000i\000!\000a" + "'", str2, "\357\277\275\357\277\275\000h\000i\000!\000a");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("aH");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("AH");
        doubleMetaphone0.setMaxCodeLen(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h\000i\000!", "\377\375");
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\uff00\ufd00\uff00\ufd00", "\ufffd\u3f00\u3f00\000\u3f00\000\u3f00\000\u3f00", true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("##4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffda");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: #??a: java.io.UnsupportedEncodingException: #??a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 35, (byte) 35, (byte) 52 });
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        doubleMetaphoneResult16.appendAlternate("hi!H");
        doubleMetaphoneResult16.appendPrimary('\u010a');
        doubleMetaphoneResult16.appendAlternate("4\000\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult16.appendAlternate('?');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '\000', (int) 'h', strArray12);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("4\376\377aH", (int) (short) 100, (int) (byte) 100, strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('#');
        doubleMetaphoneResult4.append("hi!a");
        java.lang.String str10 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#hi!a" + "'", str10, "#hi!a");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\u6120", "\ufffd\u3f00\u3f00\000\u3f00\000\u3f00\000\u3f00", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!ah\000i\000!\0004???");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0, (byte) 52, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u2161\u6800\u6900\u2100\u343f\u3f3f" + "'", str2, "\u6869\u2161\u6800\u6900\u2100\u343f\u3f3f");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("4hi!aA");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 65 });
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\303\276\303\277\000\303\246\000\302\205\000\302\210");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\277");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000A");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 65 });
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000a\000H", "\ufffd\ufffd\ufffd\ufffd\000H");
        byte[] byteArray12 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("#\376\377\000h\000i\000\u6869");
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "#\376\377\000h\000i\000\u6869");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\u0164\u0a01\ufffd\000");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("?\001d\n\001\n");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky "33) test2461(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 35, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 104, (byte) 105 });
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "T" + "'", str17, "T");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) (byte) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '\000', 0, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'i', (int) '#', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6148", (int) (byte) 10, (int) (byte) 10, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6869\u2161", (int) (short) 1, 0, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\u6120\ufffd", (int) '\ubf61', 100, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\000\377\000\000\000h\000\000\000i\000\000\000!\000\000\000a\000", (int) '\346', (int) (byte) 0, strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6800\u6900\u2100\u2300\u4861\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128, (byte) -30, (byte) -116, (byte) -128, (byte) -28, (byte) -95, (byte) -95, (byte) 0 });
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6968\u6121");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -26, (byte) -124, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult9.append('\376');
        java.lang.String str12 = doubleMetaphoneResult9.getAlternate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\376" + "'", str12, "\376");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u2300\u6900");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "34) test2468(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 72, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375" + "'", str3, "\377\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd" + "'", str4, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\377\375" + "'", str5, "\377\375");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffd" + "'", str6, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\377\375" + "'", str7, "\377\375");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\u2123\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -30, (byte) -124, (byte) -93, (byte) -29, (byte) -68, (byte) -128 });
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u3f00\u3f00\000\u3f00\000\u3f00\000\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\u3f3f", true);
        char char14 = doubleMetaphone0.charAt("\000\376\377\000h\000i\000!\000a", (int) (byte) 10);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\ufffd#", "\357\277\275\357\277\275\000h\000\000\000i\000\000\000!\000\000");
        char char20 = doubleMetaphone0.charAt("aHa", (int) '\000');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'a' + "'", char14 == 'a');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'a' + "'", char20 == 'a');
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("", (int) '\ufffd');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(26729);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("4\001d\n\001\n", "\u6869\u2161");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "h\000i\000!\000", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("??\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275", "\ufffd\ufffd\000h\000i\000!\000a", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!a4");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 97, (byte) 52 });
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufe00\uff00\u6100\u4800");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -72, (byte) -128, (byte) -17, (byte) -68, (byte) -128, (byte) -26, (byte) -124, (byte) -128, (byte) -28, (byte) -96, (byte) -128 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ub8ef\uef80\u80bc\u84e6\ue480\u80a0" + "'", str2, "\ub8ef\uef80\u80bc\u84e6\ue480\u80a0");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("hi!a\000\u0164\u0a01\ufffd", "\000\000\000h\000\000\000i\000\000\000!\000\000\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???h???i???!???a: java.io.UnsupportedEncodingException: ???h???i???!???a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\ue6a1\ua9e2\u85a1\u68e6\ua4a1\uefbf\ufffd");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(4);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd\ufffd\000a\000H", "\u3f3f\u3f3f\u3f3f\000h\000i\000!");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("#");
        java.lang.String str14 = doubleMetaphone0.encode("\000hi!a ");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray5);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray5);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray5);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0164\u0a01\ufffd" + "'", str6, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\n\001\n" + "'", str7, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001d\n\001\n" + "'", str8, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u0164\u0a01\ufffd" + "'", str9, "\u0164\u0a01\ufffd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001d\n\001\n" + "'", str10, "\001d\n\001\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6401\u010a\ufffd" + "'", str11, "\u6401\u010a\ufffd");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\u6968\u6121");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("i ", "\001d\n\001\n");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000#\000\000??aH", "hi!\0004i");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\u6148", false);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\ufeff\001d\n\001\n");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\377\375h\000i\000!\000", "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000a", true);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\376\377\000h\000i\000!\000a", "\ubec3\ubfc3\uc300\246\u85c2\uc200\ufdff", true);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("hi!h\000i\000!\0004", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "T" + "'", str11, "T");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        doubleMetaphone0.setMaxCodeLen(97);
        java.lang.String str31 = doubleMetaphone0.encode("\u6869");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
// flaky "35) test2484(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6148\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "36) test2485(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 35, (byte) 63, (byte) 0 });
// flaky "9) test2485(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#?\000" + "'", str2, "hi!#?\000");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\375\377\375\377\375\377\375\377\375\377\375\377\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000", "\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("aH#", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000h\000\000\000i\000\000\000!\000\000\000\ufffd\ufffd", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd\000\000", "???", false);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\303\277\303\275\303\277\303\275");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("4#");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 52, (byte) 35 });
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("", "\376\377\000h\000i\000!\000a");
        doubleMetaphoneResult7.appendPrimary('\u6869');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str5 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("hi!", "");
        doubleMetaphoneResult4.append('\000', '4');
        doubleMetaphoneResult4.append("\ufffd\ufffd\000H");
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append("\u0164\u0a01\ufffd");
        java.lang.String str17 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "37) test2491(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!\000\ufffd\ufffd\000\u0164\u0a01\ufffd" + "'", str17, "hi!\000\ufffd\ufffd\000\u0164\u0a01\ufffd");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd", "\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000\000\u6100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????: java.io.UnsupportedEncodingException: ????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000\001\000d\000\n\000\001\000\n");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "4\000\376\377\000h\000i\000!\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4??y??h?i?!?a: java.io.UnsupportedEncodingException: 4??y??h?i?!?a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000\001\000d\000\n\000\001\000\n" + "'", str2, "??\000\001\000d\000\n\000\001\000\n");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) (byte) 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, (int) (short) 1, strArray18);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), 4, strArray18);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\ufffd\u4800", (int) (short) 100, (int) (byte) 1, strArray18);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\376\000\377\000a\000H\000", (int) '\u010a', (int) (short) 0, strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ubbef\u23bf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -69, (byte) -17, (byte) 35, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\273\357#\277" + "'", str2, "\273\357#\277");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str13 = doubleMetaphone0.encode("A");
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("#\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\346');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'i' + "'", char3 == 'i');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u6900\u2000\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -128, (byte) -128, (byte) -26, (byte) -92, (byte) -128 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6900\u2000\u6900" + "'", str2, "\ufffd\u6900\u2000\u6900");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufeff#", "\uc3be\uc3bfhi!a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\ufffd');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }
}
