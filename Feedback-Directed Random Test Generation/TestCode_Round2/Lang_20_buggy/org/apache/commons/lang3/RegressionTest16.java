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
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                         hi hi hi                              hi hi hi                              hi hi", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi hi hi                              hi hi hi                              hi hi" + "'", str2, "                         hi hi hi                              hi hi hi                              hi hi");
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!                                                      ", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!HI!hi!hi!HI!", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...", (java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ih                         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 696 + "'", int1 == 696);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444444444444", "HI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                             HI", 18, "Hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             HI" + "'", str3, "                             HI");
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                             HI!                             HI!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             HI!                             HI!" + "'", str2, "                             HI!                             HI!");
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", (java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4!ih44444444444444444444444444444!ih44444444444444444444444444444!ih44444444444444444444444444444444", 39, (int) (short) -1);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                             hi!                                                                    ", (java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "  " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                  ", charSequence1, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                           HI!", (java.lang.CharSequence) "                                                                                          ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...4444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih       HI!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih       HI!!IH    !ih", "   !    !    !  ", "44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih       HI!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih       HI!!IH    !ih" + "'", str3, "...4444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih       HI!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih       HI!!IH    !ih");
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hHI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!HI!HI!HI!HI                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!hi!hi!!hi!!ih", 718, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444444444444444444444444HI4!4444444444444444444444444444444hi4!4444444444444444444444444444444hi4!44", "hi!                             HI!                             HI!", 420);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444HI4!4444444444444444444444444444444hi4!4444444444444444444444444444444hi4!44" + "'", str3, "444444444444444444444444444444444HI4!4444444444444444444444444444444hi4!4444444444444444444444444444444hi4!44");
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       HI!", "hI!HI!H");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH", "       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH                         ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH", strArray4, strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#HI#hi#!!#ih##!!!!!!!!!!!!!!!!!!!!!!!!!!#ih##hi#!...", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "       HI!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!IH!IH" + "'", str8, "!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH    IH", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!ih       !ih       !ih    ...", (java.lang.CharSequence) "hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", "hhhhhhhhhh                      hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "       hi!");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "   hi!    ", (java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", strArray3, strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '#');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str9, "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                                                                                                                                                                     ", (java.lang.CharSequence) "                         HI!IH       !IH       !IH       !IH       !IH       !I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444!    44444444444444444444444444444444444444444", 46, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444!    44444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444!    44444444444444444444444444444444444444444");
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI! HHHHHHHHHH", "HHHHHHHHHHHHHHHHHHHHHHHHH Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "ih                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI! HHHHHHHHHH" + "'", str3, "HI! HHHHHHHHHH");
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!ih ...", (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi! hi!", (java.lang.CharSequence) "HI! HHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                         HI!hi!HI!                             HI!HI!HI!                             HI!HI", (java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "           HI!", (java.lang.CharSequence) "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...!ih...", "#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!!#ih# #hi#!!#ih# #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] {};
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!                             hi!                             hi! ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   IH    IH           ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hI!HI!                           HI!HI!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h", "HI.##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h" });
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                         HI HI HI                              HI HI HI                              HI HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!                         hi!                         hi!                         hi!                                hi!", "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                         hi!                         hi!                         hi!                                hi!" + "'", str2, "Hi!                         hi!                         hi!                         hi!                                hi!");
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("              hi!        ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                  HI!hi                                                                                                 HI", (java.lang.CharSequence[]) strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!iHHiHI!!iHHi", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "hi!", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "Aaaaaaaaaaaaaaaa##########################################################################", charSequence1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         ...4444 HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "         ...4444 HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh                       HI  hi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 90);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { ";", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI HI! HI! HI!                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                HI!", '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "       HI!", (java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray5);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi!", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                HI!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                HI!" + "'", str7, "                                HI!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                HI!" + "'", str10, "                                HI!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "                                HI!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                HI!" + "'", str15, "                                HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                HI!" + "'", str16, "                                HI!");
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                         HI hi HI                              HI HI HI                              HI HI", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...", (java.lang.CharSequence) "HI hi HI                              HI HI HI                              HI HI", 294);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...hi!!ih...", "hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!!ih..." + "'", str2, "...hi!!ih...");
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                       ", (java.lang.CharSequence) "hi!#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 206);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ..." + "'", str1, "...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ...");
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih", (java.lang.CharSequence) "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih" + "'", charSequence2, "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih");
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!" + "'", str1, "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!");
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "                hi!  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 64, 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!ihhi!ihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi! HI!", (java.lang.CharSequence) "                hi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!", "...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...                         hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!" + "'", str2, "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                            HI                                                                            ", "############################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            HI                                                                            " + "'", str2, "                            HI                                                                            ");
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("iH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH" + "'", str2, "iH");
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" ", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!", ' ');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("!", '4');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("                                HI!                             hi!                             hi! ", strArray9, strArray12);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '4', 292, 0);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ...");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...", strArray3, strArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                !                             hi!                             hi! " + "'", str14, "                                !                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih..." + "'", str21, "...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...");
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!", "################################################################################################!!!!       HI!  ", 237);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!" });
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih", 119, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih" + "'", str3, "hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih");
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "##########hi!HI!###################################################################################", (java.lang.CharSequence) "4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) " !ih       !ih                                ", (java.lang.CharSequence) "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#HI#hi#!!#ih##!!!!!!!!!!!!!!!!!!!!!!!!!!#ih##hi#!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "HI!       HI!   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "Hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", (java.lang.CharSequence) "                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        char[][][][] charArray0 = new char[][][][] {};
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[][][][] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   HI ", 579, "4444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   HI " + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   HI ");
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] {};
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!                             hi!                             hi! ", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!IH                         hi!", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       #HI#", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   HI ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", "                                                                                                          !IH                         HI!        ", 173, 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!   hi!    hi!hi!hi!h                                                                                                          !IH                         HI!        " + "'", str4, "hi!hi!hi!hi!   hi!    hi!hi!hi!h                                                                                                          !IH                         HI!        ");
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444aHIa!a44444444444444444444444444444ahia!a44444444444444444444444444444ahia!a4", "!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444aHIa!a44444444444444444444444444444ahia!a44444444444444444444444444444ahia!a4" + "'", str2, "44444444444444444444444444444444aHIa!a44444444444444444444444444444ahia!a44444444444444444444444444444ahia!a4");
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                hi                                HI!                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi                                HI!" + "'", str1, "hi                                HI!");
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh..." + "'", str2, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...");
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str2, "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi                                HI!", (java.lang.CharSequence) "IH    IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!" + "'", str2, "hi!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!");
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##########hi!HI!####################################################################################", 690);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ##########hi!HI!####################################################################################" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ##########hi!HI!####################################################################################");
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(". hi!..", 222, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                       . hi!.." + "'", str3, "                                                                                                                                                                                                                       . hi!..");
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str2, "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("IH!!!!!!!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!!!!!!!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "ih!!!!!!!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444", "HI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" HI! HI!", "hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI! HI!" + "'", str2, " HI! HI!");
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("... HI!!IH HI!!IH HI!!IH ...      ", "HI!HI!hiHI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... HI!!IH HI!!IH HI!!IH ...      " + "'", str2, "... HI!!IH HI!!IH HI!!IH ...      ");
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!  ", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "!HI!                             !                             !  HI!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 273);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!", (java.lang.CharSequence) "HI!                             hi!                          ", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                                ... hi##ih hi##ih hi##ih ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!ih       !ih       !ih    ...", (java.lang.CharSequence) "HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...HI!IH       !IH       !IH    ...#...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...hi!!ih...                                                                                                                                                                                                                                                                                     ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  !!          HI!    !!                                    !!                                    !!                                           !!  !hI!hI!hI!hIa##################################################################################################################################################################################################", (java.lang.CharSequence) "       hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" !ih       !ih                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih       !ih" + "'", str1, "!ih       !ih");
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...hi!HI!########################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!!", "ihhi", "!!", "ihhi", "!!", "ihhi", "!!", "ihhi", "!!", "ih" });
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", " hI!hI!hI!hI!hI!hI!hI!hI!hI");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaa", strArray2, strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaaaaaaaaaaaa" + "'", str8, "aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "    HI", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 197, 285);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                              HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!                              ", (java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "!!hi!!ih              hi!h", (java.lang.CharSequence) "hi!HI!hi!hi!HI!HI! HI! HI! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", "                hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str2, "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 690, 272);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                       . hi!..", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!H", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                       . hi!.." });
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("  !!                                    !!                                    !!                                    !!                                           !!  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!                                    !!                                    !!                                    !!                                           !!  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "!!                                    !!                                    !!                                    !!                                           !!  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  ...     ", 158, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########", (java.lang.CharSequence) "                      HI!                             HI!                           ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                HI                             hi                             hi ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str1, "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                 HI!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                 ", "HI", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                !                             HI!                             HI! ", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                             HI!                             HI! " + "'", str2, "                                !                             HI!                             HI! ");
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("....  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....  " + "'", str1, "....  ");
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.hi!                             hi!class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH" + "'", str2, "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#                           hi      #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!    ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!HI!                             !                             !  HI!", "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!                             !                             !  HI!" + "'", str2, "!HI!                             !                             !  HI!");
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hI!hI!hI!hI!hI!hhI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hhI!hI!hI!hI!hI!h" + "'", str1, "hI!hI!hI!hI!hI!hhI!hI!hI!hI!hI!h");
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih       ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "        ", (int) ' ', 289);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih", "", "", "", "", "", "", "" });
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!!!!!", "hi!hi!                           hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!" + "'", str2, "!!!!!");
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!ih                           HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 836 + "'", int2 == 836);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaa!ihaaa#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                         HI hi HI                              HI HI HI                              HI HI", 34, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         " + "'", str3, "                         ");
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!##################################################################################################################!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!##################################################################################################################!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" });
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444!IH       hi!!ih44444444444444444444444444444444hi!!ih444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################ih############", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################ih############" + "'", str2, "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################ih############");
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ih                      hhhhhhhhhh", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "I!hI!hI!hI!hI!hI!hI!hI!hIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!!HI!!IH              HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " !ih                             !ih                             !ih                                IH                                ", (java.lang.CharSequence) "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444", "hi!HI!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444" + "'", str2, "4444444444444444444");
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih!ih                             !ih!ih!ih                             !ih!IH!ih                         4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                hi!  hi!           HI!                                hi!  hi!           HI!hi!  hi!           HI!       hi!  hi!           HI!!!!!!!!!!!!!!!!!!!!!!!!!!  hi!           HI!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "################################################################################################!!!!       HI!  ", (java.lang.CharSequence) "         ...4444 HI!HI!HI!HI!HI!HI!HI!HI!HI", 157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi44", "                                                                                                                    #################################################################                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                            HI                                                                            ", 282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                     hiHI!HI!HI!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", charSequence1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "          ");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH" });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih            hi!HI!hi!                             hi!hi!hi!                             hi!hi", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih            hi!HI!hi!                             hi!hi!hi!                             hi!hi" });
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                hi!                   hi!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh                     hi!                             ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 291, 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str4, "                            !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                 !ih                         HI!                                                                                            ", "!ih", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "HI!HI!HI!HI       HI!!HI!", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                                                                                 ", "", "", "                         HI", "                                                                                            " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                             HI!", 11, "#################################################################################################### #################################################################################################### #################################################################################################### HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             HI!" + "'", str3, "                             HI!");
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!", "HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!IH       ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH       " + "'", str2, "!IH       ");
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ", (java.lang.CharSequence) " hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  ;   ", 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ih                         ", "###############################################################################!hi!hi!", 134);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ih                         " });
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "...hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi...", (java.lang.CharSequence) "HI!                             HI!                           ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "HI!!IH                                       HI!!IH       HI!!IH              HI!!IH       !!!!!!!!!!!!!!!!!!!!!!!!!!IH       HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "hhhhhhhhhh                      hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi", 696);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih ...", "       HI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("       ", "                     4444444444444444444444444", "                              HI  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       " + "'", str3, "       ");
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                     " });
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "Hhhhhhhhhh                      hi!                                                                                                                                                                                                                                                                 hhhhhhhhhh                      hi!                                                                                                                                                                                                                                                                 hhhhhhhhhh                      hi!                                                     ...HI!!IHHI!!IHHI!!IH...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!" + "'", str1, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!");
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iH             HI!HI!HI!               ", "i! hi! hi! H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                         hi HI hi                              hi hi hi                              hi hi", "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                         hi HI hi                              hi hi hi                              hi hi" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "hi!!ih hi!!ih hi!!ih hi!!ih hi!!ih", 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 273 + "'", int3 == 273);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!hiHI!HI!HI", 273, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hiHI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hiHI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "                             hi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("  !!          HI!    !!                                    !!                                    !!                                           !!  ", strArray4, strArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####################################################################################################" + "'", str5, "####################################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "####################################################################################################" + "'", str7, "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "  !!          HI!    !!                                    !!                                    !!                                           !!  " + "'", str14, "  !!          HI!    !!                                    !!                                    !!                                           !!  ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("       HI!  ", "...  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!  " + "'", str2, "       HI!  ");
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" hI!hI!hI!hI!hI!hI!hI!hI!hI", 36, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444 hI!hI!hI!hI!hI!hI!hI!hI!hI44444" + "'", str3, "4444 hI!hI!hI!hI!hI!hI!hI!hI!hI44444");
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI! hi! hi!", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!", 9);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, (java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI! hi! hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI! hi! hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "       #HI#!#HI#!#HI#!#HI#!!!!!!!!!!!!!!!!!!!!!!!!!!#HI#!!#IH#              #HI#!#HI#!#HI#!                      HI       #HI#!!#IH#              #HI#!!#IH#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#IH#       #HI#!", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          ", "hi", "!!", "ih", "       ", "!!!!!!!!!!!!!!!!!!!!!!!!!!", "ih", " " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "!iHHi!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!");
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 285);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                  Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                   ", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "C" });
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 10);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!iHHi!                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iHHi!" + "'", str1, "!iHHi!");
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!IH!IH", "                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH" + "'", str2, "!IH!IH");
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                 !ih                         HI!                                                                                            ", 25, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                 !ih                         HI!                                                                                            " + "'", str3, "                                                                                                                                                                 !ih                         HI!                                                                                            ");
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("####################################################################################################", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####################################################################################################" });
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!..." + "'", str2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#########################################################################################...", "hi!           HI", (int) (short) -1, 38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!           HI###################################################..." + "'", str4, "hi!           HI###################################################...");
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("iH                         ", (int) (short) 100, "!ih       HI!                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iH                         !ih       HI!                                                            " + "'", str3, "iH                         !ih       HI!                                                            ");
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   ", 727, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaahi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", "hi!           HI###################################################...", 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!                           hi!hi!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!                           hi!hi!" });
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                HI", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!                      hi       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", (java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "   hi!    ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                HI!                             HI!                             HI! ", strArray6, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence[]) strArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                HI!                             HI!                             HI! " + "'", str10, "                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       HI!", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                                hi! hI!hI!hI!hI!hI!hI!hI!hI!hI", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!!ihhi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!######################################################################################################################################################################", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                                hi! hI!hI!hI!hI!hI!hI!hI!hI!hI", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", (java.lang.CharSequence) "!ihhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("       HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI" + "'", str1, "       HI");
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  !!                                    !!                                    !!                                    !!                                           !!  ", "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "  !!                                    !!                                    !!                                    !!                                           !!  ", 22, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  !!                                    !!                                    !!                                    !!                                           !!  " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!       HI!       HI!       HI!       HI!       HI!       HI!IH", "                                HI!                             hi!                             hi!                                 HI!                             hi!                             hi!                                 HI!                             hi!                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       HI!       HI!       HI!       HI!       HI!       HI!IH" + "'", str2, "HI!       HI!       HI!       HI!       HI!       HI!       HI!IH");
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI! HI! HI! ", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################        #########", 291, 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI! HI! HI! ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################        #########" + "'", str4, "HI! HI! HI! ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################        #########");
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                                     ih                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("! hi! hi!", 292, "                                HI        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                HI                                        HI                                        HI                                        HI                                        HI                                        HI                                       ! hi! hi!" + "'", str3, "                                HI                                        HI                                        HI                                        HI                                        HI                                        HI                                       ! hi! hi!");
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HhhhhhhhhhhhhhhhhhhhhhhhhhI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!######################################################################################################################################################################", "hI!HI!                           HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", "i", "i", "i", "i", "i", "i", "i", "i", "i", "######################################################################################################################################################################" });
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                     ... hi!!ih hi!!ih hi!!ih ...            Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", (java.lang.CharSequence) "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!", "4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!" + "'", str2, "#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!");
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hI!hI!hI!hI!hI!hI!h", "HHHHHHHHHHHHHHHHHHHHHHHHH Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!hI!h" + "'", str2, "hI!hI!hI!hI!hI!hI!h");
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih      ", (java.lang.CharSequence) "                                H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                HI!IHHI!IHHI!!!IHHI!IHHI!hi!IHHI!IHHI!!", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!hi!hi!!hi!!ih", "hi!           HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                              ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              " + "'", str2, "                                                              ");
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", "       hi!", 100);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444", "HI", "!", "44444444444444444444444444444", "hi", "!", "44444444444444444444444444444", "hi", "!", "4" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444", "HI", "!", "44444444444444444444444444444", "hi", "!", "44444444444444444444444444444", "hi", "!", "4" });
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!                                                                                                                                                                                                                                                    ", " !IH                         hi!", 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!      !IH                         hi!                                           " + "'", str3, "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!      !IH                         hi!                                           ");
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, 92, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "4444444444...   ", 685);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ih                         HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                         HI!" + "'", str1, "!ih                         HI!");
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!hiHI", "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!hiHI" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                   ...!!!!!!!!!!!!!!!!!!!!!!!!!ahi                                                                                   ", 296);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                   ...!!!!!!!!!!!!!!!!!!!!!!!!!ahi                                                                                   " + "'", str2, "                                                                                   ...!!!!!!!!!!!!!!!!!!!!!!!!!ahi                                                                                   ");
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                hi!  ", (java.lang.CharSequence) "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "!IH !IH !IH !IH !IH !IH HI!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "HI!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################" + "'", str2, "########################");
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!HI!hi!hi!hi!hi!hi!hi!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.hi!                             hi!class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.S", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! ", (java.lang.CharSequence) "                         HI HI HI                              HI HI HI                              HI HI", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("... HI!!IH HI!!IH HI!!IH ...       ", "    HI                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... HI!!IH HI!!IH HI!!IH ...       " + "'", str2, "... HI!!IH HI!!IH HI!!IH ...       ");
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(charSequence0, (java.lang.CharSequence) "           !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                              ", "!IHHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              " + "'", str2, "                                                              ");
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", "HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH" + "'", str2, "   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!", 579);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi" });
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih!ih!ih!ih!ih!ih!ih!ih!ih", 36, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ih!ih!ih!ih!ih!ih!ih4444444444" + "'", str3, "ih!ih!ih!ih!ih!ih!ih!ih!ih4444444444");
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                         HI                                HI!                             HI!                             HI!                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         HI                                HI!                             HI!                             HI!                               " + "'", str1, "                         HI                                HI!                             HI!                             HI!                               ");
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("....  ", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....  " + "'", str2, "....  ");
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                         hi!                                                                                                                                                                                                                                                                                                                                                                                        ", (java.lang.CharSequence) "44444444444444444444444                                                                                                 hi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "    hi!hi!                             hi!                             hi!  hi!                hi!hi!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                hi                                hi!                             hi!                             hi!", 150);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  ", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             " + "'", str2, "                                                                                                                                                             ");
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '#', (int) (byte) 0, (int) (byte) 1);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        java.lang.Class<?> wildcardClass19 = strArray17.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "                         ", "                         ", "                         ", "                                ", "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "                         ", "                         ", "                         ", "                                ", "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                hi                                HI!                            ", (java.lang.CharSequence) "  HI!           HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                              HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!                              ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!hi!hi!!hi!!ih", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih       HI!                                       ", "", 100);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!ih", "HI!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444" + "'", str2, "!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444");
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Hi!hi!hi!hi!hi!hi!hi!hi", "hi!!ih hi!!ih hi!!ih hi!!ih hi!!ih", 690);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "Hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!ih!ih!ih...#######", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih!ih!ih..." + "'", str2, "hi!ih!ih!ih...");
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      hi############################################################################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "hi############################################################################" });
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI", (java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!#######################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi", "                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI                                                      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" !ih       !ih                                ", "                         HI!hi!HI!                             HI!HI!HI!                             HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI" });
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("#", "hi!44hi!44444444444HI!44444444444444444444444444444444hi!44hi!44444444444HI!hi!44hi!44444444444HI!4444444hi!44hi!44444444444HI!!!!!!!!!!!!!!!!!!!!!!!!!!44hi!44444444444HI!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ##########hi!HI!####################################################################################", "H                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ##########hi!HI!####################################################################################" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ##########hi!HI!####################################################################################");
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444", (java.lang.CharSequence) "         ...4444 HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", "...  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("i!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", "HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hihihihihihihihi", (java.lang.CharSequence) "                     ... hi!!ih hi!!ih hi!!ih ...            ", 283);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi! hi! hi! HI", strArray7, strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("!ih       HI!", strArray1, strArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                             hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "####################################################################################################" + "'", str12, "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#################################################################################################### #################################################################################################### #################################################################################################### HI" + "'", str15, "#################################################################################################### #################################################################################################### #################################################################################################### HI");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!ih       HI!" + "'", str16, "!ih       HI!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444!    44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ...", "I!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ..." + "'", str2, "...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ...");
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!ih       !ih       !ih       !ih       !ih       !ih       !ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "ih", "       ", "!", "ih", "       ", "!", "ih", "       ", "!", "ih", "       ", "!", "ih", "       ", "!", "ih", "       ", "!", "ih" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih" + "'", str3, "hi#!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih");
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!                             HI!                           ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "                             ", "HI", "!", "                           ", "..." });
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!iHHi!!!!!!!!!!!!!!!!!!!!", "   hi!HI!                             hi!                             hi!  HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!HI!                             hi!                             hi!  HI!" + "'", str2, "   hi!HI!                             hi!                             hi!  HI!");
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("  !!                                           !!                                    !!                                    !!                                    !!  ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  !!                                           !!                                    !!                                    !!                                    !!  " + "'", str2, "  !!                                           !!                                    !!                                    !!                                    !!  ");
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", (java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                                    HI!... hi!!ih hi!!ih hi!!ih ...     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hhhhhhhhhh hi!", 4, "!ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhh hi!" + "'", str3, "hhhhhhhhhh hi!");
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "IH" });
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "...  ", (java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                          Hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                     hiHI!HI!HI!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 285 + "'", int1 == 285);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "!ihhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       HI!  HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hhi!                     ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!                     " + "'", str2, "hhi!                     ");
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...", "  HI!           hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", (java.lang.CharSequence) "#################################################################################################hi#", 282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "  HI!!IHHI!!IHHI!!IHHI!!IHHI!!IH   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "       HI", (java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########", 685);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hI!hI!hI!hI!hI!hI!hI!hI!hIa###################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI!hI!hI!hI!hI!hI!hI!hI!hIa###################################################################################################################################################################################################" });
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                 ", "!!hi!!ih              hi!h", "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 98);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                 " + "'", str4, "                                                                                                 ");
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                  HI!hi                                                                                                 HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 298 + "'", int1 == 298);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!##################################################################################################################!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", 286);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!############..." + "'", str2, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!############...");
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 134 + "'", int1 == 134);
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "   HI!", 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "  !!          HI!    !!                                    !!                                    !!                                           !!  !hI!hI!hI!hIa###################################################################################################################################################################################################", (java.lang.CharSequence) "hi! hi!", 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!", "                                                                                                                                                                                                                          #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                          #################################################################" + "'", str2, "                                                                                                                                                                                                                          #################################################################");
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("              HI!                             hi!                             hi!                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "              HI!                             hi!                             hi!                " + "'", str1, "              HI!                             hi!                             hi!                ");
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HI!   HI!    HI!HI!HI!HI!!", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    HI!HI!HI!HI!!" + "'", str2, "    HI!HI!HI!HI!!");
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ciHIcicicicicici");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                !IH                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                ", "!", "IH", "                                                 " });
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("...                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             ..." + "'", str1, "...                             ...");
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("  !!                                    !!                                    !!                                    !!                                           !!  ", "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  !!                                    !!                                    !!                                    !!                                           !!  " + "'", str2, "  !!                                    !!                                    !!                                    !!                                           !!  ");
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                                     !ih                         HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  ;   ", (java.lang.CharSequence) "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                               ...", 284);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                            ...                                                                                                                             " + "'", str2, "                                                                                                                                                            ...                                                                                                                             ");
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("####################################################", "...", 126, 86);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####################################################..." + "'", str4, "####################################################...");
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI! HI! HI! ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################        #########", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI! HI! HI! ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################        #########" + "'", str2, "HI! HI! HI! ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################        #########");
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "    HI!HI!HI!HI!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################        #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "       #HI#!#HI#!#HI#!#HI#!!!!!!!!!!!!!!!!!!!!!!!!!!#HI#!!#IH#              #HI#!#HI#!#HI#!                      HI       #HI#!!#IH#              #HI#!!#IH#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#IH#       #HI#!", (java.lang.CharSequence) "                              HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!       HI!       HI!       HI!       HI!       HI!       HI!IH", (java.lang.CharSequence) "    ...   444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####################################################################################################", "", (int) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!h", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!h" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!h");
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !", (java.lang.CharSequence) "                                                                                          hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      hi############################################################################");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "hi############################################################################" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " !IH                         hi!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   IH    ", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...       hi!!ih       hi!!ih   ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI!!IH                                       HI!!IH       HI!!IH              HI!!IH       !!!!!!!!!!!!!!!!!!!!!!!!!!IH       HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" !IH                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !IH                         " + "'", str1, " !IH                         ");
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!" + "'", str2, "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!");
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                     ... hi!!ih hi!!ih hi!!ih ...            Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     ... hi!!ih hi!!ih hi!!ih ...            Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "                     ... hi!!ih hi!!ih hi!!ih ...            Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "HI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..        ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   !    !    !  ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                        IH    IH", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!HI!hiHI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IHih!IH!IH" + "'", str1, "!IH!IH!IHih!IH!IH");
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       ci HI ci                              ci ci ci    ", "HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!                           hi!hi!", charSequence1, 685);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("      #", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi        ", (java.lang.CharSequence) "ih            hi!HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, (java.lang.CharSequence) "hi!ih       !ih       !ih    ...#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                                                                                  HI!       !IHHHHHHHHHHHHHHHHHHHHHHHHHH       !IHHI!              !IHHI!       !IHHI!                                                                                                       ", (java.lang.CharSequence) "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   HI ", "!ihhi!ihhi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   HI " });
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!ih!ih!ih!ih!ih!ih!ih", "hi!ih       !ih       !ih    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "hi!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hhhhhhhhhh                      hi!", "                                                                                     hiHI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhh                      hi!" + "'", str2, "hhhhhhhhhh                      hi!");
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                             hi!");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence0, (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                  Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                   ", 273, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                       " + "'", str3, "...                       ");
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih", (java.lang.CharSequence) "4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!        ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "        " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH!hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH        " + "'", str3, "HIhhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH!hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH        ");
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#####", 579, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "    hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                ", "HI" });
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                HI!                             hi!                             hi! ", (java.lang.CharSequence) " !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                            ...                                                                                                                             ", 300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!h!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!############...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!############..." + "'", str1, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!############...");
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                         hi HI hi                              hi hi hi                              hi hi", (java.lang.CharSequence) "hI!HI!                           HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("         .#", 158, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       HI!                            HI!           ", (java.lang.CharSequence) "...4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!HI!", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!HI!" + "'", str2, "hi!HI!");
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                 ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 157, 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!hi!hi!!hi!!ih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!!hi!!ih" + "'", str2, "!hi!hi!!hi!!ih");
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!                             hi!                             hi! ", "", 274);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih       HI!                                                                                                                                                                                                                                                                                    ", "!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "ih       ", "", "", "                                                                                                                                                                                                                                                                                    " });
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                hi                                        hi                                        hi        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("################################################################################################", 286);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                              ################################################################################################" + "'", str2, "                                                                                                                                                                                              ################################################################################################");
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi HI hi                              hi hi hi                              hi hi", (java.lang.CharSequence) "!i...HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI! HI!", (java.lang.CharSequence) "hI!hi!##############################################################################################", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                    HI!IH       !IH       !IH       !IH       !IH       !I", "   IH    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    HI!IH       !IH       !IH       !IH       !IH       !I" + "'", str2, "                                    HI!IH       !IH       !IH       !IH       !IH       !I");
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                !                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                !                             hi!                             hi! " + "'", str1, "                                !                             hi!                             hi! ");
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI", 11, 292);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str3, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                         hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         HI" + "'", str1, "                         HI");
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hhhhhhh#hi#h#hi#h#hi#h#hi#hhhhhhhhhhhhhhhhhhhhhhhhhh#hi#hh#ih#hi!hh#hi#hh#ih#hhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh#ih#hhhhhhh#hi#h", "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhh#hi#h#hi#h#hi#h#hi#hhhhhhhhhhhhhhhhhhhhhhhhhh#hi#hh#ih#hi!hh#hi#hh#ih#hhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh#ih#hhhhhhh#hi#h" + "'", str2, "hhhhhhh#hi#h#hi#h#hi#h#hi#hhhhhhhhhhhhhhhhhhhhhhhhhh#hi#hh#ih#hi!hh#hi#hh#ih#hhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh#ih#hhhhhhh#hi#h");
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################" + "'", str2, "##################################");
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("         ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!" + "'", str1, "!hi!hi!");
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "!IH                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!!!!!!!!!!!!!!!!!!!!!!!!!", "                         hi!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI", "                                                                     !ih                         HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ih       !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih       !ih" + "'", str1, "!ih       !ih");
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH                   !", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                                hi                                        hi                                        hi        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                         ");
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!", "aaaaaaaaaaaaaaaaaaaaaaHI!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!" + "'", str3, "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!");
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "################################################################################################!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "i!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", (java.lang.CharSequence) "###########################################################################################################################################!hi!hi!############################################################################################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "i!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi" + "'", charSequence2, "i!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi");
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih..." + "'", str2, "...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...");
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.io.Serializable[]) strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 127, 96);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####################################################################################################" + "'", str5, "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "####################################################################################################" + "'", str7, "####################################################################################################");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaa                         HI!hi!HI!          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaa                         HI!hi!HI!          " + "'", str1, "aaaaaaaaaaaaaaaaa                         HI!hi!HI!          ");
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                 ", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ciHIcicicicicici");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  !!          HI!    !!                                    !!                                    !!                                           !!  ", " ", 14);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!!", "HI!", "!!", "!!", "!!", "!!", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 75 + "'", int6 == 75);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########");
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih       ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih       " + "'", str3, "!ih       ");
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "       HI!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (java.lang.CharSequence) "                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#hi#! #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!!#ih# #hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#", "                                HI!", 61);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 138, 75);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!h", "A444444444444444444444444444444444444444444444444444");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#hi#! #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!!#ih# #hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!h" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444..." + "'", str12, "hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...");
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444", "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!!!!!!!!!!!!!!!!!!!!!!!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####################################################################################################", '#');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("   IH    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444!IH       hi!!ih44444444444444444444444444444444hi!!ih444444", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 101 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 685 + "'", int5 == 685);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "IH" });
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("               !                ", "##########hi!HI!###################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               !                " + "'", str2, "               !                ");
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", "HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!", " !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih" + "'", str3, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih");
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hi! hi! HI!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih      ", "  HI!           hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..        ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "      !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  HI!           HI!", 23, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444  HI!           HI!" + "'", str3, "4444  HI!           HI!");
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hI!hi!hI!hi!hI!hi!hI!!!!!!!!!!!!!!!!!!!!!!!!!!hI!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI      #                           HI", (java.lang.CharSequence) "                                                !IH                                                ", 420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                             hi!                             hi! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...hi  ih...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                             hi!                             hi! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                             hi!                             hi! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "############################################################################################                                hi!                             hi!                             hi! ############################################################################################", (java.lang.CharSequence) "...H", 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI", (java.lang.CharSequence) "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ihIH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih" + "'", str1, "4444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ihIH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih");
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!!#ih# #hi#!!#ih# #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!", "!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!!#ih# #hi#!!#ih# #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!" });
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "##");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "###############################################################################!hi!hi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                    ", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ihhhhhhhhhh", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "Hi!hi!hi!hi!", "", "", "hi!", "", "", "", "hi!hi!hi!hi!!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                    " + "'", str9, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(charSequence0, (java.lang.CharSequence) "...hi!!ih...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi! hi! HI!!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "       " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHH Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "...!!!!!!!!!!!!!!!!!!!!!!!!!ahi", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...!!!!!!!!!!!!!!!!!!!!!!!!!ahi" + "'", charSequence2, "...!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  !!          HI!    !!                                    !!                                    !!                                           !!  ", (java.lang.CharSequence) "        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134 + "'", int2 == 134);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  HI!########################################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!########################################################" + "'", str2, "  HI!########################################################");
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "                                hi        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hiHI!HI!HI!", "IH", 18);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!!                                    !!                                    !!                                    !!                                           !!  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi", "!", "!", "!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("class![ljava.l!!!!!!!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class![ljava.l!!!!!!!..." + "'", str1, "class![ljava.l!!!!!!!...");
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########      " + "'", str1, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########      ");
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  ...     ", "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!hi!hi!hi!hi!hi!##################################################################################################################!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ...     " + "'", str2, "  ...     ");
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi! hi! hi! HI", strArray7, strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("!ih       HI!", strArray1, strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                             hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "####################################################################################################" + "'", str12, "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#################################################################################################### #################################################################################################### #################################################################################################### HI" + "'", str15, "#################################################################################################### #################################################################################################### #################################################################################################### HI");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!ih       HI!" + "'", str16, "!ih       HI!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "####################################################################################################" });
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih!ih                             !ih!ih!ih                             !ih!IH!ih                         4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) " HI! HI!", (java.lang.CharSequence) "   hi!           h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                      ", (java.lang.CharSequence) "I!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!                         hi!                         hi!                         hi!                                hi!", "                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                         hi!                         hi!                         hi!       " + "'", str2, "Hi!                         hi!                         hi!                         hi!       ");
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH HI!!IH hi! I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H", (java.lang.CharSequence) "IH    IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################################################################hi#", (java.lang.CharSequence) "                                                                                                                                                              ", 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("       ...", "hi!hi!hi!4hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                         HI!IH ", "                         HI!hi!HI!                             HI!HI!HI!                             HI!HI", 6);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                         HI!IH " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                         HI!IH " + "'", str5, "                         HI!IH ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!######################################################################################################################################################################", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!                                                                                                                                                                      " + "'", str3, "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!                                                                                                                                                                      ");
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!hi!                             hi!hi!hi!                             hi!hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!                             hi!                             hi!", (java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "!", "hi", "!", "                             ", "hi", "!", "hi", "!", "hi", "!", "                             ", "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 133 + "'", int1 == 133);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HHHI!!IHHI!!IHHI!!IHHI!!IHHI!!IHHHHHI!H", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HHHI!!IHHI!!IHHI!!IHHI!!IHHI!!IHHHHHI!H" });
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!ih       !ih       !ih    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                         HI!IH ", (int) (byte) 1, "####################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         HI!IH " + "'", str3, "                         HI!IH ");
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI! HI! HI! hi", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                HI!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ", "!ih                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       " + "'", str2, "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ");
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                  HI !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ";   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, ";   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi       HI!!hi!", "", 97);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                       ", (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "#");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!hi", "", "", "", "", "", "", "HI!!hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi#######HI!!hi!" + "'", str7, "hi!hi!hi!hi#######HI!!hi!");
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444hi!44444444444444444444444444444hi!44444444444444444444444444444hi!4", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hiHI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "    HI!HI!HI!HI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                  hi", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########" + "'", str2, "###########");
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih!ih", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih" });
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ang.String;class [Ljava.lang.String;", "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ang.String;class [Ljava.lang.String;" + "'", str2, "ang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("class![ljava.l!!!!!!!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!!!!!!!l.avajl[!ssalc" + "'", str1, "...!!!!!!!l.avajl[!ssalc");
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444" + "'", str1, "444");
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] {};
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!                             hi!                             hi! ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "...      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ...", (java.lang.CharSequence) "                             HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                      HI!                             HI!                             HI! ", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!", 9);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("!IH", ' ');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("!ih                             !ih                             !ih                                IH                                ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                      HI!                             HI!                             HI! " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!IH" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "!IH" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!ih                             !ih                             !ih                                IH                                " + "'", str9, "!ih                             !ih                             !ih                                IH                                ");
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hI! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HI! HI!" + "'", str1, "HI! HI! HI!");
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                      hi!", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      hi" + "'", str2, "                      hi");
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                             hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             hi!" + "'", str2, "                             hi!");
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                         HI!hi!HI!                             HI!HI!HI!                             HI!HI", (java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                      ", 836);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                                H", "         .#");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH..." + "'", str1, "...HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH...");
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "hi!");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, '#', (int) (byte) 0, (int) (byte) 1);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray19, "hi!");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray13, strArray22);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! ", (java.lang.CharSequence[]) strArray22);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!ih       !ih", (java.lang.CharSequence[]) strArray22);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "                         ", "                         ", "                         ", "                                ", "" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...       hi!!ih       hi!!ih                                       hi!!ih                       ...", "   hi!           HI", "4444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ihIH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str3, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!IH                         hi!        ", (java.lang.CharSequence) "hi!           HI###################################################...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!IH                         hi!        " + "'", charSequence2, "!IH                         hi!        ");
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###########################################################################################################################################!hi!hi!############################################################################################################################################", "    HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################################################################################################################!hi!hi!############################################################################################################################################" + "'", str2, "###########################################################################################################################################!hi!hi!############################################################################################################################################");
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI! HI! HI!", 22, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                          !!                                           !!  ", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI", "iH                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "#################################################################################################### #################################################################################################### #################################################################################################### HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" !IH                         hi!", 31, "hhhhhhhhhhhhhhhhhhhhhhhhhhhH!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !IH                         hi!" + "'", str3, " !IH                         hi!");
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         HI                                HI!                             HI!                             HI!                               ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##", " HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##" + "'", str2, "##");
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                    #################################################################                                                                                           ", "HHHHHHHHHHHHHHHHHHHHHHHHH Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################" });
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("iH             HI!HI!HI!", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    iH             HI!HI!HI!                    " + "'", str2, "                    iH             HI!HI!HI!                    ");
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi! hi! hi! HI", strArray6, strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "                                                                                                                                                                                                                                                                                                   !iHHi!                                                                                                                                                                                                                                                                                          ");
        boolean boolean17 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                                     hi!", (java.lang.CharSequence[]) strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                             hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "####################################################################################################" + "'", str11, "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#################################################################################################### #################################################################################################### #################################################################################################### HI" + "'", str14, "#################################################################################################### #################################################################################################### #################################################################################################### HI");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "####################################################################################################" + "'", str16, "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...      hi!!ih       ...", "HI!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!HI!                           HI!HI!", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 75);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h", "", "", "", "", "                           ", "", "", "", "", "", "" });
    }
}

