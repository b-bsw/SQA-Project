package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        int int1 = org.apache.commons.lang3.StringUtils.length("I            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!h", 497, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("    HI!HHI!I!       HI!HHI!I!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Hi#         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444HI!44444I!HI!H44444HI!44444", "... ...", "HHhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444HI!44444I!HI!H44444HI!44444" + "'", str3, "44444HI!44444I!HI!H44444HI!44444");
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hhhhhhhhhh", "4 H!            H!### H!HHI H!#### H!            H!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhh" + "'", str2, "hhhhhhhhhh");
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H" + "'", str1, "!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H");
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...", "                                                                    444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHH");
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!H#!H...", "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###HHI####    ...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###HHI####", "", "", "", "..." });
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 243, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!h", "           I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           I" + "'", str2, "           I");
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         ", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         " + "'", str2, "HHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         ");
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        ...        ...HHHHHHHHHHHHH", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "        ...        ...HHHHHHHHHHHHH" });
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444!i!       ", "...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..", 433);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444!i!       " });
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!H                    4ih                !H                    4ih                !H    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 8, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("###HHI####", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("iiiiiiiiiiiiiiiiiiiiihi!h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                                                                                          ###H", "              HH             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!I!...", 2, "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I!..." + "'", str3, "!I!...");
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("################################################################ i", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444");
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                             ", "HHIIIIIIIIIIIIIIIIIIIIIHI!H");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I                         ...44444444444444444444444", "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("                HHHHHHHHHHHHHHH", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                             " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "I                         ...44444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                HHHHHHHHHHHHHHH" + "'", str7, "                HHHHHHHHHHHHHHH");
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hhi!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!I!" + "'", str1, "Hhi!I!");
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH", "           HHI           ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH" });
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...h!ih!ih", "        444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h!ih!ih" + "'", str2, "...h!ih!ih");
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", "I4...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !" + "'", str3, "              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", "444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I Hh                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################" + "'", str2, "                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###" + "'", str1, "####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###");
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################################################################################" + "'", str1, "################################################################################################################");
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         " + "'", str2, "HHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ");
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444444I...4444444444444", 40, 352);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("H H...", "I                         ...aa###HHI####aaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#" + "'", str2, "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#");
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("            ...H!IH!I", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...hi!hi!hi!hi!hi!hi!hi!hi!                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("           ###HHI####", 433, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ###HHI####aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ###HHI####aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hia#          hia#", 338);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                hia#          hia#                                                                                                                                                                " + "'", str2, "                                                                                                                                                                hia#          hia#                                                                                                                                                                ");
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H", "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa" + "'", str2, "aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa");
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###aaa###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                     hhhhhhhhhhhhhh", "                                                      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("   ###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih", "#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih" + "'", str2, "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih");
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!hi!hi!hi!hi!h           ####i           ####i           ####i           ####i           ####i           ####i...", "hiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiH...      ...       ", "hH444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hH!hH!hH!hH!hH!hH!hH!h####H####H####H####H####H####H" + "'", str3, "hH!hH!hH!hH!hH!hH!hH!h####H####H####H####H####H####H");
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hiah", "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("aaaaaaaaaaaaaaaaaaaaahi#!", "############################################################################################################################################################################################################################################################################################################I                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!" + "'", str1, "H!");
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!i!...", 120, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################i!i!...#########################################################" + "'", str3, "########################################################i!i!...#########################################################");
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!H");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "hi!");
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!", 35, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444       4ih###############################4444444       ", strArray4, strArray9);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split(".hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("      ###HHI####           ", strArray4, strArray19);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray22, "       ");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray22);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", strArray4, strArray22);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!H" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4444444       4ih###############################4444444       " + "'", str17, "4444444       4ih###############################4444444       ");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { ".hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "      ###HHI####           " + "'", str20, "      ###HHI####           ");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi" + "'", str26, "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                     II                                  II                                  II                                  II ", "...44444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                     II                                  II                                  II                                  II " });
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H", "       ...       ...       ...       ...       .", 240);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "!H" });
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#                             ", "hi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!H H!", "                                I                         ...aa###HHI####aaaaaaaaaaa...                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!H H!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!H H!");
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        int int1 = org.apache.commons.lang3.StringUtils.length("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 277 + "'", int1 == 277);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHIHHHHHHHHHHHHHHHHHHHHHHHHH", "     .#HHI#       ...       ", "    HI!HHI!I!       HI!HHI!I!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHIHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHIHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray7, strArray11);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "hi!");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (-1), (int) (short) -1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HH", strArray11, strArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.startsWithAny("    H     ", strArray16);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "I                                  ");
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.split("HHI", "hi!");
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray27, "I!i!");
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("HHI", strArray16, strArray27);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHI", "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ");
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEach("           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ", strArray16, strArray35);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray37, "HHII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HI", 11, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str12, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HH" + "'", str21, "HH");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "HHI" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "HH" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HHI" + "'", str30, "HHI");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "HHI" });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           " + "'", str36, "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("              HH             ", 90, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444              HH             4444444444444444444444444444444" + "'", str3, "444444444444444444444444444444              HH             4444444444444444444444444444444");
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", "iaaa", "                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !" + "'", str3, "h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !");
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IHHIHHIHHIHHIHHIHHIHHIHHIHH" + "'", str1, "IHHIHHIHHIHHIHHIHHIHHIHHIHH");
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi !", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!");
        java.lang.String[] strArray3 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444a                                              a!aHa#!aHa...a                                             ", strArray2, strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444a                                              a!aHa#!aHa...a                                             " + "'", str4, "44444444444444444444444444a                                              a!aHa#!aHa...a                                             ");
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("       ...       ###hhi####    ...       ...       .                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I!HI!H...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I", "!", "HI", "!", "H", "..." });
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  I                                                                          ...                                  444444", "!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  I                                                                          ...                                  444444" + "'", str2, "  I                                                                          ...                                  444444");
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...", 16, "H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ..." + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!!", "Hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ", "                                                                    444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ", 26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         " });
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("!H", "                               ###hhi####    ...");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("i                         ...", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444HI!44", strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hia                                ", 497, 0);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...  hia", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!H" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4ih", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###hhi", "hHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", 192, 103);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4ih" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "###hhi" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################" + "'", str11, "!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################");
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ", 215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " + "'", str2, "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hhhhhhhhhh44444HI!44444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       ...       .#hhi#       ...      ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...       .#hhi#       ...      " + "'", str3, "       ...       .#hhi#       ...      ");
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("Hi!                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H" + "'", str1, "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H");
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HH");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                               ###HHI####    ...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("HI!", ' ');
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!4ih", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ", strArray3, strArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("i                         ...", strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HH" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HH" + "'", str5, "HH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HH" + "'", str6, "HH");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str13, "...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "HI!" });
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("###hhi...#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi...#" + "'", str1, "###hhi...#");
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        char[] charArray15 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("                                                 h                                                  ", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("hi#!", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4           ###HHI####           4                                                                  ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("                                                 h                                                 ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly("4444444                                                                                                                                                                                      444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hI#                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("I                         ...aa###HHI####aaaaaaaaaaa...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 231, "#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!", "I!!", "###hhi...####hhi...####hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!" + "'", str3, "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!");
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!..." });
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        int int1 = org.apache.commons.lang3.StringUtils.length("..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 336 + "'", int1 == 336);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("       ...       .#hhi#       ...                                                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                     hhhhhhhhhhhhhh", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     hhhhhhhhhhhhhh" + "'", str2, "                     hhhhhhhhhhhhhh");
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("               hi4                ", "hi !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...", "I                         ...", "HI!I!HI!H...HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaa", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                     HHHHHHHHHHHHHHH                                                                                                      ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHH");
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...", "#######                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                            aaaaaih                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h..." });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h..." });
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("i!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "I!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHHH");
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                          ", "HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", 19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "                               ###hhi####    ...", 45);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" });
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################i4444444444444444444444444444444444#44444444444444444444444444!i!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################i4444444444444444444444444444444444#44444444444444444444444444!i!" + "'", str2, "hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################i4444444444444444444444444444444444#44444444444444444444444444!i!");
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 #########################################################################################################################################################", "HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", 352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!aaaaaaaaaaaaaaaaaaaI44444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                   ###HHI####    .");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("####I           ####I           ####I           ####I           ####I           ####I...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("hHI!i!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hHI!i!", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaihHI!H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("####I           ####I           ####I           ####I           ####I           ####I...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!", "!H!H...Hhi!I!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("...           ###HHI####           ...           ###HHI####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhh                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "444444444444444444444444444444444444444444########!4ih#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaa.hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "iih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...###HHI####           4                                                                  ", "           ####IHH###                      ####IHH###                      ####IHH###                  HH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...###HHI####           4                                                                  " + "'", str2, "...###HHI####           4                                                                  ");
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("               hi4                ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                               ###HHI####           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH   ", "############################################################################################################################################################################################################################################################################################################i                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("           ", "hH444444444444444444444444444...", 120);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "           " });
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   !I!...        ###HHI####           ...", "AAAAAAAAAI");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("HI#!HHHHHHHHHHHHHHHHHHHHHHHH", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split(".");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 103, 5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...hhi......", strArray5, strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "   !I!...        ###HHI####           ..." });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "." });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "...hhi......" + "'", str14, "...hhi......");
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!       aaaaaaaaaaaaaaaaaaaaaa", "                               ###H", 51);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!       aaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("...H!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444" + "'", str1, "4444444");
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   !I!...        ###HHI####           ...", "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################hi!###########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   !I!...        ###HHI####           ..." + "'", str2, "   !I!...        ###HHI####           ...");
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !", 136, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...hI!                ..." + "'", str3, "...hI!                ...");
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi4a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                       ...", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...hi!hi!hi!hi!hi!hi!hi!hi!                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".hii4....hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                                                                          ", " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4", "...ih##############", 40);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4" });
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                     II                                  II                                  II                                  II ", "hHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     II                                  II                                  II                                  II " + "'", str2, "                     II                                  II                                  II                                  II ");
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################", '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hia!###HHI", "          hia!", (int) (byte) 1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("", ' ');
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          HI!HI!H...", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i", "    H     ", 3);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "I                                  ", (int) 'a', (int) (byte) 10);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray14, strArray20);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.split("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("                          ", strArray14, strArray29);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", strArray8, strArray29);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEach("HHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hia!###HHI" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "i" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hHI!i!" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "                          " + "'", str30, "                          ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi" + "'", str31, "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str32, "HHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 255, "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################" + "'", str3, "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################");
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        char[] charArray12 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                          ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("             ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", 6, 178);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." + "'", str3, "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!4ih");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("...###hhi####           4                                                                  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "4", "ih" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####IHH###...####IHH###...####IHH###!#IH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####IHH###...####IHH###...####IHH###!#IH" });
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         " + "'", str2, "########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ");
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!H", 334, 2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        char[] charArray9 = new char[] { '#', 'a', ' ', '4', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hia!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("HIH", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444a                                              a!aHa#!aHa...a                                             ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', ' ', '4', '#' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(".i..i...i..i...i..i...i..i...i..i...i..i...i..i...i..i..", 115, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", " H!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", "...       .#hhi#       ...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###ihh###", "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###ihh###" + "'", str2, "###ihh###");
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str8, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!       " + "'", str10, "hi!       ");
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("##############!ih##############", "44444HI!44444I!HI!H...44444HI!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############!ih##############" + "'", str2, "##############!ih##############");
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "hI#                             #####################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str2, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("           HHI           ...");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!I!ihH...H!H!aaa!i!IH", "", "              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!h", "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH", "...       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!h" + "'", str3, "!h");
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("I                         ...44444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!i!aaa!H!H...Hhi!I!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!i!aaa!H!H...Hhi!I!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" });
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H", 11, 2);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, ' ', 34, (int) (short) 10);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "I                         ...");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", strArray6, strArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.startsWithAny("#########################################################################################################################################################                                                                 44444 ih44444h ih i44444 ih44444#########################################################################################################################################################", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!" + "'", str1, "...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444", '4', 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("          hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h          ", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!i!       hi!hhi!i!       hi!h          " + "'", str2, "hhi!i!       hi!hhi!i!       hi!h          ");
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hHI!i!", "HI!", (int) (short) 10);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "hi!");
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "");
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray16, strArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("HI!", strArray13, strArray20);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        int int27 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", strArray26);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray26);
        java.lang.String[] strArray29 = null;
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("4           ###HHI####           4", strArray26, strArray29);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("                          ", strArray5, strArray26);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray26);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "h", "i!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4           ###HHI####           4" + "'", str30, "4           ###HHI####           4");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "                          " + "'", str31, "                          ");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("I4...", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I4..." + "'", str2, "I4...");
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hhhhhhhhhh44444HI!44444                                                                     ", "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhh44444HI!44444                                                                     " + "'", str2, "Hhhhhhhhhh44444HI!44444                                                                     ");
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("H!IH!IH", "          HHHHHHHHHHHHH", "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", 90);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H!IH!IH" + "'", str4, "H!IH!IH");
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HHI");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaai", 393, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaai444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaai444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                                                                                                                                ###H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH HI!HI!H...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "H!IH!IH", "HI!HI!H..." });
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hhi!I!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("hI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "hi", "!", "I", "!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHHHHHHHHHHHHHHHHHHHHHHHH", "   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###hhi####", "   ###");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str5, "HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "###hhi####" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str9, "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH", "hI#                                                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH" + "'", str2, "####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH");
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                hia#          hia#                                                                                                                                                                ", "HiI                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                hia#          hia#                                                                                                                                                                " + "'", str2, "                                                                                                                                                                hia#          hia#                                                                                                                                                                ");
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    !44444", "hHI!i!       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444444444!IH44444...H!IH!I44444!IH44444", ".. ... ... ... ...", "!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444!IH44444...H!IH!I44444!IH44444" + "'", str3, "444444444444444444444444444444444!IH44444...H!IH!I44444!IH44444");
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("H", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("4444444                                                                                                                                                                                                                                                                                      ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                   ", "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI", "#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi", "    ...       ...       .#HHI#       ...       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI" + "'", str3, "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI");
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...           ...", "                                                                  4           ####       !ih###...      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444HI!44444I!HI!H...44444HI!44444", "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!", "hi       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i                         ..", "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   ", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 48, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("... ...", "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("###hhi...#", "          hia");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", "################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH###HHI####HHHH...#################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh", "hia!###HH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                4ih                ", 180);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                4ih                                                                                                                                                                 " + "'", str2, "                4ih                                                                                                                                                                 ");
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...       ...       ...       ...       ...       ...       ..", "###hhi####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("      hi#!", "IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih" + "'", str2, "IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih");
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hhi" });
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "44444", 256);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", '#', 338);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", 129);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##" + "'", str2, "HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", 178);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 " + "'", str2, "                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444", ".hiI4....hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("    H     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH" + "'", str1, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH");
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...      ...       ", "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      ...       " + "'", str3, "...      ...       ");
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                                                                          HI!HI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHHHHHHH" + "'", str1, "hHHHHHHHHHHHHHH");
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#                             #####################################", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   ", "!#hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444                                              !H#!H...                                              ", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444                                              !H#!H...                                              " + "'", str2, "44444444444444444444444444                                              !H#!H...                                              ");
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("HH     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hia    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!" + "'", str2, "hia    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!");
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444", "4444444444444444444444444444444444444444!AIH                                               ", "hi!                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "###hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                                                                                                    ", 394);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("IIIIIIIIIIIIIIIIIIIIIHI!H", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!H    ", "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hia", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HHhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######", "               hhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...hhi.......", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi#!hhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444########!4ih#########hhhhhhhhhh      hi", "      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!hhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444########!4ih#########hhhhhhhhhh      hi" + "'", str2, "hi#!hhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444########!4ih#########hhhhhhhhhh      hi");
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !", "444444444444444444444444444444444444444444444444444444HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!444444444444444444444444444444444444444444444444444444", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !" + "'", str3, "h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !          h  !");
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi" + "'", str1, "hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi");
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", ' ', 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".i..i...i..i...i..i...i..i...i..i...i..i...i..i...i..i..", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        char[] charArray8 = new char[] { '#', 'a', ' ', '4', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hia!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaahi#!aaaaaaaaaaaaaaaaaaa.I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a', ' ', '4', '#' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                               ###HHI####           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444!AIH                                               ", "     hHI!i     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hhhhhhhhhh", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..", 497);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                             IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!.." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                             IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh", strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hia!" + "'", str5, "hia!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi", "!" });
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HHHHHHHHHHHHHH" });
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        ", "HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "hI!I!I!I!I!I!I!I!I!II");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." + "'", str3, "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" H!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!" + "'", str2, "H!");
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("###hhi...####hhi...####hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", "I4...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!", 345);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!");
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("44444444444444444444444444                                              !H#!H...                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ", "###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####", (int) '#', 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHH      hi#!HHHHHH###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      " + "'", str4, "HHHHHHHHHHHHHHHHHHH      hi#!HHHHHH###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ");
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!i!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444444444                                              !H#!H...                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###HHI####    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444                                              !H#!H...                                              " + "'", str2, "44444444444444444444444444                                              !H#!H...                                              ");
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("i!hi!h...            ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaa       !ih", (int) '4', "#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########aaaaaaaaaaaaaaaaaaa       !ih############" + "'", str3, "###########aaaaaaaaaaaaaaaaaaa       !ih############");
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#### ihh ####### ihh", "444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I Hh                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#### ihh ####### ihh" + "'", str2, "#### ihh ####### ihh");
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...###HHI####           4                                                                  ", "!#hi", "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......HHI....           4                                                                  " + "'", str3, "......HHI....           4                                                                  ");
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hih", "i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI", 30);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "h" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####" + "'", str3, "###HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####");
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", "       ...       .#hhi#       ...                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!", "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("I!HI!H...", "I                                  ", (int) ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hHI!i!       ", 3, 1);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("Hhhhhhhhhh", strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 257, 192);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!H", "!H..." });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Hi#         ...", 104, 212);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...                          ...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                          ..." + "'", str2, "...                          ...");
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                            ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                            " });
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("HHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHH", 340, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "...HHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaai", 4, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("HI!I!       ", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       " + "'", str2, "HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       ");
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          ...           444HHI4444           ...           444HHI4444  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "444HHI4444", "...", "444HHI4444" });
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IIIIIIIIIIIIIIIIIIIIIHI!H", "  HI...", 77);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IIIIIIIIIIIIIIIIIIIIIHI!H" });
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi!       ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hhhhhhhhhh", "hi#                             ", "hi!      ....H!IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhh" + "'", str3, "hhhhhhhhhh");
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", "                         HI!HI!H...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", 100, 13);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("HI!", ' ');
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!4ih", strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                              HI!HI!H...", strArray4, strArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  " + "'", str9, "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                              HI!HI!H..." + "'", str16, "                                                                              HI!HI!H...");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h..." + "'", str2, "i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...");
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi#" + "'", str1, "Hi#");
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" HI!HI!H", (int) '#', "###I###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###I######I## HI!HI!H###I######I###" + "'", str3, "###I######I## HI!HI!H###I######I###");
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444", "          ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!", 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!H!H...                                             ", "####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", 3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", 39, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!H!H...                                             " });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "44444444444HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "44444444444HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "aaaaaih##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh" + "'", str2, "hh");
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I !II ! !       I !II ! !                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("           ###HHI####           ", 393);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ###HHI####                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "           ###HHI####                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("       ...       .#hhi#       ...      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ...       .#hhi#       ...      " + "'", str1, "       ...       .#hhi#       ...      ");
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("HHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 145, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        hi!           hhi           ...           hhi           ...           hhi            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", "  ...                                                                                                                                                                                                                                                                                                                                      ...", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#######");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "HI!", (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("...###HHI####           4                                                                  ", strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           " + "'", str8, "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444", "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444" + "'", str2, "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444");
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444HI!44444I!HI!H...44444HI!4444", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###aaa###", "i#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###aaa###" });
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", "hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4", "hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  " + "'", str3, "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ");
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("HIH", "Hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", "H!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HHIHHHHHHHHHHHHHHHHHHHHHH", "hi !Hi!                          hi !Hi!        hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHIHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" + "'", str2, "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...", "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ..." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...");
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                              44444", "#### ihh ####### ihh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444" });
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("              HH             ", (int) (byte) 10, 279);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              HH             " + "'", str3, "              HH             ");
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                ###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "      ###HHI####           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("       ...       ###hhi####    ...       ...       .", "ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...       ###hhi####    ...       ...       ." + "'", str2, "       ...       ###hhi####    ...       ...       .");
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("###hhi####", "   ###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H..." + "'", str3, "i!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "I!HIhi#!", 26);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 7, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       " + "'", str3, "       ");
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("#IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HHIHHHHHHHHHHHHHHHHHHHHHH", "                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ", "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Hi!                          ", "Hi#                             ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ..." + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...");
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("       ...       .#hhi#       ...       ", 115, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################       ...       .#hhi#       ...       ######################################" + "'", str3, "#####################################       ...       .#hhi#       ...       ######################################");
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".i..i.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("    HI!HHI!I!       HI!HHI!I!  ", "                                                                                                          hhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI", "                                                                                                                                                                                                                                                              HHIIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI" + "'", str2, "I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       ", "I                                  I  ...       ...       ...       ...       ...       ...       ..", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("      ...       ...      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "hia    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "hiah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 144 + "'", int2 == 144);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!" + "'", str1, "    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!");
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4hi!hi!hi!hi!hi!hi!hi!h           ####i           ####i           ####i           ####i           ####i           ####i...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I", " !", "444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !ih                                                               ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!", 62, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...  hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!..." + "'", str3, "...  hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!...");
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " II                                  II                                  Iaaaaaaaaaaaaaaaaaaa!ih" + "'", str1, " II                                  II                                  Iaaaaaaaaaaaaaaaaaaa!ih");
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                          ", "HH     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", 128, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################4444444" + "'", str3, "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################4444444");
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("##############!ih##############", "I                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("I                         ...aa###HHI####aaaaaaaaaaa...", "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############", "                                                44444444444444444444444444444444                                                ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#########", "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", 10, 69);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          " + "'", str4, "#########4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ");
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" + "'", str1, "#IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                 h                                                 ", "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("           ###HHI####           ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...                             ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "           ###HHI####           " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###HHI####" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "           ###HHI####           " + "'", str6, "           ###HHI####           ");
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("i!i!...", "!4ih!4ih!4ih!4ih!4ihHHI    ...", "HI!i!aaa!H!H...Hhi!I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i!..." + "'", str3, "i!i!...");
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      ...###hi!       ####           4                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", ' ', 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "IIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##", "#######", "#######", "#######", "#######", "#######", "#######", "###" });
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...H!IH!IH                         ", "                               ###hhi####    ...", "!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("####################################################################################################################################################################################################################################################i                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", 153, "i#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !" + "'", str3, "hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###", "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########!4ih#########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###" + "'", str3, "####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###");
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("  ...       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih", (int) (byte) 1, 180);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih" + "'", str3, "HHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih");
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4!" + "'", str3, "hi4!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi                    !" + "'", str5, "hi                    !");
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                          ###H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###H" + "'", str1, "###H");
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...hi##...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hi##..." + "'", str1, "...hi##...");
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("I!i!", 144);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!i!" + "'", str2, "I!i!");
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", "hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !" + "'", str2, "i !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      ....H!IH!IHhhhhhhhhhh", "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                HHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                hhhhhhhhhhhhhh" + "'", str1, "                hhhhhhhhhhhhhh");
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "                               #...", 336);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 2, 279);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 246 out of bounds for length 246");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("           ####I           ####I", "HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####", "####" });
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          HI#!", "44444444444444444444444444a                                              a!aHa#!aHa...a                                             ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "          HI#!" });
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh", "           ####IHH###     ...", "                                                                                                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("44444444444444444444444444                                              !H#!H...     ...", ".I..I..4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 189 + "'", int2 == 189);
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(".I..I..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".I..I.." + "'", str1, ".I..I..");
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!AIH", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444", "hhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!AIH" + "'", str3, "!AIH");
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ", 91, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH   ", "hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("H!H...", "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!H..." + "'", str2, "H!H...");
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!" + "'", str2, "  hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI#!HHHHHHHHHHHHHHHHHHHHHHHH", 103, "                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                           HI#!HHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "                                                                           HI#!HHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ", "                               ###HHI####           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i           ###HHI####              ", "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                      ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I                                  ", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hHI!i", 178, 92);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "###4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "###" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "###" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("########################################################i!i!...#########################################################", 273, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#########################" + "'", str3, "...#########################");
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI" + "'", str2, "HHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####", 146, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####                          " + "'", str3, "                         hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####                          ");
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!" + "'", str3, "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!");
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...       .#hhi#       ...      ", 497);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ...       .#hhi#       ...      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ...       .#hhi#       ...      ");
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("    IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH" + "'", str1, "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ", "                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI444444444444444444444444444444444444444444444444444444444", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...hi!hi!hi!hi!hi!hi!hi!hi!                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                             ia!###HHI                                              ", 97, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             ia!###HHI                                              " + "'", str3, "                                             ia!###HHI                                              ");
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 #########################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("i           ", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "i           " + "'", str6, "i           ");
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("       ...       .#hhi#       ...                                                               ", 270, "   ###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...       .#hhi#       ...                                                                  ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###" + "'", str3, "       ...       .#hhi#       ...                                                                  ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###");
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...           ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 387 + "'", int2 == 387);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                ..................                                                                ", 596, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4!" + "'", str1, "hi4!");
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################4444444" + "'", str1, "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################4444444");
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444HI!4444", 403, "AhAhAhAhAhAhAhAhAhAhAhAhA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444HI!4444AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAh" + "'", str3, "44444HI!4444AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAh");
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("          HHHHHHHHHHHHH", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 #########################################################################################################################################################", "...       .#hhi#       ...      ", 234, 189);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444    ...       .#hhi#       ...                      #########################################################################################################################################################" + "'", str4, "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444    ...       .#hhi#       ...                      #########################################################################################################################################################");
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "           ###HHI####           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444H!H!###H!HHIH!####H!H!4", "          hia!          hia!  ", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444H!H!###H!HHIH!####H!H!4" });
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hih", "i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI", 30);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 335, 92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HH     ", 273, "                                                                    444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                    444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444                                                                                                     HH     " + "'", str3, "                                                                    444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444                                                                                                     HH     ");
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...HI##...", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HI##..." + "'", str2, "...HI##...");
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!      ....H!IH!IHhhhhhhhhhh##########################################################################################", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      ..." + "'", str2, "hi!      ...");
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("###hhi...####hhi...####hhi...####hhi.aaaaaaaaaaaaaaaaaaaaaaaaaahi####hhi...####hhi...####hhi...####hhi.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI", "444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI" + "'", str2, "hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI");
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i                         ..", 'a', 336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("Hhhhhhhhhh44444HI!444...           ...");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", 388);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I!HIhi#!", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIhi#!" + "'", str2, "I!HIhi#!");
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!" + "'", str3, "hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "", (int) (byte) 100);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!H#!H...", strArray5, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             ", strArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!H#!H..." + "'", str13, "!H#!H...");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a                                                                                                                                                ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!aih ! Hi", "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!aih ! Hi" + "'", str2, "!aih ! Hi");
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                               ...hhi......                                                                                                                                                                                               ", ' ', 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!I!...", 17, 338);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I!..." + "'", str3, "!I!...");
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...  hia");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "", "hia" });
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!H!H...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "HHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!H!H..." });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "..." });
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " II                                  II                                  Iaaaaaaaaaaaaaaaaaaa!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI#!HHHHHHHHHHHHHHHHHHHHHHHH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!H...            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#!HHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "#!HHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!       aaaaaaaaaaaaaaaaaaaaaa", ".i..i", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHHH", "hi4a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        int int1 = org.apache.commons.lang3.StringUtils.length("HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 235 + "'", int1 == 235);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", 104, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444" + "'", str3, "4444444444444444444444444");
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("i                         ..", 0, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i                         .." + "'", str3, "i                         ..");
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", 497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray2, strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "");
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "");
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray22, "");
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray18, strArray22);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray13, strArray18);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, ' ', (int) '4', (int) (short) 1);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.stripAll(strArray32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!H...", strArray18, strArray33);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray18);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HHH");
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                 HHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HI!HI!H..." + "'", str34, "HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!" + "'", str2, "!i!");
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!4ih", "hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("H", "H I####           I####           I####           I####           I####           I####           I####           I####           I####           ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!#IH      ", "hi4a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#IH      " + "'", str2, "!#IH      ");
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      ", "i                         ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI######################################", "##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!" + "'", str3, "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!");
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi !" + "'", str1, "hi !");
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "I!!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!H                    4ih                !H                    4ih                !H    ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################################################################   ihhih", "ih", "ih", "ih", "ih", "ih", "ih", "ih", "ih", "ih                           i" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." });
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444", 10);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!");
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray12);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "");
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray15, strArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("HI!", strArray12, strArray19);
        int int25 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                         HI!HI!H...", strArray19);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("hia!", strArray5, strArray19);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                        !H                                                                                                                                             ", strArray19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HI!" + "'", str24, "HI!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hia!" + "'", str26, "hia!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I                                  ################################################################", "                     !aih          ", "################################################################################################################################################################################################################################                               ###HHI####    ...#################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I                                  ################################################################" + "'", str3, "I                                  ################################################################");
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                                                                    444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444                                                                                                     HH     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                             ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!aih          ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!aih          " + "'", str2, "!aih          ");
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "444444444444444444444444444444444!IH44444...H!IH!I44444!IH44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi" + "'", str2, "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("Hi !                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!H                    4ih                !H                    4ih                !H    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H                    4ih                !H                    4ih                !H" + "'", str1, "!H                    4ih                !H                    4ih                !H");
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hia", "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "I                         ...44444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hia" + "'", str3, "hia");
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("           ###HHI####           4", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hhi", "Hi !                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi" + "'", str2, "hhi");
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 " });
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("aaaaaaaaaaaaaaaaaaaaahi#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                               ###HHI####    ...", 92, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               ###HHI####    ......HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "                               ###HHI####    ......HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444HI!4ih4444I!HI!H...44444HI!44444                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                               ###hhi####    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HHII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HI", 33, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HI" + "'", str3, "HHII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HI");
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "...h!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str2, "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4ih###############################", "       ...       .#hhi#       ...      ", "...       .#hhi#       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4                                 " + "'", str3, "4                                 ");
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("          hia!          hia!  ", "                4ih                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################" + "'", str2, "########################");
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444H!H!###H!HHIH!####H!H!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444H!H!###H!HHIH!####H!H!" + "'", str1, "4444444444444444444444444444H!H!###H!HHIH!####H!H!");
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        int int1 = org.apache.commons.lang3.StringUtils.length("      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 243 + "'", int1 == 243);
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("             HH              ", 99, 129);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hhi!i!", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!i!" + "'", str2, "hhi!i!");
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..!", "...hhi......");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###hhi...####hhi...####hhi...####hhi.aaaaaaaaaaaaaaaaaaaaaaaaaahi####hhi...####hhi...####hhi...####hhi.", "...hI!                ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("###I###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("I!HIhi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(".       ...       ...       ..                                                                                                                                ", "HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####IHH###", "####IHH###", "####IHH###", "####IHH###", "####IHH###", "####IHH###", "####IHH###", "####IHH###" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IHH", "IHH", "IHH", "IHH", "IHH", "IHH", "IHH", "IHH" });
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("################################################################# HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI I", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...", "", 88);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa..." });
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".I..I...I..I......I..I...I..I..", "####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".I..I...I..I......I..I...I..I.." + "'", str2, ".I..I...I..I......I..I...I..I..");
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("##############################################################", "hi!hi!hi!hi!hi!hi!hi!h           ####i           ####i           ####i           ####i           ####i           ####i...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           ", "HHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaih", "I                         ...44444444444444444444444", "Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hh...       ###hhi####    ...       ...       .");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("...HHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4           ###HHI####           4                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4           ###HHI####           4                                                                 " + "'", str1, "4           ###HHI####           4                                                                 ");
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" + "'", str2, "##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...       .#hhi#       ...", 77, 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a...       .#hhi#       ..." + "'", str4, "a...       .#hhi#       ...");
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hhhhhhhhhh44444HI!444...           ...", "                                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hhhhhhhhhh44444HI!444...", "", "", "", "", "", "", "", "", "", "", "..." });
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!                          ", "44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                          " + "'", str2, "hi!                          ");
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################", 404);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          #####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################                          " + "'", str2, "                          #####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################                          ");
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "hhi!i!       hi!hhi!i!       hi!h          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("i!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", "#######                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H..." + "'", str2, "i!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("H I####           I####           I####           I####           I####           I####           I####           I####           I####           ", "i#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...hi##...", "aaaaaih", "I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444....H##..." + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444....H##...");
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("########!4IH#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########!4IH#########" + "'", str1, "########!4IH#########");
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###hhi", "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi" + "'", str2, "###hhi");
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                hia#          hia#                                                                                                                                                                ", "...hi##...", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("  ####ihh###           ...           ####ihh###           ...           ####ihh###           !#ih", "       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4           ###HHI####           4", 77, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4           ###HHI####           4" + "'", str3, "4           ###HHI####           4");
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4           ###HHI####           4                                                                 ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4           ###HHI####           4                                                                 " });
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("             hh              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "             ", "              " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13 + "'", int4 == 13);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("###I###", "####IHH###...####IHH###...####IHH###!#IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".I..I..4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...###hi!       ####           4                                                                  ", 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

