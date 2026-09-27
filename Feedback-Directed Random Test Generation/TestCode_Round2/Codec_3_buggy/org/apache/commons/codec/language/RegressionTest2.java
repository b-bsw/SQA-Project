package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "H");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("hi!i", true);
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str18 = doubleMetaphone0.encode("\000 a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        char char16 = doubleMetaphone0.charAt("\000a4h", (-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult18.append('h', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000aa4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        java.lang.String str15 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("a4\000a", "");
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("\000a\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000a" + "'", str15, "\000a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000aa4" + "'", str19, "\000aa4");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append('4', '\000');
        doubleMetaphoneResult8.append('h', '4');
        doubleMetaphoneResult8.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000aA\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000aA", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "H4a\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str16 = doubleMetaphone0.encode("H44");
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a4 ", false);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\0004a4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        int int13 = doubleMetaphone0.maxCodeLen;
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.appendPrimary("4#");
        doubleMetaphoneResult8.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        int int16 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(105);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\0004#", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000\000", true);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "\000a44");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str16 = doubleMetaphone0.encode("aH");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        boolean boolean24 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("H4a\000");
        doubleMetaphoneResult8.appendPrimary("4a4\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) -1;
        java.lang.Class<?> wildcardClass12 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append("");
        doubleMetaphoneResult10.appendAlternate('4');
        java.lang.String str20 = doubleMetaphoneResult10.getAlternate();
        boolean boolean21 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append("H", "\000a4");
        doubleMetaphoneResult10.appendAlternate('i');
        java.lang.String str22 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("#H", "\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) -1;
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        boolean boolean24 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendAlternate('h');
        boolean boolean29 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str9 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.append('i', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        doubleMetaphone0.maxCodeLen = 35;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode(obj17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = doubleMetaphone0.doubleMetaphone("#\000", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult12.appendPrimary('4');
        doubleMetaphoneResult12.append("\000\000", "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.appendPrimary("hi!");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ahi" + "'", str18, "\000ahi");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000ahi" + "'", str19, "\000ahi");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000", false);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "4\000\000\000");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.maxCodeLen;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aa\000", "\000a4\000", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        java.lang.Class<?> wildcardClass14 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        char char14 = doubleMetaphone0.charAt(" \0004", 97);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a4", "\0004a", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        int int13 = doubleMetaphone0.maxCodeLen;
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("#", false);
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000#\000aa4", "#\000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4 ");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.append("\000aA", "\000a#\000");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        java.lang.String str22 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str23 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!\000" + "'", str22, "hi!\000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!\000" + "'", str23, "hi!\000");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        java.lang.String str7 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(105);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("\000");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aHa");
        char char24 = doubleMetaphone0.charAt("", (int) '4');
        char char27 = doubleMetaphone0.charAt("a4\000a", (int) 'i');
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("4");
        java.lang.Class<?> wildcardClass32 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate('h');
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.append("4H", "H44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a4h" + "'", str17, "\000a4h");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000a4 ", false);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.encode("i");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult13.appendPrimary("a");
        doubleMetaphoneResult13.appendAlternate('a');
        doubleMetaphoneResult13.append("4H");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        java.lang.String str14 = doubleMetaphoneResult10.getPrimary();
        doubleMetaphoneResult10.append('#');
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.String[] strArray19 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("a4\000a", (-1), (int) (short) 1, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '#', (int) (byte) -1, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000\000", 100, (-1), strArray19);
        java.lang.Class<?> wildcardClass25 = strArray19.getClass();
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("4#");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('#', 'h');
        doubleMetaphoneResult8.appendPrimary("\000\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H4a4" + "'", str18, "H4a4");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "H");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000\000\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH\000", "\000a#");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult21.append('a', '4');
        java.lang.Class<?> wildcardClass25 = doubleMetaphoneResult21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str11 = doubleMetaphone0.encode("\000\000\000");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("4hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000aA\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('h', 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000aA" + "'", str17, "\000\000aA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000\000aA" + "'", str18, "\000\000aA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000aA" + "'", str19, "\000\000aA");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\000a4h", " Ai");
        doubleMetaphoneResult7.append('i', 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('\000');
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000" + "'", str16, "\000\000");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        int int18 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int20 = doubleMetaphone19.maxCodeLen;
        java.lang.String str22 = doubleMetaphone19.doubleMetaphone("");
        boolean boolean26 = doubleMetaphone19.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean29 = doubleMetaphone19.isDoubleMetaphoneEqual("hi!", "H");
        int int30 = doubleMetaphone19.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone19.new DoubleMetaphoneResult(97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 10;
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("\000");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aHa");
        char char24 = doubleMetaphone0.charAt("", (int) '4');
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000a", "\000a4\000", true);
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000a", "#", false);
        int int33 = doubleMetaphone0.maxCodeLen;
        java.lang.String str36 = doubleMetaphone0.doubleMetaphone("hi!i", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4H", 1, (int) (short) 1, strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aAi", (int) (short) 0, (int) (byte) 1, strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('a', 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH\000", "\000a#");
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.encode("\000#");
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.append("\0004", "\000aA");
        doubleMetaphoneResult8.append("\000ah", "4H");
        doubleMetaphoneResult8.append("\000\000");
        doubleMetaphoneResult8.append('h', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\000a4", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000\0004#", true);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual(" h\000a", "\000\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append(" h\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(32);
        char char12 = doubleMetaphone0.charAt("\000a4\000", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult17.append("hi!4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str22 = doubleMetaphoneResult21.getAlternate();
        java.lang.String str23 = doubleMetaphoneResult21.getAlternate();
        doubleMetaphoneResult21.append("hi!");
        doubleMetaphoneResult21.appendPrimary("\000\0004#");
        doubleMetaphoneResult21.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("");
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("A", "4");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("#");
        doubleMetaphoneResult8.append("\000aH");
        java.lang.String str26 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aA" + "'", str21, "\000aA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000aA#" + "'", str26, "\000aA#");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), (int) 'a', strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) ' ', strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aha", (int) (short) 0, 52, strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "\000");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        int int16 = doubleMetaphone0.getMaxCodeLen();
        char char19 = doubleMetaphone0.charAt("\000", 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "\000", true);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "4");
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.lang.String[] strArray25 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("a4\000a", (-1), (int) (short) 1, strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '#', (int) (byte) -1, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000\000", 100, (-1), strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4#", (int) ' ', (int) (short) -1, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hi!", (int) ' ', (-1), strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        java.lang.String str13 = doubleMetaphone0.encode("\000\0004#");
        doubleMetaphone0.maxCodeLen = 97;
        int int16 = doubleMetaphone0.maxCodeLen;
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "H", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.encode("\000#");
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult11.append("\000a\000a", "hi!");
        doubleMetaphoneResult11.appendAlternate("4hi");
        doubleMetaphoneResult11.append("\000\0004#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000a4", true);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        char char25 = doubleMetaphone0.charAt("\000aH", 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("\000aa");
        doubleMetaphoneResult8.append("\000a#", "#H\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH", "\000aha", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult9.appendPrimary('i');
        doubleMetaphoneResult9.append("#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = doubleMetaphone0.doubleMetaphone("4a4\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.encode("\000#");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\000");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "aH");
        doubleMetaphone0.setMaxCodeLen(105);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        java.lang.String str29 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("\000\000A");
        doubleMetaphoneResult8.append("\000#");
        java.lang.String str34 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000a\0004" + "'", str29, "\000a\0004");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\000a4h" + "'", str34, "\000a4h");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.append('\000', ' ');
        doubleMetaphoneResult4.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000a");
        char char17 = doubleMetaphone0.charAt("\000\000a\000", 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append(' ', '\000');
        doubleMetaphoneResult7.append("4hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append('H');
        doubleMetaphoneResult8.appendPrimary("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("i", "\000a4 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        java.lang.String str17 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.appendPrimary("\000a\0004");
        doubleMetaphoneResult10.append('\000', '#');
        doubleMetaphoneResult10.append('4', ' ');
        doubleMetaphoneResult10.appendPrimary("4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        java.lang.String str11 = doubleMetaphone0.encode("hi!");
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "\000a4H");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "");
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A" + "'", obj13, "A");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        java.lang.String str11 = doubleMetaphone0.encode("\000a4");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a\000A", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        char char11 = doubleMetaphone0.charAt("\000a44", 10);
        java.lang.String str13 = doubleMetaphone0.encode("\000a\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\0004a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", (int) '#', 100, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 105, 32, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000aA", (int) '#', 97, strArray23);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4h" + "'", str21, "\000a4h");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\0004");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = doubleMetaphone15.maxCodeLen;
        java.lang.String str18 = doubleMetaphone15.doubleMetaphone("");
        boolean boolean22 = doubleMetaphone15.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str24 = doubleMetaphone15.doubleMetaphone("");
        int int25 = doubleMetaphone15.maxCodeLen;
        java.lang.String str27 = doubleMetaphone15.doubleMetaphone("H");
        doubleMetaphone15.maxCodeLen = (short) -1;
        int int30 = doubleMetaphone15.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) int30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        java.lang.String str15 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("a4\000a", "");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000a" + "'", str15, "\000a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a" + "'", str19, "\000a");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.String[] strArray16 = new java.lang.String[] { "\000", "hi!", "\000h", "a" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 4, 4, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#4", (int) (byte) 1, (int) 'i', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#", 32, 52, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000\000", 35, (int) 'h', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\000", "hi!", "\000h", "a" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str9 = doubleMetaphone0.encode("\000aA");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "a");
        doubleMetaphone0.setMaxCodeLen((-1));
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.encode("");
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.append('a', 'h');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendAlternate('\000');
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.appendAlternate("\0004\000");
        doubleMetaphoneResult8.appendAlternate("aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.appendAlternate("\000a\000a");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.append('i', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 10, 100, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 105, (int) (short) 100, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, 105, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a#", 97, 10, strArray23);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult12.append('#');
        java.lang.Class<?> wildcardClass15 = doubleMetaphoneResult12.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.append("aH");
        doubleMetaphoneResult7.append("4##i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("");
        doubleMetaphone10.setMaxCodeLen(100);
        boolean boolean21 = doubleMetaphone10.isDoubleMetaphoneEqual("\000a", "H");
        java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) "H");
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("4hi!", "\000\000A");
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone(" \0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult9.appendPrimary('i');
        boolean boolean12 = doubleMetaphoneResult9.isComplete();
        doubleMetaphoneResult9.append("a", "4\000a");
        doubleMetaphoneResult9.append("aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("\000");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aHa");
        char char24 = doubleMetaphone0.charAt("", (int) '4');
        char char27 = doubleMetaphone0.charAt("a4\000a", (int) 'i');
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("");
        int int30 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(32);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult11.appendAlternate('h');
        doubleMetaphoneResult11.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        int int18 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000a4", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphone0.maxCodeLen = 'i';
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "4hi!", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H", false);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append("4#\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.appendAlternate("\000aAi");
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        int int13 = doubleMetaphone0.maxCodeLen;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000\000");
        java.lang.String str17 = doubleMetaphone0.encode("4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000\000");
        int int19 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("4#A", "\000a4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4h", "AH", false);
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("4#4", true);
        java.lang.String str26 = doubleMetaphone0.encode("\000h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        int int15 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        doubleMetaphone0.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\000", "H4H");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\000aA", 0);
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        doubleMetaphoneResult13.append('H');
        doubleMetaphoneResult13.appendAlternate("4##i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a#", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("4##", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.Class<?> wildcardClass13 = doubleMetaphoneResult12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        java.lang.String str15 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000 a", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA", (int) '4', (int) ' ', strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'h', (int) (short) -1, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (short) 10, (int) '\000', strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aa\000", (int) (short) -1, (int) (byte) 100, strArray23);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.append('4', 'a');
        doubleMetaphoneResult8.appendPrimary('#');
        java.lang.String str24 = doubleMetaphoneResult8.getAlternate();
        boolean boolean25 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000aH\000" + "'", str24, "\000aH\000");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        int int11 = doubleMetaphone0.maxCodeLen;
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000aAi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a\000a" + "'", str21, "\000a\000a");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        int int22 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str25 = doubleMetaphoneResult24.getPrimary();
        doubleMetaphoneResult24.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendAlternate("\0004");
        doubleMetaphoneResult8.append(' ', '4');
        doubleMetaphoneResult8.append("H4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = 4;
        doubleMetaphone0.maxCodeLen = 'i';
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        doubleMetaphone0.maxCodeLen = '\000';
        java.lang.String str9 = doubleMetaphone0.encode("\000a\0004");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.appendPrimary("\000a4");
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000a4" + "'", str20, "\000a4");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44", "\000a\000A");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "\000a4\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.lang.String[] strArray34 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray34);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray34);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) 'i', strArray34);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000", 0, (int) (byte) 1, strArray34);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000a", 10, (int) (short) 100, strArray34);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000#", 32, (int) (byte) 100, strArray34);
        boolean boolean41 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a 4", (int) 'a', (int) (byte) 100, strArray34);
        boolean boolean42 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 32, 100, strArray34);
        boolean boolean43 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'h', (int) (short) 0, strArray34);
        boolean boolean44 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'h', 105, strArray34);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        char char20 = doubleMetaphone0.charAt("H4a", (int) (byte) -1);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("# 4", "aH\000\000\000aH\0004");
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str9 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("");
        java.lang.String str12 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendPrimary("\000aa");
        doubleMetaphoneResult8.append("\000aA");
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendPrimary("4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("\000");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aHa");
        doubleMetaphone0.maxCodeLen = 32;
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult12.appendAlternate('4');
        java.lang.String str15 = doubleMetaphoneResult12.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("\000\000");
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a", true);
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult15.append('4');
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\000a4h");
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aa", false);
        char char26 = doubleMetaphone0.charAt("\000ah", 0);
        java.lang.String str28 = doubleMetaphone0.encode("\000a\000");
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a#", "aH", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult15.append("\000a# ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = '4';
        int int12 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("4hi!", "H4a4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('i');
        doubleMetaphoneResult8.append("H", "\000aH\000");
        doubleMetaphoneResult8.appendAlternate('i');
        java.lang.String str32 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000a4 " + "'", str32, "\000a4 ");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        java.lang.String str15 = doubleMetaphone0.encode("\000#");
        int int16 = doubleMetaphone0.maxCodeLen;
        char char19 = doubleMetaphone0.charAt("\0004", (int) 'H');
        doubleMetaphone0.setMaxCodeLen(105);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        int int23 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 105 + "'", int22 == 105);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 105 + "'", int23 == 105);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult9.appendPrimary('i');
        boolean boolean12 = doubleMetaphoneResult9.isComplete();
        doubleMetaphoneResult9.append("a", "4\000a");
        doubleMetaphoneResult9.append("\000a 4", "\000aAi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.appendAlternate("");
        boolean boolean20 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append(' ', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a", true);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4#4i", "\000aH4", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        java.lang.String str29 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("\000\000A");
        doubleMetaphoneResult8.append("\000#");
        doubleMetaphoneResult8.appendPrimary('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000a\0004" + "'", str29, "\000a\0004");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\000aA", 0);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\000a\000", " Ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.append("\000a");
        doubleMetaphoneResult8.append(" h\000a");
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a#", "4hi!", true);
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str14 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.append('h');
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000h" + "'", str16, "\000h");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("");
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("A", "4");
        doubleMetaphoneResult8.appendPrimary("4#");
        doubleMetaphoneResult8.append("4H", "\0004a");
        doubleMetaphoneResult8.appendAlternate("4h");
        doubleMetaphoneResult8.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        boolean boolean15 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        int int16 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "\000a\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult21.appendPrimary("\000a#");
        java.lang.String str24 = doubleMetaphoneResult21.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a#" + "'", str24, "\000a#");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 10, 100, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 105, (int) (short) 100, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("i", 97, 10, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\0004a", (int) ' ', (int) '4', strArray23);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 10, (int) (short) -1, strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendPrimary("\000a#\000");
        doubleMetaphoneResult8.append("\000\000", "\000h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        boolean boolean19 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000", "A");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.appendAlternate("#H");
        java.lang.String str24 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str25 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000A" + "'", str24, "\000a\000A");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a\000" + "'", str25, "\000a\000");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        char char18 = doubleMetaphone0.charAt("\000a", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult20.append('4');
        doubleMetaphoneResult20.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("\000a4 ");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("#H\000a4h", "#H\000a4h", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000a4 ", false);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("4#4i", "\000a\000A");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str15 = doubleMetaphone0.encode("\000a#\000");
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone(" Ai");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44", "ia", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('a');
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("hi!i");
        doubleMetaphoneResult8.append("\000a44");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("hi!\000", "H");
        doubleMetaphoneResult8.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000 a" + "'", str16, "\000 a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a\000a" + "'", str21, "\000a\000a");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('i', 'i');
        doubleMetaphoneResult8.append("\0004\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H4a\000" + "'", str18, "H4a\000");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        char char16 = doubleMetaphone0.charAt("4", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '4' + "'", char16 == '4');
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult11.append("\000a\000a", "hi!");
        doubleMetaphoneResult11.append('i', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean11 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.append('i', 'i');
        doubleMetaphoneResult10.append('a');
        java.lang.String str17 = doubleMetaphoneResult10.getPrimary();
        boolean boolean18 = doubleMetaphoneResult10.isComplete();
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ia" + "'", str17, "ia");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.append("\000a");
        doubleMetaphoneResult8.append(" h\000a");
        doubleMetaphoneResult8.append("\000a\000a", "\000\0004#");
        doubleMetaphoneResult8.append('a', 'h');
        doubleMetaphoneResult8.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("a4\000a", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        boolean boolean15 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000aHa");
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000a\000\000", false);
        int int15 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult17.appendAlternate("hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "\000aA\000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'H');
        doubleMetaphoneResult7.appendAlternate(" h\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphoneResult17.appendAlternate("#H");
        doubleMetaphoneResult17.append('4', '\000');
        doubleMetaphoneResult17.append("H4a\000");
        doubleMetaphoneResult17.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        int int12 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("4H", true);
        doubleMetaphone0.maxCodeLen = (short) 1;
        doubleMetaphone0.setMaxCodeLen((int) '4');
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("\000#\000aa4", "4", false);
        java.lang.String str27 = doubleMetaphone0.encode("4\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('h', '#');
        doubleMetaphoneResult8.append('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000", "A");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.appendAlternate("#H");
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append('H', '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000" + "'", str24, "\000a\000");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray29);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray29);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 10, 100, strArray29);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 105, (int) (short) 100, strArray29);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, 105, strArray29);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("AH", (int) (byte) 1, (int) (short) 1, strArray29);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000\000", 35, (int) '\000', strArray29);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aAh", (int) 'a', (int) (short) -1, strArray29);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        doubleMetaphoneResult15.appendAlternate(' ');
        doubleMetaphoneResult15.appendAlternate("AH");
        doubleMetaphoneResult15.append('i');
        doubleMetaphoneResult15.append('4');
        doubleMetaphoneResult15.append('H', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aA", "\000a4h");
        doubleMetaphoneResult8.appendAlternate("# 4");
        doubleMetaphoneResult8.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.appendAlternate("");
        java.lang.Class<?> wildcardClass13 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H", false);
        char char17 = doubleMetaphone0.charAt("aH", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = ' ';
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\0004#", "\000aa", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary('h');
        doubleMetaphoneResult8.append("\000\000A");
        java.lang.Class<?> wildcardClass28 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult9.append('4', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.appendAlternate('i');
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append('h', 'h');
        doubleMetaphoneResult8.append("\000#\000aa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aA", "\000a4h");
        doubleMetaphoneResult8.append("", "\000a\000a");
        doubleMetaphoneResult8.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        doubleMetaphone0.maxCodeLen = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "\000a\0004");
        char char12 = doubleMetaphone0.charAt("\000h", 1);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004a", "", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'h' + "'", char12 == 'h');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.append("4##i", "");
        doubleMetaphoneResult8.appendAlternate("\000a4 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H4a" + "'", str16, "H4a");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000a");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000aa");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.append("\000a#", "\000h");
        doubleMetaphoneResult9.appendAlternate("4#");
        doubleMetaphoneResult9.appendAlternate("\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult12.appendPrimary('#');
        java.lang.String str15 = doubleMetaphoneResult12.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000aA");
        doubleMetaphone0.setMaxCodeLen(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult14.append("4#", "\000aA\000");
        boolean boolean18 = doubleMetaphoneResult14.isComplete();
        doubleMetaphoneResult14.append('H', 'i');
        java.lang.String str22 = doubleMetaphoneResult14.getAlternate();
        doubleMetaphoneResult14.append('a', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000aA\000i" + "'", str22, "\000aA\000i");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("4#A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\0004" + "'", str19, "\000a\0004");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.lang.String[] strArray19 = new java.lang.String[] { "\000", "hi!", "\000h", "a" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 4, 4, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#4", (int) (byte) 1, (int) 'i', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#", 32, 52, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000a", 100, (int) '#', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a\000", 1, 35, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "\000", "hi!", "\000h", "a" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("");
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("A", "4");
        doubleMetaphoneResult8.appendPrimary("4#");
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append('\000', '#');
        doubleMetaphoneResult10.append("\000\000\000");
        java.lang.String str23 = doubleMetaphoneResult10.getPrimary();
        doubleMetaphoneResult10.append('4', '4');
        doubleMetaphoneResult10.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('a');
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('H');
        doubleMetaphoneResult8.appendAlternate("aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000 a" + "'", str16, "\000 a");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult13.appendAlternate("\000ahi");
        doubleMetaphoneResult13.appendAlternate("# 4");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        int int11 = doubleMetaphone0.maxCodeLen;
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("#");
        int int14 = doubleMetaphone0.maxCodeLen;
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('i');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("\000a#\000", "4\000aH");
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('4', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000\000\000", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        char char18 = doubleMetaphone0.charAt("4#\000a", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult11.append("\000ah", "\000a4");
        doubleMetaphoneResult11.append("\0004");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean11 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.append('i', 'i');
        doubleMetaphoneResult10.append('a');
        java.lang.String str17 = doubleMetaphoneResult10.getPrimary();
        java.lang.String str18 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ia" + "'", str17, "ia");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ia" + "'", str18, "ia");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004\000", "hi! ", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult13.appendPrimary('a');
        doubleMetaphoneResult13.append("\0004\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 'a';
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('h', 'a');
        doubleMetaphoneResult8.appendAlternate('#');
        boolean boolean22 = doubleMetaphoneResult8.isComplete();
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000a", "", false);
        int int10 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aA", "\000a4h");
        doubleMetaphoneResult8.appendAlternate("AH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\0004", (int) '\000');
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "\000a\000\000");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("4#", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000aA\000");
        doubleMetaphoneResult8.appendAlternate("\000aAi");
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.append("\000a4H");
        doubleMetaphoneResult8.append("");
        boolean boolean31 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000ah", false);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ahi", "4#\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        doubleMetaphone0.maxCodeLen = 105;
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.appendPrimary("4#");
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendPrimary("\000ahi");
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("\000a4#");
        doubleMetaphoneResult8.appendPrimary("hi!\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000aH4" + "'", str24, "\000aH4");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('#');
        doubleMetaphoneResult8.append("\000", "aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4 ");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.append(' ', ' ');
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("#");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("4H", "\000i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.append("4#", "a4\000a");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4#4i");
        doubleMetaphoneResult8.append("4#A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a\0004" + "'", str21, "\000a\0004");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult14.append("4#", "\000aA\000");
        boolean boolean18 = doubleMetaphoneResult14.isComplete();
        doubleMetaphoneResult14.append('H', 'i');
        doubleMetaphoneResult14.appendPrimary("\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone(" h\000a", true);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("AH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.appendPrimary("");
        doubleMetaphoneResult4.appendPrimary("#H");
        doubleMetaphoneResult4.appendAlternate("ia");
        doubleMetaphoneResult4.appendAlternate('\000');
        doubleMetaphoneResult4.appendAlternate("\000a4 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000a4h");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("a4\000a", true);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        doubleMetaphone0.maxCodeLen = '4';
        char char13 = doubleMetaphone0.charAt("hi!\000", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'i' + "'", char13 == 'i');
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000a4");
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000ah");
        int int20 = doubleMetaphone0.maxCodeLen;
        char char23 = doubleMetaphone0.charAt("\000aA\000", 0);
        java.lang.Class<?> wildcardClass24 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append("\000a\000");
        doubleMetaphoneResult8.append("4#", "\000aa4");
        boolean boolean28 = doubleMetaphoneResult8.isComplete();
        java.lang.String str29 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000a4h" + "'", str29, "\000a4h");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char18 = doubleMetaphone0.charAt("\000\000\000", 0);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000a44", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "\000a", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000\000");
        int int19 = doubleMetaphone0.maxCodeLen;
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("\000a4");
        doubleMetaphoneResult10.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendPrimary("\000aa");
        doubleMetaphoneResult8.append("\000aA");
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult9.append("\000a");
        doubleMetaphoneResult9.appendAlternate(" Ai");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("\000a\000\000", "\000a\000");
        doubleMetaphoneResult8.appendAlternate("4#4");
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), (int) 'a', strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) ' ', strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a44", (int) 'h', (int) 'a', strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Ai", (int) (short) 0, (int) '\000', strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hi", (int) 'h', (int) 'h', strArray26);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.appendPrimary("\000\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000", "A");
        doubleMetaphoneResult8.append("\000a\0004", "\000a\0004");
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('H');
        java.lang.String str26 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000a\000\000" + "'", str26, "\000a\000\000");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen(35);
        doubleMetaphone0.setMaxCodeLen((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = '#';
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.setMaxCodeLen(10);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000aA");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "\000a4h");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A" + "'", obj12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.appendAlternate('H');
        doubleMetaphoneResult10.appendAlternate("\000a\000a");
        doubleMetaphoneResult10.append('4', ' ');
        java.lang.String str22 = doubleMetaphoneResult10.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('a');
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("hi!i");
        doubleMetaphoneResult8.append("\000a44");
        doubleMetaphoneResult8.append("", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000 a" + "'", str16, "\000 a");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("4\000a");
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult19.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        char char10 = doubleMetaphone0.charAt("a4\000a", (int) ' ');
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.append("\000a");
        java.lang.String str25 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("\000a#\000");
        doubleMetaphoneResult8.appendAlternate("\000#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("\000aH\000");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\000a\000", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000\0004#", false);
        java.lang.Class<?> wildcardClass14 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        java.lang.String str11 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("\0004");
        java.lang.String str14 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str15 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("\000a\000h", "4\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " \0004" + "'", str14, " \0004");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendAlternate('#');
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000\000" + "'", str24, "\000a\000\000");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = '#';
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\0004", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        doubleMetaphoneResult8.appendAlternate("4#");
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        java.lang.Class<?> wildcardClass22 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\0004#" + "'", str20, "\000\0004#");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a\000a" + "'", str21, "\000a\000a");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "\000");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        java.lang.String str15 = doubleMetaphone0.encode("\000aAi");
        char char18 = doubleMetaphone0.charAt("hi!", 10);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4#\000a", "hi!\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.append('4', 'h');
        doubleMetaphoneResult8.append("\000a4H", "\000a 4");
        doubleMetaphoneResult8.appendPrimary("\000a4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        char char20 = doubleMetaphone0.charAt("H4a", (int) (byte) -1);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000a", "a4\000a", false);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("# 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.append("H");
        doubleMetaphoneResult10.append("\000a4h", "\000\000");
        doubleMetaphoneResult10.appendPrimary("4##");
        doubleMetaphoneResult10.append("\000a\000h");
        doubleMetaphoneResult10.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        char char13 = doubleMetaphone0.charAt("", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        boolean boolean18 = doubleMetaphone14.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str20 = doubleMetaphone14.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone14.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult22.append('\000');
        doubleMetaphoneResult22.append('a');
        boolean boolean27 = doubleMetaphoneResult22.isComplete();
        boolean boolean28 = doubleMetaphoneResult22.isComplete();
        doubleMetaphoneResult22.append("");
        doubleMetaphoneResult22.append("\0004", "\000aA");
        doubleMetaphoneResult22.append('a', 'H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) 'H');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("#H", "#H");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000a4", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '4', (int) (byte) 100, strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000", (int) (short) 10, 4, strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str9 = doubleMetaphone0.encode("\000aA");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 10;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000aa");
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a4\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.Class<?> wildcardClass12 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append(' ');
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("H4a");
        doubleMetaphoneResult7.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.append("\000a\000a");
        doubleMetaphoneResult8.appendAlternate("4##");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "\000a4 ");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000i", "\0004a4", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone(" \0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.appendPrimary("");
        doubleMetaphoneResult4.appendPrimary("#H");
        java.lang.String str11 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append("\000a\000a");
        java.lang.Class<?> wildcardClass14 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000ah" + "'", str11, "\000ah");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("#H");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.appendPrimary("\000a4\000");
        doubleMetaphoneResult7.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4 ");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.append(' ', ' ');
        doubleMetaphoneResult8.appendPrimary('i');
        doubleMetaphoneResult8.appendAlternate("\000a4h");
        doubleMetaphoneResult8.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 10, 100, strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 105, (int) (short) 100, strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, 105, strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, 1, strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("#\000", 104, (int) (byte) -1, strArray26);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult9.appendPrimary('i');
        doubleMetaphoneResult9.append("\000aH4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "hi!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        doubleMetaphoneResult8.appendAlternate("4#");
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("\000a4 ", "4##");
        doubleMetaphoneResult8.appendPrimary("\000a4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\0004#" + "'", str20, "\000\0004#");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('a');
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('H');
        doubleMetaphoneResult8.appendAlternate("H4a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000 a" + "'", str16, "\000 a");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.lang.String[] strArray19 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) 'i', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) -1, (int) '4', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Ai", (int) '#', 105, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.lang.String[] strArray25 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", (int) 'a', (int) (byte) 10, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", 4, (int) (byte) 10, strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000ah", (int) (short) 0, (int) 'h', strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aH", (int) (short) 10, (int) (byte) 0, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#4", (int) (short) 0, (int) 'H', strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hi!", 32, 105, strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.append("\000a");
        doubleMetaphoneResult8.append(" h\000a");
        doubleMetaphoneResult8.append("\000a\000a", "\000\0004#");
        doubleMetaphoneResult8.append('a', 'h');
        doubleMetaphoneResult8.append("\000a4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        java.lang.String str7 = doubleMetaphone0.encode("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = doubleMetaphone0.encode("\000a4H");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "hi!i");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\000\0004#");
        java.lang.Class<?> wildcardClass23 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("4\000a");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("a4\000a", "\000a\000");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("#H\000a4h", "4hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append("A", "hi!");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("4\000a");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("a4\000a", "\000a\000");
        int int20 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult10.append("4", "\000\000a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a", false);
        int int8 = doubleMetaphone0.maxCodeLen;
        char char11 = doubleMetaphone0.charAt("hi!i", 32);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("Hi4\000aH", "aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.appendAlternate("\000aAi");
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("H44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult11.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult7.appendPrimary('4');
        java.lang.String str10 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('h');
        java.lang.String str13 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.append("4#", "a4\000a");
        doubleMetaphoneResult8.append("\000aa");
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("\0004a");
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a\0004" + "'", str23, "\000a\0004");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\0004", (int) (short) 100);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\0004", true);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000aH", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.appendAlternate("\000a\000");
        doubleMetaphoneResult10.appendPrimary("\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone10.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult18.append('\000');
        java.lang.String str21 = doubleMetaphoneResult18.getPrimary();
        doubleMetaphoneResult18.append("4");
        java.lang.String str24 = doubleMetaphoneResult18.getAlternate();
        java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) str24);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "\000aA\000");
        int int31 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone32 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int33 = doubleMetaphone32.maxCodeLen;
        boolean boolean36 = doubleMetaphone32.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str38 = doubleMetaphone32.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult40 = doubleMetaphone32.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult40.append('\000');
        doubleMetaphoneResult40.append('a');
        doubleMetaphoneResult40.append("", "\000");
        java.lang.String str48 = doubleMetaphoneResult40.getPrimary();
        doubleMetaphoneResult40.append("4");
        doubleMetaphoneResult40.appendPrimary("hi!");
        doubleMetaphoneResult40.append("\000");
        doubleMetaphoneResult40.append("\000a");
        java.lang.String str57 = doubleMetaphoneResult40.getPrimary();
        doubleMetaphoneResult40.appendPrimary("\000aH");
        doubleMetaphoneResult40.appendPrimary('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = doubleMetaphone0.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000" + "'", str21, "\000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\0004" + "'", str24, "\0004");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\000a" + "'", str48, "\000a");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\000a4h" + "'", str57, "\000a4h");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.appendAlternate(' ');
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000a# ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000h" + "'", str18, "\000h");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000a");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000aa");
        char char20 = doubleMetaphone0.charAt("\000\000\000", (int) (byte) 100);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\000a 4");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a", "#H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a# ", "\000a\000A");
        doubleMetaphone0.maxCodeLen = (short) 1;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.String str14 = doubleMetaphone0.encode("H");
        int int15 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char19 = doubleMetaphone16.charAt("", (int) (byte) 10);
        java.lang.String str21 = doubleMetaphone16.doubleMetaphone("H");
        char char24 = doubleMetaphone16.charAt("", 1);
        int int25 = doubleMetaphone16.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone16.new DoubleMetaphoneResult((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.append("\0004");
        doubleMetaphoneResult8.appendPrimary("\000\0004#");
        doubleMetaphoneResult8.append('H', 'h');
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000\000\000", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendPrimary("\000\000\000");
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH", "\000\000a\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        int int23 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.encode("\000#");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\000");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "aH");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("a4\000a", "4", false);
        int int20 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.append("aH", "4#4");
        doubleMetaphoneResult13.appendPrimary("\000aHa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000aA\000");
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "4\000a");
        java.lang.String str15 = doubleMetaphone0.encode("hi!\000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("4##", (int) (byte) 10, (int) (short) 10, strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", 35, 0, strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 1, (int) (short) 0, strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000#", (int) '\000', 100, strArray26);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        boolean boolean13 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.append('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = (short) 1;
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "A", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult7.append(' ', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.appendPrimary('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        char char19 = doubleMetaphone0.charAt("4##", (int) (short) 10);
        int int20 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int22 = doubleMetaphone21.maxCodeLen;
        boolean boolean25 = doubleMetaphone21.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str27 = doubleMetaphone21.doubleMetaphone("");
        doubleMetaphone21.setMaxCodeLen(100);
        doubleMetaphone21.maxCodeLen = 'a';
        boolean boolean35 = doubleMetaphone21.isDoubleMetaphoneEqual("\000ah", "\000a\000\000", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) "\000ah");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000a");
        doubleMetaphoneResult8.appendAlternate('i');
        java.lang.String str29 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\0004a", "#\000");
        doubleMetaphoneResult8.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000a4 " + "'", str29, "\000a4 ");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        int int16 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.encode(" h\000a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult14.append('h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendAlternate("\0004");
        doubleMetaphoneResult8.append(' ', '4');
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendPrimary("\000a#\000");
        java.lang.String str30 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("\000a#");
        java.lang.Class<?> wildcardClass33 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a4 " + "'", str30, "\000a4 ");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\0004", (int) '\000');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000ah");
        char char17 = doubleMetaphone0.charAt("H4a4", (int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('#', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        doubleMetaphone0.maxCodeLen = 4;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (short) -1;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = doubleMetaphone13.maxCodeLen;
        boolean boolean17 = doubleMetaphone13.isDoubleMetaphoneEqual("hi!", "");
        int int18 = doubleMetaphone13.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone13.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult20.appendPrimary('4');
        doubleMetaphoneResult20.appendAlternate('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a 4");
        char char21 = doubleMetaphone0.charAt("4h", (int) (byte) 100);
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!4", "", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000a", true);
        java.lang.String str17 = doubleMetaphone0.encode("hi!i");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("4", true);
        int int21 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\000a4 ", (int) (byte) 1);
        doubleMetaphone0.maxCodeLen = (short) 10;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah4", "\000aA\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000ah");
        int int20 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult24.append("aH\000\000\000aH\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4H", false);
        int int8 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult13.appendAlternate('4');
        boolean boolean16 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        java.lang.String str8 = doubleMetaphone0.encode("\000a");
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("4##", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("\000aa");
        doubleMetaphoneResult8.append("4hi");
        java.lang.String str27 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000a4h" + "'", str27, "\000a4h");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        char char18 = doubleMetaphone0.charAt("\000a", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult20.append('4');
        java.lang.String str23 = doubleMetaphoneResult20.getPrimary();
        java.lang.String str24 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append("\000a\0004");
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000 \000a" + "'", str16, "\000 \000a");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000a\000\000", false);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H4a\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000', '#');
        doubleMetaphoneResult8.appendPrimary("A");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('#', '#');
        doubleMetaphoneResult8.append("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000A" + "'", str16, "\000\000A");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\000a4h");
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aa", false);
        doubleMetaphone0.maxCodeLen = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult5.append("4\000aH", "4");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        java.lang.String str13 = doubleMetaphone0.encode("\000\0004#");
        java.lang.String str15 = doubleMetaphone0.encode("4\000\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4hi!", "4\000aH", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        java.lang.String str19 = doubleMetaphone0.encode("#\000");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000A", "\000ah4", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult17.append("4#");
        doubleMetaphoneResult17.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        doubleMetaphoneResult10.append('a', 'i');
        doubleMetaphoneResult10.append('4', 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append("", "\000a4h");
        doubleMetaphoneResult10.append("\000a");
        java.lang.String str22 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("4#4i", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\000a4");
        java.lang.String str12 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("H4a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append('\000', '#');
        doubleMetaphoneResult10.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "\000a4h");
        doubleMetaphone0.setMaxCodeLen(10);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("Hi4\000aH", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4 ", (int) (short) -1, (int) 'a', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 1, (int) (short) 1, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a\000", (int) (byte) 0, (int) (byte) 0, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\0004\000", 52, (-1), strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        char char18 = doubleMetaphone0.charAt("\000a", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult20.appendPrimary("4#\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4H", false);
        java.lang.String str9 = doubleMetaphone0.encode("H4a");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aAA", "aH\000\000\000aH\0004", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        char char10 = doubleMetaphone0.charAt("\000\000A", 0);
        int int11 = doubleMetaphone0.maxCodeLen;
        char char14 = doubleMetaphone0.charAt("\000a#\000", 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate('h');
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.append("\000aHa", "\000a\0004");
        doubleMetaphoneResult8.appendAlternate('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a4h" + "'", str17, "\000a4h");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("\000a\000a");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.append("\000a");
        java.lang.String str25 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("\000a#\000");
        java.lang.Class<?> wildcardClass28 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.encode("\000#");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000 \000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("a", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        java.lang.Class<?> wildcardClass9 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.lang.String[] strArray22 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("a4\000a", (-1), (int) (short) 1, strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '#', (int) (byte) -1, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aAi", 1, 0, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) '\000', 4, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\000a4");
        java.lang.String str12 = doubleMetaphone0.encode("4");
        java.lang.String str14 = doubleMetaphone0.encode("\000a4h");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a\000");
        char char13 = doubleMetaphone0.charAt("\000aAi", (int) (short) 1);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "#");
        java.lang.String str18 = doubleMetaphone0.encode("\000\000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int20 = doubleMetaphone19.maxCodeLen;
        char char23 = doubleMetaphone19.charAt("hi!", (int) (byte) 100);
        char char26 = doubleMetaphone19.charAt("", (int) (byte) 100);
        java.lang.String str29 = doubleMetaphone19.doubleMetaphone("\000a4h", false);
        java.lang.String str31 = doubleMetaphone19.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone19.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult33.append("4#", "\000aA\000");
        boolean boolean37 = doubleMetaphoneResult33.isComplete();
        doubleMetaphoneResult33.append('H', 'i');
        java.lang.String str41 = doubleMetaphoneResult33.getAlternate();
        java.lang.Object obj42 = doubleMetaphone0.encode((java.lang.Object) str41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'a' + "'", char13 == 'a');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\000aA\000i" + "'", str41, "\000aA\000i");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "A" + "'", obj42, "A");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult8.appendPrimary('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("# 4");
        char char15 = doubleMetaphone0.charAt("\000a", (int) (byte) 0);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.append('a', 'h');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.append("4##");
        java.lang.String str26 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000h");
        java.lang.Class<?> wildcardClass29 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000aHa" + "'", str26, "\000aHa");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult7.appendPrimary('4');
        java.lang.String str10 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('h');
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult7.append("\000a 4", "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.lang.String[] strArray25 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) 'i', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000", 0, (int) (byte) 1, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000a", 10, (int) (short) 100, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000#", 32, (int) (byte) 100, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aa\000", (int) 'H', (int) 'i', strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aA", "\000a4h");
        doubleMetaphoneResult8.append('\000');
        java.lang.Class<?> wildcardClass22 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        char char16 = doubleMetaphone0.charAt("\000a4h", (-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char23 = doubleMetaphone0.charAt("H4a4", (int) 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        char char13 = doubleMetaphone0.charAt("hi!4", 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate('i');
        doubleMetaphoneResult8.appendPrimary('h');
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        boolean boolean24 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a4h" + "'", str23, "\000a4h");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 32;
        char char21 = doubleMetaphone0.charAt("#\000", 0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int23 = doubleMetaphone22.maxCodeLen;
        java.lang.String str25 = doubleMetaphone22.doubleMetaphone("");
        boolean boolean29 = doubleMetaphone22.isDoubleMetaphoneEqual("H", "H", true);
        int int30 = doubleMetaphone22.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone22.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str34 = doubleMetaphone22.encode("H");
        char char37 = doubleMetaphone22.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult39 = doubleMetaphone22.new DoubleMetaphoneResult((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '#' + "'", char21 == '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + 'h' + "'", char37 == 'h');
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray14);
        java.lang.Class<?> wildcardClass18 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000\000\000", false);
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(52);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char21 = doubleMetaphone18.charAt("", (int) (byte) 10);
        java.lang.String str23 = doubleMetaphone18.encode("H");
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) "H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.encode("A");
        doubleMetaphone0.setMaxCodeLen(32);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("4\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult12.appendPrimary(' ');
        java.lang.String str15 = doubleMetaphoneResult12.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str13 = doubleMetaphoneResult7.getPrimary();
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult8.append('4');
        boolean boolean11 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append("\000a", "4");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendAlternate("\000\000\000");
        doubleMetaphoneResult7.append("H4a");
        java.lang.String str21 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a H4a" + "'", str21, "\000a H4a");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone(" h\000a", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        java.lang.String str17 = doubleMetaphoneResult10.getAlternate();
        java.lang.String str18 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("H");
        doubleMetaphoneResult10.append(' ', 'i');
        doubleMetaphoneResult10.append('i', 'i');
        doubleMetaphoneResult10.append("\000 a");
        doubleMetaphoneResult10.appendPrimary(' ');
        java.lang.String str31 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!i", "\000 a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("\000\000\000");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.appendPrimary("");
        doubleMetaphoneResult4.appendPrimary("#H");
        java.lang.String str11 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("\000a\000a");
        boolean boolean14 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.append("\000a 4");
        doubleMetaphoneResult4.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000ah" + "'", str11, "\000ah");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.appendAlternate("A");
        boolean boolean16 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.append("\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        java.lang.String str15 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("a4\000a", "");
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str20 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str21 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000a" + "'", str15, "\000a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000aa4" + "'", str19, "\000aa4");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000aa4" + "'", str20, "\000aa4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a" + "'", str21, "\000a");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.appendPrimary("\000a4");
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('4', '#');
        doubleMetaphoneResult8.appendPrimary('i');
        doubleMetaphoneResult8.append("\000a");
        doubleMetaphoneResult8.appendPrimary('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000a4" + "'", str20, "\000a4");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        java.lang.String str11 = doubleMetaphone0.encode("\000a4");
        java.lang.String str13 = doubleMetaphone0.encode("\000a4H");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("H4a", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        boolean boolean21 = doubleMetaphone17.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str23 = doubleMetaphone17.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone17.new DoubleMetaphoneResult(4);
        char char28 = doubleMetaphone17.charAt("\000a4h", (int) '4');
        int int29 = doubleMetaphone17.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone17.new DoubleMetaphoneResult((-1));
        boolean boolean34 = doubleMetaphone17.isDoubleMetaphoneEqual("\000aH\000", "\000a#");
        int int35 = doubleMetaphone17.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult13.appendAlternate("\000a4");
        doubleMetaphoneResult13.append("\000a\000\000", "hi!a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("\000aH\000");
        java.lang.String str14 = doubleMetaphone0.encode("\000 a");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a H4a", "#\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "a4\000a");
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000a\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("aH");
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aA", "\000a4h");
        doubleMetaphoneResult8.append("", "\000a\000a");
        doubleMetaphoneResult8.appendAlternate('\000');
        doubleMetaphoneResult8.append('#', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("H4a", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("# 4");
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.append("4#", "a4\000a");
        doubleMetaphoneResult8.appendPrimary(' ');
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a\0004" + "'", str23, "\000a\0004");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA", (int) '4', (int) ' ', strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'h', (int) (short) -1, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (short) 10, (int) '\000', strArray20);
        java.lang.Class<?> wildcardClass26 = strArray20.getClass();
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        boolean boolean13 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.append('h', '4');
        boolean boolean17 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.append('H');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        char char19 = doubleMetaphone0.charAt("4", (int) (short) 10);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "4#4", false);
        char char23 = doubleMetaphone0.charAt("hi!a", (int) (short) 10);
        char char26 = doubleMetaphone0.charAt("\000aa\000", 105);
        int int27 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('#');
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.appendPrimary(" Ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("H4a", true);
        int int17 = doubleMetaphone0.maxCodeLen;
        char char20 = doubleMetaphone0.charAt("# 4", (int) 'a');
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "aH", false);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("\0004\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult13.appendAlternate('4');
        doubleMetaphoneResult13.append('#', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "4#4", false);
        char char23 = doubleMetaphone0.charAt("hi!a", (int) (short) 10);
        char char26 = doubleMetaphone0.charAt("\000aa\000", 105);
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aAi", "#H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("# 4");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("4hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('a');
        boolean boolean15 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('i', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah4", "4#A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append('\000', '#');
        doubleMetaphoneResult10.append("\000a4 ", "4#4");
        doubleMetaphoneResult10.appendPrimary(' ');
        doubleMetaphoneResult10.append("H4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult8.append("\000a\0004", "\000a\000\000");
        boolean boolean12 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000a\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("4##");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        char char18 = doubleMetaphone0.charAt("4\000a", (int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        java.lang.String str17 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.appendPrimary("\000a\0004");
        doubleMetaphoneResult10.append('\000', '#');
        doubleMetaphoneResult10.append("\000a\0004", "H4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000a", "", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.append("\000\000", "\000a4H");
        doubleMetaphoneResult8.appendAlternate('H');
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult15.appendAlternate("4\000a");
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("\000aa");
        java.lang.String str25 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("a");
        doubleMetaphoneResult8.appendAlternate('H');
        doubleMetaphoneResult8.appendPrimary("\000a 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        java.lang.String str17 = doubleMetaphoneResult10.getAlternate();
        java.lang.String str18 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("H");
        doubleMetaphoneResult10.append(' ', 'i');
        doubleMetaphoneResult10.append('i', 'i');
        doubleMetaphoneResult10.append("\000 a");
        doubleMetaphoneResult10.appendPrimary(' ');
        doubleMetaphoneResult10.append(' ');
        java.lang.Class<?> wildcardClass33 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str11 = doubleMetaphoneResult10.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult10.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000", "A");
        doubleMetaphoneResult8.append("\000a\0004", "\000a\0004");
        doubleMetaphoneResult8.appendAlternate("AH");
        doubleMetaphoneResult8.appendAlternate('h');
        java.lang.String str27 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000a\000A" + "'", str27, "\000a\000A");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "H4H");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append("A", "hi!");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000ah", "4");
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.append('4', 'a');
        doubleMetaphoneResult8.appendAlternate("\000\000");
        java.lang.String str30 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000aA\000" + "'", str22, "\000aA\000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a\000a" + "'", str30, "\000a\000a");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.append("4#", "a4\000a");
        doubleMetaphoneResult8.append('a', 'a');
        doubleMetaphoneResult8.appendPrimary("4H");
        doubleMetaphoneResult8.append('H', 'a');
        boolean boolean29 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendPrimary("\000\000\000");
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        char char10 = doubleMetaphone0.charAt("", (int) (short) 1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aH\000", (int) 'H', 32, strArray25);
        java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) "\000aH\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "A" + "'", obj29, "A");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\000a44", "");
        doubleMetaphoneResult7.appendPrimary("\000aAh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000\000A");
        doubleMetaphoneResult8.append("4#A", "4##");
        boolean boolean30 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000\000\000", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        doubleMetaphone0.maxCodeLen = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        char char16 = doubleMetaphone0.charAt("\000aA\000", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004\000", "\000a\000h", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        doubleMetaphoneResult8.appendAlternate("4#");
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('#');
        doubleMetaphoneResult8.append("\000\000\000");
        doubleMetaphoneResult8.append("\000a# ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\0004#" + "'", str20, "\000\0004#");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000aA\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        doubleMetaphone0.maxCodeLen = (byte) -1;
        doubleMetaphone0.setMaxCodeLen(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.append("# 4", "\000aAi");
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4hi!" + "'", str17, "4hi!");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendPrimary("\000a4");
        doubleMetaphoneResult7.appendAlternate("\000#");
        doubleMetaphoneResult7.append(' ', 'H');
        doubleMetaphoneResult7.appendAlternate("\000a\000A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000a\000h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("H4a\000");
        doubleMetaphoneResult8.append('4', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H4a" + "'", str16, "H4a");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        doubleMetaphoneResult8.append('i', 'i');
        doubleMetaphoneResult8.append("4");
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.appendAlternate("\000a4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult12.appendPrimary('H');
        doubleMetaphoneResult12.appendAlternate("# 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000A", "\000ah4", false);
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int18 = doubleMetaphone0.maxCodeLen;
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000a4\000", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int23 = doubleMetaphone22.maxCodeLen;
        boolean boolean26 = doubleMetaphone22.isDoubleMetaphoneEqual("hi!", "");
        int int27 = doubleMetaphone22.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone22.new DoubleMetaphoneResult((int) (byte) -1);
        int int30 = doubleMetaphone22.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) int30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("");
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("A", "4");
        doubleMetaphoneResult8.appendPrimary("4#");
        doubleMetaphoneResult8.append("4H", "\0004a");
        doubleMetaphoneResult8.appendAlternate("4h");
        boolean boolean28 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.appendPrimary("\000a\000A");
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendAlternate("\000a H4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H4a" + "'", str16, "H4a");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str13 = doubleMetaphone0.encode("\000a#\000");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aa\000", "\000a\000A");
        doubleMetaphone0.maxCodeLen = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String[] strArray22 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) 'i', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 0, (int) 'h', strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a\000", 32, 4, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000A", 1, 10, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        boolean boolean11 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        java.lang.String str13 = doubleMetaphone0.encode("\000\0004#");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("H4a");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("4hi!", "4#\000a");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\0004#", " \0004", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.append("4#", "a4\000a");
        doubleMetaphoneResult8.append("\000aa");
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("\0004a");
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append('H', 'a');
        java.lang.String str31 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a\0004" + "'", str23, "\000a\0004");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000aha" + "'", str31, "\000aha");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('h');
        doubleMetaphoneResult8.append('#');
        doubleMetaphoneResult8.appendPrimary("\000 a");
        doubleMetaphoneResult8.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("4##");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("H4a\000", "");
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4h" + "'", str21, "\000a4h");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str16 = doubleMetaphone0.encode("hi!4");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        int int22 = doubleMetaphone0.maxCodeLen;
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("H44", "H44", true);
        int int27 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult10.appendPrimary('h');
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult10.append("\000a4h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append("");
        doubleMetaphoneResult10.appendAlternate('4');
        java.lang.String str20 = doubleMetaphoneResult10.getPrimary();
        boolean boolean21 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\000a4 ", (int) (byte) 1);
        doubleMetaphone0.maxCodeLen = (short) 10;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000\0004#");
        char char17 = doubleMetaphone0.charAt("\0004", (int) 'i');
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000\000aA", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "H4a");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        java.lang.String str14 = doubleMetaphoneResult13.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.maxCodeLen;
        boolean boolean12 = doubleMetaphone8.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str14 = doubleMetaphone8.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone8.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult16.appendPrimary('4');
        doubleMetaphoneResult16.append("hi!", "hi!");
        doubleMetaphoneResult16.appendPrimary("hi!");
        doubleMetaphoneResult16.append('h', 'H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str5 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.appendPrimary("\000a");
        boolean boolean8 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000a4", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphone0.maxCodeLen = 'i';
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual(" h\000a", "\000\0004#", true);
        java.lang.String str31 = doubleMetaphone0.encode("\000i");
        java.lang.Class<?> wildcardClass32 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.appendPrimary('a');
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000 a");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000" + "'", str16, "\000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aa\000" + "'", str21, "\000aa\000");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary('a');
        boolean boolean26 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append(' ', '4');
        doubleMetaphoneResult8.appendPrimary(" ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) (byte) 10, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#4", (int) '4', 1, strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000\000\000", false);
        doubleMetaphone0.setMaxCodeLen((int) '4');
        java.lang.String str17 = doubleMetaphone0.encode(" Ah");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a", false);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aA", "\000a4h");
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("#H");
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000a#\000" + "'", str20, "\000a#\000");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.lang.String[] strArray16 = new java.lang.String[] { "\000", "hi!", "\000h", "a" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 4, 4, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000h", (int) 'H', (int) '\000', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", 4, 97, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!i", (int) '#', 10, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\000", "hi!", "\000h", "a" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.String[] strArray31 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) 'i', strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000", 0, (int) (byte) 1, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000a", 10, (int) (short) 100, strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000#", 32, (int) (byte) 100, strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a 4", (int) 'a', (int) (byte) 100, strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4", (int) (byte) 100, 4, strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aH", 10, (int) 'i', strArray31);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('4', '\000');
        doubleMetaphoneResult7.append("", "#");
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        doubleMetaphoneResult8.appendPrimary('i');
        boolean boolean20 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append(' ', '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.append("aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000a\000h");
        doubleMetaphone0.maxCodeLen = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphoneResult17.appendAlternate("#H");
        doubleMetaphoneResult17.append('4', '\000');
        doubleMetaphoneResult17.append("H4a\000");
        doubleMetaphoneResult17.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000\000", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000a# ", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("\000a4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.append("ia");
        doubleMetaphoneResult8.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendAlternate("\0004");
        doubleMetaphoneResult8.append(' ', '4');
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendPrimary(" Ah");
        doubleMetaphoneResult8.append('a', 'h');
        doubleMetaphoneResult8.appendPrimary('#');
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        java.lang.Class<?> wildcardClass20 = doubleMetaphoneResult19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult11.appendPrimary("4##i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.append("\000a");
        boolean boolean25 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('i');
        doubleMetaphoneResult8.append('\000', 'H');
        doubleMetaphoneResult8.append("4\000\000\000", "hi!\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "4#4", false);
        char char23 = doubleMetaphone0.charAt("hi!a", (int) (short) 10);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("AH", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("aH");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aAh", "4#\000a", false);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "# 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
}

