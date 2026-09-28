package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa !IH                         hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                         hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100, "...                                                                        !IH                         hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                      ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...                                                      ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", (java.lang.CharSequence) "i!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                    ", charSequence1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "         ", (java.lang.CharSequence) "                             HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str1, "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "hi!HI!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  !!                                    !!                                    !!                                    !!                                           !!  ", (java.lang.CharSequence) "hhhhhhhhhh                      hi!", 286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                     !ih                         HI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                     !ih                         HI!" + "'", str2, "                                                                     !ih                         HI!");
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!#######################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !                                    ", 2, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   !    !    !  " + "'", str3, "   !    !    !  ");
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!" + "'", str2, "4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...       hi!!ih       hi!!ih                                       hi!!ih                       ......       hi!!ih       hi!!ih                                       hi!!ih                       ...", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       hi!!ih       hi!!ih   " + "'", str2, "...       hi!!ih       hi!!ih   ");
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hHI! HI! HI!        #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hi", 42, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!", (java.lang.CharSequence) "             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI! HI! HI! hi", "!iHHi!                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI! HI! HI! hi" + "'", str2, "HI! HI! HI! hi");
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                      hi!", (java.lang.CharSequence) "hi!ih       !ih       !ih    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", "       HI!                            HI!           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!" + "'", str2, "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!");
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  !!                                           !!                                    !!                                    !!                                    !!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!                                           !!                                    !!                                    !!                                    !!" + "'", str1, "!!                                           !!                                    !!                                    !!                                    !!");
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", 289);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                hi                                HI!                             HI!                             HI!", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi" + "'", str2, "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi");
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!                         hi!                         hi!                         hi!                                hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!                         hi!                         hi!                         hi!                                hi!" + "'", str1, "Hi!                         hi!                         hi!                         hi!                                hi!");
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaahi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaahi!hi!hi!hi!   hi!    hi!hi!hi!hi!!" + "'", str2, "aaaaaaaaaaaaaaaaahi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ih                         HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444", "i!hi!hi!hi!hi!hi!hi!hi!h!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   hi!           H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!           h" + "'", str1, "   hi!           h");
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("A444444444444444444444444444444444444444444444444444", 22, 123);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444" + "'", str3, "444444444444444444444444444444");
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!hi!hi!hi!hi!hi!hi!hi!h!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                             hi!                                                                    ", 289);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(".                             hi!..", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".                             hi!.." + "'", str2, ".                             hi!..");
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!iHHi!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IhhI!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!IhhI!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                     4444444444444444444444444", "...   ", 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    ...   444" + "'", str3, "    ...   444");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi", "IH    IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi" + "'", str2, "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "hI! hi! hi!", (java.lang.CharSequence) "...       hi!!ih       hi!!ih   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!IH                         hi!", 117, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########");
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                  ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaa", "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", ";");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!", (java.lang.CharSequence) "IH                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!IH !IH !IH !IH !IH !IH HI!IH", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                            hi! ", "!ih       HI!                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                            hi! " });
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                    !    !    !    !    !    !    !4444444444                                    !    !    !    !    !    !    ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", 286, "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444!IH       hi!!ih44444444444444444444444444444444hi!!ih444444" + "'", str3, "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444!IH       hi!!ih44444444444444444444444444444444hi!!ih444444");
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("         ...", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         ..." + "'", str2, "         ...");
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!IH                             !IH                             !IH                                IH                             hi!!ih                                       hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                             4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444" + "'", str1, "                                             4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444");
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("  ...     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.hi!                             hi!class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.S", (java.lang.CharSequence) "HI!HI!hiHI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                    !    !    !    !    !    !    !4444444444                                    !    !    !    !    !    !    ! ", "!IH       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils1 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils2 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils3 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils4 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils5 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray6 = new org.apache.commons.lang3.StringUtils[] { stringUtils0, stringUtils1, stringUtils2, stringUtils3, stringUtils4, stringUtils5 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray6);
        org.junit.Assert.assertNotNull(stringUtilsArray6);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!                             hi!                             hi! ", "!HI!                             !                             !  HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 42, 373);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("class [ljava.l       ...", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [ljava.l       ..." + "'", str2, "class [ljava.l       ...");
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "#################################################################################################hi#", (java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", "hi!hi!hi!hi       HI!!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str2, "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                HI                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!IH                             !IH                             !IH                                IH                             hi!!ih                                       hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih", "hi                                hi!                             hi!                             hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!#######################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!######################################################################################################################################################################" + "'", str1, "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!######################################################################################################################################################################");
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "           IhHI!HI!HI!", (java.lang.CharSequence) "             ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                      hi############################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                HI                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                             HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA", (java.lang.CharSequence) "#############", 687);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!iHHi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iHHi!" + "'", str2, "!iHHi!");
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("           IhHI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IhHI!HI!HI!" + "'", str1, "IhHI!HI!HI!");
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!                             hi!                             hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                             hi!                             hi!" + "'", str1, "!                             hi!                             hi!");
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!IH !IH !IH !IH !IH !IH HI!IH", (java.lang.CharSequence) "##############################################################################################################################################################", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "IH                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(".....................................................................................................................", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("####################################################################################################", "HI!    ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "##", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                        ", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!", "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("  hi!           HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!           HI!" + "'", str1, "  hi!           HI!");
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh" + "'", str2, "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!HI!", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hIa###################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "!iHHi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "... HI!!IH HI!!IH HI!!IH ...", 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!", "                             !iHHi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!ih       !ih       !ih    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih       !ih       !ih    ..." + "'", str1, "hi!ih       !ih       !ih    ...");
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "ih            hi!HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4!ih44444444444444444444444444444!ih44444444444444444444444444444!ih44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4!ih44444444444444444444444444444!ih44444444444444444444444444444!ih44444444444444444444444444444444" + "'", str1, "4!ih44444444444444444444444444444!ih44444444444444444444444444444!ih44444444444444444444444444444444");
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!ih       HI!                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI                                HI!                             HI!                             HI!", "                                hi                                HI!                             HI!                             HI!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                       HI  ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                       ", "hhhhhhhhhh                      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       " + "'", str2, "                                       ");
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!IH                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444444hi!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444" + "'", str1, "444444444444444444444444444444");
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!ih       !ih       !ih    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih       !ih       !ih    ..." + "'", str1, "hi!ih       !ih       !ih    ...");
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                    !    !    !    !    !    !    !4444444444                                    !    !    !    !    !    !    ! ", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    !    !    !    !    !    !    !4444444444                                    !    !    !    !    !    !    ! " + "'", str2, "                                    !    !    !    !    !    !    !4444444444                                    !    !    !    !    !    !    ! ");
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 6, 286);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! " + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! ");
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                     !ih                         HI!", (java.lang.CharSequence) "   !    !    !  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                              ", "                         HI hi HI                              HI HI HI                              HI HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                              " });
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!IH       ", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 690, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH       " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!hi!hi!hi!hi!hi!hi", "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 145, 700);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!ihHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                        !iHHi! ", "  hi!           HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        java.lang.String[] strArray7 = new java.lang.String[] { "                                hi!", "                                hi!", "hi!", "       hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray16);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "hI!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                hi!", "                                hi!", "hi!", "       hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hI!hi!hI!hi!hI!hi!hI!!!!!!!!!!!!!!!!!!!!!!!!!!hI!hi!" + "'", str22, "hi!hI!hi!hI!hi!hI!hi!hI!!!!!!!!!!!!!!!!!!!!!!!!!!hI!hi!");
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                 ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         ...", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!!IH                                HI!!IH                                HI!!IH                                HI!!IH                                       HI!!IH       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ", "hi!ih       !ih       !ih    ...#...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils1 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils2 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray3 = new org.apache.commons.lang3.StringUtils[] { stringUtils0, stringUtils1, stringUtils2 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray3);
        org.junit.Assert.assertNotNull(stringUtilsArray3);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ...", charSequence1, 222);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!" + "'", str1, "4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! " + "'", str1, "!ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! ");
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!                             HI!                             HI!", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str3, "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                hi                                hi!                             hi!                             hi!", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi                                hi!                             hi!                             hi!" + "'", str2, "                                hi                                hi!                             hi!                             hi!");
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ..." + "'", str1, "...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ...");
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "                                                                                                  HI!       !IHHHHHHHHHHHHHHHHHHHHHHHHHH       !IHHI!              !IHHI!       !IHHI!                                                                                                       ", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", " hI!hI!hI!hI!hI!hI!hI!hI!hI", 39);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih       " + "'", str5, "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 296);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "##############################################################################################################################################################");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!", '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!ih       !ih       !ih    ...", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       " + "'", str6, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!!!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!ih       !ih       !ih    ..." + "'", str10, "hi!ih       !ih       !ih    ...");
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!!!!!!!!!!!!!!!!!!!!!!!                                                                                                 hi!", "!IHHIHI!!IHHI", "44444444444444444444444hi!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444                                                                                                 hi4" + "'", str3, "44444444444444444444444                                                                                                 hi4");
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!HI!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ...", "  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IhHI!HI!HI!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "IhHI!HI!HI!" });
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                              HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!                              ", "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                              HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!                              " });
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", strArray2, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "!ih       ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str9, "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!                      hi       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", "hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", "                             HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!                      hi       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str3, "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!                      hi       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                HI                             hi                             hi ", (java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116 + "'", int2 == 116);
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA", (java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih" + "'", str1, "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih");
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", (java.lang.CharSequence) "IH!!!!!!!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HI HI! HI! HI!", "       #HI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI HI! HI! HI!" + "'", str2, "HI HI! HI! HI!");
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hI!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "I", "!" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "    ...   444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", charSequence2, "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) ".                             hi!..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                          !IH                         hi!        ", (java.lang.CharSequence) " HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaahi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", "HI!HI", "   IH    IH           ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!", (int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                      HI!                             HI!                             HI! ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI!!IH                                HI!!IH                                HI!!IH                                HI!!IH                                       HI!!IH", (java.lang.CharSequence) "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 158, 145);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  " + "'", str3, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                         ci HI ci                              ci ci ci                              ci ci", 123);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 ci HI ci                              ci ci ci                              ci ci         " + "'", str2, "                                 ci HI ci                              ci ci ci                              ci ci         ");
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ihhi!ihhi!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hI!HI!H", 123, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ihhi!", 727, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "IH    IH", (java.lang.CharSequence) "HI!!IH                                HI!!IH                                HI!!IH                                HI!!IH                                       HI!!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 157 + "'", int2 == 157);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (int) (byte) 10, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!hi!                             hi!hi!hi!                             hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "   hi!    ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", (java.lang.CharSequence[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi! !IH                         hi!", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 16 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!", "hi", "!", "                             ", "hi", "!", "hi", "!", "hi", "!", "                             ", "hi", "!", "hi", "!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str8, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!IHHIHI!!IHHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IHHIHI!!IHH" + "'", str1, "!IHHIHI!!IHH");
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                               " + "'", str1, "...                               ");
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("  ", "iH                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str2, "...hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("... HI!!IH HI!!IH HI!!IH ...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... hi!!ih hi!!ih hi!!ih ...       " + "'", str1, "... hi!!ih hi!!ih hi!!ih ...       ");
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                                hi! hI!hI!hI!hI!hI!hI!hI!hI!hI", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                                hi! hI!hI!hI!hI!hI!hI!hI!hI!hI" });
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...          ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...          " + "'", str2, "...          ");
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI! hi! hi!", "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!", 9);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih                                                                                     ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI! hi! hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                             4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444", "HI!hi                                                                                                 HI!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444" + "'", str2, "4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444");
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "class [ljava.l       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126 + "'", int2 == 126);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("   IH    ", "", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   IH    " + "'", str3, "   IH    ");
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                 hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih" + "'", str1, "hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih");
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                           hi", "hi!ih       !ih       !ih    ...", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI                                HI!                             HI!                             HI!", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "aaaaaaaaaa!iHHiHI!!iHHiaaaaaaaaa");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                             hi!", strArray4, strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                           hi" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "i" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HI                                HI!                             HI!                             HI!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HI                                HI!                             HI!                             HI!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "                                HI!                             HI!                             " });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                  HI!                             HI!                             !" + "'", str14, "hi!                                  HI!                             HI!                             !");
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("       #HI#!#                                                                                          ", "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       #HI#!#                                                                                          " + "'", str4, "       #HI#!#                                                                                          ");
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI                                                      ", 52, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI                                                      " + "'", str3, "                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI                                                      ");
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!IH                                                                                     ", "hhhhhhhhhh                      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH                                                                                     " + "'", str2, "!IH                                                                                     ");
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!!!!!!!!!!!!!!!!!!!!!!!!!", (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!!!", "!ih       HI!                                       ", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!" + "'", str3, "!!!");
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!", (java.lang.CharSequence) "!IHHIHI!!IHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                             HI!                             HI!", "                                HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                         HI!IH ", "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!hi", 7, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!hi" + "'", str3, "HI!HI!HI!hi");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################" + "'", str1, "################");
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                                hi! hI!hI!hI!hI!hI!hI!hI!hI!hI", "   hi!HI!                             hi!                             hi!  HI!!ih                         HI!", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                                hi! hI!hI!hI!hI!hI!hI!hI!hI!hI" });
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!hi                                                                                                 HI!!", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!hi                                                                                                 HI!!" + "'", str3, "HI!hi                                                                                                 HI!!");
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "!hi!hi!", (java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                hi!    ", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!hI!hi!hI!hi!hI!hi!hI!!!!!!!!!!!!!!!!!!!!!!!!!!hI!hi!", (java.lang.CharSequence) "hi!HI!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", (java.lang.CharSequence) "class [ljava.l       ...", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                        !iHHi! ", "!IH  !                             !                             !IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                        !iHHi! " + "'", str2, "                                                                                                                        !iHHi! ");
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hHI! HI! HI!        #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                         hi");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi!    ", "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", (int) 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "   hi!    " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!IH" + "'", str7, "!IH");
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                         HI hi HI                              HI HI HI                              HI HI", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                         HI hi HI                              HI HI HI                              HI HI" });
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                    ", 27, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    " + "'", str3, "                                    ");
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                hi                                HI!                             HI!                             HI! ", "           HI!", "                                                !IH                                                ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "...                               ", (java.lang.CharSequence) "                                         hi!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "!!hi!!ih              hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                         hi!    ", " ...                       HI!!IH                                       HI!!IH       HI!!IH       ...", 39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi" });
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("####################################################################################################", 696);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih       HI!                                       ", "hi!hI!hi!hI!hi!hI!hi!hI!!!!!!!!!!!!!!!!!!!!!!!!!!hI!hi!", 27);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih       HI!                                       " });
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                HI!                             HI!                             HI! ", "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI!                             HI!                             HI! " + "'", str2, "                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       HI!                                                                                          ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "   hi!    ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                HI!                             HI!                             HI! ", strArray10, strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence[]) strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("                        IH    IH", strArray2, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       ", "HI", "!", "                                                                                          " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       #HI#!#                                                                                          " + "'", str4, "       #HI#!#                                                                                          ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                HI!                             HI!                             HI! " + "'", str14, "                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "hi!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       HI!       HI!       HI!       HI!       HI!       HI!IH" + "'", str1, "HI!       HI!       HI!       HI!       HI!       HI!       HI!IH");
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hiHI!HI!HI!", "4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!", "                         #################################################################", 158);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hiHI!HI!HI!" + "'", str4, "hiHI!HI!HI!");
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 24, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 158 + "'", int1 == 158);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hI!HI!H", "                                                !IH                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 285, 75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", "  !!                                           !!                                    !!                                    !!                                    !!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str2, "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) " HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                         ci HI ci                              ci ci ci                              ci ci", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                         ci HI ci                              ci ci ci                              ci ci" });
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!#######################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!#######################################################################################################################################################################" + "'", str1, "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!#######################################################################################################################################################################");
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                         HI hi HI                              HI HI HI                              HI HI", 700, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################################################################################################################################################################################################################                         HI hi HI                              HI HI HI                              HI HI#########################################################################################################################################################################################################################################################################################################" + "'", str3, "#########################################################################################################################################################################################################################################################################################################                         HI hi HI                              HI HI HI                              HI HI#########################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH", 206, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                         HI!hi!HI!                             HI!HI!HI!                             HI!HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " !IH                           !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       HI!  ", "                                HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       HI!  " });
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Aaaaaaaaaaaaaaaa", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaa     " + "'", str2, "Aaaaaaaaaaaaaaaa     ");
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#########################################################################################################################################################################################################################################################################################################                         HI hi HI                              HI HI HI                              HI HI#########################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str2, "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...  " + "'", str1, "...  ");
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("444", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", (java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!!          HI!    !!                                    !!                                    !!                                           !!", (java.lang.CharSequence) "...4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                                                                          hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih       HI!                                      ", (int) (byte) 10, " HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih       HI!                                      " + "'", str3, "!ih       HI!                                      ");
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", (java.lang.CharSequence) "      #", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!HI!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "hi!");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "                             hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("  !!          HI!    !!                                    !!                                    !!                                           !!  ", strArray5, strArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!", (java.lang.CharSequence[]) strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "####################################################################################################" + "'", str6, "####################################################################################################");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "####################################################################################################" + "'", str8, "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "  !!          HI!    !!                                    !!                                    !!                                           !!  " + "'", str15, "  !!          HI!    !!                                    !!                                    !!                                           !!  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH" + "'", str1, "   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", 36, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH" + "'", str3, "   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ", (java.lang.CharSequence) "                                                                          !!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "       hi!", (java.lang.CharSequence) "hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!                                                      ", (java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!HI       HI!!HI!", "    hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI       HI!!HI!" });
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...                               ", "                             HI!HHHI!!IHHI!!IHHI!!IHHI!!IHHI!!IHHHH", "                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi", 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                               " + "'", str4, "...                               ");
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih            hi!HI!hi!                             hi!hi!hi!                             hi!hi", (java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!                           HI!HI!", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, " ...                       HI!!IH                                       HI!!IH       HI!!IH       ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        java.lang.String[] strArray9 = new java.lang.String[] { "                                hi!", "                                hi!", "hi!", "       hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray9, strArray18);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(strArray20);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "hi!");
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaa!ih       ", (java.lang.CharSequence[]) strArray20);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hhhhhhhhhh                      hi!                                                                                                                                                                                                                                                                 ", (java.lang.CharSequence[]) strArray20);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                hi!", "                                hi!", "hi!", "       hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str21, "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!!!", 71, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "!ihHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!!ih                         HI!", (java.lang.CharSequence) "ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!a", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", "############################################################################################                                hi!                             hi!                             hi! ############################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str2, "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("          ", "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######", 286, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######" + "'", str3, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######");
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", (int) (short) -1, 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...hi!!ih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hi!!ih..." + "'", str1, "...hi!!ih...");
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!IH                         hi!", (java.lang.CharSequence) "...   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!a" + "'", str1, "ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!a");
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!IH !IH !IH !IH !IH !IH HI!IH", (java.lang.CharSequence) "                                             4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   HI ", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !", (java.lang.CharSequence) "              hi!        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   IH    IH           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   ih    ih           " + "'", str1, "   ih    ih           ");
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "      !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", "       #HI#!#                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!ih       HI!                                       ", "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!hi!hi!", 86, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################################################!hi!hi!" + "'", str3, "###############################################################################!hi!hi!");
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444                                                                                                 hi4", (java.lang.CharSequence) "                               ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ...", (java.lang.CharSequence) "!IH  !                             !                             !IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                          !!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "hi!HI!                             hi!                             hi!  HI!", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "", "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       " + "'", str3, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                  hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  hi" + "'", str1, "                                  hi");
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                      hi!", (java.lang.CharSequence) "Aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" ", "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", 296);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!hi!hi!!hi!!ih", "!!hi!!ih              hi!h", (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!hi!hi!!hi!!hi!!ih              hi!h" + "'", str4, "!hi!hi!!hi!!hi!!ih              hi!h");
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!HI", "hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI" + "'", str2, "HI!HI");
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "         ...", 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!IH                             !IH                             !IH                                IH                             hi!!ih                                       hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...!!!!!!!!!!!!!!!!!!!!!!!!!ahi", "                             hi!                             hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...!!!!!!!!!!!!!!!!!!!!!!!!!ahi" });
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                  HI                              HI                              HI  ", "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  HI                              HI                              HI  " + "'", str2, "                                                                  HI                              HI                              HI  ");
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!" + "'", str1, "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "...4444444444444444444444...44444444444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!iHHi!!!!!!!!!!!!!!!!!!!!", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!", "                                HI        ", 0, 157);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                HI        " + "'", str4, "                                HI        ");
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "################", (java.lang.CharSequence) "!!hi!!ih              hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                             ...", "hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "..." });
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                             !iHHi!", "hI!hI!hI!hI!hI!hhI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             !iHHi!" + "'", str2, "                             !iHHi!");
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) " HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################" + "'", str2, "####################################################");
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...   ", "                             hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "HI!hiHI", (java.lang.CharSequence) "                         hi HI hi                              hi hi hi                              hi hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                         hi HI hi                              hi hi hi                              hi hi", "HI!HI!HI!", "hi! hi! hi! HI", 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                         hi HI hi                              hi hi hi                              hi hi" + "'", str4, "                         hi HI hi                              hi hi hi                              hi hi");
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ihhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihhhhhhhhhh" + "'", str1, "!ihhhhhhhhhh");
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!hiHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hiHI" + "'", str1, "HI!hiHI");
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("... HI!!IH HI!!IH HI!!IH ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HI!!IHHI!!IHHI!!IH..." + "'", str2, "...HI!!IHHI!!IHHI!!IH...");
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   HI!", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    HI!  " + "'", str2, "    HI!  ");
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! " + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! ");
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "##########hi!HI!###################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                      HI!                             HI!                           ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HI! ..." + "'", str1, "HI! HI! ...");
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ", (int) (byte) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "...                             ...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str5, "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str8, "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  ;   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ";" + "'", str1, ";");
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!a", ".                             hi!..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!a" });
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                         hi!", (java.lang.CharSequence) "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                         hi HI hi                              hi hi hi                              hi hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hHI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!HI!HI!HI!HI                              ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                  HI                              HI                              HI  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                  HI                              HI                              HI  " + "'", str1, "                                                                  HI                              HI                              HI  ");
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                     !IH                         hi!", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ..." + "'", str2, "           ...");
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "                        IH    IH", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                               ...", "   hi!    ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("!IH                         hi!        ", "!!!!!!!!!!!!!!!!!!!!!!!!", 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                hi!                             hi!                             hi! ", strArray5, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", strArray1, strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                               ..." });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "IH                         hi!        " });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                hi!                             hi!                             hi! " + "'", str10, "                                hi!                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih" + "'", str11, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                               ..." + "'", str12, "                               ...");
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("  hi!           HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! HI!" + "'", str1, "hi! HI!");
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", "   hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str2, "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI! hi! hi!", (java.lang.CharSequence) "hi!                             hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I!hI!hI!hI!hI!hI!hI!hI!hI", 71, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!hI!hI!hI!hI!hI!hI!hI!hIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "I!hI!hI!hI!hI!hI!hI!hI!hIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...", "                           hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!", (java.lang.CharSequence) "HI!HI!", 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                HI!                             HI!                             HI! ", "hI!hI!hI!hI!hI!hI!hI!hI!hIa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...", 123);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih..." + "'", str2, "...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...");
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hhhhhhh#hi#h#hi#h#hi#h#hi#hhhhhhhhhhhhhhhhhhhhhhhhhh#hi#hh#ih#hi!hh#hi#hh#ih#hhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh#ih#hhhhhhh#hi#h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                HI                                hi!                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !ih                             !ih                             !ih                                IH                                " + "'", str1, " !ih                             !ih                             !ih                                IH                                ");
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                hi                                HI!                            ", "HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi                                HI!                            " + "'", str2, "                                hi                                HI!                            ");
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!hi!hi!444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                     hiHI!HI!HI!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                     hiHI!HI!HI!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str3, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                     hiHI!HI!HI!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!  ", (java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!!                                           !!                                    !!                                    !!                                    !!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI                                HI!                             HI!                             HI!" + "'", str1, "HI                                HI!                             HI!                             HI!");
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih hi!!ih ...", "   IH    IH           ", 65);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "..        ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih hi!!ih ..." });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                         hi!", "                                    !    !    !    !    !    !    !4444444444                                    !    !    !    !    !    !    ! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!" + "'", str2, "                         hi!");
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("################", "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################" + "'", str2, "################");
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "  !!                                    !!                                    !!                                    !!                                           !!  ", (java.lang.CharSequence) "                                                                                                 hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#################################################################", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################" + "'", str2, "################");
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!", "   !    !    !  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!" + "'", str2, "                                4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaa!iHHiHI!!iHHiaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa!iHHiHI!!iHHiaaaaaaaaa" + "'", str1, "aaaaaaaaaa!iHHiHI!!iHHiaaaaaaaaa");
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                     !IH                         hi!", "44444444444", "HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                     !IH                         hi!" + "'", str3, "                                                                     !IH                         hi!");
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hI! hi! hi!", "HI!hi!                             hi!hi!hi!                             hi!hi", "######ih                         HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI! hi! hi!" + "'", str3, "hI! hi! hi!");
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI", "################################################################################################!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#########################################################################################...", 126);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 18, 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!" });
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  !    ", "HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  !    " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  !    ");
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!", 286, 157);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         HI                                HI!                             HI!                             HI!                               " + "'", str3, "                         HI                                HI!                             HI!                             HI!                               ");
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) ".", (java.lang.CharSequence) "!                             hi!                             hi!", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...                       hi!!ih                                       hi!!ih       hi!!ih       ...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 34);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                             hi!                                                                    ", 7, 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...                       hi", "ih                                       hi", "ih       hi", "ih       ..." });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "...", "", "", "..." });
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!!ih                         HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih..." + "'", str2, "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih...");
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!", "hi!hi!hi!hi!!!!!!!!!!!!!!!                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!");
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHH Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHH Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "  !!          HI!    !!                                    !!                                    !!                                           !!  ", (java.lang.CharSequence) "############################################################################################                                hi!                             hi!                             hi! ############################################################################################", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444" + "'", str2, "444");
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                hi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi!" + "'", str2, "                                hi!");
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH HI!!IH hi! I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H", "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!hiHI", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hiHI" + "'", str2, "HI!hiHI");
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", 875, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!" + "'", str3, "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                            HI                                                                            ", 579);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(". hi!..", "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ". hi!.." + "'", str2, ". hi!..");
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h", "                                                                          !!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h" + "'", str2, "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h");
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("       #HI#!#                                                                                          ", "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", "hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "           hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                      HI!                             HI!                           ...", "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH HI!!IH hi! I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      HI!                             HI!                           ..." + "'", str2, "                      HI!                             HI!                           ...");
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hi                                HI!                             HI!                             HI!", (java.lang.CharSequence) "...HI!!IHHI!!IHHI!!IH...", 286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                             hi!", "!ih       ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                             hi!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", "!ih hi!!ih ...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih            hi!HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                             HI!                             HI!" + "'", str1, "HI!                             HI!                             HI!");
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", (java.lang.CharSequence) ". hi!..");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", charSequence2, "444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                hi!    ", "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "   !    !    !  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                hi!    " + "'", str3, "                                hi!    ");
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                      HI!                             HI!                             HI! ", (java.lang.CharSequence) "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                 HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########", "!IH       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   #########");
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                            HI                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!4444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) " !ih                             !ih                             !ih                                IH                                ", 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          !iHHi! ", "       HI!  ", 158);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "i", "", "i", "", "" });
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!aaaaaaaaaaaaaaaaa", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaaaaaaaaaaaaa" + "'", str3, "hi!aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih...", (java.lang.CharSequence) "...hi!!ih...                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih       HI!", "                                                !IH                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih       HI!" + "'", str2, "!ih       HI!");
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", (java.lang.CharSequence) "HI! HI! HI! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!    ", 86, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444!    44444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444!    44444444444444444444444444444444444444444");
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!HI!HI!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!!#ih# #hi#!!#ih# #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!" + "'", str1, "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!!#ih# #hi#!!#ih# #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!");
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (java.lang.CharSequence) "                            hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!                         hi!                         hi!                         hi!                                hi!", "       HI!                                                                                          ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("!!!!!!!!!!!!!!!!!!!!!!!!!", 'a');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "HI! HI! HI! ", (java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                HI                             hi                             hi ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 113 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 21, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!", (int) (short) 100, "hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!hi!##############################################################################################" + "'", str3, "hI!hi!##############################################################################################");
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", 145);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", "hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h" + "'", str2, "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h");
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...", 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi! hhhhhhhhhh", (java.lang.CharSequence) "HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi! hhhhhhhhhh" + "'", charSequence2, "hi! hhhhhhhhhh");
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!!IH                                HI!!IH                                HI!!IH                                HI!!IH                                       HI!!IH", "!!!!!!!!!!!!!!!!!!!!!!!                                                                                                 hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "IH", "HI", "IH", "HI", "IH", "HI", "IH", "HI", "IH" });
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!", 24, " !IH                           !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !IH                   !" + "'", str3, " !IH                   !");
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("       #HI#!#                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       #HI#!#                                                                                          " + "'", str1, "       #HI#!#                                                                                          ");
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                     4444444444444444444444444", "                                                                                                  HI!       !IHHHHHHHHHHHHHHHHHHHHHHHHHH       !IHHI!              !IHHI!       !IHHI!                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     4444444444444444444444444" + "'", str2, "                     4444444444444444444444444");
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "IH                         ", (java.lang.CharSequence) "   HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH                         ", (java.lang.CharSequence) "       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!" + "'", str1, "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!");
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI", "#", 61, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         .#" + "'", str4, "         .#");
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "       hi!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!", (java.lang.CharSequence) "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaa", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaa", "hi! hi! hi! HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI!hI!hI!hI!hI!hI!hI!hI!hIa###################################################################################################################################################################################################", "  !!          HI!    !!                                    !!                                    !!                                           !!  ", 14, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  !!          HI!    !!                                    !!                                    !!                                           !!  !hI!hI!hI!hIa###################################################################################################################################################################################################" + "'", str4, "  !!          HI!    !!                                    !!                                    !!                                           !!  !hI!hI!hI!hIa###################################################################################################################################################################################################");
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("          !iHHi! ", 579);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                   !iHHi!                                                                                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                                                                                                   !iHHi!                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "#############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str2, "444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                hi!                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !ih                             !ih                             !ih                                " + "'", str1, " !ih                             !ih                             !ih                                ");
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!   HI!    HI!HI!HI!HI!!", (java.lang.CharSequence) "hi! hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!!IH                                HI!!IH                                HI!!IH                                HI!!IH                                       HI!!IH       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!!IH                                HI!!IH                                HI!!IH                                HI!!IH                                       HI!!IH       " + "'", str1, "HI!!IH                                HI!!IH                                HI!!IH                                HI!!IH                                       HI!!IH       ");
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...", "hi                                HI!                             HI!                             HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..." });
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!IH                         hi!        ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH                         hi!        " + "'", str3, "!IH                         hi!        ");
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!" + "'", str1, "HI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!");
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "hi! hhhhhhhhhh", "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhhhhhhH!!", "  ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhH!!" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhH!!");
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                           HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", "                                    !    !    !    !    !    !    !4444444444                                    !    !    !    !    !    !    ! ", 145);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str3, "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!", "   hi!HI!                             hi!                             hi!  HI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!" + "'", str3, "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!" + "'", str4, "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                          !!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "   IH    IH           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444444444!iHHiHI!!iHHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444!iHHiHI!!iHHi" + "'", str1, "4444444444444444444444444444444444444444444444444444!iHHiHI!!iHHi");
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################ih############", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################ih############" });
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                           ", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           " + "'", str2, "                           ");
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI! HI! HI! hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!", "HI!", "HI!", "hi" });
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "HI", (java.lang.CharSequence) "                                                                                     hiHI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("   hi!HI!                             hi!                             hi!  HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!HI!                             hi!                             hi!  HI!" + "'", str1, "   hi!HI!                             hi!                             hi!  HI!");
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH !IH !IH !IH !IH !IH HI!IH", "aaaaaaaaaaaaaaaaa", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IH !IH !IH !IH !IH !IH HI!IH" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IH !IH !IH !IH !IH !IH HI!IH" + "'", str5, "!IH !IH !IH !IH !IH !IH HI!IH");
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "           HI!", (java.lang.CharSequence) "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "i!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi", 92, 579);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", strArray2, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str9, "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IHHIHI!!IHH", "                             hi!                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IHHIHI!!IHH" + "'", str2, "!IHHIHI!!IHH");
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "           hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI!", (java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                     hiHI!HI!HI!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  !!                                    !!                                    !!                                    !!                                           !!  ", "...4444444444444444444444...44444444444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444..", 286);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "  !!                                    !!                                    !!                                    !!                                           !!  " });
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI!!IH                                HI!!IH                                HI!!IH                                HI!!IH                                       HI!!IH", (java.lang.CharSequence) "             ", 696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 146 + "'", int3 == 146);
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444...!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence5, charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                            hi!hi!hi!                             hi!hi", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "       HI!                                                                                          ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HI!HI!HI       HI!!HI!", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH", "... hi!!ih hi!!ih hi!!ih ...                                    HI!... hi!!ih hi!!ih hi!!ih ...     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI       HI!!HI!" + "'", str3, "HI!HI!HI!HI       HI!!HI!");
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                         #################################################################", "HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         #################################################################" + "'", str2, "                         #################################################################");
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                    ", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!!IHHI!!IHHI!!IHHI!!IHHI!!IH   " + "'", str1, "  HI!!IHHI!!IHHI!!IHHI!!IHHI!!IH   ");
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!HI!   HI!    HI!HI!HI!HI!!", "...hi!!ih...", "hI! hi! hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str2, "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                         hi!HI!hi!                             hi!hi!hi!                             hi!hi", "   IH    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi" + "'", str2, "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi");
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "       hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!ihhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "##########hi!HI!#################################################################################!!!!!####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                         hi!    ", "hi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!    " + "'", str2, "                         hi!    ");
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("################################################################################################", "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################" + "'", str2, "################################################################################################");
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hHI! HI! HI!        #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hHI! HI! HI!        #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hi" + "'", str1, "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hHI! HI! HI!        #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hi");
    }
}

