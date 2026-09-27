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
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(0);
        int int12 = soundex4.difference("", "01230120022455012623010202");
        java.lang.String str14 = soundex4.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("", "H000");
        int int17 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("01230120022455012623010202");
        int int13 = soundex1.difference("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(52);
        java.lang.String str13 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex15.setMaxLength((int) '4');
        java.lang.String str19 = soundex15.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass20 = soundex15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex0.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        int int11 = soundex9.getMaxLength();
        java.lang.String str13 = soundex9.soundex("H000");
        java.lang.String str15 = soundex9.encode("H000");
        soundex9.setMaxLength((-1));
        int int20 = soundex9.difference("", "");
        java.lang.Class<?> wildcardClass21 = soundex9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex6.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        int int12 = soundex0.difference("", "hi!");
        java.lang.String str14 = soundex0.encode("");
        int int17 = soundex0.difference("H000", "H000");
        java.lang.String str19 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str15 = soundex0.encode("H000");
        int int18 = soundex0.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("H000");
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex10.getMaxLength();
        int int12 = soundex10.getMaxLength();
        java.lang.String str14 = soundex10.encode("hi!");
        java.lang.String str16 = soundex10.encode("H000");
        java.lang.String str18 = soundex10.encode("");
        int int21 = soundex10.difference("01230120022455012623010202", "hi!");
        int int24 = soundex10.difference("H000", "");
        soundex10.setMaxLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex1.encode((java.lang.Object) soundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        int int6 = soundex0.difference("01230120022455012623010202", "H000");
        int int9 = soundex0.difference("", "H000");
        int int10 = soundex0.getMaxLength();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex0.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str13 = soundex0.soundex("H000");
        java.lang.String str15 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        soundex1.setMaxLength(35);
        soundex1.setMaxLength((int) (byte) 100);
        int int18 = soundex1.getMaxLength();
        java.lang.String str20 = soundex1.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength(52);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int2 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (short) 10);
        soundex1.setMaxLength(97);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex7.difference("H000", "");
        int int11 = soundex7.getMaxLength();
        java.lang.String str13 = soundex7.soundex("hi!");
        soundex7.setMaxLength((int) (short) -1);
        soundex7.setMaxLength(10);
        soundex7.setMaxLength((int) '#');
        soundex7.setMaxLength((int) '4');
        java.lang.String str23 = soundex7.encode("hi!");
        java.lang.String str25 = soundex7.encode("01230120022455012623010202");
        java.lang.Object obj26 = soundex1.encode((java.lang.Object) str25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = soundex1.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        int int10 = soundex0.difference("hi!", "hi!");
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int12 = soundex0.difference("", "H000");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("", "H000");
        int int17 = soundex0.difference("H000", "hi!");
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        int int13 = soundex0.difference("H000", "");
        char[] charArray19 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        int int22 = soundex21.getMaxLength();
        java.lang.String str24 = soundex21.encode("01230120022455012623010202");
        int int25 = soundex21.getMaxLength();
        int int26 = soundex21.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) int26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        int int16 = soundex0.difference("hi!", "hi!");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int21 = soundex18.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass22 = soundex18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex0.encode((java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        java.lang.String str19 = soundex15.encode("");
        java.lang.String str21 = soundex15.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("hi!");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        int int8 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) '#');
        int int11 = soundex5.getMaxLength();
        java.lang.Class<?> wildcardClass12 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex4.difference("H000", "");
        java.lang.String str9 = soundex4.encode("");
        java.lang.String str11 = soundex4.soundex("");
        java.lang.String str13 = soundex4.soundex("hi!");
        soundex4.setMaxLength((int) (short) 0);
        java.lang.String str17 = soundex4.encode("");
        java.lang.String str19 = soundex4.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass20 = soundex4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex1.encode((java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.String str12 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str16 = soundex0.encode("");
        soundex0.setMaxLength(0);
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("", "");
        soundex0.setMaxLength(1);
        int int18 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        int int11 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) '4');
        java.lang.String str15 = soundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = soundex6.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        int int14 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.soundex("");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        int int19 = soundex0.difference("H000", "H000");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex0.encode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex7.getMaxLength();
        int int9 = soundex7.getMaxLength();
        java.lang.String str11 = soundex7.soundex("H000");
        java.lang.String str13 = soundex7.encode("H000");
        soundex7.setMaxLength((-1));
        java.lang.String str17 = soundex7.encode("");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) str17);
        java.lang.String str20 = soundex0.encode("H000");
        java.lang.String str22 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex();
        int int26 = soundex23.difference("H000", "");
        int int27 = soundex23.getMaxLength();
        java.lang.String str29 = soundex23.soundex("hi!");
        soundex23.setMaxLength((int) (short) -1);
        java.lang.Class<?> wildcardClass32 = soundex23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex0.encode((java.lang.Object) soundex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int17 = soundex0.difference("H000", "hi!");
        int int20 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        java.lang.String str14 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        int int10 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 0);
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int6 = soundex5.getMaxLength();
        int int7 = soundex5.getMaxLength();
        java.lang.String str9 = soundex5.soundex("H000");
        java.lang.String str11 = soundex5.encode("H000");
        soundex5.setMaxLength((-1));
        java.lang.String str15 = soundex5.soundex("01230120022455012623010202");
        java.lang.Object obj16 = soundex0.encode((java.lang.Object) str15);
        java.lang.String str18 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str21 = soundex19.encode("hi!");
        java.lang.String str23 = soundex19.soundex("hi!");
        java.lang.String str25 = soundex19.soundex("hi!");
        java.lang.String str27 = soundex19.soundex("01230120022455012623010202");
        java.lang.String str29 = soundex19.encode("H000");
        java.lang.String str31 = soundex19.soundex("H000");
        int int34 = soundex19.difference("", "");
        int int35 = soundex19.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        char[] charArray15 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        int int17 = soundex16.getMaxLength();
        java.lang.Class<?> wildcardClass18 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex0.encode((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        java.lang.String str13 = soundex0.soundex("");
        int int16 = soundex0.difference("hi!", "");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex17.difference("H000", "");
        int int21 = soundex17.getMaxLength();
        java.lang.String str23 = soundex17.encode("01230120022455012623010202");
        java.lang.String str25 = soundex17.encode("H000");
        java.lang.Object obj26 = soundex0.encode((java.lang.Object) str25);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        int int28 = soundex27.getMaxLength();
        int int29 = soundex27.getMaxLength();
        soundex27.setMaxLength((int) (byte) -1);
        int int32 = soundex27.getMaxLength();
        java.lang.Class<?> wildcardClass33 = soundex27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("");
        int int17 = soundex0.difference("H000", "hi!");
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass14 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        int int18 = soundex0.difference("01230120022455012623010202", "hi!");
        int int21 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        int int18 = soundex0.difference("hi!", "");
        char[] charArray24 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray24);
        soundex25.setMaxLength(100);
        soundex25.setMaxLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) soundex25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex14.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        java.lang.String str12 = soundex8.encode("");
        java.lang.Class<?> wildcardClass13 = soundex8.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass17 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        int int9 = soundex6.getMaxLength();
        java.lang.String str11 = soundex6.encode("");
        int int14 = soundex6.difference("", "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.Class<?> wildcardClass15 = soundex14.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (byte) 0);
        int int12 = soundex0.difference("", "H000");
        java.lang.String str14 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        java.lang.Class<?> wildcardClass13 = soundex7.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength((int) (short) 100);
        java.lang.String str5 = soundex1.soundex("H000");
        java.lang.Class<?> wildcardClass6 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        soundex0.setMaxLength(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.encode("");
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        int int14 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex8.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) 'a');
        java.lang.String str10 = soundex6.encode("");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        int int13 = soundex11.getMaxLength();
        java.lang.String str15 = soundex11.soundex("H000");
        java.lang.String str17 = soundex11.encode("H000");
        soundex11.setMaxLength((-1));
        int int22 = soundex11.difference("", "");
        int int23 = soundex11.getMaxLength();
        java.lang.String str25 = soundex11.soundex("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex6.encode((java.lang.Object) str25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        int int12 = soundex0.difference("", "");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("");
        java.lang.String str18 = soundex0.encode("H000");
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str16 = soundex0.soundex("");
        java.lang.String str18 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex6.difference("H000", "");
        int int10 = soundex6.getMaxLength();
        java.lang.String str12 = soundex6.soundex("");
        java.lang.String str14 = soundex6.encode("H000");
        java.lang.Object obj15 = soundex0.encode((java.lang.Object) "H000");
        int int16 = soundex0.getMaxLength();
        int int19 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str21 = soundex0.soundex("");
        java.lang.String str23 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass24 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "H000" + "'", obj15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex6.difference("H000", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.encode("");
        java.lang.String str19 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(32);
        java.lang.String str11 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.soundex("");
        java.lang.String str18 = soundex12.encode("H000");
        int int21 = soundex12.difference("", "");
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex23.setMaxLength(0);
        soundex23.setMaxLength((int) '4');
        int int28 = soundex23.getMaxLength();
        int int29 = soundex23.getMaxLength();
        java.lang.String str31 = soundex23.soundex("");
        java.lang.Object obj32 = soundex12.encode((java.lang.Object) str31);
        java.lang.Object obj33 = soundex0.encode(obj32);
        java.lang.String str35 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str15 = soundex0.soundex("hi!");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex6.difference("H000", "");
        int int10 = soundex6.getMaxLength();
        java.lang.String str12 = soundex6.soundex("");
        java.lang.String str14 = soundex6.encode("H000");
        java.lang.Object obj15 = soundex0.encode((java.lang.Object) "H000");
        int int16 = soundex0.getMaxLength();
        int int19 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str21 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "H000" + "'", obj15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str13 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex14.difference("H000", "");
        java.lang.String str19 = soundex14.encode("");
        java.lang.String str21 = soundex14.soundex("");
        java.lang.String str23 = soundex14.soundex("hi!");
        int int24 = soundex14.getMaxLength();
        java.lang.String str26 = soundex14.encode("H000");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str29 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) -1);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex();
        int int33 = soundex32.getMaxLength();
        int int34 = soundex32.getMaxLength();
        java.lang.String str36 = soundex32.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex37 = new org.apache.commons.codec.language.Soundex();
        int int40 = soundex37.difference("H000", "");
        java.lang.Object obj41 = soundex32.encode((java.lang.Object) "H000");
        java.lang.String str43 = soundex32.soundex("");
        int int46 = soundex32.difference("", "H000");
        java.lang.String str48 = soundex32.soundex("hi!");
        int int49 = soundex32.getMaxLength();
        java.lang.String str51 = soundex32.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = soundex0.encode((java.lang.Object) soundex32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "H000" + "'", obj41, "H000");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "H000" + "'", str48, "H000");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("", "");
        soundex0.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        int int20 = soundex18.getMaxLength();
        soundex18.setMaxLength((int) (byte) -1);
        java.lang.String str24 = soundex18.soundex("H000");
        soundex18.setMaxLength(4);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        int int30 = soundex27.difference("H000", "");
        java.lang.String str32 = soundex27.encode("");
        java.lang.String str34 = soundex27.soundex("");
        java.lang.String str36 = soundex27.soundex("hi!");
        int int37 = soundex27.getMaxLength();
        java.lang.String str39 = soundex27.encode("01230120022455012623010202");
        java.lang.String str41 = soundex27.soundex("H000");
        java.lang.Object obj42 = soundex18.encode((java.lang.Object) "H000");
        java.lang.Object obj43 = soundex0.encode(obj42);
        int int44 = soundex0.getMaxLength();
        int int47 = soundex0.difference("H000", "H000");
        java.lang.String str49 = soundex0.encode("");
        java.lang.Class<?> wildcardClass50 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "H000" + "'", obj42, "H000");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "H000" + "'", obj43, "H000");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        soundex8.setMaxLength((int) '#');
        java.lang.String str12 = soundex8.encode("01230120022455012623010202");
        java.lang.Object obj13 = soundex0.encode((java.lang.Object) str12);
        int int16 = soundex0.difference("H000", "");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str20 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex11 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str13 = soundex11.soundex("");
        java.lang.String str15 = soundex11.soundex("01230120022455012623010202");
        java.lang.Object obj16 = soundex9.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str18 = soundex9.soundex("");
        int int19 = soundex9.getMaxLength();
        java.lang.String str21 = soundex9.soundex("01230120022455012623010202");
        int int22 = soundex9.getMaxLength();
        java.lang.Class<?> wildcardClass23 = soundex9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(soundex11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        java.lang.String str13 = soundex9.encode("");
        java.lang.String str15 = soundex9.encode("H000");
        java.lang.String str17 = soundex9.soundex("01230120022455012623010202");
        soundex9.setMaxLength((-1));
        soundex9.setMaxLength(32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex6.encode((java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex();
        int int2 = soundex1.getMaxLength();
        int int3 = soundex1.getMaxLength();
        java.lang.String str5 = soundex1.soundex("");
        java.lang.String str7 = soundex1.encode("H000");
        java.lang.Object obj8 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        int int15 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex17.setMaxLength(0);
        soundex17.setMaxLength((int) '4');
        int int22 = soundex17.getMaxLength();
        int int23 = soundex17.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) soundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.encode("");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex();
        int int4 = soundex3.getMaxLength();
        int int5 = soundex3.getMaxLength();
        java.lang.String str7 = soundex3.encode("");
        int int10 = soundex3.difference("H000", "");
        java.lang.String str12 = soundex3.encode("01230120022455012623010202");
        java.lang.Object obj13 = soundex0.encode((java.lang.Object) str12);
        soundex0.setMaxLength((int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("hi!");
        soundex1.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.encode("");
        soundex6.setMaxLength(0);
        soundex6.setMaxLength((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex1.encode((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        int int10 = soundex0.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.String str12 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int14 = soundex13.getMaxLength();
        int int15 = soundex13.getMaxLength();
        java.lang.String str17 = soundex13.encode("hi!");
        java.lang.String str19 = soundex13.encode("H000");
        java.lang.String str21 = soundex13.encode("");
        int int24 = soundex13.difference("01230120022455012623010202", "hi!");
        java.lang.String str26 = soundex13.soundex("H000");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) str26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((-1));
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        int int8 = soundex0.difference("H000", "hi!");
        java.lang.String str10 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        int int12 = soundex0.difference("", "hi!");
        soundex0.setMaxLength(1);
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength(10);
        java.lang.String str20 = soundex0.encode("01230120022455012623010202");
        java.lang.String str22 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex();
        int int24 = soundex23.getMaxLength();
        int int25 = soundex23.getMaxLength();
        java.lang.String str27 = soundex23.encode("");
        int int28 = soundex23.getMaxLength();
        int int31 = soundex23.difference("", "H000");
        java.lang.String str33 = soundex23.encode("");
        int int34 = soundex23.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex0.encode((java.lang.Object) soundex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        java.lang.String str19 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass16 = soundex15.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((-1));
        java.lang.String str12 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("");
        int int11 = soundex0.difference("H000", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(32);
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("");
        int int15 = soundex0.getMaxLength();
        int int18 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str19 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray1);
        java.lang.Class<?> wildcardClass7 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        int int15 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str19 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        java.lang.String str14 = soundex9.soundex("");
        soundex9.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = soundex9.difference("hi!", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) 'a');
        java.lang.String str10 = soundex6.encode("");
        java.lang.Class<?> wildcardClass11 = soundex6.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        int int6 = soundex0.difference("H000", "");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.difference("", "H000");
        int int14 = soundex0.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertNotNull(soundex0);
// flaky "1) test1095(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.soundex("H000");
        java.lang.String str12 = soundex6.encode("H000");
        soundex6.setMaxLength((-1));
        java.lang.String str16 = soundex6.soundex("01230120022455012623010202");
        int int19 = soundex6.difference("H000", "");
        java.lang.String str21 = soundex6.encode("H000");
        java.lang.String str23 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj24 = soundex3.encode((java.lang.Object) "01230120022455012623010202");
        soundex3.setMaxLength(10);
        java.lang.Class<?> wildcardClass27 = soundex3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str15 = soundex13.encode("01230120022455012623010202");
        soundex13.setMaxLength((int) (short) -1);
        java.lang.Class<?> wildcardClass18 = soundex13.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(1);
        int int12 = soundex4.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        int int17 = soundex13.getMaxLength();
        java.lang.String str19 = soundex13.soundex("hi!");
        java.lang.String str21 = soundex13.encode("hi!");
        int int24 = soundex13.difference("01230120022455012623010202", "hi!");
        soundex13.setMaxLength(100);
        java.lang.String str28 = soundex13.encode("H000");
        int int29 = soundex13.getMaxLength();
        int int30 = soundex13.getMaxLength();
        java.lang.Class<?> wildcardClass31 = soundex13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex4.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int9 = soundex0.getMaxLength();
        int int12 = soundex0.difference("hi!", "H000");
        java.lang.String str14 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.encode("");
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        int int11 = soundex7.getMaxLength();
        int int12 = soundex7.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex13 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int16 = soundex13.difference("01230120022455012623010202", "H000");
        java.lang.String str18 = soundex13.encode("");
        java.lang.String str20 = soundex13.encode("");
        java.lang.Class<?> wildcardClass21 = soundex13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex7.encode((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(soundex13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        int int8 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = soundex19.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        int int19 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(32);
        int int24 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.Class<?> wildcardClass25 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        int int14 = soundex9.difference("hi!", "01230120022455012623010202");
        java.lang.String str16 = soundex9.encode("H000");
        java.lang.String str18 = soundex9.soundex("H000");
        int int21 = soundex9.difference("H000", "");
        soundex9.setMaxLength(100);
        java.lang.String str25 = soundex9.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        soundex7.setMaxLength((int) (byte) 0);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex7.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        java.lang.Object obj14 = soundex6.encode((java.lang.Object) "");
        soundex6.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        int int7 = soundex5.getMaxLength();
        java.lang.String str9 = soundex5.soundex("");
        java.lang.String str11 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        java.lang.String str12 = soundex8.soundex("");
        int int13 = soundex8.getMaxLength();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex8.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("");
        java.lang.String str17 = soundex0.soundex("");
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        int int7 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int11 = soundex8.difference("01230120022455012623010202", "H000");
        java.lang.String str13 = soundex8.encode("");
        java.lang.String str15 = soundex8.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex0.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(soundex8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str11 = soundex0.soundex("hi!");
        int int14 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        java.lang.Object obj14 = soundex6.encode((java.lang.Object) "");
        soundex6.setMaxLength((int) '#');
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex17.difference("H000", "");
        int int21 = soundex17.getMaxLength();
        java.lang.String str23 = soundex17.soundex("hi!");
        java.lang.String str25 = soundex17.soundex("");
        soundex17.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex6.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength((int) ' ');
        char[] charArray12 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str22 = soundex20.soundex("");
        java.lang.Object obj23 = soundex1.encode((java.lang.Object) "");
        java.lang.String str25 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex0.difference("", "H000");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.soundex("");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int11 = soundex8.difference("", "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int22 = soundex1.difference("hi!", "hi!");
        int int23 = soundex1.getMaxLength();
        java.lang.String str25 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str15 = soundex13.encode("01230120022455012623010202");
        soundex13.setMaxLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = soundex13.difference("H000", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("H000", "H000");
        org.apache.commons.codec.language.Soundex soundex8 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str10 = soundex8.soundex("");
        soundex8.setMaxLength((int) (short) 1);
        java.lang.String str14 = soundex8.encode("");
        java.lang.String str16 = soundex8.soundex("01230120022455012623010202");
        int int17 = soundex8.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex0.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(soundex8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex16 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int19 = soundex16.difference("01230120022455012623010202", "H000");
        java.lang.Class<?> wildcardClass20 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex0.encode((java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(soundex16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        int int10 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        soundex0.setMaxLength(100);
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("");
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int22 = soundex19.difference("H000", "");
        java.lang.String str24 = soundex19.encode("");
        java.lang.String str26 = soundex19.soundex("");
        java.lang.String str28 = soundex19.encode("H000");
        int int31 = soundex19.difference("", "");
        java.lang.String str33 = soundex19.soundex("H000");
        int int34 = soundex19.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex0.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex7.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        int int9 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        int int11 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) '4');
        int int14 = soundex6.getMaxLength();
        int int15 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) (short) 10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str6 = soundex0.encode("");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("");
        int int13 = soundex0.difference("hi!", "");
        java.lang.String str15 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength(1);
        java.lang.String str12 = soundex6.encode("");
        int int13 = soundex6.getMaxLength();
        int int16 = soundex6.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("hi!");
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("H000", "H000");
        int int10 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.soundex("");
        int int17 = soundex12.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex0.encode((java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '4');
        soundex6.setMaxLength(0);
        int int13 = soundex6.difference("", "01230120022455012623010202");
        java.lang.String str15 = soundex6.soundex("");
        soundex6.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        int int7 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        java.lang.String str12 = soundex8.soundex("H000");
        java.lang.String str14 = soundex8.encode("H000");
        soundex8.setMaxLength((-1));
        int int17 = soundex8.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex0.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int6 = soundex5.getMaxLength();
        int int7 = soundex5.getMaxLength();
        java.lang.String str9 = soundex5.soundex("hi!");
        java.lang.Object obj10 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.soundex("H000");
        java.lang.String str12 = soundex6.encode("H000");
        soundex6.setMaxLength((-1));
        java.lang.String str16 = soundex6.soundex("01230120022455012623010202");
        int int19 = soundex6.difference("H000", "");
        java.lang.String str21 = soundex6.encode("H000");
        java.lang.String str23 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj24 = soundex3.encode((java.lang.Object) "01230120022455012623010202");
        soundex3.setMaxLength(10);
        java.lang.String str28 = soundex3.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex("hi!");
        int int31 = soundex30.getMaxLength();
        java.lang.String str33 = soundex30.encode("01230120022455012623010202");
        java.lang.Object obj34 = soundex3.encode((java.lang.Object) str33);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        soundex9.setMaxLength(1);
        int int15 = soundex9.getMaxLength();
        java.lang.String str17 = soundex9.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        char[] charArray13 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        soundex14.setMaxLength((int) '#');
        soundex14.setMaxLength((int) '#');
        java.lang.String str20 = soundex14.encode("");
        java.lang.Object obj21 = soundex6.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex12.difference("H000", "");
        int int16 = soundex12.getMaxLength();
        java.lang.String str18 = soundex12.soundex("hi!");
        java.lang.Object obj19 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H000" + "'", obj19, "H000");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        int int19 = soundex0.difference("", "H000");
        int int22 = soundex0.difference("01230120022455012623010202", "");
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex();
        int int26 = soundex23.difference("H000", "");
        java.lang.String str28 = soundex23.encode("");
        int int29 = soundex23.getMaxLength();
        soundex23.setMaxLength((-1));
        int int34 = soundex23.difference("", "");
        java.lang.String str36 = soundex23.soundex("01230120022455012623010202");
        java.lang.String str38 = soundex23.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex0.encode((java.lang.Object) soundex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        int int6 = soundex1.getMaxLength();
        java.lang.String str8 = soundex1.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        int int11 = soundex9.getMaxLength();
        java.lang.String str13 = soundex9.encode("");
        int int16 = soundex9.difference("H000", "");
        java.lang.String str18 = soundex9.encode("01230120022455012623010202");
        java.lang.String str20 = soundex9.soundex("hi!");
        java.lang.String str22 = soundex9.soundex("01230120022455012623010202");
        soundex9.setMaxLength((int) (short) 100);
        int int27 = soundex9.difference("hi!", "");
        int int28 = soundex9.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex1.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        soundex1.setMaxLength((int) (short) 10);
        char[] charArray14 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex1.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex4.difference("hi!", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        int int20 = soundex0.difference("", "");
        java.lang.String str22 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass23 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.encode("hi!");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        java.lang.String str21 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        int int17 = soundex0.difference("", "01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.String str12 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (byte) 100);
        soundex0.setMaxLength((int) '4');
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(52);
        int int6 = soundex1.difference("hi!", "01230120022455012623010202");
        java.lang.String str8 = soundex1.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        int int11 = soundex9.getMaxLength();
        java.lang.String str13 = soundex9.soundex("H000");
        java.lang.String str15 = soundex9.encode("H000");
        soundex9.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex18.difference("H000", "");
        java.lang.String str23 = soundex18.encode("");
        java.lang.String str25 = soundex18.soundex("");
        java.lang.String str27 = soundex18.soundex("hi!");
        int int28 = soundex18.getMaxLength();
        int int29 = soundex18.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex();
        int int33 = soundex30.difference("H000", "");
        int int34 = soundex30.getMaxLength();
        java.lang.String str36 = soundex30.soundex("hi!");
        java.lang.Object obj37 = soundex18.encode((java.lang.Object) "hi!");
        java.lang.Object obj38 = soundex9.encode((java.lang.Object) "hi!");
        java.lang.Object obj39 = soundex1.encode(obj38);
        java.lang.Class<?> wildcardClass40 = obj38.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "H000" + "'", obj37, "H000");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "H000" + "'", obj38, "H000");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "H000" + "'", obj39, "H000");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((-1));
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "");
        org.apache.commons.codec.language.Soundex soundex12 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int13 = soundex12.getMaxLength();
        soundex12.setMaxLength((int) 'a');
        java.lang.String str17 = soundex12.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str20 = soundex18.encode("hi!");
        soundex18.setMaxLength(10);
        java.lang.String str24 = soundex18.encode("hi!");
        java.lang.Object obj25 = soundex12.encode((java.lang.Object) str24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(soundex12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H000" + "'", obj25, "H000");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.encode("");
        int int15 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength((int) 'a');
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("01230120022455012623010202", "");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass5 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.encode("");
        int int19 = soundex0.difference("H000", "hi!");
        java.lang.String str21 = soundex0.soundex("01230120022455012623010202");
        int int22 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.soundex("");
        int int9 = soundex6.getMaxLength();
        int int10 = soundex6.getMaxLength();
        java.lang.Class<?> wildcardClass11 = soundex6.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str18 = soundex16.encode("hi!");
        java.lang.String str20 = soundex16.encode("");
        java.lang.String str22 = soundex16.encode("H000");
        java.lang.String str24 = soundex16.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex16.encode("01230120022455012623010202");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(4);
        java.lang.String str10 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        soundex11.setMaxLength((int) 'a');
        java.lang.String str16 = soundex11.encode("H000");
        soundex11.setMaxLength((int) '#');
        java.lang.String str20 = soundex11.encode("");
        soundex11.setMaxLength((int) ' ');
        java.lang.String str24 = soundex11.soundex("H000");
        java.lang.Class<?> wildcardClass25 = soundex11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("H000");
        java.lang.String str17 = soundex0.encode("hi!");
        int int18 = soundex0.getMaxLength();
        int int19 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        int int8 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.Class<?> wildcardClass14 = soundex13.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str10 = soundex8.encode("hi!");
        java.lang.String str12 = soundex8.soundex("hi!");
        int int15 = soundex8.difference("01230120022455012623010202", "H000");
        int int18 = soundex8.difference("", "H000");
        soundex8.setMaxLength(10);
        int int21 = soundex8.getMaxLength();
        int int22 = soundex8.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex0.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str14 = soundex12.encode("hi!");
        java.lang.String str16 = soundex12.encode("");
        java.lang.String str18 = soundex12.encode("H000");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj21 = soundex12.encode((java.lang.Object) "hi!");
        soundex12.setMaxLength(0);
        int int24 = soundex12.getMaxLength();
        int int25 = soundex12.getMaxLength();
        soundex12.setMaxLength((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex11.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.String str12 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str16 = soundex0.soundex("hi!");
        int int19 = soundex0.difference("H000", "");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex0.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        int int9 = soundex0.difference("hi!", "");
        int int12 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.soundex("H000");
        java.lang.String str12 = soundex6.encode("H000");
        soundex6.setMaxLength((-1));
        java.lang.String str16 = soundex6.soundex("01230120022455012623010202");
        int int19 = soundex6.difference("H000", "");
        java.lang.String str21 = soundex6.encode("H000");
        java.lang.String str23 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj24 = soundex3.encode((java.lang.Object) "01230120022455012623010202");
        soundex3.setMaxLength(10);
        java.lang.String str28 = soundex3.encode("");
        int int29 = soundex3.getMaxLength();
        int int30 = soundex3.getMaxLength();
        int int31 = soundex3.getMaxLength();
        java.lang.String str33 = soundex3.soundex("");
        java.lang.Class<?> wildcardClass34 = soundex3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        int int14 = soundex1.getMaxLength();
        java.lang.String str16 = soundex1.encode("");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex17.difference("H000", "");
        int int21 = soundex17.getMaxLength();
        java.lang.String str23 = soundex17.soundex("hi!");
        java.lang.String str25 = soundex17.encode("hi!");
        int int28 = soundex17.difference("01230120022455012623010202", "hi!");
        java.lang.String str30 = soundex17.soundex("");
        int int33 = soundex17.difference("", "01230120022455012623010202");
        int int36 = soundex17.difference("H000", "H000");
        int int39 = soundex17.difference("H000", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = soundex1.encode((java.lang.Object) int39);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.encode("");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = soundex1.difference("01230120022455012623010202", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        soundex0.setMaxLength(10);
        int int13 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        java.lang.String str20 = soundex15.encode("");
        int int23 = soundex15.difference("H000", "H000");
        int int26 = soundex15.difference("hi!", "");
        int int27 = soundex15.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex14.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        int int10 = soundex0.difference("hi!", "hi!");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(35);
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int16 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (short) 100);
        int int16 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("hi!");
        java.lang.String str16 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str19 = soundex17.encode("hi!");
        java.lang.String str21 = soundex17.soundex("01230120022455012623010202");
        int int24 = soundex17.difference("", "");
        int int25 = soundex17.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) soundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex12.difference("H000", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        java.lang.String str14 = soundex7.soundex("");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        java.lang.String str19 = soundex15.soundex("01230120022455012623010202");
        int int22 = soundex15.difference("", "");
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex();
        int int26 = soundex23.difference("H000", "");
        int int27 = soundex23.getMaxLength();
        java.lang.String str29 = soundex23.soundex("hi!");
        soundex23.setMaxLength((int) (short) -1);
        soundex23.setMaxLength(10);
        java.lang.String str35 = soundex23.encode("hi!");
        java.lang.Object obj36 = soundex15.encode((java.lang.Object) "hi!");
        int int39 = soundex15.difference("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = soundex7.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "H000" + "'", obj36, "H000");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(1);
        int int12 = soundex4.getMaxLength();
        java.lang.String str14 = soundex4.soundex("01230120022455012623010202");
        int int15 = soundex4.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex16.getMaxLength();
        int int18 = soundex16.getMaxLength();
        java.lang.String str20 = soundex16.encode("");
        int int23 = soundex16.difference("H000", "");
        java.lang.String str25 = soundex16.encode("01230120022455012623010202");
        java.lang.String str27 = soundex16.soundex("hi!");
        java.lang.String str29 = soundex16.soundex("01230120022455012623010202");
        soundex16.setMaxLength((int) (short) 100);
        int int34 = soundex16.difference("hi!", "");
        int int35 = soundex16.getMaxLength();
        java.lang.String str37 = soundex16.soundex("01230120022455012623010202");
        java.lang.Object obj38 = soundex4.encode((java.lang.Object) str37);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex7.getMaxLength();
        int int9 = soundex7.getMaxLength();
        java.lang.String str11 = soundex7.encode("hi!");
        java.lang.String str13 = soundex7.encode("H000");
        java.lang.String str15 = soundex7.encode("");
        int int18 = soundex7.difference("01230120022455012623010202", "hi!");
        java.lang.String str20 = soundex7.soundex("H000");
        java.lang.Object obj21 = soundex1.encode((java.lang.Object) "H000");
        int int24 = soundex1.difference("H000", "hi!");
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        int int28 = soundex25.difference("H000", "");
        java.lang.String str30 = soundex25.encode("");
        java.lang.String str32 = soundex25.soundex("");
        java.lang.String str34 = soundex25.soundex("hi!");
        soundex25.setMaxLength((int) (short) 0);
        java.lang.String str38 = soundex25.soundex("01230120022455012623010202");
        java.lang.String str40 = soundex25.soundex("hi!");
        java.lang.String str42 = soundex25.soundex("hi!");
        int int43 = soundex25.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = soundex1.encode((java.lang.Object) int43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H000" + "'", str40, "H000");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "H000" + "'", str42, "H000");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass9 = soundex8.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex();
        int int2 = soundex1.getMaxLength();
        int int3 = soundex1.getMaxLength();
        java.lang.String str5 = soundex1.soundex("");
        java.lang.String str7 = soundex1.encode("H000");
        java.lang.Object obj8 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength((int) (byte) 0);
        soundex0.setMaxLength((int) (short) 10);
        int int15 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        char[] charArray23 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex0.encode((java.lang.Object) charArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { ' ', ' ', '4', '4', '4' });
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        java.lang.String str18 = soundex13.encode("");
        java.lang.String str20 = soundex13.soundex("");
        java.lang.String str22 = soundex13.soundex("hi!");
        int int23 = soundex13.getMaxLength();
        int int24 = soundex13.getMaxLength();
        java.lang.String str26 = soundex13.soundex("H000");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str29 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str9 = soundex7.encode("hi!");
        java.lang.String str11 = soundex7.soundex("hi!");
        java.lang.String str13 = soundex7.encode("hi!");
        int int16 = soundex7.difference("01230120022455012623010202", "H000");
        soundex7.setMaxLength(52);
        java.lang.String str20 = soundex7.encode("hi!");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) str20);
        int int22 = soundex0.getMaxLength();
        int int25 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        int int19 = soundex0.difference("H000", "H000");
        char[] charArray24 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray24);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray24);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray24);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) charArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str8 = soundex0.soundex("H000");
        int int9 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        char[] charArray3 = new char[] { '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '4', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("H000", "hi!");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str21 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength(100);
        java.lang.String str15 = soundex0.encode("H000");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.soundex("01230120022455012623010202");
        int int21 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray14 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        soundex16.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex8.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex0.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.soundex("H000");
        java.lang.String str12 = soundex6.encode("H000");
        soundex6.setMaxLength((-1));
        java.lang.String str16 = soundex6.soundex("01230120022455012623010202");
        int int19 = soundex6.difference("H000", "");
        java.lang.String str21 = soundex6.encode("H000");
        java.lang.String str23 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj24 = soundex3.encode((java.lang.Object) "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        int int28 = soundex25.difference("H000", "");
        int int29 = soundex25.getMaxLength();
        java.lang.String str31 = soundex25.soundex("");
        java.lang.String str33 = soundex25.encode("H000");
        int int34 = soundex25.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex3.encode((java.lang.Object) soundex25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(32);
        soundex0.setMaxLength((int) (byte) 100);
        int int14 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength(10);
        java.lang.String str19 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex0.soundex("H000");
        int int13 = soundex0.difference("hi!", "hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int18 = soundex15.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str20 = soundex15.encode("01230120022455012623010202");
        java.lang.String str22 = soundex15.encode("H000");
        int int25 = soundex15.difference("", "H000");
        int int28 = soundex15.difference("01230120022455012623010202", "H000");
        java.lang.String str30 = soundex15.soundex("01230120022455012623010202");
        int int31 = soundex15.getMaxLength();
        int int32 = soundex15.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex0.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        soundex1.setMaxLength((int) (short) 10);
        int int12 = soundex1.difference("hi!", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass13 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("01230120022455012623010202");
        int int11 = soundex1.getMaxLength();
        int int12 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex9.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("");
        int int17 = soundex0.difference("H000", "hi!");
        int int20 = soundex0.difference("", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int9 = soundex0.getMaxLength();
        int int12 = soundex0.difference("hi!", "H000");
        char[] charArray15 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        int int18 = soundex17.getMaxLength();
        soundex17.setMaxLength((int) (byte) -1);
        soundex17.setMaxLength(97);
        int int23 = soundex17.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) int23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int16 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex15 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str17 = soundex15.soundex("");
        soundex15.setMaxLength((int) (short) 1);
        soundex15.setMaxLength((int) 'a');
        int int22 = soundex15.getMaxLength();
        java.lang.String str24 = soundex15.encode("");
        int int27 = soundex15.difference("01230120022455012623010202", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex14.encode((java.lang.Object) int27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertNotNull(soundex15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex19.setMaxLength(0);
        soundex19.setMaxLength((int) '4');
        soundex19.setMaxLength((int) ' ');
        int int28 = soundex19.difference("", "01230120022455012623010202");
        java.lang.String str30 = soundex19.soundex("01230120022455012623010202");
        java.lang.Object obj31 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength(1);
        soundex4.setMaxLength(100);
        int int10 = soundex4.getMaxLength();
        java.lang.String str12 = soundex4.encode("");
        int int15 = soundex4.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) '#');
        soundex0.setMaxLength((int) '4');
        java.lang.String str16 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        int int18 = soundex0.difference("hi!", "");
        int int19 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str23 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex0.encode((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex();
        int int5 = soundex4.getMaxLength();
        int int6 = soundex4.getMaxLength();
        java.lang.String str8 = soundex4.soundex("H000");
        java.lang.String str10 = soundex4.encode("H000");
        soundex4.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        java.lang.String str18 = soundex13.encode("");
        java.lang.String str20 = soundex13.soundex("");
        java.lang.String str22 = soundex13.soundex("hi!");
        int int23 = soundex13.getMaxLength();
        int int24 = soundex13.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        int int28 = soundex25.difference("H000", "");
        int int29 = soundex25.getMaxLength();
        java.lang.String str31 = soundex25.soundex("hi!");
        java.lang.Object obj32 = soundex13.encode((java.lang.Object) "hi!");
        java.lang.Object obj33 = soundex4.encode((java.lang.Object) "hi!");
        int int36 = soundex4.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Object obj37 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str39 = soundex1.encode("");
        java.lang.String str41 = soundex1.soundex("01230120022455012623010202");
        int int42 = soundex1.getMaxLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H000" + "'", obj32, "H000");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H000" + "'", obj33, "H000");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("H000");
        java.lang.String str14 = soundex0.soundex("hi!");
        int int17 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) '#');
        soundex0.setMaxLength((int) '4');
        soundex0.setMaxLength((int) '4');
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex17.difference("H000", "");
        java.lang.String str22 = soundex17.encode("");
        java.lang.String str24 = soundex17.soundex("hi!");
        java.lang.String str26 = soundex17.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) soundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex7.getMaxLength();
        soundex7.setMaxLength((int) 'a');
        java.lang.String str12 = soundex7.encode("H000");
        soundex7.setMaxLength((int) '#');
        java.lang.String str16 = soundex7.encode("");
        int int19 = soundex7.difference("H000", "01230120022455012623010202");
        int int22 = soundex7.difference("hi!", "");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) "");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str27 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.soundex("hi!");
        java.lang.String str18 = soundex12.soundex("H000");
        java.lang.Object obj19 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str21 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H000" + "'", obj19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex7.getMaxLength();
        soundex7.setMaxLength((int) 'a');
        java.lang.String str12 = soundex7.encode("H000");
        soundex7.setMaxLength((int) '#');
        java.lang.String str16 = soundex7.encode("");
        int int19 = soundex7.difference("H000", "01230120022455012623010202");
        int int22 = soundex7.difference("hi!", "");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) "");
        int int26 = soundex0.difference("hi!", "hi!");
        java.lang.String str28 = soundex0.encode("H000");
        int int31 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        int int15 = soundex0.difference("", "");
        int int18 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str20 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str24 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        soundex8.setMaxLength((int) '#');
        java.lang.String str12 = soundex8.encode("01230120022455012623010202");
        java.lang.Object obj13 = soundex0.encode((java.lang.Object) str12);
        int int16 = soundex0.difference("H000", "");
        int int17 = soundex0.getMaxLength();
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex16.setMaxLength(0);
        soundex16.setMaxLength((int) '4');
        int int21 = soundex16.getMaxLength();
        int int22 = soundex16.getMaxLength();
        java.lang.String str24 = soundex16.soundex("");
        java.lang.Object obj25 = soundex0.encode((java.lang.Object) str24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray10 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str14 = soundex12.soundex("");
        java.lang.Object obj15 = soundex7.encode((java.lang.Object) "");
        soundex7.setMaxLength(10);
        java.lang.String str19 = soundex7.encode("");
        java.lang.String str21 = soundex7.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        int int8 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.String str12 = soundex0.encode("");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(0);
        int int12 = soundex4.difference("", "01230120022455012623010202");
        java.lang.String str14 = soundex4.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        char[] charArray6 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', '4', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex13.setMaxLength((int) '4');
        java.lang.String str17 = soundex13.encode("01230120022455012623010202");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        int int9 = soundex0.difference("hi!", "");
        java.lang.String str11 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        soundex0.setMaxLength(52);
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass7 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = soundex4.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) '4');
        java.lang.Class<?> wildcardClass8 = soundex4.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int18 = soundex15.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str20 = soundex15.encode("01230120022455012623010202");
        java.lang.String str22 = soundex15.encode("H000");
        java.lang.String str24 = soundex15.encode("01230120022455012623010202");
        java.lang.Object obj25 = soundex0.encode((java.lang.Object) str24);
        java.lang.String str27 = soundex0.soundex("H000");
        int int28 = soundex0.getMaxLength();
        java.lang.String str30 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("");
        soundex0.setMaxLength(52);
        char[] charArray19 = new char[] { '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex0.encode((java.lang.Object) soundex22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '4' });
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("H000");
        int int9 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray10 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str14 = soundex12.soundex("");
        java.lang.Object obj15 = soundex7.encode((java.lang.Object) "");
        soundex7.setMaxLength(10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = soundex7.difference("H000", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.soundex("");
        int int9 = soundex6.getMaxLength();
        int int10 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int15 = soundex12.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str17 = soundex12.encode("01230120022455012623010202");
        java.lang.String str19 = soundex12.encode("H000");
        int int22 = soundex12.difference("", "H000");
        int int25 = soundex12.difference("01230120022455012623010202", "H000");
        int int28 = soundex12.difference("", "hi!");
        java.lang.String str30 = soundex12.encode("");
        int int33 = soundex12.difference("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex6.encode((java.lang.Object) int33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(52);
        java.lang.String str13 = soundex0.encode("hi!");
        int int14 = soundex0.getMaxLength();
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.encode("");
        soundex0.setMaxLength(52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.soundex("");
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        soundex15.setMaxLength((int) '#');
        int int20 = soundex15.difference("", "hi!");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) "");
        java.lang.String str23 = soundex0.encode("");
        java.lang.Class<?> wildcardClass24 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("01230120022455012623010202");
        int int3 = soundex0.getMaxLength();
        char[] charArray9 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray9);
        java.lang.String str14 = soundex12.encode("");
        soundex12.setMaxLength(0);
        java.lang.String str18 = soundex12.soundex("");
        java.lang.String str20 = soundex12.soundex("01230120022455012623010202");
        soundex12.setMaxLength(35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "2) test1258(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        java.lang.String str18 = soundex13.encode("");
        java.lang.String str20 = soundex13.soundex("");
        java.lang.String str22 = soundex13.soundex("hi!");
        int int23 = soundex13.getMaxLength();
        int int24 = soundex13.getMaxLength();
        java.lang.String str26 = soundex13.soundex("H000");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "H000");
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex();
        int int29 = soundex28.getMaxLength();
        soundex28.setMaxLength((int) 'a');
        java.lang.String str33 = soundex28.encode("H000");
        soundex28.setMaxLength((int) '#');
        java.lang.String str37 = soundex28.encode("");
        soundex28.setMaxLength((int) ' ');
        soundex28.setMaxLength(52);
        soundex28.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = soundex0.encode((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        int int9 = soundex6.getMaxLength();
        char[] charArray15 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        int int18 = soundex17.getMaxLength();
        java.lang.String str20 = soundex17.encode("01230120022455012623010202");
        java.lang.Object obj21 = soundex6.encode((java.lang.Object) str20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("H000");
        int int10 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex9.setMaxLength(0);
        soundex9.setMaxLength((int) '4');
        java.lang.String str15 = soundex9.encode("01230120022455012623010202");
        java.lang.Object obj16 = soundex7.encode((java.lang.Object) "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex7.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        char[] charArray6 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        soundex7.setMaxLength((int) 'a');
        int int10 = soundex7.getMaxLength();
        java.lang.String str12 = soundex7.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex0.encode((java.lang.Object) soundex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
// flaky "3) test1263(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
// flaky "1) test1263(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
// flaky "1) test1263(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("hi!", "hi!");
        soundex0.setMaxLength((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        int int13 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex12 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int15 = soundex12.difference("01230120022455012623010202", "H000");
        java.lang.String str17 = soundex12.encode("");
        int int18 = soundex12.getMaxLength();
        soundex12.setMaxLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex0.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(soundex12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky "4) test1266(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("");
        int int9 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        int int15 = soundex0.difference("", "");
        java.lang.String str17 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex19.getMaxLength();
        int int21 = soundex19.getMaxLength();
        java.lang.String str23 = soundex19.soundex("");
        java.lang.String str25 = soundex19.encode("H000");
        java.lang.Object obj26 = soundex18.encode((java.lang.Object) "H000");
        soundex18.setMaxLength((int) (byte) 0);
        java.lang.String str30 = soundex18.soundex("");
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int35 = soundex32.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str37 = soundex32.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex38 = new org.apache.commons.codec.language.Soundex();
        int int39 = soundex38.getMaxLength();
        int int40 = soundex38.getMaxLength();
        java.lang.String str42 = soundex38.encode("hi!");
        java.lang.String str44 = soundex38.encode("H000");
        java.lang.String str46 = soundex38.encode("");
        int int49 = soundex38.difference("01230120022455012623010202", "hi!");
        java.lang.String str51 = soundex38.soundex("H000");
        java.lang.Object obj52 = soundex32.encode((java.lang.Object) "H000");
        int int55 = soundex32.difference("H000", "hi!");
        java.lang.Object obj56 = soundex18.encode((java.lang.Object) "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = soundex0.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "H000" + "'", str42, "H000");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "H000" + "'", str44, "H000");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "H000" + "'", str51, "H000");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "H000" + "'", obj52, "H000");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "H000" + "'", obj56, "H000");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("H000");
        int int12 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray10 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str14 = soundex12.soundex("");
        java.lang.Object obj15 = soundex7.encode((java.lang.Object) "");
        soundex7.setMaxLength(10);
        int int18 = soundex7.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex8.setMaxLength(0);
        soundex8.setMaxLength((int) '4');
        int int15 = soundex8.difference("", "");
        int int18 = soundex8.difference("", "");
        java.lang.Object obj19 = soundex0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex20.difference("H000", "");
        java.lang.String str25 = soundex20.encode("");
        int int28 = soundex20.difference("H000", "H000");
        soundex20.setMaxLength((int) (short) 100);
        soundex20.setMaxLength((int) (short) -1);
        java.lang.String str34 = soundex20.soundex("");
        int int35 = soundex20.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) int35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        java.lang.Object obj14 = soundex6.encode((java.lang.Object) "");
        char[] charArray19 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex6.encode((java.lang.Object) charArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass7 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength(1);
        java.lang.String str12 = soundex6.encode("");
        soundex6.setMaxLength((int) ' ');
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex6.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        int int13 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex7.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        int int10 = soundex0.difference("H000", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex13 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str15 = soundex13.soundex("");
        java.lang.String str17 = soundex13.soundex("01230120022455012623010202");
        java.lang.Object obj18 = soundex11.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str20 = soundex11.soundex("");
        int int23 = soundex11.difference("01230120022455012623010202", "");
        java.lang.Class<?> wildcardClass24 = soundex11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(soundex13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str5 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex12.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) '4');
        java.lang.Class<?> wildcardClass13 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.soundex("H000");
        java.lang.String str12 = soundex6.encode("H000");
        soundex6.setMaxLength((-1));
        java.lang.String str16 = soundex6.soundex("01230120022455012623010202");
        int int19 = soundex6.difference("H000", "");
        java.lang.String str21 = soundex6.encode("H000");
        java.lang.String str23 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj24 = soundex3.encode((java.lang.Object) "01230120022455012623010202");
        soundex3.setMaxLength(10);
        java.lang.String str28 = soundex3.encode("");
        int int29 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = soundex3.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex();
        int int2 = soundex1.getMaxLength();
        int int3 = soundex1.getMaxLength();
        java.lang.String str5 = soundex1.soundex("");
        java.lang.String str7 = soundex1.encode("H000");
        java.lang.Object obj8 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str12 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int17 = soundex14.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str19 = soundex14.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        java.lang.String str24 = soundex20.encode("hi!");
        java.lang.String str26 = soundex20.encode("H000");
        java.lang.String str28 = soundex20.encode("");
        int int31 = soundex20.difference("01230120022455012623010202", "hi!");
        java.lang.String str33 = soundex20.soundex("H000");
        java.lang.Object obj34 = soundex14.encode((java.lang.Object) "H000");
        int int37 = soundex14.difference("H000", "hi!");
        java.lang.Object obj38 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str40 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex();
        soundex41.setMaxLength((int) '#');
        java.lang.String str45 = soundex41.encode("01230120022455012623010202");
        int int48 = soundex41.difference("H000", "H000");
        soundex41.setMaxLength(1);
        soundex41.setMaxLength((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = soundex0.encode((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "H000" + "'", obj34, "H000");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "H000" + "'", obj38, "H000");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H000" + "'", str40, "H000");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "H000");
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        soundex0.setMaxLength(32);
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(32);
        int int11 = soundex0.getMaxLength();
        int int12 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        char[] charArray6 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        int int8 = soundex7.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex9.difference("H000", "");
        java.lang.String str14 = soundex9.encode("");
        int int17 = soundex9.difference("H000", "H000");
        int int20 = soundex9.difference("H000", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex7.encode((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.soundex("hi!");
        int int20 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        java.lang.String str15 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str18 = soundex16.encode("hi!");
        java.lang.String str20 = soundex16.encode("");
        java.lang.String str22 = soundex16.encode("H000");
        java.lang.String str24 = soundex16.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex16.encode("01230120022455012623010202");
        soundex16.setMaxLength((-1));
        java.lang.String str30 = soundex16.encode("H000");
        int int31 = soundex16.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) int31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex11.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex6.setMaxLength((int) '4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (short) 100);
        int int16 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        soundex8.setMaxLength((int) '#');
        java.lang.String str12 = soundex8.encode("01230120022455012623010202");
        java.lang.Object obj13 = soundex0.encode((java.lang.Object) str12);
        int int16 = soundex0.difference("H000", "");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str20 = soundex0.encode("hi!");
        int int21 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex7.setMaxLength(0);
        int int12 = soundex7.difference("", "");
        java.lang.String str14 = soundex7.soundex("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        java.lang.String str16 = soundex1.soundex("01230120022455012623010202");
        int int17 = soundex1.getMaxLength();
        java.lang.String str19 = soundex1.encode("H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("");
        int int9 = soundex0.difference("hi!", "");
        char[] charArray15 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        int int18 = soundex17.getMaxLength();
        java.lang.String str20 = soundex17.encode("01230120022455012623010202");
        int int21 = soundex17.getMaxLength();
        int int22 = soundex17.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex0.encode((java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.soundex("H000");
        java.lang.String str12 = soundex6.encode("H000");
        soundex6.setMaxLength((-1));
        java.lang.String str16 = soundex6.soundex("01230120022455012623010202");
        int int19 = soundex6.difference("H000", "");
        java.lang.String str21 = soundex6.encode("H000");
        java.lang.String str23 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj24 = soundex3.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str26 = soundex3.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass27 = soundex3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength((int) (short) 100);
        int int6 = soundex1.difference("H000", "hi!");
        java.lang.String str8 = soundex1.soundex("01230120022455012623010202");
        char[] charArray13 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray13);
        soundex19.setMaxLength(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex1.encode((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.soundex("");
        java.lang.String str12 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        int int12 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("hi!", "hi!");
        java.lang.String str18 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex7.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        java.lang.String str15 = soundex8.soundex("");
        java.lang.String str17 = soundex8.encode("H000");
        java.lang.String str19 = soundex8.encode("");
        java.lang.Object obj20 = soundex0.encode((java.lang.Object) str19);
        java.lang.String str22 = soundex0.encode("");
        java.lang.Class<?> wildcardClass23 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.String str12 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str16 = soundex0.encode("");
        soundex0.setMaxLength((int) (byte) 10);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str21 = soundex19.encode("hi!");
        java.lang.String str23 = soundex19.soundex("hi!");
        java.lang.String str25 = soundex19.encode("hi!");
        int int28 = soundex19.difference("01230120022455012623010202", "H000");
        soundex19.setMaxLength(52);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex();
        int int32 = soundex31.getMaxLength();
        int int33 = soundex31.getMaxLength();
        java.lang.String str35 = soundex31.encode("hi!");
        java.lang.String str37 = soundex31.encode("H000");
        java.lang.String str39 = soundex31.soundex("hi!");
        java.lang.String str41 = soundex31.soundex("01230120022455012623010202");
        int int44 = soundex31.difference("H000", "H000");
        java.lang.Object obj45 = soundex19.encode((java.lang.Object) "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = soundex0.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H000" + "'", str39, "H000");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "H000" + "'", obj45, "H000");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("hi!");
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) -1);
        soundex5.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = soundex5.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        int int6 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str5 = soundex0.soundex("01230120022455012623010202");
        char[] charArray8 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray8);
        java.lang.String str12 = soundex10.soundex("");
        java.lang.Class<?> wildcardClass13 = soundex10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex0.encode((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int12 = soundex1.getMaxLength();
        java.lang.String str14 = soundex1.encode("H000");
        java.lang.String str16 = soundex1.encode("H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("");
        java.lang.String str17 = soundex0.soundex("");
        java.lang.String str19 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int11 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        soundex0.setMaxLength(52);
        int int10 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (short) 0);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        java.lang.String str3 = soundex1.soundex("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = soundex1.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str12 = soundex10.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        java.lang.String str17 = soundex13.encode("");
        java.lang.String str19 = soundex13.encode("H000");
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj22 = soundex13.encode((java.lang.Object) "hi!");
        java.lang.String str24 = soundex13.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex13.encode("H000");
        java.lang.String str28 = soundex13.encode("");
        java.lang.String str30 = soundex13.soundex("");
        java.lang.Object obj31 = soundex10.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H000" + "'", obj22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int17 = soundex0.difference("H000", "hi!");
        java.lang.String str19 = soundex0.encode("");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("H000");
        java.lang.String str14 = soundex0.soundex("hi!");
        java.lang.String str16 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        java.lang.String str8 = soundex1.soundex("hi!");
        char[] charArray13 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex1.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex7.difference("01230120022455012623010202", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex7.getMaxLength();
        int int9 = soundex7.getMaxLength();
        java.lang.String str11 = soundex7.encode("hi!");
        java.lang.String str13 = soundex7.encode("H000");
        java.lang.String str15 = soundex7.encode("");
        int int18 = soundex7.difference("01230120022455012623010202", "hi!");
        java.lang.String str20 = soundex7.soundex("H000");
        java.lang.Object obj21 = soundex1.encode((java.lang.Object) "H000");
        int int24 = soundex1.difference("H000", "hi!");
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str27 = soundex25.encode("hi!");
        java.lang.String str29 = soundex25.encode("");
        int int32 = soundex25.difference("", "H000");
        java.lang.String str34 = soundex25.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex1.encode((java.lang.Object) soundex25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("H000");
        int int17 = soundex0.difference("hi!", "");
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength(1);
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 100);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        int int20 = soundex18.getMaxLength();
        java.lang.String str22 = soundex18.encode("hi!");
        java.lang.String str24 = soundex18.encode("H000");
        java.lang.String str26 = soundex18.encode("");
        java.lang.String str28 = soundex18.soundex("hi!");
        java.lang.String str30 = soundex18.soundex("H000");
        soundex18.setMaxLength(0);
        java.lang.String str34 = soundex18.soundex("hi!");
        int int37 = soundex18.difference("H000", "");
        java.lang.Object obj38 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        int int12 = soundex8.getMaxLength();
        java.lang.String str14 = soundex8.soundex("hi!");
        java.lang.String str16 = soundex8.encode("hi!");
        int int19 = soundex8.difference("01230120022455012623010202", "hi!");
        java.lang.String str21 = soundex8.soundex("");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) "");
        java.lang.String str24 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass25 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 0);
        int int16 = soundex0.difference("", "H000");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        int int18 = soundex0.difference("H000", "hi!");
        java.lang.String str20 = soundex0.soundex("");
        int int23 = soundex0.difference("", "01230120022455012623010202");
        soundex0.setMaxLength(4);
        java.lang.Class<?> wildcardClass26 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int15 = soundex0.getMaxLength();
        int int16 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int10 = soundex0.difference("H000", "");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.String str12 = soundex0.encode("");
        int int13 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex14.getMaxLength();
        int int16 = soundex14.getMaxLength();
        java.lang.String str18 = soundex14.soundex("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex0.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.soundex("");
        java.lang.String str13 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        int int18 = soundex0.difference("hi!", "");
        int int19 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        int int22 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertNotNull(soundex0);
// flaky "5) test1334(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
// flaky "2) test1334(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "2) test1334(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("");
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str18 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        int int9 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("");
        int int12 = soundex0.difference("H000", "hi!");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.soundex("hi!");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str19 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.encode("");
        int int18 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) (byte) 1);
        soundex0.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        soundex1.setMaxLength((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        int int13 = soundex7.getMaxLength();
        int int14 = soundex7.getMaxLength();
        int int17 = soundex7.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        int int18 = soundex0.difference("hi!", "");
        int int19 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str23 = soundex0.encode("01230120022455012623010202");
        int int26 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.soundex("hi!");
        int int22 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        int int20 = soundex0.difference("", "");
        java.lang.String str22 = soundex0.soundex("H000");
        java.lang.String str24 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        soundex8.setMaxLength((int) '#');
        java.lang.String str12 = soundex8.encode("01230120022455012623010202");
        java.lang.Object obj13 = soundex0.encode((java.lang.Object) str12);
        int int16 = soundex0.difference("H000", "");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass14 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int9 = soundex8.getMaxLength();
        int int12 = soundex8.difference("", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex8.difference("H000", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int10 = soundex0.getMaxLength();
        int int13 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(32);
        soundex0.setMaxLength(35);
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '4');
        java.lang.String str10 = soundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex6.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int9 = soundex6.difference("", "");
        soundex6.setMaxLength(10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        java.lang.String str17 = soundex0.soundex("hi!");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        int int20 = soundex0.getMaxLength();
        java.lang.String str22 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass23 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex0.difference("", "H000");
        java.lang.String str14 = soundex0.soundex("H000");
        int int15 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        soundex0.setMaxLength(32);
        soundex0.setMaxLength(0);
        char[] charArray20 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray20);
        java.lang.String str25 = soundex23.encode("");
        soundex23.setMaxLength(0);
        soundex23.setMaxLength(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) soundex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(4);
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(52);
        int int6 = soundex1.difference("hi!", "01230120022455012623010202");
        java.lang.String str8 = soundex1.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        int int11 = soundex9.getMaxLength();
        java.lang.String str13 = soundex9.soundex("H000");
        java.lang.String str15 = soundex9.encode("H000");
        soundex9.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex18.difference("H000", "");
        java.lang.String str23 = soundex18.encode("");
        java.lang.String str25 = soundex18.soundex("");
        java.lang.String str27 = soundex18.soundex("hi!");
        int int28 = soundex18.getMaxLength();
        int int29 = soundex18.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex();
        int int33 = soundex30.difference("H000", "");
        int int34 = soundex30.getMaxLength();
        java.lang.String str36 = soundex30.soundex("hi!");
        java.lang.Object obj37 = soundex18.encode((java.lang.Object) "hi!");
        java.lang.Object obj38 = soundex9.encode((java.lang.Object) "hi!");
        java.lang.Object obj39 = soundex1.encode(obj38);
        java.lang.String str41 = soundex1.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "H000" + "'", obj37, "H000");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "H000" + "'", obj38, "H000");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "H000" + "'", obj39, "H000");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        int int6 = soundex3.difference("", "");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.Class<?> wildcardClass14 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int11 = soundex8.difference("01230120022455012623010202", "01230120022455012623010202");
        int int14 = soundex8.difference("", "hi!");
        java.lang.String str16 = soundex8.encode("");
        java.lang.String str18 = soundex8.encode("01230120022455012623010202");
        java.lang.Object obj19 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        char[] charArray24 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray24);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray24);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray24);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray24);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray24);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray24);
        java.lang.String str32 = soundex30.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex0.encode((java.lang.Object) soundex30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("hi!");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = soundex13.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.difference("", "hi!");
        java.lang.String str13 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int18 = soundex15.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str20 = soundex15.encode("01230120022455012623010202");
        java.lang.String str22 = soundex15.encode("H000");
        java.lang.String str24 = soundex15.encode("01230120022455012623010202");
        java.lang.Object obj25 = soundex0.encode((java.lang.Object) str24);
        java.lang.String str27 = soundex0.soundex("H000");
        int int28 = soundex0.getMaxLength();
        int int29 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass30 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex9.difference("H000", "");
        java.lang.String str14 = soundex9.encode("");
        int int17 = soundex9.difference("H000", "H000");
        soundex9.setMaxLength((int) (short) 100);
        soundex9.setMaxLength((int) (short) -1);
        java.lang.String str23 = soundex9.soundex("");
        int int26 = soundex9.difference("H000", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(32);
        soundex0.setMaxLength(35);
        int int14 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.soundex("");
        int int9 = soundex6.getMaxLength();
        int int10 = soundex6.getMaxLength();
        int int11 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        char[] charArray6 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.Class<?> wildcardClass9 = soundex8.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', '4', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        soundex6.setMaxLength((int) ' ');
        java.lang.String str12 = soundex6.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex14.getMaxLength();
        int int16 = soundex14.getMaxLength();
        java.lang.String str18 = soundex14.soundex("H000");
        java.lang.String str20 = soundex14.encode("H000");
        soundex14.setMaxLength((-1));
        java.lang.String str24 = soundex14.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex14.soundex("");
        java.lang.String str28 = soundex14.soundex("");
        java.lang.String str30 = soundex14.encode("01230120022455012623010202");
        java.lang.Object obj31 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int32 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        int int11 = soundex6.getMaxLength();
        int int12 = soundex6.getMaxLength();
        int int13 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength((int) ' ');
        char[] charArray12 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str22 = soundex20.soundex("");
        java.lang.Object obj23 = soundex1.encode((java.lang.Object) "");
        int int26 = soundex1.difference("01230120022455012623010202", "hi!");
        java.lang.String str28 = soundex1.encode("");
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex();
        int int32 = soundex29.difference("H000", "");
        java.lang.String str34 = soundex29.encode("");
        java.lang.String str36 = soundex29.soundex("");
        java.lang.String str38 = soundex29.soundex("hi!");
        int int39 = soundex29.getMaxLength();
        java.lang.String str41 = soundex29.encode("H000");
        java.lang.String str43 = soundex29.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex44 = new org.apache.commons.codec.language.Soundex();
        int int45 = soundex44.getMaxLength();
        int int46 = soundex44.getMaxLength();
        java.lang.String str48 = soundex44.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex49 = new org.apache.commons.codec.language.Soundex();
        int int50 = soundex49.getMaxLength();
        int int51 = soundex49.getMaxLength();
        java.lang.String str53 = soundex49.soundex("hi!");
        java.lang.Object obj54 = soundex44.encode((java.lang.Object) "hi!");
        int int57 = soundex44.difference("", "");
        java.lang.Object obj58 = soundex29.encode((java.lang.Object) "");
        java.lang.String str60 = soundex29.encode("hi!");
        java.lang.Class<?> wildcardClass61 = soundex29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = soundex1.encode((java.lang.Object) soundex29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H000" + "'", str43, "H000");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "H000" + "'", str48, "H000");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "H000" + "'", str53, "H000");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "H000" + "'", obj54, "H000");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "" + "'", obj58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "H000" + "'", str60, "H000");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("");
        int int17 = soundex0.difference("H000", "hi!");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str20 = soundex18.encode("hi!");
        int int23 = soundex18.difference("hi!", "01230120022455012623010202");
        java.lang.String str25 = soundex18.soundex("");
        java.lang.String str27 = soundex18.soundex("hi!");
        java.lang.String str29 = soundex18.encode("hi!");
        int int30 = soundex18.getMaxLength();
        int int33 = soundex18.difference("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) int33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.soundex("H000");
        int int12 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex0.encode((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        int int8 = soundex5.getMaxLength();
        soundex5.setMaxLength(100);
        java.lang.Class<?> wildcardClass11 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 100);
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        int int19 = soundex15.getMaxLength();
        java.lang.String str21 = soundex15.soundex("hi!");
        soundex15.setMaxLength((int) (short) -1);
        soundex15.setMaxLength(10);
        soundex15.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str14 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.encode("");
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int14 = soundex11.difference("H000", "");
        java.lang.String str16 = soundex11.encode("");
        java.lang.String str18 = soundex11.soundex("");
        java.lang.Object obj19 = soundex6.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = soundex6.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        int int6 = soundex3.getMaxLength();
        int int7 = soundex3.getMaxLength();
        int int8 = soundex3.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength((int) (byte) 10);
        soundex6.setMaxLength(1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        java.lang.String str13 = soundex1.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex1.soundex("hi!");
        int int16 = soundex1.getMaxLength();
        java.lang.String str18 = soundex1.soundex("");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int22 = soundex19.difference("H000", "");
        java.lang.String str24 = soundex19.encode("");
        int int25 = soundex19.getMaxLength();
        soundex19.setMaxLength((-1));
        int int30 = soundex19.difference("", "");
        int int31 = soundex19.getMaxLength();
        java.lang.String str33 = soundex19.soundex("H000");
        java.lang.String str35 = soundex19.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass36 = soundex19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex1.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass23 = soundex22.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("");
        soundex0.setMaxLength((int) ' ');
        int int11 = soundex0.difference("", "");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "H000");
        int int10 = soundex0.difference("H000", "");
        int int13 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex0.soundex("H000");
        int int13 = soundex0.difference("hi!", "hi!");
        int int16 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        char[] charArray18 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        soundex19.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex22.getMaxLength();
        int int24 = soundex22.getMaxLength();
        java.lang.String str26 = soundex22.soundex("H000");
        java.lang.String str28 = soundex22.encode("H000");
        soundex22.setMaxLength((-1));
        java.lang.String str32 = soundex22.soundex("01230120022455012623010202");
        int int35 = soundex22.difference("H000", "");
        java.lang.String str37 = soundex22.encode("H000");
        java.lang.String str39 = soundex22.soundex("01230120022455012623010202");
        java.lang.Object obj40 = soundex19.encode((java.lang.Object) "01230120022455012623010202");
        soundex19.setMaxLength(10);
        java.lang.String str44 = soundex19.encode("");
        int int45 = soundex19.getMaxLength();
        int int46 = soundex19.getMaxLength();
        int int47 = soundex19.getMaxLength();
        java.lang.String str49 = soundex19.soundex("");
        java.lang.Object obj50 = soundex0.encode((java.lang.Object) str49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        soundex11.setMaxLength((int) 'a');
        java.lang.String str16 = soundex11.encode("H000");
        soundex11.setMaxLength((int) '#');
        java.lang.String str20 = soundex11.encode("");
        java.lang.Class<?> wildcardClass21 = soundex11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        java.lang.String str14 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = soundex5.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.Class<?> wildcardClass13 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        int int11 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) '4');
        java.lang.String str15 = soundex6.soundex("");
        java.lang.String str17 = soundex6.encode("");
        char[] charArray23 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray23);
        int int30 = soundex27.difference("01230120022455012623010202", "");
        java.lang.Object obj31 = soundex6.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str15 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        char[] charArray20 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        java.lang.String str24 = soundex22.soundex("");
        java.lang.String str26 = soundex22.soundex("01230120022455012623010202");
        int int27 = soundex22.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode((java.lang.Object) int27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.difference("01230120022455012623010202", "");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("", "");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        char[] charArray15 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        soundex16.setMaxLength(10);
        soundex16.setMaxLength(1);
        java.lang.String str22 = soundex16.encode("");
        int int23 = soundex16.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        soundex9.setMaxLength((int) '#');
        java.lang.String str13 = soundex9.encode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex7.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("H000");
        java.lang.String str14 = soundex0.soundex("hi!");
        int int17 = soundex0.difference("hi!", "01230120022455012623010202");
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("hi!");
        int int15 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex16.getMaxLength();
        int int18 = soundex16.getMaxLength();
        soundex16.setMaxLength((int) (byte) -1);
        int int21 = soundex16.getMaxLength();
        java.lang.String str23 = soundex16.soundex("");
        java.lang.Class<?> wildcardClass24 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        int int10 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "6) test1405(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.encode("H000");
        char[] charArray18 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray18);
        int int25 = soundex22.difference("01230120022455012623010202", "");
        soundex22.setMaxLength(1);
        soundex22.setMaxLength((int) (byte) -1);
        java.lang.Class<?> wildcardClass30 = soundex22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex0.encode((java.lang.Object) soundex22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength(10);
        java.lang.String str20 = soundex0.encode("01230120022455012623010202");
        java.lang.String str22 = soundex0.soundex("H000");
        int int25 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        java.lang.String str12 = soundex8.soundex("");
        java.lang.String str14 = soundex8.soundex("");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.String str18 = soundex16.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex8.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("H000");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex17.getMaxLength();
        soundex17.setMaxLength((int) 'a');
        java.lang.String str22 = soundex17.encode("H000");
        int int23 = soundex17.getMaxLength();
        int int24 = soundex17.getMaxLength();
        soundex17.setMaxLength((int) (byte) 0);
        soundex17.setMaxLength(0);
        java.lang.String str30 = soundex17.soundex("hi!");
        java.lang.Object obj31 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H000" + "'", obj31, "H000");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        java.lang.String str5 = soundex1.soundex("H000");
        soundex1.setMaxLength((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        int int6 = soundex1.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex1.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(0);
        soundex4.setMaxLength((int) (short) -1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        soundex1.setMaxLength((int) (short) 10);
        int int10 = soundex1.getMaxLength();
        java.lang.String str12 = soundex1.soundex("01230120022455012623010202");
        int int13 = soundex1.getMaxLength();
        java.lang.String str15 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("hi!");
        int int15 = soundex0.getMaxLength();
        int int16 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) '#');
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("", "H000");
        java.lang.String str16 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        int int21 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex0.setMaxLength((int) ' ');
        int int26 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.Class<?> wildcardClass9 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str16 = soundex0.encode("");
        int int19 = soundex0.difference("H000", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (byte) 100);
        soundex0.setMaxLength(35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.soundex("H000");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("01230120022455012623010202", "");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex17.setMaxLength(0);
        soundex17.setMaxLength((int) '4');
        int int22 = soundex17.getMaxLength();
        int int23 = soundex17.getMaxLength();
        java.lang.Class<?> wildcardClass24 = soundex17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
// flaky "7) test1421(org.apache.commons.codec.language.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "hi!");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        int int11 = soundex9.getMaxLength();
        java.lang.String str13 = soundex9.soundex("");
        java.lang.String str15 = soundex9.encode("H000");
        java.lang.Object obj16 = soundex8.encode((java.lang.Object) "H000");
        soundex8.setMaxLength((int) (byte) 0);
        java.lang.String str20 = soundex8.soundex("");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int25 = soundex22.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str27 = soundex22.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex();
        int int29 = soundex28.getMaxLength();
        int int30 = soundex28.getMaxLength();
        java.lang.String str32 = soundex28.encode("hi!");
        java.lang.String str34 = soundex28.encode("H000");
        java.lang.String str36 = soundex28.encode("");
        int int39 = soundex28.difference("01230120022455012623010202", "hi!");
        java.lang.String str41 = soundex28.soundex("H000");
        java.lang.Object obj42 = soundex22.encode((java.lang.Object) "H000");
        int int45 = soundex22.difference("H000", "hi!");
        java.lang.Object obj46 = soundex8.encode((java.lang.Object) "H000");
        java.lang.String str48 = soundex8.encode("hi!");
        java.lang.Object obj49 = soundex0.encode((java.lang.Object) str48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "H000" + "'", obj16, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "H000" + "'", obj42, "H000");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "H000" + "'", obj46, "H000");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "H000" + "'", str48, "H000");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "H000" + "'", obj49, "H000");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(52);
        int int10 = soundex0.difference("hi!", "");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        soundex11.setMaxLength((int) 'a');
        java.lang.String str16 = soundex11.encode("H000");
        soundex11.setMaxLength((int) '#');
        java.lang.String str20 = soundex11.encode("");
        soundex11.setMaxLength((int) ' ');
        java.lang.String str24 = soundex11.soundex("H000");
        int int25 = soundex11.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength((int) (byte) 1);
        int int14 = soundex0.difference("", "H000");
        java.lang.String str16 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex9.difference("H000", "");
        java.lang.String str14 = soundex9.encode("");
        java.lang.String str16 = soundex9.soundex("");
        java.lang.String str18 = soundex9.soundex("hi!");
        int int19 = soundex9.getMaxLength();
        int int20 = soundex9.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex();
        int int24 = soundex21.difference("H000", "");
        int int25 = soundex21.getMaxLength();
        java.lang.String str27 = soundex21.soundex("hi!");
        java.lang.Object obj28 = soundex9.encode((java.lang.Object) "hi!");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) "hi!");
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex();
        int int33 = soundex30.difference("H000", "");
        int int34 = soundex30.getMaxLength();
        java.lang.String str36 = soundex30.soundex("hi!");
        java.lang.String str38 = soundex30.encode("hi!");
        int int41 = soundex30.difference("01230120022455012623010202", "hi!");
        java.lang.String str43 = soundex30.encode("");
        java.lang.Object obj44 = soundex0.encode((java.lang.Object) str43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H000" + "'", obj28, "H000");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength(4);
        soundex0.setMaxLength(97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "01230120022455012623010202");
        int int20 = soundex1.difference("hi!", "hi!");
        int int23 = soundex1.difference("", "H000");
        java.lang.String str25 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        java.lang.String str13 = soundex0.soundex("");
        int int14 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        java.lang.String str14 = soundex8.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = soundex8.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str8 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.soundex("H000");
        java.lang.String str12 = soundex6.encode("H000");
        soundex6.setMaxLength((-1));
        java.lang.String str16 = soundex6.soundex("01230120022455012623010202");
        int int19 = soundex6.difference("H000", "");
        java.lang.String str21 = soundex6.encode("H000");
        java.lang.String str23 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj24 = soundex3.encode((java.lang.Object) "01230120022455012623010202");
        soundex3.setMaxLength(10);
        java.lang.String str28 = soundex3.encode("01230120022455012623010202");
        int int31 = soundex3.difference("01230120022455012623010202", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        int int6 = soundex3.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str9 = soundex7.encode("hi!");
        java.lang.String str11 = soundex7.encode("");
        java.lang.String str13 = soundex7.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex3.encode((java.lang.Object) "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex7.getMaxLength();
        soundex7.setMaxLength((int) 'a');
        java.lang.String str12 = soundex7.encode("H000");
        soundex7.setMaxLength((int) '#');
        java.lang.String str16 = soundex7.encode("");
        int int19 = soundex7.difference("H000", "01230120022455012623010202");
        int int22 = soundex7.difference("hi!", "");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) "");
        soundex0.setMaxLength((int) (short) 10);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str28 = soundex26.encode("hi!");
        int int31 = soundex26.difference("hi!", "01230120022455012623010202");
        soundex26.setMaxLength(52);
        int int36 = soundex26.difference("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex0.encode((java.lang.Object) int36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex7.setMaxLength((int) 'a');
        int int12 = soundex7.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        java.lang.String str18 = soundex13.encode("");
        java.lang.String str20 = soundex13.soundex("");
        java.lang.String str22 = soundex13.encode("H000");
        java.lang.String str24 = soundex13.encode("hi!");
        int int27 = soundex13.difference("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex7.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        int int12 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str14 = soundex0.encode("01230120022455012623010202");
        java.lang.String str16 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex17.difference("H000", "");
        java.lang.String str22 = soundex17.encode("");
        int int25 = soundex17.difference("H000", "H000");
        soundex17.setMaxLength((int) (short) 100);
        soundex17.setMaxLength((int) (short) -1);
        int int32 = soundex17.difference("", "hi!");
        int int33 = soundex17.getMaxLength();
        int int34 = soundex17.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex0.encode((java.lang.Object) int34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        java.lang.String str6 = soundex0.encode("H000");
        int int9 = soundex0.difference("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength(1);
        java.lang.String str15 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str17 = soundex0.encode("H000");
        java.lang.String str19 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.soundex("");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        int int19 = soundex0.difference("H000", "H000");
        java.lang.String str21 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex22.getMaxLength();
        int int24 = soundex22.getMaxLength();
        soundex22.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("");
        soundex0.setMaxLength((int) 'a');
        java.lang.String str18 = soundex0.encode("");
        java.lang.String str20 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int8 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex7.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        char[] charArray20 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        soundex21.setMaxLength((int) '#');
        soundex21.setMaxLength((int) '#');
        int int26 = soundex21.getMaxLength();
        soundex21.setMaxLength((int) '4');
        java.lang.String str30 = soundex21.soundex("");
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str33 = soundex31.encode("hi!");
        java.lang.String str35 = soundex31.encode("");
        java.lang.String str37 = soundex31.encode("H000");
        soundex31.setMaxLength(52);
        int int42 = soundex31.difference("01230120022455012623010202", "");
        java.lang.String str44 = soundex31.soundex("01230120022455012623010202");
        java.lang.Object obj45 = soundex21.encode((java.lang.Object) "01230120022455012623010202");
        soundex21.setMaxLength(32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = soundex0.encode((java.lang.Object) soundex21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("", "H000");
        java.lang.String str16 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        int int21 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int26 = soundex23.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int30 = soundex0.difference("", "hi!");
        int int31 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = soundex4.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        java.lang.String str12 = soundex8.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex8.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        int int12 = soundex0.difference("01230120022455012623010202", "");
        soundex0.setMaxLength((int) (byte) 100);
        int int17 = soundex0.difference("hi!", "hi!");
        soundex0.setMaxLength((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex9.difference("H000", "");
        java.lang.String str14 = soundex9.encode("");
        java.lang.String str16 = soundex9.soundex("");
        java.lang.String str18 = soundex9.soundex("hi!");
        soundex9.setMaxLength((int) (short) 0);
        java.lang.String str22 = soundex9.soundex("01230120022455012623010202");
        java.lang.String str24 = soundex9.soundex("hi!");
        java.lang.Class<?> wildcardClass25 = soundex9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.encode("");
        int int10 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.soundex("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str13 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) (byte) 1);
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.soundex("");
        java.lang.String str20 = soundex0.encode("H000");
        int int21 = soundex0.getMaxLength();
        soundex0.setMaxLength(1);
        soundex0.setMaxLength(52);
        int int26 = soundex0.getMaxLength();
        int int27 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str15 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int5 = soundex1.getMaxLength();
        java.lang.String str7 = soundex1.encode("");
        java.lang.String str9 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        java.lang.String str12 = soundex8.soundex("H000");
        java.lang.String str14 = soundex8.encode("H000");
        soundex8.setMaxLength((-1));
        java.lang.String str18 = soundex8.soundex("01230120022455012623010202");
        int int21 = soundex8.difference("hi!", "01230120022455012623010202");
        int int22 = soundex8.getMaxLength();
        soundex8.setMaxLength((int) (short) 10);
        soundex8.setMaxLength(10);
        java.lang.String str28 = soundex8.encode("01230120022455012623010202");
        java.lang.Object obj29 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str32 = soundex30.encode("hi!");
        int int35 = soundex30.difference("01230120022455012623010202", "H000");
        java.lang.String str37 = soundex30.soundex("");
        java.lang.Object obj38 = soundex1.encode((java.lang.Object) str37);
        org.apache.commons.codec.language.Soundex soundex40 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex40.setMaxLength(0);
        soundex40.setMaxLength((int) '4');
        int int45 = soundex40.getMaxLength();
        java.lang.String str47 = soundex40.soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = soundex1.encode((java.lang.Object) soundex40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "H000" + "'", str47, "H000");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int20 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        soundex6.setMaxLength((int) ' ');
        java.lang.String str12 = soundex6.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex6.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.encode("");
        int int18 = soundex0.getMaxLength();
        int int21 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex0.difference("", "H000");
        soundex0.setMaxLength(1);
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        java.lang.String str18 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength(97);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = soundex1.difference("hi!", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        int int6 = soundex4.getMaxLength();
        java.lang.String str8 = soundex4.encode("");
        soundex4.setMaxLength(32);
        int int11 = soundex4.getMaxLength();
        char[] charArray16 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex4.encode((java.lang.Object) charArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        java.lang.String str13 = soundex9.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex9.soundex("");
        java.lang.String str17 = soundex9.encode("");
        java.lang.String str19 = soundex9.encode("");
        java.lang.Object obj20 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str13 = soundex0.soundex("H000");
        java.lang.String str15 = soundex0.encode("H000");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("01230120022455012623010202");
        int int6 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex7.difference("H000", "");
        java.lang.String str12 = soundex7.encode("");
        int int15 = soundex7.difference("H000", "H000");
        int int18 = soundex7.difference("hi!", "");
        java.lang.String str20 = soundex7.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass21 = soundex7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode((java.lang.Object) soundex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        java.lang.String str17 = soundex0.soundex("hi!");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        int int20 = soundex0.getMaxLength();
        java.lang.String str22 = soundex0.encode("H000");
        java.lang.String str24 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 0);
        soundex0.setMaxLength(0);
        java.lang.String str13 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str15 = soundex0.soundex("H000");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.encode("H000");
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str8 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        int int11 = soundex9.getMaxLength();
        java.lang.String str13 = soundex9.soundex("H000");
        java.lang.String str15 = soundex9.encode("H000");
        soundex9.setMaxLength((-1));
        java.lang.String str19 = soundex9.soundex("01230120022455012623010202");
        java.lang.String str21 = soundex9.encode("H000");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) str21);
        char[] charArray28 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray28);
        soundex31.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H000" + "'", obj22, "H000");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', ' ', '4', '4', '4' });
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength(10);
        int int17 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str20 = soundex18.encode("hi!");
        java.lang.String str22 = soundex18.soundex("01230120022455012623010202");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) str22);
        char[] charArray29 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex34 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex35 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex36 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex37 = new org.apache.commons.codec.language.Soundex(charArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = soundex0.encode((java.lang.Object) soundex37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', ' ', '4', '4', '4' });
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        java.lang.String str5 = soundex1.encode("");
        java.lang.String str7 = soundex1.encode("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        java.lang.String str15 = soundex8.soundex("");
        java.lang.String str17 = soundex8.soundex("hi!");
        int int18 = soundex8.getMaxLength();
        int int19 = soundex8.getMaxLength();
        java.lang.String str21 = soundex8.encode("H000");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) str21);
        java.lang.String str24 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass25 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H000" + "'", obj22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("hi!");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("");
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str20 = soundex0.encode("hi!");
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode(obj21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        soundex0.setMaxLength(10);
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass18 = soundex17.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str15 = soundex0.soundex("H000");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str21 = soundex19.encode("hi!");
        java.lang.String str23 = soundex19.encode("");
        java.lang.String str25 = soundex19.encode("H000");
        java.lang.String str27 = soundex19.soundex("01230120022455012623010202");
        soundex19.setMaxLength(0);
        java.lang.String str31 = soundex19.soundex("");
        java.lang.String str33 = soundex19.soundex("hi!");
        int int34 = soundex19.getMaxLength();
        soundex19.setMaxLength(1);
        int int37 = soundex19.getMaxLength();
        java.lang.Class<?> wildcardClass38 = soundex19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex0.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.soundex("hi!");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        int int13 = soundex9.getMaxLength();
        int int14 = soundex9.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        int int12 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("H000");
        java.lang.String str11 = soundex1.soundex("");
        int int12 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(1);
        int int12 = soundex4.getMaxLength();
        java.lang.String str14 = soundex4.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.soundex("H000");
        java.lang.String str21 = soundex15.encode("H000");
        soundex15.setMaxLength((-1));
        java.lang.String str25 = soundex15.soundex("01230120022455012623010202");
        java.lang.String str27 = soundex15.soundex("");
        java.lang.String str29 = soundex15.soundex("");
        java.lang.String str31 = soundex15.encode("01230120022455012623010202");
        soundex15.setMaxLength((int) (byte) 1);
        java.lang.String str35 = soundex15.encode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex4.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        int int6 = soundex3.getMaxLength();
        int int7 = soundex3.getMaxLength();
        java.lang.String str9 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex3.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        int int11 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) '4');
        java.lang.String str15 = soundex6.soundex("");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str18 = soundex16.encode("hi!");
        java.lang.String str20 = soundex16.encode("");
        java.lang.String str22 = soundex16.encode("H000");
        soundex16.setMaxLength(52);
        int int27 = soundex16.difference("01230120022455012623010202", "");
        java.lang.String str29 = soundex16.soundex("01230120022455012623010202");
        java.lang.Object obj30 = soundex6.encode((java.lang.Object) "01230120022455012623010202");
        soundex6.setMaxLength((int) (byte) 1);
        soundex6.setMaxLength((-1));
        java.lang.String str36 = soundex6.encode("01230120022455012623010202");
        char[] charArray39 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex40 = new org.apache.commons.codec.language.Soundex(charArray39);
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex(charArray39);
        org.apache.commons.codec.language.Soundex soundex42 = new org.apache.commons.codec.language.Soundex(charArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = soundex6.encode((java.lang.Object) soundex42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '#', '4' });
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str11 = soundex0.encode("hi!");
        java.lang.String str13 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (byte) 1);
        int int11 = soundex6.difference("01230120022455012623010202", "");
        soundex6.setMaxLength(10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        soundex1.setMaxLength(35);
        soundex1.setMaxLength((int) (byte) 100);
        int int18 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex19.getMaxLength();
        int int21 = soundex19.getMaxLength();
        java.lang.String str23 = soundex19.soundex("H000");
        java.lang.String str25 = soundex19.encode("H000");
        soundex19.setMaxLength((-1));
        java.lang.String str29 = soundex19.soundex("01230120022455012623010202");
        int int32 = soundex19.difference("hi!", "01230120022455012623010202");
        int int33 = soundex19.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex1.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        soundex15.setMaxLength((int) '#');
        int int20 = soundex15.difference("", "hi!");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) "");
        soundex0.setMaxLength((int) '4');
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex25.setMaxLength(0);
        soundex25.setMaxLength((int) '4');
        int int30 = soundex25.getMaxLength();
        int int33 = soundex25.difference("H000", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "H000");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("");
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("hi!");
        java.lang.String str17 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        soundex0.setMaxLength(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str15 = soundex0.soundex("H000");
        java.lang.String str17 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex();
        int int5 = soundex4.getMaxLength();
        int int6 = soundex4.getMaxLength();
        java.lang.String str8 = soundex4.soundex("H000");
        java.lang.String str10 = soundex4.encode("H000");
        soundex4.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        java.lang.String str18 = soundex13.encode("");
        java.lang.String str20 = soundex13.soundex("");
        java.lang.String str22 = soundex13.soundex("hi!");
        int int23 = soundex13.getMaxLength();
        int int24 = soundex13.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        int int28 = soundex25.difference("H000", "");
        int int29 = soundex25.getMaxLength();
        java.lang.String str31 = soundex25.soundex("hi!");
        java.lang.Object obj32 = soundex13.encode((java.lang.Object) "hi!");
        java.lang.Object obj33 = soundex4.encode((java.lang.Object) "hi!");
        int int36 = soundex4.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Object obj37 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        int int40 = soundex1.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H000" + "'", obj32, "H000");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H000" + "'", obj33, "H000");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str8 = soundex0.soundex("H000");
        int int11 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str15 = soundex0.soundex("H000");
        int int18 = soundex0.difference("H000", "");
        java.lang.String str20 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        java.lang.String str13 = soundex9.encode("");
        java.lang.String str15 = soundex9.encode("H000");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj18 = soundex9.encode((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex8.encode(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        int int12 = soundex0.difference("", "hi!");
        java.lang.String str14 = soundex0.encode("");
        int int17 = soundex0.difference("H000", "H000");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("");
        soundex0.setMaxLength((int) 'a');
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex0.encode(obj17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }
}
