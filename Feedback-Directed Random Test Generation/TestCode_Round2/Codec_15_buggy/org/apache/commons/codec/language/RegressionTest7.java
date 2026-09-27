package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        char[] charArray21 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray21);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray21);
        int int24 = soundex23.getMaxLength();
        java.lang.String str26 = soundex23.encode("01230120022455012623010202");
        java.lang.String str28 = soundex23.soundex("");
        java.lang.String str30 = soundex23.soundex("");
        java.lang.Object obj31 = soundex0.encode((java.lang.Object) "");
        int int32 = soundex0.getMaxLength();
        java.lang.String str34 = soundex0.soundex("H000");
        java.lang.String str36 = soundex0.encode("hi!");
        int int37 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        int int25 = soundex1.difference("H000", "H000");
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str28 = soundex26.encode("hi!");
        java.lang.String str30 = soundex26.soundex("hi!");
        int int33 = soundex26.difference("01230120022455012623010202", "H000");
        int int36 = soundex26.difference("", "H000");
        int int39 = soundex26.difference("01230120022455012623010202", "hi!");
        soundex26.setMaxLength((int) (short) -1);
        java.lang.String str43 = soundex26.soundex("01230120022455012623010202");
        int int44 = soundex26.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = soundex1.encode((java.lang.Object) soundex26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.apache.commons.codec.language.Soundex soundex21 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int22 = soundex21.getMaxLength();
        int int23 = soundex21.getMaxLength();
        int int24 = soundex21.getMaxLength();
        java.lang.String str26 = soundex21.encode("H000");
        int int27 = soundex21.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex();
        int int29 = soundex28.getMaxLength();
        soundex28.setMaxLength((int) 'a');
        java.lang.String str33 = soundex28.encode("H000");
        soundex28.setMaxLength((int) '#');
        java.lang.String str37 = soundex28.encode("");
        int int40 = soundex28.difference("H000", "01230120022455012623010202");
        int int43 = soundex28.difference("hi!", "");
        java.lang.Object obj44 = soundex21.encode((java.lang.Object) "");
        java.lang.String str46 = soundex21.soundex("hi!");
        int int47 = soundex21.getMaxLength();
        java.lang.Class<?> wildcardClass48 = soundex21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = soundex0.encode((java.lang.Object) soundex21);
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
        org.junit.Assert.assertNotNull(soundex21);
// flaky "1) test3504(org.apache.commons.codec.language.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "1) test3504(org.apache.commons.codec.language.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "1) test3504(org.apache.commons.codec.language.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
// flaky "1) test3504(org.apache.commons.codec.language.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "H000" + "'", str46, "H000");
// flaky "1) test3504(org.apache.commons.codec.language.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("H000");
        char[] charArray16 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        soundex17.setMaxLength(10);
        soundex17.setMaxLength((int) (byte) 10);
        java.lang.String str23 = soundex17.encode("");
        java.lang.Object obj24 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.String str7 = soundex1.soundex("");
        java.lang.String str9 = soundex1.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.soundex("H000");
        java.lang.String str15 = soundex0.encode("H000");
        int int16 = soundex0.getMaxLength();
        int int19 = soundex0.difference("", "hi!");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str22 = soundex20.encode("hi!");
        java.lang.String str24 = soundex20.soundex("hi!");
        int int27 = soundex20.difference("01230120022455012623010202", "H000");
        int int30 = soundex20.difference("", "H000");
        soundex20.setMaxLength(10);
        int int33 = soundex20.getMaxLength();
        int int36 = soundex20.difference("01230120022455012623010202", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex0.encode((java.lang.Object) int36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int10 = soundex0.difference("", "hi!");
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        int int12 = soundex8.getMaxLength();
        java.lang.String str14 = soundex8.soundex("hi!");
        soundex8.setMaxLength((int) (short) -1);
        soundex8.setMaxLength(10);
        java.lang.String str20 = soundex8.encode("hi!");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.String str23 = soundex0.soundex("H000");
        java.lang.String str25 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        int int14 = soundex0.difference("hi!", "hi!");
        int int15 = soundex0.getMaxLength();
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("");
        java.lang.String str13 = soundex0.soundex("");
        java.lang.String str15 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        int int26 = soundex0.difference("H000", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("H000");
        int int14 = soundex0.difference("H000", "H000");
        int int15 = soundex0.getMaxLength();
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        java.lang.String str5 = soundex0.encode("hi!");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.soundex("hi!");
        int int14 = soundex0.difference("", "");
        org.junit.Assert.assertNotNull(soundex0);
// flaky "2) test3515(org.apache.commons.codec.language.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.soundex("");
        java.lang.String str15 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        soundex1.setMaxLength((int) (short) 10);
        int int10 = soundex1.getMaxLength();
        java.lang.String str12 = soundex1.soundex("01230120022455012623010202");
        int int13 = soundex1.getMaxLength();
        int int16 = soundex1.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        char[] charArray15 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        int int26 = soundex25.getMaxLength();
        int int27 = soundex25.getMaxLength();
        java.lang.String str29 = soundex25.soundex("H000");
        java.lang.String str31 = soundex25.encode("H000");
        soundex25.setMaxLength((-1));
        java.lang.String str35 = soundex25.soundex("01230120022455012623010202");
        java.lang.Object obj36 = soundex24.encode((java.lang.Object) str35);
        java.lang.Object obj37 = soundex0.encode((java.lang.Object) str35);
        java.lang.String str39 = soundex0.soundex("hi!");
        java.lang.String str41 = soundex0.encode("01230120022455012623010202");
        java.lang.String str43 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass44 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H000" + "'", str39, "H000");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H000" + "'", str43, "H000");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(1);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int12 = soundex0.difference("", "H000");
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int20 = soundex17.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str22 = soundex17.encode("01230120022455012623010202");
        java.lang.String str24 = soundex17.encode("H000");
        int int27 = soundex17.difference("", "H000");
        int int30 = soundex17.difference("01230120022455012623010202", "H000");
        int int33 = soundex17.difference("", "01230120022455012623010202");
        int int34 = soundex17.getMaxLength();
        int int37 = soundex17.difference("hi!", "H000");
        int int38 = soundex17.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex0.encode((java.lang.Object) soundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex3.setMaxLength(32);
        int int6 = soundex3.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("");
        int int16 = soundex0.difference("H000", "H000");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str19 = soundex17.encode("hi!");
        java.lang.String str21 = soundex17.encode("");
        java.lang.String str23 = soundex17.encode("H000");
        java.lang.String str25 = soundex17.soundex("01230120022455012623010202");
        java.lang.String str27 = soundex17.soundex("H000");
        int int28 = soundex17.getMaxLength();
        int int29 = soundex17.getMaxLength();
        int int32 = soundex17.difference("01230120022455012623010202", "hi!");
        java.lang.Class<?> wildcardClass33 = soundex17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) wildcardClass33);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(0);
        int int12 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex4.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int7 = soundex0.difference("H000", "hi!");
        java.lang.String str9 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        int int18 = soundex13.difference("01230120022455012623010202", "H000");
        int int21 = soundex13.difference("01230120022455012623010202", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex8.encode((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str6 = soundex4.encode("01230120022455012623010202");
        java.lang.String str8 = soundex4.soundex("");
        soundex4.setMaxLength((int) 'a');
        java.lang.Class<?> wildcardClass11 = soundex4.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        int int22 = soundex0.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        int int4 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str14 = soundex12.encode("hi!");
        int int17 = soundex12.difference("", "");
        int int20 = soundex12.difference("", "");
        java.lang.Object obj21 = soundex11.encode((java.lang.Object) "");
        int int22 = soundex11.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = soundex11.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int6 = soundex5.getMaxLength();
        int int7 = soundex5.getMaxLength();
        java.lang.String str9 = soundex5.soundex("hi!");
        java.lang.Object obj10 = soundex0.encode((java.lang.Object) "hi!");
        int int13 = soundex0.difference("", "");
        java.lang.String str15 = soundex0.encode("H000");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        int int22 = soundex0.difference("H000", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength((int) (short) 100);
        int int6 = soundex1.difference("H000", "hi!");
        java.lang.String str8 = soundex1.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex9.difference("H000", "");
        java.lang.String str14 = soundex9.encode("");
        java.lang.String str16 = soundex9.soundex("");
        java.lang.String str18 = soundex9.soundex("hi!");
        soundex9.setMaxLength((int) (short) 0);
        java.lang.String str22 = soundex9.encode("");
        java.lang.String str24 = soundex9.soundex("01230120022455012623010202");
        int int27 = soundex9.difference("", "");
        java.lang.Object obj28 = soundex1.encode((java.lang.Object) "");
        int int29 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        int int9 = soundex5.difference("", "01230120022455012623010202");
        java.lang.String str11 = soundex5.encode("");
        soundex5.setMaxLength(52);
        soundex5.setMaxLength((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int10 = soundex9.getMaxLength();
        int int13 = soundex9.difference("", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex14 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int15 = soundex14.getMaxLength();
        int int16 = soundex14.getMaxLength();
        int int19 = soundex14.difference("01230120022455012623010202", "");
        int int20 = soundex14.getMaxLength();
        java.lang.Class<?> wildcardClass21 = soundex14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex9.encode((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(soundex14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("01230120022455012623010202", "");
        soundex0.setMaxLength(0);
        int int21 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        java.lang.String str16 = soundex1.encode("hi!");
        java.lang.String str18 = soundex1.encode("hi!");
        int int21 = soundex1.difference("hi!", "");
        java.lang.String str23 = soundex1.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 0);
        soundex1.setMaxLength((int) (byte) 100);
        int int22 = soundex1.getMaxLength();
        int int23 = soundex1.getMaxLength();
        java.lang.String str25 = soundex1.encode("");
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex();
        int int29 = soundex26.difference("H000", "");
        java.lang.String str31 = soundex26.encode("");
        java.lang.String str33 = soundex26.soundex("");
        java.lang.String str35 = soundex26.encode("H000");
        java.lang.String str37 = soundex26.encode("");
        int int38 = soundex26.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex1.encode((java.lang.Object) int38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        char[] charArray6 = new char[] { 'a', '#', ' ', '4', ' ', 'a' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', ' ', '4', ' ', 'a' });
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        soundex0.setMaxLength(10);
        java.lang.String str15 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        int int20 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        int int25 = soundex0.difference("H000", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str28 = soundex26.encode("hi!");
        int int31 = soundex26.difference("hi!", "01230120022455012623010202");
        java.lang.String str33 = soundex26.encode("H000");
        java.lang.String str35 = soundex26.encode("01230120022455012623010202");
        java.lang.String str37 = soundex26.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex38 = new org.apache.commons.codec.language.Soundex();
        int int41 = soundex38.difference("H000", "");
        java.lang.String str43 = soundex38.encode("");
        java.lang.String str45 = soundex38.soundex("");
        java.lang.String str47 = soundex38.encode("H000");
        int int50 = soundex38.difference("", "");
        java.lang.String str52 = soundex38.soundex("H000");
        java.lang.Object obj53 = soundex26.encode((java.lang.Object) "H000");
        int int56 = soundex26.difference("01230120022455012623010202", "H000");
        java.lang.String str58 = soundex26.encode("H000");
        java.lang.String str60 = soundex26.encode("");
        java.lang.Object obj61 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "H000" + "'", str47, "H000");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "H000" + "'", str52, "H000");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "H000" + "'", obj53, "H000");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "H000" + "'", str58, "H000");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "" + "'", obj61, "");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength((int) (byte) 1);
        int int14 = soundex0.difference("", "H000");
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        int int31 = soundex1.getMaxLength();
        java.lang.String str33 = soundex1.encode("01230120022455012623010202");
        soundex1.setMaxLength((int) 'a');
        java.lang.String str37 = soundex1.soundex("H000");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int22 = soundex1.difference("hi!", "hi!");
        java.lang.String str24 = soundex1.soundex("");
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str27 = soundex25.encode("hi!");
        java.lang.String str29 = soundex25.soundex("hi!");
        java.lang.Class<?> wildcardClass30 = soundex25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex1.encode((java.lang.Object) soundex25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        java.lang.String str14 = soundex8.soundex("");
        soundex8.setMaxLength((int) ' ');
        java.lang.Class<?> wildcardClass17 = soundex8.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str16 = soundex0.soundex("");
        java.lang.String str18 = soundex0.soundex("H000");
        int int21 = soundex0.difference("01230120022455012623010202", "");
        java.lang.Class<?> wildcardClass22 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        int int12 = soundex0.difference("", "");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("");
        int int17 = soundex0.getMaxLength();
        char[] charArray22 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray22);
        int int25 = soundex24.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex();
        int int29 = soundex26.difference("H000", "");
        java.lang.String str31 = soundex26.encode("");
        java.lang.Object obj32 = soundex24.encode((java.lang.Object) "");
        java.lang.Object obj33 = soundex0.encode((java.lang.Object) "");
        int int36 = soundex0.difference("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("H000", "hi!");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        int int12 = soundex0.difference("", "hi!");
        java.lang.String str14 = soundex0.encode("");
        java.lang.String str16 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("H000");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.soundex("H000");
        java.lang.String str19 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) 'a');
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        java.lang.String str32 = soundex0.soundex("");
        int int33 = soundex0.getMaxLength();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        java.lang.String str22 = soundex0.encode("hi!");
        java.lang.String str24 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        int int8 = soundex0.difference("H000", "hi!");
        java.lang.String str10 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        int int13 = soundex11.getMaxLength();
        java.lang.String str15 = soundex11.soundex("hi!");
        java.lang.String str17 = soundex11.soundex("H000");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) str17);
        int int21 = soundex0.difference("", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        int int9 = soundex0.difference("hi!", "");
        java.lang.String str11 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        soundex0.setMaxLength((int) (short) 0);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode(obj24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("", "");
        soundex0.setMaxLength(1);
        java.lang.String str19 = soundex0.encode("hi!");
        int int20 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        java.lang.String str19 = soundex0.encode("");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass22 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.soundex("");
        int int16 = soundex0.difference("hi!", "");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        int int9 = soundex0.difference("hi!", "");
        org.apache.commons.codec.language.Soundex soundex10 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int11 = soundex10.getMaxLength();
        java.lang.String str13 = soundex10.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex10.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex10.soundex("H000");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "H000");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int22 = soundex19.difference("H000", "");
        java.lang.String str24 = soundex19.encode("");
        java.lang.String str26 = soundex19.soundex("");
        java.lang.String str28 = soundex19.soundex("hi!");
        soundex19.setMaxLength((int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = soundex19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(soundex10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        int int32 = soundex0.difference("hi!", "");
        org.apache.commons.codec.language.Soundex soundex33 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int34 = soundex33.getMaxLength();
        int int37 = soundex33.difference("hi!", "");
        java.lang.String str39 = soundex33.soundex("");
        java.lang.String str41 = soundex33.encode("hi!");
        java.lang.Object obj42 = soundex0.encode((java.lang.Object) str41);
        int int43 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex44 = new org.apache.commons.codec.language.Soundex();
        int int47 = soundex44.difference("H000", "");
        java.lang.String str49 = soundex44.encode("");
        int int52 = soundex44.difference("H000", "H000");
        soundex44.setMaxLength((int) (short) 100);
        soundex44.setMaxLength((int) (short) -1);
        int int57 = soundex44.getMaxLength();
        soundex44.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = soundex0.encode((java.lang.Object) soundex44);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(soundex33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "H000" + "'", obj42, "H000");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str20 = soundex18.encode("hi!");
        java.lang.String str22 = soundex18.encode("");
        java.lang.String str24 = soundex18.encode("H000");
        soundex18.setMaxLength(52);
        int int29 = soundex18.difference("01230120022455012623010202", "");
        java.lang.Class<?> wildcardClass30 = soundex18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex0.encode((java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) 'a');
        int int15 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int18 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        int int14 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        java.lang.String str31 = soundex0.soundex("");
        java.lang.String str33 = soundex0.soundex("H000");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        int int16 = soundex0.difference("", "");
        java.lang.String str18 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        int int8 = soundex0.difference("", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        int int4 = soundex0.getMaxLength();
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        java.lang.String str13 = soundex8.encode("");
        int int16 = soundex8.difference("H000", "H000");
        int int19 = soundex8.difference("01230120022455012623010202", "hi!");
        java.lang.String str21 = soundex8.soundex("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int14 = soundex0.difference("H000", "hi!");
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        int int12 = soundex8.getMaxLength();
        java.lang.String str14 = soundex8.soundex("hi!");
        soundex8.setMaxLength((int) (short) -1);
        soundex8.setMaxLength(10);
        java.lang.String str20 = soundex8.encode("hi!");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) "hi!");
        int int22 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.difference("", "");
        int int11 = soundex1.difference("", "");
        java.lang.String str13 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        int int16 = soundex0.difference("hi!", "hi!");
        java.lang.String str18 = soundex0.soundex("H000");
        soundex0.setMaxLength(97);
        int int23 = soundex0.difference("", "hi!");
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex();
        int int25 = soundex24.getMaxLength();
        int int26 = soundex24.getMaxLength();
        soundex24.setMaxLength((int) (byte) -1);
        java.lang.String str30 = soundex24.soundex("H000");
        java.lang.String str32 = soundex24.soundex("01230120022455012623010202");
        int int33 = soundex24.getMaxLength();
        int int34 = soundex24.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex0.encode((java.lang.Object) soundex24);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        java.lang.String str22 = soundex10.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("H000", "hi!");
        java.lang.String str17 = soundex0.soundex("H000");
        java.lang.String str19 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        java.lang.String str20 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex();
        int int22 = soundex21.getMaxLength();
        int int23 = soundex21.getMaxLength();
        java.lang.String str25 = soundex21.encode("");
        int int26 = soundex21.getMaxLength();
        int int29 = soundex21.difference("", "H000");
        int int32 = soundex21.difference("01230120022455012623010202", "H000");
        java.lang.String str34 = soundex21.encode("");
        java.lang.String str36 = soundex21.encode("H000");
        int int39 = soundex21.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Object obj40 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex42 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int45 = soundex42.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str47 = soundex42.encode("01230120022455012623010202");
        java.lang.String str49 = soundex42.encode("H000");
        int int52 = soundex42.difference("", "H000");
        int int55 = soundex42.difference("01230120022455012623010202", "H000");
        int int58 = soundex42.difference("", "H000");
        soundex42.setMaxLength((int) (short) 0);
        soundex42.setMaxLength((int) (byte) 100);
        int int63 = soundex42.getMaxLength();
        int int64 = soundex42.getMaxLength();
        java.lang.String str66 = soundex42.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = soundex0.encode((java.lang.Object) soundex42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "H000" + "'", str49, "H000");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        java.lang.String str3 = soundex1.soundex("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("");
        soundex1.setMaxLength((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex();
        int int2 = soundex1.getMaxLength();
        int int3 = soundex1.getMaxLength();
        java.lang.String str5 = soundex1.soundex("");
        java.lang.String str7 = soundex1.encode("H000");
        java.lang.Object obj8 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength((int) (byte) 0);
        soundex0.setMaxLength((int) (short) 10);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("H000");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength(4);
        java.lang.String str5 = soundex1.soundex("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex1.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass8 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        java.lang.String str8 = soundex1.soundex("hi!");
        soundex1.setMaxLength((int) '4');
        int int11 = soundex1.getMaxLength();
        java.lang.Class<?> wildcardClass12 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.soundex("H000");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("", "H000");
        int int12 = soundex0.difference("hi!", "hi!");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        int int9 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex11.setMaxLength(0);
        soundex11.setMaxLength((int) '4');
        int int16 = soundex11.getMaxLength();
        int int17 = soundex11.getMaxLength();
        java.lang.String str19 = soundex11.soundex("");
        java.lang.Object obj20 = soundex0.encode((java.lang.Object) str19);
        soundex0.setMaxLength(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int14 = soundex0.difference("hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        int int33 = soundex1.difference("hi!", "01230120022455012623010202");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex22.getMaxLength();
        int int24 = soundex22.getMaxLength();
        soundex22.setMaxLength((int) (byte) -1);
        soundex22.setMaxLength((int) (short) 10);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex30.setMaxLength(0);
        soundex30.setMaxLength((int) '4');
        int int37 = soundex30.difference("", "");
        int int40 = soundex30.difference("", "");
        java.lang.Object obj41 = soundex22.encode((java.lang.Object) "");
        java.lang.Object obj42 = soundex0.encode(obj41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 0);
        soundex0.setMaxLength((int) (short) 100);
        int int14 = soundex0.difference("H000", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        int int17 = soundex0.difference("H000", "");
        int int18 = soundex0.getMaxLength();
        int int21 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        soundex0.setMaxLength((int) (short) 100);
        int int24 = soundex0.difference("hi!", "H000");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        int int32 = soundex3.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        int int9 = soundex5.difference("", "01230120022455012623010202");
        java.lang.String str11 = soundex5.encode("");
        int int12 = soundex5.getMaxLength();
        java.lang.String str14 = soundex5.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.soundex("");
        int int9 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex6.difference("H000", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        int int16 = soundex0.getMaxLength();
        soundex0.setMaxLength(10);
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex0.soundex("H000");
        java.lang.String str12 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.encode("");
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str12 = soundex10.soundex("");
        int int13 = soundex10.getMaxLength();
        int int16 = soundex10.difference("", "01230120022455012623010202");
        java.lang.String str18 = soundex10.soundex("");
        soundex10.setMaxLength((int) 'a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("");
        java.lang.String str17 = soundex0.soundex("");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        soundex1.setMaxLength(35);
        java.lang.String str29 = soundex1.soundex("01230120022455012623010202");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        int int16 = soundex0.difference("hi!", "");
        java.lang.String str18 = soundex0.soundex("");
        java.lang.String str20 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str7 = soundex0.soundex("");
        int int8 = soundex0.getMaxLength();
        int int11 = soundex0.difference("hi!", "H000");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength((int) (byte) 10);
        int int11 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        int int11 = soundex0.difference("", "");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "H000");
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        int int11 = soundex9.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str14 = soundex12.encode("hi!");
        java.lang.String str16 = soundex12.soundex("hi!");
        java.lang.String str18 = soundex12.soundex("hi!");
        java.lang.String str20 = soundex12.soundex("01230120022455012623010202");
        java.lang.String str22 = soundex12.encode("H000");
        java.lang.String str24 = soundex12.encode("");
        int int27 = soundex12.difference("hi!", "");
        java.lang.Object obj28 = soundex9.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("H000", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.encode("");
        int int17 = soundex12.getMaxLength();
        java.lang.String str19 = soundex12.encode("H000");
        java.lang.Object obj20 = soundex0.encode((java.lang.Object) str19);
        int int23 = soundex0.difference("hi!", "hi!");
        java.lang.String str25 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H000" + "'", obj20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("", "");
        soundex0.setMaxLength(1);
        java.lang.String str19 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str23 = soundex0.encode("");
        soundex0.setMaxLength(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("H000", "H000");
        char[] charArray15 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray15);
        int int22 = soundex19.difference("01230120022455012623010202", "");
        soundex19.setMaxLength(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.soundex("hi!");
        java.lang.String str19 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "");
        java.lang.String str6 = soundex0.soundex("");
        int int9 = soundex0.difference("", "H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(97);
        java.lang.String str7 = soundex0.soundex("");
        int int8 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        int int7 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int13 = soundex12.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str13 = soundex0.soundex("hi!");
        java.lang.String str15 = soundex0.soundex("H000");
        java.lang.String str17 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("H000");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        int int17 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        java.lang.String str18 = soundex0.encode("H000");
        java.lang.String str20 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int14 = soundex11.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str16 = soundex11.encode("01230120022455012623010202");
        java.lang.String str18 = soundex11.encode("H000");
        int int21 = soundex11.difference("", "H000");
        soundex11.setMaxLength((int) (short) 1);
        java.lang.String str25 = soundex11.encode("");
        int int28 = soundex11.difference("H000", "01230120022455012623010202");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        int int14 = soundex1.getMaxLength();
        int int17 = soundex1.difference("H000", "hi!");
        java.lang.String str19 = soundex1.encode("H000");
        java.lang.String str21 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '#');
        java.lang.String str17 = soundex0.encode("H000");
        java.lang.String str19 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        int int8 = soundex0.difference("H000", "hi!");
        java.lang.String str10 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        int int13 = soundex0.difference("", "H000");
        java.lang.String str15 = soundex0.soundex("");
        int int18 = soundex0.difference("", "hi!");
        int int21 = soundex0.difference("", "hi!");
        int int24 = soundex0.difference("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        int int4 = soundex0.getMaxLength();
        int int5 = soundex0.getMaxLength();
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        soundex14.setMaxLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.soundex("01230120022455012623010202");
        soundex6.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("");
        soundex0.setMaxLength((int) ' ');
        int int11 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str14 = soundex12.encode("hi!");
        java.lang.String str16 = soundex12.soundex("hi!");
        int int19 = soundex12.difference("01230120022455012623010202", "H000");
        soundex12.setMaxLength(32);
        soundex12.setMaxLength(35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        java.lang.String str25 = soundex0.encode("hi!");
        soundex0.setMaxLength(52);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str30 = soundex28.encode("hi!");
        java.lang.String str32 = soundex28.encode("");
        java.lang.String str34 = soundex28.encode("H000");
        java.lang.String str36 = soundex28.soundex("01230120022455012623010202");
        soundex28.setMaxLength(0);
        java.lang.String str40 = soundex28.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex();
        int int42 = soundex41.getMaxLength();
        int int43 = soundex41.getMaxLength();
        java.lang.String str45 = soundex41.soundex("");
        soundex41.setMaxLength((int) (byte) 100);
        java.lang.String str49 = soundex41.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex50 = new org.apache.commons.codec.language.Soundex();
        int int51 = soundex50.getMaxLength();
        int int52 = soundex50.getMaxLength();
        java.lang.String str54 = soundex50.soundex("H000");
        java.lang.String str56 = soundex50.encode("H000");
        soundex50.setMaxLength((-1));
        java.lang.String str60 = soundex50.soundex("01230120022455012623010202");
        java.lang.String str62 = soundex50.encode("H000");
        java.lang.Object obj63 = soundex41.encode((java.lang.Object) str62);
        java.lang.Object obj64 = soundex28.encode((java.lang.Object) str62);
        int int67 = soundex28.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = soundex0.encode((java.lang.Object) int67);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H000" + "'", str40, "H000");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "H000" + "'", str49, "H000");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "H000" + "'", str54, "H000");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "H000" + "'", str56, "H000");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "H000" + "'", str62, "H000");
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "H000" + "'", obj63, "H000");
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + "H000" + "'", obj64, "H000");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        int int26 = soundex1.difference("H000", "H000");
        java.lang.String str28 = soundex1.encode("H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        org.apache.commons.codec.language.Soundex soundex26 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int27 = soundex26.getMaxLength();
        int int28 = soundex26.getMaxLength();
        int int31 = soundex26.difference("01230120022455012623010202", "");
        java.lang.Object obj32 = soundex0.encode((java.lang.Object) "");
        char[] charArray38 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex39 = new org.apache.commons.codec.language.Soundex(charArray38);
        org.apache.commons.codec.language.Soundex soundex40 = new org.apache.commons.codec.language.Soundex(charArray38);
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex(charArray38);
        org.apache.commons.codec.language.Soundex soundex42 = new org.apache.commons.codec.language.Soundex(charArray38);
        org.apache.commons.codec.language.Soundex soundex43 = new org.apache.commons.codec.language.Soundex(charArray38);
        java.lang.String str45 = soundex43.soundex("");
        int int46 = soundex43.getMaxLength();
        int int49 = soundex43.difference("", "01230120022455012623010202");
        java.lang.String str51 = soundex43.soundex("");
        java.lang.String str53 = soundex43.encode("01230120022455012623010202");
        int int54 = soundex43.getMaxLength();
        int int55 = soundex43.getMaxLength();
        int int56 = soundex43.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = soundex0.encode((java.lang.Object) soundex43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(soundex26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 4 + "'", int56 == 4);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.soundex("H000");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str17 = soundex0.soundex("hi!");
        int int20 = soundex0.difference("", "");
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex14.difference("H000", "");
        java.lang.String str19 = soundex14.encode("");
        java.lang.String str21 = soundex14.soundex("");
        java.lang.String str23 = soundex14.soundex("hi!");
        int int24 = soundex14.getMaxLength();
        int int25 = soundex14.getMaxLength();
        java.lang.String str27 = soundex14.encode("H000");
        int int28 = soundex14.getMaxLength();
        java.lang.String str30 = soundex14.soundex("H000");
        int int33 = soundex14.difference("01230120022455012623010202", "");
        java.lang.Object obj34 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        int int22 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.difference("", "");
        int int11 = soundex1.difference("", "");
        soundex1.setMaxLength((int) (byte) 0);
        java.lang.String str15 = soundex1.soundex("H000");
        int int18 = soundex1.difference("01230120022455012623010202", "H000");
        java.lang.String str20 = soundex1.soundex("H000");
        java.lang.String str22 = soundex1.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        int int13 = soundex0.difference("", "H000");
        java.lang.String str15 = soundex0.soundex("");
        int int18 = soundex0.difference("", "hi!");
        int int21 = soundex0.difference("", "hi!");
        soundex0.setMaxLength(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        int int11 = soundex0.difference("H000", "");
        int int14 = soundex0.difference("H000", "01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str23 = soundex0.soundex("");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(0);
        int int12 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) 100);
        soundex4.setMaxLength((int) '4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.encode("01230120022455012623010202");
        java.lang.String str13 = soundex1.encode("");
        java.lang.Class<?> wildcardClass14 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.soundex("H000");
        java.lang.String str11 = soundex0.encode("H000");
        int int12 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass13 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str8 = soundex1.soundex("");
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex10.setMaxLength(0);
        soundex10.setMaxLength((int) '4');
        soundex10.setMaxLength((int) ' ');
        char[] charArray21 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray21);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray21);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray21);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray21);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray21);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray21);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray21);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray21);
        java.lang.String str31 = soundex29.soundex("");
        java.lang.Object obj32 = soundex10.encode((java.lang.Object) "");
        int int35 = soundex10.difference("01230120022455012623010202", "hi!");
        java.lang.Object obj36 = soundex1.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "H000" + "'", obj36, "H000");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int10 = soundex0.difference("", "hi!");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.String str17 = soundex0.soundex("");
        int int20 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int12 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        int int17 = soundex0.getMaxLength();
        java.lang.String str19 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        int int18 = soundex0.difference("", "hi!");
        java.lang.String str20 = soundex0.encode("");
        soundex0.setMaxLength(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        org.apache.commons.codec.language.Soundex soundex20 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        int int25 = soundex20.difference("01230120022455012623010202", "");
        int int28 = soundex20.difference("01230120022455012623010202", "H000");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int30 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex();
        int int34 = soundex31.difference("H000", "");
        java.lang.String str36 = soundex31.encode("");
        java.lang.String str38 = soundex31.soundex("");
        java.lang.String str40 = soundex31.soundex("hi!");
        int int41 = soundex31.getMaxLength();
        int int42 = soundex31.getMaxLength();
        java.lang.String str44 = soundex31.soundex("H000");
        java.lang.String str46 = soundex31.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = soundex0.encode((java.lang.Object) soundex31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(soundex20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H000" + "'", str40, "H000");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "H000" + "'", str44, "H000");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "H000" + "'", str46, "H000");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
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
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int17 = soundex16.getMaxLength();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("hi!");
        soundex1.setMaxLength((int) 'a');
        java.lang.Class<?> wildcardClass6 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(52);
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        int int7 = soundex0.difference("hi!", "hi!");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str10 = soundex8.encode("hi!");
        int int13 = soundex8.difference("hi!", "01230120022455012623010202");
        java.lang.String str15 = soundex8.encode("H000");
        int int16 = soundex8.getMaxLength();
        soundex8.setMaxLength(35);
        int int21 = soundex8.difference("hi!", "01230120022455012623010202");
        soundex8.setMaxLength(52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("H000");
        int int2 = soundex1.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = soundex1.difference("hi!", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int17 = soundex0.difference("", "");
        int int20 = soundex0.difference("", "H000");
        java.lang.String str22 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("H000");
        int int17 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("");
        int int10 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '#');
        java.lang.String str14 = soundex1.soundex("H000");
        int int17 = soundex1.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int17 = soundex0.difference("H000", "hi!");
        int int20 = soundex0.difference("hi!", "H000");
        soundex0.setMaxLength(32);
        int int23 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("", "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("hi!", "H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        java.lang.String str19 = soundex15.soundex("hi!");
        java.lang.String str21 = soundex15.soundex("hi!");
        java.lang.String str23 = soundex15.soundex("01230120022455012623010202");
        int int26 = soundex15.difference("", "hi!");
        soundex15.setMaxLength(10);
        java.lang.String str30 = soundex15.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex0.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) -1);
        int int13 = soundex5.getMaxLength();
        java.lang.String str15 = soundex5.soundex("");
        java.lang.Class<?> wildcardClass16 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.String str16 = soundex0.encode("H000");
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        int int15 = soundex0.difference("hi!", "");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(52);
        java.lang.String str13 = soundex0.encode("hi!");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.soundex("H000");
        soundex0.setMaxLength(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        int int10 = soundex0.getMaxLength();
        int int13 = soundex0.difference("", "H000");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        soundex0.setMaxLength((int) (byte) 100);
        soundex0.setMaxLength((int) '#');
        int int22 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex23 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int24 = soundex23.getMaxLength();
        soundex23.setMaxLength(100);
        java.lang.String str28 = soundex23.soundex("H000");
        java.lang.Class<?> wildcardClass29 = soundex23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) wildcardClass29);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(soundex23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 100);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str16 = soundex14.encode("hi!");
        java.lang.String str18 = soundex14.encode("");
        java.lang.String str20 = soundex14.encode("H000");
        java.lang.String str22 = soundex14.soundex("01230120022455012623010202");
        soundex14.setMaxLength(0);
        java.lang.String str26 = soundex14.soundex("");
        java.lang.String str28 = soundex14.soundex("hi!");
        int int29 = soundex14.getMaxLength();
        soundex14.setMaxLength(1);
        char[] charArray37 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex38 = new org.apache.commons.codec.language.Soundex(charArray37);
        org.apache.commons.codec.language.Soundex soundex39 = new org.apache.commons.codec.language.Soundex(charArray37);
        int int40 = soundex39.getMaxLength();
        java.lang.String str42 = soundex39.encode("01230120022455012623010202");
        java.lang.String str44 = soundex39.soundex("");
        java.lang.String str46 = soundex39.soundex("");
        java.lang.Object obj47 = soundex14.encode((java.lang.Object) "");
        java.lang.String str49 = soundex14.soundex("hi!");
        java.lang.String str51 = soundex14.soundex("");
        java.lang.String str53 = soundex14.encode("H000");
        java.lang.Object obj54 = soundex0.encode((java.lang.Object) "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "" + "'", obj47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "H000" + "'", str49, "H000");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "H000" + "'", str53, "H000");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "H000" + "'", obj54, "H000");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int12 = soundex0.difference("01230120022455012623010202", "hi!");
        int int13 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 100);
        int int18 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        java.lang.String str14 = soundex7.soundex("");
        int int17 = soundex7.difference("", "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str22 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength(4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        int int13 = soundex0.getMaxLength();
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.soundex("hi!");
        int int19 = soundex0.difference("", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        java.lang.String str3 = soundex1.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str6 = soundex4.encode("hi!");
        java.lang.String str8 = soundex4.encode("");
        int int11 = soundex4.difference("", "H000");
        java.lang.String str13 = soundex4.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex4.soundex("");
        soundex4.setMaxLength(4);
        java.lang.String str19 = soundex4.encode("01230120022455012623010202");
        java.lang.Object obj20 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int14 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int2 = soundex1.getMaxLength();
        soundex1.setMaxLength(10);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.String str10 = soundex5.encode("");
        int int13 = soundex5.difference("H000", "H000");
        soundex5.setMaxLength((int) (short) 100);
        soundex5.setMaxLength((int) (short) -1);
        int int18 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex1.encode((java.lang.Object) soundex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex();
        int int25 = soundex24.getMaxLength();
        int int26 = soundex24.getMaxLength();
        soundex24.setMaxLength((int) (byte) -1);
        int int31 = soundex24.difference("H000", "H000");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        int int15 = soundex0.difference("hi!", "");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex16.getMaxLength();
        int int18 = soundex16.getMaxLength();
        java.lang.String str20 = soundex16.soundex("");
        soundex16.setMaxLength((int) (byte) 100);
        int int23 = soundex16.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) int23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.encode("01230120022455012623010202");
        java.lang.String str13 = soundex1.encode("");
        int int14 = soundex1.getMaxLength();
        int int15 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        soundex0.setMaxLength(4);
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex11.setMaxLength((int) (short) 100);
        soundex11.setMaxLength(97);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = soundex11.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int6 = soundex5.getMaxLength();
        int int7 = soundex5.getMaxLength();
        java.lang.String str9 = soundex5.soundex("hi!");
        java.lang.Object obj10 = soundex0.encode((java.lang.Object) "hi!");
        int int13 = soundex0.difference("", "");
        java.lang.String str15 = soundex0.encode("H000");
        soundex0.setMaxLength(0);
        int int18 = soundex0.getMaxLength();
        int int21 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str23 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        int int9 = soundex5.difference("", "01230120022455012623010202");
        soundex5.setMaxLength((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength(97);
        soundex0.setMaxLength((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) 'a');
        int int16 = soundex0.difference("H000", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        char[] charArray5 = new char[] { '4', '4', '#', '#', '#' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex7.setMaxLength(97);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex10.getMaxLength();
        int int12 = soundex10.getMaxLength();
        java.lang.String str14 = soundex10.encode("");
        soundex10.setMaxLength(0);
        soundex10.setMaxLength((int) (byte) 0);
        int int19 = soundex10.getMaxLength();
        soundex10.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex7.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4', '#', '#', '#' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("hi!", "hi!");
        java.lang.String str18 = soundex0.encode("hi!");
        java.lang.String str20 = soundex0.encode("hi!");
        soundex0.setMaxLength(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        int int17 = soundex0.difference("H000", "01230120022455012623010202");
        soundex0.setMaxLength(4);
        soundex0.setMaxLength(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        int int10 = soundex1.difference("H000", "");
        soundex1.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex1.soundex("");
        soundex1.setMaxLength((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength((int) (short) 100);
        int int6 = soundex1.difference("H000", "hi!");
        java.lang.String str8 = soundex1.encode("H000");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        java.lang.String str13 = soundex9.encode("");
        java.lang.String str15 = soundex9.encode("H000");
        java.lang.String str17 = soundex9.soundex("01230120022455012623010202");
        java.lang.String str19 = soundex9.soundex("H000");
        int int20 = soundex9.getMaxLength();
        int int23 = soundex9.difference("01230120022455012623010202", "hi!");
        java.lang.Object obj24 = soundex1.encode((java.lang.Object) "hi!");
        int int27 = soundex1.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H000" + "'", obj24, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = soundex1.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.soundex("hi!");
        int int15 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        int int18 = soundex0.getMaxLength();
        int int21 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex();
        int int24 = soundex23.getMaxLength();
        int int25 = soundex23.getMaxLength();
        java.lang.String str27 = soundex23.soundex("");
        java.lang.String str29 = soundex23.encode("H000");
        java.lang.Object obj30 = soundex22.encode((java.lang.Object) "H000");
        soundex22.setMaxLength((int) (byte) 0);
        java.lang.String str34 = soundex22.soundex("01230120022455012623010202");
        int int37 = soundex22.difference("", "");
        int int38 = soundex22.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex0.encode((java.lang.Object) soundex22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "H000" + "'", obj30, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str14 = soundex12.encode("");
        java.lang.String str16 = soundex12.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex12.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        int int14 = soundex0.getMaxLength();
        int int15 = soundex0.getMaxLength();
        int int18 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        char[] charArray6 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        soundex8.setMaxLength(1);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex8.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', '4', '4', '4' });
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("");
        int int11 = soundex1.getMaxLength();
        java.lang.String str13 = soundex1.encode("hi!");
        int int14 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(52);
        int int10 = soundex0.difference("hi!", "");
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        java.lang.String str14 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str11 = soundex9.encode("");
        soundex9.setMaxLength(97);
        java.lang.String str15 = soundex9.soundex("");
        java.lang.String str17 = soundex9.soundex("01230120022455012623010202");
        java.lang.String str19 = soundex9.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        java.lang.String str18 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("");
        int int10 = soundex0.difference("H000", "hi!");
        int int13 = soundex0.difference("H000", "H000");
        java.lang.String str15 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("H000");
        int int14 = soundex0.difference("hi!", "H000");
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex();
        int int4 = soundex3.getMaxLength();
        int int5 = soundex3.getMaxLength();
        java.lang.String str7 = soundex3.encode("");
        int int10 = soundex3.difference("H000", "");
        java.lang.String str12 = soundex3.encode("01230120022455012623010202");
        java.lang.Object obj13 = soundex0.encode((java.lang.Object) str12);
        int int16 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str18 = soundex0.soundex("hi!");
        java.lang.String str20 = soundex0.soundex("hi!");
        java.lang.String str22 = soundex0.encode("01230120022455012623010202");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength((int) 'a');
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int2 = soundex1.getMaxLength();
        int int5 = soundex1.difference("hi!", "01230120022455012623010202");
        int int8 = soundex1.difference("hi!", "H000");
        int int11 = soundex1.difference("H000", "H000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str12 = soundex10.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex10.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int6 = soundex1.getMaxLength();
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("");
        int int10 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '#');
        java.lang.String str14 = soundex1.encode("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
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
        soundex0.setMaxLength(0);
        java.lang.String str19 = soundex0.soundex("H000");
        int int22 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass12 = soundex11.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex10.difference("H000", "");
        java.lang.String str15 = soundex10.encode("");
        java.lang.String str17 = soundex10.soundex("");
        java.lang.String str19 = soundex10.encode("H000");
        java.lang.String str21 = soundex10.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode((java.lang.Object) soundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int9 = soundex1.getMaxLength();
        java.lang.String str11 = soundex1.encode("hi!");
        int int14 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        soundex5.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex15 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int16 = soundex15.getMaxLength();
        soundex15.setMaxLength((int) 'a');
        java.lang.String str20 = soundex15.soundex("H000");
        soundex15.setMaxLength(52);
        int int25 = soundex15.difference("H000", "01230120022455012623010202");
        java.lang.String str27 = soundex15.soundex("01230120022455012623010202");
        java.lang.Object obj28 = soundex5.encode((java.lang.Object) str27);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = soundex5.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(soundex15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        char[] charArray6 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        soundex10.setMaxLength(1);
        char[] charArray18 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        int int21 = soundex20.getMaxLength();
        java.lang.String str23 = soundex20.encode("01230120022455012623010202");
        int int24 = soundex20.getMaxLength();
        int int25 = soundex20.getMaxLength();
        int int26 = soundex20.getMaxLength();
        java.lang.String str28 = soundex20.encode("01230120022455012623010202");
        java.lang.Object obj29 = soundex10.encode((java.lang.Object) "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex();
        int int33 = soundex30.difference("H000", "");
        java.lang.String str35 = soundex30.encode("");
        java.lang.String str37 = soundex30.soundex("");
        java.lang.String str39 = soundex30.soundex("hi!");
        int int40 = soundex30.getMaxLength();
        int int41 = soundex30.getMaxLength();
        java.lang.String str43 = soundex30.encode("H000");
        org.apache.commons.codec.language.Soundex soundex45 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int48 = soundex45.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str50 = soundex45.encode("01230120022455012623010202");
        java.lang.String str52 = soundex45.encode("H000");
        java.lang.String str54 = soundex45.encode("01230120022455012623010202");
        java.lang.Object obj55 = soundex30.encode((java.lang.Object) str54);
        java.lang.String str57 = soundex30.soundex("H000");
        int int58 = soundex30.getMaxLength();
        int int59 = soundex30.getMaxLength();
        java.lang.String str61 = soundex30.soundex("");
        java.lang.Object obj62 = soundex10.encode((java.lang.Object) str61);
        int int65 = soundex10.difference("", "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', '4', '4', '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H000" + "'", str39, "H000");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H000" + "'", str43, "H000");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "H000" + "'", str52, "H000");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "" + "'", obj55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "H000" + "'", str57, "H000");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "" + "'", obj62, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        int int12 = soundex0.difference("", "hi!");
        java.lang.String str14 = soundex0.soundex("");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        char[] charArray22 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray22);
        soundex25.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.soundex("");
        java.lang.String str16 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.encode("");
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str15 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("hi!");
        java.lang.String str15 = soundex0.encode("hi!");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        java.lang.String str32 = soundex1.encode("H000");
        soundex1.setMaxLength((-1));
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
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("H000");
        int int10 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        int int15 = soundex0.difference("H000", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        int int9 = soundex0.difference("hi!", "");
        java.lang.String str11 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        soundex0.setMaxLength(52);
        int int16 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength(1);
        soundex4.setMaxLength(100);
        int int10 = soundex4.getMaxLength();
        int int11 = soundex4.getMaxLength();
        java.lang.Class<?> wildcardClass12 = soundex4.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str16 = soundex0.encode("H000");
        int int17 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        int int20 = soundex18.getMaxLength();
        soundex18.setMaxLength((int) (byte) -1);
        soundex18.setMaxLength((int) (short) 10);
        int int27 = soundex18.difference("", "hi!");
        java.lang.String str29 = soundex18.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) 'a');
        int int16 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        int int11 = soundex6.getMaxLength();
        int int12 = soundex6.getMaxLength();
        java.lang.String str14 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("H000");
        int int14 = soundex0.difference("hi!", "H000");
        soundex0.setMaxLength((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        int int10 = soundex5.getMaxLength();
        int int11 = soundex5.getMaxLength();
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength((int) (short) 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.soundex("hi!");
        int int19 = soundex0.difference("H000", "H000");
        java.lang.String str21 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex22.getMaxLength();
        int int24 = soundex22.getMaxLength();
        java.lang.String str26 = soundex22.encode("");
        int int29 = soundex22.difference("H000", "");
        int int32 = soundex22.difference("H000", "");
        int int35 = soundex22.difference("01230120022455012623010202", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) soundex22);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        int int18 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int19 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str24 = soundex22.encode("hi!");
        int int27 = soundex22.difference("hi!", "01230120022455012623010202");
        java.lang.String str29 = soundex22.soundex("");
        java.lang.String str31 = soundex22.soundex("hi!");
        java.lang.String str33 = soundex22.encode("hi!");
        int int34 = soundex22.getMaxLength();
        java.lang.String str36 = soundex22.encode("hi!");
        soundex22.setMaxLength(4);
        soundex22.setMaxLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = soundex0.encode((java.lang.Object) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        int int18 = soundex0.difference("01230120022455012623010202", "hi!");
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str19 = soundex17.encode("hi!");
        java.lang.String str21 = soundex17.soundex("hi!");
        soundex17.setMaxLength((int) (short) 10);
        java.lang.String str25 = soundex17.encode("01230120022455012623010202");
        int int26 = soundex17.getMaxLength();
        java.lang.String str28 = soundex17.encode("");
        java.lang.String str30 = soundex17.soundex("01230120022455012623010202");
        soundex17.setMaxLength((int) (short) 100);
        soundex17.setMaxLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex0.encode((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        soundex0.setMaxLength((int) '#');
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int16 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str18 = soundex0.encode("H000");
        soundex0.setMaxLength(4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        int int16 = soundex0.difference("hi!", "hi!");
        java.lang.String str18 = soundex0.soundex("H000");
        soundex0.setMaxLength(97);
        int int23 = soundex0.difference("", "hi!");
        java.lang.String str25 = soundex0.encode("");
        soundex0.setMaxLength((int) '4');
        int int28 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str13 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex15.setMaxLength(4);
        int int18 = soundex15.getMaxLength();
        java.lang.String str20 = soundex15.encode("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        int int10 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        int int18 = soundex13.difference("01230120022455012623010202", "H000");
        java.lang.String str20 = soundex13.soundex("");
        soundex13.setMaxLength((int) (byte) 0);
        soundex13.setMaxLength((int) (short) 100);
        java.lang.String str26 = soundex13.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass27 = soundex13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode((java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex5.encode("");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex12.difference("H000", "");
        java.lang.String str17 = soundex12.encode("");
        java.lang.String str19 = soundex12.soundex("");
        java.lang.String str21 = soundex12.soundex("hi!");
        soundex12.setMaxLength((int) (short) 0);
        java.lang.String str25 = soundex12.soundex("01230120022455012623010202");
        java.lang.String str27 = soundex12.soundex("hi!");
        java.lang.String str29 = soundex12.soundex("hi!");
        java.lang.String str31 = soundex12.encode("01230120022455012623010202");
        int int32 = soundex12.getMaxLength();
        java.lang.String str34 = soundex12.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex5.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("", "01230120022455012623010202");
        int int13 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.encode("01230120022455012623010202");
        soundex1.setMaxLength(10);
        java.lang.String str15 = soundex1.soundex("01230120022455012623010202");
        int int18 = soundex1.difference("H000", "01230120022455012623010202");
        int int21 = soundex1.difference("", "hi!");
        int int24 = soundex1.difference("", "");
        java.lang.String str26 = soundex1.encode("H000");
        int int27 = soundex1.getMaxLength();
        int int28 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
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
        char[] charArray23 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        int int26 = soundex25.getMaxLength();
        java.lang.String str28 = soundex25.encode("01230120022455012623010202");
        java.lang.String str30 = soundex25.soundex("");
        java.lang.String str32 = soundex25.soundex("");
        java.lang.Object obj33 = soundex0.encode((java.lang.Object) "");
        java.lang.String str35 = soundex0.soundex("hi!");
        java.lang.String str37 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int14 = soundex13.getMaxLength();
        int int15 = soundex13.getMaxLength();
        java.lang.String str17 = soundex13.encode("hi!");
        java.lang.String str19 = soundex13.encode("H000");
        java.lang.String str21 = soundex13.encode("");
        java.lang.String str23 = soundex13.soundex("hi!");
        java.lang.String str25 = soundex13.soundex("");
        int int26 = soundex13.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex9.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        int int10 = soundex1.difference("H000", "");
        soundex1.setMaxLength((int) (short) -1);
        int int13 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("H000");
        int int18 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex19 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int20 = soundex19.getMaxLength();
        soundex19.setMaxLength((int) 'a');
        java.lang.String str24 = soundex19.soundex("H000");
        soundex19.setMaxLength(52);
        int int29 = soundex19.difference("H000", "01230120022455012623010202");
        java.lang.String str31 = soundex19.encode("H000");
        java.lang.Object obj32 = soundex0.encode((java.lang.Object) str31);
        soundex0.setMaxLength(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(soundex19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H000" + "'", obj32, "H000");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str14 = soundex12.encode("");
        java.lang.String str16 = soundex12.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int7 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str12 = soundex10.soundex("");
        int int13 = soundex10.getMaxLength();
        int int16 = soundex10.difference("", "01230120022455012623010202");
        int int17 = soundex10.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = soundex10.difference("hi!", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        char[] charArray23 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        int int26 = soundex25.getMaxLength();
        java.lang.String str28 = soundex25.encode("01230120022455012623010202");
        java.lang.String str30 = soundex25.soundex("");
        java.lang.String str32 = soundex25.soundex("");
        java.lang.Object obj33 = soundex0.encode((java.lang.Object) "");
        java.lang.String str35 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        soundex6.setMaxLength((int) ' ');
        java.lang.String str12 = soundex6.encode("01230120022455012623010202");
        int int13 = soundex6.getMaxLength();
        int int14 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("hi!");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        int int15 = soundex0.difference("hi!", "hi!");
        int int16 = soundex0.getMaxLength();
        int int19 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) '#');
        int int13 = soundex0.getMaxLength();
        int int14 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        int int16 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        int int11 = soundex0.difference("H000", "hi!");
        java.lang.String str13 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
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
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex16.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
        java.lang.String str25 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.encode("hi!");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.String str16 = soundex0.soundex("");
        int int17 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex18.difference("H000", "");
        java.lang.String str23 = soundex18.encode("");
        int int26 = soundex18.difference("H000", "H000");
        int int29 = soundex18.difference("H000", "01230120022455012623010202");
        java.lang.String str31 = soundex18.soundex("01230120022455012623010202");
        java.lang.String str33 = soundex18.encode("01230120022455012623010202");
        java.lang.Object obj34 = soundex0.encode((java.lang.Object) str33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 0);
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        java.lang.String str25 = soundex1.encode("H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex9.setMaxLength(52);
        int int14 = soundex9.difference("hi!", "01230120022455012623010202");
        java.lang.String str16 = soundex9.soundex("H000");
        int int17 = soundex9.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex0.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        int int15 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int7 = soundex0.difference("H000", "hi!");
        java.lang.String str9 = soundex0.encode("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        int int16 = soundex0.difference("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("hi!");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(1);
        int int15 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(4);
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        int int28 = soundex0.difference("hi!", "");
        soundex0.setMaxLength(1);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int7 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) (byte) 0);
        java.lang.String str11 = soundex6.soundex("");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        soundex12.setMaxLength((int) '#');
        java.lang.String str16 = soundex12.encode("01230120022455012623010202");
        int int19 = soundex12.difference("H000", "H000");
        soundex12.setMaxLength(1);
        soundex12.setMaxLength((int) (byte) 0);
        java.lang.String str25 = soundex12.encode("hi!");
        java.lang.String str27 = soundex12.encode("01230120022455012623010202");
        java.lang.Object obj28 = soundex6.encode((java.lang.Object) str27);
        int int29 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        soundex0.setMaxLength(0);
        int int33 = soundex0.difference("", "");
        java.lang.String str35 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength(10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        java.lang.String str10 = soundex0.encode("");
        char[] charArray15 = new char[] { 'a', '4', '#', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex0.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', '4', '#', '4' });
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        soundex12.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex7.difference("H000", "");
        int int11 = soundex7.getMaxLength();
        java.lang.String str13 = soundex7.soundex("hi!");
        soundex7.setMaxLength((int) (short) -1);
        soundex7.setMaxLength(10);
        int int20 = soundex7.difference("", "hi!");
        int int23 = soundex7.difference("hi!", "hi!");
        java.lang.String str25 = soundex7.encode("hi!");
        java.lang.String str27 = soundex7.encode("hi!");
        java.lang.Object obj28 = soundex0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H000" + "'", obj28, "H000");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str20 = soundex18.encode("");
        java.lang.String str22 = soundex18.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = soundex18.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (byte) 1);
        int int11 = soundex6.difference("01230120022455012623010202", "");
        java.lang.String str13 = soundex6.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        char[] charArray1 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray1);
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        int int11 = soundex6.difference("", "");
        java.lang.Class<?> wildcardClass12 = soundex6.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int15 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(97);
        java.lang.String str7 = soundex0.encode("");
        int int8 = soundex0.getMaxLength();
        char[] charArray11 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        soundex12.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.soundex("H000");
        java.lang.String str21 = soundex15.encode("H000");
        soundex15.setMaxLength((-1));
        java.lang.String str25 = soundex15.soundex("01230120022455012623010202");
        int int28 = soundex15.difference("H000", "");
        java.lang.String str30 = soundex15.encode("H000");
        java.lang.String str32 = soundex15.soundex("01230120022455012623010202");
        java.lang.Object obj33 = soundex12.encode((java.lang.Object) "01230120022455012623010202");
        soundex12.setMaxLength(10);
        java.lang.String str37 = soundex12.encode("01230120022455012623010202");
        soundex12.setMaxLength(97);
        java.lang.String str41 = soundex12.encode("01230120022455012623010202");
        java.lang.Object obj42 = soundex0.encode((java.lang.Object) str41);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 0);
        int int16 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.encode("H000");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex14 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int15 = soundex14.getMaxLength();
        int int16 = soundex14.getMaxLength();
        int int17 = soundex14.getMaxLength();
        java.lang.String str19 = soundex14.encode("H000");
        int int20 = soundex14.getMaxLength();
        java.lang.String str22 = soundex14.encode("hi!");
        java.lang.String str24 = soundex14.soundex("");
        java.lang.Object obj25 = soundex0.encode((java.lang.Object) "");
        int int28 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(soundex14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        soundex1.setMaxLength(35);
        java.lang.String str17 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int14 = soundex0.difference("", "hi!");
        int int15 = soundex0.getMaxLength();
        soundex0.setMaxLength(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("");
        char[] charArray11 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.soundex("01230120022455012623010202");
        java.lang.Object obj15 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str17 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(0);
        soundex4.setMaxLength((int) (byte) 0);
        soundex4.setMaxLength(4);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        int int11 = soundex6.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex6.getMaxLength();
        int int13 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        int int16 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex17.getMaxLength();
        int int19 = soundex17.getMaxLength();
        java.lang.String str21 = soundex17.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex22.getMaxLength();
        int int24 = soundex22.getMaxLength();
        java.lang.String str26 = soundex22.soundex("hi!");
        java.lang.Object obj27 = soundex17.encode((java.lang.Object) "hi!");
        int int30 = soundex17.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Object obj31 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex6.difference("H000", "");
        java.lang.String str11 = soundex6.encode("");
        int int14 = soundex6.difference("H000", "H000");
        soundex6.setMaxLength((int) (short) 100);
        soundex6.setMaxLength((int) (short) -1);
        int int19 = soundex6.getMaxLength();
        int int22 = soundex6.difference("H000", "H000");
        int int23 = soundex6.getMaxLength();
        java.lang.Class<?> wildcardClass24 = soundex6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex5.encode((java.lang.Object) soundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
        soundex0.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex21 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str23 = soundex21.soundex("");
        java.lang.String str25 = soundex21.encode("01230120022455012623010202");
        java.lang.String str27 = soundex21.encode("01230120022455012623010202");
        int int30 = soundex21.difference("hi!", "");
        org.apache.commons.codec.language.Soundex soundex31 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int32 = soundex31.getMaxLength();
        java.lang.String str34 = soundex31.soundex("01230120022455012623010202");
        java.lang.String str36 = soundex31.soundex("01230120022455012623010202");
        java.lang.String str38 = soundex31.soundex("H000");
        java.lang.Object obj39 = soundex21.encode((java.lang.Object) "H000");
        java.lang.Object obj40 = soundex0.encode((java.lang.Object) "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(soundex21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(soundex31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "H000" + "'", obj39, "H000");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "H000" + "'", obj40, "H000");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        soundex0.setMaxLength((int) '#');
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(4);
        java.lang.String str17 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        int int20 = soundex18.getMaxLength();
        java.lang.String str22 = soundex18.encode("hi!");
        java.lang.String str24 = soundex18.encode("H000");
        java.lang.String str26 = soundex18.encode("");
        java.lang.String str28 = soundex18.soundex("hi!");
        java.lang.String str30 = soundex18.soundex("H000");
        soundex18.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex0.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        int int6 = soundex0.difference("H000", "");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.String str12 = soundex0.soundex("hi!");
        java.lang.String str14 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        int int14 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex7.setMaxLength((int) 'a');
        int int12 = soundex7.difference("01230120022455012623010202", "01230120022455012623010202");
        int int15 = soundex7.difference("01230120022455012623010202", "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = soundex7.difference("01230120022455012623010202", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        java.lang.String str36 = soundex32.soundex("01230120022455012623010202");
        java.lang.String str38 = soundex32.soundex("");
        java.lang.String str40 = soundex32.encode("");
        int int41 = soundex32.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = soundex0.encode((java.lang.Object) int41);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        soundex0.setMaxLength((int) (short) 100);
        int int22 = soundex0.getMaxLength();
        int int25 = soundex0.difference("01230120022455012623010202", "");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.encode("");
        char[] charArray15 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray15);
        int int24 = soundex23.getMaxLength();
        int int27 = soundex23.difference("", "");
        java.lang.Object obj28 = soundex5.encode((java.lang.Object) "");
        int int31 = soundex5.difference("", "");
        java.lang.Class<?> wildcardClass32 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.difference("", "");
        int int11 = soundex1.difference("", "");
        soundex1.setMaxLength((int) (byte) 0);
        java.lang.String str15 = soundex1.soundex("H000");
        int int18 = soundex1.difference("01230120022455012623010202", "H000");
        soundex1.setMaxLength((int) (short) 10);
        soundex1.setMaxLength((int) (byte) 1);
        java.lang.String str24 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("");
        java.lang.String str6 = soundex0.encode("H000");
        int int9 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex11.setMaxLength(0);
        soundex11.setMaxLength((int) '4');
        int int16 = soundex11.getMaxLength();
        int int17 = soundex11.getMaxLength();
        java.lang.String str19 = soundex11.soundex("");
        java.lang.Object obj20 = soundex0.encode((java.lang.Object) str19);
        int int23 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int26 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int12 = soundex0.difference("", "H000");
        int int15 = soundex0.difference("hi!", "hi!");
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        java.lang.String str20 = soundex15.encode("");
        java.lang.String str22 = soundex15.soundex("");
        java.lang.String str24 = soundex15.soundex("hi!");
        int int25 = soundex15.getMaxLength();
        java.lang.String str27 = soundex15.encode("01230120022455012623010202");
        int int30 = soundex15.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str32 = soundex15.encode("H000");
        java.lang.Object obj33 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength(0);
        java.lang.String str37 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H000" + "'", obj33, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(32);
        soundex0.setMaxLength((int) (byte) 100);
        int int14 = soundex0.difference("H000", "01230120022455012623010202");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        soundex1.setMaxLength(32);
        org.apache.commons.codec.language.Soundex soundex40 = new org.apache.commons.codec.language.Soundex();
        int int41 = soundex40.getMaxLength();
        int int42 = soundex40.getMaxLength();
        java.lang.String str44 = soundex40.soundex("H000");
        java.lang.String str46 = soundex40.encode("H000");
        soundex40.setMaxLength((-1));
        java.lang.String str50 = soundex40.soundex("01230120022455012623010202");
        int int53 = soundex40.difference("H000", "");
        int int54 = soundex40.getMaxLength();
        java.lang.String str56 = soundex40.encode("");
        org.apache.commons.codec.language.Soundex soundex57 = new org.apache.commons.codec.language.Soundex();
        int int60 = soundex57.difference("H000", "");
        java.lang.String str62 = soundex57.encode("");
        java.lang.String str64 = soundex57.soundex("");
        java.lang.String str66 = soundex57.encode("H000");
        int int69 = soundex57.difference("", "");
        int int72 = soundex57.difference("", "01230120022455012623010202");
        java.lang.Object obj73 = soundex40.encode((java.lang.Object) "");
        java.lang.String str75 = soundex40.soundex("");
        org.apache.commons.codec.language.Soundex soundex76 = new org.apache.commons.codec.language.Soundex();
        int int79 = soundex76.difference("H000", "");
        java.lang.String str81 = soundex76.soundex("H000");
        int int82 = soundex76.getMaxLength();
        java.lang.String str84 = soundex76.encode("");
        java.lang.Object obj85 = soundex40.encode((java.lang.Object) "");
        java.lang.String str87 = soundex40.encode("H000");
        java.lang.Object obj88 = soundex1.encode((java.lang.Object) "H000");
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "H000" + "'", str44, "H000");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "H000" + "'", str46, "H000");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "H000" + "'", str66, "H000");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + "" + "'", obj73, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "H000" + "'", str81, "H000");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + "" + "'", obj85, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "H000" + "'", str87, "H000");
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + "H000" + "'", obj88, "H000");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        soundex6.setMaxLength((int) ' ');
        java.lang.String str12 = soundex6.encode("01230120022455012623010202");
        soundex6.setMaxLength(52);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = soundex6.difference("H000", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int14 = soundex0.difference("", "hi!");
        int int17 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex12.setMaxLength((int) 'a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
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
        java.lang.String str24 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int12 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        int int14 = soundex0.difference("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        soundex1.setMaxLength(35);
        soundex1.setMaxLength((int) (byte) 100);
        soundex1.setMaxLength(0);
        int int22 = soundex1.difference("hi!", "hi!");
        int int25 = soundex1.difference("", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength(100);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        java.lang.String str18 = soundex13.encode("");
        int int21 = soundex13.difference("H000", "H000");
        soundex13.setMaxLength((int) (short) 100);
        soundex13.setMaxLength((int) (short) -1);
        int int28 = soundex13.difference("", "hi!");
        int int29 = soundex13.getMaxLength();
        java.lang.String str31 = soundex13.encode("");
        java.lang.String str33 = soundex13.soundex("H000");
        int int34 = soundex13.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex9.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex9.difference("H000", "");
        java.lang.String str14 = soundex9.encode("");
        java.lang.String str16 = soundex9.soundex("");
        java.lang.String str18 = soundex9.soundex("hi!");
        int int19 = soundex9.getMaxLength();
        java.lang.String str21 = soundex9.encode("01230120022455012623010202");
        java.lang.String str23 = soundex9.soundex("H000");
        java.lang.Object obj24 = soundex0.encode((java.lang.Object) "H000");
        int int25 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex();
        int int27 = soundex26.getMaxLength();
        int int28 = soundex26.getMaxLength();
        java.lang.String str30 = soundex26.encode("hi!");
        java.lang.String str32 = soundex26.encode("H000");
        java.lang.String str34 = soundex26.encode("");
        java.lang.String str36 = soundex26.soundex("hi!");
        java.lang.String str38 = soundex26.soundex("H000");
        soundex26.setMaxLength(0);
        soundex26.setMaxLength((int) (byte) 100);
        soundex26.setMaxLength((int) '4');
        java.lang.String str46 = soundex26.encode("01230120022455012623010202");
        int int47 = soundex26.getMaxLength();
        soundex26.setMaxLength((int) '4');
        java.lang.String str51 = soundex26.encode("hi!");
        java.lang.Object obj52 = soundex0.encode((java.lang.Object) str51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H000" + "'", obj24, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "H000" + "'", str51, "H000");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "H000" + "'", obj52, "H000");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.encode("");
        int int10 = soundex0.difference("hi!", "01230120022455012623010202");
        int int13 = soundex0.difference("H000", "");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        java.lang.String str14 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) 0);
        soundex0.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        soundex6.setMaxLength((int) (short) -1);
        int int11 = soundex6.getMaxLength();
        java.lang.String str13 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        int int17 = soundex0.difference("hi!", "hi!");
        java.lang.String str19 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.soundex("hi!");
        int int18 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str21 = soundex19.encode("hi!");
        java.lang.String str23 = soundex19.encode("");
        java.lang.String str25 = soundex19.encode("H000");
        java.lang.String str27 = soundex19.soundex("01230120022455012623010202");
        java.lang.String str29 = soundex19.encode("01230120022455012623010202");
        java.lang.String str31 = soundex19.soundex("");
        int int34 = soundex19.difference("", "01230120022455012623010202");
        int int35 = soundex19.getMaxLength();
        java.lang.Class<?> wildcardClass36 = soundex19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex0.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass8 = soundex7.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("", "");
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
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
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
        java.lang.String str33 = soundex0.encode("H000");
        java.lang.String str35 = soundex0.encode("H000");
        soundex0.setMaxLength(0);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(52);
        int int6 = soundex1.difference("hi!", "01230120022455012623010202");
        java.lang.String str8 = soundex1.soundex("H000");
        soundex1.setMaxLength(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int12 = soundex9.difference("01230120022455012623010202", "");
        int int13 = soundex9.getMaxLength();
        java.lang.String str15 = soundex9.encode("01230120022455012623010202");
        java.lang.String str17 = soundex9.soundex("");
        java.lang.String str19 = soundex9.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        soundex7.setMaxLength(0);
        int int15 = soundex7.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("", "");
        soundex0.setMaxLength(1);
        java.lang.String str19 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str23 = soundex0.encode("");
        int int26 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.Object obj27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode(obj27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        java.lang.String str10 = soundex6.soundex("01230120022455012623010202");
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex6.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("H000");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        soundex18.setMaxLength((int) '#');
        java.lang.String str22 = soundex18.encode("01230120022455012623010202");
        int int25 = soundex18.difference("H000", "H000");
        int int28 = soundex18.difference("H000", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) int28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
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
        java.lang.String str25 = soundex0.encode("");
        java.lang.String str27 = soundex0.soundex("hi!");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.soundex("");
        int int16 = soundex0.difference("hi!", "");
        java.lang.String str18 = soundex0.soundex("");
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("hi!", "hi!");
        soundex0.setMaxLength((int) (byte) -1);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int22 = soundex19.difference("H000", "");
        int int23 = soundex19.getMaxLength();
        java.lang.String str25 = soundex19.soundex("hi!");
        soundex19.setMaxLength((int) (short) -1);
        soundex19.setMaxLength(10);
        int int32 = soundex19.difference("", "hi!");
        int int35 = soundex19.difference("01230120022455012623010202", "");
        java.lang.String str37 = soundex19.encode("");
        java.lang.Object obj38 = soundex0.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass39 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        org.apache.commons.codec.language.Soundex soundex26 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int27 = soundex26.getMaxLength();
        int int28 = soundex26.getMaxLength();
        int int31 = soundex26.difference("01230120022455012623010202", "");
        java.lang.Object obj32 = soundex0.encode((java.lang.Object) "");
        java.lang.String str34 = soundex0.encode("");
        java.lang.Class<?> wildcardClass35 = soundex0.getClass();
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
        org.junit.Assert.assertNotNull(soundex26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        int int17 = soundex0.difference("H000", "01230120022455012623010202");
        int int20 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str22 = soundex0.encode("");
        java.lang.String str24 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.soundex("hi!");
        int int20 = soundex0.difference("H000", "");
        char[] charArray25 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray25);
        int int34 = soundex33.getMaxLength();
        int int37 = soundex33.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = soundex0.encode((java.lang.Object) soundex33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        int int9 = soundex0.difference("hi!", "");
        java.lang.String str11 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        char[] charArray20 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray20);
        soundex27.setMaxLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) soundex27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "H000" + "'", obj15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) 'a');
        java.lang.String str20 = soundex0.soundex("hi!");
        java.lang.String str22 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("", "hi!");
        java.lang.String str17 = soundex0.encode("hi!");
        int int20 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        int int9 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex1.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("hi!");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        int int22 = soundex0.difference("H000", "H000");
        java.lang.String str24 = soundex0.encode("");
        soundex0.setMaxLength(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        int int13 = soundex0.getMaxLength();
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.soundex("hi!");
        int int19 = soundex0.difference("", "01230120022455012623010202");
        int int22 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength((int) 'a');
        int int7 = soundex0.getMaxLength();
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int11 = soundex10.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        int int18 = soundex0.difference("H000", "hi!");
        java.lang.String str20 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str17 = soundex0.encode("hi!");
        java.lang.String str19 = soundex0.soundex("hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
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
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex17.getMaxLength();
        int int19 = soundex17.getMaxLength();
        java.lang.String str21 = soundex17.encode("hi!");
        java.lang.String str23 = soundex17.encode("H000");
        java.lang.String str25 = soundex17.soundex("hi!");
        java.lang.String str27 = soundex17.soundex("01230120022455012623010202");
        java.lang.Object obj28 = soundex0.encode((java.lang.Object) str27);
        soundex0.setMaxLength((int) (byte) 100);
        soundex0.setMaxLength((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex6.setMaxLength((int) (short) -1);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex9.difference("H000", "");
        int int13 = soundex9.getMaxLength();
        java.lang.String str15 = soundex9.soundex("hi!");
        soundex9.setMaxLength((int) (short) -1);
        soundex9.setMaxLength(10);
        java.lang.String str21 = soundex9.encode("01230120022455012623010202");
        java.lang.Object obj22 = soundex6.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str24 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
        int int15 = soundex14.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (byte) 0);
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        int int15 = soundex0.difference("H000", "H000");
        int int18 = soundex0.difference("hi!", "H000");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int23 = soundex20.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str25 = soundex20.encode("01230120022455012623010202");
        java.lang.String str27 = soundex20.encode("H000");
        int int30 = soundex20.difference("", "H000");
        soundex20.setMaxLength((int) (short) 1);
        int int35 = soundex20.difference("01230120022455012623010202", "H000");
        int int38 = soundex20.difference("", "");
        java.lang.Object obj39 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str23 = soundex21.encode("hi!");
        java.lang.String str25 = soundex21.encode("");
        java.lang.String str27 = soundex21.encode("H000");
        java.lang.String str29 = soundex21.soundex("01230120022455012623010202");
        soundex21.setMaxLength(0);
        java.lang.String str33 = soundex21.soundex("");
        java.lang.String str35 = soundex21.soundex("hi!");
        java.lang.String str37 = soundex21.encode("");
        java.lang.Object obj38 = soundex0.encode((java.lang.Object) str37);
        int int41 = soundex0.difference("01230120022455012623010202", "");
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("hi!");
        java.lang.String str6 = soundex1.soundex("hi!");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        int int11 = soundex1.difference("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        int int8 = soundex0.difference("H000", "hi!");
        java.lang.String str10 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        int int15 = soundex0.difference("", "H000");
        java.lang.String str17 = soundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength(100);
        java.lang.String str15 = soundex0.encode("H000");
        int int16 = soundex0.getMaxLength();
        int int17 = soundex0.getMaxLength();
        java.lang.String str19 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str15 = soundex13.encode("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str17 = soundex0.encode("");
        int int20 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        int int22 = soundex0.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        int int22 = soundex0.difference("hi!", "01230120022455012623010202");
        int int25 = soundex0.difference("H000", "");
        java.lang.String str27 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex18.difference("H000", "");
        int int22 = soundex18.getMaxLength();
        int int23 = soundex18.getMaxLength();
        java.lang.String str25 = soundex18.soundex("01230120022455012623010202");
        java.lang.Object obj26 = soundex0.encode((java.lang.Object) str25);
        soundex0.setMaxLength((int) 'a');
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex();
        int int30 = soundex29.getMaxLength();
        int int31 = soundex29.getMaxLength();
        soundex29.setMaxLength((int) (byte) -1);
        java.lang.String str35 = soundex29.soundex("H000");
        soundex29.setMaxLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = soundex0.encode((java.lang.Object) soundex29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str4 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        char[] charArray4 = new char[] { 'a', '4', '#', '4' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '#', '4' });
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        soundex0.setMaxLength(10);
        java.lang.String str14 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 100);
        int int17 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str19 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str19 = soundex0.encode("hi!");
        int int22 = soundex0.difference("H000", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        int int16 = soundex0.difference("", "");
        java.lang.String str18 = soundex0.soundex("");
        java.lang.String str20 = soundex0.encode("01230120022455012623010202");
        char[] charArray23 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray23);
        soundex28.setMaxLength((int) 'a');
        int int33 = soundex28.difference("01230120022455012623010202", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex28);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength(97);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(4);
        int int18 = soundex0.difference("H000", "");
        int int21 = soundex0.difference("H000", "H000");
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int26 = soundex23.difference("01230120022455012623010202", "01230120022455012623010202");
        int int27 = soundex23.getMaxLength();
        char[] charArray30 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray30);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray30);
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray30);
        org.apache.commons.codec.language.Soundex soundex34 = new org.apache.commons.codec.language.Soundex(charArray30);
        soundex34.setMaxLength((int) (short) -1);
        org.apache.commons.codec.language.Soundex soundex37 = new org.apache.commons.codec.language.Soundex();
        int int40 = soundex37.difference("H000", "");
        int int41 = soundex37.getMaxLength();
        java.lang.String str43 = soundex37.soundex("hi!");
        soundex37.setMaxLength((int) (short) -1);
        soundex37.setMaxLength(10);
        java.lang.String str49 = soundex37.encode("01230120022455012623010202");
        java.lang.Object obj50 = soundex34.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.Object obj51 = soundex23.encode(obj50);
        java.lang.Object obj52 = soundex0.encode(obj51);
        java.lang.String str54 = soundex0.encode("H000");
        java.lang.String str56 = soundex0.encode("H000");
        java.lang.String str58 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H000" + "'", str43, "H000");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "" + "'", obj51, "");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "" + "'", obj52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "H000" + "'", str54, "H000");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "H000" + "'", str56, "H000");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str15 = soundex0.soundex("");
        java.lang.String str17 = soundex0.encode("H000");
        java.lang.String str19 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        int int14 = soundex0.difference("hi!", "hi!");
        java.lang.String str16 = soundex0.encode("H000");
        int int19 = soundex0.difference("hi!", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("hi!");
        java.lang.String str6 = soundex1.soundex("hi!");
        int int9 = soundex1.difference("", "H000");
        int int12 = soundex1.difference("", "H000");
        soundex1.setMaxLength(0);
        java.lang.String str16 = soundex1.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.soundex("hi!");
        int int15 = soundex0.difference("hi!", "hi!");
        java.lang.String str17 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        java.lang.String str13 = soundex1.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex1.soundex("hi!");
        int int16 = soundex1.getMaxLength();
        java.lang.String str18 = soundex1.soundex("");
        java.lang.String str20 = soundex1.soundex("H000");
        java.lang.String str22 = soundex1.encode("01230120022455012623010202");
        int int25 = soundex1.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        int int14 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        soundex0.setMaxLength(35);
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.difference("H000", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(1);
        java.lang.String str11 = soundex0.encode("H000");
        int int14 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex0.setMaxLength((int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        int int13 = soundex11.getMaxLength();
        java.lang.String str15 = soundex11.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        java.lang.Object obj20 = soundex11.encode((java.lang.Object) "H000");
        java.lang.String str22 = soundex11.soundex("");
        int int25 = soundex11.difference("", "H000");
        java.lang.String str27 = soundex11.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex();
        int int29 = soundex28.getMaxLength();
        int int30 = soundex28.getMaxLength();
        java.lang.String str32 = soundex28.encode("hi!");
        java.lang.String str34 = soundex28.encode("H000");
        java.lang.String str36 = soundex28.soundex("hi!");
        java.lang.String str38 = soundex28.soundex("01230120022455012623010202");
        java.lang.Object obj39 = soundex11.encode((java.lang.Object) str38);
        java.lang.String str41 = soundex11.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = soundex0.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H000" + "'", obj20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int13 = soundex0.difference("H000", "hi!");
        java.lang.String str15 = soundex0.soundex("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.soundex("");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        java.lang.String str12 = soundex8.soundex("");
        java.lang.String str14 = soundex8.soundex("");
        soundex8.setMaxLength(100);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int12 = soundex0.difference("hi!", "");
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
        java.lang.String str35 = soundex3.soundex("01230120022455012623010202");
        soundex3.setMaxLength(97);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        java.lang.String str13 = soundex1.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex1.soundex("hi!");
        int int16 = soundex1.getMaxLength();
        int int17 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        soundex0.setMaxLength((int) 'a');
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str14 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        int int19 = soundex15.getMaxLength();
        java.lang.String str21 = soundex15.soundex("hi!");
        soundex15.setMaxLength((int) (short) -1);
        soundex15.setMaxLength(10);
        soundex15.setMaxLength((int) '#');
        soundex15.setMaxLength((int) '4');
        soundex15.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex9.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        soundex8.setMaxLength((int) (byte) -1);
        soundex8.setMaxLength((int) (short) 10);
        int int15 = soundex8.getMaxLength();
        java.lang.Object obj17 = soundex8.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str19 = soundex8.soundex("01230120022455012623010202");
        java.lang.Object obj20 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        soundex1.setMaxLength((int) (short) 100);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex();
        int int24 = soundex23.getMaxLength();
        int int25 = soundex23.getMaxLength();
        java.lang.String str27 = soundex23.encode("hi!");
        java.lang.String str29 = soundex23.encode("H000");
        java.lang.String str31 = soundex23.encode("");
        java.lang.String str33 = soundex23.soundex("hi!");
        soundex23.setMaxLength((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex1.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str12 = soundex0.encode("");
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex16 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str18 = soundex16.soundex("");
        java.lang.String str20 = soundex16.encode("01230120022455012623010202");
        int int23 = soundex16.difference("01230120022455012623010202", "");
        java.lang.Object obj24 = soundex0.encode((java.lang.Object) "");
        java.lang.String str26 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(soundex16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        int int9 = soundex0.getMaxLength();
        int int12 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("H000");
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength((int) ' ');
        int int10 = soundex1.difference("", "01230120022455012623010202");
        java.lang.String str12 = soundex1.soundex("hi!");
        java.lang.Class<?> wildcardClass13 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        int int10 = soundex5.getMaxLength();
        int int11 = soundex5.getMaxLength();
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex14.difference("H000", "");
        java.lang.String str19 = soundex14.encode("");
        java.lang.String str21 = soundex14.soundex("");
        java.lang.String str23 = soundex14.soundex("hi!");
        soundex14.setMaxLength((int) (short) 0);
        java.lang.String str27 = soundex14.encode("");
        java.lang.String str29 = soundex14.soundex("01230120022455012623010202");
        java.lang.String str31 = soundex14.encode("01230120022455012623010202");
        java.lang.String str33 = soundex14.encode("hi!");
        java.lang.Class<?> wildcardClass34 = soundex14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex5.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        org.apache.commons.codec.language.Soundex soundex34 = new org.apache.commons.codec.language.Soundex();
        int int35 = soundex34.getMaxLength();
        int int36 = soundex34.getMaxLength();
        java.lang.String str38 = soundex34.encode("hi!");
        java.lang.String str40 = soundex34.encode("H000");
        java.lang.String str42 = soundex34.encode("");
        int int45 = soundex34.difference("01230120022455012623010202", "hi!");
        int int48 = soundex34.difference("H000", "");
        java.lang.Object obj49 = soundex0.encode((java.lang.Object) "");
        int int50 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H000" + "'", str40, "H000");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        int int30 = soundex0.getMaxLength();
        java.lang.String str32 = soundex0.soundex("01230120022455012623010202");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int7 = soundex0.difference("H000", "hi!");
        java.lang.String str9 = soundex0.encode("hi!");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("01230120022455012623010202");
        java.lang.String str16 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.soundex("H000");
        java.lang.String str13 = soundex0.encode("H000");
        int int16 = soundex0.difference("", "");
        java.lang.String str18 = soundex0.soundex("H000");
        int int21 = soundex0.difference("", "H000");
        int int24 = soundex0.difference("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) -1);
        int int14 = soundex0.getMaxLength();
        int int15 = soundex0.getMaxLength();
        int int18 = soundex0.difference("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("", "hi!");
        soundex0.setMaxLength(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass7 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        int int18 = soundex15.difference("", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass19 = soundex15.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("hi!");
        java.lang.String str15 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        int int20 = soundex16.getMaxLength();
        java.lang.String str22 = soundex16.soundex("hi!");
        int int23 = soundex16.getMaxLength();
        soundex16.setMaxLength(0);
        int int28 = soundex16.difference("", "H000");
        int int29 = soundex16.getMaxLength();
        java.lang.String str31 = soundex16.encode("01230120022455012623010202");
        java.lang.Object obj32 = soundex0.encode((java.lang.Object) str31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        int int12 = soundex8.getMaxLength();
        java.lang.String str14 = soundex8.soundex("hi!");
        soundex8.setMaxLength((int) (short) -1);
        soundex8.setMaxLength(10);
        java.lang.String str20 = soundex8.encode("hi!");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(100);
        int int26 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        int int8 = soundex0.difference("H000", "hi!");
        java.lang.String str10 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str13 = soundex11.encode("hi!");
        java.lang.String str15 = soundex11.soundex("hi!");
        java.lang.String str17 = soundex11.soundex("hi!");
        java.lang.String str19 = soundex11.soundex("01230120022455012623010202");
        java.lang.String str21 = soundex11.encode("H000");
        java.lang.String str23 = soundex11.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        java.lang.String str3 = soundex1.encode("");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex6.difference("H000", "");
        int int10 = soundex6.getMaxLength();
        java.lang.String str12 = soundex6.soundex("hi!");
        int int13 = soundex6.getMaxLength();
        soundex6.setMaxLength(0);
        int int18 = soundex6.difference("", "H000");
        int int21 = soundex6.difference("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex1.encode((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("H000");
        java.lang.String str13 = soundex0.soundex("H000");
        int int16 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str18 = soundex0.soundex("hi!");
        java.lang.String str20 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(35);
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(52);
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
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
        soundex0.setMaxLength(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int17 = soundex0.difference("", "");
        char[] charArray22 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray22);
        int int26 = soundex25.getMaxLength();
        java.lang.String str28 = soundex25.soundex("01230120022455012623010202");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) str28);
        java.lang.String str31 = soundex0.encode("");
        int int32 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
        int int28 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass29 = soundex0.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str14 = soundex12.encode("hi!");
        int int17 = soundex12.difference("", "");
        int int20 = soundex12.difference("", "");
        java.lang.Object obj21 = soundex11.encode((java.lang.Object) "");
        java.lang.String str23 = soundex11.soundex("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex5.soundex("");
        soundex5.setMaxLength((int) 'a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        java.lang.String str12 = soundex8.soundex("");
        char[] charArray18 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        int int21 = soundex20.getMaxLength();
        java.lang.String str23 = soundex20.encode("01230120022455012623010202");
        java.lang.String str25 = soundex20.soundex("01230120022455012623010202");
        java.lang.String str27 = soundex20.soundex("01230120022455012623010202");
        java.lang.Object obj28 = soundex8.encode((java.lang.Object) str27);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = soundex8.difference("H000", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.soundex("");
        soundex0.setMaxLength(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(4);
        java.lang.String str16 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        java.lang.String str22 = soundex0.encode("H000");
        int int25 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        soundex0.setMaxLength(35);
        int int9 = soundex0.difference("", "H000");
        java.lang.String str11 = soundex0.encode("H000");
        java.lang.String str13 = soundex0.soundex("H000");
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        int int12 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str14 = soundex0.encode("01230120022455012623010202");
        char[] charArray19 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) soundex23);
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', '4', '#' });
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
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
        int int18 = soundex17.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = soundex17.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength(0);
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (byte) 100);
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) '4');
        soundex0.setMaxLength((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.String str7 = soundex1.soundex("");
        int int8 = soundex1.getMaxLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.encode("");
        java.lang.String str11 = soundex0.encode("");
        java.lang.String str13 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        java.lang.String str8 = soundex4.soundex("01230120022455012623010202");
        int int9 = soundex4.getMaxLength();
        java.lang.String str11 = soundex4.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str14 = soundex12.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.String str8 = soundex0.soundex("H000");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int13 = soundex0.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        java.lang.String str34 = soundex0.soundex("H000");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.String str12 = soundex0.soundex("");
        int int15 = soundex0.difference("", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        int int11 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(52);
        int int14 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex8.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        int int21 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.Class<?> wildcardClass22 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H000" + "'", obj14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        int int10 = soundex0.difference("", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) -1);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        java.lang.String str13 = soundex9.encode("");
        java.lang.String str15 = soundex9.encode("H000");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj18 = soundex9.encode((java.lang.Object) "hi!");
        soundex9.setMaxLength(0);
        soundex9.setMaxLength((-1));
        java.lang.String str24 = soundex9.soundex("H000");
        java.lang.Object obj25 = soundex0.encode((java.lang.Object) "H000");
        int int28 = soundex0.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H000" + "'", obj18, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H000" + "'", obj25, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        char[] charArray6 = new char[] { 'a', '#', ' ', '4', ' ', 'a' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.String str11 = soundex9.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex9.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', ' ', '4', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
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
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        java.lang.String str24 = soundex20.soundex("");
        java.lang.String str26 = soundex20.encode("H000");
        int int29 = soundex20.difference("", "");
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex31.setMaxLength(0);
        soundex31.setMaxLength((int) '4');
        int int36 = soundex31.getMaxLength();
        int int37 = soundex31.getMaxLength();
        java.lang.String str39 = soundex31.soundex("");
        java.lang.Object obj40 = soundex20.encode((java.lang.Object) str39);
        int int43 = soundex20.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str45 = soundex20.encode("");
        java.lang.Object obj46 = soundex0.encode((java.lang.Object) str45);
        int int47 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        int int9 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("");
        int int13 = soundex0.difference("hi!", "");
        java.lang.String str15 = soundex0.soundex("H000");
        int int18 = soundex0.difference("", "");
        int int21 = soundex0.difference("", "01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("", "hi!");
        int int15 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (byte) 100);
        int int9 = soundex0.getMaxLength();
        int int12 = soundex0.difference("H000", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.String str16 = soundex0.encode("");
        int int19 = soundex0.difference("hi!", "H000");
        int int20 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("");
        int int12 = soundex0.difference("H000", "hi!");
        soundex0.setMaxLength(1);
        java.lang.String str16 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        int int19 = soundex0.difference("", "");
        int int22 = soundex0.difference("hi!", "H000");
        int int25 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int16 = soundex0.difference("H000", "");
        int int17 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        java.lang.String str12 = soundex8.soundex("H000");
        int int13 = soundex8.getMaxLength();
        java.lang.String str15 = soundex8.encode("");
        int int16 = soundex8.getMaxLength();
        java.lang.String str18 = soundex8.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass19 = soundex8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex0.encode((java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(0);
        int int12 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex4.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) 'a');
        java.lang.String str10 = soundex6.encode("");
        int int11 = soundex6.getMaxLength();
        int int12 = soundex6.getMaxLength();
        java.lang.String str14 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 1);
        int int16 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int15 = soundex12.difference("", "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.soundex("hi!");
        int int19 = soundex0.difference("H000", "H000");
        java.lang.String str21 = soundex0.encode("hi!");
        int int24 = soundex0.difference("H000", "01230120022455012623010202");
        char[] charArray27 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray27);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray27);
        int int30 = soundex29.getMaxLength();
        soundex29.setMaxLength((int) '4');
        java.lang.String str34 = soundex29.encode("");
        java.lang.Object obj35 = soundex0.encode((java.lang.Object) str34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "" + "'", obj35, "");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex7.setMaxLength((int) 'a');
        java.lang.String str11 = soundex7.encode("");
        soundex7.setMaxLength(10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.String str12 = soundex0.soundex("H000");
        int int13 = soundex0.getMaxLength();
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str8 = soundex6.soundex("01230120022455012623010202");
        int int11 = soundex6.difference("", "");
        soundex6.setMaxLength(52);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        java.lang.String str20 = soundex0.encode("01230120022455012623010202");
        java.lang.String str22 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
        int int16 = soundex12.getMaxLength();
        java.lang.String str18 = soundex12.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex19.getMaxLength();
        int int21 = soundex19.getMaxLength();
        java.lang.String str23 = soundex19.soundex("H000");
        java.lang.String str25 = soundex19.encode("H000");
        soundex19.setMaxLength((-1));
        java.lang.String str29 = soundex19.soundex("01230120022455012623010202");
        int int32 = soundex19.difference("H000", "");
        int int33 = soundex19.getMaxLength();
        java.lang.String str35 = soundex19.encode("");
        int int38 = soundex19.difference("H000", "hi!");
        java.lang.String str40 = soundex19.soundex("01230120022455012623010202");
        java.lang.Object obj41 = soundex12.encode((java.lang.Object) str40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = soundex12.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        int int12 = soundex0.difference("01230120022455012623010202", "");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        int int18 = soundex13.difference("01230120022455012623010202", "H000");
        int int21 = soundex13.difference("01230120022455012623010202", "hi!");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H000" + "'", obj22, "H000");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.encode("H000");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int14 = soundex0.difference("H000", "");
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex8.setMaxLength(100);
        java.lang.String str12 = soundex8.soundex("");
        java.lang.Class<?> wildcardClass13 = soundex8.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        int int12 = soundex0.difference("", "01230120022455012623010202");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) '#');
        soundex0.setMaxLength((int) '4');
        java.lang.String str16 = soundex0.encode("hi!");
        java.lang.String str18 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str22 = soundex20.encode("01230120022455012623010202");
        java.lang.String str24 = soundex20.soundex("hi!");
        int int25 = soundex20.getMaxLength();
        java.lang.Class<?> wildcardClass26 = soundex20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex7.setMaxLength(32);
        java.lang.String str11 = soundex7.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex7.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        int int18 = soundex13.difference("hi!", "01230120022455012623010202");
        java.lang.String str20 = soundex13.encode("H000");
        int int21 = soundex13.getMaxLength();
        soundex13.setMaxLength(35);
        int int26 = soundex13.difference("hi!", "01230120022455012623010202");
        soundex13.setMaxLength((int) (byte) 100);
        int int29 = soundex13.getMaxLength();
        int int32 = soundex13.difference("", "");
        java.lang.Object obj33 = soundex12.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        java.lang.String str20 = soundex0.encode("hi!");
        char[] charArray26 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray26);
        soundex27.setMaxLength((int) '#');
        int int30 = soundex27.getMaxLength();
        char[] charArray36 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex37 = new org.apache.commons.codec.language.Soundex(charArray36);
        org.apache.commons.codec.language.Soundex soundex38 = new org.apache.commons.codec.language.Soundex(charArray36);
        int int39 = soundex38.getMaxLength();
        java.lang.String str41 = soundex38.encode("01230120022455012623010202");
        java.lang.Object obj42 = soundex27.encode((java.lang.Object) str41);
        int int45 = soundex27.difference("", "");
        java.lang.Object obj46 = soundex0.encode((java.lang.Object) "");
        java.lang.String str48 = soundex0.encode("hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "H000" + "'", str48, "H000");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("");
        soundex0.setMaxLength(52);
        soundex0.setMaxLength(32);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        int int20 = soundex18.getMaxLength();
        java.lang.String str22 = soundex18.soundex("H000");
        java.lang.String str24 = soundex18.encode("H000");
        soundex18.setMaxLength((-1));
        java.lang.String str28 = soundex18.soundex("01230120022455012623010202");
        java.lang.String str30 = soundex18.encode("H000");
        java.lang.String str32 = soundex18.soundex("H000");
        int int35 = soundex18.difference("01230120022455012623010202", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) int35);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        int int11 = soundex0.difference("H000", "");
        int int14 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str16 = soundex0.soundex("hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass24 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "H000");
        int int14 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        java.lang.String str12 = soundex8.soundex("");
        java.lang.String str14 = soundex8.encode("H000");
        java.lang.Object obj15 = soundex7.encode((java.lang.Object) "H000");
        soundex7.setMaxLength((int) (byte) 0);
        soundex7.setMaxLength((int) (short) 10);
        int int22 = soundex7.difference("01230120022455012623010202", "hi!");
        soundex7.setMaxLength(0);
        java.lang.String str26 = soundex7.soundex("H000");
        int int27 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode((java.lang.Object) soundex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "H000" + "'", obj15, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        java.lang.String str34 = soundex6.soundex("01230120022455012623010202");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int17 = soundex0.difference("H000", "hi!");
        java.lang.String str19 = soundex0.encode("");
        java.lang.String str21 = soundex0.soundex("01230120022455012623010202");
        int int22 = soundex0.getMaxLength();
        int int23 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex();
        int int27 = soundex24.difference("H000", "");
        java.lang.String str29 = soundex24.encode("");
        java.lang.String str31 = soundex24.soundex("");
        java.lang.String str33 = soundex24.soundex("hi!");
        int int34 = soundex24.getMaxLength();
        soundex24.setMaxLength(52);
        int int39 = soundex24.difference("", "");
        soundex24.setMaxLength(1);
        java.lang.String str43 = soundex24.encode("hi!");
        soundex24.setMaxLength((int) (byte) 100);
        java.lang.String str47 = soundex24.encode("");
        java.lang.String str49 = soundex24.soundex("");
        java.lang.Object obj50 = soundex0.encode((java.lang.Object) str49);
        java.lang.String str52 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H000" + "'", str43, "H000");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "H000" + "'", str52, "H000");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        int int26 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int15 = soundex0.difference("", "hi!");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.encode("");
        java.lang.String str20 = soundex0.soundex("H000");
        int int21 = soundex0.getMaxLength();
        java.lang.String str23 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.Class<?> wildcardClass11 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int17 = soundex0.difference("", "");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }
}
