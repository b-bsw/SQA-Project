package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    H     ", "    H     ", 3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hHI!i!", strArray6, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "          hia!");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi#                             ", "I           ");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray15);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IIIIIIIIIIIIIIIIIIIIIIIIIIII", "", 32);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray25);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray25);
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hia!###HHI", "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", (int) (short) 1);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray31);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEach("#######", strArray27, strArray31);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi !", strArray21, strArray27);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray21);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...###hhi####           4                                                                  ", strArray15, strArray21);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.replaceEach("I            ", strArray11, strArray21);
        int int38 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       .#hhi#       ...", strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHI!i!" + "'", str9, "hHI!i!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi#                             " });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "IIIIIIIIIIIIIIIIIIIIIIIIIIII" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hia!###HHI" });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hia!###HHI" + "'", str32, "hia!###HHI");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#######" + "'", str33, "#######");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hi !" + "'", str34, "Hi !");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str35, "IIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "...###hhi####           4                                                                  " + "'", str36, "...###hhi####           4                                                                  ");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "I            " + "'", str37, "I            ");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hhi!I!       ", "hi#", "...#ihh###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H..!I!       " + "'", str3, "H..!I!       ");
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      ...###hi!       ####           4                                                                  ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444...###hi!4444444####444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444...###hi!4444444####444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaa", "HI#!HHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!HHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HI#!HHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("           ###HHI####           ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI####" + "'", str2, "###HHI####");
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I                    ###HHI####              ", 596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                   I                    ###HHI####                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                   I                    ###HHI####                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "", (int) (byte) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       .." + "'", str2, "...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..");
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("a");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a" });
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##", "hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##" + "'", str2, "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##");
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
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
        int int22 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray6);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("        ...        ...HHHHHHHHHHHHH", "Hi !", 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "        ...        ...HHHHHHHHHHHHH" });
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", " HHHHHHHHHHHHH", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " });
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                HHHHHHHHHHHHHH", "iiiiiiiiiiiiiiiiiiiiihi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("...hhi......", "HI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI444444444444444444444444444444444444444444HHI!I!444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                                                                                                                                                                                              ", "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".hiI4....hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".HII4....HI" + "'", str1, ".HII4....HI");
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I                                  ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("hia", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I", "                                  " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           ", 126);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                       ..." + "'", str2, "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                       ...");
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!aaaaaaaaaaaaaaaaaaaI44444444...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###", "   ##", 180);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###" });
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444", 178, "AhAhAhAhAhAhAhAhAhAhAhAhA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAh444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444" + "'", str3, "AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAh444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("            ...H!IH!I", "i                                  ################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                              !H#!H...                                              ", "#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              !H#!H...                                              " + "'", str2, "                                              !H#!H...                                              ");
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("...           ###HHI####           ...           ###HHI####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", strArray1, strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###" + "'", str3, "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###hhi####    ...", "HHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###hhi####    ..." });
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi#!", "     .#HHI#       ...       ", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", "44444HI!4444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################" });
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh##HHI####");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "!", "", "!", "", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        int int1 = org.apache.commons.lang3.StringUtils.length("...                          ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...hhi....    ..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("iiiiiiiiiiiiiiiiiiiiihi!h", "###hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h" + "'", str2, "!h");
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("IH###hhi...", 90, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH###hhi..." + "'", str3, "IH###hhi...");
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ", "hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I                                  #################################################################", "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                                  #################################################################" + "'", str2, "I                                  #################################################################");
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("4H!H!###H!HHIH!####H!H!4", "..I..I...I..I......I..I...I..I.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", "###I           ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                    444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                    444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     " + "'", str1, "                                                                    444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ");
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444444" + "'", str1, "...4444444444");
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("           ####I           ####I           ####I           ####I           ####I           ####I...", "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", "I                         ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" HI!HI!H", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                              ...                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...###hhi####           4                                                                  ", " HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("       ...       .#hhi#       ...                                                               ", "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!i!aaa!H!H...Hhi!I!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "", 497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##############!4ih##############", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############!ih##############" + "'", str2, "##############!ih##############");
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################", "I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                              44444", "#####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh##HHI####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("###i###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###i###" + "'", str1, "###i###");
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#######                                                                                                                                                                                                                                                                                                                                             ", "HHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "#######                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ", (int) (short) 100, 212);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################" + "'", str3, "################################################################################################################");
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("     H    ", "!H!H...Hhi!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                              44444", "  ...                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" + "'", str2, "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!II       ...       ", "...44444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!II       ...       " });
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Hhhhhhhhhh44444HI!44444", "...           ...", 21, 212);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhh44444HI!444...           ..." + "'", str4, "Hhhhhhhhhh44444HI!444...           ...");
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "", "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..." + "'", str3, "   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hia!          hia!", "                                                                                                                                                                                                                                                                                   I                    ###HHI####                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia!          hia!" + "'", str2, "hia!          hia!");
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaih##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) (short) 1, "Hi !                                                                                               !aih                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        char[] charArray13 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("44444444444444444444444444444444", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("    H!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("I!HIhi#!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!i!...  ", 17, "ia!          hia!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ia!     i!i!...  " + "'", str3, "ia!     i!i!...  ");
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("I                    ###HHI####              ", "!AIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi" });
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..." + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "44444HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!I!...", "           !H#!H...            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I!..." + "'", str2, "!I!...");
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      H", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      H" + "'", str3, "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      H");
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "...                          ...", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a" });
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444!i!       ", "aaaaaih##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444" + "'", str1, "4444444444444444444444444");
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  I                         ...   ", "           I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        int int1 = org.apache.commons.lang3.StringUtils.length("HHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 153 + "'", int1 == 153);
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################", "ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "i" });
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I!HI!H...", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("Hhhhhhhhhh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###hhi...####hhi...####hhi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi...####hhi...####hhi" + "'", str2, "###hhi...####hhi...####hhi");
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "H!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 6, "i                         ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i  i  " + "'", str3, "i  i  ");
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "!i!#########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", ".....", "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", ".." });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####" + "'", str1, "###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####");
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...", "####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I                         ...44444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Hhi!I!", 255, 126);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hhi!I!" + "'", str3, "Hhi!I!");
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hia!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("!4ih", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                HHHHHHHHHHHHHHH", strArray5, strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".               HHHHHHHHHHHHHHH", strArray5);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!", 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", 63, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 63 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hia!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                HHHHHHHHHHHHHHH" + "'", str14, "                HHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########" + "'", str2, "########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########");
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "   ###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(".       ...       ...       ..                                                                                                                                ", 158);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I", (int) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray5, strArray9);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "hi!");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (-1), (int) (short) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HH", strArray9, strArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("    H     ", strArray14);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "I                                  ");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray22, "44444HI!44444");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str10, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HH" + "'", str19, "HH");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...");
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4", 99, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444II4" + "'", str3, "...4444444444444444444444II4");
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi#                             ", 12, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    " + "'", str3, "                    ");
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("hHI!i!       ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hHI!i!", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HHI    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI    ..." + "'", str1, "HHI    ...");
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444       4ih###############################4444444       ", "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", 93);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i" });
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!aih ! Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!aih ! Hi" + "'", str1, "!aih ! Hi");
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("i                                                                                                                                                                                                                                                                                    ", "i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I...", 92, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I..." + "'", str3, "HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I...");
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("          hia!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       ...", "aaaaaaaaaaaaaaaaaaaaahi#!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       ..." });
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hhhhhhhhhh", '#', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                               ...hhi......                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####", "AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAh444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####" + "'", str2, "HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####");
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 93, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!I!ihH...H!H!aaa!i!IH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "I", "!", "ih", "H", "...", "H", "!", "H", "!", "aaa", "!", "i", "!", "IH" });
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("!aih ! Hi", "       ...       ###hhi####    ...       ...       .");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        int int1 = org.apache.commons.lang3.StringUtils.length("...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 137 + "'", int1 == 137);
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..." });
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhh                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    H     ", "    H     ", 3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hHI!i!", strArray4, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4', 100, 12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hHI!i!" + "'", str7, "hHI!i!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                    ", "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                    " });
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...4444444444", "HI", "...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444444444444444444!aih                                                ", "##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                      ...       ", "       #                            #                            #                            #                            ", 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                      ...       " });
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "ih" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H#ih" + "'", str3, "H#ih");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        char[] charArray9 = new char[] { '#', '#', '4', ' ', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("HHI    ...", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("I                         ...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '#', '4', ' ', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("      hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str1, "hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H" + "'", str1, "aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H");
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hia!###HHI", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia!###HHI" + "'", str2, "hia!###HHI");
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!      .I..I..", 158, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("####IHH###", strArray3, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                       hiH", strArray3);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("###hhi####", '4');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "           ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           ", strArray3, strArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "####IHH###" + "'", str9, "####IHH###");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "###hhi####" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hhi" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           " + "'", str16, "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           ");
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH", (int) (byte) 1, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str3, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####", "HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I####                      ###" + "'", str2, "I####                      ###");
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "44444444444444444444444444a                                              a!aHa#!aHa...a                                             ", 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!HI!H...", "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################hi!###########################", "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!H..." + "'", str3, "HI!HI!H...");
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("####ihh###           ...           ####ihh###           ...           ####ihh###           !#ih", "...HHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH", "                               ###hhi####    ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               " + "'", str3, "                                                                                               ");
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaa!i!IH", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!i!IH" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!IH" + "'", str3, "!i!IH");
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h", "hi!       aaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...###hi!       ####           4                                                                  ", 9, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h" });
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ", "Hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         " });
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", "44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("iaaa######################", "...aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "                                                            aaaaaih                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####", "hHI!i!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("..................", 178);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                ..................                                                                                " + "'", str2, "                                                                                ..................                                                                                ");
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." });
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".HII4....HI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!", "Hhhhhhhhhh44444HI!44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "", 212);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", "aaaaaaaaaaaaaaaaaaaaahi#!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###" });
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", "                         HI!HI!H...");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", 100, 13);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!i!aa...", "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!", strArray9, strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "HI!i!aa..." });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "HI!i!aa..." });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!" + "'", str14, "hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!");
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("####I           ####I           ####I           ####I           ####I           ####I...", "HHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hhhhhhhhhhhhhhhhhhhhhhhhh", "############################################################################################################################################################################################################################################################################################################i                                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                               ###HHI####    ...", "hia                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI####    ..." + "'", str2, "###HHI####    ...");
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...hi##...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hi##..." + "'", str1, "...hi##...");
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..", 180);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        " + "'", str2, "                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        ");
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("       ...       ...       ...       ...       .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       ...       ...       ...       ." + "'", str1, "...       ...       ...       ...       .");
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("i                                  ", "IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI" + "'", str1, "I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444HI!44444I!HI!H44444HI!44444", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444HI!44444I!HI!H44444HI!44444" + "'", str2, "44444HI!44444I!HI!H44444HI!44444");
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi" + "'", str1, "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", "       ...       .#hhi#       ...      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HHI!I!       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444HI!44444I!HI!H...44444HI!44444" + "'", str1, "4444HI!44444I!HI!H...44444HI!44444");
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!h", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!");
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I                                  ", "###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####", 9);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("!H!H...Hhi!I!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "", "", "", "", "                           " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...", "", 240, 103);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "           ####IHH###                      ####IHH###                      ####IHH###                  HH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ..." + "'", str4, "           ####IHH###                      ####IHH###                      ####IHH###                  HH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...");
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("        ...        ...HHHHHHHHHHHHH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444", 393, 215);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#########################################################################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################", 352);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################" + "'", str2, "#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################");
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        char[] charArray14 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("                               ###HHI####    ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("########!4ih#########", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                    ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "HI!i!aa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..." + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#!", 13, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaahi#!aaaaa" + "'", str3, "aaaahi#!aaaaa");
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hhi!i!", "    H     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("... !  !");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", " ", "!", "  ", "!" });
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", ' ');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          HI!HI!H...", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("###i###", strArray5);
        java.lang.String[] strArray9 = null;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("          hia!          hia!  ", strArray5, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "I                                                                          ...                                  444444");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "          hia!          hia!  " + "'", str10, "          hia!          hia!  ");
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                ###H", '#', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                hhhhhhhhhhhhhhh", '#', 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!h", "!#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h" + "'", str2, "!h");
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH", "                                                                                                                                                                                                                                                                           ...       ", 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "", 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                          HI!HI!H...", "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!" + "'", str2, "  hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!H    ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!H    " + "'", str3, "!H    ");
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##", "444444444444444444444444444444444444444444########!4ih#########!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    H     ", "    H     ", 3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hHI!i!", strArray5, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "HI!HI!H...");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!       aaaaaaaaaaaaaaaaaaa", strArray12, strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", strArray5, strArray12);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHI!i!" + "'", str8, "hHI!i!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!       aaaaaaaaaaaaaaaaaaa" + "'", str17, "hi!       aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str18, "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#######", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######" + "'", str2, "#######");
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("4HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...", "i                                  ################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       " + "'", str3, "Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       ");
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hia!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hia!" + "'", str1, "hia!");
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("...                             ", "...           !H#!H...            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!H!H...", "           ###HHI####           4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi.I..I...I..I......I..I...I..I..!", "hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("       ...       #hhi#       ...       .", "iaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", "                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." + "'", str2, "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', (-1), 240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaa       !ih", "###hhi...####hhi...####hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("    Hhhhhhhhhh     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    hHHHHHHHHH     " + "'", str1, "    hHHHHHHHHH     ");
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi!", "HiI                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi !                                                                                               !aih                                                                                    ", "ia!###HHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi !                                                                                               !aih                                                                                    " + "'", str2, "Hi !                                                                                               !aih                                                                                    ");
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("            ...H!IH!I", "hi!      ....H!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!       aaaaaaaaaaaaaaaaaaa", 497, "4HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H.." + "'", str3, "4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..");
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("          ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!", 255, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###hhi###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###ihh###" + "'", str1, "###ihh###");
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("...aaaaa", "          HI#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH", "444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH" + "'", str2, "IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH");
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "");
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray8, strArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("HI!", strArray5, strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" + "'", str5, "##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("IIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###HHI####    .", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI####    ." + "'", str2, "###HHI####    .");
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("       ...       #hhi#       ...       .", " HHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaai", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai" + "'", str2, "aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai");
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaihaaaaaihaaaaaihaaaaaihaaaaaaaaihaaaaaihaaaaaihaaaaaihaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaihaaaaaihaaaaaihaaaaaihaaaaaaaaihaaaaaihaaaaaihaaaaaihaaaa" + "'", str1, "aaaaaihaaaaaihaaaaaihaaaaaihaaaaaaaaihaaaaaihaaaaaihaaaaaihaaaa");
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444", 10);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  I                                                                          ...                                  ", "                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#                             #####################################", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#                             #####################################" + "'", str3, "#                             #####################################");
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaih", "!aih ! Hi", 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaih" });
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                               ", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!H...", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!H..." + "'", str2, "HI!HI!H...");
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 114);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      " + "'", str2, "     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      ");
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "", "", "", "", "", "", "" });
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai", 114, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai" + "'", str3, "aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai");
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444         ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ", "IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH", 352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("iaaa######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iaaa######################" + "'", str1, "iaaa######################");
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I####                      ###", "aaaaaaaaaaa###HHI####aaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                      " });
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444", "4ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          ...           444HHI4444           ...           444HHI4444  ", 19, "HHI!I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ...           444HHI4444           ...           444HHI4444  " + "'", str3, "          ...           444HHI4444           ...           444HHI4444  ");
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi !                                                                                               !aih                                                                                    ", "I                    ###HHI####              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!H!H..", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!H!H.." });
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi ", "ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    H!", "#######                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    H!" });
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!I!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("###hhi###", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", 243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  " + "'", str2, "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ");
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#       ...       ", "hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray5, strArray9);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "hi!");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (-1), (int) (short) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HH", strArray9, strArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("    H     ", strArray14);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str10, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HH" + "'", str19, "HH");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..!" + "'", str3, "hi       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..!");
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("           ###HHI####", "                   ###HHI####    .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ###HHI####" + "'", str2, "           ###HHI####");
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", 270, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." + "'", str3, "######################################################################################################################################################################...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        int int1 = org.apache.commons.lang3.StringUtils.length("4hi!hi!hi!hi!hi!hi!hi!h           ####i           ####i           ####i           ####i           ####i           ####i...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 257 + "'", int1 == 257);
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...###HHI####           4                                                                  ", 340, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("       ...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("           ###HHI####           4", "!H!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("           ####IHH###     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####IHH###     ..." + "'", str1, "####IHH###     ...");
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".hiI4....hi", "                                                                                                                                        !H                                                                                                                                             ", 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { ".hiI4....hi" });
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "        ...        ...HHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ...        ...HHHHHHHHHHHHH" + "'", str2, "        ...        ...HHHHHHHHHHHHH");
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", "hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("  I                                                                          ...                                  ", "                             ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hI!I!I!I!I!I!I!I!I!II", "...           !H#!H...            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                 HHHHHHHHHHHHHHH", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", "                                                44444444444444444444444444444444                                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HH", 3, 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("i", strArray2, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "HI!i!aa...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 101, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 101 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i" + "'", str12, "i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("i!hi!h...            ", "!4ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("i", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaih", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaih" });
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(".I..I.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("I !II ! !       I !II ! !                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "                                I                         ...aa###HHI####aaaaaaaaaaa...                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", "######################################################################hI!I!I!I!I!I!I!I!I!II", "                    HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .....             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" + "'", str3, "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hI#                             ", "hi!", 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("...HI##...", "ia!          hia!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              " + "'", str1, "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "           ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ", "ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "hhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("    IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH   ", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH                        IHH   " + "'", str2, "HH                        IHH   ");
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("i                           hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   #################################################################", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("...                             ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("            ...H!IH!I                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     I!HI!H...            " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                     I!HI!H...            ");
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", "hi4!", ".HII4....HI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!" + "'", str1, "HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!hI#HIA!");
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 240 + "'", int3 == 240);
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("i!hi!h...            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi" + "'", str1, "#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi");
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", "                         HI!HI!H...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", 100, 13);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ");
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################", "...H!IH!IH ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 345 + "'", int2 == 345);
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("I                                  ", strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#######");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "HI!", (int) (short) -1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", strArray13, strArray17);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("HHI", strArray8, strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray1, strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "#######" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           " + "'", str18, "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "#######" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI" + "'", str20, "HHI");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("##############################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################" + "'", str1, "##############################################################");
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  ", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################" + "'", str2, "##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hHHHHHHHHHHHHH", "", 215, 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHHHHHHHHHH" + "'", str4, "hHHHHHHHHHHHHH");
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4H!H!###H!HHIH!####H!H!4", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4H!H!###H!HHIH!####H!H!4" + "'", str3, "4H!H!###H!HHIH!####H!H!4");
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("i!", "hia!###hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("...H!IH!IH ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!", "iaaa######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", ".....", "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", "..!" });
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "Hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", 'a', 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." + "'", str1, "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ...           ###HHI####           ...           ###HHI####  ", "                                                44444444444444444444444444444444                                                ", 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###HHI####", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###HHI####" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###HHI####" + "'", str5, "###HHI####");
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          ...           444HHI4444           ...           444HHI4444  ", 40, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ...           444HHI4444           ...           444HHI4444  " + "'", str3, "          ...           444HHI4444           ...           444HHI4444  ");
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!i!", 393, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 146 + "'", int3 == 146);
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                        ", "          hia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("IH###hhi...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH###hhi..." + "'", str2, "IH###hhi...");
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "I                                  ################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                I                         ...aa###HHI####aaaaaaaaaaa...                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       ...       ###hhi####    ...       ...       .                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4H!H!###H!HHIH!####H!H!4", "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "i#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("##############!4ih#####...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("...       .#hhi#       ...      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ..." + "'", str1, "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...");
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "aaaaaihHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI..." + "'", str2, "  HI...");
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str2, "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 40, 96);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                               hi!       aaaaaaaaaaaaaaaaaaa", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               hi!       aaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                               hi!       aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444");
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                          hi!                                  ", 393, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...         " + "'", str3, "...         ");
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI######################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("###4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444", "!H    ", "hi.I..I...I..I......I..I...I..I..!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("################################################################################################################", "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################################" + "'", str2, "################################################################################################################");
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!", "hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################" + "'", str2, "##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "     hHI!i     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("..", "               hhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("               hi4                ", "       ...       .#hhi#       ...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                " + "'", str2, "4                ");
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("HHIIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "");
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray8, strArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("HI!", strArray5, strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "      ###HHI####           ");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!HI!H...            ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("IH###hhi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######                                                                                                                                                                                                                                                                                                                                             ", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "           ###HHI####           ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#######                                                                                                                                                                                                                                                                                                                                             " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H" });
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 96, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        char[] charArray7 = new char[] { 'a', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("HHH", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("44444HI!44444", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("           ###HHI####              ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       .I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..", "44444HI!44444I!HI!H44444HI!44444                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       .I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I.." });
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("###HHI####           ...", "444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !ih                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ", "           ###HHI####");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    " + "'", str3, "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    " + "'", str5, "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ");
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           ", "                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           " + "'", str2, "      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           ");
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("##############!4ih##############", "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############!4ih##############" + "'", str2, "##############!4ih##############");
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                HHHHHHHHHHHHHH", "                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 " + "'", str2, "                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAI", "i           ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAI" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("...#ihh###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                              ...                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I!HIhi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HIhi#" + "'", str1, "I!HIhi#");
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                     !aih          ", "    hi!hhi!i!       hi!hhi!i!                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     !aih          " + "'", str2, "                     !aih          ");
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih" + "'", str1, "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih");
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!", 178);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("             ###HHI####    .", 25, "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             ###HHI####    ." + "'", str3, "             ###HHI####    .");
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444", "#", "4444444444444444444444444444444444", "#", "4444444444444444444444444444444444", "#", "4444444444444444444444444444444444", "#", "4444444444444444444444444444444444", "#", "4444444444444444444444444444444444", "#", "4444444444444444444444444444444444", "#", "4444444444444444444444444444444444", "#", "4444444444444444444444444444444444", "#", "44444444444444444444444444" });
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".hiI4....hi", "HI!I!HI!H...HI!", 336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                    HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .....             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ..", "IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .....             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .." + "'", str2, "                    HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .....             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ..");
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("            ...H!IH!I                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            ...H!IH!I                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "            ...H!IH!I                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", 212, "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##" + "'", str3, "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("          hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h" + "'", str1, "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", "           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh", "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi#                             ", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi#         ..." + "'", str2, "Hi#         ...");
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        char[] charArray15 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("hi#                             ", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!H!H..", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny("hia!###hh", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaa!i!IH", "444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str1, "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  HI...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "  ", "HI", "..." });
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("!H    ", "                4ih                ", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!H                    4ih                !H                    4ih                !H    " + "'", str3, "!H                    4ih                !H                    4ih                !H    ");
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("i                                  ################################################################", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              ################################################################" + "'", str2, "              ################################################################");
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi !Hi!                          hi !Hi!        hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", "I!HIhi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("H I####           I####           I####           I####           I####           I####           I####           I####           I####           ", "444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Hi#         ...", "Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######", (int) (short) 1, 256);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######" + "'", str4, "HHhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######");
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        int int1 = org.apache.commons.lang3.StringUtils.length("#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 403 + "'", int1 == 403);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                       ...", "I!!", ".i..i.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        int int1 = org.apache.commons.lang3.StringUtils.length("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HHHHHHHHHHHHHHH", " H!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                HHHHHHHHHHHHHHH", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                HHHHHHHHHHHHHHH" });
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###I###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###I###" + "'", str1, "###I###");
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ", "                                                              ...                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     " + "'", str2, "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ");
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################", 256);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################                                                                   " + "'", str2, "                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################                                                                   ");
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I            " + "'", str1, "I            ");
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI", "                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI" + "'", str2, "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI");
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...           !H#!H...            ", "i!i!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...           !H#!H...            " });
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi#                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("    H     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "               HHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I!HI!H...            ", 5, "...       ...       ...       ...       .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!H...            " + "'", str3, "I!HI!H...            ");
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", 178);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi" + "'", str2, "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("I           ", "!i!#########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("######################################################################################################################################################################...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", "  ####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH", 403);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444", "              HH             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444" });
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHHHHHHHHHHHHHHHHHHHHHHHH", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                    ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######                                                                                                                                                                                                                                                                                                                                             ", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!      ....H!IH!IH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######                                                                                                                                                                                                                                                                                                                                             " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#######" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".       ...       ...       .." + "'", str1, ".       ...       ...       ..");
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !ih                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                ###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "!AIH          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("I...");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHIHHHHHHHHHHHHHHHHHHHHHH", "I                         ...", 13);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HH", strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("ia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...", strArray2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I", "..." });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("      .....", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I", 345);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      ....." + "'", str4, "      .....");
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".I..I...I..I......I..I...I..I..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "44444444444444444444444444                                              !H#!H...     ...", 31, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str5, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("           !H#!H...            ", 24, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           !H#!H...            " + "'", str3, "           !H#!H...            ");
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!AIH##################################hiaaaaa", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!AIH##################################hiaaaaa" + "'", str2, "!AIH##################################hiaaaaa");
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi#!", "aaaaaaaaaaaaaaaaaaaaahi#!aaaaaaaaaaaaaaaaaaa.I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!", "hhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################hi!###########################", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                I                         ...aa###HHI####aaaaaaaaaaa...                                 ", "hi!      ....H!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                I                         ...aa###HHI####aaaaaaaaaaa...                                 " + "'", str2, "                                I                         ...aa###HHI####aaaaaaaaaaa...                                 ");
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                          ...", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...                          ..." });
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hhhhhhhhhhhhhh", 32, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhh");
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       " + "'", str1, " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       ");
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 31, 11);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                    HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .....             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################" + "'", str2, "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################");
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                ");
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("########!4ih#########", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("I...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!AIH          ", "i  i  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!AIH" + "'", str2, "!AIH");
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!", "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" + "'", str3, "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("########!4IH#########", "                ###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!", "      HI#!", 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", 277, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...######################" + "'", str3, "...######################");
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".I..I..", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { ".I..I.." });
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####" + "'", str1, "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####");
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "             HH              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("###hhi####    ...", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi####    ..." + "'", str2, "###hhi####    ...");
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("          hia", "###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hia" + "'", str2, "          hia");
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!i", "hi!       aaaaaaaaaaaaaaaaaaaaaa", "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i" + "'", str3, "!i");
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444444i...4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHIHHHHHHHHHHHHHHHHHHHHHHHHH", 180, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHIHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHIHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("i                           hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   #################################################################", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("           ###HHI####              ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("HHI", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("!H!H...                                             ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("HI", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...           ...", "   ##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...           ..." + "'", str2, "...           ...");
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...H!IH!IH ", "hhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("i", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("                               ###HHI####           ", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("###hhi####    ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi####    ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "###hhi####    ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!I!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) 1, "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("4444HI!44444I!HI!H...44444HI!44444", "    ...       ...       .#hhi#       ...       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HHIIIIIIIIIIIIIIIIIIIIIHI!H", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaa       !ih", "HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!i!#########", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("     hHI!i     ", "HI!i!aaa!H!H...Hhi!I!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    ...       ...       .#hhi#       ...       ", 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    ...       ...       .#hhi#       ...       " + "'", str3, "    ...       ...       .#hhi#       ...       ");
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                        ", 215, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#", "HI#!HHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#" + "'", str2, "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#");
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi#!", (int) (byte) 0, "           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!" + "'", str3, "hi#!");
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("       ...       .#hhi#       ...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...       ...", ".I..I...I..I......I..I...I..I..", "                                                                              HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...       ..." + "'", str3, "...       ...");
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                       hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hih                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str1, "Hih                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "i           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###hh", "#######hh", "#######hh", "#######hh", "#######hh", "#######hh", "#######hh", "#######hh", "#######hh", "#######hh", "#######hh", "#######hh", "#######hh", "####" });
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##################################hiaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##################################hiaaaaa" });
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(".        ...HHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".        ...HHHHHHHHHHHHH" + "'", str1, ".        ...HHHHHHHHHHHHH");
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("           I", "hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!Hi#hia!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#", "hi!      ....H!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###HHI####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI####" + "'", str1, "###HHI####");
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("###HHI####", "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

