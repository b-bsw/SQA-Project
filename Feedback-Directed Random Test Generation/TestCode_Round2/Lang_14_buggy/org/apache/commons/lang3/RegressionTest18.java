package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

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
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", strArray3, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "hi!       hHI!HI!HI!HI!HI!HI!");
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "I!    HI!HI!    HI!HI!HI!    HI!HI!", (java.lang.CharSequence[]) strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!" + "'", str8, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", 94);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        char[] charArray8 = new char[] { 'a', '4', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!  ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                               ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa" + "'", str1, "aaaaaaaaaa");
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##", (java.lang.CharSequence) "#########              !ih#########", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "###hi!##########################    !ih!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "    hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", (java.lang.CharSequence) "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   hi!       hi!       hi", "hi!       hi!       hi!" });
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                 4444444444444444", "hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!HHI    HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "i!hi!hi!h", (java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!##################################################################################################################################################################################################################################################################################################################", 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                                            ", (java.lang.CharSequence) "!A!AIHA!AIHA!AIHA!AIHA!AIHA!AIHAihA!AIHA!AIHA!AIHA!AIHA!AIHA!AIHA!A!AIHA!AIHA!AIHA!AIHA!AIHA!AIHAih");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!A!AIHA!AIHA!AIHA!AIHA!AIHA!AIHAihA!AIHA!AIHA!AIHA!AIHA!AIHA!AIHA!A!AIHA!AIHA!AIHA!AIHA!AIHA!AIHAih" + "'", charSequence2, "!A!AIHA!AIHA!AIHA!AIHA!AIHA!AIHAihA!AIHA!AIHA!AIHA!AIHA!AIHA!AIHA!A!AIHA!AIHA!AIHA!AIHA!AIHA!AIHAih");
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("              hi!       hi!       hi!       hi!       hi!       hi!       hi###    ###              ", "Hi!#hi!hi!###hi!hi!#Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "              hi!       hi!       hi!       hi!       hi!       hi!       hi###    ###              " });
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ng.String;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl", "hi!            hi!           ", "HI!       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HIH HIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH HIH" + "'", str1, "HIH HIH");
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!       4444444444444444444444444444444444444444444444444444444444", "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!       4444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################AAAAAAAAAAAACLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;AAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##", (java.lang.CharSequence) "hi!hi!   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!", "444444444", 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi ! hi ! hi ! hi ! hi ! 444444444LANG.STRING;AAAAAAAAA!ih!ih!ih!" + "'", str3, "hi!hi!hhi ! hi ! hi ! hi ! hi ! 444444444LANG.STRING;AAAAAAAAA!ih!ih!ih!");
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "hi! 44hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 39, "!ih!ih!ih!ih!ih!ih!ih!iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clhiclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ..." + "'", str1, "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#############################!#############################!#############################!#############################!#############################!#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################!#############################!#############################!#############################!#############################!#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str1, "#############################!#############################!#############################!#############################!#############################!#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", (java.lang.CharSequence) "Hi! 44hi!", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###       ###################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###       ###################" + "'", str2, "###       ###################");
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!######", "        !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih", 15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######", "", "", "", "", "", "", "", "", "", "", "", "", "", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!######" });
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 " + "'", str1, "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ");
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 2, "######################!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##" + "'", str3, "##");
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#############    !ih!ihh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("            Ih!ih!ih!i");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Ih!ih!ih!i" });
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaa...", "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!###############################################################################################   hi!       !i   hi!#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!###############################################################################################   hi!       !i   hi!" + "'", str1, "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!###############################################################################################   hi!       !i   hi!");
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("C  AAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C  AAAAAAAAAAAAAA" + "'", str1, "C  AAAAAAAAAAAAAA");
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaa", "hi!hi!h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aaaaaaaaaa" });
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!hi!hi!!hi!hi!!hi...", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!hi!hi!!hi!hi!!hi..." });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!hi!hi!!hi!hi!!hi..." });
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!    hi!hi!hi!    hi!hi", (java.lang.CharSequence) "ih!ih!ih!ih!lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 314 + "'", int1 == 314);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!h!h", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       ", 95, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!Hi!Hi!Hi!Hi!Hi!         4                         ..." + "'", str3, "...!Hi!Hi!Hi!Hi!Hi!         4                         ...");
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!", 41, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 41 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                           class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;                                                                                                                                                                                           ", "###hi!#######hi!##########################    !ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                           class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                           class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;                                                                                                                                                                                           ");
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hiH            hiH            ", (java.lang.CharSequence) "HI!       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hii", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hii" + "'", str2, "hii");
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                         i!    hi!hi!    hi!hi#######                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!    hi!hi!    hi!hi#######" + "'", str1, "i!    hi!hi!    hi!hi#######");
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI!HI!HI!HI!HI!HI", "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI" + "'", str2, "HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "hi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("hi!              ");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray16);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, '4');
        int int22 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", (java.lang.CharSequence[]) strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, 'a', 71, 118);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 71 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 74 + "'", int22 == 74);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 470, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "###################################");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             hi!hi!                                              ", "Hi!#hi!hi!###hi!hi!#", (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hia!aaahia!aaa", strArray4, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "class [Ljava.lang.String;", 42, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 42 out of bounds for length 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                             ", "", "", "", "", "", "                                              " });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hia!aaahia!aaa" + "'", str10, "hia!aaahia!aaa");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "", "", "", "" });
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "hi!#hi!hi!###hi!hi!#");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, ' ');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "!HI!HI!!HI!HI!!HI          hi!hi!h!HI!HI!!HI!HI!!HI.");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!hi!   ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "    " + "'", str11, "    ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "", "" });
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i", 965);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                    !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                    !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i");
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "###################################", (java.lang.CharSequence) "                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) "ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                hi!hi!h", 310, 79);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("               ", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               " });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  aaaaaaaaaaaaaa  c    ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaac" + "'", str2, "aaaaaaaaaaaaaac");
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "            CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4hi4!4                                ", "                  HIClass ...                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4hi4!4                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4hi4!4                                ");
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            ", "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", 40);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            " });
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("            ", "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            " + "'", str2, "            ");
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih                           aaa444444444444444444444444444444444444", "                         HI!HI!HI!HI!HI!H   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass14 = strArray13.getClass();
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass24 = strArray23.getClass();
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass34 = strArray33.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass44 = strArray43.getClass();
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.split("hia!aaahia!aaa", "       !ih", 100);
        java.lang.Class<?> wildcardClass54 = strArray53.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass54;
        java.lang.Class[][] classArray61 = new java.lang.Class[6][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray62 = (java.lang.Class<?>[][]) classArray61;
        wildcardClassArray62[0] = wildcardClassArray7;
        wildcardClassArray62[1] = wildcardClassArray17;
        wildcardClassArray62[2] = wildcardClassArray27;
        wildcardClassArray62[3] = wildcardClassArray37;
        wildcardClassArray62[4] = wildcardClassArray47;
        wildcardClassArray62[5] = wildcardClassArray57;
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray62);
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray62);
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray62);
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.AnnotatedElement[][]) wildcardClassArray62);
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray62);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertArrayEquals(classArray6, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "a", "aaa", "a", "aaa" });
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { java.lang.String[].class });
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                   i!                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!" + "'", str1, "i!");
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aHIaaaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIa!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHIaaaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIa!" + "'", str1, "aHIaaaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIa!");
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "hi##ih#ih#ih#ihhi##ih#ih#ih#ih", "HI!I!    AAA!IHHI!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!#hi!hi!###hi!hi!", (int) (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!#hi!hi!###hi!hi!" + "'", str3, "Hi!#hi!hi!###hi!hi!");
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", 80, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ..." + "'", str3, "Hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hihI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! ...", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                         i!    hi!hi!    hi!hi#######                                   ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        ...    hi...                 ", 90, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        ...    hi...                                                                      " + "'", str3, "        ...    hi...                                                                      ");
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("################", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################" + "'", str2, "################");
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi! hi! h#hi!hi!###hi!hi!#! hi! hi!", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hiH            hiH  ...", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi! hi! h", "hi!hi!", "", "", "hi!hi!", "! hi! hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi! hi! h", "hi!hi!", "", "", "hi!hi!", "! hi! hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! hi! h#hi!hi!###hi!hi!#! hi! hi!" + "'", str6, "hi! hi! h#hi!hi!###hi!hi!#! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###########################################################", "...############");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "###hi!#######hi!##########################!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "C hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", (java.lang.CharSequence) "i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                  !ih!ih                           aaa", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI             ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI             " + "'", str3, "HI             ");
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                              !ih!ih                                            ", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ", 286, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaa...", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444###################################", 215);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("          hi!hi!h", "############################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hi!hi!h" + "'", str2, "          hi!hi!h");
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("class [Ljava.lang.String;!class [Ljava.lang.String                      ", 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang.String;!class [Ljava.lang.String                      " + "'", str2, "lang.String;!class [Ljava.lang.String                      ");
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!", (java.lang.CharSequence) "hi!      hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!   ", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 58 + "'", int3 == 58);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi! h#hi!hi!###hi!hi!#! hi! hi!", 719, "!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa44444444444444444444hi! h#hi!hi!###hi!hi!#! hi! hi!!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa44444444444444444444" + "'", str3, "!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa44444444444444444444hi! h#hi!hi!###hi!hi!#! hi! hi!!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa44444444444444444444");
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...", (java.lang.CharSequence) "hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                   hi!       hHI!HI!HI!HI!HI!HI!                                    ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih" + "'", str1, "ih");
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI ! HI ! HI ! HI ! HI ! H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI ! HI ! HI ! HI ! HI ! H" + "'", str1, "HI ! HI ! HI ! HI ! HI ! H");
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#####44###############                                                 ", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                              ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444       !i", 52, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 58 + "'", int3 == 58);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Class[...    hi...Class[");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Class[...    hi...Class[" + "'", str1, "Class[...    hi...Class[");
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", 345, 646);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                     ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ih!ih!ih!ih!", 286);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "        ...    hi...                 ", (java.lang.CharSequence) "! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hI! 44HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! 44HI!" + "'", str1, "HI! 44HI!");
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...#######!ih!ih#####################...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...#######!", "ih", "!", "ih", "#####################..." });
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 710 + "'", int20 == 710);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("      ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray15 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence8, charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hHI ! HI ! HI ! HI ! HI ! H    hi!hi!   ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "... !i", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", (java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###       ###################", (java.lang.CharSequence) "salc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalcIHalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc;gnirts.gnal.avajl[hissalc", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!" + "'", str1, "hi! hi!");
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 58, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444!ih!ih", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444!ih!ih" + "'", str2, "4444!ih!ih");
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###################################", "I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#", 108);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "#hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###################################" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...#######!ih!ih#####################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#######!ih!ih#####################.." + "'", str1, "...#######!ih!ih#####################..");
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        java.lang.String[] strArray3 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray7 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray11 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray15 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray19 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(strArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!HI!...", "", "!ih!ih ing;class [ljava.lang.string;class [ljava.lang.string;!ih!ih", 470);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!..." + "'", str4, "HI!HI!...");
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("class [Ljava.lang.String;", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#I!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444", "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", (int) (short) 100, 470);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str4, "4444444CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI", "44444444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "I!HI!#4444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#", (int) (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#" + "'", str3, "Hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!hihI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! ...", (java.lang.CharSequence) "hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  hi!hi!hi!hi!hi!   ", "Hi! 44hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#############    !ih!ihh!", 87);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI         HI!ih!ih                           aaa444444444444444444444444444444444444.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!IH !IH!IH !IH !IH !IH !IH !IH                                                     ", "!hi!hi!!hi!hi!!hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH !IH!IH !IH !IH !IH !IH !IH                                                     " + "'", str2, "!IH !IH!IH !IH !IH !IH !IH !IH                                                     ");
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "44444444444444444444444444444444444444444444444444444444444444444#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        java.lang.String[] strArray3 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray7 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray11 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray15 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[] strArray19 = new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[][]) strArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[][]) strArray20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(strArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[][]) strArray20);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[][]) strArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "HI!#HI!HI!###HI!HI!#", "44444444444444444444", "hia!aaahia!aaa" });
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!hi!hi!hhhhhhhhhhhhhhhh!hi!hi!...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!!ih!ih!ih!ihhi!!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi! hi!" + "'", str1, "hi!hi! hi!");
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       " + "'", str1, "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44", "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44" + "'", str2, "44");
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("i!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", "       !i", 746);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!" });
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!#HI!HI!###HI!HI!#", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!#HI!HI!###HI!HI!#" + "'", str2, "HI!#HI!HI!###HI!HI!#");
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("C hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str1, "C hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...#######!ih!ih#####################..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "                                                                                 4444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                  4444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!i!i!i!i", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!#hi!hi!###hi!hi!#Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!##hi!##", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih                                ", "                                              !ih!ih                                             ", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih                                " });
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "    c  ##############    ", (java.lang.CharSequence) "                                                                                           ", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("Class ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Class ..." + "'", str1, "Class ...");
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444444Ahi!##hi!##A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi" });
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ..." + "'", str1, "hI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        char[] charArray6 = new char[] { 'a' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ih!######################    !ih!ihh!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "c  aaaaaaaaaaa###############################################################################", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Clss[Ljv.lng.String;clss[Ljv.lng.String;clss[Ljv.lng.String;", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 31, 70);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#############    !ih!ihh!", (java.lang.CharSequence) "#hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IIIIIIIIIIIIIIHi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("      ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444444444" + "'", str1, "...444444444");
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", (java.lang.CharSequence) "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;" + "'", str1, "class [Ljava.lang.String;");
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                 !ih  !ih                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!hi!hi!hhhhhhhhhhhhhhhh!hi!hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhhhhhhhhhhhhhhh!hi!hi!..." + "'", str1, "hi!hi!hi!hhhhhhhhhhhhhhhh!hi!hi!...");
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("i!hi!", "aaahia!aaahia!aaahia!aaahia!a", "hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!hi!            hiHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "  hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!hi!            hiHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!hi!            hiHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        char[] charArray8 = new char[] { 'a', '4', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                  ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "i!    hi!hi!    hi!hi#######        ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HIAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                  HIClass ...                                   ", (java.lang.CharSequence) "4                                                                                           hi!hi!44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#################", "...ih ! ih ! ... #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i #######ih!ih !ih!ih !i");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "hi!            hi!            ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("              hIH            hIH  ", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              hIH            hIH  " + "'", str3, "              hIH            hIH  ");
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi!#hi!hi!###hi!hi!#", "!ih!ih!ih!ih!ih!ihh       !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!#hi!hi!###hi!hi!#" + "'", str2, "Hi!#hi!hi!###hi!hi!#");
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "!", (java.lang.CharSequence) "                           hi!hi!hi!hi!hi!hi                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ", "#!IH!IH###!IH!IH#!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 " + "'", str2, "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ");
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                            ", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                            " + "'", str3, "                                                                                                            ");
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!i!i!i", "      Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!ih!ih ing;class [ljava.lang.string;class [ljava.lang.string;!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!i!i!i" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!i!i!i" + "'", str4, "!i!i!i");
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!ih!ih                                                                                           ", "!ih!ih                          hi!hi!    hi!hi!hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih                                                                                           " + "'", str2, "!ih!ih                                                                                           ");
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", 40, 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiii", "                                    !IH!IH!IH!IH!IH!", "ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", "hI", 345, 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class[LhI" + "'", str4, "class[LhI");
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aahi!##hi!##hi!aa", "hi!hi!hHI ! HI ! HI ! HI ! HI ! H    hi!hi!   Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", (java.lang.CharSequence) "         HI ! HI ! HI ! HI ! HI ! H", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", "#hi!hi!###hi!hi!#");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" });
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!aahi!aa", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!aahi!aa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!aahi!aa");
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!###############################################################################################   hi!       !i   hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "       a!aih", (java.lang.CharSequence) "                                             hi!hi!                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "hii", (java.lang.CharSequence) "hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih!ih!ih!ih!hi!hi!hi!hi!hi!hi!aaaa", (int) ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ih!ih!hi!hi!hi!hi!hi!hi!aaaa" + "'", str3, "ih!ih!ih!ih!hi!hi!hi!hi!hi!hi!aaaa");
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { 'a', '4', 'a' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                             hi!hi!                                              ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("   hi!       hHI!HI!HI!HI!HI!HI!", "                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hHI!HI!HI!HI!HI!HI!" + "'", str2, "   hi!       hHI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hI!    HI!HI!    HI!HI!HI!    HI!HI!", 345, "hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hI!    HI!HI!    HI!HI!HI!    HI!HI!" + "'", str3, "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hI!    HI!HI!    HI!HI!HI!    HI!HI!");
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 637, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                           class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 721);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("i!    hi!hi!    hi!hi!hi!    hi!hi!  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!    hi!hi!    hi!hi!hi!    hi!hi!  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "i!    hi!hi!    hi!hi!hi!    hi!hi!  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!ih!ih                          hi!hi!    hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("... ! hi ! hi...", "                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ! hi ! hi..." + "'", str2, "... ! hi ! hi...");
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!44hi!44" + "'", str12, "hi!44hi!44");
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", "   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih", "I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "HI!       !i   HI!", (java.lang.CharSequence) "############HI##IH#IH#IH#IHHI##IH#IH#IH#IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH       !IH#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                               ", 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                               " + "'", str2, "                                                                               ");
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAA                                         ", "     hi!hi!  ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split(" ", "!ih!ih                          hi!hi!    hi!hi!hi!    ", 468);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;            ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ihh       !ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!ih!ih!ih!ih!ihh", "!ih" });
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("              ###    ###ih       !ih       !ih       !ih       !ih       !ih       !ih              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######ih!ih!ih!ih!ih!ih!ih" + "'", str1, "######ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!H");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!hi!#", (java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "######################    !ih!ih", 17, (int) (byte) 10);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "H" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaa                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 345 + "'", int1 == 345);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hiH hiH              ", (java.lang.CharSequence) "Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", 637);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("... !i", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANG.STRING;             A.LAVASS [LJANG.STRING;CLA.LAVASS [LJANG.STRING;CLA.LAVASS [LJACLIH !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HIhhhh", "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIhhhh" + "'", str2, "HIhhhh");
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444###################" + "'", str2, "4444###################");
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "  hi!hi!hi!hi!hi!   ", 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("444444444444444444444444444444444444AAAHI!HI!ihih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444AAAHI!HI!ihih!ih!ih!ih!ih!ih" + "'", str1, "444444444444444444444444444444444444AAAHI!HI!ihih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...      !i", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...      !i" });
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                   ########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   ########" + "'", str2, "                                                   ########");
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", (java.lang.CharSequence) "                                                                          HI!       HI!    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANG.STRING;             A.LAVASS [LJANG.STRING;CLA.LAVASS [LJANG.STRING;CLA.LAVASS [LJACLIH !IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("        ...    hi...         ", "!ih!ih!ih!ih!ih!ihh       !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ...    hi...         " + "'", str2, "        ...    hi...         ");
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "HI! HI! H#HI!HI!###HI!HI!#! HI! HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################", 718, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                ###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################                                                                                                                                                                                                                                                                                                 " + "'", str3, "                                                                                                                                                                                                                                                                                                ###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" !ihhi!hi!######################   !ih!ih    !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !ihhi!hi!######################   !ih!ih    !i" + "'", str1, " !ihhi!hi!######################   !ih!ih    !i");
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        char[] charArray9 = new char[] { 'a', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ng;class [ljava.lang.str!ng;class [ljava.lang.str!ng;i!hi!h", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!HIhi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI", "hi", "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!", "hi" });
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "H ! IH ! IH ! IH ! IH ! IH", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!", "Aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!" + "'", str2, "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!");
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", (java.lang.CharSequence) "!", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!    hi!hi!hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!    hi!hi!hi!" + "'", str1, "hi!hi!    hi!hi!hi!");
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", 746, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! " + "'", str3, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ");
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("c  aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c  aaaaaaaaaaaaaa" + "'", str1, "c  aaaaaaaaaaaaaa");
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hHI ! HI ! HI ! HI ! HI ! H    hi!hi!   ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#########################################################################################################################################################################################################################################################################################################################################################!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!########################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "Hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "Class [Ljava.lang.String;!class [Ljava.lang.String                      ", "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ", " ", 20);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a", "", "", "", "", "", "", "", "", "", "", "", "", "", "                       " });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!                                                                  ", 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HIH HIH", "ihiihiiihiihiihiihiihiiihiihi", "                                                                                                                                                                                                                                                                                                                                                    !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIH HIH" + "'", str3, "HIH HIH");
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "   hi!       hHI!HI!HI!HI!HI!HI!", 268);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 477 + "'", int2 == 477);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "   hi!       hHI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ng;class [ljava.lang.string;class [ljava.lang.string;!ih!ih", "IIIIIIIIIIIIIIII", 314);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ng;class [ljava.lang.string;class [ljava.lang.string;!ih!ih" });
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("   HI!       !i   HI!    ", "...!#I!HI!#I!HI!#I!HI!#I!HI!#!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih ...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4hi4!4                                ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################################", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcLih !ih", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcLih !ih" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcLih !ih");
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "   HI!       !i   HI!    ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcLih !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!    ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!    " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;", "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;" });
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;" });
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "...############", 1000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                                                                                                                                                                                                                                                                      class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                      class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                      class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                           ng;clss [Ljv.lng.String;                           ", (java.lang.CharSequence) "... HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL" + "'", str2, "NG.sTRING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL");
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ", "AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                   i!                                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                   #######", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   aaaaaaa" + "'", str3, "                                                   aaaaaaa");
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  hi!hi!hi!hi!hi!   ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaa                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaa" });
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                             hi!hi!                     ...", "hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                             ", "!", "!                     ..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                             444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!                     ..." + "'", str4, "                                             444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!                     ...");
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ", 309, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      " + "'", str3, "                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("        !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih" + "'", str1, "        !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih");
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ng;clss [Ljv.lng.String;           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ng;clss [Ljv.lng.String;" + "'", str1, "ng;clss [Ljv.lng.String;");
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "            hIH            hIH", (java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa##!IH##!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa##!IH##!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa##!IH##!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!################HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ", "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!################HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   " + "'", str2, "###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!################HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ");
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "              hIH            hIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "...IH    ...                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...IH    ...                                                                                                                                                                                                                                                                                  ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                   ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################################", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444###################################" + "'", str2, "44444444444444444444444###################################");
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H444444444444444444444444444444HI!HI!HI!H...", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H444444444444444444444444444444HI!HI!HI!H..." + "'", str2, "H444444444444444444444444444444HI!HI!HI!H...");
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                       ", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih!ih!ih!ih", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih!ih!ih!ih" });
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!" + "'", str2, "hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!");
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;             ", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;             " + "'", str2, "            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;             ");
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a", 0, 310);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a##############################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a##############################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi!hi!hi!hi!#####################################################################", (java.lang.CharSequence) "hi!                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                               ...hi!h...", 75, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                               ...hi!h..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                               ...hi!h...");
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!IH!IH    !IH!IH!IH    !IH!IH   ", "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", "    C  ##############    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("salc;gnirts.gnal.avajl[ ssalc;gnirt", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "salc;gnirts.gnal.avajl[ ssalc;gnirt" });
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI", "   !i!", 80);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI" });
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                     HI!HI!HI!HI!HI!HI!                                     ", "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     HI!HI!HI!HI!HI!HI!                                     " + "'", str2, "                                     HI!HI!HI!HI!HI!HI!                                     ");
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi                                        hi! hi", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi                                        hi! hi" + "'", str2, "hi                                        hi! hi");
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 759, "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!" + "'", str3, "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!");
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) " hi! h#hi!hi!###hi!hi!#! hi! hi!", (java.lang.CharSequence) "              hi!       hi!       hi!       hi!       hi!       hi!       hi###    ###              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                  HI!                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  HI!                                   " + "'", str1, "                                  HI!                                   ");
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!i!i!i", (java.lang.CharSequence) "!HI!HI!!HI!HI!!HI...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "C  aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! hi! hi! hi! hi!" + "'", str1, "! hi! hi! hi! hi!");
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                 " + "'", charSequence2, "                                                                                                 ");
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!       44444444444444444444444444444444444444444444444444444444444", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "     !H44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!       44444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!       44444444444444444444444444444444444444444444444444444444444" + "'", str4, "i!       44444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#!IH!IH###!IH!IH#!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!#####################################################################", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#####################################################################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H", (java.lang.CharSequence) "######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H" + "'", charSequence2, "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!i!i!i", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IIIIIIIIIIIIIIII", 646);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      IIIIIIIIIIIIIIII" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      IIIIIIIIIIIIIIII");
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i", strArray2, strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence0, (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i" + "'", str5, "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                          HI!       HI!    ...", (java.lang.CharSequence) "       !ihi!###hi!hi!#! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH!IH!IH!IH!IH!IHH       !IH####################################################", "hi!#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi", "aaaaaaaaaaaaaac", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "                                                                                           hi!hi!v", ".l", "ng.string;", "l", "ss [lj", "v", ".l", "ng.string;", "l", "ss [lj", "v", ".l", "ng.string;          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi" });
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hiH hiH", 141, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiH hiH" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiH hiH");
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IH!IH!IH!IH!IH!IH", "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "IH!IH!IH!IH!IH!IH" });
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!h!h", charSequence1, 758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "   hi!    ", (java.lang.CharSequence[]) strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!aahi!aa" + "'", str13, "hi!aahi!aa");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" + "'", str3, "Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class ...", "iiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class ..." });
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", "hi!       hHI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " });
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIi!    hi!hi!   ######################!ih!ihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                                                                                                                                         hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                         hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h" + "'", str1, "                                                                                                                                                                                                                         hi!hi!hhi!hi!hhi!hi!hhi!hi!###############            ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h");
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi ! hi...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hi!hi!hi!hi!hi!hi         hi!IH!IH                           AAA444444444444444444444444444444444444", 34, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "hi..." });
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!A!AIHA!AIHA!AIHA!AIHA!AIHA!AIHAihA!AIHA!AIHA!AIHA!AIHA!AIHA!AIHA!A!AIHA!AIHA!AIHA!AIHA!AIHA!AIHAih", (java.lang.CharSequence) "                                                                aaaaaa!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!iclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clhiclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls", (java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!hhi!hi!hhi!hi!hhi!hi!############### ###############hi!hi!hhi!hi!hhi!hi!hhi!hi!h", "HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava." + "'", str2, "HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.");
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH#IH#IH#IH#IH#IH", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI         HI HI HI HI HI HI############################", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...      !i", "    hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#hi!#Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "!ih!ih!ih!ih!ih!ihHHHHHHHH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#hi!#Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#hi!#Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "HI!       HI!       ...", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents(".................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "................................................................................................." + "'", str1, ".................................................................................................");
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;claHIclass[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;clas");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", 309, "                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA" + "'", str3, "HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA");
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hI!    HI!HI!    HI!HI!HI!    HI!HI!", "                                     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hI!    HI!HI!    HI!HI!HI!    HI!HI!" + "'", str2, "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hI!    HI!HI!    HI!HI!HI!    HI!HI!");
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "######################################################################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 96, 92);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!", (java.lang.CharSequence) "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#I!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######", 637);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!hi!            hiHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!iH", 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   ", "H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih                                ", "    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ", 71, 98);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih              !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   " + "'", str4, "                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih              !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ");
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                ###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                !i", "######################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !i" + "'", str2, "                                !i");
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###############            ###############", "I!HI!#4444444444444444444444444444444444444444444444                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "###  ...", (java.lang.CharSequence) "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!##########################    !ih!ih###hi!#######hi!################HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ", (java.lang.CharSequence) "444444Ahi!##hi!##A", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                   hi!hi!h", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!    hi!hi!   ######################!ih!ihhi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                   hi!hi!h" + "'", str2, "                                                                                                                                                                                                                                                                                                                   hi!hi!h");
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444aaaaaaaa" + "'", str3, "aaaaaaa!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444aaaaaaaa");
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIH HIH", "AAA...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIH HIH" });
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!h", (-1), ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!h" + "'", str3, "hi!hi!h");
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Class ...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "#", (java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Class", "..." });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Class[...    hi...Class[", 0, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h" + "'", str1, "hi!hi!hi!hi!hi!hhi!aahi!aahi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!hi!hi!hi!hi!hi", "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      ", 0, 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      " + "'", str4, "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      ");
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hi!    hi!hi!hi!    ", 98, 70);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!hi!", "", (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!hi!" });
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 718, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44H44444444444444H44...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                    !IH!IH!IH!IH!IH!IHh       !ih                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    !ih!ih!ih!ih!ih!ihH       !IH                                   " + "'", str1, "                                    !ih!ih!ih!ih!ih!ihH       !IH                                   ");
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!#########################################################################################################################################################################################################################################################################################################################################################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!#########################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!#########################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#########################################################################################################################################################################################################################################################################################################################################################################################i!h##########################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "!    hi!hi!hi!    hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAA", "                                !i");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHHHHHHHHH!IH", (java.lang.CharSequence) "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!                                ", "#######", (int) (byte) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 35, (int) (byte) 1);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "#!IH!IH###!IH!IH#!IH", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!                                " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaa", 13, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!  hi!                                ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!  hi!                                " });
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "i!hi!hi!hi!hi!aaaa", 29, 11);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                 !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih                                                                                      hi!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih                                                                                      hi!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!" + "'", str2, "                 !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih                                                                                      hi!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!");
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hi!       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "444444444444444444444444444444HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444HI!HI!HI!H" + "'", str2, "444444444444444444444444444444HI!HI!HI!H");
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa##!IH##!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", (java.lang.CharSequence) "                         HI!HI!HI!HI!HI!H   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ng;clss [Ljv.lng.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ng;clss [Ljv.lng.String;" + "'", str1, "ng;clss [Ljv.lng.String;");
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", (java.lang.CharSequence) "                                                         i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                      ... ! hi ! hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "    c  aaaaaaaaaaaaaa  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                           ", "##");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                           " });
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###########################################################################################################hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String############################################################################################################", (java.lang.CharSequence) "Class [Ljava.lang.String;!class [Ljava.lang.String                      ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("i!    hi!hi!    hi!hi!hi!    hi!hi!  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!    hi!hi!    hi!hi!hi!    hi!hi!  " + "'", str2, "i!    hi!hi!    hi!hi!hi!    hi!hi!  ");
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!i", "aaaa!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!    hi!hi!   ######################!ih!ihhi! hi!i!    hi!hi!   ######################!ih!ihhi!  i!    hi!hi!   ######################!ih!i" });
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hiH hiH              ", "", 753);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hiH", "hiH" });
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray9);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 7, (int) (short) 10);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!##hi!##", (java.lang.CharSequence[]) strArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 0, (int) '4');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 37, 16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44" + "'", str17, "44");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##" + "'", str22, "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...    hi...", "      hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...    hi..." + "'", str2, "...    hi...");
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  " });
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "C  aaaaaaaaaaaaaaC  aaaaaaaaaaahI! 44HI! C  aaaaaaaaaaaaaaC  aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence11 = null;
        char[] charArray18 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone(charSequence11, charArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray18);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray18);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", charArray18);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray18);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!H", charArray18);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", charArray18);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih", charArray18);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray18);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################", charArray18);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "  aaaaaaaaaaaaaa  c    ", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", "444444444444444444444444444444444444444444444444hiH            hiH            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "###############            ###############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI! !i HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...                       hi!hi!", 68, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  ...                       hi!hi!                  " + "'", str3, "                  ...                       hi!hi!                  ");
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas", (java.lang.CharSequence) "!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 729 + "'", int2 == 729);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!HI!HI!!HI!HI!!HI...", (java.lang.CharSequence) "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ##############################", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ##############################" + "'", str2, "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ##############################");
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray9);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 7, (int) (short) 10);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!##hi!##", (java.lang.CharSequence[]) strArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 0, (int) '4');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44" + "'", str17, "44");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##" + "'", str22, "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! " + "'", str24, "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      " + "'", str1, "      ");
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#####hi!#######hi!##i!hi!hi!#######", 2, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####hi!#######hi!##i!hi!hi!#######" + "'", str3, "#####hi!#######hi!##i!hi!hi!#######");
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                            hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str1, "hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "   #####################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "Classa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444" + "'", str3, "4444444");
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hi!hi!hi!hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "   ...", 13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     " + "'", str3, "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ");
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#############################!#############################!#############################!#############################!#############################!#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################!#############################!#############################!#############################!#############################!#######" + "'", str1, "#############################!#############################!#############################!#############################!#############################!#######");
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("      ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "      ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ing;class [ljava.lang.string;class [ljava.lang.string;ing;class [ljava.lang.string;class [ljava.lang.string;ing;class [ljava.lang.string;class [ljava.lang.string;ing;class [ljava.lang.string;class [ljava.lang.string;ing;class [ljava.lang.string;class [ljava.lang.string;ing;class [ljava.lang.string;class [ljava.lang.string;", "######################################################44###############                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444", "!ih!ih!ih!ih!ih!ihh       !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444" + "'", str2, "444444444");
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!    hi!hi!   ######################!ih!ihhi!  ", "                                   i!                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!    hi!hi!   ######################!ih!ihhi!  " + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!    hi!hi!   ######################!ih!ihhi!  ");
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                               ...hi!h...", 0, "hi!hihI!       HI!       HI!       HIhi!                     HI!       HI!       HI!   ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                               ...hi!h..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                               ...hi!h...");
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "###!ih#######!ih#######!ih#######!ih#######!ih#!ih!ih###!ih#######!ih#######!ih##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih!ih!ih!ih!ihH444444444444444444444444444444HI!HI!HI!H...H4444444444444444444444", "                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.", "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava." + "'", str2, "!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.");
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                 ", "hI! 44HI! ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ih!ihh!ih!ih!ihh!ih!ihh!ih!ih!ih                                                                                      hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                                  hi!  hi!                 ", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH#IH#IH#IH#IH#IH", "44444444444444444444444###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   Hi!Hi!a");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!Hi!a" });
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "C  AAAAAAAAAAAAAA", (java.lang.CharSequence) "                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HIh HIh", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIh HIh" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIh HIh");
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String" + "'", str1, "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String");
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", (java.lang.CharSequence) "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...hi!h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hi!h..." + "'", str1, "...hi!h...");
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH#IH#IH#IH#IH#IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH#IH#IH#IH#IH#I" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH#IH#IH#IH#IH#I");
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", "hiHhiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H" + "'", str2, "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;      HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH                                                     ", "        ...    hi...                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH                                                     " + "'", str2, "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH                                                     ");
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "         4                                                                         ", 91, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 91 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih" });
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "C  aaaaaaaaaaaaaaC  aaaaaaaaaaahI! 44HI! C  aaaaaaaaaaaaaaC  aaaaaaaaaaa", 16, 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "   hi!    ", (java.lang.CharSequence[]) strArray7);
        java.lang.Class<?> wildcardClass12 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("   ...", "Ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ..." + "'", str2, "   ...");
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HIaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIaaaa" + "'", str1, "HIaaaa");
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!      hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!hi!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   !ih!ih       !ih       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih       !ih       !ih      !ih" + "'", str1, "   !ih!ih       !ih       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih       !ih       !ih      !ih");
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!  hi!  ", 40, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!  hi!  " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!  hi!  ");
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!                                             HI!HI!                                                                                           HI!HI!                                              HI!                                             HI!HI!                                                                                           HI!HI!", 35, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" !ih!ih", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !ih!ih" + "'", str2, " !ih!ih");
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("i! hi!hi! ########...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i", "!", " ", "hi", "!", "hi", "!", " ", "########..." });
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###############################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###############################################################################" });
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                       ", 73);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ..." + "'", str2, "  ...");
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", 26, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!" + "'", str3, "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!");
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) " 4444444444444444444444444444444444", (java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!#########################################################################################################################################################################################################################################################################################################################################################", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!h!h", 54, 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH       !IH", (java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!hi!hi!hi!hi!   ", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  hi!hi!hi!hi!hi!   " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi!hi!hi!hi!hi!   " + "'", str4, "  hi!hi!hi!hi!hi!   ");
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##" + "'", str3, "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##");
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihh       !ih", 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "444", 67, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 67 out of bounds for length 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!    ...", "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       " + "'", str2, "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!       ");
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!hi!hi!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH", "h");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "#####44#############aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#####44##############", 93, 0);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) " hi! h#hi!hi!###hi!hi!#! hi! hi!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH!", "i!", "i!H!IH!IH!IH!IH!IHAA!IHAA!IHH!IH!IH!IH!IH!IH" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...!       hi!       h...", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...!       hi!       h..." + "'", str2, "...!       hi!       h...");
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "######ih!ih!ih!ih!ih!ih!ih", "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("       !i", 719);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       !i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "       !i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                ######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i", 646, "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                ######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i" + "'", str3, "                                ######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i");
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                   !ih!ih                          hi!hi!    hi!hi!hi!                                                                                                                                                                                                                                                                                                       ", 314);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                   !ih!ih                          hi!hi!    hi!hi!hi!                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                                                                                                   !ih!ih                          hi!hi!    hi!hi!hi!                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih!ih!ih!ih!ih!ih", 756, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih" + "'", str3, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IH!IH!IH!IH!IH!IH", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "IH!IH!IH!IH!IH!IH" });
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           ng;clss [Ljv.lng.String;                           ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!HI!HI!HI!H", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                 ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!" + "'", str1, "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##i!hi!hi!######################!ih!ihhi!");
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!                                                                  ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "#############    !ih!ihh!", (java.lang.CharSequence) "!HI!HI!!HI!HI!!HI...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence[]) strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(strArray11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("hi!hi!    ", "   hi!    ");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...", strArray11, strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, 'a');
        boolean boolean25 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                           hi!hi!hi!hi!hi!hi                            ", (java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!" + "'", str17, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ..." + "'", str22, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   ...");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!aahi!aa" + "'", str24, "hi!aahi!aa");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("               ", "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               " + "'", str2, "               ");
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("class [Ljava.lang.String;hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!class [Ljava.lang.String;hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [lJAVA.LANG.sTRING;HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!CLASS [lJAVA.LANG.sTRING;HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!CLASS [lJAVA.LANG.sTRING;" + "'", str1, "CLASS [lJAVA.LANG.sTRING;HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!CLASS [lJAVA.LANG.sTRING;HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   #" + "'", str1, "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   #");
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                   hi!       hHI!HI!HI!HI!HI!HI!                                      hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!h", (java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                   hi!       hHI!HI!HI!HI!HI!HI!                                      hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!h" + "'", charSequence2, "                                   hi!       hHI!HI!HI!HI!HI!HI!                                      hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!h");
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                         i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                                                                            i!    hi!hi!    hi!hi#######                                      ... ! hi ! hi.....#######!ih!ih#####################...                           ", (java.lang.CharSequence) "                               i!    hi!hi!    hi!hi#######        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!    hi!hi!hi!    ", 1000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!hi!    hi!hi!hi!    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!hi!    hi!hi!hi!    ");
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!hi!hhi ! hi ! hi ! hi ! hi ! 444444444LANG.STRING;AAAAAAAAA!ih!ih!ih!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#############################!#############################!#############################!#############################!#############################!#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!######", "HI!HI!HI!HI!HI!#####################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi! hi! hi! hi! hiAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi! hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi! hi! hi! hi!ahi! hi! hi! hi! hiA" + "'", str2, "hi! hi! hi! hi! hi!ahi! hi! hi! hi! hiA");
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Classa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;", (java.lang.CharSequence) "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi!hi!h          hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

