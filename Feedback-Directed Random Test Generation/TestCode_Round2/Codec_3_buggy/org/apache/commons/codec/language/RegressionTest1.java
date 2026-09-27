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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = '#';
        doubleMetaphone0.setMaxCodeLen((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004a", "AH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "\000", true);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        doubleMetaphoneResult8.append(" Ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        doubleMetaphoneResult23.append('i');
        doubleMetaphoneResult23.appendAlternate("#\000");
        doubleMetaphoneResult23.appendPrimary('H');
        doubleMetaphoneResult23.append("hi!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        doubleMetaphone0.maxCodeLen = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = doubleMetaphone0.doubleMetaphone("\000aA");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        doubleMetaphoneResult8.appendAlternate('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        doubleMetaphoneResult8.append("hi!");
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000a4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        int int21 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.appendPrimary("");
        doubleMetaphoneResult4.appendPrimary("#H");
        doubleMetaphoneResult4.appendAlternate("\000#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append("", "A");
        doubleMetaphoneResult8.appendAlternate("\000a\0004");
        doubleMetaphoneResult8.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\000a4h");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("i", "\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        doubleMetaphoneResult8.append("\000a#", "#H");
        doubleMetaphoneResult8.appendPrimary("\000a4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000#", true);
        doubleMetaphone0.maxCodeLen = 32;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        boolean boolean15 = doubleMetaphone11.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str17 = doubleMetaphone11.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone11.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult19.append('\000');
        java.lang.String str22 = doubleMetaphoneResult19.getPrimary();
        doubleMetaphoneResult19.appendPrimary("");
        doubleMetaphoneResult19.append('h');
        java.lang.String str27 = doubleMetaphoneResult19.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000" + "'", str22, "\000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000h" + "'", str27, "\000h");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        java.lang.String str9 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("\000a44");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a", false);
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate("\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\0004" + "'", str16, "\0004");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.Class<?> wildcardClass10 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        boolean boolean19 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.append("H");
        doubleMetaphoneResult10.append("\000a4h", "\000\000");
        doubleMetaphoneResult10.appendAlternate("\000aH\000");
        doubleMetaphoneResult10.append('4');
        java.lang.String str23 = doubleMetaphoneResult10.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "aH\000\000\000aH\0004" + "'", str23, "aH\000\000\000aH\0004");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        java.lang.String str11 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('h', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 100, 0, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#", 0, 35, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (-1), strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        doubleMetaphoneResult10.appendPrimary("\000a4h");
        boolean boolean13 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 35;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        char char10 = doubleMetaphone0.charAt("hi!", 32);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "\000a4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        doubleMetaphone0.maxCodeLen = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("\000a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "a4\000a");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = doubleMetaphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("\000aAi");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append("\000aA", "\000aHa");
        boolean boolean17 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        doubleMetaphoneResult8.append('\000', '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('H', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah4", "\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.append('\000', '4');
        boolean boolean22 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.append('4', '\000');
        doubleMetaphoneResult8.appendAlternate("#\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a\0004" + "'", str22, "\000a\0004");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        java.lang.String str21 = doubleMetaphoneResult10.getPrimary();
        doubleMetaphoneResult10.append("\0004a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("H4a", true);
        int int17 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append("\000a", "4");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('h');
        doubleMetaphoneResult7.appendAlternate("4\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.String[] strArray16 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", (int) (byte) 1, (int) (short) 0, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("4##", 32, 97, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000a\000h");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.append("4hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000a4", false);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        boolean boolean15 = doubleMetaphone11.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str17 = doubleMetaphone11.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone11.new DoubleMetaphoneResult(4);
        char char22 = doubleMetaphone11.charAt("hi!", (int) 'a');
        java.lang.String str24 = doubleMetaphone11.encode("\000");
        doubleMetaphone11.setMaxCodeLen((int) (short) 100);
        char char29 = doubleMetaphone11.charAt("\000\000\000", 0);
        java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) "\000\000\000");
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "H4a", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.maxCodeLen;
        boolean boolean14 = doubleMetaphone9.isDoubleMetaphoneEqual("H", "\000a", true);
        int int15 = doubleMetaphone9.getMaxCodeLen();
        int int16 = doubleMetaphone9.maxCodeLen;
        doubleMetaphone9.setMaxCodeLen(32);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone9.new DoubleMetaphoneResult((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        doubleMetaphoneResult4.appendPrimary('4');
        doubleMetaphoneResult4.appendAlternate("H4a");
        doubleMetaphoneResult4.appendPrimary("\000\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a\000", 105, 97, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 100, 0, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000a", (int) 'a', (int) (byte) 100, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("4", (-1), (int) (byte) -1, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", (-1), (int) (byte) 100, strArray23);
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.appendPrimary("4#4");
        java.lang.String str15 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        doubleMetaphoneResult8.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        doubleMetaphoneResult8.append('i', 'i');
        doubleMetaphoneResult8.append("\0004a", "\000\000A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.maxCodeLen;
        boolean boolean12 = doubleMetaphone8.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str14 = doubleMetaphone8.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone8.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult16.append("H", "\000a");
        doubleMetaphoneResult16.append("4");
        doubleMetaphoneResult16.appendPrimary('a');
        doubleMetaphoneResult16.append("4#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        int int26 = doubleMetaphone0.maxCodeLen;
        int int27 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str30 = doubleMetaphone0.doubleMetaphone("aH", false);
        java.lang.Class<?> wildcardClass31 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A" + "'", str30, "A");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.append("H");
        doubleMetaphoneResult10.append("\000a4h", "\000\000");
        java.lang.String str19 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#H\000a4h" + "'", str19, "#H\000a4h");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("#H\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult14.appendAlternate("a");
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult14.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        doubleMetaphoneResult8.append("4#");
        doubleMetaphoneResult8.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "A", true);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000aH\000", false);
        char char21 = doubleMetaphone0.charAt("", (int) 'a');
        java.lang.Class<?> wildcardClass22 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        doubleMetaphoneResult8.append('\000', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a#" + "'", str19, "\000a#");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        java.lang.String str19 = doubleMetaphone0.encode("\000a\000");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\0004");
        int int23 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        doubleMetaphone0.maxCodeLen = '\000';
        int int8 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        java.lang.String str18 = doubleMetaphoneResult17.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        doubleMetaphone0.setMaxCodeLen(105);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("4#4i", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual(" Ai", "\000aa", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000aA\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("4#");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = doubleMetaphone15.maxCodeLen;
        java.lang.String str18 = doubleMetaphone15.doubleMetaphone("");
        java.lang.String str21 = doubleMetaphone15.doubleMetaphone("hi!", false);
        int int22 = doubleMetaphone15.maxCodeLen;
        boolean boolean26 = doubleMetaphone15.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str28 = doubleMetaphone15.encode("4");
        doubleMetaphone15.setMaxCodeLen((int) (byte) 1);
        int int31 = doubleMetaphone15.maxCodeLen;
        java.lang.String str33 = doubleMetaphone15.encode("\000");
        boolean boolean36 = doubleMetaphone15.isDoubleMetaphoneEqual("4#", "\000aHa");
        char char39 = doubleMetaphone15.charAt("", (int) '4');
        char char42 = doubleMetaphone15.charAt("a4\000a", (int) 'i');
        doubleMetaphone15.maxCodeLen = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\000' + "'", char42 == '\000');
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.append('#', '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000aA\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = doubleMetaphone13.maxCodeLen;
        boolean boolean17 = doubleMetaphone13.isDoubleMetaphoneEqual("hi!", "");
        int int18 = doubleMetaphone13.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("4##", (int) (byte) 10, (int) (short) 10, strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", 35, 0, strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 1, (int) (short) 0, strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 35, 0, strArray26);
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        java.lang.String str9 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("\000\000A");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendPrimary("\000\000\000");
        doubleMetaphoneResult7.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = doubleMetaphone0.doubleMetaphone("4#A");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), (int) 'a', strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H\000a4h", (int) 'h', (-1), strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str14 = doubleMetaphone0.encode("AH");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "\000a 4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000#", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = doubleMetaphone15.maxCodeLen;
        boolean boolean19 = doubleMetaphone15.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str21 = doubleMetaphone15.doubleMetaphone("");
        doubleMetaphone15.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone15.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean26 = doubleMetaphoneResult25.isComplete();
        doubleMetaphoneResult25.append('i', 'i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray30);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 100, (int) ' ', strArray30);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", (int) '4', 10, strArray30);
        java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) "a");
        char char38 = doubleMetaphone0.charAt("hi!a", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "A" + "'", obj35, "A");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\000' + "'", char38 == '\000');
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.setMaxCodeLen(10);
        doubleMetaphone0.maxCodeLen = 35;
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append("");
        doubleMetaphoneResult10.appendAlternate("\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.appendAlternate("hi!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = doubleMetaphone0.encode("4#A");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        boolean boolean28 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        doubleMetaphoneResult7.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        java.lang.String str15 = doubleMetaphone0.encode("\000#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult17.appendAlternate("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        java.lang.Class<?> wildcardClass29 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("# 4");
        char char15 = doubleMetaphone0.charAt("\000a", (int) (byte) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        doubleMetaphoneResult17.appendAlternate('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendAlternate('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        java.lang.Class<?> wildcardClass23 = doubleMetaphoneResult22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('4', 'i');
        doubleMetaphoneResult8.append("hi!a", "H44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("");
        boolean boolean21 = doubleMetaphone14.isDoubleMetaphoneEqual("H", "H", true);
        int int22 = doubleMetaphone14.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone14.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult24.append("\000", "H");
        doubleMetaphoneResult24.appendAlternate("4");
        doubleMetaphoneResult24.append('#');
        doubleMetaphoneResult24.append('\000', '#');
        doubleMetaphoneResult24.append("\000\000\000");
        java.lang.String str37 = doubleMetaphoneResult24.getPrimary();
        doubleMetaphoneResult24.appendAlternate('H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        int int6 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = doubleMetaphone0.encode("hi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 100, 0, strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '4', (int) 'i', strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "\0004", true);
        java.lang.Class<?> wildcardClass14 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        doubleMetaphone0.maxCodeLen = 35;
        char char17 = doubleMetaphone0.charAt("4#A", (int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '4' + "'", char17 == '4');
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult16.append('\000', '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (byte) 1, 0, strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000ah4", (int) 'h', 1, strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = doubleMetaphone0.doubleMetaphone("4H", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000a", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000a\000\000", false);
        int int12 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        doubleMetaphoneResult8.append('i', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("H4a");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("aH\000\000\000aH\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        char char14 = doubleMetaphone0.charAt("4#", (int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        boolean boolean17 = doubleMetaphoneResult16.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.encode("\000a4h");
        java.lang.String str13 = doubleMetaphone0.encode("\000\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        char char10 = doubleMetaphone0.charAt("4", (int) (short) 100);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append('h', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        doubleMetaphoneResult8.appendAlternate('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H4a\000" + "'", str18, "H4a\000");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        doubleMetaphoneResult8.append("i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ahi" + "'", str18, "\000ahi");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.Class<?> wildcardClass9 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 105 + "'", int11 == 105);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        doubleMetaphoneResult8.append("A");
        java.lang.Class<?> wildcardClass20 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult16.append('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000', '#');
        doubleMetaphoneResult8.appendPrimary("A");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000#" + "'", str17, "\000#");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("4H");
        doubleMetaphone0.setMaxCodeLen((int) '4');
        char char10 = doubleMetaphone0.charAt("4hi", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'h' + "'", char10 == 'h');
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a\000");
        char char13 = doubleMetaphone0.charAt("\000aAi", (int) (short) 1);
        doubleMetaphone0.maxCodeLen = 'H';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'a' + "'", char13 == 'a');
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        doubleMetaphoneResult8.append("4\000a");
        doubleMetaphoneResult8.append("A", "\0004a");
        doubleMetaphoneResult8.appendPrimary("H44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a4H" + "'", str19, "\000a4H");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', '4');
        doubleMetaphoneResult10.appendPrimary(' ');
        boolean boolean16 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.append('4', 'a');
        doubleMetaphoneResult8.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        java.lang.String str11 = doubleMetaphone0.encode("hi!");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000aH\000", false);
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char17 = doubleMetaphone0.charAt("\000aH\000", 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.lang.String str22 = doubleMetaphone0.encode("\000aa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "\000a\0004");
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.Class<?> wildcardClass14 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("\000aA");
        int int9 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "#H", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('4', '\000');
        java.lang.Class<?> wildcardClass15 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult8.appendAlternate("\000a\000");
        boolean boolean11 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        java.lang.String str11 = doubleMetaphone0.encode("hi!");
        java.lang.Class<?> wildcardClass12 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        doubleMetaphoneResult7.appendPrimary("\000aA\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        char char15 = doubleMetaphone11.charAt("hi!", (int) (byte) 100);
        int int16 = doubleMetaphone11.maxCodeLen;
        int int17 = doubleMetaphone11.getMaxCodeLen();
        int int18 = doubleMetaphone11.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        java.lang.String str20 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a4h" + "'", str17, "\000a4h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H4H" + "'", str20, "H4H");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', '4');
        doubleMetaphoneResult10.appendPrimary(' ');
        doubleMetaphoneResult10.append('4');
        doubleMetaphoneResult10.append("\000ah4", "\000h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("H4a\000");
        doubleMetaphoneResult8.append('a', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.lang.Class<?> wildcardClass29 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.String str21 = doubleMetaphoneResult10.getAlternate();
        java.lang.Class<?> wildcardClass22 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        doubleMetaphoneResult17.appendAlternate(' ');
        java.lang.String str22 = doubleMetaphoneResult17.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        doubleMetaphoneResult8.append('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.lang.String str20 = doubleMetaphoneResult10.getPrimary();
        doubleMetaphoneResult10.appendPrimary("4#4i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("4##i", "4#4i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.maxCodeLen;
        boolean boolean13 = doubleMetaphone9.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str15 = doubleMetaphone9.doubleMetaphone("");
        doubleMetaphone9.setMaxCodeLen(100);
        java.lang.Object obj19 = doubleMetaphone9.encode((java.lang.Object) "\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone9.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult21.append('h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) 'h');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "A" + "'", obj19, "A");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        doubleMetaphoneResult8.appendPrimary(" Ai");
        doubleMetaphoneResult8.appendAlternate("\000aH\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        doubleMetaphoneResult8.appendAlternate("a4\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000a\000" + "'", str17, "\000\000a\000");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.maxCodeLen;
        boolean boolean13 = doubleMetaphone9.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str15 = doubleMetaphone9.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone9.new DoubleMetaphoneResult(4);
        char char20 = doubleMetaphone9.charAt("\000a4h", (int) '4');
        doubleMetaphone9.maxCodeLen = 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int27 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\000a4", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000\0004#", true);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44", "\000aa", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        char char22 = doubleMetaphone0.charAt("\000\000A", 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        char char17 = doubleMetaphone0.charAt("\000a\000A", (int) 'i');
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult14.append('\000', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        java.lang.String str20 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("\000aA\000");
        doubleMetaphoneResult8.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000ah" + "'", str20, "\000ah");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        java.lang.String str11 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.append("aH");
        doubleMetaphoneResult7.append('H', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        java.lang.String str9 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("\000a4");
        java.lang.Class<?> wildcardClass12 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        doubleMetaphoneResult8.append("\000\000a\000");
        java.lang.String str29 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000a4 " + "'", str29, "\000a4 ");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000A", "\000ah4", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult17.append("# 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000aA\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("A");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000aH\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        doubleMetaphoneResult8.append("H", "\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append("\000aA\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult5.appendAlternate("aH");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000a4" + "'", str18, "\000a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\0004" + "'", str19, "\000a\0004");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a#\000", " Ai", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("aH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        boolean boolean21 = doubleMetaphone17.isDoubleMetaphoneEqual("hi!", "");
        int int22 = doubleMetaphone17.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a#", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int20 = doubleMetaphone19.maxCodeLen;
        boolean boolean24 = doubleMetaphone19.isDoubleMetaphoneEqual("hi!", "", true);
        int int25 = doubleMetaphone19.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("\000aH\000");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("hi!a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        doubleMetaphoneResult4.appendAlternate('#');
        doubleMetaphoneResult4.appendPrimary("\000a\0004");
        doubleMetaphoneResult4.appendAlternate("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String[] strArray13 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA", 0, (int) '4', strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000#\000aa4", 105, (int) 'H', strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate(" h\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a4h" + "'", str17, "\000a4h");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ia", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.append("#", "\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        doubleMetaphoneResult10.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        doubleMetaphoneResult10.appendPrimary("4##i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a4 ", false);
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(32);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str12 = doubleMetaphoneResult11.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        boolean boolean11 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("H4a\000");
        char char20 = doubleMetaphone0.charAt("#\000", 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('4', 'i');
        doubleMetaphoneResult8.appendAlternate('#');
        java.lang.Class<?> wildcardClass25 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\000" + "'", str17, "\000\000\000");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000" + "'", str16, "\000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000" + "'", str17, "\000");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append('i', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        boolean boolean28 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 10);
        char char12 = doubleMetaphone0.charAt("\000a4", (int) (short) -1);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("4#4");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.append('4', '\000');
        doubleMetaphoneResult8.append("4\000\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        boolean boolean13 = doubleMetaphoneResult12.isComplete();
        java.lang.String str14 = doubleMetaphoneResult12.getAlternate();
        doubleMetaphoneResult12.append('h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        char char13 = doubleMetaphone0.charAt("\000a4", (int) '\000');
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a\000", "\000a44");
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        doubleMetaphoneResult8.appendAlternate("\000#");
        doubleMetaphoneResult8.append('4', '4');
        doubleMetaphoneResult8.append('4', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (short) 10;
        doubleMetaphone0.maxCodeLen = 'i';
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        doubleMetaphoneResult17.append("\000\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("4##i", "\000a4#");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        int int16 = doubleMetaphone0.maxCodeLen;
        char char19 = doubleMetaphone0.charAt(" Ah", 105);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        char char10 = doubleMetaphone0.charAt("\000a\000A", 4);
        java.lang.String str12 = doubleMetaphone0.encode("\000aa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("4hi", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("\000a\000a");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("a4\000a", "4#4i", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "4H");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str20 = doubleMetaphone0.encode("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        doubleMetaphoneResult8.appendPrimary("\000a4\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!\000" + "'", str22, "hi!\000");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "H");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("hi!i", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("4#A", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append("\000aA", "\000aHa");
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a4\000" + "'", str17, "\000a4\000");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        boolean boolean26 = doubleMetaphoneResult21.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        char char10 = doubleMetaphone0.charAt("4", (int) (short) 100);
        char char13 = doubleMetaphone0.charAt("a4\000a", (int) (byte) 10);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("4\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\0004a4" + "'", str21, "\0004a4");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.append("\000a#", "\000h");
        doubleMetaphoneResult9.appendAlternate("4#");
        doubleMetaphoneResult9.append('h', '4');
        doubleMetaphoneResult9.appendAlternate("\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = doubleMetaphone12.maxCodeLen;
        boolean boolean16 = doubleMetaphone12.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str18 = doubleMetaphone12.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone12.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult20.append("H", "\000a");
        doubleMetaphoneResult20.append("4");
        doubleMetaphoneResult20.appendPrimary('a');
        java.lang.String str28 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.append('h');
        doubleMetaphoneResult20.appendPrimary("\000a\000A");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H4a" + "'", str28, "H4a");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("4##i", "H4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        doubleMetaphoneResult8.append("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphone0.setMaxCodeLen(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.appendPrimary("");
        doubleMetaphoneResult4.appendPrimary("#H");
        doubleMetaphoneResult4.appendAlternate("ia");
        java.lang.Class<?> wildcardClass13 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ah" + "'", str18, "\000ah");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000ah" + "'", str19, "\000ah");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult14.append('4');
        doubleMetaphoneResult14.append("4#4", "H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        java.lang.String str30 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a\0004" + "'", str30, "\000a\0004");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.encode("\000#");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\000");
        int int13 = doubleMetaphone0.maxCodeLen;
        char char16 = doubleMetaphone0.charAt("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000aA\000" + "'", str22, "\000aA\000");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("#H", "4#");
        doubleMetaphoneResult8.appendAlternate("\000a\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a" + "'", str14, "\000a");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int18 = doubleMetaphone0.getMaxCodeLen();
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char17 = doubleMetaphone0.charAt("4#4", 4);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a44", "\000\000\000");
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH\000", "4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "#\000");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\000aA", "H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "\000a4 ");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("4#", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("#H\000a4h");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000ah4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        char char19 = doubleMetaphone0.charAt("\000a", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'a' + "'", char19 == 'a');
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        java.lang.Class<?> wildcardClass10 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000aH\000", true);
        java.lang.String str12 = doubleMetaphone0.encode("\000aA");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        doubleMetaphone0.maxCodeLen = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        java.lang.String str23 = doubleMetaphoneResult10.getPrimary();
        boolean boolean24 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.append('4');
        java.lang.String str27 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("4#4", "\000aHa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ah" + "'", str18, "\000ah");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\000" + "'", str19, "\000a\000");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        doubleMetaphoneResult8.append("A");
        doubleMetaphoneResult8.append("\000a\000");
        doubleMetaphoneResult8.appendPrimary("4#4i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        java.lang.String str24 = doubleMetaphoneResult8.getAlternate();
        boolean boolean25 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('4', '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\0004" + "'", str24, "\000a\0004");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "H");
        char char11 = doubleMetaphone0.charAt("#", (int) (short) 100);
        doubleMetaphone0.maxCodeLen = 10;
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        doubleMetaphoneResult8.appendAlternate('\000');
        doubleMetaphoneResult8.appendPrimary(" h\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        doubleMetaphoneResult8.appendAlternate('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        char char16 = doubleMetaphone0.charAt(" h\000a", 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + ' ' + "'", char16 == ' ');
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "\000");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 10;
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        doubleMetaphoneResult12.append("i", "4");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("aH");
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        doubleMetaphoneResult8.append(" h\000a");
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000a#\000" + "'", str20, "\000a#\000");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray30);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 100, (int) ' ', strArray30);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", (int) '4', 10, strArray30);
        java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) "a");
        doubleMetaphone0.maxCodeLen = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "A" + "'", obj35, "A");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        doubleMetaphoneResult17.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ia" + "'", str17, "ia");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        char char16 = doubleMetaphone0.charAt("\000a4h", (-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int22 = doubleMetaphone21.maxCodeLen;
        java.lang.String str24 = doubleMetaphone21.doubleMetaphone("");
        java.lang.String str27 = doubleMetaphone21.doubleMetaphone("hi!", false);
        int int28 = doubleMetaphone21.maxCodeLen;
        boolean boolean32 = doubleMetaphone21.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str34 = doubleMetaphone21.encode("4");
        doubleMetaphone21.setMaxCodeLen((int) (byte) 1);
        int int37 = doubleMetaphone21.maxCodeLen;
        boolean boolean40 = doubleMetaphone21.isDoubleMetaphoneEqual("\0004", "\000aHa");
        doubleMetaphone21.maxCodeLen = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        char char16 = doubleMetaphone0.charAt("\000a4h", (-1));
        int int17 = doubleMetaphone0.maxCodeLen;
        int int18 = doubleMetaphone0.getMaxCodeLen();
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendPrimary("\000\000");
        doubleMetaphoneResult8.append("\000a\000", "\000a\000h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.append("H4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000aA\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("4#");
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        doubleMetaphoneResult8.append("\0004\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000" + "'", str24, "\000a\000");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000a\000\000", false);
        int int15 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult17.appendAlternate('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        char char15 = doubleMetaphone0.charAt("\000#", (int) (byte) 0);
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        doubleMetaphoneResult8.append("\000h", "hi!\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.append('h', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        doubleMetaphoneResult8.appendAlternate("\0004a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000a\000\000", false);
        int int15 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult17.append("AH", "\000aa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        doubleMetaphoneResult8.appendAlternate("4hi!");
        doubleMetaphoneResult8.append('4', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4h" + "'", str21, "\000a4h");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000a4", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("a4\000a", "\000a\000h", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        java.lang.String str8 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        doubleMetaphone0.setMaxCodeLen(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.append("aH", "4#4");
        doubleMetaphoneResult13.appendAlternate("\000ah4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('\000', 'a');
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a4\000" + "'", str23, "\000a4\000");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000a4 ", false);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.encode("i");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult13.appendPrimary("a");
        doubleMetaphoneResult13.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aA\000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.maxCodeLen;
        char char12 = doubleMetaphone8.charAt("hi!", (int) (byte) 100);
        char char15 = doubleMetaphone8.charAt("", (int) (byte) 100);
        java.lang.String str18 = doubleMetaphone8.doubleMetaphone("\000a4h", false);
        doubleMetaphone8.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        java.lang.String str8 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('i', '\000');
        boolean boolean12 = doubleMetaphoneResult4.isComplete();
        java.lang.String str13 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('4', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#\000" + "'", str13, "#\000");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        doubleMetaphoneResult17.appendPrimary("\000aa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000aA");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a\000");
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.appendAlternate("\000a4h");
        doubleMetaphoneResult8.append("\0004\000", "\000a4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate("4\000\000\000");
        doubleMetaphoneResult8.append("\000a#\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.lang.String str23 = doubleMetaphone0.encode("\0004a");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("\000a4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        char char13 = doubleMetaphone0.charAt("", 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        doubleMetaphoneResult8.append("H", "A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append("", "A");
        doubleMetaphoneResult8.appendAlternate("\000a\0004");
        doubleMetaphoneResult8.appendPrimary("\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "\000a4");
        java.lang.String str14 = doubleMetaphone0.encode("\000aAi");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        boolean boolean22 = doubleMetaphone17.isDoubleMetaphoneEqual("hi!", "", true);
        int int23 = doubleMetaphone17.getMaxCodeLen();
        char char26 = doubleMetaphone17.charAt("H4a\000", (int) (short) 1);
        java.lang.String str28 = doubleMetaphone17.doubleMetaphone("H");
        java.lang.String str30 = doubleMetaphone17.encode("\000a#\000");
        boolean boolean33 = doubleMetaphone17.isDoubleMetaphoneEqual("\000aa\000", "\000a\000A");
        java.lang.String str35 = doubleMetaphone17.doubleMetaphone("4##");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '4' + "'", char26 == '4');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A" + "'", str30, "A");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\000a4 ", (int) (byte) 1);
        doubleMetaphone0.maxCodeLen = (short) 10;
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        doubleMetaphoneResult23.append('i');
        boolean boolean26 = doubleMetaphoneResult23.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "H");
        int int12 = doubleMetaphone0.maxCodeLen;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone(" h\000a");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004a4", "4hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("a4\000a", "\000ah", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int19 = doubleMetaphone18.maxCodeLen;
        boolean boolean23 = doubleMetaphone18.isDoubleMetaphoneEqual("hi!", "", true);
        int int24 = doubleMetaphone18.getMaxCodeLen();
        char char27 = doubleMetaphone18.charAt("H4a\000", (int) (short) 1);
        java.lang.String str29 = doubleMetaphone18.doubleMetaphone("H");
        boolean boolean33 = doubleMetaphone18.isDoubleMetaphoneEqual("\000a\000A", "\000ah4", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone18.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult35.append("4#");
        doubleMetaphoneResult35.appendPrimary("H4a4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '4' + "'", char27 == '4');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        doubleMetaphoneResult8.appendPrimary('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aA" + "'", str21, "\000aA");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        boolean boolean22 = doubleMetaphoneResult21.isComplete();
        java.lang.String str23 = doubleMetaphoneResult21.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.appendAlternate("hi!a");
        doubleMetaphoneResult8.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.append('a', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        doubleMetaphoneResult10.appendPrimary("4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        char char13 = doubleMetaphone0.charAt("\000\000\000", (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int20 = doubleMetaphone19.maxCodeLen;
        boolean boolean23 = doubleMetaphone19.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str25 = doubleMetaphone19.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone19.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult27.appendPrimary('4');
        doubleMetaphoneResult27.append("hi!", "hi!");
        doubleMetaphoneResult27.appendPrimary("hi!");
        doubleMetaphoneResult27.appendPrimary("4");
        doubleMetaphoneResult27.append('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = doubleMetaphone0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "4a4\000", false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        doubleMetaphoneResult8.appendPrimary("\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.lang.String[] strArray13 = new java.lang.String[] { "\000", "hi!", "\000h", "a" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 4, 4, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\0004#", (int) ' ', (int) (short) -1, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", (int) '4', 32, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "\000", "hi!", "\000h", "a" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("4#\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "\000a4h");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A" + "'", obj12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = doubleMetaphone13.maxCodeLen;
        java.lang.String str16 = doubleMetaphone13.doubleMetaphone("");
        boolean boolean20 = doubleMetaphone13.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean23 = doubleMetaphone13.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str25 = doubleMetaphone13.doubleMetaphone("\000\000");
        java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) "\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        doubleMetaphoneResult8.appendPrimary("\0004");
        boolean boolean32 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("H4a\000", (int) (short) 1);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000A", "\000ah4", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        char char20 = doubleMetaphone0.charAt("\000ah4", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'a' + "'", char20 == 'a');
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("4\000aH", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000ah4", (int) '4', 52, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('\000', 'a');
        doubleMetaphoneResult8.appendPrimary("\0004a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        java.lang.String str19 = doubleMetaphone0.encode("\000a\000");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\0004");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone23 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int24 = doubleMetaphone23.maxCodeLen;
        boolean boolean27 = doubleMetaphone23.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str29 = doubleMetaphone23.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone23.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult31.append('\000');
        doubleMetaphoneResult31.append('a');
        doubleMetaphoneResult31.append("", "\000");
        java.lang.String str39 = doubleMetaphoneResult31.getPrimary();
        doubleMetaphoneResult31.append("4");
        doubleMetaphoneResult31.append(' ');
        doubleMetaphoneResult31.appendAlternate("\0004");
        doubleMetaphoneResult31.append(' ', '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\000a" + "'", str39, "\000a");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000aHa", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AH" + "'", str20, "AH");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult15.append("\000");
        doubleMetaphoneResult15.append('a');
        doubleMetaphoneResult15.append('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        boolean boolean25 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        java.lang.String str9 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.appendPrimary("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str18 = doubleMetaphone0.encode("\000ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append('4');
        java.lang.String str13 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        doubleMetaphone0.maxCodeLen = 'i';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000a4", false);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        boolean boolean15 = doubleMetaphone11.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str17 = doubleMetaphone11.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone11.new DoubleMetaphoneResult(4);
        char char22 = doubleMetaphone11.charAt("hi!", (int) 'a');
        java.lang.String str24 = doubleMetaphone11.encode("\000");
        doubleMetaphone11.setMaxCodeLen((int) (short) 100);
        char char29 = doubleMetaphone11.charAt("\000\000\000", 0);
        java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) "\000\000\000");
        char char33 = doubleMetaphone0.charAt("\000ahi", (int) (short) 0);
        int int34 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        char char10 = doubleMetaphone0.charAt("4", (int) (short) 100);
        char char13 = doubleMetaphone0.charAt("a4\000a", (int) (byte) 10);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("4##", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendPrimary("\000\000\000");
        doubleMetaphoneResult8.append("\000a4\000");
        java.lang.Class<?> wildcardClass20 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('h', '#');
        doubleMetaphoneResult8.append("\000aH4", "\000aH4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        doubleMetaphoneResult21.appendAlternate("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\0004", (int) (short) 100);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("A", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.appendAlternate("\000a4h");
        doubleMetaphoneResult8.append("\000a\000", "\000a4 ");
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        java.lang.String str15 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000aa" + "'", str15, "\000aa");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append('i', '\000');
        doubleMetaphoneResult8.append(' ', ' ');
        doubleMetaphoneResult8.append('H', '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.appendAlternate('4');
        java.lang.String str28 = doubleMetaphoneResult8.getPrimary();
        java.lang.Class<?> wildcardClass29 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000a4h" + "'", str28, "\000a4h");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "a4\000a", false);
        int int18 = doubleMetaphone0.maxCodeLen;
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        doubleMetaphoneResult8.appendAlternate('\000');
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        java.lang.Class<?> wildcardClass10 = doubleMetaphoneResult9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("#");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("");
        java.lang.String str16 = doubleMetaphone11.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult18.append("\000a", "4");
        java.lang.String str22 = doubleMetaphoneResult18.getAlternate();
        doubleMetaphoneResult18.appendAlternate('#');
        doubleMetaphoneResult18.append("4#", "\000aH\000");
        java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) "\000aH\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "A" + "'", obj28, "A");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.appendAlternate('i');
        doubleMetaphoneResult7.appendAlternate("\000aAi");
        doubleMetaphoneResult7.append('a', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        doubleMetaphoneResult8.appendPrimary('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        char char21 = doubleMetaphone0.charAt("", 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        doubleMetaphoneResult17.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append("", "A");
        doubleMetaphoneResult8.appendAlternate('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        doubleMetaphoneResult8.append("\000a4h", "A");
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("\000aAh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.Class<?> wildcardClass23 = doubleMetaphoneResult20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = 4;
        doubleMetaphone0.maxCodeLen = 'i';
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 105 + "'", int18 == 105);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        doubleMetaphoneResult24.appendPrimary("\000a\000a");
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        boolean boolean25 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a\000a" + "'", str21, "\000a\000a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        doubleMetaphoneResult8.append("");
        boolean boolean20 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str9 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendAlternate("\000a\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        doubleMetaphoneResult8.append('#');
        doubleMetaphoneResult8.appendAlternate('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("#\000", "\0004", true);
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000aa4");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        doubleMetaphoneResult8.append('\000', '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("a", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000#\000aa4", false);
        char char13 = doubleMetaphone0.charAt("4##i", (int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("4##", (int) (byte) 10, (int) (short) 10, strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", 35, 0, strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("#\000", 0, (int) 'h', strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000h", (int) (byte) -1, (int) 'h', strArray26);
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 100);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aAh", "\000 a", false);
        java.lang.String str17 = doubleMetaphone0.encode("\000ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        doubleMetaphoneResult8.appendAlternate("4hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\000" + "'", str20, "\000\000");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.append("i", "\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        doubleMetaphoneResult8.append('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\0004#" + "'", str20, "\000\0004#");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "\000a4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        doubleMetaphoneResult7.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult8.appendAlternate('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = doubleMetaphone0.doubleMetaphone("ia");
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt("\000aHa", (int) (byte) 10);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        char char17 = doubleMetaphone0.charAt("\000 a", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a", false);
        int int8 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "\000\0004#");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a\000", true);
        char char17 = doubleMetaphone0.charAt("H4a4", (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000aA\000");
        doubleMetaphone0.maxCodeLen = '#';
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        char char39 = doubleMetaphone0.charAt("\000aa4", 1);
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
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + 'a' + "'", char39 == 'a');
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("4");
        char char16 = doubleMetaphone0.charAt("4hi", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str9 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("\000a\000h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String[] strArray25 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("a4\000a", (-1), (int) (short) 1, strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '#', (int) (byte) -1, strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\0004#", 0, 105, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#", (int) '4', (int) '4', strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", (int) 'i', (int) ' ', strArray25);
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append("# 4");
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a# " + "'", str17, "\000a# ");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("4#\000a", 32, (int) (short) 100, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('#');
        doubleMetaphoneResult8.append("\000aa4");
        doubleMetaphoneResult8.append("\000aAi", "AH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "\000a4h");
        java.lang.String[] strArray35 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray35);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray35);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("a4\000a", (-1), (int) (short) 1, strArray35);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '#', (int) (byte) -1, strArray35);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000\000", 100, (-1), strArray35);
        boolean boolean41 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000h", 32, 105, strArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = doubleMetaphone0.encode((java.lang.Object) strArray35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A" + "'", obj12, "A");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000\000\000", "\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        doubleMetaphoneResult8.appendPrimary("4##i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        doubleMetaphoneResult13.append('a');
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        doubleMetaphoneResult8.appendAlternate("#H");
        doubleMetaphoneResult8.append('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        java.lang.String str16 = doubleMetaphone0.encode("\000\000\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('#');
        doubleMetaphoneResult8.append('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a" + "'", str14, "\000a");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        doubleMetaphoneResult7.appendPrimary("4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray23);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) 10, 100, strArray23);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 105, (int) (short) 100, strArray23);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, 105, strArray23);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a4", (int) 'a', (int) (byte) 10, strArray23);
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendPrimary("4");
        doubleMetaphoneResult8.append('4');
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!4" + "'", str20, "hi!4");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000h");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "\000aAi", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("4H", "\000aA\000", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("");
        boolean boolean21 = doubleMetaphone14.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str23 = doubleMetaphone14.doubleMetaphone("");
        int int24 = doubleMetaphone14.maxCodeLen;
        java.lang.String str26 = doubleMetaphone14.doubleMetaphone("H");
        doubleMetaphone14.maxCodeLen = (short) -1;
        doubleMetaphone14.setMaxCodeLen((int) (byte) -1);
        java.lang.String str32 = doubleMetaphone14.doubleMetaphone("\000\000");
        int int33 = doubleMetaphone14.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) int33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a", true);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        doubleMetaphoneResult8.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        java.lang.String str26 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000a\0004" + "'", str26, "\000a\0004");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("4H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000a\000\000");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass11 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendAlternate("\000\000");
        java.lang.Class<?> wildcardClass20 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int13 = doubleMetaphone0.maxCodeLen;
        int int14 = doubleMetaphone0.maxCodeLen;
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.append("H");
        java.lang.String str16 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('h', ' ');
        doubleMetaphoneResult10.appendAlternate("\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "aH" + "'", str16, "aH");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        doubleMetaphone0.maxCodeLen = (short) -1;
        char char24 = doubleMetaphone0.charAt(" Ah", (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 100, 0, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000a", (int) 'a', (int) (byte) 100, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("4H", (int) '4', (int) 'H', strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000ah", true);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        doubleMetaphoneResult8.appendAlternate("\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        doubleMetaphoneResult10.append("\000a\000h", "\000#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4H", 1, (int) (short) 1, strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a", (int) (short) 1, (int) 'i', strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("4hi", "4#4i");
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("\000a\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        doubleMetaphoneResult15.appendPrimary("H4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(105);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char21 = doubleMetaphone18.charAt("", (int) (byte) 10);
        boolean boolean24 = doubleMetaphone18.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        doubleMetaphone18.setMaxCodeLen(0);
        boolean boolean29 = doubleMetaphone18.isDoubleMetaphoneEqual("#\000", "\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        boolean boolean9 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('4', 'i');
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000i" + "'", str17, "\000i");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000ah");
        java.lang.String str10 = doubleMetaphone0.encode("\000aH\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ia", "\000a#", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("aH");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aAh", "4#\000a", false);
        doubleMetaphone0.maxCodeLen = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        char char26 = doubleMetaphone0.charAt("\000#\000aa4", 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("AH", (-1), (int) '4', strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str13 = doubleMetaphone0.encode("AH");
        char char16 = doubleMetaphone0.charAt("ia", (int) (short) 100);
        char char19 = doubleMetaphone0.charAt("4##", 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        java.lang.String str8 = doubleMetaphone0.encode("\000a");
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("4##", true);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray25);
        java.lang.Class<?> wildcardClass28 = strArray25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "H");
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\000a4 ", (int) (byte) 1);
        java.lang.String str12 = doubleMetaphone0.encode("4#A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual(" Ai", "\000\000", false);
        java.lang.String[] strArray39 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray39);
        boolean boolean41 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000", (int) (short) 1, (int) (short) 100, strArray39);
        boolean boolean42 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aa", 35, (int) 'i', strArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = doubleMetaphone0.encode((java.lang.Object) strArray39);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        char char22 = doubleMetaphone0.charAt("4hi", (int) 'H');
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(32);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\000a\000", "\0004a");
        char char17 = doubleMetaphone0.charAt("\000a4", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("\000a4");
        java.lang.String str4 = doubleMetaphone0.encode("a4\000a");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000aA\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aH4", "\000a4h", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        doubleMetaphoneResult8.appendAlternate("\000\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("\000a4 ");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000 a", (int) (byte) 0, (int) (byte) 1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        doubleMetaphoneResult8.append("\000a\000h");
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000aA\000" + "'", str23, "\000aA\000");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        boolean boolean24 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.Class<?> wildcardClass20 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendPrimary(" h\000a");
        doubleMetaphoneResult7.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\0004", (int) '\000');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\0004");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str10 = doubleMetaphone0.encode(" \0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        java.lang.String str25 = doubleMetaphone0.encode("4##i");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\000a\000", "\000");
        int int29 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult8.append('4');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000h");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        java.lang.String str26 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000a\0004" + "'", str26, "\000a\0004");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult8.appendAlternate("4#");
        doubleMetaphoneResult8.append('a', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("4hi", false);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\000a4", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000\0004#", true);
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        doubleMetaphoneResult17.append('#', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendPrimary("\000a4");
        doubleMetaphoneResult7.appendAlternate("\000#");
        doubleMetaphoneResult7.append("\000a44", "\000aa4");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000#\000aa4" + "'", str15, "\000#\000aa4");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000\000", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("hi!4", true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        doubleMetaphoneResult8.appendPrimary("AH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H4a\000" + "'", str18, "H4a\000");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        doubleMetaphoneResult18.append("# 4", " h\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        boolean boolean20 = doubleMetaphoneResult12.isComplete();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("ia", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        doubleMetaphoneResult8.appendAlternate("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a\000a" + "'", str22, "\000a\000a");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        doubleMetaphoneResult10.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\000a4");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000#");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str15 = doubleMetaphone0.encode("hi!\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.append("\000a\0004");
        doubleMetaphoneResult8.appendAlternate("\000a");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000\000a\000" + "'", str18, "\000\000a\000");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "H");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\0004", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000#", false);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("H44", "\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "ia", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendPrimary("\000\000\000");
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.lang.String[] strArray8 = new java.lang.String[] { "\000\000A", "\000a4 " };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 32, (int) (short) -1, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000i", (int) 'h', (int) (short) 10, strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "\000\000A", "\000a4 " });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        doubleMetaphoneResult8.appendPrimary("\000a");
        doubleMetaphoneResult8.appendAlternate("\000\0004#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('#', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a4 " + "'", str23, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a\0004" + "'", str25, "\000a\0004");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass7 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.append('#');
        doubleMetaphoneResult8.appendAlternate('H');
        java.lang.String str15 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4#" + "'", str15, "4#");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000#\000aa4", "#\000");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("aH\000\000\000aH\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000a", "\000ah", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        doubleMetaphone0.maxCodeLen = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        java.lang.String str24 = doubleMetaphone0.encode("4#\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendPrimary("\000a4");
        doubleMetaphoneResult7.appendPrimary("\000a\000");
        doubleMetaphoneResult7.append('a');
        java.lang.Class<?> wildcardClass14 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        java.lang.String str8 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('i', '\000');
        doubleMetaphoneResult4.append('a', '\000');
        doubleMetaphoneResult4.appendAlternate("\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000a\000h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendPrimary('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "\000");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.lang.Class<?> wildcardClass29 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult8.append("\000a\0004", "\000a\000\000");
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        doubleMetaphoneResult8.appendPrimary("\000a4h");
        doubleMetaphoneResult8.append("4#", "4#4");
        doubleMetaphoneResult8.append('a', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ah" + "'", str18, "\000ah");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\000" + "'", str19, "\000a\000");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        doubleMetaphoneResult17.append("#", "H4a\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.encode("\000#");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("");
        boolean boolean17 = doubleMetaphone10.isDoubleMetaphoneEqual("H", "H", true);
        int int18 = doubleMetaphone10.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone10.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str22 = doubleMetaphone10.encode("H");
        char char25 = doubleMetaphone10.charAt("hi!", (int) (short) 0);
        int int26 = doubleMetaphone10.getMaxCodeLen();
        char char29 = doubleMetaphone10.charAt("4", (int) (short) 10);
        java.lang.String str31 = doubleMetaphone10.encode("A");
        doubleMetaphone10.setMaxCodeLen(105);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'h' + "'", char25 == 'h');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "H");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("hi!i", true);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\000 a", "\000\000a\000", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.maxCodeLen;
        java.lang.String str12 = doubleMetaphone9.doubleMetaphone("");
        boolean boolean16 = doubleMetaphone9.isDoubleMetaphoneEqual("H", "H", true);
        int int17 = doubleMetaphone9.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone9.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult19.append("\000", "H");
        java.lang.String str23 = doubleMetaphoneResult19.getAlternate();
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) str23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        doubleMetaphoneResult8.append("", "\000\0004#");
        doubleMetaphoneResult8.appendPrimary("\000a 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        doubleMetaphoneResult4.append("", "a4\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000ah" + "'", str11, "\000ah");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000\000", true);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append('#');
        java.lang.String str18 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("\000#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        java.lang.String str21 = doubleMetaphoneResult10.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str9 = doubleMetaphone0.encode("\000aA");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        boolean boolean15 = doubleMetaphone11.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str17 = doubleMetaphone11.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone11.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult19.append('\000');
        doubleMetaphoneResult19.append('a');
        java.lang.String str24 = doubleMetaphoneResult19.getAlternate();
        doubleMetaphoneResult19.appendAlternate("H");
        doubleMetaphoneResult19.append('\000', '\000');
        doubleMetaphoneResult19.append('4', 'a');
        boolean boolean33 = doubleMetaphoneResult19.isComplete();
        doubleMetaphoneResult19.append("# 4");
        doubleMetaphoneResult19.append('i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) 'i');
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a" + "'", str24, "\000a");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.appendAlternate("\000a\000");
        java.lang.String str13 = doubleMetaphoneResult10.getPrimary();
        boolean boolean14 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual(" \0004", "\000a# ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone(" Ai");
        char char18 = doubleMetaphone0.charAt("#H", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '#' + "'", char18 == '#');
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        doubleMetaphoneResult8.appendAlternate("hi!4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a4H" + "'", str19, "\000a4H");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        java.lang.String str19 = doubleMetaphone0.encode("\000aa4");
        char char22 = doubleMetaphone0.charAt("ia", (int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.String[] strArray16 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4", (int) (short) 10, (int) (byte) -1, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aa", (int) (byte) 10, (int) (short) 100, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", (int) (byte) 100, (int) '\000', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual(" Ah", "4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "4hi!");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        java.lang.Class<?> wildcardClass24 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.lang.Class<?> wildcardClass24 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000", (int) 'a', (int) '#', strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 1, 105, strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", 0, (int) (byte) 100, strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 97, 0, strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, 32, strArray26);
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str16 = doubleMetaphone0.encode("4\000a");
        int int17 = doubleMetaphone0.maxCodeLen;
        char char20 = doubleMetaphone0.charAt("#\000", (int) 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }
}

