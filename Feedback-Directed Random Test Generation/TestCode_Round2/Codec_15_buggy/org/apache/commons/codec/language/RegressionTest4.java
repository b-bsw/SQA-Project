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
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex6.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        int int23 = soundex0.getMaxLength();
        int int26 = soundex0.difference("H000", "H000");
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str29 = soundex27.encode("hi!");
        java.lang.String str31 = soundex27.encode("");
        java.lang.String str33 = soundex27.encode("H000");
        java.lang.String str35 = soundex27.soundex("01230120022455012623010202");
        java.lang.String str37 = soundex27.encode("01230120022455012623010202");
        soundex27.setMaxLength((-1));
        java.lang.String str41 = soundex27.encode("H000");
        java.lang.String str43 = soundex27.encode("");
        java.lang.Class<?> wildcardClass44 = soundex27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = soundex0.encode((java.lang.Object) soundex27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        java.lang.String str15 = soundex0.encode("hi!");
        int int18 = soundex0.difference("hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex8.setMaxLength(4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str15 = soundex0.soundex("hi!");
        soundex0.setMaxLength(0);
        char[] charArray20 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        java.lang.Class<?> wildcardClass23 = soundex22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        java.lang.String str14 = soundex9.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = soundex9.difference("", "H000");
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        java.lang.String str18 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex19.getMaxLength();
        int int21 = soundex19.getMaxLength();
        java.lang.String str23 = soundex19.encode("");
        int int26 = soundex19.difference("H000", "");
        java.lang.String str28 = soundex19.encode("01230120022455012623010202");
        java.lang.String str30 = soundex19.soundex("hi!");
        java.lang.String str32 = soundex19.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass33 = soundex19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex19);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.encode("01230120022455012623010202");
        java.lang.String str13 = soundex1.encode("");
        int int14 = soundex1.getMaxLength();
        java.lang.Class<?> wildcardClass15 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.String str20 = soundex0.soundex("");
        java.lang.String str22 = soundex0.encode("");
        java.lang.String str24 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass25 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) '#');
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("");
        char[] charArray20 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray20);
        int int26 = soundex25.getMaxLength();
        java.lang.String str28 = soundex25.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) soundex25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        soundex0.setMaxLength(32);
        int int18 = soundex0.difference("H000", "hi!");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.encode("H000");
        int int18 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str21 = soundex19.encode("hi!");
        java.lang.String str23 = soundex19.encode("");
        java.lang.String str25 = soundex19.encode("H000");
        java.lang.String str27 = soundex19.soundex("01230120022455012623010202");
        int int30 = soundex19.difference("H000", "");
        int int31 = soundex19.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.difference("", "");
        int int13 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength(32);
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        java.lang.String str12 = soundex6.encode("");
        java.lang.String str14 = soundex6.soundex("01230120022455012623010202");
        java.lang.String str16 = soundex6.soundex("");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex17.getMaxLength();
        soundex17.setMaxLength((int) 'a');
        java.lang.String str22 = soundex17.encode("H000");
        java.lang.String str24 = soundex17.soundex("H000");
        int int27 = soundex17.difference("hi!", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex6.encode((java.lang.Object) "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '4');
        soundex6.setMaxLength(0);
        int int11 = soundex6.getMaxLength();
        java.lang.String str13 = soundex6.encode("");
        java.lang.String str15 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int9 = soundex6.difference("", "");
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex6.encode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.lang.String str23 = soundex1.encode("01230120022455012623010202");
        soundex1.setMaxLength((-1));
        java.lang.String str27 = soundex1.encode("");
        soundex1.setMaxLength(100);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        soundex1.setMaxLength((int) (short) 10);
        java.lang.String str11 = soundex1.soundex("");
        soundex1.setMaxLength(35);
        java.lang.String str15 = soundex1.encode("H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        java.lang.String str8 = soundex1.soundex("hi!");
        java.lang.String str10 = soundex1.encode("hi!");
        java.lang.String str12 = soundex1.encode("H000");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        java.lang.String str17 = soundex13.soundex("hi!");
        soundex13.setMaxLength((int) (short) 10);
        int int22 = soundex13.difference("01230120022455012623010202", "01230120022455012623010202");
        int int25 = soundex13.difference("", "H000");
        java.lang.String str27 = soundex13.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex1.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        java.lang.String str19 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str13 = soundex11.encode("hi!");
        int int16 = soundex11.difference("hi!", "01230120022455012623010202");
        java.lang.String str18 = soundex11.soundex("");
        soundex11.setMaxLength((int) (short) -1);
        soundex11.setMaxLength((int) (short) 1);
        soundex11.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        int int26 = soundex25.getMaxLength();
        int int27 = soundex25.getMaxLength();
        java.lang.String str29 = soundex25.soundex("H000");
        java.lang.String str31 = soundex25.encode("H000");
        soundex25.setMaxLength((-1));
        java.lang.String str35 = soundex25.soundex("01230120022455012623010202");
        java.lang.String str37 = soundex25.soundex("");
        java.lang.String str39 = soundex25.soundex("");
        java.lang.String str41 = soundex25.encode("01230120022455012623010202");
        java.lang.Object obj42 = soundex11.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str44 = soundex11.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = soundex0.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        java.lang.String str5 = soundex1.encode("");
        java.lang.Class<?> wildcardClass6 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("");
        soundex0.setMaxLength(52);
        int int18 = soundex0.difference("H000", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        int int12 = soundex0.difference("", "");
        java.lang.String str14 = soundex0.soundex("H000");
        int int17 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str19 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        soundex7.setMaxLength((int) (short) 10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        char[] charArray14 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        soundex15.setMaxLength((int) '#');
        soundex15.setMaxLength((int) '#');
        int int20 = soundex15.getMaxLength();
        soundex15.setMaxLength((int) '4');
        java.lang.String str24 = soundex15.soundex("");
        java.lang.Object obj25 = soundex0.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.lang.String str23 = soundex0.encode("H000");
        soundex0.setMaxLength(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        int int22 = soundex0.difference("", "");
        java.lang.String str24 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass25 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        java.lang.String str7 = soundex0.soundex("H000");
        int int10 = soundex0.difference("hi!", "H000");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        java.lang.String str13 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex14.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex16 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str18 = soundex16.soundex("");
        java.lang.String str20 = soundex16.soundex("01230120022455012623010202");
        java.lang.Object obj21 = soundex14.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str23 = soundex14.soundex("");
        int int24 = soundex14.getMaxLength();
        java.lang.String str26 = soundex14.soundex("01230120022455012623010202");
        int int27 = soundex14.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(soundex16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.String str17 = soundex0.soundex("hi!");
        java.lang.String str19 = soundex0.encode("hi!");
        char[] charArray25 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray25);
        soundex26.setMaxLength((int) ' ');
        soundex26.setMaxLength((int) (byte) 1);
        java.lang.String str32 = soundex26.encode("");
        java.lang.Object obj33 = soundex0.encode((java.lang.Object) "");
        java.lang.String str35 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "");
        java.lang.Class<?> wildcardClass5 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
// flaky "1) test2035(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        soundex0.setMaxLength(52);
        java.lang.String str9 = soundex0.encode("H000");
        org.junit.Assert.assertNotNull(soundex0);
// flaky "2) test2036(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        soundex8.setMaxLength(10);
        soundex8.setMaxLength((int) '#');
        java.lang.String str18 = soundex8.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.Class<?> wildcardClass5 = soundex4.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex9.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        int int12 = soundex0.difference("01230120022455012623010202", "");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str16 = soundex0.soundex("H000");
        char[] charArray22 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray22);
        int int25 = soundex24.getMaxLength();
        java.lang.String str27 = soundex24.encode("01230120022455012623010202");
        java.lang.String str29 = soundex24.soundex("");
        int int30 = soundex24.getMaxLength();
        int int31 = soundex24.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) soundex24);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        int int18 = soundex0.difference("", "H000");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int22 = soundex19.difference("H000", "");
        java.lang.String str24 = soundex19.encode("");
        java.lang.String str26 = soundex19.soundex("");
        java.lang.String str28 = soundex19.soundex("hi!");
        int int29 = soundex19.getMaxLength();
        int int30 = soundex19.getMaxLength();
        java.lang.String str32 = soundex19.encode("H000");
        java.lang.String str34 = soundex19.soundex("hi!");
        int int37 = soundex19.difference("hi!", "01230120022455012623010202");
        soundex19.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass40 = soundex19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = soundex0.encode((java.lang.Object) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.difference("", "H000");
        java.lang.String str12 = soundex0.soundex("");
        int int15 = soundex0.difference("H000", "");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int6 = soundex5.getMaxLength();
        int int7 = soundex5.getMaxLength();
        java.lang.String str9 = soundex5.soundex("hi!");
        java.lang.Object obj10 = soundex0.encode((java.lang.Object) "hi!");
        int int11 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.soundex("hi!");
        soundex12.setMaxLength((int) '4');
        java.lang.String str20 = soundex12.soundex("H000");
        soundex12.setMaxLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex0.encode((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.soundex("H000");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        int int19 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str21 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str15 = soundex0.soundex("");
        java.lang.String str17 = soundex0.soundex("");
        soundex0.setMaxLength(97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        int int9 = soundex7.getMaxLength();
        soundex7.setMaxLength(10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        int int24 = soundex6.difference("", "");
        int int25 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) (byte) 10);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str30 = soundex28.encode("hi!");
        java.lang.String str32 = soundex28.soundex("01230120022455012623010202");
        java.lang.String str34 = soundex28.soundex("");
        java.lang.String str36 = soundex28.encode("");
        java.lang.String str38 = soundex28.encode("");
        java.lang.Object obj39 = soundex6.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        int int8 = soundex5.getMaxLength();
        soundex5.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex5.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        int int15 = soundex0.difference("", "");
        int int18 = soundex0.difference("hi!", "01230120022455012623010202");
        int int21 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        java.lang.String str18 = soundex0.encode("");
        char[] charArray23 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) soundex29);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        soundex1.setMaxLength((int) (short) 10);
        int int10 = soundex1.getMaxLength();
        int int13 = soundex1.difference("H000", "hi!");
        java.lang.Class<?> wildcardClass14 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "hi!");
        java.lang.String str6 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
// flaky "3) test2054(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.soundex("");
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("", "H000");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str8 = soundex6.soundex("");
        java.lang.String str10 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        int int14 = soundex1.getMaxLength();
        int int17 = soundex1.difference("H000", "hi!");
        java.lang.String str19 = soundex1.encode("H000");
        java.lang.String str21 = soundex1.encode("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength(0);
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int20 = soundex17.difference("01230120022455012623010202", "01230120022455012623010202");
        int int23 = soundex17.difference("", "hi!");
        soundex17.setMaxLength((int) (short) 10);
        int int28 = soundex17.difference("hi!", "01230120022455012623010202");
        soundex17.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex0.encode((java.lang.Object) soundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        int int11 = soundex7.getMaxLength();
        int int12 = soundex7.getMaxLength();
        int int13 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex7.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.String str10 = soundex6.soundex("H000");
        java.lang.String str12 = soundex6.encode("H000");
        soundex6.setMaxLength((-1));
        java.lang.String str16 = soundex6.soundex("01230120022455012623010202");
        int int19 = soundex6.difference("hi!", "01230120022455012623010202");
        int int22 = soundex6.difference("H000", "H000");
        soundex6.setMaxLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) -1);
        int int18 = soundex0.difference("hi!", "hi!");
        java.lang.String str20 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength(1);
        soundex6.setMaxLength((int) (short) 1);
        int int13 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        java.lang.String str7 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        java.lang.String str15 = soundex8.soundex("");
        java.lang.String str17 = soundex8.soundex("hi!");
        int int18 = soundex8.getMaxLength();
        java.lang.String str20 = soundex8.encode("01230120022455012623010202");
        java.lang.String str22 = soundex8.soundex("H000");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.Class<?> wildcardClass26 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H000" + "'", obj23, "H000");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass18 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass8 = soundex7.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        soundex0.setMaxLength((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        java.lang.String str8 = soundex1.soundex("hi!");
        soundex1.setMaxLength((int) '4');
        java.lang.String str12 = soundex1.encode("hi!");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex1.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (short) 100);
        int int16 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str18 = soundex0.encode("H000");
        java.lang.String str20 = soundex0.soundex("H000");
        java.lang.String str22 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex17.difference("H000", "");
        java.lang.String str22 = soundex17.encode("");
        int int23 = soundex17.getMaxLength();
        soundex17.setMaxLength((-1));
        int int28 = soundex17.difference("", "");
        java.lang.String str30 = soundex17.soundex("01230120022455012623010202");
        java.lang.String str32 = soundex17.soundex("01230120022455012623010202");
        int int35 = soundex17.difference("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) int35);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int8 = soundex5.difference("", "");
        int int9 = soundex5.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        java.lang.String str11 = soundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex5.difference("H000", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = soundex4.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int13 = soundex12.getMaxLength();
        int int16 = soundex12.difference("", "");
        soundex12.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex19.getMaxLength();
        int int21 = soundex19.getMaxLength();
        java.lang.String str23 = soundex19.encode("");
        int int26 = soundex19.difference("H000", "");
        java.lang.String str28 = soundex19.encode("01230120022455012623010202");
        int int31 = soundex19.difference("H000", "");
        soundex19.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex12.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        int int10 = soundex1.difference("hi!", "H000");
        int int13 = soundex1.difference("H000", "H000");
        soundex1.setMaxLength(32);
        java.lang.Class<?> wildcardClass16 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(1);
        soundex0.setMaxLength((int) (byte) 0);
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = soundex7.difference("H000", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        int int13 = soundex0.difference("H000", "hi!");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray1);
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        java.lang.Class<?> wildcardClass9 = soundex6.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int19 = soundex16.difference("01230120022455012623010202", "01230120022455012623010202");
        int int22 = soundex16.difference("", "hi!");
        soundex16.setMaxLength((int) (short) 10);
        int int27 = soundex16.difference("hi!", "01230120022455012623010202");
        soundex16.setMaxLength((int) '4');
        int int30 = soundex16.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex0.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int14 = soundex0.difference("", "hi!");
        java.lang.String str16 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "");
        soundex0.setMaxLength(4);
        int int16 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int10 = soundex0.difference("H000", "");
        java.lang.String str12 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("");
        int int10 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '#');
        java.lang.String str14 = soundex1.soundex("H000");
        char[] charArray19 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        soundex22.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex1.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) ' ');
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        java.lang.String str24 = soundex20.encode("");
        int int27 = soundex20.difference("H000", "");
        java.lang.String str29 = soundex20.encode("01230120022455012623010202");
        java.lang.String str31 = soundex20.soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) soundex20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.lang.String str20 = soundex0.encode("01230120022455012623010202");
        int int21 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) '4');
        java.lang.String str25 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(97);
        java.lang.String str7 = soundex0.encode("");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.soundex("hi!");
        int int13 = soundex0.difference("H000", "H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        int int7 = soundex0.difference("hi!", "hi!");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str11 = soundex0.soundex("");
        java.lang.String str13 = soundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        int int19 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str10 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str17 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        int int20 = soundex18.getMaxLength();
        java.lang.String str22 = soundex18.encode("");
        java.lang.String str24 = soundex18.encode("hi!");
        java.lang.Object obj25 = soundex0.encode((java.lang.Object) str24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H000" + "'", obj25, "H000");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) '#');
        soundex0.setMaxLength((int) '4');
        java.lang.String str16 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) '#');
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex();
        int int4 = soundex3.getMaxLength();
        int int5 = soundex3.getMaxLength();
        java.lang.String str7 = soundex3.encode("");
        int int10 = soundex3.difference("H000", "");
        java.lang.String str12 = soundex3.encode("01230120022455012623010202");
        java.lang.Object obj13 = soundex0.encode((java.lang.Object) str12);
        int int16 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("hi!");
        java.lang.String str20 = soundex0.encode("hi!");
        int int23 = soundex0.difference("", "hi!");
        soundex0.setMaxLength((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        int int12 = soundex0.difference("", "");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("");
        int int17 = soundex0.getMaxLength();
        int int20 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex12.difference("H000", "");
        java.lang.String str17 = soundex12.encode("");
        java.lang.String str19 = soundex12.soundex("");
        java.lang.String str21 = soundex12.soundex("hi!");
        int int22 = soundex12.getMaxLength();
        int int23 = soundex12.getMaxLength();
        java.lang.String str25 = soundex12.encode("H000");
        java.lang.String str27 = soundex12.soundex("hi!");
        int int30 = soundex12.difference("hi!", "01230120022455012623010202");
        soundex12.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass33 = soundex12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(0);
        int int12 = soundex4.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int14 = soundex13.getMaxLength();
        int int15 = soundex13.getMaxLength();
        java.lang.String str17 = soundex13.soundex("H000");
        java.lang.String str19 = soundex13.encode("H000");
        soundex13.setMaxLength((-1));
        int int24 = soundex13.difference("", "");
        java.lang.String str26 = soundex13.encode("01230120022455012623010202");
        java.lang.String str28 = soundex13.soundex("01230120022455012623010202");
        java.lang.Object obj29 = soundex4.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray10 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str14 = soundex12.soundex("");
        java.lang.Object obj15 = soundex7.encode((java.lang.Object) "");
        java.lang.String str17 = soundex7.encode("");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        int int20 = soundex18.getMaxLength();
        java.lang.String str22 = soundex18.soundex("H000");
        java.lang.String str24 = soundex18.encode("H000");
        soundex18.setMaxLength((-1));
        int int29 = soundex18.difference("", "");
        java.lang.String str31 = soundex18.encode("");
        java.lang.Class<?> wildcardClass32 = soundex18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex7.encode((java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        java.lang.String str9 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.encode("01230120022455012623010202");
        soundex1.setMaxLength(10);
        java.lang.String str15 = soundex1.soundex("01230120022455012623010202");
        int int18 = soundex1.difference("H000", "01230120022455012623010202");
        int int19 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex20.difference("H000", "");
        int int24 = soundex20.getMaxLength();
        java.lang.String str26 = soundex20.soundex("hi!");
        soundex20.setMaxLength((int) (short) -1);
        int int29 = soundex20.getMaxLength();
        java.lang.String str31 = soundex20.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex1.encode((java.lang.Object) soundex20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.soundex("");
        soundex0.setMaxLength(35);
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.soundex("H000");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        soundex0.setMaxLength(97);
        soundex0.setMaxLength(100);
        soundex0.setMaxLength((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        java.lang.String str10 = soundex0.soundex("H000");
        java.lang.String str12 = soundex0.encode("H000");
        int int15 = soundex0.difference("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        java.lang.String str24 = soundex0.encode("H000");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        soundex8.setMaxLength(10);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        java.lang.String str20 = soundex15.encode("");
        java.lang.String str22 = soundex15.soundex("");
        java.lang.String str24 = soundex15.soundex("hi!");
        int int25 = soundex15.getMaxLength();
        int int26 = soundex15.getMaxLength();
        java.lang.String str28 = soundex15.encode("H000");
        int int29 = soundex15.getMaxLength();
        java.lang.String str31 = soundex15.encode("H000");
        java.lang.String str33 = soundex15.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex8.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int2 = soundex1.getMaxLength();
        int int5 = soundex1.difference("hi!", "01230120022455012623010202");
        int int6 = soundex1.getMaxLength();
        int int7 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex0.encode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        int int12 = soundex0.difference("", "hi!");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        int int20 = soundex0.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        java.lang.String str7 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        java.lang.String str12 = soundex8.encode("");
        soundex8.setMaxLength(35);
        int int17 = soundex8.difference("", "H000");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "");
        java.lang.String str20 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        int int15 = soundex0.difference("", "");
        int int18 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength((int) 'a');
        int int23 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex10.setMaxLength(10);
        java.lang.String str14 = soundex10.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = soundex10.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        java.lang.String str8 = soundex1.soundex("hi!");
        java.lang.String str10 = soundex1.encode("hi!");
        int int11 = soundex1.getMaxLength();
        java.lang.String str13 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex6.setMaxLength(0);
        java.lang.String str10 = soundex6.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex14.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int13 = soundex12.getMaxLength();
        soundex12.setMaxLength(100);
        java.lang.Class<?> wildcardClass16 = soundex12.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("H000", "hi!");
        java.lang.String str13 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("", "H000");
        java.lang.String str11 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        java.lang.String str5 = soundex1.encode("");
        java.lang.String str7 = soundex1.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        java.lang.String str12 = soundex8.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int14 = soundex13.getMaxLength();
        int int15 = soundex13.getMaxLength();
        java.lang.String str17 = soundex13.soundex("hi!");
        java.lang.Object obj18 = soundex8.encode((java.lang.Object) "hi!");
        java.lang.String str20 = soundex8.encode("hi!");
        java.lang.Class<?> wildcardClass21 = soundex8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex1.encode((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("H000");
        int int13 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str17 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        soundex1.setMaxLength(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        java.lang.String str8 = soundex1.soundex("hi!");
        java.lang.String str10 = soundex1.encode("hi!");
        java.lang.String str12 = soundex1.encode("H000");
        soundex1.setMaxLength((int) (short) 0);
        java.lang.String str16 = soundex1.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str19 = soundex17.encode("hi!");
        java.lang.String str21 = soundex17.soundex("hi!");
        int int22 = soundex17.getMaxLength();
        int int25 = soundex17.difference("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex1.encode((java.lang.Object) soundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str16 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex17.getMaxLength();
        int int19 = soundex17.getMaxLength();
        java.lang.String str21 = soundex17.soundex("H000");
        java.lang.String str23 = soundex17.encode("H000");
        soundex17.setMaxLength((-1));
        int int26 = soundex17.getMaxLength();
        java.lang.String str28 = soundex17.encode("H000");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) "H000");
        int int32 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("H000", "01230120022455012623010202");
        char[] charArray17 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        soundex18.setMaxLength(10);
        soundex18.setMaxLength((int) '#');
        java.lang.String str24 = soundex18.encode("");
        java.lang.Class<?> wildcardClass25 = soundex18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int17 = soundex0.difference("H000", "hi!");
        java.lang.String str19 = soundex0.encode("");
        int int22 = soundex0.difference("hi!", "hi!");
        int int23 = soundex0.getMaxLength();
        int int24 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        int int10 = soundex5.getMaxLength();
        int int11 = soundex5.getMaxLength();
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int11 = soundex0.difference("", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex7.setMaxLength((int) 'a');
        char[] charArray15 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        soundex16.setMaxLength(10);
        soundex16.setMaxLength((int) '#');
        java.lang.Class<?> wildcardClass21 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex7.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "H000");
        java.lang.String str15 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        int int20 = soundex0.getMaxLength();
        java.lang.String str22 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str26 = soundex24.encode("01230120022455012623010202");
        java.lang.String str28 = soundex24.soundex("hi!");
        java.lang.String str30 = soundex24.soundex("");
        java.lang.String str32 = soundex24.encode("H000");
        java.lang.Object obj33 = soundex0.encode((java.lang.Object) "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H000" + "'", obj33, "H000");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str16 = soundex0.encode("");
        int int19 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        int int21 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass22 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        int int12 = soundex0.difference("H000", "");
        int int15 = soundex0.difference("H000", "H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str18 = soundex16.encode("hi!");
        java.lang.String str20 = soundex16.soundex("01230120022455012623010202");
        java.lang.String str22 = soundex16.soundex("");
        java.lang.String str24 = soundex16.encode("");
        java.lang.String str26 = soundex16.encode("");
        int int29 = soundex16.difference("hi!", "");
        java.lang.String str31 = soundex16.soundex("H000");
        int int34 = soundex16.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex0.encode((java.lang.Object) int34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.lang.Class<?> wildcardClass32 = soundex3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex10.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength(1);
        soundex4.setMaxLength(100);
        int int10 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex4.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        soundex0.setMaxLength(52);
        java.lang.String str21 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        java.lang.String str18 = soundex0.encode("");
        int int21 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("");
        char[] charArray13 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        soundex14.setMaxLength(10);
        soundex14.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex0.encode((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int11 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex16.getMaxLength();
        int int18 = soundex16.getMaxLength();
        soundex16.setMaxLength((int) (byte) -1);
        int int23 = soundex16.difference("", "01230120022455012623010202");
        java.lang.String str25 = soundex16.soundex("01230120022455012623010202");
        java.lang.String str27 = soundex16.soundex("H000");
        int int28 = soundex16.getMaxLength();
        int int29 = soundex16.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) int29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        int int9 = soundex5.getMaxLength();
        java.lang.String str11 = soundex5.encode("01230120022455012623010202");
        java.lang.String str13 = soundex5.encode("H000");
        java.lang.Object obj14 = soundex0.encode((java.lang.Object) "H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.soundex("H000");
        java.lang.String str21 = soundex15.encode("H000");
        soundex15.setMaxLength((-1));
        java.lang.String str25 = soundex15.soundex("01230120022455012623010202");
        int int28 = soundex15.difference("hi!", "01230120022455012623010202");
        int int29 = soundex15.getMaxLength();
        soundex15.setMaxLength((int) (short) 10);
        java.lang.String str33 = soundex15.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H000" + "'", obj14, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.soundex("H000");
        int int12 = soundex0.difference("H000", "");
        soundex0.setMaxLength(100);
        java.lang.String str16 = soundex0.encode("");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(32);
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        java.lang.String str5 = soundex0.encode("hi!");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        java.lang.String str9 = soundex0.encode("H000");
        char[] charArray16 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray16);
        int int21 = soundex20.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode((java.lang.Object) soundex20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
// flaky "4) test2159(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', '4', 'a', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (byte) 0);
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        soundex0.setMaxLength(4);
        int int17 = soundex0.difference("01230120022455012623010202", "hi!");
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        int int21 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("H000");
        int int17 = soundex0.difference("01230120022455012623010202", "");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        soundex18.setMaxLength((int) 'a');
        java.lang.String str23 = soundex18.encode("H000");
        java.lang.String str25 = soundex18.soundex("H000");
        java.lang.Object obj26 = soundex0.encode((java.lang.Object) str25);
        soundex0.setMaxLength(10);
        java.lang.String str30 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        java.lang.String str22 = soundex20.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int10 = soundex0.difference("H000", "");
        int int13 = soundex0.difference("hi!", "H000");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("01230120022455012623010202");
        int int9 = soundex0.difference("", "hi!");
        soundex0.setMaxLength((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.difference("", "");
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        char[] charArray18 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray18);
        int int25 = soundex22.difference("01230120022455012623010202", "");
        java.lang.String str27 = soundex22.soundex("");
        soundex22.setMaxLength((int) '4');
        soundex22.setMaxLength(1);
        int int32 = soundex22.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex0.encode((java.lang.Object) soundex22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        int int10 = soundex1.difference("hi!", "H000");
        soundex1.setMaxLength((int) (byte) -1);
        java.lang.String str14 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("H000");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.String str3 = soundex1.encode("");
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex();
        int int5 = soundex4.getMaxLength();
        int int6 = soundex4.getMaxLength();
        java.lang.String str8 = soundex4.encode("hi!");
        java.lang.String str10 = soundex4.encode("H000");
        java.lang.String str12 = soundex4.soundex("hi!");
        java.lang.String str14 = soundex4.soundex("01230120022455012623010202");
        int int17 = soundex4.difference("hi!", "01230120022455012623010202");
        int int20 = soundex4.difference("", "01230120022455012623010202");
        int int23 = soundex4.difference("hi!", "");
        java.lang.Object obj24 = soundex1.encode((java.lang.Object) "");
        java.lang.String str26 = soundex1.encode("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.difference("", "hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        int int18 = soundex15.difference("H000", "");
        java.lang.String str20 = soundex15.encode("");
        int int21 = soundex15.getMaxLength();
        soundex15.setMaxLength((-1));
        int int26 = soundex15.difference("", "");
        int int27 = soundex15.getMaxLength();
        int int30 = soundex15.difference("H000", "hi!");
        java.lang.String str32 = soundex15.soundex("01230120022455012623010202");
        soundex15.setMaxLength((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex4.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        java.lang.String str21 = soundex19.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        java.lang.Class<?> wildcardClass30 = soundex3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.encode("H000");
        soundex0.setMaxLength(0);
        java.lang.String str20 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((-1));
        java.lang.String str15 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex16.getMaxLength();
        int int18 = soundex16.getMaxLength();
        soundex16.setMaxLength((int) (byte) -1);
        int int23 = soundex16.difference("", "01230120022455012623010202");
        int int26 = soundex16.difference("hi!", "hi!");
        soundex16.setMaxLength(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray1);
        soundex9.setMaxLength(52);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str17 = soundex0.encode("");
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        int int24 = soundex0.difference("hi!", "H000");
        java.lang.String str26 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.encode("01230120022455012623010202");
        soundex1.setMaxLength(10);
        java.lang.String str15 = soundex1.soundex("01230120022455012623010202");
        int int18 = soundex1.difference("H000", "01230120022455012623010202");
        int int21 = soundex1.difference("", "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int19 = soundex0.getMaxLength();
        int int22 = soundex0.difference("", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength(0);
        int int16 = soundex0.getMaxLength();
        int int19 = soundex0.difference("", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int13 = soundex10.difference("01230120022455012623010202", "01230120022455012623010202");
        int int16 = soundex10.difference("", "hi!");
        soundex10.setMaxLength((int) (short) 10);
        int int21 = soundex10.difference("hi!", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex6.encode((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("hi!");
        java.lang.String str15 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        int int4 = soundex1.getMaxLength();
        int int7 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
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
        java.lang.String str36 = soundex14.encode("01230120022455012623010202");
        soundex14.setMaxLength((-1));
        java.lang.Class<?> wildcardClass39 = soundex14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = soundex12.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        int int12 = soundex0.difference("", "");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("");
        java.lang.String str18 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int23 = soundex20.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str25 = soundex20.encode("01230120022455012623010202");
        java.lang.String str27 = soundex20.encode("H000");
        int int30 = soundex20.difference("", "H000");
        int int33 = soundex20.difference("01230120022455012623010202", "H000");
        int int36 = soundex20.difference("", "H000");
        soundex20.setMaxLength((int) (short) 0);
        soundex20.setMaxLength((int) (byte) 100);
        int int41 = soundex20.getMaxLength();
        int int42 = soundex20.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = soundex0.encode((java.lang.Object) int42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str17 = soundex0.soundex("H000");
        char[] charArray19 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) soundex26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int11 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str13 = soundex0.encode("hi!");
        int int16 = soundex0.difference("H000", "");
        soundex0.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str21 = soundex19.encode("hi!");
        int int22 = soundex19.getMaxLength();
        soundex19.setMaxLength((int) ' ');
        int int25 = soundex19.getMaxLength();
        java.lang.String str27 = soundex19.soundex("hi!");
        int int30 = soundex19.difference("", "01230120022455012623010202");
        int int31 = soundex19.getMaxLength();
        soundex19.setMaxLength(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        java.lang.Object obj14 = soundex6.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        soundex15.setMaxLength((int) (byte) -1);
        soundex15.setMaxLength((int) (short) 10);
        int int24 = soundex15.difference("", "hi!");
        java.lang.Object obj25 = soundex6.encode((java.lang.Object) "");
        int int26 = soundex6.getMaxLength();
        int int27 = soundex6.getMaxLength();
        java.lang.Class<?> wildcardClass28 = soundex6.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        int int18 = soundex13.difference("hi!", "01230120022455012623010202");
        int int21 = soundex13.difference("H000", "hi!");
        java.lang.String str23 = soundex13.soundex("H000");
        soundex13.setMaxLength(0);
        int int28 = soundex13.difference("", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex12.encode((java.lang.Object) "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.soundex("H000");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        int int17 = soundex13.getMaxLength();
        java.lang.String str19 = soundex13.soundex("hi!");
        java.lang.String str21 = soundex13.encode("hi!");
        int int24 = soundex13.difference("01230120022455012623010202", "hi!");
        java.lang.String str26 = soundex13.soundex("");
        int int29 = soundex13.difference("", "01230120022455012623010202");
        int int32 = soundex13.difference("H000", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex0.encode((java.lang.Object) soundex13);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        java.lang.String str7 = soundex1.soundex("H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        java.lang.String str22 = soundex0.encode("01230120022455012623010202");
        java.lang.String str24 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("", "hi!");
        int int12 = soundex0.difference("hi!", "");
        soundex0.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("hi!");
        int int18 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int2 = soundex1.getMaxLength();
        soundex1.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        int int14 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str16 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        int int16 = soundex0.difference("hi!", "hi!");
        int int17 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        int int9 = soundex5.difference("", "01230120022455012623010202");
        java.lang.String str11 = soundex5.encode("");
        int int12 = soundex5.getMaxLength();
        int int13 = soundex5.getMaxLength();
        int int14 = soundex5.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        int int20 = soundex15.difference("hi!", "01230120022455012623010202");
        int int23 = soundex15.difference("H000", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex5.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        soundex9.setMaxLength((int) 'a');
        java.lang.String str14 = soundex9.encode("H000");
        int int17 = soundex9.difference("H000", "H000");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str20 = soundex0.soundex("");
        java.lang.String str22 = soundex0.soundex("01230120022455012623010202");
        int int23 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        soundex0.setMaxLength(52);
        java.lang.String str15 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) 'a');
        java.lang.String str10 = soundex6.encode("");
        java.lang.String str12 = soundex6.encode("");
        int int13 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex6.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((-1));
        java.lang.String str12 = soundex0.soundex("");
        int int15 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("", "H000");
        int int12 = soundex0.difference("hi!", "hi!");
        java.lang.String str14 = soundex0.encode("");
        java.lang.String str16 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex10.difference("H000", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("", "H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.encode("hi!");
        java.lang.String str21 = soundex15.encode("H000");
        java.lang.String str23 = soundex15.encode("");
        int int26 = soundex15.difference("01230120022455012623010202", "hi!");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int30 = soundex0.difference("", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        int int13 = soundex0.getMaxLength();
        int int14 = soundex0.getMaxLength();
        int int17 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str19 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str11 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex17.difference("H000", "");
        java.lang.Object obj21 = soundex12.encode((java.lang.Object) "H000");
        java.lang.String str23 = soundex12.soundex("");
        int int26 = soundex12.difference("", "H000");
        java.lang.String str28 = soundex12.encode("hi!");
        int int31 = soundex12.difference("hi!", "hi!");
        java.lang.Object obj32 = soundex0.encode((java.lang.Object) "hi!");
        int int33 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H000" + "'", obj32, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 100);
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str14 = soundex12.encode("hi!");
        java.lang.String str16 = soundex12.encode("");
        java.lang.String str18 = soundex12.encode("H000");
        int int21 = soundex12.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str23 = soundex12.encode("H000");
        int int26 = soundex12.difference("hi!", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        java.lang.String str14 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("hi!");
        int int16 = soundex0.getMaxLength();
        int int19 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        int int8 = soundex0.difference("H000", "H000");
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
// flaky "5) test2219(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str6 = soundex0.encode("");
        int int9 = soundex0.difference("H000", "");
        soundex0.setMaxLength(10);
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        int int14 = soundex0.difference("hi!", "hi!");
        java.lang.String str16 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("H000");
        java.lang.String str13 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex14.getMaxLength();
        int int16 = soundex14.getMaxLength();
        java.lang.String str18 = soundex14.encode("hi!");
        java.lang.String str20 = soundex14.soundex("");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) "");
        java.lang.String str23 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str19 = soundex0.soundex("");
        int int20 = soundex0.getMaxLength();
        int int23 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int12 = soundex9.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str14 = soundex9.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.encode("hi!");
        java.lang.String str21 = soundex15.encode("H000");
        java.lang.String str23 = soundex15.encode("");
        int int26 = soundex15.difference("01230120022455012623010202", "hi!");
        java.lang.String str28 = soundex15.soundex("H000");
        java.lang.Object obj29 = soundex9.encode((java.lang.Object) "H000");
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = soundex0.encode(obj29);
        java.lang.String str33 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str37 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H000" + "'", obj31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str12 = soundex10.soundex("");
        int int13 = soundex10.getMaxLength();
        int int16 = soundex10.difference("", "01230120022455012623010202");
        java.lang.String str18 = soundex10.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex19.getMaxLength();
        soundex19.setMaxLength((int) 'a');
        java.lang.String str24 = soundex19.encode("H000");
        java.lang.String str26 = soundex19.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        int int30 = soundex27.difference("H000", "");
        java.lang.String str32 = soundex27.encode("");
        java.lang.String str34 = soundex27.soundex("");
        java.lang.String str36 = soundex27.soundex("hi!");
        int int37 = soundex27.getMaxLength();
        java.lang.String str39 = soundex27.encode("01230120022455012623010202");
        java.lang.String str41 = soundex27.soundex("H000");
        java.lang.Object obj42 = soundex19.encode((java.lang.Object) "H000");
        int int43 = soundex19.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = soundex10.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "H000" + "'", obj42, "H000");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str12 = soundex10.encode("hi!");
        java.lang.String str14 = soundex10.soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex9.encode((java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        int int16 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(100);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        java.lang.String str13 = soundex9.encode("");
        java.lang.String str15 = soundex9.encode("H000");
        java.lang.String str17 = soundex9.soundex("01230120022455012623010202");
        int int20 = soundex9.difference("H000", "");
        int int21 = soundex9.getMaxLength();
        int int24 = soundex9.difference("H000", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex6.encode((java.lang.Object) "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str21 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str13 = soundex0.soundex("H000");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.soundex("hi!");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.soundex("H000");
        int int12 = soundex0.difference("H000", "");
        soundex0.setMaxLength(100);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.encode("");
        int int20 = soundex15.getMaxLength();
        java.lang.String str22 = soundex15.encode("");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) str22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("H000");
        soundex0.setMaxLength(1);
        java.lang.String str18 = soundex0.encode("");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        int int13 = soundex0.difference("", "H000");
        java.lang.String str15 = soundex0.soundex("");
        int int18 = soundex0.difference("", "hi!");
        org.apache.commons.codec.language.Soundex soundex19 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int20 = soundex19.getMaxLength();
        soundex19.setMaxLength(100);
        java.lang.String str24 = soundex19.encode("hi!");
        java.lang.String str26 = soundex19.soundex("");
        java.lang.String str28 = soundex19.soundex("");
        soundex19.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(soundex19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex0.difference("", "H000");
        soundex0.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        java.lang.String str20 = soundex15.encode("");
        int int21 = soundex15.getMaxLength();
        java.lang.String str23 = soundex15.soundex("hi!");
        int int26 = soundex15.difference("01230120022455012623010202", "");
        soundex15.setMaxLength(32);
        java.lang.Class<?> wildcardClass29 = soundex15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        java.lang.String str21 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        int int15 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str18 = soundex16.encode("hi!");
        java.lang.String str20 = soundex16.encode("");
        java.lang.String str22 = soundex16.encode("H000");
        java.lang.String str24 = soundex16.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex16.soundex("H000");
        int int27 = soundex16.getMaxLength();
        int int28 = soundex16.getMaxLength();
        int int31 = soundex16.difference("01230120022455012623010202", "hi!");
        java.lang.Object obj32 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str34 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.difference("", "H000");
        soundex0.setMaxLength(32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.soundex("hi!");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex0.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        int int10 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex18.difference("H000", "");
        java.lang.String str23 = soundex18.encode("");
        java.lang.String str25 = soundex18.soundex("");
        java.lang.String str27 = soundex18.soundex("hi!");
        int int28 = soundex18.getMaxLength();
        soundex18.setMaxLength(52);
        int int33 = soundex18.difference("", "");
        java.lang.String str35 = soundex18.encode("H000");
        int int36 = soundex18.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex0.encode((java.lang.Object) int36);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex0.difference("", "H000");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("");
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("hi!");
        int int15 = soundex0.getMaxLength();
        soundex0.setMaxLength(1);
        int int18 = soundex0.getMaxLength();
        soundex0.setMaxLength(32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength((int) 'a');
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("01230120022455012623010202", "");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex8.setMaxLength(100);
        java.lang.String str12 = soundex8.soundex("");
        soundex8.setMaxLength((int) (short) 1);
        java.lang.String str16 = soundex8.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex8.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        char[] charArray18 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray18);
        java.lang.String str23 = soundex21.encode("");
        java.lang.String str25 = soundex21.soundex("");
        char[] charArray31 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray31);
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray31);
        int int34 = soundex33.getMaxLength();
        java.lang.String str36 = soundex33.encode("01230120022455012623010202");
        java.lang.String str38 = soundex33.soundex("01230120022455012623010202");
        java.lang.String str40 = soundex33.soundex("01230120022455012623010202");
        java.lang.Object obj41 = soundex21.encode((java.lang.Object) str40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = soundex0.encode((java.lang.Object) soundex21);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) 'a');
        int int21 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str12 = soundex10.soundex("");
        int int13 = soundex10.getMaxLength();
        int int16 = soundex10.difference("", "01230120022455012623010202");
        java.lang.String str18 = soundex10.encode("01230120022455012623010202");
        soundex10.setMaxLength((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = soundex10.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        java.lang.String str9 = soundex1.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        int int14 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        int int17 = soundex0.getMaxLength();
        char[] charArray24 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray24);
        int int26 = soundex25.getMaxLength();
        java.lang.String str28 = soundex25.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) soundex25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', '4', 'a', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength(0);
        java.lang.String str15 = soundex0.soundex("H000");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex0.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        int int12 = soundex0.difference("H000", "");
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        org.apache.commons.codec.language.Soundex soundex29 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int30 = soundex29.getMaxLength();
        int int31 = soundex29.getMaxLength();
        int int32 = soundex29.getMaxLength();
        java.lang.String str34 = soundex29.encode("H000");
        int int35 = soundex29.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex36 = new org.apache.commons.codec.language.Soundex();
        int int37 = soundex36.getMaxLength();
        soundex36.setMaxLength((int) 'a');
        java.lang.String str41 = soundex36.encode("H000");
        soundex36.setMaxLength((int) '#');
        java.lang.String str45 = soundex36.encode("");
        int int48 = soundex36.difference("H000", "01230120022455012623010202");
        int int51 = soundex36.difference("hi!", "");
        java.lang.Object obj52 = soundex29.encode((java.lang.Object) "");
        int int55 = soundex29.difference("hi!", "hi!");
        java.lang.String str57 = soundex29.encode("H000");
        java.lang.String str59 = soundex29.soundex("H000");
        java.lang.Object obj60 = soundex1.encode((java.lang.Object) str59);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(soundex29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "" + "'", obj52, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "H000" + "'", str57, "H000");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "H000" + "'", str59, "H000");
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + "H000" + "'", obj60, "H000");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        int int27 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = soundex3.soundex("hi!");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex6.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        java.lang.String str14 = soundex9.soundex("");
        soundex9.setMaxLength((int) '4');
        soundex9.setMaxLength(35);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        soundex9.setMaxLength((int) 'a');
        java.lang.String str14 = soundex9.encode("H000");
        int int17 = soundex9.difference("H000", "H000");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "H000");
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.soundex("H000");
        java.lang.String str13 = soundex0.encode("H000");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        java.lang.String str28 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex();
        int int30 = soundex29.getMaxLength();
        int int31 = soundex29.getMaxLength();
        java.lang.String str33 = soundex29.encode("hi!");
        java.lang.String str35 = soundex29.encode("H000");
        java.lang.String str37 = soundex29.soundex("hi!");
        java.lang.String str39 = soundex29.soundex("01230120022455012623010202");
        int int42 = soundex29.difference("hi!", "01230120022455012623010202");
        int int45 = soundex29.difference("", "01230120022455012623010202");
        int int48 = soundex29.difference("hi!", "");
        java.lang.Object obj49 = soundex0.encode((java.lang.Object) "hi!");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "H000" + "'", obj49, "H000");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass7 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.encode("H000");
        char[] charArray17 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) soundex24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', '4' });
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        soundex0.setMaxLength(10);
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        int int11 = soundex0.getMaxLength();
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("01230120022455012623010202");
        int int17 = soundex0.difference("H000", "hi!");
        int int20 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength(4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.soundex("H000");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        soundex0.setMaxLength(97);
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.encode("");
        int int19 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.String str16 = soundex0.soundex("");
        java.lang.String str18 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray1);
        java.lang.Class<?> wildcardClass10 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength((int) (byte) 10);
        soundex0.setMaxLength((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        soundex0.setMaxLength(35);
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 100);
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        int int18 = soundex1.getMaxLength();
        char[] charArray21 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray21);
        soundex22.setMaxLength((int) 'a');
        int int25 = soundex22.getMaxLength();
        java.lang.String str27 = soundex22.encode("01230120022455012623010202");
        java.lang.String str29 = soundex22.encode("01230120022455012623010202");
        java.lang.Object obj30 = soundex1.encode((java.lang.Object) str29);
        java.lang.String str32 = soundex1.encode("hi!");
        int int33 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        java.lang.String str28 = soundex0.encode("");
        java.lang.String str30 = soundex0.soundex("H000");
        org.junit.Assert.assertNotNull(soundex0);
// flaky "6) test2279(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky "1) test2279(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky "1) test2279(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
// flaky "1) test2279(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        java.lang.String str17 = soundex13.encode("");
        java.lang.String str19 = soundex13.encode("H000");
        java.lang.String str21 = soundex13.soundex("01230120022455012623010202");
        soundex13.setMaxLength(0);
        java.lang.String str25 = soundex13.soundex("");
        java.lang.String str27 = soundex13.encode("H000");
        java.lang.Object obj28 = soundex0.encode((java.lang.Object) "H000");
        java.lang.Class<?> wildcardClass29 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H000" + "'", obj28, "H000");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        int int18 = soundex0.difference("H000", "hi!");
        java.lang.String str20 = soundex0.encode("");
        int int21 = soundex0.getMaxLength();
        java.lang.String str23 = soundex0.encode("H000");
        java.lang.String str25 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex7.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("H000");
        int int18 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int21 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength(1);
        int int14 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        java.lang.String str18 = soundex0.encode("");
        java.lang.String str20 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str11 = soundex0.soundex("");
        int int12 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex6.difference("H000", "");
        java.lang.String str11 = soundex6.encode("");
        java.lang.String str13 = soundex6.soundex("");
        java.lang.String str15 = soundex6.soundex("hi!");
        int int16 = soundex6.getMaxLength();
        int int17 = soundex6.getMaxLength();
        java.lang.String str19 = soundex6.encode("H000");
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int24 = soundex21.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str26 = soundex21.encode("01230120022455012623010202");
        java.lang.String str28 = soundex21.encode("H000");
        java.lang.String str30 = soundex21.encode("01230120022455012623010202");
        java.lang.Object obj31 = soundex6.encode((java.lang.Object) str30);
        char[] charArray37 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex38 = new org.apache.commons.codec.language.Soundex(charArray37);
        soundex38.setMaxLength((int) '4');
        soundex38.setMaxLength(0);
        int int45 = soundex38.difference("", "01230120022455012623010202");
        java.lang.Object obj46 = soundex6.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = soundex0.encode((java.lang.Object) wildcardClass47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int5 = soundex1.getMaxLength();
        int int6 = soundex1.getMaxLength();
        int int7 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(4);
        soundex0.setMaxLength((int) ' ');
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        java.lang.String str31 = soundex0.encode("hi!");
        int int32 = soundex0.getMaxLength();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        java.lang.String str14 = soundex9.soundex("");
        soundex9.setMaxLength((int) '4');
        soundex9.setMaxLength(1);
        int int19 = soundex9.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex20 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str22 = soundex20.soundex("");
        soundex20.setMaxLength((int) (short) 1);
        soundex20.setMaxLength((int) 'a');
        int int27 = soundex20.getMaxLength();
        int int28 = soundex20.getMaxLength();
        java.lang.Class<?> wildcardClass29 = soundex20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex9.encode((java.lang.Object) soundex20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(soundex20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex17.getMaxLength();
        soundex17.setMaxLength((int) 'a');
        java.lang.String str22 = soundex17.encode("H000");
        int int23 = soundex17.getMaxLength();
        int int24 = soundex17.getMaxLength();
        soundex17.setMaxLength((int) (byte) 0);
        java.lang.String str28 = soundex17.soundex("hi!");
        java.lang.String str30 = soundex17.soundex("");
        java.lang.String str32 = soundex17.encode("H000");
        java.lang.String str34 = soundex17.soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex0.encode((java.lang.Object) soundex17);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        soundex0.setMaxLength((int) '#');
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength((int) 'a');
        int int7 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        soundex6.setMaxLength((int) (byte) 1);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int15 = soundex12.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str17 = soundex12.encode("01230120022455012623010202");
        java.lang.String str19 = soundex12.encode("H000");
        int int22 = soundex12.difference("", "H000");
        int int25 = soundex12.difference("01230120022455012623010202", "H000");
        int int28 = soundex12.difference("", "hi!");
        int int29 = soundex12.getMaxLength();
        char[] charArray32 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray32);
        soundex33.setMaxLength((int) 'a');
        int int36 = soundex33.getMaxLength();
        java.lang.String str38 = soundex33.encode("01230120022455012623010202");
        java.lang.String str40 = soundex33.encode("01230120022455012623010202");
        java.lang.Object obj41 = soundex12.encode((java.lang.Object) str40);
        java.lang.String str43 = soundex12.encode("hi!");
        soundex12.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = soundex6.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H000" + "'", str43, "H000");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex14.difference("H000", "");
        java.lang.String str19 = soundex14.encode("");
        java.lang.String str21 = soundex14.soundex("");
        java.lang.String str23 = soundex14.soundex("hi!");
        int int24 = soundex14.getMaxLength();
        int int25 = soundex14.getMaxLength();
        java.lang.String str27 = soundex14.soundex("H000");
        int int30 = soundex14.difference("", "01230120022455012623010202");
        soundex14.setMaxLength(97);
        java.lang.String str34 = soundex14.soundex("");
        java.lang.Class<?> wildcardClass35 = soundex14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        int int10 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int14 = soundex11.difference("H000", "");
        java.lang.String str16 = soundex11.encode("");
        java.lang.String str18 = soundex11.soundex("");
        java.lang.String str20 = soundex11.soundex("hi!");
        soundex11.setMaxLength((int) (short) 0);
        java.lang.String str24 = soundex11.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex11.soundex("hi!");
        java.lang.String str28 = soundex11.encode("H000");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) str28);
        soundex0.setMaxLength((int) (short) 100);
        java.lang.Object obj32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex0.encode(obj32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        soundex0.setMaxLength(52);
        java.lang.String str15 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex16 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str18 = soundex16.soundex("01230120022455012623010202");
        soundex16.setMaxLength(0);
        int int23 = soundex16.difference("hi!", "01230120022455012623010202");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(soundex16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        int int19 = soundex0.difference("", "hi!");
        int int20 = soundex0.getMaxLength();
        int int21 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.difference("", "H000");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str16 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex7.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex7.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.soundex("");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("01230120022455012623010202");
        int int21 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex();
        int int4 = soundex3.getMaxLength();
        int int5 = soundex3.getMaxLength();
        java.lang.String str7 = soundex3.encode("");
        int int10 = soundex3.difference("H000", "");
        java.lang.String str12 = soundex3.encode("01230120022455012623010202");
        java.lang.Object obj13 = soundex0.encode((java.lang.Object) str12);
        int int16 = soundex0.difference("", "01230120022455012623010202");
        soundex0.setMaxLength(97);
        int int21 = soundex0.difference("H000", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("H000");
        int int10 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        int int8 = soundex0.difference("H000", "hi!");
        int int9 = soundex0.getMaxLength();
        int int12 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        java.lang.String str14 = soundex8.soundex("");
        int int17 = soundex8.difference("", "");
        java.lang.String str19 = soundex8.encode("");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str22 = soundex20.encode("hi!");
        int int25 = soundex20.difference("hi!", "01230120022455012623010202");
        java.lang.String str27 = soundex20.encode("01230120022455012623010202");
        int int30 = soundex20.difference("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex8.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex9.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength((int) ' ');
        int int10 = soundex1.difference("", "01230120022455012623010202");
        java.lang.String str12 = soundex1.soundex("hi!");
        soundex1.setMaxLength((int) '4');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        java.lang.String str10 = soundex6.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass11 = soundex6.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        int int14 = soundex1.getMaxLength();
        int int17 = soundex1.difference("H000", "hi!");
        java.lang.String str19 = soundex1.encode("H000");
        java.lang.String str21 = soundex1.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(97);
        soundex0.setMaxLength((int) ' ');
        int int10 = soundex0.difference("", "H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        int int17 = soundex0.getMaxLength();
        int int20 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        soundex9.setMaxLength((int) 'a');
        java.lang.String str14 = soundex9.encode("H000");
        int int17 = soundex9.difference("H000", "H000");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str20 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex9.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex6 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str8 = soundex6.soundex("");
        java.lang.String str10 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj11 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("hi!", "H000");
        soundex0.setMaxLength(32);
        int int20 = soundex0.difference("H000", "hi!");
        int int21 = soundex0.getMaxLength();
        int int22 = soundex0.getMaxLength();
        int int23 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        int int9 = soundex0.difference("hi!", "");
        soundex0.setMaxLength((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("H000");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("hi!", "");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str7 = soundex0.soundex("");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        int int20 = soundex0.getMaxLength();
        int int21 = soundex0.getMaxLength();
        java.lang.String str23 = soundex0.encode("");
        soundex0.setMaxLength(35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        int int9 = soundex5.getMaxLength();
        java.lang.String str11 = soundex5.encode("01230120022455012623010202");
        java.lang.String str13 = soundex5.encode("H000");
        java.lang.Object obj14 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str20 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H000" + "'", obj14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass7 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.Class<?> wildcardClass12 = charArray0.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str14 = soundex0.encode("H000");
        int int15 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.String str17 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str21 = soundex19.encode("");
        java.lang.String str23 = soundex19.soundex("H000");
        soundex19.setMaxLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) soundex19);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.soundex("hi!");
        java.lang.String str18 = soundex12.soundex("H000");
        java.lang.String str20 = soundex12.soundex("hi!");
        java.lang.String str22 = soundex12.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex0.encode((java.lang.Object) soundex12);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.soundex("");
        int int14 = soundex0.getMaxLength();
        int int17 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.String str8 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        java.lang.String str13 = soundex9.encode("");
        int int16 = soundex9.difference("", "H000");
        java.lang.String str18 = soundex9.soundex("01230120022455012623010202");
        java.lang.Object obj19 = soundex0.encode((java.lang.Object) str18);
        int int22 = soundex0.difference("", "");
        java.lang.String str24 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str18 = soundex0.encode("");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str12 = soundex10.encode("01230120022455012623010202");
        java.lang.String str14 = soundex10.encode("");
        soundex10.setMaxLength((int) (short) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str14 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        int int20 = soundex15.difference("01230120022455012623010202", "H000");
        int int23 = soundex15.difference("01230120022455012623010202", "hi!");
        java.lang.Object obj24 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int25 = soundex0.getMaxLength();
        java.lang.String str27 = soundex0.soundex("01230120022455012623010202");
        int int30 = soundex0.difference("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength(1);
        java.lang.String str12 = soundex6.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (short) 100);
        int int16 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("H000");
        soundex0.setMaxLength(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        int int12 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength((int) ' ');
        int int15 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        java.lang.Class<?> wildcardClass24 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        java.lang.String str14 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("H000");
        int int10 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int22 = soundex1.difference("hi!", "H000");
        int int23 = soundex1.getMaxLength();
        soundex1.setMaxLength(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.soundex("");
        int int9 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str13 = soundex11.encode("01230120022455012623010202");
        java.lang.String str15 = soundex11.soundex("hi!");
        java.lang.String str17 = soundex11.soundex("");
        java.lang.Object obj18 = soundex1.encode((java.lang.Object) "");
        int int19 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((-1));
        java.lang.String str18 = soundex0.encode("H000");
        java.lang.String str20 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.difference("", "");
        java.lang.String str12 = soundex0.encode("hi!");
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("hi!", "hi!");
        soundex0.setMaxLength((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        java.lang.String str28 = soundex0.encode("H000");
        soundex0.setMaxLength(0);
        java.lang.Class<?> wildcardClass31 = soundex0.getClass();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        char[] charArray10 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray10);
        int int14 = soundex13.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex0.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(soundex0);
// flaky "7) test2360(org.apache.commons.codec.language.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        int int6 = soundex3.getMaxLength();
        int int7 = soundex3.getMaxLength();
        java.lang.String str9 = soundex3.encode("");
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex10.getMaxLength();
        int int12 = soundex10.getMaxLength();
        java.lang.String str14 = soundex10.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        java.lang.Object obj19 = soundex10.encode((java.lang.Object) "H000");
        java.lang.String str21 = soundex10.soundex("");
        int int24 = soundex10.difference("", "H000");
        java.lang.String str26 = soundex10.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        int int28 = soundex27.getMaxLength();
        int int29 = soundex27.getMaxLength();
        java.lang.String str31 = soundex27.encode("hi!");
        java.lang.String str33 = soundex27.encode("H000");
        java.lang.String str35 = soundex27.soundex("hi!");
        java.lang.String str37 = soundex27.soundex("01230120022455012623010202");
        java.lang.Object obj38 = soundex10.encode((java.lang.Object) str37);
        java.lang.String str40 = soundex10.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = soundex3.encode((java.lang.Object) soundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H000" + "'", obj19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        int int11 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(52);
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (byte) 0);
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        int int15 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        int int10 = soundex1.difference("hi!", "H000");
        int int13 = soundex1.difference("H000", "H000");
        int int16 = soundex1.difference("hi!", "hi!");
        soundex1.setMaxLength((int) (byte) 0);
        soundex1.setMaxLength((int) ' ');
        java.lang.String str22 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        int int9 = soundex5.difference("", "01230120022455012623010202");
        soundex5.setMaxLength((int) (byte) 0);
        java.lang.String str13 = soundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex5.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        int int15 = soundex0.difference("hi!", "");
        int int18 = soundex0.difference("hi!", "H000");
        int int21 = soundex0.difference("hi!", "H000");
        soundex0.setMaxLength((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str4 = soundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        int int4 = soundex3.getMaxLength();
        int int5 = soundex3.getMaxLength();
        int int8 = soundex3.difference("", "01230120022455012623010202");
        java.lang.String str10 = soundex3.encode("");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength((int) 'a');
        int int9 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        int int10 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 0);
        soundex0.setMaxLength(0);
        int int15 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex8.setMaxLength(100);
        java.lang.String str12 = soundex8.soundex("");
        java.lang.String str14 = soundex8.encode("01230120022455012623010202");
        java.lang.String str16 = soundex8.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("hi!", "hi!");
        java.lang.String str18 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("", "hi!");
        int int18 = soundex0.difference("hi!", "");
        int int21 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex22.getMaxLength();
        int int24 = soundex22.getMaxLength();
        java.lang.String str26 = soundex22.encode("");
        int int29 = soundex22.difference("H000", "");
        java.lang.String str31 = soundex22.encode("01230120022455012623010202");
        java.lang.String str33 = soundex22.soundex("hi!");
        soundex22.setMaxLength((int) '4');
        java.lang.String str37 = soundex22.soundex("H000");
        int int40 = soundex22.difference("H000", "");
        java.lang.Class<?> wildcardClass41 = soundex22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = soundex0.encode((java.lang.Object) wildcardClass41);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        java.lang.String str10 = soundex6.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        java.lang.String str19 = soundex0.encode("H000");
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int12 = soundex9.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str14 = soundex9.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.encode("hi!");
        java.lang.String str21 = soundex15.encode("H000");
        java.lang.String str23 = soundex15.encode("");
        int int26 = soundex15.difference("01230120022455012623010202", "hi!");
        java.lang.String str28 = soundex15.soundex("H000");
        java.lang.Object obj29 = soundex9.encode((java.lang.Object) "H000");
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = soundex0.encode(obj29);
        java.lang.String str33 = soundex0.encode("H000");
        java.lang.String str35 = soundex0.soundex("01230120022455012623010202");
        int int36 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H000" + "'", obj31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        int int23 = soundex0.difference("hi!", "hi!");
        int int26 = soundex0.difference("H000", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.encode("");
        soundex0.setMaxLength(52);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.soundex("");
        java.lang.String str19 = soundex0.encode("");
        int int22 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass23 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("hi!", "hi!");
        java.lang.String str18 = soundex0.encode("hi!");
        int int21 = soundex0.difference("", "hi!");
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int26 = soundex23.difference("01230120022455012623010202", "01230120022455012623010202");
        int int29 = soundex23.difference("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) soundex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        java.lang.String str45 = soundex0.encode("H000");
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "H000" + "'", str45, "H000");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex7.setMaxLength(32);
        soundex7.setMaxLength(52);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        soundex9.setMaxLength(1);
        soundex9.setMaxLength((int) (byte) -1);
        int int17 = soundex9.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        int int22 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        int int10 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int14 = soundex11.difference("H000", "");
        java.lang.String str16 = soundex11.encode("");
        java.lang.String str18 = soundex11.soundex("");
        java.lang.String str20 = soundex11.soundex("hi!");
        soundex11.setMaxLength((int) (short) 0);
        java.lang.String str24 = soundex11.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex11.soundex("hi!");
        java.lang.String str28 = soundex11.encode("H000");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) str28);
        soundex0.setMaxLength((int) (short) 100);
        java.lang.Class<?> wildcardClass32 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str8 = soundex6.encode("");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("01230120022455012623010202", "hi!");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("");
        int int13 = soundex0.difference("hi!", "");
        java.lang.String str15 = soundex0.encode("hi!");
        java.lang.String str17 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        int int10 = soundex1.difference("H000", "");
        java.lang.String str12 = soundex1.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex13 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str15 = soundex13.soundex("");
        java.lang.String str17 = soundex13.soundex("01230120022455012623010202");
        int int20 = soundex13.difference("01230120022455012623010202", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex1.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(soundex13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        soundex0.setMaxLength(0);
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(32);
        java.lang.String str11 = soundex0.soundex("hi!");
        int int14 = soundex0.difference("", "hi!");
        soundex0.setMaxLength((int) '4');
        soundex0.setMaxLength((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        int int14 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        java.lang.Object obj32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex3.encode(obj32);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("hi!");
        java.lang.String str15 = soundex0.soundex("H000");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        int int10 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str12 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.String str17 = soundex0.encode("");
        soundex0.setMaxLength((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.lang.String str23 = soundex0.soundex("hi!");
        int int26 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength(0);
        soundex5.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex5.difference("H000", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex5.encode("");
        java.lang.Class<?> wildcardClass12 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("");
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.encode("hi!");
        int int11 = soundex0.getMaxLength();
        char[] charArray13 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.Class<?> wildcardClass24 = charArray13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) charArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4' });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        java.lang.String str27 = soundex0.soundex("H000");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        java.lang.Class<?> wildcardClass28 = soundex0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength(1);
        soundex4.setMaxLength(100);
        int int10 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex4.difference("H000", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.encode("");
        int int10 = soundex0.difference("hi!", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int15 = soundex12.difference("01230120022455012623010202", "01230120022455012623010202");
        int int18 = soundex12.difference("", "hi!");
        java.lang.String str20 = soundex12.encode("");
        java.lang.String str22 = soundex12.encode("01230120022455012623010202");
        soundex12.setMaxLength(10);
        java.lang.String str26 = soundex12.soundex("01230120022455012623010202");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int30 = soundex0.difference("01230120022455012623010202", "hi!");
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex();
        int int32 = soundex31.getMaxLength();
        int int33 = soundex31.getMaxLength();
        java.lang.String str35 = soundex31.soundex("");
        java.lang.String str37 = soundex31.encode("H000");
        int int40 = soundex31.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = soundex0.encode((java.lang.Object) int40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int33 = soundex30.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str35 = soundex30.encode("01230120022455012623010202");
        java.lang.String str37 = soundex30.encode("H000");
        int int40 = soundex30.difference("", "H000");
        soundex30.setMaxLength((int) (short) 1);
        int int45 = soundex30.difference("01230120022455012623010202", "H000");
        int int48 = soundex30.difference("", "");
        soundex30.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = soundex3.encode((java.lang.Object) 0);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        int int11 = soundex7.getMaxLength();
        int int12 = soundex7.getMaxLength();
        int int13 = soundex7.getMaxLength();
        java.lang.String str15 = soundex7.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = soundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex12.difference("H000", "");
        java.lang.String str17 = soundex12.encode("");
        java.lang.String str19 = soundex12.soundex("");
        java.lang.String str21 = soundex12.encode("H000");
        int int24 = soundex12.difference("", "");
        java.lang.String str26 = soundex12.soundex("H000");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "H000");
        int int30 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str32 = soundex0.encode("H000");
        java.lang.String str34 = soundex0.encode("");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "H000");
        java.lang.String str9 = soundex0.soundex("");
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        java.lang.String str7 = soundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = soundex4.difference("H000", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex0.encode("hi!");
        int int11 = soundex0.getMaxLength();
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex6 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str8 = soundex6.soundex("");
        java.lang.String str10 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj11 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("");
        java.lang.String str16 = soundex0.encode("");
        java.lang.String str18 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int7 = soundex0.difference("H000", "hi!");
        java.lang.String str9 = soundex0.encode("hi!");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        java.lang.String str18 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex7.setMaxLength(0);
        int int12 = soundex7.difference("", "");
        java.lang.Class<?> wildcardClass13 = soundex7.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("01230120022455012623010202");
        int int11 = soundex1.getMaxLength();
        int int14 = soundex1.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.encode("");
        soundex0.setMaxLength(52);
        int int13 = soundex0.getMaxLength();
        soundex0.setMaxLength(35);
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.String str12 = soundex0.encode("hi!");
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("hi!", "");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex9.difference("H000", "");
        java.lang.String str14 = soundex9.encode("");
        java.lang.String str16 = soundex9.soundex("");
        java.lang.String str18 = soundex9.soundex("hi!");
        soundex9.setMaxLength((int) (byte) 1);
        java.lang.String str22 = soundex9.soundex("");
        int int25 = soundex9.difference("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) int25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.soundex("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass14 = soundex13.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        java.lang.String str34 = soundex32.encode("hi!");
        java.lang.String str36 = soundex32.soundex("hi!");
        java.lang.String str38 = soundex32.encode("hi!");
        int int41 = soundex32.difference("", "H000");
        int int44 = soundex32.difference("hi!", "hi!");
        java.lang.String str46 = soundex32.encode("");
        java.lang.Object obj47 = soundex0.encode((java.lang.Object) "");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "" + "'", obj47, "");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        java.lang.String str13 = soundex1.soundex("01230120022455012623010202");
        int int14 = soundex1.getMaxLength();
        java.lang.String str16 = soundex1.encode("hi!");
        java.lang.Class<?> wildcardClass17 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("H000");
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex();
        int int7 = soundex4.difference("H000", "");
        int int8 = soundex4.getMaxLength();
        java.lang.String str10 = soundex4.soundex("hi!");
        java.lang.String str12 = soundex4.encode("hi!");
        int int15 = soundex4.difference("01230120022455012623010202", "hi!");
        java.lang.String str17 = soundex4.soundex("");
        int int20 = soundex4.difference("", "01230120022455012623010202");
        int int23 = soundex4.difference("H000", "H000");
        java.lang.String str25 = soundex4.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex3.encode((java.lang.Object) soundex4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int11 = soundex0.difference("01230120022455012623010202", "");
        int int14 = soundex0.difference("01230120022455012623010202", "");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex12.difference("H000", "");
        java.lang.String str17 = soundex12.encode("");
        java.lang.String str19 = soundex12.soundex("");
        java.lang.String str21 = soundex12.soundex("hi!");
        int int22 = soundex12.getMaxLength();
        java.lang.String str24 = soundex12.soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex11.encode((java.lang.Object) str24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        int int33 = soundex6.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("H000");
        java.lang.String str13 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex6 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str8 = soundex6.soundex("");
        java.lang.String str10 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj11 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("hi!", "H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        java.lang.String str21 = soundex16.encode("");
        java.lang.String str23 = soundex16.soundex("");
        java.lang.String str25 = soundex16.soundex("hi!");
        soundex16.setMaxLength((int) (short) 0);
        java.lang.String str29 = soundex16.soundex("01230120022455012623010202");
        java.lang.String str31 = soundex16.soundex("hi!");
        java.lang.String str33 = soundex16.soundex("hi!");
        java.lang.String str35 = soundex16.encode("01230120022455012623010202");
        java.lang.Object obj36 = soundex0.encode((java.lang.Object) str35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str11 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str13 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) (byte) 1);
        soundex0.setMaxLength((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("hi!");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.String str8 = soundex0.soundex("hi!");
        int int11 = soundex0.difference("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        soundex9.setMaxLength((int) 'a');
        java.lang.String str14 = soundex9.encode("H000");
        int int17 = soundex9.difference("H000", "H000");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str20 = soundex0.soundex("");
        java.lang.String str22 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str24 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        java.lang.String str14 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int19 = soundex16.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str21 = soundex16.encode("01230120022455012623010202");
        java.lang.String str23 = soundex16.encode("H000");
        java.lang.Object obj24 = soundex0.encode((java.lang.Object) "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H000" + "'", obj24, "H000");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        int int22 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("H000");
        int int14 = soundex0.difference("hi!", "H000");
        soundex0.setMaxLength(0);
        java.lang.String str18 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str23 = soundex21.encode("hi!");
        java.lang.String str25 = soundex21.soundex("hi!");
        java.lang.String str27 = soundex21.encode("hi!");
        java.lang.String str29 = soundex21.soundex("H000");
        java.lang.String str31 = soundex21.encode("01230120022455012623010202");
        java.lang.Object obj32 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str35 = soundex33.encode("hi!");
        java.lang.String str37 = soundex33.encode("");
        java.lang.String str39 = soundex33.encode("H000");
        int int40 = soundex33.getMaxLength();
        java.lang.String str42 = soundex33.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = soundex0.encode((java.lang.Object) soundex33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H000" + "'", str39, "H000");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex8.setMaxLength(100);
        java.lang.String str12 = soundex8.soundex("");
        java.lang.String str14 = soundex8.encode("01230120022455012623010202");
        soundex8.setMaxLength(35);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("01230120022455012623010202");
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str9 = soundex0.encode("hi!");
        java.lang.String str11 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex12.difference("H000", "");
        int int16 = soundex12.getMaxLength();
        java.lang.String str18 = soundex12.soundex("hi!");
        java.lang.String str20 = soundex12.encode("hi!");
        int int23 = soundex12.difference("01230120022455012623010202", "hi!");
        int int24 = soundex12.getMaxLength();
        java.lang.String str26 = soundex12.soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        char[] charArray13 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex1.encode((java.lang.Object) soundex22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("hi!", "hi!");
        java.lang.String str18 = soundex0.encode("hi!");
        int int21 = soundex0.difference("01230120022455012623010202", "hi!");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex22.getMaxLength();
        int int24 = soundex22.getMaxLength();
        java.lang.String str26 = soundex22.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        int int30 = soundex27.difference("H000", "");
        java.lang.Object obj31 = soundex22.encode((java.lang.Object) "H000");
        java.lang.String str33 = soundex22.soundex("");
        int int36 = soundex22.difference("", "H000");
        java.lang.String str38 = soundex22.encode("hi!");
        soundex22.setMaxLength(4);
        int int43 = soundex22.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex22.setMaxLength((int) ' ');
        java.lang.String str47 = soundex22.encode("hi!");
        java.lang.String str49 = soundex22.encode("");
        java.lang.Object obj50 = soundex0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Soundex soundex51 = new org.apache.commons.codec.language.Soundex();
        int int54 = soundex51.difference("H000", "");
        java.lang.String str56 = soundex51.encode("");
        int int57 = soundex51.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = soundex0.encode((java.lang.Object) soundex51);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H000" + "'", obj31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "H000" + "'", str47, "H000");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int8 = soundex0.difference("H000", "H000");
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.difference("", "");
        int int11 = soundex1.difference("", "");
        soundex1.setMaxLength((int) (byte) 0);
        java.lang.String str15 = soundex1.soundex("H000");
        int int18 = soundex1.difference("01230120022455012623010202", "H000");
        soundex1.setMaxLength((int) (short) 10);
        java.lang.String str22 = soundex1.encode("H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("hi!", "");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength((int) ' ');
        int int10 = soundex1.difference("", "01230120022455012623010202");
        java.lang.String str12 = soundex1.soundex("hi!");
        soundex1.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int12 = soundex0.difference("H000", "");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        java.lang.String str17 = soundex13.encode("");
        java.lang.String str19 = soundex13.encode("H000");
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj22 = soundex13.encode((java.lang.Object) "hi!");
        java.lang.String str24 = soundex13.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex13.encode("H000");
        java.lang.String str28 = soundex13.encode("H000");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H000" + "'", obj22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        java.lang.String str7 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        java.lang.String str15 = soundex8.soundex("");
        java.lang.String str17 = soundex8.soundex("hi!");
        int int18 = soundex8.getMaxLength();
        java.lang.String str20 = soundex8.encode("01230120022455012623010202");
        java.lang.String str22 = soundex8.soundex("H000");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H000" + "'", obj23, "H000");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        int int21 = soundex0.getMaxLength();
        java.lang.String str23 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int28 = soundex25.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str30 = soundex25.encode("01230120022455012623010202");
        java.lang.String str32 = soundex25.encode("H000");
        int int35 = soundex25.difference("", "H000");
        int int38 = soundex25.difference("01230120022455012623010202", "H000");
        int int41 = soundex25.difference("", "hi!");
        int int42 = soundex25.getMaxLength();
        int int43 = soundex25.getMaxLength();
        java.lang.Class<?> wildcardClass44 = soundex25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = soundex0.encode((java.lang.Object) wildcardClass44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.difference("hi!", "hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        java.lang.String str19 = soundex15.soundex("hi!");
        soundex15.setMaxLength((int) (short) 10);
        java.lang.String str23 = soundex15.encode("01230120022455012623010202");
        soundex15.setMaxLength(10);
        java.lang.Class<?> wildcardClass26 = soundex15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("");
        soundex0.setMaxLength((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        int int9 = soundex0.difference("hi!", "");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("");
        soundex0.setMaxLength(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        soundex0.setMaxLength((int) (byte) 1);
        int int24 = soundex0.difference("", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        int int8 = soundex0.difference("", "");
        int int9 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        soundex0.setMaxLength(52);
        int int10 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        java.lang.String str23 = soundex1.soundex("hi!");
        java.lang.String str25 = soundex1.soundex("");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.encode("");
        java.lang.String str11 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        int int30 = soundex0.difference("", "");
        soundex0.setMaxLength((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        java.lang.String str23 = soundex1.soundex("hi!");
        int int24 = soundex1.getMaxLength();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(4);
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.encode("");
        char[] charArray20 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray20);
        int int27 = soundex24.difference("01230120022455012623010202", "");
        int int28 = soundex24.getMaxLength();
        java.lang.String str30 = soundex24.encode("");
        java.lang.Class<?> wildcardClass31 = soundex24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        java.lang.String str12 = soundex8.soundex("");
        java.lang.String str14 = soundex8.soundex("");
        soundex8.setMaxLength(35);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("hi!", "hi!");
        java.lang.String str9 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        int int18 = soundex13.difference("01230120022455012623010202", "H000");
        java.lang.String str20 = soundex13.soundex("");
        soundex13.setMaxLength((int) (byte) 0);
        soundex13.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex8.encode((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 1);
        char[] charArray25 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray25);
        int int35 = soundex32.difference("01230120022455012623010202", "");
        java.lang.Class<?> wildcardClass36 = soundex32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex0.encode((java.lang.Object) soundex32);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        java.lang.String str17 = soundex0.encode("H000");
        int int18 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
        java.lang.String str28 = soundex0.encode("");
        int int31 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str33 = soundex0.soundex("hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.encode("");
        soundex0.setMaxLength(0);
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.soundex("hi!");
        int int17 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        java.lang.String str26 = soundex0.soundex("H000");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("", "");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        int int18 = soundex1.getMaxLength();
        int int19 = soundex1.getMaxLength();
        int int22 = soundex1.difference("", "");
        int int23 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.encode("H000");
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(52);
        int int4 = soundex1.getMaxLength();
        java.lang.Class<?> wildcardClass5 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str13 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        int int22 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) (byte) 100);
        java.lang.String str26 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        int int8 = soundex0.difference("hi!", "H000");
        int int9 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (byte) 1);
        int int11 = soundex6.difference("01230120022455012623010202", "");
        int int12 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        int int8 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int11 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        int int16 = soundex0.difference("H000", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.String str11 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.soundex("H000");
        int int12 = soundex0.difference("H000", "");
        soundex0.setMaxLength(100);
        soundex0.setMaxLength(32);
        int int19 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
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
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        soundex18.setMaxLength((int) 'a');
        java.lang.String str23 = soundex18.encode("H000");
        soundex18.setMaxLength((int) '#');
        java.lang.String str27 = soundex18.encode("");
        soundex18.setMaxLength((int) ' ');
        java.lang.String str31 = soundex18.soundex("H000");
        int int32 = soundex18.getMaxLength();
        java.lang.String str34 = soundex18.soundex("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex17.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        int int8 = soundex5.getMaxLength();
        java.lang.Class<?> wildcardClass9 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str10 = soundex8.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.soundex("hi!");
        int int17 = soundex0.getMaxLength();
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        int int19 = soundex0.difference("H000", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(35);
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(52);
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        int int10 = soundex1.difference("", "");
        soundex1.setMaxLength((int) '4');
        java.lang.String str14 = soundex1.soundex("");
        int int17 = soundex1.difference("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str8 = soundex6.encode("hi!");
        java.lang.String str10 = soundex6.soundex("hi!");
        int int11 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex12 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str14 = soundex12.soundex("");
        java.lang.String str16 = soundex12.soundex("01230120022455012623010202");
        java.lang.Object obj17 = soundex6.encode((java.lang.Object) "01230120022455012623010202");
        int int18 = soundex6.getMaxLength();
        int int21 = soundex6.difference("hi!", "H000");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(soundex12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H000" + "'", obj22, "H000");
    }
}
