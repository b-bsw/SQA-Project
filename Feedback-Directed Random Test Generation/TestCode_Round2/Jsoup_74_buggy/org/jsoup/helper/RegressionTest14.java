package org.jsoup.helper;

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
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        java.lang.String[] strArray16 = new java.lang.String[] { " ", "", " ", "", "                                                                                                                                                                                                                  ", "                                                                                                 " };
        boolean boolean17 = org.jsoup.helper.StringUtil.in("", strArray16);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", strArray16);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray16);
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray16, " ");
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray16);
        boolean boolean23 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! ", strArray16);
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", strArray16);
        boolean boolean25 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray16);
        boolean boolean26 = org.jsoup.helper.StringUtil.inSorted(" hi! hi!  hi! hi!                                                                                                                                                                                                                   hi!                                                                                                  ", strArray16);
        boolean boolean27 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray16);
        boolean boolean28 = org.jsoup.helper.StringUtil.in("  hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!                                                                                                                                                                                                                    hi! hi! hi! hi! hi!                                                                                                  ", strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { " ", "", " ", "", "                                                                                                                                                                                                                  ", "                                                                                                 " });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                                                                                                                                                                                                                                          " + "'", str21, "                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray7);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray7, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, " hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ");
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted(" hi! hi!  hi! hi!                                                                                                                                                                                                                   hi!                                                                                                  ", strArray7);
        boolean boolean20 = org.jsoup.helper.StringUtil.in(" hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", strArray7);
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                     ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                       ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi!hi! hi! ");
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                   ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray5);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray5, "                                                    ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                ", strArray5);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray5, "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("  hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!                                                                                                                                                                                                                    hi! hi! hi! hi! hi!                                                                                                  ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                  ", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!  ");
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                     ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", true);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                     ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                  ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi!hi! hi!   hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! ");
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        java.lang.String[] strArray13 = new java.lang.String[] {};
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray13);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray13, "");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray13);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted(" ", strArray13);
        boolean boolean19 = org.jsoup.helper.StringUtil.in("          ", strArray13);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray13);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("", strArray13);
        java.lang.String str23 = org.jsoup.helper.StringUtil.join(strArray13, "                                                                                                 ");
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray13);
        boolean boolean25 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", strArray13);
        boolean boolean26 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray13);
        boolean boolean27 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", strArray13);
        java.lang.String str29 = org.jsoup.helper.StringUtil.join(strArray13, "                                                                                                                                                                                                                                      ");
        boolean boolean30 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray13);
        boolean boolean31 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray13);
        boolean boolean32 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        java.lang.String[] strArray11 = new java.lang.String[] { " ", "", " ", "", "                                                                                                                                                                                                                  ", "                                                                                                 " };
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", strArray11);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray11);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray11, " ");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray11);
        boolean boolean18 = org.jsoup.helper.StringUtil.in(" hi!hi! hi!hi! hi!   hi!hi! hi!hi! hi!    hi!hi! hi!hi! hi!     hi!hi! hi!hi! hi!      hi!hi! hi!hi! hi!       hi!hi! hi!hi! hi!        hi!hi! hi!hi! hi!         hi!hi! hi!hi! hi!          hi!hi! hi!hi! hi!           hi!hi! hi!hi! hi!            hi!hi! hi!hi! hi!             hi!hi! hi!hi! hi!              hi!hi! hi!hi! hi!               hi!hi! hi!hi! hi!                hi!hi! hi!hi! hi!                 hi!hi! hi!hi! hi!                  hi!hi! hi!hi! hi!                   hi!hi! hi!hi! hi!                    hi!hi! hi!hi! hi!                     hi!hi! hi!hi! hi!                     ", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { " ", "", " ", "", "                                                                                                                                                                                                                  ", "                                                                                                 " });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                                          " + "'", str16, "                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                    hi! hi! hi! hi! hi!                                                                                                                                                                                                                   ", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  ", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "  hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!                                                                                                                                                                                                                    hi! hi! hi! hi! hi!                                                                                                  ");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray5);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                  ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                          ", strArray5);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", strArray5);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                     ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                  " + "'", str7, "                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi!   hi!hi! hi!hi! hi!    hi!hi! hi!hi! hi!     hi!hi! hi!hi! hi!      hi!hi! hi!hi! hi!       hi!hi! hi!hi! hi!        hi!hi! hi!hi! hi!         hi!hi! hi!hi! hi!          hi!hi! hi!hi! hi!           hi!hi! hi!hi! hi!            hi!hi! hi!hi! hi!             hi!hi! hi!hi! hi!              hi!hi! hi!hi! hi!               hi!hi! hi!hi! hi!                hi!hi! hi!hi! hi!                 hi!hi! hi!hi! hi!                  hi!hi! hi!hi! hi!                   hi!hi! hi!hi! hi!                    hi!hi! hi!hi! hi!                     hi!hi! hi!hi! hi!                     ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!   hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi! ");
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                     ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                          ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi!  ");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        java.lang.String[] strArray12 = new java.lang.String[] {};
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray12);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray12, "");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray12);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" ", strArray12);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("          ", strArray12);
        boolean boolean19 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray12);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("", strArray12);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", strArray12);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi! ", strArray12);
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", strArray12);
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", strArray12);
        java.lang.String str26 = org.jsoup.helper.StringUtil.join(strArray12, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        boolean boolean27 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray12);
        boolean boolean28 = org.jsoup.helper.StringUtil.inSorted("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi! ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        java.lang.String[] strArray9 = new java.lang.String[] {};
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray9, "");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("          ", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray9);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("", strArray9);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray9, "                                                                                                 ");
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray9, "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray9);
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  ", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  ", strArray3);
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        java.lang.String[] strArray10 = org.jsoup.helper.StringUtil.padding;
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray10, "");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray10);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray10, "          ");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", strArray10);
        boolean boolean19 = org.jsoup.helper.StringUtil.in(" hi! hi!  hi! hi!                                                                                                                                                                                                                   hi!                                                                                                  ", strArray10);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", strArray10);
        boolean boolean21 = org.jsoup.helper.StringUtil.in(" hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", strArray10);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray10);
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray10);
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! ", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                                                                                  " + "'", str12, "                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str16, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("          ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray7);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, " hi! hi!  hi! hi!                                                                                                                                                                                                                   hi!                                                                                                  ");
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     ", strArray7);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi! hi! ", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                          ", strArray6);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray6, " hi! hi! hi! hi! hi! ");
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                  " + "'", str9, "                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi!    hi! hi! hi! hi! hi!     hi! hi! hi! hi! hi!      hi! hi! hi! hi! hi!       hi! hi! hi! hi! hi!        hi! hi! hi! hi! hi!         hi! hi! hi! hi! hi!          hi! hi! hi! hi! hi!           hi! hi! hi! hi! hi!            hi! hi! hi! hi! hi!             hi! hi! hi! hi! hi!              hi! hi! hi! hi! hi!               hi! hi! hi! hi! hi!                hi! hi! hi! hi! hi!                 hi! hi! hi! hi! hi!                  hi! hi! hi! hi! hi!                   hi! hi! hi! hi! hi!                    hi! hi! hi! hi! hi!                     hi! hi! hi! hi! hi!                     " + "'", str16, " hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi!    hi! hi! hi! hi! hi!     hi! hi! hi! hi! hi!      hi! hi! hi! hi! hi!       hi! hi! hi! hi! hi!        hi! hi! hi! hi! hi!         hi! hi! hi! hi! hi!          hi! hi! hi! hi! hi!           hi! hi! hi! hi! hi!            hi! hi! hi! hi! hi!             hi! hi! hi! hi! hi!              hi! hi! hi! hi! hi!               hi! hi! hi! hi! hi!                hi! hi! hi! hi! hi!                 hi! hi! hi! hi! hi!                  hi! hi! hi! hi! hi!                   hi! hi! hi! hi! hi!                    hi! hi! hi! hi! hi!                     hi! hi! hi! hi! hi!                     ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray6);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray6, "          ");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi!                                                                                                                                                                                                                  hi!                                                                                                 ", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                     ", strArray6);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                    hi! hi! hi! hi! hi!                                                                                                                                                                                                                   ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                  " + "'", str8, "                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str12, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray10, "");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("          ", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("", strArray10);
        boolean boolean19 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray10);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", strArray10);
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray10, "                                                                                                 ");
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("  hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi!                                                                                                                                                                                                                    hi! hi! hi! hi! hi!                                                                                                  ", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray4);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray4, "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi!   ");
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                   hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                  ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! ", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi!hi! hi!hi! hi! hi! hi! hi! hi! hi! ");
    }
}

