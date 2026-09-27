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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000aAi");
        doubleMetaphoneResult8.append("\000aH4");
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a" + "'", str14, "\000a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\000a" + "'", str19, "\000a\000a");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        doubleMetaphoneResult8.appendAlternate("\000aHa");
        doubleMetaphoneResult8.appendAlternate("\000a\000a");
        doubleMetaphoneResult8.appendPrimary("4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000 a" + "'", str16, "\000 a");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult12.appendAlternate('H');
        doubleMetaphoneResult12.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        doubleMetaphoneResult8.append('#', 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendPrimary("\000a4");
        doubleMetaphoneResult7.appendAlternate("\000#");
        doubleMetaphoneResult7.append(" ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.appendPrimary("\000#\000aa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "A" + "'", obj10, "A");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = doubleMetaphone12.maxCodeLen;
        java.lang.String str15 = doubleMetaphone12.doubleMetaphone("");
        java.lang.String str18 = doubleMetaphone12.doubleMetaphone("hi!", false);
        java.lang.String str20 = doubleMetaphone12.doubleMetaphone("A");
        doubleMetaphone12.setMaxCodeLen((int) ' ');
        boolean boolean26 = doubleMetaphone12.isDoubleMetaphoneEqual("\000a\0004", "\000a4 ", false);
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "\000a4 ");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("\000h");
        int int30 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "A" + "'", obj27, "A");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult12.append("4", "\000\000\000");
        boolean boolean16 = doubleMetaphoneResult12.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        boolean boolean11 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append("A", "hi!");
        doubleMetaphoneResult8.appendPrimary('#');
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('h');
        doubleMetaphoneResult8.append("\000aA\000", "H4a");
        doubleMetaphoneResult8.append('4', 'a');
        doubleMetaphoneResult8.append('4', ' ');
        doubleMetaphoneResult8.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        doubleMetaphoneResult13.append('a');
        java.lang.String str16 = doubleMetaphoneResult13.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult13.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a" + "'", str16, "a");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "a" + "'", str17, "a");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("#H\000a4h", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 10);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a", false);
        java.lang.String str14 = doubleMetaphone0.encode("a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String[] strArray26 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", (int) (byte) 1, (int) (short) 0, strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a", false);
        java.lang.String str9 = doubleMetaphone0.encode("hi!");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = doubleMetaphone0.encode("#H\000a4h");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = '#';
        int int11 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000\000", true);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "\000a44");
        java.lang.String str17 = doubleMetaphone0.encode("\000#");
        doubleMetaphone0.maxCodeLen = ' ';
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000aH#");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.String str14 = doubleMetaphone0.encode("H");
        doubleMetaphone0.maxCodeLen = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = doubleMetaphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000a4 ", "\000\000");
        doubleMetaphoneResult8.append("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        doubleMetaphoneResult8.appendAlternate("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        char char19 = doubleMetaphone0.charAt("#H", (int) 'h');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "# 4");
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
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000#", true);
        doubleMetaphone0.maxCodeLen = 32;
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char15 = doubleMetaphone0.charAt("hi!i", (int) '#');
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str9 = doubleMetaphone0.encode("\000aA");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.maxCodeLen = ' ';
        int int17 = doubleMetaphone11.maxCodeLen;
        int int18 = doubleMetaphone11.maxCodeLen;
        java.lang.String str20 = doubleMetaphone11.encode("\000#");
        int int21 = doubleMetaphone11.getMaxCodeLen();
        java.lang.String str23 = doubleMetaphone11.encode("\000");
        int int24 = doubleMetaphone11.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("a4\000a", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000#", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("H", true);
        java.lang.String str17 = doubleMetaphone0.encode("H4H");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = doubleMetaphone12.maxCodeLen;
        boolean boolean16 = doubleMetaphone12.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone12.maxCodeLen = 'a';
        boolean boolean21 = doubleMetaphone12.isDoubleMetaphoneEqual("\000aA\000", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone12.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone12.maxCodeLen = (short) 100;
        java.lang.String str27 = doubleMetaphone12.encode("\000#");
        java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) str27);
        java.lang.String str30 = doubleMetaphone0.encode("\000aA\000i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A" + "'", str30, "A");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.encode("\0004");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("a4\000a");
        java.lang.String str14 = doubleMetaphone0.encode("#H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000h");
        doubleMetaphone0.setMaxCodeLen(4);
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000 a");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000a H4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('#');
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("AH");
        doubleMetaphoneResult8.appendPrimary("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        doubleMetaphoneResult8.append(" Ah", "#H\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult12.append('h');
        doubleMetaphoneResult12.append("\000aAi", "");
        doubleMetaphoneResult12.appendPrimary('h');
        doubleMetaphoneResult12.appendAlternate("hi!a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "#H");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "H");
        char char11 = doubleMetaphone0.charAt("#", (int) (short) 100);
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        java.lang.String str28 = doubleMetaphoneResult21.getAlternate();
        doubleMetaphoneResult21.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        char char9 = doubleMetaphone0.charAt("\000a", 0);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("Hi4\000aH", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult17.append('i');
        java.lang.String str20 = doubleMetaphoneResult17.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i" + "'", str20, "i");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append("\000aA", "\000aHa");
        doubleMetaphoneResult8.appendPrimary("\000\000A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate("H");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("#H");
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000h");
        doubleMetaphoneResult8.append('i', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a4H" + "'", str19, "\000a4H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H4a" + "'", str22, "H4a");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        boolean boolean13 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.append('h', '4');
        java.lang.String str17 = doubleMetaphoneResult12.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44", "\000a44");
        doubleMetaphone0.maxCodeLen = (short) 1;
        doubleMetaphone0.maxCodeLen = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        java.lang.String str8 = doubleMetaphone0.encode("\000a");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str14 = doubleMetaphone0.encode("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000aHa");
        doubleMetaphone0.setMaxCodeLen(104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str13 = doubleMetaphone0.encode("\000a H4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str18 = doubleMetaphoneResult17.getAlternate();
        doubleMetaphoneResult17.append("\000aA\000i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        doubleMetaphoneResult21.appendAlternate(' ');
        java.lang.String str30 = doubleMetaphoneResult21.getAlternate();
        doubleMetaphoneResult21.append("aH\000", "\000a4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi! " + "'", str30, "hi! ");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("ia");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        int int16 = doubleMetaphone0.maxCodeLen;
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual(" h\000a", "H4H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("\000aAh", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\000aA", 0);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000aH", "4a4\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        doubleMetaphoneResult8.append('h', ' ');
        doubleMetaphoneResult8.append("");
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        doubleMetaphoneResult8.append("\000aH4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        java.lang.String str28 = doubleMetaphoneResult27.getPrimary();
        doubleMetaphoneResult27.append('a');
        doubleMetaphoneResult27.appendAlternate('4');
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.append('4', '4');
        boolean boolean22 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        char char16 = doubleMetaphone0.charAt("\000aA\000", (int) (short) 0);
        int int17 = doubleMetaphone0.maxCodeLen;
        char char20 = doubleMetaphone0.charAt("\0004a", (int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a# ", "\000aAh", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = '4';
        int int12 = doubleMetaphone0.getMaxCodeLen();
        char char15 = doubleMetaphone0.charAt("4##", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int22 = doubleMetaphone21.maxCodeLen;
        boolean boolean25 = doubleMetaphone21.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str27 = doubleMetaphone21.doubleMetaphone("");
        doubleMetaphone21.setMaxCodeLen(100);
        doubleMetaphone21.maxCodeLen = 'a';
        java.lang.String str33 = doubleMetaphone21.doubleMetaphone("\000a");
        int int34 = doubleMetaphone21.maxCodeLen;
        doubleMetaphone21.setMaxCodeLen((int) ' ');
        int int37 = doubleMetaphone21.getMaxCodeLen();
        boolean boolean40 = doubleMetaphone21.isDoubleMetaphoneEqual("\000a4", "\000a\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult42 = doubleMetaphone21.new DoubleMetaphoneResult((int) '4');
        java.lang.String str44 = doubleMetaphone21.doubleMetaphone("\000\000aA");
        doubleMetaphone21.maxCodeLen = 32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "A" + "'", str33, "A");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "A" + "'", str44, "A");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "hi!", true);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("4#4i");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        char char14 = doubleMetaphone10.charAt("hi!", (int) (byte) 100);
        int int15 = doubleMetaphone10.maxCodeLen;
        int int16 = doubleMetaphone10.getMaxCodeLen();
        int int17 = doubleMetaphone10.maxCodeLen;
        int int18 = doubleMetaphone10.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("H4a\000", true);
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("Hi4\000aH", "\000\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('#');
        doubleMetaphoneResult8.append("4\000", "A");
        java.lang.String str21 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aH#" + "'", str21, "\000aH#");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult9.appendPrimary('i');
        doubleMetaphoneResult9.appendAlternate("#");
        doubleMetaphoneResult9.append('#');
        doubleMetaphoneResult9.appendAlternate('#');
        doubleMetaphoneResult9.append('#', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4 ");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.append("A", "\000\000");
        doubleMetaphoneResult8.appendPrimary('H');
        doubleMetaphoneResult8.append("\000a\000A", "\0004\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        int int15 = doubleMetaphone0.maxCodeLen;
        char char18 = doubleMetaphone0.charAt("hi!i", 105);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
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
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray29);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray29);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), (int) 'a', strArray29);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) ' ', strArray29);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a44", (int) 'h', (int) 'a', strArray29);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Ai", (int) (short) 0, (int) '\000', strArray29);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a#\000", (int) (short) 0, (int) (short) 1, strArray29);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#\000a", (int) 'a', (int) 'i', strArray29);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("\000aH\000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone25 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int26 = doubleMetaphone25.maxCodeLen;
        boolean boolean29 = doubleMetaphone25.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str31 = doubleMetaphone25.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone25.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult33.append('\000');
        doubleMetaphoneResult33.append('a');
        doubleMetaphoneResult33.append("", "\000");
        java.lang.String str41 = doubleMetaphoneResult33.getPrimary();
        doubleMetaphoneResult33.append("4");
        doubleMetaphoneResult33.append(' ');
        java.lang.String str46 = doubleMetaphoneResult33.getPrimary();
        doubleMetaphoneResult33.append("\000");
        java.lang.String str49 = doubleMetaphoneResult33.getAlternate();
        java.lang.String str50 = doubleMetaphoneResult33.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\000a" + "'", str41, "\000a");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\000a4 " + "'", str46, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\000a\0004" + "'", str49, "\000a\0004");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\000a4 " + "'", str50, "\000a4 ");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.lang.String str24 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(" ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000a4" + "'", str20, "\000a4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4#" + "'", str24, "\000a4#");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000#", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("4#", "\000a4h");
        doubleMetaphoneResult8.appendAlternate('i');
        java.lang.String str21 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!\000" + "'", str21, "hi!\000");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray21);
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) "H");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "", true);
        java.lang.String str30 = doubleMetaphone0.encode("H4a\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\000a4", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("#H", "\000\000aA", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 100, 0, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000a", (int) 'a', (int) (byte) 100, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("4", (-1), (int) (byte) -1, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000i", (-1), (int) (byte) -1, strArray23);
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
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        doubleMetaphoneResult8.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str16 = doubleMetaphone0.encode("H44");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual(" Ah", "\000aH", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        char char25 = doubleMetaphone0.charAt("\000ah", (int) (short) 10);
        java.lang.String str27 = doubleMetaphone0.encode("aH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone28 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int29 = doubleMetaphone28.maxCodeLen;
        int int30 = doubleMetaphone28.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone28.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult32.appendAlternate("\000ah");
        doubleMetaphoneResult32.appendPrimary("");
        doubleMetaphoneResult32.appendPrimary("#H");
        java.lang.String str39 = doubleMetaphoneResult32.getAlternate();
        doubleMetaphoneResult32.appendPrimary("\000a\000a");
        java.lang.Object obj42 = doubleMetaphone0.encode((java.lang.Object) "\000a\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A" + "'", str27, "A");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\000ah" + "'", str39, "\000ah");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "A" + "'", obj42, "A");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult14.appendAlternate("a");
        doubleMetaphoneResult14.appendPrimary('i');
        doubleMetaphoneResult14.append("4##", "\0004a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        doubleMetaphoneResult8.appendPrimary("4hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append("");
        java.lang.String str18 = doubleMetaphoneResult10.getPrimary();
        doubleMetaphoneResult10.append('4', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000aH4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("4a4\000");
        doubleMetaphoneResult7.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        java.lang.Class<?> wildcardClass24 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aA" + "'", str21, "\000aA");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000\000\000", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        int int16 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 72 + "'", int16 == 72);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a\000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        char char13 = doubleMetaphone0.charAt("", 35);
        doubleMetaphone0.setMaxCodeLen(104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        doubleMetaphoneResult8.appendAlternate('a');
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("a4\000a");
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.append('\000', '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000\000" + "'", str24, "\000a\000\000");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        doubleMetaphoneResult8.append("\000a\000A");
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        java.lang.String str8 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('i', '\000');
        boolean boolean12 = doubleMetaphoneResult4.isComplete();
        java.lang.String str13 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append("\000aH\000", "\000aH#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#\000" + "'", str13, "#\000");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendAlternate("4a4\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        java.lang.Class<?> wildcardClass14 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\000a4", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000\0004#", true);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "", true);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("\000aHa", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AH" + "'", str23, "AH");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 10, 0, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 0, (int) (short) 1, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aha", (int) (byte) -1, 32, strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        doubleMetaphoneResult8.appendPrimary("\000aH");
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        int int13 = doubleMetaphone0.maxCodeLen;
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000a", "\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        java.lang.String str15 = doubleMetaphone0.encode("\000#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        doubleMetaphoneResult17.appendAlternate(' ');
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult17.appendAlternate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        boolean boolean25 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4 ", (int) (short) -1, (int) 'a', strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) '#', strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a\000", (int) ' ', (int) 'i', strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        char char13 = doubleMetaphone0.charAt("", 35);
        int int14 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        doubleMetaphoneResult18.appendAlternate('a');
        doubleMetaphoneResult18.append("\000aA#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.lang.String[] strArray13 = new java.lang.String[] { "\000", "hi!", "\000h", "a" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 4, 4, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("AH", 0, (int) ' ', strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aAi", 0, (int) (byte) 10, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "\000", "hi!", "\000h", "a" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        boolean boolean24 = doubleMetaphoneResult8.isComplete();
        java.lang.String str25 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('4');
        boolean boolean28 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary("\000\000\000");
        doubleMetaphoneResult8.appendAlternate('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a4 " + "'", str23, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a\0004" + "'", str25, "\000a\0004");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str8 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('h', '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("4#4", "\000aH4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        java.lang.String str26 = doubleMetaphone0.encode("\000\000");
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        int int29 = doubleMetaphone0.getMaxCodeLen();
        int int30 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 105 + "'", int29 == 105);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 105 + "'", int30 == 105);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A" + "'", str32, "A");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(105);
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        doubleMetaphoneResult8.append("\000aha");
        doubleMetaphoneResult8.append("\000aH\000", "\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\0004a", false);
        java.lang.String str18 = doubleMetaphone0.encode("aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append('h', '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = 104;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendPrimary(" h\000a");
        doubleMetaphoneResult7.appendPrimary("\000aAH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("4##", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        boolean boolean15 = doubleMetaphone11.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str17 = doubleMetaphone11.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone11.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult19.append("H", "\000a");
        doubleMetaphoneResult19.append("4");
        java.lang.String str25 = doubleMetaphoneResult19.getAlternate();
        doubleMetaphoneResult19.appendPrimary('a');
        doubleMetaphoneResult19.appendAlternate("H");
        java.lang.String str30 = doubleMetaphoneResult19.getAlternate();
        doubleMetaphoneResult19.append("4\000a");
        doubleMetaphoneResult19.appendAlternate('i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) 'i');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4" + "'", str25, "\000a4");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a4H" + "'", str30, "\000a4H");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("aH");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000a\000h", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000 a", "\000aH#", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("\000\000");
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a", true);
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str9 = doubleMetaphone0.encode("\000aA");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000\0004#");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        doubleMetaphoneResult8.append('a', 'h');
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("hi!");
        doubleMetaphoneResult8.append("\000aA\000", "\000aA#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a\000a" + "'", str22, "\000a\000a");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        doubleMetaphoneResult8.appendPrimary("\000aAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendAlternate('H');
        doubleMetaphoneResult8.append(" Ai", "\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        java.lang.String str32 = doubleMetaphoneResult8.getAlternate();
        boolean boolean33 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000a\0004" + "'", str32, "\000a\0004");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.append("\000a#", "\000h");
        doubleMetaphoneResult9.appendAlternate('4');
        doubleMetaphoneResult9.appendPrimary('a');
        doubleMetaphoneResult9.append("\000#\000aa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.String str14 = doubleMetaphone0.encode("H");
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "AH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "A" + "'", obj17, "A");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult17.appendAlternate('a');
        java.lang.Class<?> wildcardClass20 = doubleMetaphoneResult17.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("\000a4H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        java.lang.String str20 = doubleMetaphone17.doubleMetaphone("");
        java.lang.String str23 = doubleMetaphone17.doubleMetaphone("hi!", false);
        int int24 = doubleMetaphone17.maxCodeLen;
        boolean boolean28 = doubleMetaphone17.isDoubleMetaphoneEqual("\000a4", "H", true);
        java.lang.String str30 = doubleMetaphone17.encode("\000\000");
        int int31 = doubleMetaphone17.maxCodeLen;
        java.lang.String str34 = doubleMetaphone17.doubleMetaphone("\000a", true);
        java.lang.String str36 = doubleMetaphone17.encode("#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone17.new DoubleMetaphoneResult((int) 'h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "A" + "'", str34, "A");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a\0004" + "'", str23, "\000a\0004");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000a4 ", "\000\000");
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append(' ', 'i');
        doubleMetaphoneResult8.append("\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        java.lang.String str11 = doubleMetaphone0.encode("\000a4");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000', '#');
        doubleMetaphoneResult8.appendPrimary("4#");
        doubleMetaphoneResult8.appendPrimary('a');
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str18 = doubleMetaphone0.encode("\000a44");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ahi", "\000aH");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a4", "\000\000\000");
        doubleMetaphone0.maxCodeLen = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("\000a4H");
        doubleMetaphoneResult7.appendPrimary("\000a#\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 10);
        char char12 = doubleMetaphone0.charAt("\000a4", (int) (short) -1);
        doubleMetaphone0.maxCodeLen = 104;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        doubleMetaphone0.maxCodeLen = (byte) 10;
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("4#4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4 ", (int) (short) -1, (int) 'a', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 1, (int) (short) 1, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a\000", (int) (byte) 0, (int) (byte) 0, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("H44", (int) (short) 100, (-1), strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("\000");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "\0004", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000aA\000", true);
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("aH\000", true);
        java.lang.String str33 = doubleMetaphone0.encode("\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "a", false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        java.lang.String str13 = doubleMetaphone0.encode("H");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("4\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        java.lang.String str26 = doubleMetaphone0.encode("\000\000");
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        int int29 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 105 + "'", int29 == 105);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("4\000a");
        int int17 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("# 4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        doubleMetaphoneResult8.appendAlternate('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000" + "'", str16, "\000");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append('h', 'h');
        doubleMetaphoneResult8.append("i");
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H4hi" + "'", str19, "H4hi");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        char char8 = doubleMetaphone0.charAt("#H", (int) (byte) 10);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4##i", "\000aAh", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 1;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "\000 \000a", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        boolean boolean10 = doubleMetaphoneResult9.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendAlternate("\000ahi");
        doubleMetaphoneResult8.append('h', 'a');
        doubleMetaphoneResult8.append('i', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.append("# 4", "\000aAi");
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4hi!" + "'", str17, "4hi!");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str13 = doubleMetaphoneResult12.getAlternate();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        doubleMetaphoneResult13.append("", "");
        doubleMetaphoneResult13.appendPrimary("\000aAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("\000\000aA");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("ia");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        doubleMetaphoneResult8.appendAlternate("#\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000 a" + "'", str16, "\000 a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a\000a" + "'", str21, "\000a\000a");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        doubleMetaphoneResult8.appendPrimary("\000aA#");
        doubleMetaphoneResult8.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) -1, (int) (short) 100, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hi!", 0, 32, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hi", 1, (int) (short) 1, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000#", 105, (int) ' ', strArray23);
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
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "\000a4 ");
        int int11 = doubleMetaphone0.maxCodeLen;
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("ia");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult16.append("\000i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        char char16 = doubleMetaphone0.charAt("4#\000a", 32);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char20 = doubleMetaphone17.charAt("", (int) (byte) 10);
        java.lang.String str22 = doubleMetaphone17.doubleMetaphone("H");
        java.lang.String str24 = doubleMetaphone17.encode("hi!");
        java.lang.String str26 = doubleMetaphone17.encode("\000aA");
        boolean boolean30 = doubleMetaphone17.isDoubleMetaphoneEqual("\000aHa", "\000", false);
        int int31 = doubleMetaphone17.getMaxCodeLen();
        java.lang.String str33 = doubleMetaphone17.encode("\000aa");
        java.lang.String str35 = doubleMetaphone17.encode("\000aH");
        int int36 = doubleMetaphone17.maxCodeLen;
        java.lang.String str38 = doubleMetaphone17.encode("\000\000aA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "A" + "'", str33, "A");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "A" + "'", str35, "A");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "A" + "'", str38, "A");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.append('H');
        doubleMetaphoneResult8.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("4#", "\000a4h");
        doubleMetaphoneResult8.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int21 = doubleMetaphone20.maxCodeLen;
        boolean boolean24 = doubleMetaphone20.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str26 = doubleMetaphone20.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone20.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult28.append("H", "\000a");
        doubleMetaphoneResult28.append("4");
        doubleMetaphoneResult28.append(" Ai", "# 4");
        java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) " Ai");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "A" + "'", obj37, "A");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("\000\000");
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a", true);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("4##", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("4#A", "# 4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.appendPrimary('\000');
        java.lang.String str13 = doubleMetaphoneResult10.getPrimary();
        java.lang.String str14 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.lang.String str28 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000a\0004" + "'", str28, "\000a\0004");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        int int25 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "i", true);
        char char32 = doubleMetaphone0.charAt("\000a 4", (int) (short) -1);
        java.lang.String str34 = doubleMetaphone0.encode("\000a4H");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "A" + "'", str34, "A");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult7.append("\000", "4##");
        doubleMetaphoneResult7.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        doubleMetaphoneResult8.append("hi!i");
        doubleMetaphoneResult8.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        java.lang.String str25 = doubleMetaphoneResult8.getAlternate();
        boolean boolean26 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000A" + "'", str24, "\000a\000A");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a\000A" + "'", str25, "\000a\000A");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 10, 100, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 105, (int) (short) 100, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", (int) (short) -1, (int) (byte) 1, strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.lang.String[] strArray16 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000", (int) (short) 1, (int) (short) 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a# ", (int) 'H', (int) (short) -1, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", (int) 'a', (int) (short) 1, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000', '#');
        doubleMetaphoneResult8.appendPrimary("A");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("#H\000a4h");
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000A" + "'", str16, "\000\000A");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.appendPrimary("\000aA");
        doubleMetaphoneResult8.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult9.append('\000', 'h');
        doubleMetaphoneResult9.append('h', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44", "\000a\000A");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone(" Ai\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        java.lang.String str16 = doubleMetaphone0.encode("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("4hi", false);
        java.lang.String str19 = doubleMetaphone0.encode("#H\000a4h");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000a", "H4a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append("\000a", "4");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary('h');
        doubleMetaphoneResult7.append('a', 'i');
        java.lang.String str18 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4i" + "'", str18, "4i");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        int int22 = doubleMetaphone0.maxCodeLen;
        int int23 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '#' + "'", char21 == '#');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        char char10 = doubleMetaphone0.charAt("a4\000a", (int) ' ');
        int int11 = doubleMetaphone0.maxCodeLen;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44a", "\000aH4", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        doubleMetaphoneResult8.appendPrimary("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a4h" + "'", str17, "\000a4h");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str21 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000a4" + "'", str20, "\000a4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4" + "'", str21, "\000a4");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        java.lang.String str18 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.appendPrimary("\000a44");
        doubleMetaphoneResult8.appendPrimary("#");
        doubleMetaphoneResult8.append("hi!\000", "ia");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ah" + "'", str18, "\000ah");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\000" + "'", str19, "\000a\000");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = ' ';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4Hi", "\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        java.lang.String str28 = doubleMetaphoneResult27.getPrimary();
        java.lang.String str29 = doubleMetaphoneResult27.getPrimary();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("4##", (int) (byte) 10, (int) (short) 10, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", 35, 0, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("4##i", (int) '\000', (int) (short) 1, strArray23);
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.append('H', 'H');
        doubleMetaphoneResult8.append("\0004a4", "\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        doubleMetaphoneResult8.append('h');
        java.lang.String str15 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " Ah" + "'", str15, " Ah");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        doubleMetaphoneResult8.append("4#A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        boolean boolean20 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000a" + "'", str15, "\000a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000aa4" + "'", str19, "\000aa4");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000\000\000", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000#", "\000a4 ");
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendPrimary("\000a4");
        doubleMetaphoneResult7.appendAlternate("\000#");
        doubleMetaphoneResult7.append("\000a44", "\000aa4");
        doubleMetaphoneResult7.append("# 4", "\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char18 = doubleMetaphone0.charAt("\000\000\000", 0);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000\000\000");
        char char23 = doubleMetaphone0.charAt("\000aAi", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphoneResult13.append("\000\000A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000\000\000", "\000aH4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        boolean boolean13 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.append('h', '4');
        doubleMetaphoneResult12.append("\000ah", "\000\000\000");
        java.lang.String str20 = doubleMetaphoneResult12.getAlternate();
        doubleMetaphoneResult12.append(' ');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4\000\000\000" + "'", str20, "4\000\000\000");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        int int22 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.maxCodeLen;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\000aa\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        int int8 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        int int20 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int23 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        java.lang.String str21 = doubleMetaphone0.encode("\000aHa");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AH" + "'", str21, "AH");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        doubleMetaphoneResult8.append('\000', '4');
        doubleMetaphoneResult8.appendAlternate('i');
        java.lang.String str27 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000a\000\000" + "'", str27, "\000a\000\000");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aAH", (int) 'a', (int) ' ', strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000", 1, (int) '4', strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000ahi", (int) '#', 100, strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) -1, (int) 'i', strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\0004a4", (int) '4', (int) 'i', strArray26);
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
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult11.append("\000a\000a", "hi!");
        doubleMetaphoneResult11.appendAlternate("4hi");
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray21);
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) "H");
        char char27 = doubleMetaphone0.charAt(" Ah", (int) 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a#\000", (int) 'i', (int) (byte) 100, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        doubleMetaphoneResult8.append("\000a4", "\000\000");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        java.lang.String str21 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode(obj24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        doubleMetaphoneResult8.appendPrimary("\000 a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("4H");
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen(52);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char18 = doubleMetaphone0.charAt("\000\000\000", 0);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000\000\000");
        char char23 = doubleMetaphone0.charAt("4#A", 10);
        doubleMetaphone0.maxCodeLen = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult14.append("4#", "\000aA\000");
        boolean boolean18 = doubleMetaphoneResult14.isComplete();
        doubleMetaphoneResult14.append("\000\000aA", "\000aH\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("4");
        java.lang.String str12 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        char char9 = doubleMetaphone0.charAt("\000ah", (int) (byte) 0);
        java.lang.String str11 = doubleMetaphone0.encode("\000aA");
        int int12 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        doubleMetaphoneResult8.append('H', 'H');
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H4a" + "'", str16, "H4a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H4ah" + "'", str22, "H4ah");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a4 " + "'", str23, "\000a4 ");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('#');
        doubleMetaphoneResult8.append("4#");
        doubleMetaphoneResult8.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aA" + "'", str21, "\000aA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000aA" + "'", str22, "\000aA");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult7.appendPrimary('4');
        doubleMetaphoneResult7.appendPrimary('H');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        char char16 = doubleMetaphone0.charAt("\000a4h", (-1));
        int int17 = doubleMetaphone0.getMaxCodeLen();
        char char20 = doubleMetaphone0.charAt("\000 \000a", (int) 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("4\000a");
        doubleMetaphoneResult8.appendAlternate('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000A", "\000ah4", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult17.append("4#");
        java.lang.String str20 = doubleMetaphoneResult17.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4#" + "'", str20, "4#");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (short) 10;
        java.lang.Class<?> wildcardClass6 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a", true);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone(" Ai", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.lang.String str18 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000a" + "'", str18, "\000a");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str11 = doubleMetaphoneResult10.getPrimary();
        doubleMetaphoneResult10.append('a', '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a#\000", "4");
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
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000aAh", true);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "\000a");
        char char13 = doubleMetaphone0.charAt("aH\000", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "A" + "'", obj10, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'H' + "'", char13 == 'H');
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        int int13 = doubleMetaphone0.maxCodeLen;
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("#", false);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "\000a44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.appendPrimary("");
        doubleMetaphoneResult4.appendPrimary("#H");
        java.lang.String str11 = doubleMetaphoneResult4.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000ah" + "'", str11, "\000ah");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000ah" + "'", str12, "\000ah");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("a4\000a", "\000ah", true);
        doubleMetaphone0.setMaxCodeLen(0);
        int int20 = doubleMetaphone0.maxCodeLen;
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000aH\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        java.lang.Class<?> wildcardClass11 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000a4 ", false);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.encode("i");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult13.appendPrimary("a");
        doubleMetaphoneResult13.append("\000a# ");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000a", true);
        java.lang.String str17 = doubleMetaphone0.encode("hi!i");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH#", "H4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        java.lang.String str8 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('i', '\000');
        boolean boolean12 = doubleMetaphoneResult4.isComplete();
        doubleMetaphoneResult4.appendAlternate("4\000a");
        java.lang.String str15 = doubleMetaphoneResult4.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#\0004\000a" + "'", str15, "#\0004\000a");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('i');
        doubleMetaphoneResult8.appendPrimary('h');
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.append('\000', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate("H");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("#H");
        doubleMetaphoneResult8.appendPrimary("4");
        doubleMetaphoneResult8.append("\000aa\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a4H" + "'", str19, "\000a4H");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.append("\000aH\000", "\000aa");
        boolean boolean17 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        doubleMetaphoneResult8.append("\000a4H", "\000\0004#");
        doubleMetaphoneResult8.append(' ', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " \0004" + "'", str14, " \0004");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', '4');
        doubleMetaphoneResult10.appendPrimary(' ');
        doubleMetaphoneResult10.appendAlternate("a4\000a");
        doubleMetaphoneResult10.append("4#\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        int int13 = doubleMetaphone0.maxCodeLen;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000\000");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("A", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000a");
        char char17 = doubleMetaphone0.charAt("hi!", (-1));
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000a", " h\000a", true);
        java.lang.Class<?> wildcardClass22 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44", "\000a44");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        char char13 = doubleMetaphone0.charAt("\000aha", (int) (short) 1);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = doubleMetaphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'a' + "'", char13 == 'a');
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H4a4", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean11 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.appendPrimary('\000');
        doubleMetaphoneResult10.appendAlternate("4a4\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult14.appendPrimary('i');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.appendAlternate('\000');
        doubleMetaphoneResult8.append("", "hi!");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('a', '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        doubleMetaphone0.maxCodeLen = '\000';
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "H4a4");
        doubleMetaphone0.maxCodeLen = 104;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        boolean boolean32 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000aa4");
        java.lang.String str35 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\000a\0004" + "'", str35, "\000a\0004");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        doubleMetaphoneResult20.append("\000a4 ");
        doubleMetaphoneResult20.append('\000');
        doubleMetaphoneResult20.appendPrimary('4');
        doubleMetaphoneResult20.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH", "hi!\000", true);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append("\000aHa", "hi!");
        java.lang.String str30 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a \000" + "'", str30, "\000a \000");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.maxCodeLen = 'H';
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44a", "H44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        doubleMetaphone0.setMaxCodeLen(10);
        int int27 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        java.lang.String str26 = doubleMetaphone0.encode("\000\000");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("\000aH4", false);
        doubleMetaphone0.maxCodeLen = 'h';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("a", "# 4");
        doubleMetaphoneResult8.append("4Hi", "\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        char char17 = doubleMetaphone0.charAt("\000aA", (int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("i", "i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000a4" + "'", str18, "\000a4");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.appendPrimary("4#4i");
        boolean boolean17 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(1);
        char char19 = doubleMetaphone0.charAt("4\000a", 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.append("\000aHa");
        boolean boolean22 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('H', 'a');
        doubleMetaphoneResult8.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        doubleMetaphoneResult8.append("hi!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000" + "'", str24, "\000a\000");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.appendAlternate("\000a4h");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a#\000" + "'", str19, "\000a#\000");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a4", "\000aH", false);
        char char21 = doubleMetaphone0.charAt("aH\000\000\000aH\0004", (int) (byte) 0);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000 \000a", "\000\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + 'a' + "'", char21 == 'a');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "\000a\0004");
        char char12 = doubleMetaphone0.charAt("\000h", 1);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'h' + "'", char12 == 'h');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H4a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen(32);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        doubleMetaphoneResult8.append("\000a \000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        doubleMetaphoneResult8.appendPrimary("\000\000A");
        doubleMetaphoneResult8.append('i', 'H');
        doubleMetaphoneResult8.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        doubleMetaphoneResult8.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("aH");
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 52;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        java.lang.String str16 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str18 = doubleMetaphone0.encode("\000a44");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ahi", "\000aH");
        java.lang.String str23 = doubleMetaphone0.encode("\0004a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate("\000");
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\0004\000" + "'", str16, "\0004\000");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        int int13 = doubleMetaphone0.maxCodeLen;
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) "4#\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("\000\000");
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a", true);
        java.lang.String str19 = doubleMetaphone0.encode("#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean22 = doubleMetaphoneResult21.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = ' ';
        doubleMetaphone0.maxCodeLen = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        doubleMetaphoneResult8.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        doubleMetaphoneResult8.append('4', '\000');
        doubleMetaphoneResult8.append(' ', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.lang.String[] strArray19 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000", (int) '4', 1, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a#", (int) 'i', (int) (short) 1, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aAH", (int) (byte) 100, (int) (byte) -1, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\0004a", (int) (short) 1, 0, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        java.lang.String str25 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append(" Ai", "\000\000");
        doubleMetaphoneResult8.appendAlternate("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.append("aH", "4#4");
        boolean boolean18 = doubleMetaphoneResult13.isComplete();
        java.lang.String str19 = doubleMetaphoneResult13.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "aH" + "'", str19, "aH");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000\000\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000aH\000" + "'", str20, "\000aH\000");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str18 = doubleMetaphone0.encode("\000a44");
        int int19 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 0;
        doubleMetaphone0.maxCodeLen = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult14.append("4#", "\000aA\000");
        boolean boolean18 = doubleMetaphoneResult14.isComplete();
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("");
        boolean boolean21 = doubleMetaphone14.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str23 = doubleMetaphone14.doubleMetaphone("");
        int int24 = doubleMetaphone14.getMaxCodeLen();
        java.lang.String str26 = doubleMetaphone14.encode("\0004");
        java.lang.String str28 = doubleMetaphone14.doubleMetaphone("# 4");
        java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) str28);
        int int30 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual("#H\000a4h", "a4\000a", false);
        java.lang.String str37 = doubleMetaphone0.doubleMetaphone("\000a4", false);
        java.lang.Class<?> wildcardClass38 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("H4a\000", true);
        int int28 = doubleMetaphone0.maxCodeLen;
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("\000aa\000", true);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        doubleMetaphoneResult8.append('i', 'i');
        doubleMetaphoneResult8.append('\000', ' ');
        boolean boolean19 = doubleMetaphoneResult8.isComplete();
        java.lang.String str20 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('h', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " Ai\000" + "'", str20, " Ai\000");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\0004\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult10.appendAlternate("\000aAi");
        doubleMetaphoneResult10.append('#', '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.lang.String[] strArray16 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", (int) 'a', (int) (byte) 10, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!a", 100, (int) '\000', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aha", 0, (int) (byte) 1, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        doubleMetaphoneResult4.appendPrimary('4');
        java.lang.String str10 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append("\000a4", "44");
        java.lang.String str14 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\0004" + "'", str10, "\0004");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\0004\000a4" + "'", str14, "\0004\000a4");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        int int25 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "i", true);
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("\0004\000");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a\000a" + "'", str21, "\000a\000a");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('h');
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.append("#\000");
        doubleMetaphoneResult8.appendPrimary("4a4\000");
        boolean boolean22 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('a', '\000');
        doubleMetaphoneResult10.appendAlternate('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "A", true);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "H4H", false);
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("Hi4\000aH", " Ai\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "4H");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000a \000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        doubleMetaphoneResult8.appendPrimary('#');
        doubleMetaphoneResult8.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "H");
        int int12 = doubleMetaphone0.maxCodeLen;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(32);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult11.append("Hi4\000aH", "#H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult15.append('4', 'i');
        doubleMetaphoneResult15.append('h', 'h');
        doubleMetaphoneResult15.appendAlternate("Hi4\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        char char7 = doubleMetaphone0.charAt("\0004", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000aH\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("aH");
        java.lang.Class<?> wildcardClass11 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.appendAlternate('H');
        doubleMetaphoneResult10.appendPrimary("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        doubleMetaphoneResult8.appendPrimary("\000a\000");
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", (int) '#', 100, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 105, 32, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA", (int) 'h', (int) (byte) 1, strArray23);
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
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        java.lang.String str32 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("\000\0004#");
        doubleMetaphoneResult8.appendAlternate('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000a\0004" + "'", str32, "\000a\0004");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\000a44", "");
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('H', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.appendPrimary("\000");
        doubleMetaphoneResult8.appendPrimary("\000a\000\000");
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.appendPrimary("4#4i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), (int) 'a', strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) ' ', strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a44", (int) 'h', (int) 'a', strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("4h", 0, 1, strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", 0, (int) '\000', strArray26);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult10.appendPrimary('h');
        doubleMetaphoneResult10.appendPrimary('\000');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "H");
        doubleMetaphone0.setMaxCodeLen(32);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        doubleMetaphoneResult8.appendPrimary('H');
        doubleMetaphoneResult8.appendAlternate("\0004a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) 'h', (int) '\000', strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Ai", (int) (byte) 0, 10, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", (int) (byte) 10, 105, strArray20);
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
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult13.appendPrimary('a');
        doubleMetaphoneResult13.appendPrimary("\000aH");
        doubleMetaphoneResult13.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        char char14 = doubleMetaphone0.charAt("\000#\000aa4", (int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.append("\000a\0004");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str18 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000a\000" + "'", str17, "\000\000a\000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000\000a\000" + "'", str18, "\000\000a\000");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aHa", false);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        char char23 = doubleMetaphone0.charAt("4hi", 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '4' + "'", char23 == '4');
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult26.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        doubleMetaphone0.maxCodeLen = '\000';
        doubleMetaphone0.maxCodeLen = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult8.appendPrimary("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen(0);
        char char22 = doubleMetaphone0.charAt("H", 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a\000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "\000a\0004");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        char char14 = doubleMetaphone0.charAt("aH\000", (int) (short) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "A" + "'", obj10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000a\000");
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append("4#");
        doubleMetaphoneResult8.appendPrimary("\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate("H");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("\000aA\000i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a4H" + "'", str19, "\000a4H");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        doubleMetaphoneResult8.appendAlternate('h');
        java.lang.Class<?> wildcardClass37 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4 ");
        doubleMetaphoneResult8.appendAlternate('i');
        doubleMetaphoneResult8.appendAlternate(" Ah");
        doubleMetaphoneResult8.append('h', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.append("\000a#", "\000h");
        doubleMetaphoneResult9.append("aH\000\000\000aH\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "\000a4 ");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("4Hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000a\000h");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        java.lang.String str20 = doubleMetaphoneResult10.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphone0.maxCodeLen = '#';
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String[] strArray19 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) 'i', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 0, (int) 'h', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a\000", (int) (short) 0, 1, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        char char22 = doubleMetaphone0.charAt("\000aAA", 72);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000a4h");
        doubleMetaphone0.maxCodeLen = 1;
        char char11 = doubleMetaphone0.charAt("\000a4 ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("H4a\000", true);
        int int28 = doubleMetaphone0.maxCodeLen;
        char char31 = doubleMetaphone0.charAt("hi!i", (int) '#');
        doubleMetaphone0.maxCodeLen = 104;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult10.appendPrimary('h');
        doubleMetaphoneResult10.append('i', 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\000" + "'", str19, "\000a\000");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.maxCodeLen = (byte) 0;
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        doubleMetaphoneResult8.append("#H", " \0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 10, 100, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 105, (int) (short) 100, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) '4', 4, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("# 4", 10, (int) 'i', strArray23);
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
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), (int) 'a', strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'i', (int) (byte) 0, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains(" h\000a", 97, (int) ' ', strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\0004\000", (int) (short) 1, (int) '4', strArray23);
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
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a\000\000" + "'", str22, "\000a\000\000");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        char char7 = doubleMetaphone0.charAt("4##i", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 10);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000a4", false);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult13.appendPrimary('\000');
        doubleMetaphoneResult13.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char18 = doubleMetaphone0.charAt("\000\000\000", 0);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000\000\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        java.lang.String str24 = doubleMetaphone0.encode("#");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        char char19 = doubleMetaphone0.charAt("\000h", (int) '#');
        java.lang.String str21 = doubleMetaphone0.encode("#\000");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("H4a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        char char16 = doubleMetaphone0.charAt("\000aA\000", (int) (short) 0);
        int int17 = doubleMetaphone0.maxCodeLen;
        int int18 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = doubleMetaphone0.encode("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "H4a\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        char char14 = doubleMetaphone0.charAt(" Ai", (int) 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate("H");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("#H");
        doubleMetaphoneResult8.appendPrimary("4");
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendPrimary("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a4H" + "'", str19, "\000a4H");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("\000aH\000");
        char char27 = doubleMetaphone0.charAt("hi! ", (int) (short) 0);
        doubleMetaphone0.setMaxCodeLen(105);
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("\000aAH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'h' + "'", char27 == 'h');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000\000", true);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "\000a44");
        java.lang.String str17 = doubleMetaphone0.encode("\000#");
        doubleMetaphone0.setMaxCodeLen(1);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4#4", "H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        doubleMetaphone0.setMaxCodeLen(72);
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
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.lang.String[] strArray22 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", (int) 'a', (int) (byte) 10, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", 4, (int) (byte) 10, strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000ah", (int) (short) 0, (int) 'h', strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000", 0, 32, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hi!", 52, 97, strArray22);
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
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char18 = doubleMetaphone0.charAt("\000\000\000", 0);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000\000\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        java.lang.String str24 = doubleMetaphone0.encode("#");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!4", "\000aha", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        char char22 = doubleMetaphone0.charAt("\000a44", (int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("");
        boolean boolean21 = doubleMetaphone14.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str23 = doubleMetaphone14.doubleMetaphone("");
        int int24 = doubleMetaphone14.getMaxCodeLen();
        java.lang.String str26 = doubleMetaphone14.encode("\0004");
        java.lang.String str28 = doubleMetaphone14.doubleMetaphone("# 4");
        java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) str28);
        int int30 = doubleMetaphone0.getMaxCodeLen();
        int int31 = doubleMetaphone0.maxCodeLen;
        int int32 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        doubleMetaphoneResult8.append(" ", "\000a\000");
        java.lang.Class<?> wildcardClass30 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.appendAlternate('\000');
        doubleMetaphoneResult8.append("", "hi!");
        doubleMetaphoneResult8.appendAlternate("\0004");
        doubleMetaphoneResult8.append("\000a# ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult11.append("\000a\000a", "hi!");
        doubleMetaphoneResult11.appendAlternate("4hi");
        java.lang.String str17 = doubleMetaphoneResult11.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000a" + "'", str17, "\000a\000a");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append("\000a", "4");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('h');
        doubleMetaphoneResult7.appendPrimary('H');
        doubleMetaphoneResult7.appendAlternate("\000a#");
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) 'h', (int) '\000', strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, 4, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", 52, (int) (short) 100, strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("4hi", false);
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("4H");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" Ah", "", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        doubleMetaphone0.maxCodeLen = 0;
        int int17 = doubleMetaphone0.maxCodeLen;
        char char20 = doubleMetaphone0.charAt("4##", (int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        boolean boolean12 = doubleMetaphoneResult11.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int13 = doubleMetaphone0.maxCodeLen;
        char char16 = doubleMetaphone0.charAt("4hi", (int) (short) 10);
        int int17 = doubleMetaphone0.maxCodeLen;
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("4hi", "\000aH\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        doubleMetaphoneResult4.appendAlternate('#');
        doubleMetaphoneResult4.appendPrimary("\000a\0004");
        doubleMetaphoneResult4.appendAlternate("H4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000\000", true);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "\000a44");
        java.lang.String str17 = doubleMetaphone0.encode("\000#");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("4a4\000", "hi!a");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000", 1, (int) '4', strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Ah", 105, (int) (short) 1, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4H", 0, 97, strArray23);
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
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\000a4");
        java.lang.String str12 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("H4a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        doubleMetaphone0.maxCodeLen = '\000';
        java.lang.String str9 = doubleMetaphone0.encode("\000a\0004");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000A", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult7.append("\000aH\000", "\000ahi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        doubleMetaphoneResult8.append('a');
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a\000\000" + "'", str22, "\000a\000\000");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.appendAlternate('\000');
        doubleMetaphoneResult8.append("", "hi!");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        java.lang.String str22 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary(" h\000a");
        doubleMetaphoneResult8.append('a', ' ');
        doubleMetaphoneResult8.appendPrimary('#');
        doubleMetaphoneResult8.appendAlternate("\000 \000a");
        java.lang.Class<?> wildcardClass32 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000aH\000" + "'", str22, "\000aH\000");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "\000a4");
        java.lang.String str14 = doubleMetaphone0.encode("\000aAi");
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000a\000\000", false);
        int int15 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000a4h");
        doubleMetaphone0.maxCodeLen = 'i';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', '4');
        doubleMetaphoneResult10.append("#H\000a4h", "\000a44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        doubleMetaphoneResult4.appendAlternate('#');
        doubleMetaphoneResult4.appendAlternate("H4a\000");
        doubleMetaphoneResult4.append('a', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary('a');
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append("A", "hi!");
        doubleMetaphoneResult8.appendAlternate('#');
        doubleMetaphoneResult8.appendPrimary("\000#\000aa4");
        java.lang.String str22 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a\000a" + "'", str22, "\000a\000a");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        char char17 = doubleMetaphone0.charAt("4##", (int) (byte) 10);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone(" Ai");
        int int21 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        char char10 = doubleMetaphone0.charAt("hi!", 32);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000\000A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "H");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        char char15 = doubleMetaphone0.charAt("4#\000a", 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '#' + "'", char15 == '#');
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000ah");
        java.lang.String str10 = doubleMetaphone0.encode("\000aH\000");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4#", "# 4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        java.lang.String str33 = doubleMetaphone0.encode("\000aAi");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("# 4", (int) (short) 10, (int) (byte) 1, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("#\000", (int) (byte) 100, (-1), strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000\000", (int) (short) 1, (int) (byte) 100, strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "\000a\0004");
        java.lang.String str13 = doubleMetaphone0.encode("\000a44");
        char char16 = doubleMetaphone0.charAt("\000aAH", (int) 'a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        doubleMetaphoneResult4.appendPrimary('4');
        doubleMetaphoneResult4.append("\000\0004#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "H4a\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        doubleMetaphoneResult8.append('H', '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H4a4" + "'", str18, "H4a4");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a\000", false);
        char char13 = doubleMetaphone0.charAt("\000a4\000", 97);
        char char16 = doubleMetaphone0.charAt("\000aH4", (int) 'i');
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        java.lang.String str13 = doubleMetaphoneResult12.getPrimary();
        doubleMetaphoneResult12.appendAlternate('i');
        doubleMetaphoneResult12.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((-1));
        int int15 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        int int19 = doubleMetaphone0.maxCodeLen;
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("4#A", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        doubleMetaphoneResult10.append("4");
        doubleMetaphoneResult10.append('H');
        boolean boolean27 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aAH", "\0004\000a4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        char char12 = doubleMetaphone0.charAt("a", (int) (short) 0);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\000a\000", "\000aa");
        int int16 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        doubleMetaphoneResult8.appendAlternate("\000a\000\000");
        doubleMetaphoneResult8.appendAlternate("hi!a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H4a4" + "'", str18, "H4a4");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        java.lang.String str26 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str27 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000a4h" + "'", str26, "\000a4h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000aHa" + "'", str27, "\000aHa");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.appendPrimary("H4a\000");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aH4" + "'", str18, "\000aH4");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('#', '4');
        doubleMetaphoneResult8.append("\000aA");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        doubleMetaphoneResult8.append('a');
        java.lang.String str23 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000aH\000" + "'", str23, "\000aH\000");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        java.lang.String str19 = doubleMetaphone0.encode("#\0004H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.append("aH", "4#4");
        doubleMetaphoneResult13.append("\000a\0004");
        doubleMetaphoneResult13.append("\000aA\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("\000aH", (int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH#", "\000aha", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        doubleMetaphoneResult8.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        doubleMetaphoneResult8.appendPrimary("\000aAA");
        doubleMetaphoneResult8.append("H4a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000aH\000", true);
        java.lang.String str12 = doubleMetaphone0.encode("\000aA");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "A");
        doubleMetaphone0.setMaxCodeLen(35);
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        java.lang.String str8 = doubleMetaphone0.encode("A");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult7.append("\000aAH", "4hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000" + "'", str16, "\000");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        doubleMetaphoneResult8.append('i');
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("aH\000aHa", "\000a 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000aA\000" + "'", str24, "\000aA\000");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("");
        boolean boolean21 = doubleMetaphone14.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str23 = doubleMetaphone14.doubleMetaphone("");
        int int24 = doubleMetaphone14.getMaxCodeLen();
        java.lang.String str26 = doubleMetaphone14.encode("\0004");
        java.lang.String str28 = doubleMetaphone14.doubleMetaphone("# 4");
        java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) str28);
        int int30 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("");
        int int33 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('4', '\000');
        doubleMetaphoneResult7.appendAlternate("4#4");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000a", true);
        java.lang.String str17 = doubleMetaphone0.encode("hi!i");
        doubleMetaphone0.maxCodeLen = 'H';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000a\000");
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        java.lang.String str18 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("i", false);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000#", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aAi");
        java.lang.String str12 = doubleMetaphone0.encode("\000#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "\000aa\000", false);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        doubleMetaphoneResult8.append("\000a44a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H4a\000" + "'", str18, "H4a\000");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        char char14 = doubleMetaphone0.charAt("\000#\000aa4", (int) 'i');
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH\000", "\000aHa");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("#\000", "4#", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("\0004a", false);
        java.lang.Class<?> wildcardClass26 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        doubleMetaphoneResult4.appendPrimary('4');
        java.lang.String str10 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\0004" + "'", str10, "\0004");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "H4a\000", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone(" \0004", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        int int21 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        boolean boolean19 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H4a" + "'", str16, "H4a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        char char13 = doubleMetaphone0.charAt("H4H", (int) (byte) -1);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        doubleMetaphoneResult8.appendAlternate("\0004a");
        doubleMetaphoneResult8.append("4\000");
        doubleMetaphoneResult8.appendPrimary("\000aAi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        char char7 = doubleMetaphone0.charAt("\0004", (int) (short) 0);
        char char10 = doubleMetaphone0.charAt("\000aAi", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000\000");
        char char20 = doubleMetaphone0.charAt("\000aA\000", (int) 'h');
        doubleMetaphone0.maxCodeLen = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 'h';
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        doubleMetaphoneResult8.appendAlternate("hi!");
        java.lang.String str28 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000aha" + "'", str28, "\000aha");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "H");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode(" Ai\000");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000aH#", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.lang.String[] strArray25 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("a4\000a", (-1), (int) (short) 1, strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '#', (int) (byte) -1, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000\000", 100, (-1), strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#", 97, (int) (short) 10, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("#\0004\000a", 104, (int) (short) 100, strArray25);
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
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000aAA", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH\000", "\000a#");
        java.lang.String str19 = doubleMetaphone0.encode("A");
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.encode("\0004");
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4 ");
        doubleMetaphoneResult8.appendAlternate('#');
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str20 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4hi!" + "'", str19, "4hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4hi!" + "'", str20, "4hi!");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", (int) (byte) 10, (int) '\000', strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 1, 97, strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        char char14 = doubleMetaphone0.charAt("4#", (int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        java.lang.String str20 = doubleMetaphone17.doubleMetaphone("");
        java.lang.String str23 = doubleMetaphone17.doubleMetaphone("hi!", false);
        int int24 = doubleMetaphone17.maxCodeLen;
        boolean boolean28 = doubleMetaphone17.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str30 = doubleMetaphone17.encode("4");
        doubleMetaphone17.setMaxCodeLen((int) (byte) 1);
        boolean boolean35 = doubleMetaphone17.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str38 = doubleMetaphone17.doubleMetaphone("\000a4", true);
        java.lang.String str40 = doubleMetaphone17.doubleMetaphone("hi!\000");
        java.lang.Class<?> wildcardClass41 = doubleMetaphone17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = doubleMetaphone0.encode((java.lang.Object) wildcardClass41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "A" + "'", str38, "A");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H" + "'", str40, "H");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        char char8 = doubleMetaphone0.charAt("", 0);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) strArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 10;
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        doubleMetaphoneResult8.append('#');
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.append('a', 'i');
        doubleMetaphoneResult8.append("4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000h" + "'", str18, "\000h");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('h', '\000');
        doubleMetaphoneResult8.appendPrimary('H');
        java.lang.String str27 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a\000a" + "'", str21, "\000a\000a");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000a\000a" + "'", str27, "\000a\000a");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.append("\000aa");
        java.lang.String str18 = doubleMetaphoneResult8.getAlternate();
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000a\000a" + "'", str18, "\000a\000a");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 'i';
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H4ah", "#\000", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 105 + "'", int9 == 105);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }
}

