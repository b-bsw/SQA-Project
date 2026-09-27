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
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(4);
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        int int12 = soundex0.difference("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        char[] charArray6 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        int int8 = soundex7.getMaxLength();
        soundex7.setMaxLength(10);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.soundex("hi!");
        java.lang.String str14 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str17 = soundex0.encode("");
        int int20 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 0);
        soundex0.setMaxLength(100);
        int int12 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        java.lang.String str17 = soundex13.soundex("01230120022455012623010202");
        soundex13.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex0.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        char[] charArray4 = new char[] { '4', ' ', '4', '#' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex10.difference("H000", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        java.lang.String str25 = soundex23.encode("hi!");
        java.lang.String str27 = soundex23.encode("");
        java.lang.String str29 = soundex23.encode("H000");
        java.lang.Class<?> wildcardClass30 = soundex23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex1.encode((java.lang.Object) soundex23);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        soundex0.setMaxLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("");
        java.lang.Class<?> wildcardClass6 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        int int18 = soundex0.difference("", "hi!");
        java.lang.Class<?> wildcardClass19 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        int int25 = soundex0.difference("", "H000");
        java.lang.Class<?> wildcardClass26 = soundex0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.difference("", "");
        int int11 = soundex1.difference("", "");
        soundex1.setMaxLength((int) (byte) 0);
        java.lang.String str15 = soundex1.soundex("H000");
        int int16 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        int int19 = soundex0.difference("H000", "hi!");
        int int22 = soundex0.difference("H000", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.String str16 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex17.difference("H000", "");
        int int21 = soundex17.getMaxLength();
        java.lang.String str23 = soundex17.soundex("hi!");
        java.lang.String str25 = soundex17.encode("hi!");
        int int28 = soundex17.difference("01230120022455012623010202", "hi!");
        soundex17.setMaxLength(100);
        java.lang.String str32 = soundex17.encode("H000");
        java.lang.Class<?> wildcardClass33 = soundex17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex17);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        int int19 = soundex0.difference("", "hi!");
        int int22 = soundex0.difference("H000", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        soundex0.setMaxLength(10);
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int8 = soundex7.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex9.getMaxLength();
        soundex9.setMaxLength((int) 'a');
        java.lang.String str14 = soundex9.encode("H000");
        java.lang.String str16 = soundex9.encode("01230120022455012623010202");
        java.lang.String str18 = soundex9.soundex("H000");
        int int21 = soundex9.difference("H000", "hi!");
        java.lang.Class<?> wildcardClass22 = soundex9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex7.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        java.lang.String str18 = soundex0.soundex("hi!");
        java.lang.String str20 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        int int25 = soundex0.difference("H000", "01230120022455012623010202");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        int int8 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex5.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        int int10 = soundex1.difference("", "");
        soundex1.setMaxLength((int) '4');
        int int15 = soundex1.difference("hi!", "");
        int int18 = soundex1.difference("H000", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int7 = soundex0.difference("H000", "hi!");
        int int10 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("hi!");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        int int14 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        int int17 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        int int7 = soundex0.difference("", "");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        java.lang.Class<?> wildcardClass7 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        java.lang.String str14 = soundex7.soundex("");
        char[] charArray19 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray19);
        int int25 = soundex24.getMaxLength();
        int int28 = soundex24.difference("", "01230120022455012623010202");
        int int29 = soundex24.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex7.encode((java.lang.Object) int29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        int int4 = soundex1.getMaxLength();
        int int7 = soundex1.difference("", "");
        int int10 = soundex1.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        java.lang.String str32 = soundex0.encode("");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = soundex3.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str17 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        int int16 = soundex1.difference("01230120022455012623010202", "H000");
        int int19 = soundex1.difference("", "");
        java.lang.String str21 = soundex1.encode("");
        java.lang.Class<?> wildcardClass22 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str8 = soundex6.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex6.encode("");
        int int11 = soundex6.getMaxLength();
        int int12 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        java.lang.Object obj12 = soundex6.encode((java.lang.Object) "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex13.difference("H000", "");
        java.lang.String str18 = soundex13.encode("");
        java.lang.String str20 = soundex13.soundex("");
        java.lang.String str22 = soundex13.soundex("hi!");
        soundex13.setMaxLength((int) (short) 0);
        java.lang.String str26 = soundex13.encode("");
        java.lang.String str28 = soundex13.soundex("01230120022455012623010202");
        java.lang.Object obj29 = soundex6.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        java.lang.String str17 = soundex0.soundex("H000");
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.Class<?> wildcardClass6 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex16.getMaxLength();
        int int18 = soundex16.getMaxLength();
        java.lang.String str20 = soundex16.encode("");
        java.lang.Class<?> wildcardClass21 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode((java.lang.Object) wildcardClass21);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str11 = soundex9.encode("hi!");
        java.lang.String str13 = soundex9.soundex("hi!");
        int int16 = soundex9.difference("01230120022455012623010202", "H000");
        java.lang.String str18 = soundex9.soundex("");
        java.lang.String str20 = soundex9.soundex("01230120022455012623010202");
        java.lang.String str22 = soundex9.encode("hi!");
        soundex9.setMaxLength(32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(1);
        java.lang.String str11 = soundex0.encode("H000");
        int int14 = soundex0.difference("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int16 = soundex0.difference("hi!", "hi!");
        int int19 = soundex0.difference("", "");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        int int15 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("H000");
        soundex0.setMaxLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        soundex6.setMaxLength((int) ' ');
        java.lang.String str12 = soundex6.encode("01230120022455012623010202");
        int int13 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str16 = soundex14.encode("hi!");
        java.lang.String str18 = soundex14.soundex("hi!");
        int int21 = soundex14.difference("01230120022455012623010202", "H000");
        int int24 = soundex14.difference("", "H000");
        soundex14.setMaxLength(10);
        int int27 = soundex14.getMaxLength();
        int int28 = soundex14.getMaxLength();
        java.lang.Class<?> wildcardClass29 = soundex14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex6.encode((java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str13 = soundex0.soundex("H000");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex18.setMaxLength(0);
        soundex18.setMaxLength((int) '4');
        java.lang.String str24 = soundex18.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex();
        int int26 = soundex25.getMaxLength();
        int int27 = soundex25.getMaxLength();
        soundex25.setMaxLength((int) (byte) -1);
        soundex25.setMaxLength((int) (short) 10);
        int int32 = soundex25.getMaxLength();
        java.lang.Object obj34 = soundex25.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str36 = soundex25.soundex("01230120022455012623010202");
        java.lang.Object obj37 = soundex18.encode((java.lang.Object) "01230120022455012623010202");
        int int40 = soundex18.difference("hi!", "01230120022455012623010202");
        java.lang.Object obj41 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str43 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int22 = soundex1.difference("hi!", "H000");
        java.lang.String str24 = soundex1.encode("");
        soundex1.setMaxLength(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("hi!", "");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(97);
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        soundex0.setMaxLength((int) (short) 0);
        int int30 = soundex0.getMaxLength();
        int int33 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str11 = soundex0.soundex("");
        int int14 = soundex0.difference("", "H000");
        java.lang.String str16 = soundex0.soundex("hi!");
        java.lang.String str18 = soundex0.encode("H000");
        java.lang.String str20 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("hi!");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        int int15 = soundex0.difference("H000", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        int int15 = soundex0.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        java.lang.String str21 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str23 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) '#');
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
// flaky "1) test3057(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "1) test3057(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex3.setMaxLength(32);
        soundex3.setMaxLength((int) (short) 10);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.encode("H000");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        int int18 = soundex0.difference("01230120022455012623010202", "H000");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int23 = soundex20.difference("01230120022455012623010202", "01230120022455012623010202");
        int int26 = soundex20.difference("", "hi!");
        java.lang.String str28 = soundex20.encode("");
        java.lang.String str30 = soundex20.encode("01230120022455012623010202");
        soundex20.setMaxLength(10);
        java.lang.String str34 = soundex20.soundex("01230120022455012623010202");
        int int37 = soundex20.difference("H000", "01230120022455012623010202");
        int int40 = soundex20.difference("", "hi!");
        int int43 = soundex20.difference("", "");
        java.lang.String str45 = soundex20.encode("H000");
        int int46 = soundex20.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = soundex0.encode((java.lang.Object) soundex20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "H000" + "'", str45, "H000");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        java.lang.String str21 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        int int15 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        java.lang.String str21 = soundex16.encode("");
        java.lang.String str23 = soundex16.soundex("");
        java.lang.String str25 = soundex16.soundex("hi!");
        soundex16.setMaxLength((int) (byte) 1);
        java.lang.String str29 = soundex16.soundex("");
        java.lang.Object obj30 = soundex0.encode((java.lang.Object) "");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((-1));
        int int35 = soundex0.getMaxLength();
        java.lang.String str37 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        soundex1.setMaxLength(35);
        soundex1.setMaxLength((int) (byte) 100);
        int int18 = soundex1.getMaxLength();
        int int19 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str22 = soundex20.encode("hi!");
        java.lang.String str24 = soundex20.encode("");
        java.lang.String str26 = soundex20.encode("H000");
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj29 = soundex20.encode((java.lang.Object) "hi!");
        soundex20.setMaxLength(0);
        java.lang.String str33 = soundex20.encode("");
        java.lang.Object obj34 = soundex1.encode((java.lang.Object) "");
        int int35 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.lang.String str28 = soundex22.encode("H000");
        soundex22.setMaxLength((-1));
        java.lang.String str32 = soundex22.soundex("01230120022455012623010202");
        int int35 = soundex22.difference("H000", "");
        int int36 = soundex22.getMaxLength();
        java.lang.String str38 = soundex22.encode("");
        int int41 = soundex22.difference("H000", "hi!");
        java.lang.String str43 = soundex22.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex44 = new org.apache.commons.codec.language.Soundex();
        int int45 = soundex44.getMaxLength();
        int int46 = soundex44.getMaxLength();
        java.lang.String str48 = soundex44.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex49 = new org.apache.commons.codec.language.Soundex();
        int int52 = soundex49.difference("H000", "");
        java.lang.Object obj53 = soundex44.encode((java.lang.Object) "H000");
        java.lang.String str55 = soundex44.soundex("");
        java.lang.Object obj56 = soundex22.encode((java.lang.Object) str55);
        java.lang.String str58 = soundex22.encode("H000");
        java.lang.Object obj59 = soundex0.encode((java.lang.Object) str58);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "H000" + "'", str48, "H000");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "H000" + "'", obj53, "H000");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "" + "'", obj56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "H000" + "'", str58, "H000");
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + "H000" + "'", obj59, "H000");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.String str8 = soundex0.soundex("hi!");
        int int11 = soundex0.difference("H000", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        int int17 = soundex12.difference("01230120022455012623010202", "");
        java.lang.String str19 = soundex12.encode("H000");
        int int20 = soundex12.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(soundex12);
// flaky "2) test3065(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "2) test3065(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
// flaky "1) test3065(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) '#');
        java.lang.Object obj12 = soundex6.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str14 = soundex6.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        int int23 = soundex0.difference("H000", "H000");
        java.lang.String str25 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        java.lang.String str17 = soundex0.encode("");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        int int25 = soundex0.difference("H000", "H000");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("H000");
        int int16 = soundex0.getMaxLength();
        int int19 = soundex0.difference("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength((int) (short) 100);
        int int16 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        java.lang.String str20 = soundex0.soundex("");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        java.lang.String str30 = soundex0.soundex("H000");
        int int33 = soundex0.difference("", "");
        org.junit.Assert.assertNotNull(soundex0);
// flaky "3) test3075(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky "3) test3075(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky "2) test3075(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
// flaky "1) test3075(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex();
        int int2 = soundex1.getMaxLength();
        int int3 = soundex1.getMaxLength();
        java.lang.String str5 = soundex1.soundex("");
        java.lang.String str7 = soundex1.encode("H000");
        java.lang.Object obj8 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength((int) (byte) 0);
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        soundex1.setMaxLength((int) '4');
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
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength(1);
        int int11 = soundex6.getMaxLength();
        soundex6.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex6.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(4);
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        int int7 = soundex5.getMaxLength();
        int int10 = soundex5.difference("01230120022455012623010202", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex5.difference("hi!", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        soundex0.setMaxLength(52);
        java.lang.String str15 = soundex0.encode("");
        java.lang.String str17 = soundex0.soundex("");
        java.lang.String str19 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        java.lang.Class<?> wildcardClass24 = soundex1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str8 = soundex6.encode("");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "");
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        int int12 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
            java.lang.String str23 = soundex6.soundex("hi!");
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
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        int int28 = soundex27.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex29 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str31 = soundex29.soundex("");
        java.lang.String str33 = soundex29.soundex("01230120022455012623010202");
        java.lang.Object obj34 = soundex27.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str36 = soundex27.soundex("");
        int int37 = soundex27.getMaxLength();
        java.lang.String str39 = soundex27.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex40 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str42 = soundex40.encode("hi!");
        java.lang.String str44 = soundex40.encode("");
        java.lang.String str46 = soundex40.encode("H000");
        java.lang.String str48 = soundex40.soundex("01230120022455012623010202");
        soundex40.setMaxLength(0);
        java.lang.String str52 = soundex40.soundex("");
        java.lang.String str54 = soundex40.encode("H000");
        java.lang.Object obj55 = soundex27.encode((java.lang.Object) "H000");
        soundex27.setMaxLength(0);
        int int60 = soundex27.difference("", "");
        java.lang.Class<?> wildcardClass61 = soundex27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = soundex0.encode((java.lang.Object) soundex27);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(soundex29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "H000" + "'", str42, "H000");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "H000" + "'", str46, "H000");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "H000" + "'", str54, "H000");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "H000" + "'", obj55, "H000");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = soundex13.difference("01230120022455012623010202", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        java.lang.String str5 = soundex0.encode("hi!");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        java.lang.String str9 = soundex0.encode("H000");
        soundex0.setMaxLength(32);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex17.getMaxLength();
        int int19 = soundex17.getMaxLength();
        java.lang.String str21 = soundex17.soundex("hi!");
        java.lang.Object obj22 = soundex12.encode((java.lang.Object) "hi!");
        int int25 = soundex12.difference("", "");
        soundex12.setMaxLength(0);
        int int28 = soundex12.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) int28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
// flaky "4) test3088(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H000" + "'", obj22, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) 'a');
        soundex6.setMaxLength((int) 'a');
        soundex6.setMaxLength((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "01230120022455012623010202");
        int int20 = soundex1.difference("hi!", "hi!");
        java.lang.String str22 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        int int21 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int2 = soundex1.getMaxLength();
        int int5 = soundex1.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex1.soundex("hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.soundex("hi!");
        java.lang.String str13 = soundex1.encode("H000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.lang.Class<?> wildcardClass24 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int18 = soundex15.difference("01230120022455012623010202", "01230120022455012623010202");
        int int21 = soundex15.difference("", "hi!");
        java.lang.String str23 = soundex15.encode("H000");
        java.lang.Object obj24 = soundex0.encode((java.lang.Object) str23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H000" + "'", obj24, "H000");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) '#');
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("H000");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        int int12 = soundex0.difference("H000", "");
        int int15 = soundex0.difference("H000", "H000");
        int int18 = soundex0.difference("", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        int int23 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int24 = soundex0.getMaxLength();
        int int27 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int8 = soundex7.getMaxLength();
        java.lang.String str10 = soundex7.encode("01230120022455012623010202");
        java.lang.String str12 = soundex7.soundex("");
        int int13 = soundex7.getMaxLength();
        int int14 = soundex7.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        java.lang.String str19 = soundex15.soundex("hi!");
        java.lang.String str21 = soundex15.soundex("hi!");
        java.lang.String str23 = soundex15.soundex("01230120022455012623010202");
        java.lang.String str25 = soundex15.encode("H000");
        java.lang.String str27 = soundex15.encode("");
        java.lang.String str29 = soundex15.encode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex7.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.encode("H000");
        char[] charArray12 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        soundex13.setMaxLength((int) ' ');
        soundex13.setMaxLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex0.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '4', '4', '4' });
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        int int15 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        java.lang.String str21 = soundex16.encode("");
        java.lang.String str23 = soundex16.soundex("");
        java.lang.String str25 = soundex16.soundex("hi!");
        soundex16.setMaxLength((int) (byte) 1);
        java.lang.String str29 = soundex16.soundex("");
        java.lang.Object obj30 = soundex0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str33 = soundex31.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex34 = new org.apache.commons.codec.language.Soundex();
        int int35 = soundex34.getMaxLength();
        int int36 = soundex34.getMaxLength();
        java.lang.String str38 = soundex34.encode("");
        int int41 = soundex34.difference("H000", "");
        java.lang.String str43 = soundex34.encode("01230120022455012623010202");
        java.lang.Object obj44 = soundex31.encode((java.lang.Object) str43);
        int int47 = soundex31.difference("01230120022455012623010202", "");
        java.lang.String str49 = soundex31.soundex("hi!");
        java.lang.Class<?> wildcardClass50 = soundex31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = soundex0.encode((java.lang.Object) soundex31);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "H000" + "'", str49, "H000");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        soundex1.setMaxLength((int) (short) 10);
        int int12 = soundex1.difference("hi!", "01230120022455012623010202");
        java.lang.String str14 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int12 = soundex0.difference("H000", "01230120022455012623010202");
        int int15 = soundex0.difference("hi!", "");
        int int18 = soundex0.difference("hi!", "H000");
        int int21 = soundex0.difference("H000", "H000");
        int int22 = soundex0.getMaxLength();
        java.lang.String str24 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("");
        char[] charArray11 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.soundex("01230120022455012623010202");
        java.lang.Object obj15 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        soundex1.setMaxLength((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        java.lang.String str20 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str23 = soundex21.encode("hi!");
        java.lang.String str25 = soundex21.soundex("hi!");
        java.lang.String str27 = soundex21.soundex("hi!");
        java.lang.String str29 = soundex21.soundex("01230120022455012623010202");
        java.lang.String str31 = soundex21.encode("H000");
        java.lang.String str33 = soundex21.soundex("H000");
        java.lang.String str35 = soundex21.soundex("hi!");
        int int38 = soundex21.difference("", "hi!");
        int int39 = soundex21.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = soundex0.encode((java.lang.Object) int39);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        java.lang.String str23 = soundex0.encode("01230120022455012623010202");
        int int26 = soundex0.difference("H000", "");
        java.lang.Class<?> wildcardClass27 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        int int25 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int26 = soundex0.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        java.lang.String str18 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 0);
        soundex0.setMaxLength(0);
        java.lang.String str13 = soundex0.soundex("hi!");
        soundex0.setMaxLength(100);
        java.lang.String str17 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str17 = soundex0.encode("hi!");
        soundex0.setMaxLength(0);
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        int int19 = soundex0.difference("hi!", "");
        int int20 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        int int25 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        int int9 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str11 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(4);
        int int20 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.encode("");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        int int15 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        java.lang.String str21 = soundex16.encode("");
        java.lang.String str23 = soundex16.soundex("");
        java.lang.String str25 = soundex16.soundex("hi!");
        soundex16.setMaxLength((int) (byte) 1);
        java.lang.String str29 = soundex16.soundex("");
        java.lang.Object obj30 = soundex0.encode((java.lang.Object) "");
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str34 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        int int11 = soundex6.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        soundex12.setMaxLength((int) (byte) -1);
        java.lang.String str18 = soundex12.soundex("H000");
        java.lang.String str20 = soundex12.soundex("01230120022455012623010202");
        int int21 = soundex12.getMaxLength();
        int int22 = soundex12.getMaxLength();
        java.lang.String str24 = soundex12.encode("hi!");
        java.lang.String str26 = soundex12.encode("");
        int int27 = soundex12.getMaxLength();
        soundex12.setMaxLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex6.encode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        int int6 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (short) -1);
        int int9 = soundex1.getMaxLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        int int14 = soundex0.difference("", "H000");
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        int int10 = soundex1.difference("", "");
        soundex1.setMaxLength((int) '4');
        java.lang.String str14 = soundex1.soundex("");
        java.lang.String str16 = soundex1.encode("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        java.lang.String str20 = soundex10.soundex("");
        soundex10.setMaxLength(35);
        int int23 = soundex10.getMaxLength();
        java.lang.Class<?> wildcardClass24 = soundex10.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        int int21 = soundex0.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        soundex8.setMaxLength((int) (byte) -1);
        soundex8.setMaxLength((int) (short) 10);
        java.lang.String str16 = soundex8.soundex("H000");
        java.lang.Object obj17 = soundex0.encode((java.lang.Object) "H000");
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex18.getMaxLength();
        int int20 = soundex18.getMaxLength();
        java.lang.String str22 = soundex18.encode("hi!");
        java.lang.String str24 = soundex18.encode("H000");
        java.lang.String str26 = soundex18.encode("");
        java.lang.String str28 = soundex18.encode("01230120022455012623010202");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) str28);
        java.lang.String str31 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex();
        int int33 = soundex32.getMaxLength();
        int int34 = soundex32.getMaxLength();
        java.lang.String str36 = soundex32.encode("hi!");
        java.lang.String str38 = soundex32.encode("H000");
        java.lang.String str40 = soundex32.encode("");
        int int43 = soundex32.difference("01230120022455012623010202", "hi!");
        java.lang.Class<?> wildcardClass44 = soundex32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = soundex0.encode((java.lang.Object) wildcardClass44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex();
        int int26 = soundex23.difference("H000", "");
        java.lang.String str28 = soundex23.encode("");
        java.lang.String str30 = soundex23.soundex("");
        java.lang.String str32 = soundex23.soundex("hi!");
        soundex23.setMaxLength((int) (short) 0);
        java.lang.String str36 = soundex23.encode("");
        soundex23.setMaxLength((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex0.encode((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        soundex1.setMaxLength((int) (byte) 10);
        int int29 = soundex1.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int12 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        soundex1.setMaxLength(32);
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
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex6.setMaxLength(100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.encode("hi!");
        int int14 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str4 = soundex2.soundex("");
        java.lang.String str6 = soundex2.soundex("01230120022455012623010202");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        int int14 = soundex0.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.encode("hi!");
        java.lang.String str10 = soundex0.soundex("");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "01230120022455012623010202");
        int int20 = soundex1.difference("hi!", "hi!");
        int int23 = soundex1.difference("", "H000");
        int int26 = soundex1.difference("01230120022455012623010202", "");
        java.lang.String str28 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("H000", "H000");
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        int int8 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(97);
        soundex0.setMaxLength(97);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        java.lang.String str15 = soundex12.encode("");
        soundex12.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        int int6 = soundex3.getMaxLength();
        java.lang.String str8 = soundex3.encode("01230120022455012623010202");
        java.lang.String str10 = soundex3.encode("");
        int int11 = soundex3.getMaxLength();
        soundex3.setMaxLength(35);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        soundex0.setMaxLength(0);
        int int34 = soundex0.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        java.lang.String str20 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass21 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        soundex0.setMaxLength((int) ' ');
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("H000");
        java.lang.String str14 = soundex0.soundex("H000");
        int int17 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        soundex0.setMaxLength(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int11 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str13 = soundex0.encode("hi!");
        int int16 = soundex0.difference("H000", "");
        soundex0.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex20.setMaxLength((int) (short) 100);
        java.lang.String str24 = soundex20.soundex("H000");
        java.lang.String str26 = soundex20.encode("H000");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "H000");
        java.lang.String str29 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
        int int19 = soundex0.getMaxLength();
        int int20 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("");
        soundex0.setMaxLength(52);
        soundex0.setMaxLength(32);
        soundex0.setMaxLength(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        java.lang.String str13 = soundex0.soundex("");
        int int16 = soundex0.difference("hi!", "");
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        int int15 = soundex0.difference("hi!", "");
        int int18 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("01230120022455012623010202");
        soundex1.setMaxLength((int) (short) 1);
        java.lang.String str14 = soundex1.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.encode("");
        soundex15.setMaxLength(0);
        soundex15.setMaxLength((int) (byte) 0);
        java.lang.String str25 = soundex15.encode("01230120022455012623010202");
        java.lang.String str27 = soundex15.soundex("hi!");
        java.lang.Object obj28 = soundex1.encode((java.lang.Object) str27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H000" + "'", obj28, "H000");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str18 = soundex16.encode("hi!");
        java.lang.String str20 = soundex16.soundex("hi!");
        int int23 = soundex16.difference("01230120022455012623010202", "H000");
        int int26 = soundex16.difference("", "H000");
        int int29 = soundex16.difference("01230120022455012623010202", "hi!");
        soundex16.setMaxLength((int) (byte) 0);
        java.lang.String str33 = soundex16.soundex("01230120022455012623010202");
        java.lang.String str35 = soundex16.encode("hi!");
        java.lang.Object obj36 = soundex0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "H000" + "'", obj36, "H000");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str9 = soundex0.soundex("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        int int14 = soundex0.difference("hi!", "hi!");
        java.lang.String str16 = soundex0.soundex("");
        java.lang.String str18 = soundex0.soundex("");
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        soundex0.setMaxLength((int) (byte) 100);
        soundex0.setMaxLength(4);
        int int27 = soundex0.difference("", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        int int19 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        int int15 = soundex0.difference("", "");
        java.lang.String str17 = soundex0.encode("H000");
        java.lang.String str19 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int10 = soundex0.getMaxLength();
        int int13 = soundex0.difference("", "H000");
        java.lang.Class<?> wildcardClass14 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str17 = soundex0.encode("hi!");
        java.lang.String str19 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        java.lang.String str24 = soundex20.soundex("H000");
        java.lang.String str26 = soundex20.encode("H000");
        soundex20.setMaxLength((-1));
        java.lang.String str30 = soundex20.soundex("01230120022455012623010202");
        java.lang.String str32 = soundex20.soundex("H000");
        java.lang.String str34 = soundex20.encode("H000");
        soundex20.setMaxLength(97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex0.encode((java.lang.Object) 97);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        java.lang.String str35 = soundex0.encode("01230120022455012623010202");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        soundex0.setMaxLength(10);
        java.lang.String str6 = soundex0.encode("hi!");
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str11 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str18 = soundex0.encode("01230120022455012623010202");
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '4');
        int int5 = soundex0.difference("", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass6 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.encode("");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex0.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "hi!");
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(0);
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 100);
        int int16 = soundex0.getMaxLength();
        soundex0.setMaxLength(97);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("");
        soundex0.setMaxLength((int) ' ');
        int int9 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("", "hi!");
        soundex0.setMaxLength(10);
        int int14 = soundex0.difference("", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str6 = soundex0.encode("");
        int int9 = soundex0.difference("H000", "");
        soundex0.setMaxLength(10);
        char[] charArray17 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        soundex18.setMaxLength(10);
        soundex18.setMaxLength((int) (byte) 10);
        java.lang.String str24 = soundex18.encode("");
        java.lang.Object obj25 = soundex0.encode((java.lang.Object) str24);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex();
        int int27 = soundex26.getMaxLength();
        int int28 = soundex26.getMaxLength();
        soundex26.setMaxLength((int) (byte) -1);
        java.lang.String str32 = soundex26.soundex("H000");
        java.lang.String str34 = soundex26.soundex("01230120022455012623010202");
        int int35 = soundex26.getMaxLength();
        java.lang.String str37 = soundex26.soundex("");
        java.lang.Class<?> wildcardClass38 = soundex26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex0.encode((java.lang.Object) soundex26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int12 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 100);
        int int15 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        int int21 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.soundex("H000");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.encode("");
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str13 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        java.lang.String str5 = soundex1.soundex("H000");
        soundex1.setMaxLength((-1));
        java.lang.String str9 = soundex1.soundex("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        int int14 = soundex0.difference("01230120022455012623010202", "hi!");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.encode("hi!");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("01230120022455012623010202");
        int int3 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass4 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        char[] charArray13 = new char[] { '4', '#', '#', '4', '4' };
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
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) charArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '#', '#', '4', '4' });
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        java.lang.String str14 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex12.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        char[] charArray6 = new char[] { ' ', '4', 'a', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex12.getMaxLength();
        int int14 = soundex12.getMaxLength();
        java.lang.String str16 = soundex12.soundex("H000");
        java.lang.String str18 = soundex12.encode("H000");
        soundex12.setMaxLength((-1));
        java.lang.String str22 = soundex12.soundex("01230120022455012623010202");
        int int25 = soundex12.difference("H000", "");
        java.lang.String str27 = soundex12.encode("H000");
        java.lang.String str29 = soundex12.soundex("01230120022455012623010202");
        soundex12.setMaxLength((int) (short) 1);
        int int32 = soundex12.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex11.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str8 = soundex1.encode("hi!");
        int int11 = soundex1.difference("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int13 = soundex0.difference("01230120022455012623010202", "");
        soundex0.setMaxLength(1);
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("");
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str13 = soundex11.encode("hi!");
        java.lang.String str15 = soundex11.soundex("hi!");
        java.lang.String str17 = soundex11.encode("hi!");
        int int20 = soundex11.difference("01230120022455012623010202", "H000");
        soundex11.setMaxLength((int) (byte) 1);
        java.lang.String str24 = soundex11.soundex("");
        int int27 = soundex11.difference("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode((java.lang.Object) int27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("hi!");
        int int18 = soundex0.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        int int19 = soundex0.difference("hi!", "H000");
        java.lang.String str21 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        java.lang.String str14 = soundex8.soundex("");
        int int17 = soundex8.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex8.setMaxLength(1);
        int int20 = soundex8.getMaxLength();
        java.lang.String str22 = soundex8.encode("");
        java.lang.Class<?> wildcardClass23 = soundex8.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        int int13 = soundex11.getMaxLength();
        java.lang.String str15 = soundex11.encode("hi!");
        java.lang.String str17 = soundex11.encode("H000");
        java.lang.String str19 = soundex11.encode("");
        int int22 = soundex11.difference("01230120022455012623010202", "hi!");
        int int25 = soundex11.difference("H000", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) int25);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        int int15 = soundex0.difference("H000", "H000");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        int int10 = soundex1.difference("", "");
        soundex1.setMaxLength((int) '4');
        java.lang.String str14 = soundex1.soundex("");
        int int15 = soundex1.getMaxLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str17 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (short) 10);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int24 = soundex21.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass25 = soundex21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex0.encode((java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        java.lang.String str14 = soundex0.soundex("hi!");
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        java.lang.String str23 = soundex0.encode("01230120022455012623010202");
        java.lang.String str25 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int5 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H000" + "'", obj14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        char[] charArray25 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray25);
        soundex26.setMaxLength((int) '#');
        soundex26.setMaxLength((int) '#');
        java.lang.Object obj32 = soundex26.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.Object obj33 = soundex0.encode(obj32);
        org.apache.commons.codec.language.Soundex soundex34 = new org.apache.commons.codec.language.Soundex();
        int int35 = soundex34.getMaxLength();
        soundex34.setMaxLength((int) 'a');
        java.lang.String str39 = soundex34.encode("H000");
        soundex34.setMaxLength((int) '#');
        java.lang.String str43 = soundex34.encode("");
        soundex34.setMaxLength((int) ' ');
        java.lang.String str47 = soundex34.soundex("H000");
        int int48 = soundex34.getMaxLength();
        java.lang.String str50 = soundex34.encode("H000");
        java.lang.Object obj51 = soundex0.encode((java.lang.Object) str50);
        int int52 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H000" + "'", str39, "H000");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "H000" + "'", str47, "H000");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "H000" + "'", str50, "H000");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "H000" + "'", obj51, "H000");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "01230120022455012623010202");
        java.lang.String str19 = soundex1.encode("H000");
        soundex1.setMaxLength((int) (byte) 100);
        int int22 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex10.setMaxLength(10);
        java.lang.Class<?> wildcardClass13 = soundex10.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.soundex("");
        int int9 = soundex6.getMaxLength();
        int int10 = soundex6.getMaxLength();
        int int11 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        char[] charArray13 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str18 = soundex16.encode("");
        java.lang.String str20 = soundex16.soundex("");
        java.lang.String str22 = soundex16.soundex("");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        java.lang.String str32 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex();
        int int34 = soundex33.getMaxLength();
        int int35 = soundex33.getMaxLength();
        java.lang.String str37 = soundex33.encode("hi!");
        java.lang.String str39 = soundex33.encode("H000");
        java.lang.String str41 = soundex33.encode("");
        java.lang.String str43 = soundex33.soundex("hi!");
        java.lang.String str45 = soundex33.soundex("H000");
        soundex33.setMaxLength(0);
        java.lang.String str49 = soundex33.encode("");
        soundex33.setMaxLength(0);
        java.lang.String str53 = soundex33.encode("");
        java.lang.Class<?> wildcardClass54 = soundex33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = soundex0.encode((java.lang.Object) wildcardClass54);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H000" + "'", str39, "H000");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H000" + "'", str43, "H000");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "H000" + "'", str45, "H000");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        java.lang.String str25 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("hi!");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        soundex0.setMaxLength(1);
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
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        java.lang.String str23 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        int int12 = soundex0.difference("", "hi!");
        java.lang.String str14 = soundex0.encode("");
        soundex0.setMaxLength(4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((int) 'a');
        int int6 = soundex3.getMaxLength();
        java.lang.String str8 = soundex3.encode("01230120022455012623010202");
        java.lang.String str10 = soundex3.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex3.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) '4');
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex7.setMaxLength((int) '#');
        java.lang.String str11 = soundex7.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex7.encode("");
        soundex7.setMaxLength((int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = soundex7.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        int int7 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex8.difference("H000", "");
        int int12 = soundex8.getMaxLength();
        java.lang.String str14 = soundex8.soundex("hi!");
        java.lang.String str16 = soundex8.soundex("");
        soundex8.setMaxLength(0);
        int int19 = soundex8.getMaxLength();
        java.lang.String str21 = soundex8.soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.soundex("H000");
        java.lang.String str14 = soundex0.soundex("hi!");
        int int17 = soundex0.difference("H000", "H000");
        java.lang.String str19 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("", "H000");
        java.lang.String str18 = soundex0.soundex("H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "5) test3212(org.apache.commons.codec.language.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        int int14 = soundex1.getMaxLength();
        int int17 = soundex1.difference("H000", "hi!");
        java.lang.String str19 = soundex1.encode("H000");
        int int22 = soundex1.difference("hi!", "01230120022455012623010202");
        int int25 = soundex1.difference("", "01230120022455012623010202");
        int int28 = soundex1.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str18 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int23 = soundex20.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str25 = soundex20.encode("01230120022455012623010202");
        java.lang.String str27 = soundex20.encode("H000");
        soundex20.setMaxLength(52);
        soundex20.setMaxLength(32);
        java.lang.String str33 = soundex20.encode("01230120022455012623010202");
        java.lang.String str35 = soundex20.encode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) soundex20);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("H000");
        int int14 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(52);
        int int19 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str23 = soundex21.encode("hi!");
        int int26 = soundex21.difference("hi!", "01230120022455012623010202");
        java.lang.String str28 = soundex21.soundex("");
        java.lang.String str30 = soundex21.soundex("hi!");
        java.lang.String str32 = soundex21.encode("hi!");
        int int33 = soundex21.getMaxLength();
        int int36 = soundex21.difference("", "hi!");
        int int39 = soundex21.difference("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = soundex1.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        java.lang.String str17 = soundex0.soundex("H000");
        int int20 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        java.lang.String str8 = soundex0.encode("H000");
        soundex0.setMaxLength(97);
        soundex0.setMaxLength(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        int int7 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(1);
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("H000");
        java.lang.String str13 = soundex0.soundex("hi!");
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        int int18 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        java.lang.String str29 = soundex1.encode("H000");
        java.lang.String str31 = soundex1.soundex("");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.difference("", "");
        int int11 = soundex1.difference("", "");
        soundex1.setMaxLength((int) (byte) 0);
        java.lang.String str15 = soundex1.soundex("H000");
        int int18 = soundex1.difference("01230120022455012623010202", "H000");
        soundex1.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 1);
        java.lang.String str6 = soundex0.encode("");
        soundex0.setMaxLength(10);
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        java.lang.Class<?> wildcardClass24 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex();
        int int27 = soundex24.difference("H000", "");
        java.lang.String str29 = soundex24.encode("");
        java.lang.String str31 = soundex24.soundex("");
        java.lang.String str33 = soundex24.soundex("hi!");
        int int34 = soundex24.getMaxLength();
        soundex24.setMaxLength(52);
        int int39 = soundex24.difference("H000", "H000");
        java.lang.Object obj40 = soundex0.encode((java.lang.Object) "H000");
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str43 = soundex41.encode("hi!");
        java.lang.String str45 = soundex41.soundex("hi!");
        int int48 = soundex41.difference("01230120022455012623010202", "H000");
        int int51 = soundex41.difference("", "H000");
        int int54 = soundex41.difference("01230120022455012623010202", "hi!");
        soundex41.setMaxLength((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = soundex0.encode((java.lang.Object) soundex41);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "H000" + "'", obj40, "H000");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H000" + "'", str43, "H000");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "H000" + "'", str45, "H000");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) 'a');
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        char[] charArray4 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        int int8 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) '#');
        int int13 = soundex5.difference("01230120022455012623010202", "01230120022455012623010202");
        int int16 = soundex5.difference("", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex5.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int11 = soundex0.difference("01230120022455012623010202", "");
        int int14 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str16 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        java.lang.String str25 = soundex0.encode("hi!");
        java.lang.String str27 = soundex0.encode("");
        java.lang.String str29 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("");
        int int4 = soundex1.getMaxLength();
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int7 = soundex0.difference("H000", "hi!");
        java.lang.String str9 = soundex0.encode("hi!");
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        java.lang.String str19 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(97);
        soundex0.setMaxLength((int) ' ');
        org.apache.commons.codec.language.Soundex soundex8 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str10 = soundex8.soundex("01230120022455012623010202");
        soundex8.setMaxLength(0);
        int int15 = soundex8.difference("hi!", "01230120022455012623010202");
        java.lang.Object obj16 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(soundex8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str13 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("", "H000");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength(52);
        soundex0.setMaxLength(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str17 = soundex15.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        int int14 = soundex0.difference("01230120022455012623010202", "");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        java.lang.String str7 = soundex1.encode("01230120022455012623010202");
        int int8 = soundex1.getMaxLength();
        java.lang.String str10 = soundex1.soundex("H000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("");
        soundex0.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("hi!", "");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(4);
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("");
        soundex0.setMaxLength(0);
        char[] charArray17 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray17);
        int int23 = soundex20.difference("", "");
        java.lang.Object obj24 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex5.setMaxLength((-1));
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int22 = soundex1.difference("hi!", "hi!");
        soundex1.setMaxLength(4);
        soundex1.setMaxLength((int) (short) 10);
        java.lang.String str28 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.soundex("hi!");
        int int6 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex1.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex1.soundex("");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("hi!");
        java.lang.String str17 = soundex13.encode("");
        java.lang.String str19 = soundex13.encode("H000");
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj22 = soundex13.encode((java.lang.Object) "hi!");
        java.lang.String str24 = soundex13.soundex("01230120022455012623010202");
        java.lang.String str26 = soundex13.encode("H000");
        java.lang.String str28 = soundex13.encode("H000");
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex();
        int int32 = soundex29.difference("H000", "");
        java.lang.String str34 = soundex29.encode("");
        int int37 = soundex29.difference("H000", "H000");
        java.lang.String str39 = soundex29.encode("");
        java.lang.String str41 = soundex29.encode("H000");
        int int44 = soundex29.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Object obj45 = soundex13.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = soundex1.encode(obj45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H000" + "'", obj22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "" + "'", obj47, "");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength((int) '#');
        java.lang.String str12 = soundex6.encode("");
        soundex6.setMaxLength(0);
        int int15 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        java.lang.String str17 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        java.lang.String str15 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        soundex0.setMaxLength((int) (byte) 100);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str18 = soundex16.encode("hi!");
        int int21 = soundex16.difference("hi!", "01230120022455012623010202");
        soundex16.setMaxLength(52);
        int int26 = soundex16.difference("hi!", "");
        soundex16.setMaxLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        int int22 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        java.lang.String str17 = soundex0.encode("");
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(97);
        soundex4.setMaxLength(0);
        soundex4.setMaxLength((int) (byte) 0);
        int int14 = soundex4.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        int int20 = soundex15.difference("hi!", "01230120022455012623010202");
        java.lang.String str22 = soundex15.soundex("");
        soundex15.setMaxLength((int) (short) -1);
        soundex15.setMaxLength((int) (short) 1);
        java.lang.String str28 = soundex15.soundex("01230120022455012623010202");
        java.lang.String str30 = soundex15.encode("");
        java.lang.String str32 = soundex15.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass33 = soundex15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex4.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str17 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass18 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("hi!", "");
        soundex0.setMaxLength((int) (short) 0);
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str6 = soundex0.soundex("");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        java.lang.String str27 = soundex0.soundex("01230120022455012623010202");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.difference("", "");
        int int13 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str15 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("");
        int int11 = soundex1.getMaxLength();
        int int12 = soundex1.getMaxLength();
        int int13 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength((int) '#');
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength(1);
        java.lang.String str11 = soundex0.encode("H000");
        soundex0.setMaxLength(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("hi!");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("H000", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        soundex0.setMaxLength((int) '4');
        java.lang.String str34 = soundex0.encode("H000");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        org.apache.commons.codec.language.Soundex soundex21 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str23 = soundex21.soundex("");
        soundex21.setMaxLength((int) (short) 1);
        java.lang.String str27 = soundex21.encode("");
        java.lang.String str29 = soundex21.soundex("01230120022455012623010202");
        int int30 = soundex21.getMaxLength();
        int int33 = soundex21.difference("", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex0.encode((java.lang.Object) soundex21);
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
        org.junit.Assert.assertNotNull(soundex21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("H000");
        java.lang.String str14 = soundex0.encode("H000");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        soundex0.setMaxLength((int) (byte) 100);
        int int20 = soundex0.difference("hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength(97);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = soundex1.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = soundex6.encode("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "H000");
        int int20 = soundex1.difference("hi!", "");
        java.lang.String str22 = soundex1.soundex("");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        int int14 = soundex0.difference("01230120022455012623010202", "hi!");
        int int15 = soundex0.getMaxLength();
        soundex0.setMaxLength(32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex10.difference("H000", "");
        java.lang.String str15 = soundex10.encode("");
        int int18 = soundex10.difference("H000", "H000");
        int int21 = soundex10.difference("H000", "01230120022455012623010202");
        java.lang.String str23 = soundex10.soundex("01230120022455012623010202");
        java.lang.Object obj24 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int6 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        int int22 = soundex0.difference("", "");
        int int23 = soundex0.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(52);
        java.lang.String str13 = soundex0.encode("hi!");
        int int14 = soundex0.getMaxLength();
        int int15 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int11 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str13 = soundex0.encode("hi!");
        int int16 = soundex0.difference("H000", "");
        char[] charArray20 = new char[] { '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex0.encode((java.lang.Object) charArray20);
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
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '4' });
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        int int14 = soundex1.difference("01230120022455012623010202", "H000");
        int int17 = soundex1.difference("", "01230120022455012623010202");
        int int18 = soundex1.getMaxLength();
        java.lang.String str20 = soundex1.encode("01230120022455012623010202");
        java.lang.String str22 = soundex1.soundex("H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        java.lang.String str14 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str17 = soundex15.encode("hi!");
        java.lang.String str19 = soundex15.soundex("01230120022455012623010202");
        java.lang.String str21 = soundex15.soundex("");
        java.lang.String str23 = soundex15.encode("");
        java.lang.Class<?> wildcardClass24 = soundex15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex0.encode((java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        int int19 = soundex15.getMaxLength();
        int int22 = soundex15.difference("H000", "hi!");
        java.lang.Object obj23 = soundex0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H000" + "'", obj23, "H000");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        java.lang.Class<?> wildcardClass22 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "H000");
        java.lang.String str15 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        java.lang.String str21 = soundex16.soundex("H000");
        int int22 = soundex16.getMaxLength();
        java.lang.String str24 = soundex16.encode("");
        java.lang.String str26 = soundex16.soundex("");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        int int45 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "H000" + "'", obj42, "H000");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        java.lang.String str8 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        char[] charArray25 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray25);
        java.lang.String str33 = soundex31.encode("01230120022455012623010202");
        java.lang.String str35 = soundex31.encode("");
        java.lang.Object obj36 = soundex1.encode((java.lang.Object) "");
        soundex1.setMaxLength((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
            java.lang.String str23 = soundex6.soundex("H000");
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
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str12 = soundex10.soundex("");
        int int13 = soundex10.getMaxLength();
        int int16 = soundex10.difference("", "01230120022455012623010202");
        soundex10.setMaxLength(97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = soundex10.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        java.lang.String str22 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        java.lang.String str19 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str22 = soundex20.encode("hi!");
        int int25 = soundex20.difference("hi!", "01230120022455012623010202");
        java.lang.String str27 = soundex20.encode("H000");
        int int28 = soundex20.getMaxLength();
        java.lang.String str30 = soundex20.encode("H000");
        java.lang.Object obj31 = soundex0.encode((java.lang.Object) "H000");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H000" + "'", obj31, "H000");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.String str8 = soundex0.soundex("");
        java.lang.String str10 = soundex0.encode("H000");
        int int13 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        java.lang.String str21 = soundex16.encode("");
        java.lang.String str23 = soundex16.soundex("hi!");
        int int24 = soundex16.getMaxLength();
        java.lang.String str26 = soundex16.encode("01230120022455012623010202");
        int int29 = soundex16.difference("H000", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) int29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        soundex0.setMaxLength((int) '#');
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) '#');
        int int9 = soundex6.getMaxLength();
        int int10 = soundex6.getMaxLength();
        java.lang.String str12 = soundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex6.difference("hi!", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str17 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (short) 10);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str22 = soundex20.encode("hi!");
        java.lang.String str24 = soundex20.encode("");
        int int27 = soundex20.difference("", "H000");
        int int28 = soundex20.getMaxLength();
        int int29 = soundex20.getMaxLength();
        soundex20.setMaxLength((int) (short) 10);
        soundex20.setMaxLength((int) (short) -1);
        soundex20.setMaxLength(4);
        soundex20.setMaxLength((int) ' ');
        java.lang.String str39 = soundex20.soundex("hi!");
        int int40 = soundex20.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = soundex0.encode((java.lang.Object) int40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H000" + "'", str39, "H000");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex5.setMaxLength((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        int int22 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        java.lang.String str25 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex();
        int int29 = soundex26.difference("H000", "");
        java.lang.String str31 = soundex26.encode("");
        int int34 = soundex26.difference("H000", "H000");
        soundex26.setMaxLength((int) (short) 100);
        soundex26.setMaxLength((int) (short) -1);
        int int41 = soundex26.difference("", "hi!");
        int int42 = soundex26.getMaxLength();
        java.lang.String str44 = soundex26.encode("");
        java.lang.String str46 = soundex26.soundex("H000");
        java.lang.Object obj47 = soundex0.encode((java.lang.Object) "H000");
        soundex0.setMaxLength(32);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "H000" + "'", str46, "H000");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "H000" + "'", obj47, "H000");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        java.lang.String str10 = soundex0.encode("");
        int int11 = soundex0.getMaxLength();
        int int14 = soundex0.difference("hi!", "hi!");
        java.lang.String str16 = soundex0.soundex("H000");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int7 = soundex0.difference("H000", "hi!");
        java.lang.String str9 = soundex0.encode("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        java.lang.String str13 = soundex0.soundex("");
        int int14 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex5.difference("H000", "");
        java.lang.String str10 = soundex5.encode("");
        java.lang.String str12 = soundex5.soundex("");
        java.lang.String str14 = soundex5.encode("H000");
        java.lang.Object obj15 = soundex1.encode((java.lang.Object) str14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "H000" + "'", obj15, "H000");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        char[] charArray3 = new char[] { '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '4', '4', '4' });
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str13 = soundex0.soundex("hi!");
        java.lang.String str15 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("hi!");
        soundex0.setMaxLength(52);
        int int15 = soundex0.getMaxLength();
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("H000", "hi!");
        soundex0.setMaxLength((int) (byte) 100);
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
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int16 = soundex0.difference("hi!", "hi!");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        java.lang.String str24 = soundex0.encode("");
        java.lang.String str26 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        int int28 = soundex27.getMaxLength();
        int int29 = soundex27.getMaxLength();
        java.lang.String str31 = soundex27.soundex("H000");
        java.lang.String str33 = soundex27.encode("H000");
        soundex27.setMaxLength((-1));
        int int38 = soundex27.difference("", "");
        int int41 = soundex27.difference("", "hi!");
        java.lang.Class<?> wildcardClass42 = soundex27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = soundex0.encode((java.lang.Object) wildcardClass42);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int23 = soundex20.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str25 = soundex20.encode("01230120022455012623010202");
        java.lang.String str27 = soundex20.encode("H000");
        int int30 = soundex20.difference("", "H000");
        soundex20.setMaxLength((int) (short) 1);
        soundex20.setMaxLength(35);
        soundex20.setMaxLength((int) (byte) 100);
        int int37 = soundex20.getMaxLength();
        java.lang.String str39 = soundex20.soundex("01230120022455012623010202");
        java.lang.String str41 = soundex20.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = soundex0.encode((java.lang.Object) soundex20);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("");
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) 0);
        int int7 = soundex0.difference("", "");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.soundex("H000");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str18 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex();
        int int6 = soundex5.getMaxLength();
        int int7 = soundex5.getMaxLength();
        java.lang.String str9 = soundex5.soundex("hi!");
        java.lang.Object obj10 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(97);
        soundex0.setMaxLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H000" + "'", obj10, "H000");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.soundex("");
        int int12 = soundex0.difference("H000", "H000");
        int int15 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int12 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        int int19 = soundex0.difference("", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        int int8 = soundex5.getMaxLength();
        soundex5.setMaxLength(100);
        java.lang.String str12 = soundex5.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("hi!", "");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.encode("hi!");
        int int16 = soundex0.difference("", "");
        java.lang.Class<?> wildcardClass17 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        int int19 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex20.difference("H000", "");
        java.lang.String str25 = soundex20.encode("");
        int int26 = soundex20.getMaxLength();
        soundex20.setMaxLength((-1));
        int int31 = soundex20.difference("", "");
        java.lang.String str33 = soundex20.encode("H000");
        java.lang.Object obj34 = soundex0.encode((java.lang.Object) "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "H000" + "'", obj34, "H000");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        soundex0.setMaxLength((int) (byte) 100);
        soundex0.setMaxLength(32);
        java.lang.Class<?> wildcardClass25 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str9 = soundex7.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.Class<?> wildcardClass19 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        // The following exception was thrown during execution in test generation
        try {
            int int36 = soundex3.difference("hi!", "H000");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int3 = soundex0.getMaxLength();
        int int6 = soundex0.difference("01230120022455012623010202", "H000");
        int int9 = soundex0.difference("", "H000");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.encode("H000");
        java.lang.String str14 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int16 = soundex15.getMaxLength();
        int int17 = soundex15.getMaxLength();
        java.lang.String str19 = soundex15.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        java.lang.String str24 = soundex20.soundex("hi!");
        java.lang.Object obj25 = soundex15.encode((java.lang.Object) "hi!");
        int int28 = soundex15.difference("", "");
        java.lang.Object obj29 = soundex0.encode((java.lang.Object) "");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str33 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H000" + "'", obj25, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex19.getMaxLength();
        int int21 = soundex19.getMaxLength();
        java.lang.String str23 = soundex19.encode("");
        int int24 = soundex19.getMaxLength();
        int int27 = soundex19.difference("", "H000");
        int int30 = soundex19.difference("01230120022455012623010202", "H000");
        java.lang.String str32 = soundex19.encode("01230120022455012623010202");
        int int35 = soundex19.difference("H000", "");
        java.lang.Class<?> wildcardClass36 = soundex19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex0.encode((java.lang.Object) wildcardClass36);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 10);
        int int17 = soundex0.difference("H000", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex10.difference("H000", "");
        java.lang.String str15 = soundex10.encode("");
        int int16 = soundex10.getMaxLength();
        java.lang.String str18 = soundex10.soundex("hi!");
        int int19 = soundex10.getMaxLength();
        java.lang.String str21 = soundex10.soundex("01230120022455012623010202");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) str21);
        int int25 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(35);
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(52);
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str19 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.String str17 = soundex0.soundex("H000");
        java.lang.String str19 = soundex0.soundex("");
        int int22 = soundex0.difference("H000", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        int int12 = soundex0.difference("", "hi!");
        java.lang.String str14 = soundex0.encode("");
        int int17 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((-1));
        java.lang.String str21 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("H000", "H000");
        java.lang.String str18 = soundex0.encode("01230120022455012623010202");
        java.lang.String str20 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        char[] charArray6 = new char[] { 'a', '#', ' ', '4', ' ', 'a' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.String str10 = soundex8.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', ' ', '4', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("");
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        int int12 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        int int19 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(10);
        java.lang.String str9 = soundex5.soundex("01230120022455012623010202");
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) -1);
        int int13 = soundex5.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int17 = soundex14.difference("H000", "");
        java.lang.String str19 = soundex14.encode("");
        java.lang.String str21 = soundex14.soundex("");
        java.lang.String str23 = soundex14.soundex("hi!");
        int int24 = soundex14.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex5.encode((java.lang.Object) int24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.soundex("H000");
        soundex0.setMaxLength(52);
        int int8 = soundex0.getMaxLength();
        java.lang.String str10 = soundex0.soundex("");
        soundex0.setMaxLength(0);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        soundex0.setMaxLength((int) (short) 0);
        int int21 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "");
        soundex0.setMaxLength(32);
        java.lang.String str15 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        soundex0.setMaxLength(32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        java.lang.String str19 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "H000" + "'", obj8, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        int int14 = soundex0.difference("", "H000");
        java.lang.String str16 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.soundex("H000");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        java.lang.String str21 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex();
        int int25 = soundex22.difference("H000", "");
        int int26 = soundex22.getMaxLength();
        java.lang.String str28 = soundex22.soundex("hi!");
        soundex22.setMaxLength((int) (short) -1);
        int int31 = soundex22.getMaxLength();
        java.lang.String str33 = soundex22.soundex("01230120022455012623010202");
        int int36 = soundex22.difference("", "01230120022455012623010202");
        java.lang.Object obj37 = soundex0.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass38 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        soundex0.setMaxLength(97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str7 = soundex0.soundex("");
        int int8 = soundex0.getMaxLength();
        int int11 = soundex0.difference("hi!", "H000");
        soundex0.setMaxLength(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        java.lang.String str9 = soundex0.soundex("H000");
        int int12 = soundex0.difference("H000", "");
        soundex0.setMaxLength(100);
        java.lang.String str16 = soundex0.encode("");
        java.lang.String str18 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        int int23 = soundex0.difference("hi!", "01230120022455012623010202");
        int int24 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        java.lang.String str18 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) -1);
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
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("");
        int int15 = soundex0.getMaxLength();
        int int18 = soundex0.difference("hi!", "");
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
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        int int15 = soundex0.difference("", "hi!");
        soundex0.setMaxLength((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        java.lang.String str7 = soundex4.encode("");
        int int8 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        char[] charArray23 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex34 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex35 = new org.apache.commons.codec.language.Soundex(charArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) charArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        int int3 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.soundex("");
        int int9 = soundex6.getMaxLength();
        int int10 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int14 = soundex11.difference("H000", "");
        int int15 = soundex11.getMaxLength();
        int int18 = soundex11.difference("H000", "hi!");
        java.lang.String str20 = soundex11.encode("hi!");
        java.lang.String str22 = soundex11.encode("01230120022455012623010202");
        java.lang.Object obj23 = soundex6.encode((java.lang.Object) str22);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        java.lang.String str9 = soundex1.encode("");
        java.lang.String str11 = soundex1.encode("01230120022455012623010202");
        int int12 = soundex1.getMaxLength();
        java.lang.String str14 = soundex1.encode("hi!");
        java.lang.String str16 = soundex1.encode("H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        int int12 = soundex0.difference("H000", "");
        java.lang.String str14 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        java.lang.String str20 = soundex15.encode("");
        java.lang.String str22 = soundex15.soundex("");
        java.lang.String str24 = soundex15.encode("H000");
        java.lang.String str26 = soundex15.encode("");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) str26);
        java.lang.String str29 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        soundex0.setMaxLength((int) (short) 100);
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str14 = soundex0.soundex("");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.soundex("H000");
        java.lang.String str19 = soundex0.encode("");
        int int20 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        soundex0.setMaxLength(0);
        java.lang.String str15 = soundex0.soundex("H000");
        int int16 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str20 = soundex18.encode("");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        int int13 = soundex0.difference("", "hi!");
        int int16 = soundex0.difference("H000", "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        int int10 = soundex0.difference("", "");
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        int int14 = soundex1.getMaxLength();
        int int17 = soundex1.difference("H000", "hi!");
        java.lang.String str19 = soundex1.encode("H000");
        int int20 = soundex1.getMaxLength();
        int int21 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int6 = soundex0.difference("hi!", "01230120022455012623010202");
        int int7 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        java.lang.String str19 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int8 = soundex0.difference("H000", "H000");
        java.lang.String str10 = soundex0.encode("");
        java.lang.String str12 = soundex0.encode("H000");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str16 = soundex0.encode("01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        soundex0.setMaxLength((int) '#');
        java.lang.String str9 = soundex0.encode("");
        soundex0.setMaxLength((int) ' ');
        soundex0.setMaxLength(52);
        java.lang.String str15 = soundex0.encode("");
        int int16 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex();
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        java.lang.String str12 = soundex8.encode("");
        int int15 = soundex8.difference("H000", "");
        int int16 = soundex8.getMaxLength();
        int int17 = soundex8.getMaxLength();
        soundex8.setMaxLength((int) (byte) -1);
        soundex8.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex6.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength((int) ' ');
        int int10 = soundex1.difference("", "01230120022455012623010202");
        int int11 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        int int16 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("H000");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str15 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength(4);
        java.lang.String str5 = soundex1.soundex("01230120022455012623010202");
        int int8 = soundex1.difference("", "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        int int8 = soundex0.difference("", "hi!");
        java.lang.String str10 = soundex0.encode("hi!");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        java.lang.Class<?> wildcardClass19 = soundex10.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.String str13 = soundex0.encode("");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.soundex("01230120022455012623010202");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        java.lang.String str16 = soundex0.encode("H000");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        int int14 = soundex0.difference("hi!", "hi!");
        int int15 = soundex0.getMaxLength();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex0.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str8 = soundex6.encode("hi!");
        int int9 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        int int22 = soundex0.difference("H000", "hi!");
        java.lang.String str24 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("hi!");
        int int15 = soundex0.getMaxLength();
        java.lang.String str17 = soundex0.encode("H000");
        java.lang.String str19 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) ' ');
        soundex6.setMaxLength((int) ' ');
        java.lang.String str12 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.encode("hi!");
        int int9 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength(52);
        java.lang.String str13 = soundex0.encode("hi!");
        int int14 = soundex0.getMaxLength();
        int int15 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        int int8 = soundex0.difference("hi!", "");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("hi!");
        java.lang.String str14 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.encode("");
        soundex0.setMaxLength(0);
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        java.lang.String str10 = soundex0.soundex("H000");
        java.lang.String str12 = soundex0.encode("H000");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(0);
        java.lang.String str5 = soundex1.encode("");
        java.lang.String str7 = soundex1.soundex("");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = soundex1.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        soundex1.setMaxLength(35);
        soundex1.setMaxLength((int) (byte) 100);
        int int18 = soundex1.getMaxLength();
        java.lang.String str20 = soundex1.soundex("01230120022455012623010202");
        int int23 = soundex1.difference("H000", "01230120022455012623010202");
        int int26 = soundex1.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("hi!");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("01230120022455012623010202");
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength(4);
        java.lang.String str5 = soundex1.soundex("");
        int int6 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("hi!");
        java.lang.String str16 = soundex0.encode("hi!");
        int int19 = soundex0.difference("H000", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(4);
        java.lang.String str12 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        soundex0.setMaxLength(10);
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.encode("H000");
        java.lang.String str17 = soundex0.soundex("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex0.difference("", "H000");
        int int15 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str17 = soundex0.encode("hi!");
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        int int20 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        soundex3.setMaxLength(35);
        int int30 = soundex3.getMaxLength();
        java.lang.Class<?> wildcardClass31 = soundex3.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength(10);
        soundex0.setMaxLength((int) '#');
        int int13 = soundex0.getMaxLength();
        java.lang.String str15 = soundex0.soundex("H000");
        int int16 = soundex0.getMaxLength();
        int int19 = soundex0.difference("", "H000");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        soundex13.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', '4', '#' });
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        soundex0.setMaxLength(52);
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
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) -1);
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) '4');
        int int14 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        soundex0.setMaxLength(0);
        soundex0.setMaxLength((-1));
        java.lang.String str15 = soundex0.encode("H000");
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        int int23 = soundex0.difference("H000", "H000");
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex();
        int int25 = soundex24.getMaxLength();
        int int26 = soundex24.getMaxLength();
        soundex24.setMaxLength((int) (byte) -1);
        soundex24.setMaxLength((int) (short) 10);
        int int31 = soundex24.getMaxLength();
        java.lang.Object obj33 = soundex24.encode((java.lang.Object) "01230120022455012623010202");
        int int36 = soundex24.difference("hi!", "");
        soundex24.setMaxLength((int) (byte) -1);
        org.apache.commons.codec.language.Soundex soundex39 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int40 = soundex39.getMaxLength();
        soundex39.setMaxLength(100);
        java.lang.String str44 = soundex39.encode("hi!");
        java.lang.String str46 = soundex39.soundex("");
        java.lang.String str48 = soundex39.soundex("");
        java.lang.Object obj49 = soundex24.encode((java.lang.Object) "");
        java.lang.String str51 = soundex24.soundex("");
        java.lang.Object obj52 = soundex0.encode((java.lang.Object) "");
        java.lang.String str54 = soundex0.soundex("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(soundex39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "H000" + "'", str44, "H000");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "" + "'", obj52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "H000" + "'", str54, "H000");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        int int10 = soundex0.getMaxLength();
        int int11 = soundex0.getMaxLength();
        java.lang.String str13 = soundex0.soundex("H000");
        int int16 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str18 = soundex0.soundex("H000");
        int int21 = soundex0.difference("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.soundex("H000");
        int int16 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str6 = soundex4.encode("01230120022455012623010202");
        soundex4.setMaxLength(32);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        char[] charArray4 = new char[] { 'a', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int10 = soundex9.getMaxLength();
        int int13 = soundex9.difference("", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str16 = soundex14.encode("hi!");
        java.lang.String str18 = soundex14.soundex("01230120022455012623010202");
        int int21 = soundex14.difference("", "");
        soundex14.setMaxLength((int) (byte) 0);
        int int26 = soundex14.difference("H000", "01230120022455012623010202");
        int int29 = soundex14.difference("H000", "H000");
        int int32 = soundex14.difference("hi!", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex9.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str16 = soundex14.encode("hi!");
        java.lang.String str18 = soundex14.soundex("hi!");
        java.lang.String str20 = soundex14.soundex("hi!");
        java.lang.String str22 = soundex14.soundex("01230120022455012623010202");
        soundex14.setMaxLength((int) '4');
        int int25 = soundex14.getMaxLength();
        soundex14.setMaxLength((int) '4');
        java.lang.String str29 = soundex14.soundex("hi!");
        java.lang.Object obj30 = soundex0.encode((java.lang.Object) "hi!");
        int int33 = soundex0.difference("01230120022455012623010202", "H000");
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "H000" + "'", obj30, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        int int11 = soundex1.difference("", "H000");
        soundex1.setMaxLength((int) (short) 1);
        soundex1.setMaxLength(35);
        soundex1.setMaxLength((int) (byte) 100);
        int int18 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("01230120022455012623010202", "H000");
        java.lang.String str7 = soundex0.soundex("");
        int int8 = soundex0.getMaxLength();
        int int11 = soundex0.difference("hi!", "H000");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str14 = soundex12.encode("hi!");
        java.lang.String str16 = soundex12.encode("");
        java.lang.String str18 = soundex12.encode("H000");
        java.lang.String str20 = soundex12.soundex("01230120022455012623010202");
        java.lang.String str22 = soundex12.soundex("H000");
        int int23 = soundex12.getMaxLength();
        int int24 = soundex12.getMaxLength();
        int int27 = soundex12.difference("01230120022455012623010202", "hi!");
        java.lang.Class<?> wildcardClass28 = soundex12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str8 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        java.lang.String str21 = soundex0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.Object obj9 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        int int12 = soundex0.difference("hi!", "");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        soundex4.setMaxLength(0);
        int int12 = soundex4.difference("", "01230120022455012623010202");
        int int15 = soundex4.difference("01230120022455012623010202", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = soundex4.difference("H000", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray10 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str14 = soundex12.soundex("");
        java.lang.Object obj15 = soundex7.encode((java.lang.Object) "");
        java.lang.String str17 = soundex7.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = soundex7.difference("", "H000");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        int int8 = soundex0.getMaxLength();
        int int9 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) '4');
        java.lang.String str15 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        soundex0.setMaxLength(35);
        soundex0.setMaxLength((int) (short) 100);
        java.lang.String str24 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("hi!");
        soundex0.setMaxLength(4);
        int int19 = soundex0.difference("hi!", "H000");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) 'a');
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int7 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 0);
        int int12 = soundex0.difference("H000", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        int int13 = soundex0.difference("hi!", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str11 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        java.lang.String str15 = soundex0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        java.lang.Class<?> wildcardClass28 = soundex1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str6 = soundex1.encode("01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("H000");
        java.lang.String str10 = soundex1.encode("01230120022455012623010202");
        java.lang.String str12 = soundex1.encode("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str14 = soundex0.encode("hi!");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        java.lang.String str20 = soundex15.encode("");
        java.lang.String str22 = soundex15.soundex("");
        java.lang.String str24 = soundex15.soundex("hi!");
        int int25 = soundex15.getMaxLength();
        int int26 = soundex15.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex();
        int int30 = soundex27.difference("H000", "");
        int int31 = soundex27.getMaxLength();
        java.lang.String str33 = soundex27.soundex("hi!");
        java.lang.Object obj34 = soundex15.encode((java.lang.Object) "hi!");
        soundex15.setMaxLength((int) (short) 100);
        int int37 = soundex15.getMaxLength();
        int int38 = soundex15.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex0.encode((java.lang.Object) int38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "H000" + "'", obj34, "H000");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        java.lang.String str21 = soundex0.encode("01230120022455012623010202");
        int int22 = soundex0.getMaxLength();
        int int25 = soundex0.difference("", "hi!");
        java.lang.Class<?> wildcardClass26 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass8 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str6 = soundex0.soundex("H000");
        soundex0.setMaxLength(4);
        soundex0.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        char[] charArray31 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray31);
        soundex32.setMaxLength((int) '4');
        soundex32.setMaxLength(0);
        int int39 = soundex32.difference("", "01230120022455012623010202");
        java.lang.Object obj40 = soundex0.encode((java.lang.Object) "");
        int int41 = soundex0.getMaxLength();
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength(0);
        int int11 = soundex0.getMaxLength();
        int int14 = soundex0.difference("", "H000");
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex();
        int int18 = soundex15.difference("H000", "");
        java.lang.String str20 = soundex15.encode("");
        int int23 = soundex15.difference("H000", "H000");
        soundex15.setMaxLength((int) (short) 100);
        soundex15.setMaxLength((int) (short) -1);
        int int28 = soundex15.getMaxLength();
        int int31 = soundex15.difference("H000", "H000");
        java.lang.String str33 = soundex15.encode("01230120022455012623010202");
        java.lang.Object obj34 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("H000");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength((-1));
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        int int13 = soundex0.difference("hi!", "01230120022455012623010202");
        int int14 = soundex0.getMaxLength();
        int int17 = soundex0.difference("hi!", "");
        soundex0.setMaxLength(4);
        int int22 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int25 = soundex0.difference("", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray15 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        soundex16.setMaxLength(10);
        soundex16.setMaxLength((int) '#');
        int int21 = soundex16.getMaxLength();
        java.lang.Class<?> wildcardClass22 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex9.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("H000");
        int int12 = soundex0.difference("", "");
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("");
        int int19 = soundex0.difference("hi!", "H000");
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str11 = soundex0.encode("H000");
        java.lang.String str13 = soundex0.encode("H000");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        int int15 = soundex14.getMaxLength();
        int int16 = soundex14.getMaxLength();
        java.lang.String str18 = soundex14.soundex("hi!");
        soundex14.setMaxLength((int) '4');
        int int21 = soundex14.getMaxLength();
        java.lang.String str23 = soundex14.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex0.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        int int20 = soundex0.difference("", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex();
        int int25 = soundex24.getMaxLength();
        int int26 = soundex24.getMaxLength();
        java.lang.String str28 = soundex24.encode("hi!");
        java.lang.String str30 = soundex24.encode("H000");
        java.lang.String str32 = soundex24.encode("");
        int int35 = soundex24.difference("01230120022455012623010202", "hi!");
        int int38 = soundex24.difference("H000", "");
        java.lang.Class<?> wildcardClass39 = soundex24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = soundex0.encode((java.lang.Object) soundex24);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H000" + "'", str30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.encode("H000");
        java.lang.String str12 = soundex0.encode("");
        java.lang.String str14 = soundex0.encode("hi!");
        int int15 = soundex0.getMaxLength();
        int int16 = soundex0.getMaxLength();
        java.lang.String str18 = soundex0.soundex("hi!");
        int int21 = soundex0.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        int int18 = soundex0.difference("", "");
        int int19 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        soundex8.setMaxLength(10);
        soundex8.setMaxLength(0);
        java.lang.String str18 = soundex8.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.encode("hi!");
        int int11 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str13 = soundex0.encode("");
        java.lang.String str15 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str18 = soundex16.encode("hi!");
        int int21 = soundex16.difference("hi!", "01230120022455012623010202");
        java.lang.String str23 = soundex16.soundex("");
        soundex16.setMaxLength((int) (short) -1);
        soundex16.setMaxLength((int) (short) 1);
        soundex16.setMaxLength(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) soundex16);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("hi!");
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) (short) 100);
        int int18 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        java.lang.String str30 = soundex0.soundex("01230120022455012623010202");
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
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.encode("H000");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) (short) 0);
        java.lang.String str14 = soundex0.soundex("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        soundex0.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "H000");
        int int10 = soundex0.difference("", "H000");
        int int13 = soundex0.difference("01230120022455012623010202", "hi!");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        int int18 = soundex0.getMaxLength();
        int int19 = soundex0.getMaxLength();
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex0.encode(obj20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int9 = soundex0.getMaxLength();
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        int int8 = soundex0.difference("H000", "hi!");
        java.lang.String str10 = soundex0.soundex("H000");
        int int13 = soundex0.difference("H000", "01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("hi!");
        int int18 = soundex0.difference("01230120022455012623010202", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        soundex0.setMaxLength((int) ' ');
        java.lang.String str14 = soundex0.soundex("");
        java.lang.Class<?> wildcardClass15 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(10);
        soundex6.setMaxLength((int) (byte) 10);
        java.lang.String str12 = soundex6.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str13 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        soundex0.setMaxLength(35);
        int int21 = soundex0.getMaxLength();
        int int24 = soundex0.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        int int11 = soundex10.getMaxLength();
        int int12 = soundex10.getMaxLength();
        soundex10.setMaxLength((int) (byte) -1);
        soundex10.setMaxLength((int) (short) 10);
        int int17 = soundex10.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex18.difference("H000", "");
        java.lang.String str23 = soundex18.encode("");
        java.lang.String str25 = soundex18.soundex("");
        java.lang.String str27 = soundex18.soundex("hi!");
        int int28 = soundex18.getMaxLength();
        int int29 = soundex18.getMaxLength();
        java.lang.String str31 = soundex18.encode("H000");
        java.lang.Object obj32 = soundex10.encode((java.lang.Object) str31);
        int int33 = soundex10.getMaxLength();
        int int36 = soundex10.difference("", "01230120022455012623010202");
        java.lang.Object obj37 = soundex0.encode((java.lang.Object) "01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H000" + "'", obj32, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        char[] charArray5 = new char[] { '#', 'a', '4', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength(0);
        java.lang.String str14 = soundex8.soundex("");
        java.lang.String str16 = soundex8.soundex("01230120022455012623010202");
        java.lang.String str18 = soundex8.soundex("");
        java.lang.Class<?> wildcardClass19 = soundex8.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        java.lang.String str19 = soundex0.encode("01230120022455012623010202");
        int int20 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        java.lang.Class<?> wildcardClass29 = soundex0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        char[] charArray5 = new char[] { ' ', ' ', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) 'a');
        java.lang.String str10 = soundex6.encode("");
        java.lang.String str12 = soundex6.encode("");
        int int13 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex6.encode("hi!");
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
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex16.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("", "");
        java.lang.String str7 = soundex0.soundex("01230120022455012623010202");
        int int10 = soundex0.difference("", "");
        java.lang.String str12 = soundex0.encode("hi!");
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        int int7 = soundex0.difference("", "H000");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("");
        java.lang.String str13 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex14 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int17 = soundex14.difference("01230120022455012623010202", "H000");
        java.lang.String str19 = soundex14.encode("");
        java.lang.String str21 = soundex14.encode("");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) str21);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int27 = soundex24.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str29 = soundex24.encode("01230120022455012623010202");
        java.lang.String str31 = soundex24.encode("H000");
        int int34 = soundex24.difference("", "H000");
        int int37 = soundex24.difference("01230120022455012623010202", "H000");
        java.lang.String str39 = soundex24.soundex("01230120022455012623010202");
        java.lang.Object obj40 = soundex0.encode((java.lang.Object) str39);
        java.lang.String str42 = soundex0.encode("");
        java.lang.String str44 = soundex0.soundex("hi!");
        java.lang.String str46 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(soundex14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H000" + "'", str31, "H000");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "H000" + "'", str44, "H000");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "H000" + "'", str46, "H000");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int5 = soundex0.difference("01230120022455012623010202", "");
        soundex0.setMaxLength(10);
        java.lang.String str9 = soundex0.soundex("");
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("01230120022455012623010202", "01230120022455012623010202");
        int int7 = soundex1.difference("", "hi!");
        int int10 = soundex1.difference("hi!", "H000");
        int int11 = soundex1.getMaxLength();
        java.lang.String str13 = soundex1.soundex("01230120022455012623010202");
        int int14 = soundex1.getMaxLength();
        java.lang.String str16 = soundex1.soundex("H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex12.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        char[] charArray2 = new char[] { '#', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = soundex0.difference("H000", "01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str12 = soundex0.soundex("01230120022455012623010202");
        int int15 = soundex0.difference("", "hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        char[] charArray5 = new char[] { '4', '#', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int9 = soundex8.getMaxLength();
        int int10 = soundex8.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        soundex0.setMaxLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) '4');
        java.lang.Class<?> wildcardClass7 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((int) '4');
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str15 = soundex0.soundex("");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str19 = soundex17.encode("");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        java.lang.String str24 = soundex20.soundex("H000");
        java.lang.String str26 = soundex20.encode("H000");
        soundex20.setMaxLength((-1));
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex();
        int int32 = soundex29.difference("H000", "");
        java.lang.String str34 = soundex29.encode("");
        java.lang.String str36 = soundex29.soundex("");
        java.lang.String str38 = soundex29.soundex("hi!");
        int int39 = soundex29.getMaxLength();
        int int40 = soundex29.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex();
        int int44 = soundex41.difference("H000", "");
        int int45 = soundex41.getMaxLength();
        java.lang.String str47 = soundex41.soundex("hi!");
        java.lang.Object obj48 = soundex29.encode((java.lang.Object) "hi!");
        java.lang.Object obj49 = soundex20.encode((java.lang.Object) "hi!");
        int int52 = soundex20.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.Object obj53 = soundex17.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str55 = soundex17.encode("hi!");
        java.lang.Object obj56 = soundex0.encode((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H000" + "'", str38, "H000");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "H000" + "'", str47, "H000");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "H000" + "'", obj48, "H000");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "H000" + "'", obj49, "H000");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "" + "'", obj53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "H000" + "'", str55, "H000");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "H000" + "'", obj56, "H000");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        java.lang.String str5 = soundex0.encode("");
        int int6 = soundex0.getMaxLength();
        soundex0.setMaxLength((-1));
        int int11 = soundex0.difference("", "");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("H000");
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        int int28 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        int int34 = soundex0.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        java.lang.String str21 = soundex0.soundex("01230120022455012623010202");
        java.lang.Class<?> wildcardClass22 = soundex0.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.soundex("hi!");
        java.lang.String str11 = soundex0.encode("hi!");
        int int12 = soundex0.getMaxLength();
        int int13 = soundex0.getMaxLength();
        int int16 = soundex0.difference("hi!", "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        int int7 = soundex0.difference("01230120022455012623010202", "hi!");
        java.lang.String str9 = soundex0.encode("H000");
        soundex0.setMaxLength(0);
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("H000", "hi!");
        java.lang.Class<?> wildcardClass16 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.encode("");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("H000");
        java.lang.String str14 = soundex0.soundex("hi!");
        java.lang.String str16 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        java.lang.String str6 = soundex0.soundex("hi!");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        int int11 = soundex0.difference("", "hi!");
        soundex0.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.encode("01230120022455012623010202");
        int int8 = soundex0.getMaxLength();
        char[] charArray10 = new char[] { '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex0.encode((java.lang.Object) charArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex();
        int int31 = soundex28.difference("H000", "");
        java.lang.String str33 = soundex28.encode("");
        int int36 = soundex28.difference("H000", "H000");
        int int39 = soundex28.difference("hi!", "");
        java.lang.String str41 = soundex28.encode("01230120022455012623010202");
        int int42 = soundex28.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = soundex0.encode((java.lang.Object) int42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("H000", "");
        int int4 = soundex0.getMaxLength();
        java.lang.String str6 = soundex0.encode("01230120022455012623010202");
        java.lang.String str8 = soundex0.encode("H000");
        soundex0.setMaxLength(97);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex();
        int int12 = soundex11.getMaxLength();
        int int13 = soundex11.getMaxLength();
        java.lang.String str15 = soundex11.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex();
        int int19 = soundex16.difference("H000", "");
        java.lang.Object obj20 = soundex11.encode((java.lang.Object) "H000");
        java.lang.Object obj21 = soundex0.encode(obj20);
        soundex0.setMaxLength(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H000" + "'", obj20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H000" + "'", obj21, "H000");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int7 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str9 = soundex0.soundex("01230120022455012623010202");
        soundex0.setMaxLength((-1));
        java.lang.String str13 = soundex0.soundex("hi!");
        java.lang.String str15 = soundex0.soundex("H000");
        java.lang.String str17 = soundex0.soundex("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.String str4 = soundex0.encode("hi!");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("hi!");
        java.lang.String str10 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str12 = soundex0.encode("");
        soundex0.setMaxLength((int) '#');
        java.lang.String str16 = soundex0.encode("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength((int) (short) 10);
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.soundex("H000");
        int int10 = soundex0.getMaxLength();
        java.lang.String str12 = soundex0.soundex("H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        soundex0.setMaxLength(52);
        int int9 = soundex0.getMaxLength();
        java.lang.String str11 = soundex0.soundex("H000");
        java.lang.String str13 = soundex0.encode("H000");
        java.lang.String str15 = soundex0.soundex("01230120022455012623010202");
        int int18 = soundex0.difference("01230120022455012623010202", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H000" + "'", str6, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        int int5 = soundex0.difference("hi!", "01230120022455012623010202");
        soundex0.setMaxLength(52);
        int int10 = soundex0.difference("hi!", "");
        int int13 = soundex0.difference("hi!", "H000");
        int int16 = soundex0.difference("hi!", "");
        soundex0.setMaxLength((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.soundex("hi!");
        soundex0.setMaxLength((int) (short) 10);
        int int9 = soundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int12 = soundex0.difference("", "H000");
        int int15 = soundex0.difference("01230120022455012623010202", "");
        java.lang.String str17 = soundex0.encode("hi!");
        java.lang.String str19 = soundex0.soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex();
        int int23 = soundex20.difference("H000", "");
        java.lang.String str25 = soundex20.encode("");
        int int28 = soundex20.difference("H000", "H000");
        soundex20.setMaxLength((int) (short) 100);
        soundex20.setMaxLength((int) (short) -1);
        java.lang.String str34 = soundex20.soundex("");
        int int35 = soundex20.getMaxLength();
        java.lang.String str37 = soundex20.soundex("H000");
        java.lang.String str39 = soundex20.encode("01230120022455012623010202");
        java.lang.String str41 = soundex20.encode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = soundex0.encode((java.lang.Object) soundex20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H000" + "'", str41, "H000");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        java.lang.String str18 = soundex0.soundex("H000");
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex();
        int int20 = soundex19.getMaxLength();
        int int21 = soundex19.getMaxLength();
        soundex19.setMaxLength((int) (byte) -1);
        int int26 = soundex19.difference("", "01230120022455012623010202");
        java.lang.String str28 = soundex19.soundex("01230120022455012623010202");
        soundex19.setMaxLength((-1));
        java.lang.String str32 = soundex19.soundex("hi!");
        java.lang.String str34 = soundex19.soundex("H000");
        java.lang.Object obj35 = soundex0.encode((java.lang.Object) "H000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H000" + "'", str32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H000" + "'", str34, "H000");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "H000" + "'", obj35, "H000");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("hi!");
        java.lang.String str4 = soundex0.encode("");
        java.lang.String str6 = soundex0.encode("H000");
        java.lang.String str8 = soundex0.soundex("01230120022455012623010202");
        java.lang.String str10 = soundex0.soundex("H000");
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength(1);
        char[] charArray18 = new char[] { '4', '4', '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray18);
        java.lang.Class<?> wildcardClass26 = soundex25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex0.encode((java.lang.Object) wildcardClass26);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '4', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass26);
    }
}
